package com.example.android.portlandtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Parks".
 */
public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<GuideLocation> guideLocationsList = new ArrayList<>();
        guideLocationsList.add(new GuideLocation(getString(R.string.park_1_name), getString(R.string.park_1_address), getString(R.string.park_1_description), R.drawable.forest_park));
        guideLocationsList.add(new GuideLocation(getString(R.string.park_2_name), getString(R.string.park_2_address), getString(R.string.park_2_description), R.drawable.laurelhurst_park));

        GuideLocationAdapter itemsAdapter = new GuideLocationAdapter(getContext(), guideLocationsList);

        ListView listView = rootView.findViewById(R.id.locations_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}