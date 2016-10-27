package com.example.madhavi.newgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addfile f=new Addfile();
        f.g=12;

    }

    private void add()
    {
        int gg=1+2;
    }
}
