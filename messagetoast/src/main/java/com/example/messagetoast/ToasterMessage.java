package com.example.messagetoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }

    public int getImage() {

        return R.drawable.ic_launcher_background;

    }
}
