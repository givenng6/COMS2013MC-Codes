package com.example.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText data;
    EditText calls;
    EditText sms;
    Button find;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = findViewById(R.id.data);
        calls = findViewById(R.id.calls);
        sms = findViewById(R.id.sms);
        output = findViewById(R.id.output);
        find = findViewById(R.id.find);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!data.getText().toString().equals("") || !calls.getText().toString().equals("") || !sms.getText().toString().equals("") ){
                    int getData = Integer.parseInt(data.getText().toString());
                    int getCalls = Integer.parseInt(calls.getText().toString());
                    int getSms = Integer.parseInt(sms.getText().toString());

                    int totalSpeakUp = speakUp(getData, getCalls, getSms);
                    int totalMessenger = messenger(getData, getCalls, getSms);
                    int totalDownloader = downloader(getData, getCalls, getSms);

                    String cheap = totalSpeakUp > totalMessenger ? "Messenger" : "SpeakUp";

                    if(cheap.equals("Messenger")){
                        if(totalMessenger > totalDownloader){
                            String ans = "The best contract available to you is Downloader which would cost R" + totalDownloader;
                            output.setText(ans);
                        }else {
                            String ans = "The best contract available to you is Messenger which would cost R" + totalMessenger;
                            output.setText(ans);
                        }

                    }else {
                        if(totalSpeakUp > totalDownloader){
                            String ans = "The best contract available to you is Downloader which would cost R" + totalDownloader;
                            output.setText(ans);
                        }else {
                            String ans = "The best contract available to you is SpeakUp which would cost R" + totalSpeakUp;
                            output.setText(ans);
                        }

                    }

                }
            }
        });

    }

    public int speakUp(int data, int calls, int sms){
        int dataPrice = 3 * data;
        int smsPrice = 2 * sms;

        return dataPrice + calls + smsPrice;
    }

    public int messenger(int data, int calls, int sms){
        int dataPrice = 4 * data;
        int callsPrice = 3 * calls;

        return dataPrice + callsPrice + sms;
    }

    public int downloader(int data, int calls, int sms){
        int callsPrice = 4 * calls;
        int smsPrice = 3 * sms;

        return data + callsPrice + smsPrice;
    }
}