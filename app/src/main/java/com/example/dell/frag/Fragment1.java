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

public class Fragment1 extends Fragment  {
    private Button btnred;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =inflater .inflate(R.layout .fragment1,container ,false) ;
        btnred =(Button)view .findViewById(R.id.btnred) ;

        btnred .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 =new Fragment2();
                getFragmentManager() .beginTransaction() .replace(R.id.l1 ,fragment2 ).addToBackStack("") .commit() ;
            }
        }) ;
        return view;

    }
}
