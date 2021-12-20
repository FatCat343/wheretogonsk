package com.example.wheretogo.model.marker;

import androidx.annotation.NonNull;

import com.example.wheretogo.model.place.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class ClusterMarker implements ClusterItem {

    private LatLng position;
    private String title;
    private String snippet;
    private int iconPicture;
    private String iconThumbnail;
    private Place place;

    public ClusterMarker(LatLng position,
                         String title,
                         String snippet,
                         int iconPicture,
                         Place place) {
        this.position = position;
        this.title = title;
        this.snippet = snippet;
        this.iconPicture = iconPicture;
        this.iconThumbnail = place.getThumbnail();
        this.place = place;
    }

    public ClusterMarker() {}

    @NonNull
    @Override
    public LatLng getPosition() {
        return position;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSnippet() {
        return snippet;
    }

    public Place getPlace() {
        return place;
    }

    public int getIconPicture() {
        return iconPicture;
    }

    public String getIconThumbnail() {
        return iconThumbnail;
    }
}
