package app.com.example.android.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformalEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informal_event);
        Button event1=(Button)findViewById(R.id.event1);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,Kritsvilla.class);
                startActivity(n);
            }
        });
        Button event2=(Button)findViewById(R.id.event2);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,Tambola.class);
                startActivity(n);
            }
        });

        Button event3=(Button)findViewById(R.id.event3);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,Rampage.class);
                startActivity(n);
            }
        });
        Button event4=(Button)findViewById(R.id.event4);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,Dedication.class);
                startActivity(n);
            }
        });

        Button event5=(Button)findViewById(R.id.event5);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,FunGames.class);
                startActivity(n);
            }
        });

        Button event6=(Button)findViewById(R.id.event6);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(InformalEvent.this,ScavengerHunt.class);
                startActivity(n);
            }
        });

    }
}
