package ru.drivermql.p0021;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTwo = (Button) findViewById(R.id.btnGoTwo);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGoTwo:
                Intent intent = new Intent(this,ActicityTwo.class);
                startActivity(intent);
                break;
            default: break;

        }
    }
}
