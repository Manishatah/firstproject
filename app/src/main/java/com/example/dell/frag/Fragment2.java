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

public class Fragment2 extends Fragment  {
    private Button btngreen;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater .inflate(R.layout .fragment2 ,container ,false) ;
        btngreen  =(Button)view .findViewById(R.id.btngreen ) ;

        btngreen .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 =new Fragment3();
                getFragmentManager() .beginTransaction() .replace(R.id.l1 ,fragment3 ).addToBackStack("") .commit() ;

            }
        }) ;
return view ;
        }
}
