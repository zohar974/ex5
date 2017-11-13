package com.example.madaim.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl1 =(RelativeLayout) findViewById(R.id.mainRL);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.LL1);
        ll1.setOrientation(LinearLayout.VERTICAL);




    }
}
