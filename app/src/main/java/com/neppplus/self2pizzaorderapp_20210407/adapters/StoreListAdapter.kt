package com.neppplus.self2pizzaorderapp_20210407.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.neppplus.self2pizzaorderapp_20210407.R
import com.neppplus.self2pizzaorderapp_20210407.Store

class StoreListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {
            tempRow = inflater.inflate(R.layout.store_list_item, null)
        }
        val row = tempRow!!

        val clickedStore = mList[position]

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)


        nameTxt.text = clickedStore.name

        return row
    }
}