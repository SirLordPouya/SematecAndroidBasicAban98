package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_db);


        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        final EditText edtGrade = findViewById(R.id.edtGrade);
        Button btnShow = findViewById(R.id.btnShow);
        Button btnSave = findViewById(R.id.btnSave);


        final SqliteDbHelper helper = new SqliteDbHelper(TestDBActivity.this, "sematec", null, 1);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = helper.getStNames();
                Toast.makeText(TestDBActivity.this, names, Toast.LENGTH_LONG).show();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString();
                String family = edtFamily.getText().toString();
                int grade = Integer.parseInt(edtGrade.getText().toString());

                helper.insertStIntoDB(name, family, grade);
            }
        });


    }
}
