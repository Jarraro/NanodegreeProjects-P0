package com.jarrar.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {
        String toastText = "";

        switch (view.getId()) {
            case R.id.button1:
                toastText = "This button will launch my Spotify App";
                break;
            case R.id.button2:
                toastText = "This button will launch my Scores App";
                break;
            case R.id.button3:
                toastText = "This button will launch my Library App";
                break;
            case R.id.button4:
                toastText = "This button will launch my 'Build It Bigger' App";
                break;
            case R.id.button5:
                toastText = "This button will launch my XYZ Reader App";
                break;
            case R.id.button6:
                toastText = "This button will launch My Own App";
                break;

        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }


}
