package com.example.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class EnwalletAdapter(var expenseList:List<Expense>):
    RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet,parent,false)
        return  ExpenseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.item.text = expense.item
        holder.date.text = expense.date

    }

    override fun getItemCount(): Int {
        return  expenseList.size
    }
}



class ExpenseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var item = itemView.findViewById<TextView>(R.id.tvSalary)
    var date= itemView.findViewById<TextView>(R.id.tvDividents)


}



