package classroomcommunity.paci.iut.classroomcommunity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static classroomcommunity.paci.iut.classroomcommunity.R.id.password;
import static classroomcommunity.paci.iut.classroomcommunity.R.id.username;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                login = (EditText) findViewById(R.id.username);
                pass = (EditText) findViewById(password);

                if(login.getText().toString().equals("admin") ) {

                    Toast.makeText(LoginActivity.this, "Connecté", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LoginActivity.this, FriendList.class);
                    i.putExtra("username", login.getText().toString());
                    startActivity(i);

                } else{

                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setTitle("You suck");
                    builder.setMessage("try again");
                    builder.setPositiveButton("ok", null);
                    AlertDialog dialog = builder.show();


                }
            }
        });
    }
}
