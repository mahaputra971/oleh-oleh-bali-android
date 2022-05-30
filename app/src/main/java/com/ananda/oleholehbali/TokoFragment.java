package com.ananda.oleholehbali;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.ImageView;

public class TokoFragment extends Fragment {

    public TokoFragment(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toko, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        for (int iImage=1; iImage<3; iImage++){
            int idImage = getResources().getIdentifier("Implicit_" + iImage, "id", getContext().getPackageName());
            View eventImage = view.findViewById(idImage);
            eventImage.setOnClickListener(this::doImplicit);
        }
    }

    public void doImplicit(View view){
        switch (view.getId()){
            case R.id.Implicit_1:
                String loc = "Laptop Store Denpasar";

                // Parse the location and create the intent.
                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent1 = new Intent(Intent.ACTION_VIEW, addressUri);

                // Find an activity to handle the intent, and start that activity.
                startActivity(intent1);
                break;
            case R.id.Implicit_2:
                String number = "081246007474";

                // Parse the number and create the intent.
                Uri numberUri = Uri.parse("tel:" + number);
                Intent intent2 = new Intent(Intent.ACTION_DIAL, numberUri);

                // Find an activity to handle the intent, and start that activity.
                startActivity(intent2);
                break;
        }
    }
}