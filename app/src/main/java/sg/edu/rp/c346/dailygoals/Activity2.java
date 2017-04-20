package sg.edu.rp.c346.dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 15035634 on 20/4/2017.
 */

public class Activity2 extends AppCompatActivity {

    TextView txt, txt2, txt3, txt4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        txt = (TextView)findViewById(R.id.txt);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt3 = (TextView)findViewById(R.id.txt3);
        txt4 = (TextView)findViewById(R.id.txt4);

        Intent i = getIntent();

        String[] data = i.getStringArrayExtra("data");

        //set text
        txt.setText("Read up on materials before class: " + data[1]);

        txt2.setText("Arrive on time so as not miss important part of the lesson: " + data[2]);

        txt3.setText("Attempt the problem myself: " + data[3]);

        txt4.setText("Reflection: " + data[0]);


    }

}
