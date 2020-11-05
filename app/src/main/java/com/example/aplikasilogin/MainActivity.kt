package com.example.aplikasilogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        var username = "rizuki"
        var password = "123"

        if (et_username.text.toString() == "") {
            var myToast =  Toast.makeText(this, "Username Wajib di Isi!", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.TOP, 0, 500)
            myToast.show()
            et_username.error = "Masukkan Username"
        } else if (et_password.text.toString() == "") {
            var myToast =  Toast.makeText(this, "Password Wajib di Isi!", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
            et_password.error = "Masukkan Password"
        } else if (et_username.text.toString() == username && et_password.text.toString() == password) {
            var myToast =  Toast.makeText(this, "Selamat Anda Berhasil Login AGENT SIMONTOK!", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        } else {
            var myToast =  Toast.makeText(this, "Username / Password Anda Salah, Harap Periksa Kembali Username /  Password Anda", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        }

    }
}