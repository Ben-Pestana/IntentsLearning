package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessgeActivity extends AppCompatActivity {

    private TextView textViewDisplayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_messge);
        textViewDisplayMessage = findViewById(R.id.textView_receivemessage_displaymessage);
        textViewDisplayMessage.setText(getIntent().getStringExtra(SendMessageActivity.EXTRA_SENT_MESSAGE));
    }
}
