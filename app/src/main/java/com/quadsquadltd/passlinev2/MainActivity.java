package com.quadsquadltd.passlinev2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static final String bitStream = "QuadSquadLtd.Application.bitStream";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.input_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
    }
    public void openSecondActivity(){

        EditText input = (EditText) findViewById(R.id.bit_stream);
        String bit_Stream = input.getText().toString();

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(bitStream,bit_Stream);
        startActivity(intent);
    }
}
