package com.mj.libs_recyclerview.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.mj.libs_recyclerview.R;
import com.mj.libs_recyclerview.base.RVBaseViewHolder;
import com.mj.libs_recyclerview.base.RVSimpleAdapter;

/**
 * Created by kim on 2018/8/2.
 */

public class EmptyCell extends RVAbsStateCell {
    public EmptyCell(Object o) {
        super(o);
    }

    @Override
    public int getItemType() {
        return RVSimpleAdapter.EMPTY_TYPE;
    }

    @Override
    public void onBindViewHolder(RVBaseViewHolder holder, int position) {

    }

    @Override
    protected View getDefaultView(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.rv_empty_layout,null);
    }
}
