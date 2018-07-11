package com.example.android.portlandtourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private String[] TabNames = new String[] {"Restaurants", "Museums", "Sports Venues", "Famous Locations"};

    public TourGuidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1){
            return new MuseumsFragment();
        } else if (position == 2){
            return new SportsVenuesFragment();
        } else {
            return new FamousLocationsFragment();
        }
    }

    /**
    * Return the number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TabNames[position];
    }
}