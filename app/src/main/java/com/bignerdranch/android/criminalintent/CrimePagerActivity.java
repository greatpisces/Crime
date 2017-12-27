package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */

public class CrimePagerActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private List<Crime> mCrimes;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_pager);

        mViewPager = (ViewPager)findViewById(R.id.activity_crime_pager_view_pager);

        mCrimes = CrimeLab.get(this).getCrimes();
    }
}
