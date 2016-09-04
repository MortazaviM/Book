package ir.persianfa.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ViewPagerActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_layout_activity,container,false);

        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.view_pager);
        PagerAdapter adapter = new PagerAdapter(getFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


        return rootView;
    }

    static class PagerAdapter extends FragmentPagerAdapter{

        String[] titles = {"Reading" , "To Read" , "Read","Quited"};

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {



                tab1_listview fragment = new tab1_listview();
                return fragment;



//            else{
//                FragmentContent fragment = new FragmentContent();
//                return fragment;

//            }

        }

        @Override
        public int getCount() {
            return titles.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
