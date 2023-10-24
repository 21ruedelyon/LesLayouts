package com.example.leslayouts.a03list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leslayouts.R;

public class ActivityListView extends AppCompatActivity {

    private ListView lv;
    private String[] stagiaires = new String[] {
            "David 1", "Naoufel", "Naziha", "Ali", "Jérôme", "David 2", "Loreline", "Stalens", "Khadim",
            "Rima", "Nadia", "Simon", "Didier", "David 1", "Naoufel", "Naziha", "Ali", "Jérôme", "David 2", "Loreline", "Stalens", "Khadim",
            "Rima", "Nadia", "Simon", "Didier"
    };

    private void fillListView() {
        final ArrayAdapter<String> adapter = new ArrayAdapter<String> (
                this, android.R.layout.simple_list_item_1, stagiaires
        );
        lv.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv = findViewById(R.id.list_view);
        fillListView();

    }
}