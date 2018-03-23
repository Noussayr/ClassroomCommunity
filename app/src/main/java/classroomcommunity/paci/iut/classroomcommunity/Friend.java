package classroomcommunity.paci.iut.classroomcommunity;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Noussayr on 19/03/18.
 */

public class Friend {

    private int avatar;
    String nom;

    Friend(int unAvatar, String unNom){

        this.avatar = unAvatar;
        this.nom = unNom;

    }


    public void setAvatar(int n){

        this.avatar = n;
    }

    public int getAvatar(){

        return this.avatar;
    }

    public void setNom(String s){

        this.nom = s;
    }

    public String getNom() {
        return nom;
    }

    public static ArrayList<Friend> getListOfFriends(){

        ArrayList<Friend> listFriend = new ArrayList();
        listFriend.add(new Friend(1,"Logan"));
        listFriend.add(new Friend(2,"Xavier"));
        listFriend.add(new Friend(3,"Willy"));
        listFriend.add(new Friend(4,"Ulric"));
        listFriend.add(new Friend(5,"Gerard"));
        listFriend.add(new Friend(6,"Kevin"));


        return listFriend;
    }
}
