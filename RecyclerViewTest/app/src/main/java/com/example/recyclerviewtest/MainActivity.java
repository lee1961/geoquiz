package com.example.recyclerviewtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtest.Fragment.RecycleFragment;
import com.example.recyclerviewtest.Item.Item;

import java.util.ArrayList;

import static android.support.v7.recyclerview.R.attr.layoutManager;

public class MainActivity extends AppCompatActivity {

    private ItemAdapter mItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new RecycleFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }

//        ArrayList<Item> ar = new ArrayList<Item>();
//        for(int i = 0 ; i < 100 ; i++) {
//            ar.add(new Item("victor + "  + Integer.toString(i) ));
//        }
//
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewItem);
//
//        mItemAdapter = new ItemAdapter(ar);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//
//        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(),
//              layoutManager.getOrientation()));
//
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(mItemAdapter);





    }
}
