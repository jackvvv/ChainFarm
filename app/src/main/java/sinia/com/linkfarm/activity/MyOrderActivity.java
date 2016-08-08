package sinia.com.linkfarm.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.adapter.MyOrderAdapter;
import sinia.com.linkfarm.base.BaseActivity;

/**
 * Created by 忧郁的眼神 on 2016/8/5.
 */
public class MyOrderActivity extends BaseActivity {

    @Bind(R.id.listView)
    ListView listView;

    private String title;
    private MyOrderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getIntent().getStringExtra("title");
        setContentView(R.layout.activity_my_order, title);
        getDoingView().setVisibility(View.GONE);

        initData();
    }

    private void initData() {
        adapter = new MyOrderAdapter(this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivityForNoIntent(OrderDetailActivity.class);
            }
        });
    }
}
