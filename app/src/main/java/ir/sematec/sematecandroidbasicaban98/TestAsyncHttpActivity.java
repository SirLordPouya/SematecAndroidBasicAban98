package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import ir.sematec.sematecandroidbasicaban98.pray.PrayTimesClass;

public class TestAsyncHttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_htp);

        AsyncHttpClient client = new AsyncHttpClient();

        String address = "https://api.aladhan.com/v1/timingsByCity?city=Dubai&country=Iran&method=8";


        client.get(address, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                PrayTimesClass pray = gson.fromJson(response.toString(), PrayTimesClass.class);

                String isha = pray.getData().getTimings().getIsha();
                System.out.println(isha);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }

        });
    }
}
