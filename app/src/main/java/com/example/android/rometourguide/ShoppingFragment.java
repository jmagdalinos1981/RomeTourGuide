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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
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
        tourItems.add(new TourItem(R.drawable.shopping_piazza_di_spagna, getResources().getString(R.string
                .shopping_piazza_di_spagna), getResources().getString(R.string
                .address_shopping_piazza_di_spagna), getResources().getString(R
                .string.subtext_shopping_piazza_di_spagna),
                getResources().getString(R.string.price_range_shopping_piazza_di_spagna)));
        tourItems.add(new TourItem(R.drawable.shopping_via_condotti, getResources().getString(R.string
                .shopping_via_condotti),  getResources().getString(R.string.address_shopping_via_condotti),
                getResources().getString(R.string.subtext_shopping_via_condotti), getResources().getString(R.string
                .price_range_shopping_via_condotti)));
        tourItems.add(new TourItem(R.drawable.shopping_via_del_babuino, getResources().getString(R.string
                .shopping_via_del_babuino),  getResources().getString(R.string.address_shopping_via_del_babuino), getResources
                ().getString(R
                .string.subtext_shopping_via_del_babuino), getResources().getString(R.string
                .price_range_shopping_via_del_babuino)));
        tourItems.add(new TourItem(R.drawable.shopping_mcarthur, getResources().getString(R.string
                .shopping_mcarthur),  getResources().getString(R.string.address_shopping_mcarthur), getResources()
                .getString(R
                .string.subtext_shopping_mcarthur), getResources().getString(R.string.price_range_shopping_mcarthur)));
        tourItems.add(new TourItem(R.drawable.shopping_via_del_corso, getResources().getString(R.string
                .shopping_via_del_corso),  getResources().getString(R.string.address_shopping_via_del_corso), getResources()
                .getString(R.string.subtext_shopping_via_del_corso), getResources().getString(R.string
                .price_range_shopping_via_del_corso)));
        tourItems.add(new TourItem(R.drawable.shopping_via_cola_di_rienzo, getResources().getString(R.string
                .shopping_via_cola_di_rienzo),  getResources().getString(R.string.address_shopping_via_cola_di_rienzo),
                getResources().getString(R.string.subtext_shopping_via_cola_di_rienzo), getResources().getString(R.string
                .price_range_shopping_via_cola_di_rienzo)));
        tourItems.add(new TourItem(R.drawable.shopping_valmontone, getResources().getString(R.string
                .shopping_valmontone),  getResources().getString(R.string.address_shopping_valmontone),
                getResources()
                .getString(R
                .string.subtext_shopping_valmontone), getResources().getString(R.string
                .price_range_shopping_valmontone)));
        tourItems.add(new TourItem(R.drawable.shopping_via_nazionale, getResources().getString(R.string
                .shopping_via_nazionale),  getResources().getString(R.string.address_shopping_via_nazionale), getResources
                ().getString(R
                .string.subtext_shopping_via_nazionale), getResources().getString(R.string
                .price_range_shopping_via_nazionale)));
        tourItems.add(new TourItem(R.drawable.shopping_porta_portese, getResources().getString(R.string
                .shopping_porta_portese),  getResources().getString(R.string.address_shopping_porta_portese),
                getResources()
                .getString(R
                .string.subtext_shopping_porta_portese), getResources().getString(R.string
                .price_range_shopping_porta_portese)));
        tourItems.add(new TourItem(R.drawable.shopping_eurroma2, getResources().getString(R.string
                .shopping_eurroma2),  getResources().getString(R.string.address_shopping_eurroma2), getResources()
                .getString(R
                .string.subtext_shopping_eurroma2), getResources().getString(R.string.price_range_shopping_eurroma2)));

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
