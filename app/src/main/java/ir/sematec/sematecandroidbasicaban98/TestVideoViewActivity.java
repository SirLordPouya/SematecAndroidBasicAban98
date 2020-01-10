package ir.sematec.sematecandroidbasicaban98;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TestVideoViewActivity extends AppCompatActivity {

    String url = "https://video-8.dalfak.com/30/30359-65123909209_360.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);

        final VideoView vv = findViewById(R.id.vv);
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(Uri.parse(url));
        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        vv.start();
//        vv.setZOrderOnTop(true);
        vv.requestFocus();
    }
}
