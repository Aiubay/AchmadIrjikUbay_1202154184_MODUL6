package com.ubay.achmadirjikubay_1202154184_modul6;

import android.app.Notification.MessagingStyle.Message;

/**
 * Created by AIUBAY on 01/04/2018.
 */

public class komen {
    private static final komen ourInstance = new komen();
    public String userKomen;

    public String komentar;

    public komen() {

    }

    public komen(String userKomen, String komentar) {

        this.userKomen = userKomen;
        this.komentar= komentar;

    }

    public String getUserKomen(){
        return userKomen;

    }
    public String getKomentar(){
        return komentar;

    }
}
