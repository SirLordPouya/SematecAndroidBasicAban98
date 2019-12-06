package ir.sematec.sematecandroidbasicaban98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnNewPage = findViewById(R.id.btnNewPage);
        final EditText edtName = findViewById(R.id.edtName);
        txtFamily = findViewById(R.id.txtFamily);

        btnNewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString();

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("personName", name);
                startActivityForResult(intent, 123);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 123) {
            if (resultCode == Activity.RESULT_OK) {
                String family = data.getStringExtra("personFamily");
                txtFamily.setText(family);
            }
        }
    }
}
