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
public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.list_view, container, false );

        // Create an ArrayList of museum objects
        ArrayList<Location> museums = new ArrayList<Location> ();

        museums.add ( new Location ( R.drawable.lusaka, getString ( R.string.museums_lusaka ), getString ( R.string.description_lusaka ) ) );
        museums.add ( new Location ( R.drawable.namwane, getString ( R.string.museums_namwande ), getString ( R.string.description_namwande ) ) );
        museums.add ( new Location ( R.drawable.thirtysevend, getString ( R.string.museums_thirty_seven ), getString ( R.string.description_thirty_seven ) ) );
        museums.add ( new Location ( R.drawable.henrytayali, getString ( R.string.museums_henry_tayali ), getString ( R.string.description_henry_tayali ) ) );
        museums.add ( new Location ( R.drawable.modzi, getString ( R.string.museums_modzi ), getString ( R.string.description_modzi ) ) );
        museums.add ( new Location ( R.drawable.chilenje, getString ( R.string.museums_chilenje ), getString ( R.string.description_chilenje ) ) );
        museums.add ( new Location ( R.drawable.freedom, getString ( R.string.museums_freedom ), getString ( R.string.description_freedom ) ) );
        museums.add ( new Location ( R.drawable.embassy, getString ( R.string.museums_embassy ), getString ( R.string.description_embassy ) ) );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        LocationAdapter adapter = new LocationAdapter ( getActivity (), museums );

        // Create an {@link LocationAdapter}, whose data source is a list of {@link museum}s. The
        // adapter knows how to create list items for each item in the list.
        final ListView listView = (ListView) rootView.findViewById ( R.id.listview );

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link museums} in the list.
        listView.setAdapter ( adapter );

        return rootView;
    }
}
