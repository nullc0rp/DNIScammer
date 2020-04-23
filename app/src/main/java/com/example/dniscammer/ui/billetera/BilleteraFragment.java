package com.example.dniscammer.ui.billetera;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.dniscammer.R;

public class BilleteraFragment extends Fragment {

    private BilleteraViewModel billeteraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        billeteraViewModel =
                ViewModelProviders.of(this).get(BilleteraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_billetera, container, false);

        final Button buttonHome = (Button)root.findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hehehehehe");
            }
        });

        return root;
    }
}
