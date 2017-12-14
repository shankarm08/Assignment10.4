package com.wedddingapp.shankar.actiontabby;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout audioLayout;
    LinearLayout videoLayout;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioLayout=(LinearLayout)findViewById(R.id.audio_layout);
        videoLayout=(LinearLayout)findViewById(R.id.video_layout);



        audioLayout.setOnClickListener(this);
        videoLayout.setOnClickListener(this);

    }


    public void onClick(View v) {


        Fragment fraggy=null;


        audioLayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));
        videoLayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));


        if(v.getId()==R.id.audio_layout)
        {

            fraggy = new AudioFragment();
        }
        else if(v.getId()==R.id.video_layout)
        {

            fraggy = new VideoFragment();
        }


        FragmentManager fragmentManager=getSupportFragmentManager();


        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


        fragmentTransaction.replace(R.id.flggcontainer,fraggy);

        fragmentTransaction.addToBackStack(null);


        fragmentTransaction.commit();

    }
}
