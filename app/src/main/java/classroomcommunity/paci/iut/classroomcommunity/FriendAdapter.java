package classroomcommunity.paci.iut.classroomcommunity;

import android.app.Activity;
import android.content.Context;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Noussayr on 19/03/18.
 */

public class FriendAdapter extends ArrayAdapter <Friend> {

    Activity activity;
    ArrayList<Friend> amis;
    int photo;


    public FriendAdapter(Activity activity1, int avatar, ArrayList<Friend> listAmis){
        super(activity1, avatar,listAmis);
        activity = activity1;
        photo = avatar;
        amis = listAmis;
    }



    public View getView(int position, View convertView, ViewGroup parent) {

       View v = convertView;

        if(convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            v = inflater.inflate(photo, parent, false);
        }



        //(2) : Récupération des TextView de notre layout
        //CircleImageView avatar = (CircleImageView) layoutItem.findViewById(R.id.photoUser);
        TextView userId = (TextView) v.findViewById(R.id.username);


        //(3) : Renseignement des valeurs

        userId.setText( amis.get(position).nom);


        return v;
    }
}
