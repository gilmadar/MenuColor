package com.example.yam.menucolor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;

public class MainActivity extends AppCompatActivity {

    String st;
    LinearLayout Ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ll = (LinearLayout) findViewById(R.id.Ll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        st = item.getTitle().toString();
        if(st.equals("Black")){
            Ll.setBackgroundColor(BLACK);
        }

        if(st.equals("Green")){
            Ll.setBackgroundColor(GREEN);
        }

        if(st.equals("Red")){
            Ll.setBackgroundColor(Color.RED);
        }

        return super.onOptionsItemSelected(item);
    }

    public void go(View view) {

        Intent t = new Intent(this, Main2Activity.class);
        startActivity(t);

    }
}
