package com.example.bay.ongisschool6;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by BAY on 6/2/2016.
 */
public class NamaAdapter extends ArrayAdapter<String> {

    public NamaAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }
}
