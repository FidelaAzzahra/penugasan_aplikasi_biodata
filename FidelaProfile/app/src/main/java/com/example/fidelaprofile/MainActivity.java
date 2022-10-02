package com.example.fidelaprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button launch_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //google maps tidak harus terinstall, yg penting derajat geo sesuai lokasi masing masing
        launch_btn = findViewById(R.id.launch);
        launch_btn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo: -6.995584097964726, 110.38224484024718"));
            Intent chooser = Intent.createChooser(intent, "Launch maps");
            startActivity(chooser);
        });
    }

    //untuk membuka gmail app gmail harus terinstall
    public void gmail(View view){
        Intent sendintent = new Intent(Intent.ACTION_SEND);
        sendintent.setType("text/plain");
        sendintent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
        sendintent.putExtra(Intent.EXTRA_TEXT, "Body of Email");
        startActivity(sendintent);
    }
}