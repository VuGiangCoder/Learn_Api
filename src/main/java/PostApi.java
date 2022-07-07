
import okhttp3.*;


import java.io.IOException;

public class PostApi {

    OkHttpClient client = new OkHttpClient();

    RequestBody body = new FormBody.Builder().add("q", "English is hard, but detectably so").build();

    Request request = new Request.Builder()
            .url("https://google-translate1.p.rapidapi.com/language/translate/v2/detect")
            .post(body)
            .addHeader("content-type", "application/x-www-form-urlencoded")
            .addHeader("Accept-Encoding", "application/gzip")
            .addHeader("X-RapidAPI-Key", "a7353536b3msh9f8550a3da9663dp127b7bjsn7daab52eb9ce")
            .addHeader("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
            .build();

    Response response;

    {
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
