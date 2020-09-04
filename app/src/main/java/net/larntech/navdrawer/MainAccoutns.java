package net.larntech.navdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.larntech.navdrawer.ui.mainaccoutns.MainAccoutnsFragment;

public class MainAccoutns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_accoutns_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainAccoutnsFragment.newInstance())
                    .commitNow();
        }
    }
}
