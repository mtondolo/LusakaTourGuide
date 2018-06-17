package com.example.android.lusakatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName ();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param locations A List of location objects to display in a list
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two views , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super ( context, 0, locations );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem ( position );

        // Find the TextView in the list_item.xml layout with the ID image_view
        ImageView locationImageView = (ImageView) listItemView.findViewById ( R.id.location_image_view );

        // Get the image  ID from the current Location object and
        // set this image ID on the  location Image TextView
        locationImageView.setImageResource ( currentLocation.getLocationImageResourceId () );

        // Find the TextView in the list_item.xml layout with the ID location_name
        TextView locationNameTextView = (TextView) listItemView.findViewById ( R.id.location_name_text_view );

        // Get the location name from the current Location object and
        // set this text on the location name TextView
        locationNameTextView.setText ( currentLocation.getLocationName () );

        // Find the TextView in the list_item.xml layout with the ID location_description
        TextView locationDescriptionTextView = (TextView) listItemView.findViewById ( R.id.description_text_view );

        // Get the location description from the current Location object and
        // set this text on the location description TextView
        locationDescriptionTextView.setText ( currentLocation.getLocationDescription () );

        // Return the whole list item layout (containing 1 image view and 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
