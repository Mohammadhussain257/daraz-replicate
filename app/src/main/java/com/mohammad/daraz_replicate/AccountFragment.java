package com.mohammad.daraz_replicate;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    BottomNavigationView my_order_bottom_navigation,my_service_bottom_navigation;


    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_account, container, false);
        this.my_order_bottom_navigation=view.findViewById(R.id.my_order_bottom_navigation);
        this.my_service_bottom_navigation=view.findViewById(R.id.my_service_bottom_navigation);
        my_order_bottom_navigation.setItemIconTintList(null);
        my_service_bottom_navigation.setItemIconTintList(null);
        return view;
    }

}
