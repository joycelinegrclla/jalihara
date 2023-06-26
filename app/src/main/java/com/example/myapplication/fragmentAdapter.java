package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.navigation.NavigationView;

//buat ngasih tau ke view pager2 (buat menampilkan content fragment)
public class fragmentAdapter extends FragmentStateAdapter {
    public fragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //buat munculin fragment apa
        switch (position){
            case 0 : return new aboutUs();
            case 1 : return new fragment_contact_us();
        }
        return new aboutUs();
    }

    @Override
    public int getItemCount() {
        //jumlah tab
        return 2;
    }

}
