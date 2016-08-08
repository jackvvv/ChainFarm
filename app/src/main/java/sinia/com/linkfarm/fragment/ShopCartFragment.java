package sinia.com.linkfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.base.BaseFragment;

/**
 * Created by 忧郁的眼神 on 2016/8/4.
 */
public class ShopCartFragment extends BaseFragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        rootView = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_cart, null);
        ButterKnife.bind(this.rootView);
        return rootView;
    }
}
