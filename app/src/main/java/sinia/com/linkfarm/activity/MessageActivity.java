package sinia.com.linkfarm.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.base.BaseActivity;
import sinia.com.linkfarm.fragment.AnnouncementFragment;
import sinia.com.linkfarm.fragment.GoodsCollectFragment;
import sinia.com.linkfarm.fragment.NoticeFragment;
import sinia.com.linkfarm.fragment.ShopCollectFragment;
import sinia.com.linkfarm.utils.ActivityManager;

/**
 * Created by 忧郁的眼神 on 2016/8/8.
 */
public class MessageActivity extends BaseActivity {

    @Bind(R.id.tab_title)
    TabLayout tabTitle;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.back)
    TextView back;
    @Bind(R.id.title)
    TextView title;
    @Bind(R.id.img_pic)
    ImageView imgPic;

    private MyFragmentPagerAdapter pagerAdapter;
    private List<String> titleList;
    private List<Fragment> fragmentList;
    private AnnouncementFragment announcementFragment;
    private NoticeFragment noticeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        titleList = new ArrayList<>();
        titleList.add("公告");
        titleList.add("通知");
        fragmentList = new ArrayList<>();
        announcementFragment = new AnnouncementFragment();
        noticeFragment = new NoticeFragment();
        fragmentList.add(announcementFragment);
        fragmentList.add(noticeFragment);
        pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, titleList);
        viewPager.setAdapter(pagerAdapter);
        tabTitle.setTabMode(TabLayout.MODE_FIXED);
        tabTitle.addTab(tabTitle.newTab().setText(titleList.get(0)));
        tabTitle.addTab(tabTitle.newTab().setText(titleList.get(1)));
        tabTitle.setupWithViewPager(viewPager);
    }

    @OnClick({R.id.back, R.id.img_pic})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                ActivityManager.getInstance().finishCurrentActivity();
                break;
            case R.id.img_pic:
                startActivityForNoIntent(ServiceActivity.class);
                break;
        }
    }

    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragmentList;
        private List<String> titleList;

        public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
            super(fm);
            this.fragmentList = fragmentList;
            this.titleList = titleList;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return titleList.size();
        }

        //此方法用来显示tab上的名字
        @Override
        public CharSequence getPageTitle(int position) {

            return titleList.get(position % titleList.size());
        }
    }
}
