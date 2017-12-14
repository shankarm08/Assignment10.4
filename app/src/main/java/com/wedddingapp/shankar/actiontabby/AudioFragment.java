package com.wedddingapp.shankar.actiontabby;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by shan on 12/14/2017.
 */

public class AudioFragment extends Fragment {



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View audioView=inflater.inflate(R.layout.audio_fragment,null);


        LinearLayout audioLayout=(LinearLayout)getActivity().findViewById(R.id.audio_layout);


        audioLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));

        return audioView;
    }
}
