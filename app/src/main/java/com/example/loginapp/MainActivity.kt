package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var btnsignup:Button
    lateinit var etemail:EditText
    lateinit var etpassword:EditText
//    variables only
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castingViews()
        onClickListener()
    }

        fun castingViews(){
            btnlogin=findViewById(R.id.btnlogin)
            btnsignup=findViewById(R.id.btnsignups)
            etemail=findViewById(R.id.etemail)
            etpassword=findViewById(R.id.etpassword)
//            Get views by their ideas.
//            ids only.
        }
        fun onClickListener() {
            if(etemail.text.toString().isEmpty()||etpassword.text.toString().isEmpty())
                etpassword.setError("Please enter correctly")
                etemail.setError("Please enter correctly")
           var feedback = "Welcome back!!"

            btnlogin.setOnClickListener {
                Toast.makeText(baseContext, feedback, Toast.LENGTH_SHORT).show()
                var intent=Intent(baseContext,MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
