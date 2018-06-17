package com.example.android.lusakatourguide;

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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.list_view, container, false );

        // Create an ArrayList of restaurant objects
        ArrayList<Location> restaurant = new ArrayList<Location> ();
        restaurant.add ( new Location ( R.drawable.intercontinental, getString ( R.string.restaurant_intercontinental ), getString ( R.string.description_intercontinental ) ) );
        restaurant.add ( new Location ( R.drawable.chicagos, getString ( R.string.restaurant_chicago ), getString ( R.string.description_chicago ) ) );
        restaurant.add ( new Location ( R.drawable.marlins, getString ( R.string.restaurant_marlins ), getString ( R.string.description_marlins ) ) );
        restaurant.add ( new Location ( R.drawable.cattlemans, getString ( R.string.restaurant_cattleman ), getString ( R.string.description_cattleman ) ) );
        restaurant.add ( new Location ( R.drawable.zambiancoffee, getString ( R.string.restaurant_zambia_coffee ), getString ( R.string.description_zambia_coffee ) ) );
        restaurant.add ( new Location ( R.drawable.rhapsodys, getString ( R.string.restaurant_rhapsody ), getString ( R.string.description_rhapsody ) ) );
        restaurant.add ( new Location ( R.drawable.fourseasons, getString ( R.string.restaurant_four_seasons ), getString ( R.string.description_four_seasons ) ) );
        restaurant.add ( new Location ( R.drawable.eviva, getString ( R.string.restaurant_eviva ), getString ( R.string.description_eviva ) ) );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        LocationAdapter adapter = new LocationAdapter ( getActivity (), restaurant );

        // Create an {@link LocationAdapter}, whose data source is a list of {@link restaurant}s. The
        // adapter knows how to create list items for each item in the list.
        final ListView listView = (ListView) rootView.findViewById ( R.id.listview );

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link restaurants} in the list.
        listView.setAdapter ( adapter );

        return rootView;
    }
}


