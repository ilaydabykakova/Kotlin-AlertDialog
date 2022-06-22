package com.ilaydabykakova.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ilaydabykakova.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //Context

        //Activity Context -> this
        //App Context -> applicationContext

        Toast.makeText(this@MainActivity,"Welcome",Toast.LENGTH_LONG).show()
      /*
       // Delete "Save" button from activity
        binding.button.setOnClickListener(object:View.OnClickListener {
            override fun onClick(v: View?) {
                // Only "this" not refere it. In here necessary to use "this@MainActivity"
                Toast.makeText(this@MainActivity,"test2",Toast.LENGTH_LONG).show()
            }
        })

       */
    }
    fun save(view: View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you sure ?")
        //{ dialog, which -> } when clicked the button "Yes",{ dialog, which ->} this block gives you what to do
        alert.setPositiveButton("Yes"){ dialog, which ->
            //OnClick Listener
            Toast.makeText(this,"Saved.",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog, which ->
            //OnClick Listener
            Toast.makeText(this
                ,"Not Saved !",Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}