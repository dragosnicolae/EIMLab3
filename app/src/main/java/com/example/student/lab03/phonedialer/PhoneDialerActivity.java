package com.example.student.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    private EditText phoneNumber;
    private ImageButton backspace, call, hangup;
    private Button genericButton;

    final private static int[] buttonIds = {
            R.id.number_0,
            R.id.number_1,
            R.id.number_2,
            R.id.number_3,
            R.id.number_4,
            R.id.number_5,
            R.id.number_6,
            R.id.number_7,
            R.id.number_8,
            R.id.number_9,
            R.id.star,
            R.id.hashtag
    };

    private class GenericButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            phoneNumber.setText(phoneNumber.getText().toString() + ((Button)v).getText().toString());
        }
    }
    private GenericButtonClickListener listener = new GenericButtonClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        phoneNumber = (EditText)findViewById(R.id.phone_number_edit_text);
        backspace = (ImageButton)findViewById(R.id.backspace_button);
        call = (ImageButton)findViewById(R.id.call_button);
        hangup = (ImageButton)findViewById(R.id.hangup_button);

        int i;
        for (i = 0; i < buttonIds.length; i++) {
            genericButton = (Button)findViewById(buttonIds[i]);
            genericButton.setOnClickListener(listener);
        }

    }
}
