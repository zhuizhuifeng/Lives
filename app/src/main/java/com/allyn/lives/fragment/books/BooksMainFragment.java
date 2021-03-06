package com.allyn.lives.fragment.books;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allyn.lives.R;
import com.allyn.lives.adapter.BooksViewPagerAdapter;
import com.allyn.lives.fragment.base.BaseFragment;
import com.allyn.lives.utils.Config;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class BooksMainFragment extends BaseFragment {


    @Bind(R.id.tablayout)
    TabLayout mTabLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;


    public static BooksMainFragment newInstance() {
        BooksMainFragment imageMainFragment = new BooksMainFragment();
        return imageMainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment__img_tab, container, false);
        ButterKnife.bind(this, v);
        initView();
        return v;
    }

    private void initView() {
        BooksViewPagerAdapter viewpageradapter = new BooksViewPagerAdapter(getChildFragmentManager());
        mViewpager.setAdapter(viewpageradapter);
//        mViewpager.setOffscreenPageLimit(6);
        mTabLayout.setupWithViewPager(mViewpager);
    }
}
