package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var adap: MyAdapterforGridView?=null
    lateinit var list:ArrayList<GridModel>
    lateinit var rv:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        call()
        rv=findViewById(R.id.recyclerView)
        rv.setHasFixedSize(true)
        val gridlayoutmanager=GridLayoutManager(this, 2)
        gridlayoutmanager.orientation=RecyclerView.VERTICAL
        rv.layoutManager=gridlayoutmanager
        adap= MyAdapterforGridView(this,list)
        rv.adapter=adap
    }
    fun call(){
        list=ArrayList<GridModel>()
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))
        list.add(GridModel(R.drawable.baseline_phone_android_24,"phone"))

    }
}