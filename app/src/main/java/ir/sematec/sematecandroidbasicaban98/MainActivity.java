package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitle = findViewById(R.id.txtTitle);
        txtTitle.setText("Hi");
        EditText edtPhone = findViewById(R.id.edtPhone);
        ImageView imgProfile = findViewById(R.id.imgProfile);
        Button btnSave = findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Something!", Toast.LENGTH_LONG).show();
            }
        });

    }

}
