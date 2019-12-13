package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    private static final String TAG = "TestThreadActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);

        //MainThread || UiThread
        String threadName = Thread.currentThread().getName();
        Log.d(TAG, threadName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                Log.d(TAG, threadName);
            }
        }).start();
    }
}
