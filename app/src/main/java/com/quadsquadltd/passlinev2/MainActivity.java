package com.quadsquadltd.passlinev2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
    public static final String bitStream = "QuadSquadLtd.Application.bitStream";
    String lengthError = "The bit stream contains more than 10 bits";
    String binaryError = "The bit stream contains numbers other than 0 and 1";
    String inputError = "No input detected";
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
        if (bit_Stream.length() > 10){
            Toast.makeText(getApplicationContext(),lengthError,Toast.LENGTH_LONG).show();
        } else if (bit_Stream.length() <= 0){
            Toast.makeText(getApplicationContext(),inputError,Toast.LENGTH_LONG).show();
        } else {
            char [] bs = bit_Stream.toCharArray();
            boolean binary = false;
            for (int i = 0; i< bs.length;i++){
                if (bs[i]== '1'|| bs[i]=='0'){
                    binary = true;
                } else {
                    binary = false;
                    break;
                }
            }
            if (binary) {
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra(bitStream, bit_Stream);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(),binaryError,Toast.LENGTH_LONG).show();
            }
        }
    }
}






