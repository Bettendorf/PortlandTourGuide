package com.example.android.portlandtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideLocationAdapter extends ArrayAdapter<GuideLocation> {

    private ArrayList<GuideLocation> mGuideLocationsList;

    public GuideLocationAdapter(Context context, ArrayList<GuideLocation> locations) {
        super(context, 0, locations);
        mGuideLocationsList = locations;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        GuideLocation guideLocation = getItem(position);

        TextView locationName = listItemView.findViewById(R.id.location_name);
        locationName.setText(guideLocation.getName());

        TextView locationAddress = listItemView.findViewById(R.id.location_address);
        locationAddress.setText(guideLocation.getAddress());

        LinearLayout imageContainer = listItemView.findViewById(R.id.image_container);
        if (guideLocation.hasImage()) {
            ImageView locationImage = listItemView.findViewById(R.id.image);
            locationImage.setImageResource(guideLocation.getImageResourceId());
            imageContainer.setVisibility(View.VISIBLE);
        } else {
            imageContainer.setVisibility(View.GONE);
        }

        return listItemView;
    }
}