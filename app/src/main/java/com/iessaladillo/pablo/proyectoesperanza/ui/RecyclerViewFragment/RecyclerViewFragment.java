package com.iessaladillo.pablo.proyectoesperanza.ui.RecyclerViewFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iessaladillo.pablo.proyectoesperanza.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {


    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

}
