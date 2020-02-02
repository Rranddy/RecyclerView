package com.task1.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.developer_detail.*

class DevDetail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.developer_detail)

        val bundle:Bundle? = intent.extras
        val msg= bundle!!.getString("Developer No")
        DName.setText(msg)

        remark.setOnClickListener {

            if(RText.visibility == View.VISIBLE){
                RText.visibility = View.GONE
            }
            else{
                RText.visibility = View.VISIBLE
            }
        }
    }
}