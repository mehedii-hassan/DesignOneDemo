package com.example.designonedemo.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designonedemo.R;
import com.example.designonedemo.adapters.ImageAdapter;
import com.example.designonedemo.adapters.ImageAdapterTwo;
import com.example.designonedemo.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialization
        binding = FragmentHomeBinding.inflate(inflater, container, false);


        int[] images = {R.drawable.market, R.drawable.fruits, R.drawable.vegetables, R.drawable.fish};
        String[] names = getResources().getStringArray(R.array.ImageNames);

        int[] images_ = {R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11};
        String[] titles = getResources().getStringArray(R.array.Titles);
        String[] descriptions = getResources().getStringArray(R.array.Descriptions);

        ImageAdapter adapter = new ImageAdapter(images, names);
        binding.rvOne.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvOne.setAdapter(adapter);

        ImageAdapterTwo adapterTwo = new ImageAdapterTwo(images_, titles, descriptions);
        binding.rvTwo.setLayoutManager(new LinearLayoutManager(container.getContext()));
        binding.rvTwo.setAdapter(adapterTwo);


        return binding.getRoot();
    }
}