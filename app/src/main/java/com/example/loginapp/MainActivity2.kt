package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var etname: EditText
    lateinit var etmail: EditText
    lateinit var etphonenumber: EditText
    lateinit var etpassword: EditText
    lateinit var spgenders: Spinner
    lateinit var btnsignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun castingViews() {
        etname = findViewById(R.id.etName)
        spgenders = findViewById(R.id.spgenders)
        etphonenumber = findViewById(R.id.etphonenumber)
        etpassword = findViewById(R.id.etpassword)
        etmail = findViewById(R.id.etemail)
        spgenders = findViewById(R.id.spgenders)
        btnsignup=findViewById(R.id.btnsignup)
        var genders = arrayListOf("male", "female", "others")
        var genderAdapter = ArrayAdapter<String>(baseContext, android.R.layout.simple_dropdown_item_1line,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spgenders.adapter=genderAdapter
    }

    fun onClickListener() {
        if (etname.text.toString().isEmpty() || etphonenumber.text.toString().isEmpty() || etpassword.text.toString().isEmpty() || etmail.text.toString().isEmpty()){
            etname.setError("INSERT NAME")
            etphonenumber.setError("INSERT PHONENUMBER")
            etpassword.setError("INSERT PASSWORD")
            etmail.setError("INSERT EMAIL")
        }

    var message = "Created successfully"
        btnsignup.setOnClickListener {
            Toast.makeText(baseContext, "message", Toast.LENGTH_LONG).show()
        }
}
}