package com.example.testingfragment.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testingfragment.R;

import Fragments.TestFragment;
import Models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container); // first find the fragment defined inside the activities xml
        if (fragment == null) {
            fragment = new TestFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }





    }









}
