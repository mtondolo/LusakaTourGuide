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
public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.list_view, container, false );

        // Create an ArrayList of nature objects
        ArrayList<Location> nature = new ArrayList<Location> ();

        nature.add ( new Location ( R.drawable.chaminuka, getString ( R.string.nature_chaminuka ), getString ( R.string.descriptione_chaminuka ) ) );
        nature.add ( new Location ( R.drawable.lowerzambezi, getString ( R.string.nature_zambezi ), getString ( R.string.description_zambezi ) ) );
        nature.add ( new Location ( R.drawable.kalimba, getString ( R.string.nature_kalimba ), getString ( R.string.description_kalimba ) ) );
        nature.add ( new Location ( R.drawable.mundawanga, getString ( R.string.nature_mundawanga ), getString ( R.string.description_mundawanga ) ) );
        nature.add ( new Location ( R.drawable.lusakapark, getString ( R.string.nature_lusaka ), getString ( R.string.description_lusakanature ) ) );
        nature.add ( new Location ( R.drawable.parays, getString ( R.string.nature_parays ), getString ( R.string.description_parays ) ) );
        nature.add ( new Location ( R.drawable.lilayi, getString ( R.string.nature_lilayi ), getString ( R.string.description_lilayi ) ) );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        LocationAdapter adapter = new LocationAdapter ( getActivity (), nature );

        // Create an {@link LocationAdapter}, whose data source is a list of {@link nature}s. The
        // adapter knows how to create list items for each item in the list.
        final ListView listView = (ListView) rootView.findViewById ( R.id.listview );

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link nature} in the list.
        listView.setAdapter ( adapter );

        return rootView;
    }
}
