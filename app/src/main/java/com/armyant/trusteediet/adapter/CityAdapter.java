package com.armyant.trusteediet.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.armyant.trusteediet.R;
import com.armyant.trusteediet.bean.CityBean;
import com.armyant.trusteediet.utils.Constants;
import com.armyant.trusteediet.utils.PrefUtils;

import java.util.List;


/**
 * Created by zhangxutong .
 * Date: 16/08/28
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {
    protected Context mContext;
    protected List<CityBean> mDatas;
    protected LayoutInflater mInflater;
    private List<Integer> listPos;

    public CityAdapter(Context mContext, List<CityBean> mDatas, List<Integer> listPos) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        this.listPos = listPos;
        mInflater = LayoutInflater.from(mContext);
    }

    public List<CityBean> getDatas() {
        return mDatas;
    }

    public CityAdapter setDatas(List<CityBean> datas) {
        mDatas = datas;
        return this;
    }


    @Override
    public CityAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("info", "onCreateViewHolder回调");
        return new ViewHolder(mInflater.inflate(R.layout.item_city, parent, false));
    }

    @Override
    public void onBindViewHolder(final CityAdapter.ViewHolder holder, final int position) {
        Log.i("info", "onBindViewHolder回调");
        final CityBean cityBean = mDatas.get(position);
        holder.tvCity.setText(cityBean.getCity());
        holder.content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(mContext, "pos:" + mDatas.get(position).getCity(), Toast.LENGTH_SHORT).show();

            }
        });
        holder.avatar.setImageResource(R.drawable.friend);
        holder.ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    listPos.add(position);
                else {
                    if (null != listPos && listPos.size() > 0)
                        listPos.remove(position);
                }
            }
        });
        if (PrefUtils.getBoolean(Constants.IS_SHOW_CK, false)) {
            holder.ck.setVisibility(View.VISIBLE);
            holder.ck.setChecked(false);
        } else {
            holder.ck.setVisibility(View.GONE);
            holder.ck.setChecked(false);
        }
    }

    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCity;
        ImageView avatar;
        View content;
        CheckBox ck;

        public ViewHolder(View itemView) {
            super(itemView);
            tvCity = (TextView) itemView.findViewById(R.id.tvCity);
            avatar = (ImageView) itemView.findViewById(R.id.ivAvatar);
            ck = (CheckBox) itemView.findViewById(R.id.ck);
            content = itemView.findViewById(R.id.content);
        }
    }
}
