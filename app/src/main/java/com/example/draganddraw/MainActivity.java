package com.example.draganddraw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
