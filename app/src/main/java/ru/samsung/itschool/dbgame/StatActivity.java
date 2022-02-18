package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class StatActivity extends Activity {

    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        dbManager = DBManager.getInstance(this);
        TextView stat = findViewById(R.id.sum);
        ArrayList<Result> results = dbManager.getAllResults();
        stat.setText(results.toString());
    }
}
