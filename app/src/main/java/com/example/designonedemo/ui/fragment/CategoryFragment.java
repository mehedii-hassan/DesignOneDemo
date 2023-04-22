package com.example.designonedemo.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designonedemo.R;
import com.example.designonedemo.adapters.CategoryAdapter;
import com.example.designonedemo.databinding.FragmentCategoryBinding;


public class CategoryFragment extends Fragment {

    private FragmentCategoryBinding binding;

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialization
        binding = FragmentCategoryBinding.inflate(inflater, container, false);

        int[] categoryImages = {R.drawable.bedena,
                R.drawable.broccoli, R.drawable.bedena,
                R.drawable.broccoli, R.drawable.bedena,
                R.drawable.broccoli, R.drawable.bedena,
                R.drawable.broccoli, R.drawable.bedena};

        CategoryAdapter adapter = new CategoryAdapter(categoryImages);
        binding.rvCategory.setLayoutManager(new GridLayoutManager(container.getContext(), 2));
        binding.rvCategory.setAdapter(adapter);


        return binding.getRoot();
    }
}