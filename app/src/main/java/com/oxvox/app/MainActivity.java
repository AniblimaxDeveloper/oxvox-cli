package com.oxvox.app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.BLACK);

        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.ic_launcher);
        layout.addView(logo);

        TextView text = new TextView(this);
        text.setText("OXVOX SYSTEM ONLINE");
        text.setTextColor(Color.WHITE);
        text.setTextSize(24f);
        layout.addView(text);

        setContentView(layout);
    }
}
