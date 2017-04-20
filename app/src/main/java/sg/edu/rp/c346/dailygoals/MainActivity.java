package sg.edu.rp.c346.dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg1, rg2, rg3;
    TextView tv1, tv2, tv3, tv4;
    EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        et1 = (EditText)findViewById(R.id.editTextReflect);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Activity2.class);

                rg1 = (RadioGroup)findViewById(R.id.rg1);
                rg2 = (RadioGroup)findViewById(R.id.rg2);
                rg3 = (RadioGroup)findViewById(R.id.rg3);

                int selectedBtn = rg1.getCheckedRadioButtonId();
                int selectedBtn2 = rg2.getCheckedRadioButtonId();
                int selectedBtn3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton)findViewById(selectedBtn);
                RadioButton rb2 = (RadioButton)findViewById(selectedBtn2);
                RadioButton rb3 = (RadioButton)findViewById(selectedBtn3);


                String[] data = {et1.getText().toString(), rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString()};



                i.putExtra("data", data);

                startActivity(i);

            }
        });

    }
}
