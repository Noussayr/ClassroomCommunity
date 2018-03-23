package classroomcommunity.paci.iut.classroomcommunity;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FriendList extends AppCompatActivity   {

    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_friend);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayList<Friend> amis = Friend.getListOfFriends();

        FriendAdapter adapter = new FriendAdapter(this, R.layout.friend_layout, amis);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Friend selectedItem = (Friend) parent.getItemAtPosition(position);

                // Display the selected item text
                Toast.makeText(FriendList.this, "Lancement du Quiz contre " + selectedItem.getNom() + ".", Toast.LENGTH_SHORT).show();


                Intent i = new Intent(FriendList.this, Quiz.class );
                Bundle bun = getIntent().getExtras();

                String player = bun.getString("username");



                bun.putString("challenger", selectedItem.getNom());
                i.putExtra("username", player);
                i.putExtras(bun);
                startActivity(i);
            }
        });
    }
}

