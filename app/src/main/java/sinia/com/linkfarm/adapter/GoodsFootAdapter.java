package sinia.com.linkfarm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import sinia.com.linkfarm.R;
import sinia.com.linkfarm.utils.ViewHolder;

/**
 * Created by 忧郁的眼神 on 2016/8/5.
 */
public class GoodsFootAdapter extends BaseAdapter {

    private Context context;

    public GoodsFootAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
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
            view = LayoutInflater.from(context).inflate(R.layout.item_goods_foot, null);
        }
        TextView tv_title = ViewHolder.get(view, R.id.tv_title);
        TextView tv_comment = ViewHolder.get(view, R.id.tv_comment);
        TextView tv_price = ViewHolder.get(view, R.id.tv_price);
        ImageView img = ViewHolder.get(view, R.id.img);
        return view;
    }
}
