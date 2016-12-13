package com.example.tonghung.checknetworkconnectiondemo;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkNetWorkState();
    }

    private void checkNetWorkState(){
        TextView tv = (TextView) findViewById(R.id.textView1);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isAvailable() == true && networkInfo.isConnected() == true){
            tv.setText("NETWORK CONNECTED");
        }else{
            tv.setText("NETWORK DISCONNECTED");
        }
    }
}
