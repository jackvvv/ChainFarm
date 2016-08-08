package sinia.com.linkfarm.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import sinia.com.linkfarm.R;
import sinia.com.linkfarm.activity.PayActivity;
import sinia.com.linkfarm.utils.ViewHolder;

/**
 * Created by 忧郁的眼神 on 2016/8/5.
 */
public class MyCouponsAdapter extends BaseAdapter {

    private Context context;

    public MyCouponsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_my_coupons, null);
        }
        TextView tv_money = ViewHolder.get(view, R.id.tv_money);
        return view;
    }
}
