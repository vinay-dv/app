package com.example.vinaykatariya.apn;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.t1);
        Shader shader = new LinearGradient(80 ,-80, -3, textView.getTextSize(), Color.YELLOW, Color.RED,
                Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);
    }
}