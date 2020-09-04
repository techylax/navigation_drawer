package net.larntech.navdrawer.ui.mainaccoutns;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.larntech.navdrawer.R;
import net.larntech.navdrawer.UserAccountsActivity;

public class MainAccoutnsFragment extends Fragment {

    private MainAccoutnsViewModel mViewModel;

    public static MainAccoutnsFragment newInstance() {
        return new MainAccoutnsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_accoutns_fragment, container, false);

        Button btnNext = view.findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), UserAccountsActivity.class));

            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainAccoutnsViewModel.class);
        // TODO: Use the ViewModel
    }

}
