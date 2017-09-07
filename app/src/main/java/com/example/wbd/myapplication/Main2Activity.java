package com.example.wbd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent1 = getIntent();
        String str = intent1.getStringExtra("result");
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                EditText text = (EditText)findViewById(R.id.backtext);
                intent.putExtra("result","回传的数据为:" + text.getText().toString());
                setResult(0,intent);
                finish();
            }
        });
    }
}
