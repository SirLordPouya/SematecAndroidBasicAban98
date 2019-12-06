package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class TestSharedPrefrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_prefrences);

        TextView txtName = findViewById(R.id.txtName);
        Button btnSave = findViewById(R.id.btnSave);
        final EditText edtName = findViewById(R.id.edtName);

        String name = PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this).getString("personName", "Unknown Name!");

        txtName.setText(name);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this).edit().putString("personName", name).apply();
            }
        });

    }

}
