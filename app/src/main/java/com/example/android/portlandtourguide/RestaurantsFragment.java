package com.example.android.portlandtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Restaurants".
 */
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<GuideLocation> guideLocationsList = new ArrayList<>();
        guideLocationsList.add(new GuideLocation(getString(R.string.restaurant_1_name), getString(R.string.restaurant_1_address), getString(R.string.restaurant_1_description), R.drawable.brix));
        guideLocationsList.add(new GuideLocation(getString(R.string.restaurant_2_name), getString(R.string.restaurant_2_address), getString(R.string.restaurant_2_description), R.drawable.portland_art_museum));

        GuideLocationAdapter itemsAdapter = new GuideLocationAdapter(getContext(), guideLocationsList);

        ListView listView = rootView.findViewById(R.id.locations_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}