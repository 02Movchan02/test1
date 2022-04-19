package com.movchan.testd.acitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.movchan.testd.R

class SingInActivity : AppCompatActivity() {
    private lateinit var emailEt : EditText
    private lateinit var passwordEt: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        supportActionBar?.hide()
        emailEt = findViewById(R.id.email_edit_text)
        passwordEt = findViewById(R.id.password_edit_text)
    }

    fun btn_enter_house_click(view: View) {
        if (emailEt.text.toString() != "" && passwordEt.text.toString() != ""){
            Toast.makeText(this, "Не пусто", Toast.LENGTH_SHORT).show()
        }
    }

    fun btn_new_resident_click(view: View) {

    }
}