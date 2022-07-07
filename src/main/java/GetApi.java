
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class GetApi {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("https://google-translate1.p.rapidapi.com/language/translate/v2/languages")
            .get()
            .addHeader("Accept-Encoding", "application/gzip")
            .addHeader("X-RapidAPI-Key", "a7353536b3msh9f8550a3da9663dp127b7bjsn7daab52eb9ce")
            .addHeader("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
            .build();

    Response response;

    {
        try {
            response = client.newCall(request).execute();
            System.out.println("oke");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
