package ir.sematec.sematecandroidbasicaban98;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);

        Button btnDialog = findViewById(R.id.btnDialog);
        Button btnDialogActivity = findViewById(R.id.btnDialogActivity);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this)
                        .setTitle("Attention!")
                        .setMessage("Are you sure?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "Yes Clicked!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "No Clicked!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("Remind me", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "Remind me clicked!", Toast.LENGTH_SHORT).show();
                            }
                        }).create();

                dialog.show();

            }
        });

        btnDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestAlertDialogActivity.this, TestDialogActivity.class);
                startActivity(intent);
            }
        });
    }
}
