package com.quadsquadltd.passlinev2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {
    Button nrzI;
    Button nrzL;
    Button nrzUni;
    Button mlt3;
    Button ami;
    Button man;
    Button dman;
    ImageView bitOne;
    ImageView bitTwo;
    ImageView bitThree;
    ImageView bitFour;
    ImageView bitFive;
    ImageView bitSix;
    ImageView bitSeven;
    ImageView bitEight;
    ImageView bitNine;
    ImageView bitTen;
    String bitStream;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        bitStream = intent.getStringExtra(MainActivity.bitStream);

        nrzI = (Button) findViewById(R.id.nrzIButton);
        nrzL = (Button) findViewById(R.id.nrzLButton);
        nrzUni = (Button) findViewById(R.id.nrzUniButton);
        mlt3 = (Button) findViewById(R.id.mlt3Button);
        ami = (Button) findViewById(R.id.amiButton);
        man = (Button) findViewById(R.id.manButton);
        dman = (Button) findViewById(R.id.dmanButton);

        ImageView bitOne = findViewById(R.id.bitOne);
        ImageView bitTwo = findViewById(R.id.bitTwo);
        ImageView bitThree = findViewById(R.id.bitThree);
        ImageView bitFour = findViewById(R.id.bitFour);
        ImageView bitFive = findViewById(R.id.bitFive);
        ImageView bitSix = findViewById(R.id.bitSix);
        ImageView bitSeven = findViewById(R.id.bitSeven);
        ImageView bitEight = findViewById(R.id.bitEight);
        ImageView bitNine = findViewById(R.id.bitNine);
        ImageView bitTen = findViewById(R.id.bitTen);

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

     /*   ami.setOnClickListener(new View.OnClickListener() {
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
        }); */


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

    public void amiDO(View mView) {

            int tracker = 1;
            char[] bitStreamCopy = bitStream.toCharArray();
            int[] print = new int[10];
            for (int i = 0; i < bitStreamCopy.length; i++) {

                if (bitStreamCopy[i] == 0)
                    print[i] = R.drawable.mid;

                if (bitStreamCopy[i] == 1 && tracker % 2 != 0) {
                    print[i] = R.drawable.up;
                    tracker++;
                }

                if (bitStreamCopy[i] == 1 && tracker % 2 == 0) {
                    print[i] = R.drawable.down;
                    tracker++;
                }
            }
            // Here's a null pointer exception there must be a problem with your algorithm
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
    }

