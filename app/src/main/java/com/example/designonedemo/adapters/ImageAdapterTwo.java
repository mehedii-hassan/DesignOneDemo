package com.example.designonedemo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designonedemo.R;
import com.example.designonedemo.databinding.RowDesignTwoBinding;

public class ImageAdapterTwo extends RecyclerView.Adapter<ImageAdapterTwo.MyViewHolder> {

    private int[] images;
    private String[] titles;
    private String[] descriptions;

    public ImageAdapterTwo(int[] images, String[] titles, String[] descriptions) {
        this.images = images;
        this.titles = titles;
        this.descriptions = descriptions;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowDesignTwoBinding binding = RowDesignTwoBinding
                .inflate(LayoutInflater
                        .from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.ivRowTwo.setImageResource(images[position]);
        holder.binding.tvTitle.setText(titles[position]);
        holder.binding.tvDesc.setText(descriptions[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.categoryFragment);
            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private RowDesignTwoBinding binding;

        public MyViewHolder(RowDesignTwoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
