package com.example.sya.layerone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.layer.sdk.LayerClient;
import com.layer.sdk.messaging.Conversation;

import java.util.ArrayList;
import java.util.Hashtable;


public class MyFragment extends Fragment {

    public MyFragment() {
    }


    public static MyFragment newInstance () {

        MyFragment fragment = new MyFragment();
        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_fragment, container, false);


        return rootView ;

    }
}
