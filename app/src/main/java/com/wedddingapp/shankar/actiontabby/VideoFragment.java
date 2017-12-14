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

public class VideoFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View videoView=inflater.inflate(R.layout.video_fragment,null);

        LinearLayout videoLayout=(LinearLayout)getActivity().findViewById(R.id.video_layout);

        videoLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));

        return videoView;
    }
}
