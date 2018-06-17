package com.example.android.lusakatourguide;

/**
 * {@link Location} represents a single location from a list of locations.
 * Each album object has 3 properties: image, name and description.
 */
public class Location {

    /**
     * Image resource ID for the location
     */
    private int mLocationImageResourceId;

    // Name of the Location (e.g. Rhapsody's, Zambian Coffee, Mint Lounge)
    private String mLocationName;

    // Description of the Location (e.g.Open air Savannah Grill & Restaurant,Specialises in steaks and seafood )
    private String mLocationDescription;

    /*
    * Create a new Location object.
    *
    * @param locationImageResourceId is the resource Id for location image (e.g.+ R.drawable.intercontinental)
    * @param locationName is the name of the Location (e.g. Rhapsody's)
    * @param locationDescription is the description of the location (e.g. Open air Savannah Grill )
    * */
    public Location(int locationImageResourceId, String locationName, String locationDescription) {
        mLocationImageResourceId = locationImageResourceId;
        mLocationName = locationName;
        mLocationDescription = locationDescription;
    }

    /**
     * Get the image Resource Id of the Location
     */
    public int getLocationImageResourceId() {
        return mLocationImageResourceId;
    }

    /**
     * Get the name of the Location
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the description of the Location
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }
}
