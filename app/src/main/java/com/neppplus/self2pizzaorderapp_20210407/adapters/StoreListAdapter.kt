package com.neppplus.self2pizzaorderapp_20210407.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.self2pizzaorderapp_20210407.Store

class StoreListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {
}