package com.example.sya.layerone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sya.layerone.R;
import com.layer.sdk.LayerClient;

/**
 * Example about replacing fragments inside a ViewPager. I'm using
 * android-support-v7 to maximize the compatibility.
 *
 * @author Dani Lao (@dani_lao)
 *
 */
public class ListFragment extends Fragment {

    ListView listView;
    public static ListFragment newInstance (String email) {

        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString("email",email);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.list);
        String[] values = new String[] { "Flight Bookings",
                "Rental Cars",
                "Book a Hotel",
                "Example",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
                "Book a Hotel222222",
                "Create List View Android2",
                "Android Example23",
                "List View Source Code2",
                "List View Array Adapter2",
                "Android Example List View2"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);
                // Show Alert
                /*Toast.makeText(getContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();*/
                Intent intent = new Intent(getContext(),MainActivity.class);
                intent.putExtra("category",itemValue);
                intent.putExtra("email",getArguments().getString("email"));
                startActivity(intent);

            }

        });

        return view;

    }

}
