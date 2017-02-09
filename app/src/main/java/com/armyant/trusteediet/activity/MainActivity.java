package com.armyant.trusteediet.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.armyant.trusteediet.R;
import com.armyant.trusteediet.utils.ToastUtils;

import butterknife.Bind;

/**
 * 主界面
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {


    @Bind(R.id.btn_food)
    Button btnFood;
    @Bind(R.id.btn_vegetable)
    Button btnVegetable;
    @Bind(R.id.btn_menu)
    Button btnMenu;
    @Bind(R.id.btn_buyer)
    Button btnBuyer;
    @Bind(R.id.btn_plan)
    Button btnPlan;
    @Bind(R.id.btn_product)
    Button btnProduct;
    @Bind(R.id.btn_sample)
    Button btnSample;
    @Bind(R.id.btn_wash)
    Button btnWash;
    @Bind(R.id.btn_photo)
    Button btnPhoto;
    @Bind(R.id.btn_grow)
    Button btnGrow;

    @Override
    public void setContent() {
        setContentView(R.layout.activity_main);

    }

    @Override
    public void initView() {

        btnFood.setOnClickListener(this);
        btnVegetable.setOnClickListener(this);
        btnMenu.setOnClickListener(this);
        btnBuyer.setOnClickListener(this);
        btnPlan.setOnClickListener(this);
        btnProduct.setOnClickListener(this);
        btnSample.setOnClickListener(this);
        btnWash.setOnClickListener(this);
        btnPhoto.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
    }

    @Override
    public void initNet() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_food:
                Intent it = new Intent(MainActivity.this, SelectFoodActivity.class);
                startActivity(it);
                break;

            case R.id.btn_vegetable:
                ToastUtils.showToast(this, "菜品管理");
                break;
            case R.id.btn_menu:
                ToastUtils.showToast(this, "菜谱管理");
                break;
            case R.id.btn_buyer:
                ToastUtils.showToast(this, "采购管理");
                break;
            case R.id.btn_plan:
                ToastUtils.showToast(this, "备餐管理");
                break;
            case R.id.btn_product:
                ToastUtils.showToast(this, "成品管理");
                break;
            case R.id.btn_sample:
                ToastUtils.showToast(this, "留样管理");
                break;
            case R.id.btn_wash:
                ToastUtils.showToast(this, "洗消管理");
                break;
            case R.id.btn_photo:
                ToastUtils.showToast(this, "相册机构");
                break;
            case R.id.btn_grow:
                ToastUtils.showToast(this, "成长");
                break;
        }
    }
}
