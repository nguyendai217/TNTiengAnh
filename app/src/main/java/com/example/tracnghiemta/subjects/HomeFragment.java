package com.example.tracnghiemta.subjects;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.tracnghiemta.MainActivity;
import com.example.tracnghiemta.R;

public class HomeFragment extends Fragment {
    Button btnTest;
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Home");
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        btnTest= view.findViewById(R.id.btnTest);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnglishFragment fragment_english = new EnglishFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frg_home, fragment_english);
                fragmentTransaction.commit();
            }
        });
    }
}
