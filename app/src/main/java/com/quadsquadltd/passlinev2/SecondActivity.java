package com.quadsquadltd.passlinev2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView bitText;




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

        bitOne = findViewById(R.id.bitOne);
        bitTwo = findViewById(R.id.bitTwo);
        bitThree = findViewById(R.id.bitThree);
        bitFour = findViewById(R.id.bitFour);
        bitFive = findViewById(R.id.bitFive);
        bitSix = findViewById(R.id.bitSix);
        bitSeven = findViewById(R.id.bitSeven);
        bitEight = findViewById(R.id.bitEight);
        bitNine = findViewById(R.id.bitNine);
        bitTen = findViewById(R.id.bitTen);

        bitText = findViewById(R.id.bitText);


    }

    public void amiDO(View mView) {

            int tracker = 1;
            char[] bitStreamCopy = bitStream.toCharArray();
            int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                    R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                    R.drawable.empty,R.drawable.empty};
            for (int i = 0; i < bitStreamCopy.length; i++) {
                if (bitStreamCopy[i] == '0')
                    print[i] = R.drawable.mid;

                else if (bitStreamCopy[i] == '1' && tracker % 2 != 0) {
                    print[i] = R.drawable.up;
                    tracker++;
                }

                else if (bitStreamCopy[i] == '1' && tracker % 2 == 0) {
                    print[i] = R.drawable.down;
                    tracker++;
                }
                else {
                    print[i]=R.drawable.empty;
                }
            }

            bitText.setText(bitStream);

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

    public void nrzIDO (View mView) {
        int prev = R.drawable.empty;
        int tracker = 0;
        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        if (bitStreamCopy[0] == '0') {
            print[0] = R.drawable.up;
            prev = R.drawable.up;
        } else {
            print[0] = R.drawable.down;
            prev = R.drawable.down;
            tracker++;
        }
        for (int i = 1; i < bitStreamCopy.length; i++) {

            if (bitStreamCopy[i] == '0') {
                print[i] = prev;
            } else if (tracker % 2 != 0) {
                print[i] = R.drawable.up;
                prev = R.drawable.up;
                tracker++;
            } else if (tracker % 2 == 0) {
                print[i] = R.drawable.down;
                prev = R.drawable.down;
                tracker++;
            }
        }
        bitText.setText(bitStream);
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

    public void nrzLDO (View mView){
        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        for (int i = 0; i <bitStreamCopy.length; i++) {
            if (bitStreamCopy[i]=='0') {
                print[i]=R.drawable.up;
            }
            else if (bitStreamCopy[i] == '1') {
                print[i]=R.drawable.down;
            }
            else {
                print[i]=R.drawable.empty;
            }
        }

        bitText.setText(bitStream);

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
    public void nrzUniDO (View mView){

        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        for (int i = 0; i < bitStreamCopy.length; i++) {
            if (bitStreamCopy[i]=='0') {
                print[i]=R.drawable.mid;
            }
            else if (bitStreamCopy[i] == '1') {
                print[i]=R.drawable.up;
            }
            else {
                print[i]=R.drawable.empty;
            }
        }

        bitText.setText(bitStream);

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

    public void mlt3DO (View mView){
        int prev = R.drawable.empty;
        int tracker = 0;
        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        if(bitStreamCopy[0]=='0'){
            print[0]=R.drawable.mid;
            prev=R.drawable.mid;
        }
        else if (bitStreamCopy[0]=='1'){
            print[0]=R.drawable.up;
            prev=R.drawable.up;
        }

        for(int i=1;i<bitStreamCopy.length;i++) {

            if(bitStreamCopy[i]=='0') {
                print[i] = prev;
            }
            else if(prev == R.drawable.up){
                print[i]= R.drawable.mid;
                prev=R.drawable.mid;
                tracker++;
            }
            else if(prev == R.drawable.mid && tracker%2!=0){
                print[i]=R.drawable.down;
                prev=R.drawable.down;
            }
            else if(prev == R.drawable.down){
                print[i]=R.drawable.mid;
                prev= R.drawable.mid;
                tracker++;
            }
            else if(prev == R.drawable.mid && tracker%2==0){
                print[i]=R.drawable.up;
                prev=R.drawable.up;
            }
        }

        bitText.setText(bitStream);

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
    public void manDO (View mView){
        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        for (int i = 0; i < bitStreamCopy.length; i++) {
            if (bitStreamCopy[i]=='0') {
                print[i]=R.drawable.mandown;
            }
            else if (bitStreamCopy[i] == '1') {
                print[i]=R.drawable.manup;
            }
            else {
                print[i]=R.drawable.empty;
            }
        }

        bitText.setText(bitStream);

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
    public void dmanDO (View mView){
        int prev = R.drawable.empty;
        int tracker = 0;
        char[] bitStreamCopy = bitStream.toCharArray();
        int[] print = {R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty,R.drawable.empty,R.drawable.empty,
                R.drawable.empty,R.drawable.empty};
        if (bitStreamCopy[0] == '0') {
            print[0] = R.drawable.manup;
            prev = R.drawable.manup;
        } else {
            print[0] = R.drawable.mandown;
            prev = R.drawable.mandown;
            tracker++;
        }
        for (int i = 1; i < bitStreamCopy.length; i++) {

            if (bitStreamCopy[i] == '0') {
                print[i] = prev;
            } else if (tracker % 2 != 0) {
                print[i] = R.drawable.manup;
                prev = R.drawable.manup;
                tracker++;
            } else if (tracker % 2 == 0) {
                print[i] = R.drawable.mandown;
                prev = R.drawable.mandown;
                tracker++;
            }
        }

        bitText.setText(bitStream);

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

