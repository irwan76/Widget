package com.dilobpn.user.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String customFont = "Roboto.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);
        TextView textView = (TextView) findViewById(R.id.custom_text);
        TextView textView1 = (TextView) findViewById(R.id.custom_text1);
        textView.setTypeface(typeface);
        textView1.setTypeface(typeface);
    }
}