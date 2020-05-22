package app.com.example.android.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Literaryevent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary_event);
        Button event1=(Button)findViewById(R.id.event1);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Literaryevent.this,Wordament.class);
                startActivity(n);
            }
        });
        Button event2=(Button)findViewById(R.id.event2);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Literaryevent.this,Avquiz.class);
                startActivity(n);
            }
        });
        Button event3=(Button)findViewById(R.id.event3);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Literaryevent.this,Scanf.class);
                startActivity(n);
            }
        });
        Button event4=(Button)findViewById(R.id.event4);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Literaryevent.this,GroupDiscussion.class);
                startActivity(n);
            }
        });


    }
}
