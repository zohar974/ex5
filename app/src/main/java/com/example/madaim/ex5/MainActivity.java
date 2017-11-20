package com.example.madaim.ex5;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl1 =(RelativeLayout) findViewById(R.id.mainRL);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.LL1);
        ll1.setOrientation(LinearLayout.VERTICAL);
        ll1.setBackgroundResource(R.drawable.border);
        RelativeLayout.LayoutParams lp= new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,toPixel(180));
        lp.addRule(RelativeLayout.BELOW,R.id.LL1);
        lp.setMargins(0,toPixel(45),0,0);
        TextView text= new TextView(this);
        text.setText(getString(R.string.text1));
        LinearLayout.LayoutParams lp2= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp2.setMargins(toPixel(20),0,0,0);
        ll1.addView(text,lp2);
        LinearLayout cbLayout=new LinearLayout(this);
        cbLayout.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams lp3= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        lp3.setMargins(toPixel(35),toPixel(50),0,0);
        CheckBox cb1=new CheckBox(this);
        CheckBox cb2=new CheckBox(this);
        cb1.setText(R.string.cb1);
        cb2.setText(R.string.cb2);
        cbLayout.addView(cb1,lp3);
        cbLayout.addView(cb2,lp3);
        ll1.addView(cbLayout,lp2);
        rl1.addView(ll1,lp);




    }
    private int toPixel (int dp){
        Resources r = getResources();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());

    }

    public void layoutTransfer(View v){
        FrameLayout rl1 =(FrameLayout) findViewById(R.id.FL);
        if (((ToggleButton)v).isChecked()){
            LinearLayout ll3 = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout1, null);
        }
    }

}
