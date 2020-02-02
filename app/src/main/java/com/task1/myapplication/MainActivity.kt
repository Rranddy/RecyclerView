package com.task1.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.task1.myapplication.Developer.Companion.dev
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val layoutManager = LinearLayoutManager(this)
            layoutManager.orientation = LinearLayoutManager.VERTICAL
            recyclerView.layoutManager = layoutManager

            val adapter = DeveloperAdapter(this, Developer.dev)
            recyclerView.adapter = adapter

            addDev.setOnClickListener{
                Developer.dev.add(Developer("Developer 10","Phone Number #10" +
                        ""))
                adapter.run{
                    startActivity(intent)
                    notifyDataSetChanged()
                }
            }

            deleteDev.setOnClickListener{
                Developer.dev.removeAt(dev.size-1)
                adapter.run{
                    startActivity(intent)
                    notifyDataSetChanged()
                }
            }

            Developer.dev.add(Developer("Developer 0","Phone Number #0"))
            Developer.dev.add(Developer("Developer 1","Phone Number #1"))
            Developer.dev.add(Developer("Developer 2","Phone Number #2"))
            Developer.dev.add(Developer("Developer 3","Phone Number #3"))
            Developer.dev.add(Developer("Developer 4","Phone Number #4"))
            Developer.dev.add(Developer("Developer 5","Phone Number #5"))
            Developer.dev.add(Developer("Developer 6","Phone Number #6"))
            Developer.dev.add(Developer("Developer 7","Phone Number #7"))
            Developer.dev.add(Developer("Developer 8","Phone Number #8"))
            Developer.dev.add(Developer("Developer 9","Phone Number #9"))

    }
}

