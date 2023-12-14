package com.example.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var namesListView :  ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namesListView = findViewById(R.id.lv_names)
        // Array of data
        var names =
            arrayOf("name1","name2",
            "name3","name4",
            "name5","name6",
            "name7","name8",
            "name9","name10",
            "name11","name12")
        // ArrayAdapter that bind names to the view
        var arrayAdapter :ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_activated_1,names)
        // bind list with adapter
        namesListView.adapter= arrayAdapter
        // when user click on item it will view the name
        // i is item position
        namesListView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "my name is ${names[i]}", Toast.LENGTH_SHORT).show()
        }
    }
}