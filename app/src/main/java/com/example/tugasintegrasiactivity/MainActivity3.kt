package com.example.tugasintegrasiactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasintegrasiactivity.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari halaman Login
        val username = intent.getStringExtra("EXTRA_USERNAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val phone = intent.getStringExtra("EXTRA_PHONE")
        val gender = intent.getStringExtra("EXTRA_GENDER")

        with(binding) {
            // Tampilkan data di TextView
            usernameTextView.text = "Username: $username"
            emailTextView.text = "Email: $email"
            phoneTextView.text = "Phone: $phone"
            genderTextView.text = "Gender: $gender"
        }
    }
}
