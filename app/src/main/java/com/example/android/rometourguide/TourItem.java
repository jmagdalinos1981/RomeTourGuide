package com.example.android.rometourguide;

/**
 * {@link TourItem} represents an item which will be shown in the tour_list layout.
 * It contains an image, a title, a phone number, an address, a duration, a subtext and a price
 * range.
 */

public class TourItem {

    /** Image resource ID for the item (all categories) */
    private int mImageResourceID;

    /** Title of the item (all categories) */
    private String mTitle;

    /** Phone number for the item (restaurants) */
    private String mPhoneNumber;

    /** Address for the item (all categories) */
    private String mAddress;

    /** Duration for the item (guided tours) */
    private int mDuration;

    /** Subtext with a few words about each item (all categories) */
    private String mSubtext;

    /** Price range for the item (restaurants, guided tours) */
    private String mPriceRange;

    /**
     * Create a new TourItem object for Restaurants
     *
     * @param imageResourceID is the resource ID for the image to be used
     * @param title is the item name
     * @param phoneNumber is the phone number of the locale
     * @param duration is the length of the tour in hours
     * @param address is the address of the sight/locale
     * @param subtext is the text accompanying the item
     * @param priceRange is the price range in $ - $$$$
     */

    public TourItem(int imageResourceID, String title, String phoneNumber, int duration,
                    String address, String subtext, String priceRange){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mPhoneNumber = phoneNumber;
        mDuration = duration;
        mAddress = address;
        mSubtext = subtext;
        mPriceRange = priceRange;
    }

    /** Methods for getting all the aforementioned variables */
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmDuration() {
        String duration = String.valueOf(mDuration);
        return duration;
    }

    public String getmSubtext() {
        return mSubtext;
    }

    public String getmPriceRange() {
        return mPriceRange;
    }

}
