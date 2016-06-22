package com.example.sya.layerone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sya.layerone.R;
import com.layer.sdk.LayerClient;

/**
 * Example about replacing fragments inside a ViewPager. I'm using
 * android-support-v7 to maximize the compatibility.
 *
 * @author Dani Lao (@dani_lao)
 *
 */
public class RootFragment extends Fragment {

    public static RootFragment newInstance (String email) {

        RootFragment fragment = new RootFragment();
        Bundle args = new Bundle();
        args.putString("email",email);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
		/* Inflate the layout for this fragment */
        View view = inflater.inflate(R.layout.root_fragment, container, false);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.root_frame, ListFragment.newInstance(getArguments().getString("email")));

        transaction.commit();

        return view;
    }

}
