package app.com.example.android.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechnicalEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_event);
        Button event1=(Button)findViewById(R.id.event1);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(TechnicalEvent.this,TechQuiz.class);
                startActivity(n);
            }
        });
        Button event2=(Button)findViewById(R.id.event2);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(TechnicalEvent.this,Brainathon.class);
                startActivity(n);
            }
        });
        Button event3=(Button)findViewById(R.id.event3);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(TechnicalEvent.this,Aptitude.class);
                startActivity(n);
            }
        });
        Button event4=(Button)findViewById(R.id.event4);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(TechnicalEvent.this,LanGaming.class);
                startActivity(n);
            }
        });
        Button event5=(Button)findViewById(R.id.event4);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(TechnicalEvent.this,Coding.class);
                startActivity(n);
            }
        });

    }
}
