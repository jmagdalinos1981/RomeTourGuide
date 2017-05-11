package com.example.android.rometourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuidedToursFragment extends Fragment {

    public GuidedToursFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of Sights
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

        // Populate item list
        tourItems.add(new TourItem(R.drawable.tour_colosseum, getResources().getString(R.string
                .tour_colosseum), getResources().getString(R.string.phone_number_tour_colosseum),
                3, getResources().getString(R
                .string.address_tour_colosseum), getResources().getString(R.string.subtext_tour_colosseum) ,
                getResources().getString(R.string.price_range_tour_colosseum), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_vatican_city, getResources().getString(R.string
                .vatican_museums), getResources().getString(R.string.phone_number_tour_vatican_city),
                8, getResources().getString(R
                .string.address_vatican_museums), getResources().getString(R.string.subtext_vatican_museums) ,
                getResources().getString(R.string.price_range_vatican_museums), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_galleria_borghese, getResources().getString(R.string
                .tour_villa_borghese), getResources().getString(R.string.phone_number_tour_villa_borghese),
                3, getResources().getString(R
                .string.address_tour_villa_borghese), getResources().getString(R.string.subtext_tour_villa_borghese) ,
                getResources().getString(R.string.price_range_tour_villa_borghese), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_wine_tasting, getResources().getString(R.string
                .tour_wine_tasting), getResources().getString(R.string.phone_number_tour_wine_tasting),
                4, getResources().getString(R
                .string.address_tour_wine_tasting), getResources().getString(R.string.subtext_tour_wine_tasting) ,
                getResources().getString(R.string.price_range_tour_wine_tasting), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_walking, getResources().getString(R.string
                .tour_walking_tour), getResources().getString(R.string.phone_number_tour_walking_tour),
                3, getResources().getString(R
                .string.address_tour_walking_tour), getResources().getString(R.string.subtext_tour_walking_tour) ,
                getResources().getString(R.string.price_range_tour_walking_tour), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_night, getResources().getString(R.string
                .tour_rome_by_night), getResources().getString(R.string.phone_number_tour_rome_by_night),
                2, getResources().getString(R
                .string.address_tour_rome_by_night), getResources().getString(R.string.subtext_tour_rome_by_night) ,
                getResources().getString(R.string.price_range_tour_rome_by_night), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_forum, getResources().getString(R.string
                .tour_forum), getResources().getString(R.string.phone_number_tour_forum),
                4, getResources().getString(R
                .string.address_tour_forum), getResources().getString(R.string.subtext_tour_forum) ,
                getResources().getString(R.string.price_range_tour_forum), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_countryside, getResources().getString(R.string
                .tour_countryside), getResources().getString(R.string.phone_number_tour_countryside),
                10, getResources().getString(R
                .string.address_tour_countryside), getResources().getString(R.string.subtext_tour_colosseum) ,
                getResources().getString(R.string.price_range_tour_countryside), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.tour_museums, getResources().getString(R.string
                .tour_museums), getResources().getString(R.string.phone_number_tour_museums),
                2, getResources().getString(R
                .string.address_tour_museums), getResources().getString(R.string.subtext_tour_museums) ,
                getResources().getString(R.string.price_range_tour_museums), getResources().getString(R.string.unit_days)));
        tourItems.add(new TourItem(R.drawable.tour_crypts, getResources().getString(R.string
                .tour_crypts), getResources().getString(R.string.phone_number_tour_crypts),
                4, getResources().getString(R
                .string.address_tour_crypts), getResources().getString(R.string.subtext_tour_crypts) ,
                getResources().getString(R.string.price_range_tour_crypts), getResources().getString(R.string.unit_hours)));

        // Create an {@link CustomItemAdapter}, whose data source is a list of {@link TourItem}s.
        // The adapter knows how to create list items for each item in the list.
        CustomItemAdapter adapter = new CustomItemAdapter(getActivity(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TourItem} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
