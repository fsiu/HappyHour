package com.happyhour;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class QuestionFragment extends Fragment {

    //MyPageAdapter pageAdapter;

    public QuestionFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_question, container, false);
        return v;

//        List<Fragment> fragments = getFragments();
//        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
//        ViewPager pager =
//        (ViewPager)findViewById(R.id.viewpager);
//        pager.setAdapter(pageAdapter);
    }
}


