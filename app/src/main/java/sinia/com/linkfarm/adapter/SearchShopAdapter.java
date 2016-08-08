package sinia.com.linkfarm.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import sinia.com.linkfarm.R;
import sinia.com.linkfarm.activity.ShopDetailActivity;
import sinia.com.linkfarm.utils.ViewHolder;

/**
 * Created by 忧郁的眼神 on 2016/8/5.
 */
public class SearchShopAdapter extends BaseAdapter {

    private Context context;

    public SearchShopAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 6;
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
            view = LayoutInflater.from(context).inflate(R.layout.item_shop_collect, null);
        }
        TextView tv_shopname = ViewHolder.get(view, R.id.tv_shopname);
        TextView tv_in = ViewHolder.get(view, R.id.tv_in);
        ImageView img = ViewHolder.get(view, R.id.img);
        tv_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ShopDetailActivity.class);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
