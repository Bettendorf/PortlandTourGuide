package com.example.android.portlandtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Museums".
 */
public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<GuideLocation> guideLocationsList = new ArrayList<>();
        guideLocationsList.add(new GuideLocation(getString(R.string.museum_1_name), getString(R.string.museum_1_address), getString(R.string.museum_1_description)));
        guideLocationsList.add(new GuideLocation(getString(R.string.museum_2_name), getString(R.string.museum_2_address), getString(R.string.museum_2_description)));

        GuideLocationAdapter itemsAdapter = new GuideLocationAdapter(getContext(), guideLocationsList);

        ListView listView = rootView.findViewById(R.id.locations_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}