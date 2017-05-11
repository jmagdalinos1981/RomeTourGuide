package com.example.android.rometourguide;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link CustomItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link TourItem} objects.
 */

public class CustomItemAdapter extends ArrayAdapter<TourItem>{

    /**
     * Create a new {@link CustomItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tourItems is the list of {@link TourItem}s to be displayed.
     */
    public CustomItemAdapter(Context context, ArrayList<TourItem> tourItems) {
        super(context, 0, tourItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View tourItemView = convertView;
        if (tourItemView == null) {
            tourItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_item, parent, false);
        }

        // Get the {@link TourItem} object located at this position in the list
        TourItem currentTourItem = getItem(position);

        // Find the TextView in the tour_item.xml layout with the ID title.
        TextView titleTextView = (TextView) tourItemView.findViewById(R.id.title);
        // Get the Title from the currentTourItem object and set this text on
        // the Title TextView.
        titleTextView.setText(currentTourItem.getmTitle());

        // Find the TextView in the tour_item.xml layout with the ID address.
        TextView addressTextView = (TextView) tourItemView.findViewById(R.id.address);
        // Get the Address from the currentTourItem object and set this text on
        // the Address TextView.
        Log.v("CustomItemAdapter", "Address: " + currentTourItem.getmAddress());
        addressTextView.setText(currentTourItem.getmAddress());

        // Find the TextView in the tour_item.xml layout with the ID phone_number.
        TextView phoneNumberTextView = (TextView) tourItemView.findViewById(R.id.phone_number);
        // Find the ImageView in the tour_item.xml layout with the ID phone_icon.
        ImageView phoneIconImageView = (ImageView) tourItemView.findViewById(R.id.phone_icon);
        // Check if a phone number is provided for this item or not
        if (currentTourItem.hasPhoneNumber()) {
            // If a phone number is available, get the Phone Number from the currentTourItem object
            // and set this text on the Phone Number TextView.
            phoneNumberTextView.setText(currentTourItem.getmPhoneNumber());
            // Make sure the view is visible
            phoneNumberTextView.setVisibility(View.VISIBLE);
            phoneIconImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            phoneNumberTextView.setVisibility(View.GONE);
            phoneIconImageView.setVisibility(View.GONE);
        }

        // Find the TextView in the tour_item.xml layout with the ID duration.
        TextView durationTextView = (TextView) tourItemView.findViewById(R.id.duration);
        // Find the TextView in the tour_item.xml layout with the ID duration_unit.
        TextView durationUnitTextView = (TextView) tourItemView.findViewById(R.id.duration_unit);
        // Find the ImageView in the tour_item.xml layout with the ID duration_icon.
        ImageView durationIconImageView = (ImageView) tourItemView.findViewById(R.id.duration_icon);
        // Check if a duration is provided for this item or not
        if (currentTourItem.hasDuration()) {
            // If a duration is available, get the Duration from the currentTourItem object and
            // set this text on Duration TextView.
            durationTextView.setText(currentTourItem.getmDuration());
            durationUnitTextView.setText(currentTourItem.isHours());
            // Make sure the view is visible
            durationTextView.setVisibility(View.VISIBLE);
            durationUnitTextView.setVisibility(View.VISIBLE);
            durationIconImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            durationTextView.setVisibility(View.GONE);
            durationUnitTextView.setVisibility(View.GONE);
            durationIconImageView.setVisibility(View.GONE);
        }

        // Find the TextView in the tour_item.xml layout with the ID subtext.
        TextView subtextTextView = (TextView) tourItemView.findViewById(R.id.subtext);
        // Get the Subtext from the currentTourItem object and set this text on
        // the Subtext TextView.
        subtextTextView.setText(currentTourItem.getmSubtext());

        // Find the TextView in the tour_item.xml layout with the ID price_range.
        TextView priceRangeTextView = (TextView) tourItemView.findViewById(R.id.price_range);
        // Get the Price Range from the currentWord object and set this text on
        // the Price Range TextView.
        priceRangeTextView.setText(currentTourItem.getmPriceRange());

        // Find the ImageView in the tour_item.xml layout with the ID image.
        ImageView imageView = (ImageView) tourItemView.findViewById(R.id.image);
        // Get the Image from the currentTourItem object and set this text on
        // the Image ImageView.
        imageView.setImageResource(currentTourItem.getmImageResourceID());
        return tourItemView;
    }
}
