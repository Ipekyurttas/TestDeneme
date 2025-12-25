package org.example.deneme;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DenemeTest {
    @Test
    public void testExampleComErisimi() {
        String hedefUrl = "https://example.com";

        try {
            URL url = new URL(hedefUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); // 5 saniye zaman aşımı
            connection.setReadTimeout(5000);

            int responseCode = connection.getResponseCode();

            System.out.println("URL: " + hedefUrl + " - Response Code: " + responseCode);

            assertEquals(200, responseCode, "URL erişilebilir değil! Beklenen kod: 200, Gelen: " + responseCode);

        } catch (IOException e) {
            fail("URL'e erişim sırasında hata oluştu: " + e.getMessage());
        }
    }
}
