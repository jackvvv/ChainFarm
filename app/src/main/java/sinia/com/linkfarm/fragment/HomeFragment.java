package sinia.com.linkfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.adapter.HomeRecommendAdapter;
import sinia.com.linkfarm.base.BaseFragment;
import sinia.com.linkfarm.utils.AppInfoUtil;
import sinia.com.linkfarm.view.MyGridView;
import sinia.com.linkfarm.view.slideview.SlideShowView;

/**
 * Created by 忧郁的眼神 on 2016/8/4.
 */
public class HomeFragment extends BaseFragment {

    @Bind(R.id.tv_locate)
    TextView tvLocate;
    @Bind(R.id.tv_search_type)
    TextView tvSearchType;
    @Bind(R.id.et_content)
    EditText etContent;
    @Bind(R.id.img_search)
    ImageView imgSearch;
    @Bind(R.id.tv_scan)
    TextView tvScan;
    @Bind(R.id.tv_msg)
    TextView tvMsg;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.tv_content)
    TextView tvContent;
    @Bind(R.id.img_up)
    ImageView imgUp;
    @Bind(R.id.img_down)
    ImageView imgDown;
    @Bind(R.id.llup)
    LinearLayout llup;
    @Bind(R.id.img_left_big)
    ImageView imgLeftBig;
    @Bind(R.id.img_right_top)
    ImageView imgRightTop;
    @Bind(R.id.img_right_bottom)
    ImageView imgRightBottom;
    @Bind(R.id.img_left_top)
    ImageView imgLeftTop;
    @Bind(R.id.img_left_bottom)
    ImageView imgLeftBottom;
    @Bind(R.id.img_right_big)
    ImageView imgRightBig;
    private MyGridView gridView;
    private  SlideShowView mySlideShowView;
    private View rootView;
    private List<String> picList = new ArrayList<String>();
    private HomeRecommendAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        rootView = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, rootView);
        initData();
        return rootView;
    }

    private void initData() {
        int h = AppInfoUtil.getScreenWidth(getActivity()) * 320 / 750;
        mySlideShowView = (SlideShowView) rootView.findViewById(R.id.mySlideShowView);
        gridView = (MyGridView) rootView.findViewById(R.id.gridView);
        mySlideShowView.getLayoutParams().height = h;
        picList.add("http://ms.bdimg.com/pacific/upload_7627579_1452595285589.jpg");
        picList.add("http://ms.bdimg.com/pacific/upload_21326881_1467970596086.jpg");
        picList.add("http://ms.bdimg.com/pacific/upload_7822730_1442385980400.jpg");
        picList.add("http://s0.hao123img.com/res/r/image/2016-08-04/8b03028a8651b44d1e255d6724b43c61.jpg");
        picList.add("https://img.alicdn.com/tps/i4/TB1IUeBLXXXXXX8XFXXSutbFXXX.jpg");
        picList.add("https://img.alicdn.com/bao/uploaded/i3/TB1peVoMpXXXXccXVXXXXXXXXXX_!!0-item_pic.jpg_400x400q60.jpg");
        mySlideShowView.setImagePath(picList);
        mySlideShowView.startPlay();
        adapter = new HomeRecommendAdapter(getActivity());
        gridView.setAdapter(adapter);
    }

    @OnClick({R.id.tv_locate, R.id.tv_search_type, R.id.tv_scan, R.id.tv_msg})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_locate:
                showToast("aa");
                break;
            case R.id.tv_search_type:
                break;
            case R.id.tv_scan:
                break;
            case R.id.tv_msg:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
