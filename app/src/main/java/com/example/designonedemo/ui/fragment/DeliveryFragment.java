package com.example.designonedemo.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designonedemo.R;
import com.example.designonedemo.databinding.FragmentDeliveryBinding;


public class DeliveryFragment extends Fragment {


    private FragmentDeliveryBinding binding;

    public DeliveryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initialization
        binding = FragmentDeliveryBinding.inflate(inflater, container, false);

        //set on click listener -------------
        binding.tvSkipDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.bestGroceryFragment);
            }
        });
        return binding.getRoot();
    }
}