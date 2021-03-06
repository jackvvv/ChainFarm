package sinia.com.linkfarm.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.drakeet.materialdialog.MaterialDialog;
import sinia.com.linkfarm.R;
import sinia.com.linkfarm.base.BaseActivity;
import sinia.com.linkfarm.utils.ActivityManager;

/**
 * Created by 忧郁的眼神 on 2016/8/8.
 */
public class ServiceActivity extends BaseActivity {

    @Bind(R.id.tv_online)
    TextView tvOnline;
    @Bind(R.id.tv_call)
    TextView tvCall;

    private MaterialDialog materialDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service, "客服");
        ButterKnife.bind(this);
        getDoingView().setVisibility(View.GONE);
    }

    @OnClick({R.id.tv_online, R.id.tv_call})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_online:
                break;
            case R.id.tv_call:
                materialDialog = new MaterialDialog(ServiceActivity.this);
                materialDialog.setTitle("联系客服").setMessage("400-888-666")
                        .setPositiveButton("呼叫", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "400-888-666"));
                                startActivity(intent);
                                materialDialog.dismiss();
                            }
                        }).setNegativeButton("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        materialDialog.dismiss();
                    }
                }).show();
                break;
        }
    }
}
