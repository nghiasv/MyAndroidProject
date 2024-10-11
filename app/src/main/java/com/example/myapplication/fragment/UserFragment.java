    package com.example.myapplication.fragment;

    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentStatePagerAdapter;
    import androidx.viewpager.widget.ViewPager;

    import com.example.myapplication.R;
    import com.example.myapplication.user.USER_VPAdapter;
    import com.google.android.material.tabs.TabLayout;

    public class UserFragment extends Fragment {
        private TabLayout tabLayout;
        private ViewPager viewPager;
        private View mView;
        public UserFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

                mView = inflater.inflate(R.layout.fragment_user, container, false);
                tabLayout = mView.findViewById(R.id.user_tab_layout);
                viewPager = mView.findViewById(R.id.user_viewpager);

                USER_VPAdapter adapter = new USER_VPAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                viewPager.setAdapter(adapter);
                tabLayout.setupWithViewPager(viewPager);

                return mView;
        }
    }