package ir.sematec.sematecandroidbasicaban98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView txtName = findViewById(R.id.txtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        Button btnSave = findViewById(R.id.btnSave);

        final Intent intent = getIntent();
        String name = intent.getStringExtra("personName");
        txtName.setText(name);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String family = edtFamily.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("personFamily",family);
                setResult(Activity.RESULT_OK,intent1);
                finish();
            }
        });
    }
}
