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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.list_view, container, false );

        // Create an ArrayList of shopping objects
        ArrayList<Location> shopping = new ArrayList<Location> ();
        shopping.add ( new Location ( R.drawable.mandahill, getString ( R.string.shopping_mandahill ), getString ( R.string.description_mandahill ) ) );
        shopping.add ( new Location ( R.drawable.sundaycrafts, getString ( R.string.shopping_crafts ), getString ( R.string.description_crafts ) ) );
        shopping.add ( new Location ( R.drawable.arcades, getString ( R.string.shopping_arcades ), getString ( R.string.description_arcades ) ) );
        shopping.add ( new Location ( R.drawable.kabwata, getString ( R.string.shopping_kabwata ), getString ( R.string.description_kabwata ) ) );
        shopping.add ( new Location ( R.drawable.eastpark, getString ( R.string.shopping_eastpark ), getString ( R.string.description_eastpark ) ) );
        shopping.add ( new Location ( R.drawable.jackal, getString ( R.string.shopping_jackal ), getString ( R.string.description_jackal ) ) );
        shopping.add ( new Location ( R.drawable.pakati, getString ( R.string.shopping_pakati ), getString ( R.string.description_pakati ) ) );
        shopping.add ( new Location ( R.drawable.soweto, getString ( R.string.shopping_soweto ), getString ( R.string.description_soweto ) ) );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        LocationAdapter adapter = new LocationAdapter ( getActivity (), shopping );

        // Create an {@link LocationAdapter}, whose data source is a list of {@link shopping}s. The
        // adapter knows how to create list items for each item in the list.
        final ListView listView = (ListView) rootView.findViewById ( R.id.listview );

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link shopping} in the list.
        listView.setAdapter ( adapter );

        return rootView;
    }
}
