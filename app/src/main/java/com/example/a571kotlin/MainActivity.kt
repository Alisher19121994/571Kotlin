package com.example.a571kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a571kotlin.`1-Adapters`.Main_Adapter
import com.example.a571kotlin.`1-Models`.Contents

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        getAdapter(data())
    }

    private fun data(): ArrayList<Contents> {

        val contents = ArrayList<Contents>()
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))
        contents.add(Contents("Masha and The Bear"))

        return contents
    }

    private fun getAdapter(list: ArrayList<Contents>) {
        val adapter = Main_Adapter(this, list)
        recyclerView.adapter = adapter
    }
}