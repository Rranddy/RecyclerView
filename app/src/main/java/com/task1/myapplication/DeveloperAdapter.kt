package com.task1.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_developer.view.*

class DeveloperAdapter(val context : Context, val dev:List<Developer>):RecyclerView.Adapter<DeveloperAdapter.MyViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_developer, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dev.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name= dev[position]
        val phn = dev[position]
        holder.setData(name,phn,position)
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var currentDeveloper: Developer? = null
        var currentPN:Developer? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener{
                val intent = Intent(itemView.context ,DevDetail::class.java)
                val Developer:String = currentDeveloper!!.DevName.toString()
                intent.putExtra("Developer No",Developer)
                itemView.context.startActivity(intent)
                Toast.makeText(context, currentDeveloper!!.DevName + " Clicked!", Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(name:Developer?, phn:Developer, pos:Int){
            itemView.DeveloperName.text=name!!.DevName
            itemView.DeveloperNum.text=phn!!.DevPN

            this.currentDeveloper = name
            this.currentPN=phn
            this.currentPosition = pos
        }

    }

}

