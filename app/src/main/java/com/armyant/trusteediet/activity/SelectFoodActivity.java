package com.armyant.trusteediet.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.armyant.trusteediet.R;
import com.armyant.trusteediet.adapter.CityAdapter;
import com.armyant.trusteediet.adapter.HeaderRecyclerAndFooterWrapperAdapter;
import com.armyant.trusteediet.adapter.ViewHolder;
import com.armyant.trusteediet.bean.CityBean;
import com.armyant.trusteediet.utils.Constants;
import com.armyant.trusteediet.utils.PrefUtils;
import com.armyant.trusteediet.utils.ToastUtils;
import com.armyant.trusteediet.weight.DividerItemDecoration;
import com.mcxtzhang.indexlib.IndexBar.widget.IndexBar;
import com.mcxtzhang.indexlib.suspension.SuspensionDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by swq on 2017-02-12.
 * <p/>
 * 选择食材界面
 */
public class SelectFoodActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.iv_left)
    ImageButton ivLeft;
    @Bind(R.id.tv_title)
    TextView tvTitle;
    @Bind(R.id.iv_right)
    ImageView ivRight;
    @Bind(R.id.et_search)
    EditText etSearch;
    @Bind(R.id.ll_edit)
    LinearLayout llEdit;
    @Bind(R.id.ll_delete)
    LinearLayout llDelete;
    @Bind(R.id.ll_cancel)
    LinearLayout llCancel;
    private RecyclerView mRv;
    private CityAdapter mAdapter;
    private HeaderRecyclerAndFooterWrapperAdapter mHeaderAdapter;
    private LinearLayoutManager mManager;
    private List<CityBean> mDatas;

    private SuspensionDecoration mDecoration;
    private List<Integer> listPos = new ArrayList<>();


    /**
     * 右侧边栏导航区域
     */
    private IndexBar mIndexBar;

    /**
     * 显示指示器DialogText
     */
    private TextView mTvSideBarHint;

    public static SelectFoodActivity instance;

    @Override
    public void setContent() {

        setContentView(R.layout.activity_select_city);
        instance = this;
    }

    @Override
    public void initView() {

        ivLeft.setVisibility(View.VISIBLE);
        ivRight.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvTitle.setText("食材");
        ivRight.setImageResource(R.drawable.add);

        llEdit.setOnClickListener(this);
        llDelete.setOnClickListener(this);
        llCancel.setOnClickListener(this);

        initRecyclerView();
    }

    //初始化
    private void initRecyclerView() {
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(mManager = new LinearLayoutManager(this));

        mAdapter = new CityAdapter(this, mDatas, listPos);
//        mAdapter = new FoodAdapter(this,R.layout.item_city,mDatas);
        mHeaderAdapter = new HeaderRecyclerAndFooterWrapperAdapter(mAdapter) {
            @Override
            protected void onBindHeaderHolder(ViewHolder holder, int headerPos, int layoutId, Object o) {
                holder.setText(R.id.tvCity, (String) o);
            }
        };
//        mHeaderAdapter.setHeaderView(R.layout.item_city, "请选择城市");

        mRv.setAdapter(mHeaderAdapter);
        mRv.addItemDecoration(mDecoration = new SuspensionDecoration(this, mDatas).setHeaderViewCount(mHeaderAdapter.getHeaderViewCount()));

        //如果add两个，那么按照先后顺序，依次渲染。
        mRv.addItemDecoration(new DividerItemDecoration(SelectFoodActivity.this, DividerItemDecoration.VERTICAL_LIST));

        //使用indexBar
        mTvSideBarHint = (TextView) findViewById(R.id.tvSideBarHint);//HintTextView
        mIndexBar = (IndexBar) findViewById(R.id.indexBar);//IndexBar

        mIndexBar.setmPressedShowTextView(mTvSideBarHint)//设置HintTextView
                .setNeedRealIndex(true)//设置需要真实的索引
                .setmLayoutManager(mManager);//设置RecyclerView的LayoutManager

        initDatas(getResources().getStringArray(R.array.provinces));
    }

    @Override
    public void initNet() {

    }

    /**
     * 组织数据源
     *
     * @param data
     * @return
     */
    private void initDatas(final String[] data) {
        //延迟200ms 模拟加载数据中....
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                mDatas = new ArrayList<>();
                for (int i = 0; i < data.length; i++) {
                    CityBean cityBean = new CityBean();
                    cityBean.setCity(data[i]);//设置城市名称
                    mDatas.add(cityBean);
                }

                mIndexBar.setmSourceDatas(mDatas)//设置数据
                        .setHeaderViewCount(mHeaderAdapter.getHeaderViewCount())//设置HeaderView数量
                        .invalidate();

                mAdapter.setDatas(mDatas);
                mHeaderAdapter.notifyDataSetChanged();
                mDecoration.setmDatas(mDatas);
            }
        }, 200);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.ll_edit:

                PrefUtils.putBoolean(Constants.IS_SHOW_CK, true);
                mHeaderAdapter.notifyDataSetChanged();
                Log.i("info", "编辑");
                break;

            case R.id.ll_delete:
                Log.i("info", "删除");

                if (null == listPos)
                    break;
                if (listPos.size() == 0) {

                    ToastUtils.showToast(this, "请选择条目");
                } else {
                    for (Integer i : listPos) {
                        mHeaderAdapter.notifyItemRemoved(i);
                        mDatas.remove(mDatas.get(i));
                    }
                    listPos.clear();
                    PrefUtils.putBoolean(Constants.IS_SHOW_CK, false);
                    mHeaderAdapter.notifyDataSetChanged();
                }
                break;

            case R.id.ll_cancel:
                listPos.clear();
                PrefUtils.putBoolean(Constants.IS_SHOW_CK, false);
                mHeaderAdapter.notifyDataSetChanged();
                Log.i("info", "取消");
                break;
        }
    }
}
