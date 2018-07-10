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

    /** Context of the app */
    private Context mContext;

    public TourGuidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_sports_venues);
        } else {
            return mContext.getString(R.string.category_famous_locations);
        }
    }
}