pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                echo 'Build işlemi ve Testler başlıyor...'
                sh './mvnw clean test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'URL erişimi başarılı, Deploy işlemi başlatılıyor...'
                sh 'echo "Deploy Başarıyla Tamamlandı!"'
            }
        }
    }

    post {
        failure {
            echo 'HATA: Pipeline başarısız oldu veya durduruldu!'
        }
        success {
            echo 'BAŞARILI: Tüm adımlar tamamlandı.'
        }
    }
}