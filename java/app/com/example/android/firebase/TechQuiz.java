package app.com.example.android.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_quiz);
        Button apply_wordament=(Button)findViewById(R.id.applyWordament);
        apply_wordament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //database wala part
            }
        });
    }
}
