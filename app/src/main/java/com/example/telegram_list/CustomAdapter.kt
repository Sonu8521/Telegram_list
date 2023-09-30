package com.example.telegram_list

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class CustomAdapter (val context: Context, val DataList:List<Datamodel>):BaseAdapter(){


        override fun getCount(): Int {
        return DataList.size
    }

    override fun getItem(position: Int): Any {
        return DataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder","MissingInflatedId")
    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {


        val rowview= LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false)

        val data=DataList[position]
        val Image=rowview.findViewById<ImageView>(R.id.image)
        val Name=rowview.findViewById<TextView>(R.id.name)
        val Email=rowview.findViewById<TextView>(R.id.Email)

        Glide.with(context).load(data.image).into(Image)

        Name.setText(data.name)
        Email.setText(data.email)

        return rowview

}

}
