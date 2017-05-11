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
public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
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
        tourItems.add(new TourItem(R.drawable.colosseum, getResources().getString(R.string
                .colosseum), getResources().getString(R.string
                .address_colosseum), getResources().getString(R
                .string.subtext_colosseum), getResources().getString(R.string.price_range_colosseum)));
        tourItems.add(new TourItem(R.drawable.pantheon, getResources().getString(R.string
                .pantheon),  getResources().getString(R.string.address_pantheon), getResources().getString(R
                .string.subtext_pantheon), getResources().getString(R.string
                .price_range_pantheon)));
        tourItems.add(new TourItem(R.drawable.st_peter, getResources().getString(R.string
                .st_peter_basilica),  getResources().getString(R.string.address_st_peter_basilica), getResources().getString(R
                .string.subtext_st_peter_basilica), getResources().getString(R.string.price_range_st_peter_basilica)));
        tourItems.add(new TourItem(R.drawable.fontana_di_trevi, getResources().getString(R.string
                .fontana_di_trevi),  getResources().getString(R.string.address_fontana_di_trevi), getResources().getString(R
                .string.subtext_fontana_di_trevi), getResources().getString(R.string.price_range_fontana_di_trevi)));
        tourItems.add(new TourItem(R.drawable.forum, getResources().getString(R.string
                .forum),  getResources().getString(R.string.address_forum), getResources().getString(R
                .string.subtext_forum), getResources().getString(R.string.price_range_forum)));
        tourItems.add(new TourItem(R.drawable.piazza_di_spagna, getResources().getString(R.string
                .piazza_di_spagna),  getResources().getString(R.string.address_piazza_di_spagna), getResources().getString(R
                .string.subtext_piazza_di_spagna), getResources().getString(R.string.price_range_piazza_di_spagna)));
        tourItems.add(new TourItem(R.drawable.piazza_navona, getResources().getString(R.string
                .piazza_navona),  getResources().getString(R.string.address_piazza_navona), getResources().getString(R
                .string.subtext_piazza_navona), getResources().getString(R.string.price_range_piazza_navona)));
        tourItems.add(new TourItem(R.drawable.galleria_borghese, getResources().getString(R.string
                .galleria_borghese),  getResources().getString(R.string.address_galleria_borghese), getResources().getString(R
                .string.subtext_galleria_borghese), getResources().getString(R.string.price_range_galleria_borghese)));
        tourItems.add(new TourItem(R.drawable.vatican_museums, getResources().getString(R.string
                .vatican_museums),  getResources().getString(R.string.address_vatican_museums), getResources().getString(R
                .string.subtext_vatican_museums), getResources().getString(R.string.price_range_vatican_museums)));
        tourItems.add(new TourItem(R.drawable.piazza_venezia, getResources().getString(R.string
                .piazza_venezia),  getResources().getString(R.string.address_piazza_venezia), getResources().getString(R
                .string.subtext_piazza_venezia), getResources().getString(R.string.price_range_piazza_venezia)));

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
