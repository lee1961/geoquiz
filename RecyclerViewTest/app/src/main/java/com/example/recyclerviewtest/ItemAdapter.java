package com.example.recyclerviewtest;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerviewtest.Item.Item;

import java.util.List;

/**
 * Created by victorlee95 on 6/19/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<Item> mItemList;

    // this defines all the elements u are gonna put inside
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView row_view;
        public MyViewHolder(View view) {
            super(view);
            row_view = (TextView) view.findViewById(R.id.row_item);
        }



    }

    public ItemAdapter(List<Item> itemlist) {
        this.mItemList = itemlist;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = mItemList.get(position);
        holder.row_view.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
