package com.example.android.rometourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link TourItem} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightseeingFragment();
        }
        else if (position == 1) {
            return new RestaurantsFragment();
        }
        else if (position == 2) {
            return new GuidedToursFragment();
        }
        else {
            return new ShoppingFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sightseeing);
        }
        else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        }
        else if (position == 2) {
            return mContext.getString(R.string.category_tours);
        }
        else {
            return mContext.getString(R.string.category_shopping);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
