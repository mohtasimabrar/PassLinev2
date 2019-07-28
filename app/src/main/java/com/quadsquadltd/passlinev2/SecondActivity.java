package com.quadsquadltd.passlinev2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        final String bitStream = intent.getStringExtra(MainActivity.bitStream);

        Button nrzI = (Button) findViewById(R.id.nrzIButton);
        Button nrzL = (Button) findViewById(R.id.nrzLButton);
        Button nrzUni = (Button) findViewById(R.id.nrzUniButton);
        Button mlt3 = (Button) findViewById(R.id.mlt3Button);
        Button ami = (Button) findViewById(R.id.amiButton);
        Button man = (Button) findViewById(R.id.manButton);
        Button dman = (Button) findViewById(R.id.dmanButton);

        final ImageView bitOne = findViewById(R.id.bitOne);
        final ImageView bitTwo = findViewById(R.id.bitTwo);
        final ImageView bitThree = findViewById(R.id.bitThree);
        final ImageView bitFour = findViewById(R.id.bitFour);
        final ImageView bitFive = findViewById(R.id.bitFive);
        final ImageView bitSix = findViewById(R.id.bitSix);
        final ImageView bitSeven = findViewById(R.id.bitSeven);
        final ImageView bitEight = findViewById(R.id.bitEight);
        final ImageView bitNine = findViewById(R.id.bitNine);
        final ImageView bitTen = findViewById(R.id.bitTen);

        nrzI.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        nrzL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nrzUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mlt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tracker=1;
                char[] bitStreamCopy = bitStream.toCharArray();
                int [] print = new int[10];
                for(int i=0;i<bitStreamCopy.length;i++){

                    if(bitStreamCopy[i]==0)
                        print[i]= R.drawable.mid;

                    if(bitStreamCopy[i]==1 && tracker%2!=0)
                    {
                        print[i]=R.drawable.up;
                        tracker++;
                    }

                    if(bitStreamCopy[i]==1 && tracker%2==0)
                    {
                        print[i]=R.drawable.down;
                        tracker++;
                    }
                }
                bitOne.setImageResource(print[0]);
                bitTwo.setImageResource(print[1]);
                bitThree.setImageResource(print[2]);
                bitFour.setImageResource(print[3]);
                bitFive.setImageResource(print[4]);
                bitSix.setImageResource(print[5]);
                bitSeven.setImageResource(print[6]);
                bitEight.setImageResource(print[7]);
                bitNine.setImageResource(print[8]);
                bitTen.setImageResource(print[9]);
            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
