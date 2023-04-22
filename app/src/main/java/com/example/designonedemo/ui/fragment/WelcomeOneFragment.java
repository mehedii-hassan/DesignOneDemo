package com.example.designonedemo.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designonedemo.R;
import com.example.designonedemo.databinding.FragmentDeliveryBinding;
import com.example.designonedemo.databinding.FragmentWelcomeOneBinding;


public class WelcomeOneFragment extends Fragment {


    private FragmentWelcomeOneBinding binding;

    public WelcomeOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialization
        binding = FragmentWelcomeOneBinding.inflate(inflater, container, false);

        //set on click listener -------------
        binding.tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.deliveryFragment);
            }
        });
        return binding.getRoot();
    }
}