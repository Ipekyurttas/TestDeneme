pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                echo 'Build işlemi ve Testler başlıyor...'
                // Maven ile testleri çalıştır.
                // Eğer test (UrlErisimTesti) başarısız olursa pipeline burada DURUR ve KIRMIZI yanar.
                sh './mvnw clean test'
            }
        }

        stage('Deploy') {
            // Bu adım SADECE yukarıdaki 'Test' adımı başarılı olursa çalışır.
            steps {
                echo 'URL erişimi başarılı, Deploy işlemi başlatılıyor...'
                // Buraya gerçek deploy komutların gelecek (örn: docker build, scp vb.)
                sh 'echo "Deploy Başarıyla Tamamlandı!"'
            }
        }
    }

    post {
        failure {
            echo 'HATA: URL erişimi sağlanamadığı için pipeline durduruldu!'
        }
        success {
            echo 'BAŞARILI: Tüm adımlar tamamlandı.'
        }
    }
}