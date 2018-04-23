package com.celine_creations.android.meteo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class FragmentListe extends Fragment {


    public FragmentListe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vue = inflater.inflate(R.layout.fragment_liste, container, false);
        ListView listViewObservation = vue.findViewById(R.id.liste);
        ArrayAdapter<String> adapteur = new ArrayAdapter<>(getActivity(), R.layout.item);
        listViewObservation.setAdapter(adapteur);
        String[] tab = {
                "Paris",
                "Londres",
                "Berlin",
                "Barcelone",
                "Madrid",
                "Athènes",
        };
        adapteur.addAll(tab);
        return vue;
    }
}
