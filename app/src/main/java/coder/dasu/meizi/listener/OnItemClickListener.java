package coder.dasu.meizi.listener;

import android.view.View;

import coder.dasu.meizi.data.bean.Meizi;

/**
 * Created by sxq on 2016/9/10.
 */
public interface OnItemClickListener {

    void onItemClick(View view, View picture, View text, Meizi meizhi);

}