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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
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
        tourItems.add(new TourItem(R.drawable.birra_sale, getResources().getString(R.string
                .birra_e_sale), getResources().getString(R.string.phone_number_birra_e_sale), getResources().getString(R
                .string.address_birra_e_sale), getResources().getString(R.string.subtext_birra_e_sale) ,
                getResources().getString(R.string.price_range_birra_e_sale)));
        tourItems.add(new TourItem(R.drawable.porta_del_principe, getResources().getString(R.string
                .la_porta_del_principe), getResources().getString(R.string.phone_number_la_porta_del_principe),
                getResources().getString(R
                .string.address_la_porta_del_principe), getResources().getString(R.string.subtext_la_porta_del_principe) ,
                getResources().getString(R.string.price_range_la_porta_del_principe)));
        tourItems.add(new TourItem(R.drawable.panino_divino, getResources().getString(R.string
                .panino_divino), getResources().getString(R.string.phone_number_panino_divino), getResources()
                .getString(R
                .string.address_panino_divino), getResources().getString(R.string.subtext_panino_divino) ,
                getResources().getString(R.string.price_range_panino_divino)));
        tourItems.add(new TourItem(R.drawable.pane_e_salame, getResources().getString(R.string
                .pane_e_salame), getResources().getString(R.string.phone_number_pane_e_salame), getResources()
                .getString(R
                .string.address_pane_e_salame), getResources().getString(R.string.subtext_pane_e_salame) ,
                getResources().getString(R.string.price_range_pane_e_salame)));
        tourItems.add(new TourItem(R.drawable.buone_maniere, getResources().getString(R.string
                .buone_maniere), getResources().getString(R.string.phone_number_buone_maniere), getResources()
                .getString(R
                .string.address_buone_maniere), getResources().getString(R.string.subtext_buone_maniere) ,
                getResources().getString(R.string.price_range_buone_maniere)));
        tourItems.add(new TourItem(R.drawable.i_fratelli, getResources().getString(R.string
                .i_frattelli), getResources().getString(R.string.phone_number_i_frattelli), getResources()
                .getString(R
                .string.address_i_frattelli), getResources().getString(R.string.subtext_i_frattelli) ,
                getResources().getString(R.string.price_range_i_frattelli)));
        tourItems.add(new TourItem(R.drawable.sapori_e_delizie, getResources().getString(R.string
                .sapori_e_delizie), getResources().getString(R.string.phone_number_sapori_e_delizie), getResources()
                .getString(R
                .string.address_sapori_e_delizie), getResources().getString(R.string.subtext_sapori_e_delizie) ,
                getResources().getString(R.string.price_range_sapori_e_delizie)));
        tourItems.add(new TourItem(R.drawable.pergola, getResources().getString(R.string
                .la_pergola), getResources().getString(R.string.phone_number_la_pergola), getResources()
                .getString(R
                .string.address_la_pergola), getResources().getString(R.string.subtext_la_pergola) ,
                getResources().getString(R.string.price_range_la_pergola)));
        tourItems.add(new TourItem(R.drawable.ad_hoc, getResources().getString(R.string
                .ad_hoc), getResources().getString(R.string.phone_number_ad_hoc), getResources()
                .getString(R
                .string.address_ad_hoc), getResources().getString(R.string.subtext_ad_hoc) ,
                getResources().getString(R.string.price_range_ad_hoc)));
        tourItems.add(new TourItem(R.drawable.maestrale, getResources().getString(R.string
                .maestrale), getResources().getString(R.string.phone_number_maestrale), getResources()
                .getString(R
                .string.address_maestrale), getResources().getString(R.string.subtext_maestrale) ,
                getResources().getString(R.string.price_range_maestrale)));

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
