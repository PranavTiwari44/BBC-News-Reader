package com.example.finalproject;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.bbc);
        btn1.setOnClickListener(click -> {
            Intent nextActivity = new Intent(this, Articles.class);
            startActivityForResult(nextActivity, 100);
        });
    }
}



