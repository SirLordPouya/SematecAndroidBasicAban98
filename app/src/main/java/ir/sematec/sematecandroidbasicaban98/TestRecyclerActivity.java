package ir.sematec.sematecandroidbasicaban98;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);

        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Tahereh Elyasian");
        list.add("Davood Jalali");
        list.add("Behnam Jamshidi");
        list.add("Reza Rabie");
        list.add("Aida Mohseni");
        list.add("Farbod Mamdouhi");
        list.add("Ali Mahdizade");
        list.add("Fariborz Vermue");
        list.add("Shokufe Yousefi");


        RecyclerView recycler = findViewById(R.id.recycler);
        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));

    }
}
