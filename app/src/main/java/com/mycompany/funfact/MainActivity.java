package com.mycompany.funfact;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    private Factcolor objj=new Factcolor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv=(TextView)findViewById(R.id.textView);
        final Button b=(Button)findViewById(R.id.button);
        final RelativeLayout mealLayout=(RelativeLayout)findViewById(R.id.relativeLay);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactBook ob=new FactBook();
              String str=ob.mFactBook();
                ob.fac[0]="heyy";
                tv.setText(str);
                int col=objj.mFactcolor();
                mealLayout.setBackgroundColor(col);
                b.setTextColor(col);


            }
        });
        Toast.makeText(this,"yeaaahhhh",Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
