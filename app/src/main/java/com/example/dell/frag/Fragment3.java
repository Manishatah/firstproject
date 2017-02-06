package com.example.dell.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by DELL on 2/5/2017.
 */

public class Fragment3 extends Fragment  {
    private Button btnblue;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater .inflate(R.layout .fragment3 ,container ,false) ;
        btnblue   =(Button)view .findViewById(R.id.btnblue  ) ;
        btnblue .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager() .popBackStack() ;

            }
        }) ;
        return view ;

    }
}
