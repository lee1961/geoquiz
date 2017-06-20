package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by victorlee95 on 6/18/2017.
 */

public class CrimeListActivity extends  SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }



}
