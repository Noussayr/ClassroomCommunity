package classroomcommunity.paci.iut.classroomcommunity;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Quiz extends AppCompatActivity implements View.OnClickListener {

    private TextView player1;
    private TextView player2;
    private TextView time;

    private ProgressBar pb;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        player1 = (TextView)findViewById(R.id.player1) ;
        player2 = (TextView)findViewById(R.id.player2) ;



        Intent i = getIntent();
        Bundle b = i.getExtras();
        String user = b.getString("username");
        String challenger = b.getString("challenger");
        player1.setText(user);
        player2.setText(challenger);


        // Récupération réponse question
        btn1 = (Button) findViewById(R.id.Rep01);
        btn2 = (Button) findViewById(R.id.Rep02);
        btn3 = (Button) findViewById(R.id.Rep03);
        btn4 = (Button) findViewById(R.id.Rep04);

        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);


    }

    public void onClick(View v){

            switch(v.getId()){

                case R.id.Rep01:
                    btn1.setBackgroundColor(Color.RED);
                    Toast.makeText(Quiz.this, "Mauvaise réponse", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.Rep02:
                    btn2.setBackgroundColor(Color.RED);
                    Toast.makeText(Quiz.this, "Mauvaise réponse", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.Rep03:
                    btn3.setBackgroundColor(Color.RED);
                    Toast.makeText(Quiz.this, "Mauvaise réponse", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.Rep04:
                    btn4.setBackgroundColor(Color.GREEN);
                    Toast.makeText(Quiz.this, "Bonne réponse", Toast.LENGTH_SHORT).show();
                    break;
            }
    }


}
