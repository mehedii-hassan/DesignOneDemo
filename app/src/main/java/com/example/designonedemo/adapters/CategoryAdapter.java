package com.example.designonedemo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designonedemo.databinding.CategoryRowItemBinding;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private int[] categoryImages;
    private String[] names;

    public CategoryAdapter(int[] categoryImages, String[] names) {
        this.categoryImages = categoryImages;
        this.names = names;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CategoryRowItemBinding binding = CategoryRowItemBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.binding.ivCategory.setImageResource(categoryImages[position]);
        holder.binding.tvFruitName.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return categoryImages.length;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        CategoryRowItemBinding binding;

        public CategoryViewHolder(CategoryRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
