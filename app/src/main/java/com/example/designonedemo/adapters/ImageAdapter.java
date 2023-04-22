package com.example.designonedemo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designonedemo.databinding.RowDesignOneBinding;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {


    private int[] images;
    private String[] names;

    public ImageAdapter(int[] images, String[] names) {
        this.images = images;
        this.names = names;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowDesignOneBinding binding = RowDesignOneBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ImageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {

        holder.binding.ivRowItem.setImageResource(images[position]);
        holder.binding.tvImageName.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {
        private RowDesignOneBinding binding;

        public ImageViewHolder(RowDesignOneBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
