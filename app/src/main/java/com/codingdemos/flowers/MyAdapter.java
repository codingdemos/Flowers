package com.codingdemos.flowers;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abdalla on 1/12/18.
 */

public class MyAdapter extends RecyclerView.Adapter<FlowerViewHolder> {

    private Context mContext;
    private List<FlowerData> mFlowerList;

    MyAdapter(Context mContext, List<FlowerData> mFlowerList) {
        this.mContext = mContext;
        this.mFlowerList = mFlowerList;
    }

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row_item, parent, false);
        return new FlowerViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final FlowerViewHolder holder, int position) {
        holder.mImage.setImageResource(mFlowerList.get(position).getFlowerImage());
        holder.mTitle.setText(mFlowerList.get(position).getFlowerName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Title", mFlowerList.get(holder.getAdapterPosition()).getFlowerName());
                mIntent.putExtra("Description", mFlowerList.get(holder.getAdapterPosition()).getFlowerDescription());
                mIntent.putExtra("Image", mFlowerList.get(holder.getAdapterPosition()).getFlowerImage());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mFlowerList.size();
    }
}

class FlowerViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    CardView mCardView;

    FlowerViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}
