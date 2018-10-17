package com.example.yam.menucolor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;

public class Main2Activity extends AppCompatActivity {

    String st2;
    LinearLayout Ll2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Ll2 = (LinearLayout) findViewById(R.id.Ll2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,250, "Yellow");
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        st2 = item.getTitle().toString();
        if(st2.equals("Black")){
            Ll2.setBackgroundColor(BLACK);
        }

        if(st2.equals("Green")){
            Ll2.setBackgroundColor(GREEN);
        }

        if(st2.equals("Red")){
            Ll2.setBackgroundColor(Color.RED);
        }

        if(st2.equals("Yellow")){
            Ll2.setBackgroundColor(Color.YELLOW);
        }

        return super.onOptionsItemSelected(item);
    }


    public void go2(View view) {
        Intent t2 = new Intent(this, MainActivity.class);
        startActivity(t2);
    }
}
