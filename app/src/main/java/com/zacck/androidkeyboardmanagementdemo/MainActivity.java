package com.zacck.androidkeyboardmanagementdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener {

    EditText et1, et2;
    Button btSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        btSample = (Button)findViewById(R.id.btLogin);

        //manipulate enter key on keyboard

        et1.setOnKeyListener(this);
        et2.setOnKeyListener(this);
    }

    //will be called everytime a key is pressed on the keyboard
    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        //lets check that the enter key has been pressed down
        if(keyCode == event.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN)
        {
            alert("Enter Key Pressed run code for enter");
        }
        return false;
    }

    public void alert(String Message)
    {
        Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_LONG).show();
    }
}
