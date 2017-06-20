package com.example.recyclerviewtest.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.recyclerviewtest.Item.Item;
import com.example.recyclerviewtest.ItemAdapter;
import com.example.recyclerviewtest.R;

import java.util.ArrayList;

/**
 * Created by victorlee95 on 6/19/2017.
 */

public class RecycleFragment extends Fragment {

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }
    private ItemAdapter mItemAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycle,container,false);

        ArrayList<Item> ar = new ArrayList<Item>();
        for(int i = 0 ; i < 100 ; i++) {
            ar.add(new Item("victor + "  + Integer.toString(i) ));
        }

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycleListFragment);
        mItemAdapter = new ItemAdapter(ar);
        recyclerView.setAdapter(mItemAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setClickable(true);
//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(),"yes u clicked",Toast.LENGTH_SHORT);
//            }
//        });


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation()));

        return v;
    }

}
