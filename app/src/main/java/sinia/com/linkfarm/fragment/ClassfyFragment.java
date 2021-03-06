package sinia.com.linkfarm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.adapter.ClassfyAdapter;
import sinia.com.linkfarm.adapter.ClassfyGridAdapter;
import sinia.com.linkfarm.base.BaseFragment;

/**
 * Created by 忧郁的眼神 on 2016/8/4.
 */
public class ClassfyFragment extends BaseFragment {

    private ListView lvClassfy;
    private GridView gvRight;
    private View rootView;
    private ClassfyAdapter classfyAdapter;
    private ClassfyGridAdapter gridAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        rootView = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_classfy, null);
        ButterKnife.bind(this.rootView);
        initData();
        return rootView;
    }

    private void initData() {
        lvClassfy = (ListView) rootView.findViewById(R.id.lv_classfy);
        gvRight = (GridView) rootView.findViewById(R.id.gv_right);
        classfyAdapter = new ClassfyAdapter(getActivity());
        lvClassfy.setAdapter(classfyAdapter);
        gridAdapter = new ClassfyGridAdapter(getActivity());
        classfyAdapter.selectPosition = 0;
        gvRight.setAdapter(gridAdapter);
        lvClassfy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                classfyAdapter.selectPosition = i;
                classfyAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
