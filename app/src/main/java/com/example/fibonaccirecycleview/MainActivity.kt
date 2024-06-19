package com.example.fibonaccirecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonaccirecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myNum = numbers(100)
        binding.tvNum.layoutManager = GridLayoutManager(this,4)

        val myNum2 = NumbersRecycleView(myNum)
        binding.tvNum.adapter = myNum2

    }

    fun numbers(numb: Int): List<Int>{
        val myNum = mutableListOf(0,1)
        while(myNum.size < numb){
            myNum.add(myNum[myNum.lastIndex] + myNum[myNum.lastIndex - 1])

        }

        return myNum

    }

}