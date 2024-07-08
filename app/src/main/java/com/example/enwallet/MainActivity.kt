package com.example.enwallet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayexpense()

    }
    fun displayexpense(){
        val expense1 = Expense("Salary","1 July 2024")
        val expense2 = Expense("Rent","2 July 2024")
        val expense3 = Expense("Dividents","4 July 2024")
        val expense4= Expense("Electricity","5 July 2024")
        val expense5= Expense("Internet","5 July 2024")
        val expense6 = Expense("Shopping","5 July 2024")
        val expense7 = Expense("BusFare","11 July 2024")

        val expenses= listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7)

        var expenseAdapter = EnwalletAdapter(expenses)
        binding.rvWallet.adapter = expenseAdapter
    }

}