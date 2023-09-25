package com.example.parth.datapassinginfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class AFragment extends Fragment {

    private static final String ARG1="argument1";
    private static final String ARG2="argument2";

    public AFragment() {
        // Required empty public constructor
    }

    public static AFragment getInstance(String value1,int value2){
        AFragment aFragment = new AFragment();

        Bundle bundle = new Bundle();
        bundle.putString(ARG1,value1);
        bundle.putInt(ARG2,value2);

        aFragment.setArguments(bundle);

        return aFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        /*if (getArguments()!=null){
            String Name = getArguments().getString("ARG1");
            int RollNo = getArguments().getInt("ARG2");

            Log.d("Value From ACT :- ", "onCreateView: Name is:-"+ Name +"RollNo is:-"+ RollNo);
        }*/

        if (getArguments()!=null){
            String Name = getArguments().getString(ARG1);
            int RollNo = getArguments().getInt(ARG2);

            Log.d("Value From ACT :- ", "onCreateView: Name is:-"+ Name +"RollNo is:-"+ RollNo);
            Toast.makeText(getContext(), "Name is:-"+ Name +"\n"+"RollNo is:-"+ RollNo , Toast.LENGTH_SHORT).show();
        }

        View v = inflater.inflate(R.layout.fragment_a, container, false);
        return v;
    }
}
