package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FontSizeAdapter(private val context: Context, private val fontSize:Array<Int>):BaseAdapter(){
     override fun getCount()=fontSize.size
    override fun getItem(position:Int)=fontSize[position]
    override fun getItemId(position:Int)=position.toLong()

    override fun getView (position:Int,convertView:View?,parent:ViewGroup?):View{
        return  getDropDownView(position, convertView,parent).apply{
            (this as TextView).textSize=22f

        }
    }
override fun getDropDownView(position:Int, convertView:View?,parent:ViewGroup?):View {
        val textView :TextView
        if(convertView!=null){
            textView=convertView as TextView
        }else{
            textView=TextView(context)
            textView.setPadding(5,10,0,10)
            textView.text=fontSize[position].toString()
            textView.textSize=fontSize[position].toFloat()
        }

    return textView
}
}