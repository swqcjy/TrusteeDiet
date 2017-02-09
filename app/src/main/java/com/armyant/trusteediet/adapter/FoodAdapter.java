package com.armyant.trusteediet.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.armyant.trusteediet.R;
import com.armyant.trusteediet.bean.CityBean;
import com.armyant.trusteediet.utils.Constants;
import com.armyant.trusteediet.utils.PrefUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swq on 2017-02-08.
 */
public class FoodAdapter extends SimpleAdapter<CityBean> {

    private List<String> listPos = new ArrayList<>();
    protected List<CityBean> mDatas;
    public FoodAdapter(Context context, int layoutId, List<CityBean> datas) {
        super(context, layoutId, datas);
        this.mDatas = datas;

    }


    public List<CityBean> getDatas() {
        return mDatas;
    }

    public FoodAdapter setDatas(List<CityBean> datas) {
        mDatas = datas;
        return this;
    }


    @Override
    protected void convert(BaseViewHolder viewHoder, final CityBean item) {

        Log.i("info","adapter刷新啦");
        viewHoder.getImageView(R.id.ivAvatar).setImageResource(R.drawable.friend);
        viewHoder.getTextView(R.id.tvCity).setText(item.getCity());
        CheckBox ck = (CheckBox) viewHoder.getView(R.id.ck);
        ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    listPos.add(item.getCity());
                else
                    listPos.remove(item.getCity());
            }
        });

        if (PrefUtils.getBoolean(Constants.IS_SHOW_CK, false))
            ck.setVisibility(View.VISIBLE);
        else
            ck.setVisibility(View.GONE);

    }
}
