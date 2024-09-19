package com.example.tugasintegrasiactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasintegrasiactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari halaman Register
        val registeredUsername = intent.getStringExtra("EXTRA_USERNAME")
        val registeredPassword = intent.getStringExtra("EXTRA_PASSWORD")
        val registeredEmail = intent.getStringExtra("EXTRA_EMAIL")
        val registeredPhone = intent.getStringExtra("EXTRA_PHONE")
        val registeredGender = intent.getStringExtra("EXTRA_GENDER")

        with(binding) {
            loginButton.setOnClickListener {
                val inputUsername = usernameEditText.text.toString()
                val inputPassword = passwordEditText.text.toString()

                // Validasi username dan password
                if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
                    val intentToMain3 = Intent(this@MainActivity2, MainActivity3::class.java)
                    // Passing data ke halaman ke-3
                    intentToMain3.putExtra("EXTRA_USERNAME", registeredUsername)
                    intentToMain3.putExtra("EXTRA_EMAIL", registeredEmail)
                    intentToMain3.putExtra("EXTRA_PHONE", registeredPhone)
                    intentToMain3.putExtra("EXTRA_GENDER", registeredGender)
                    startActivity(intentToMain3)
                } else {
                    // Toast kesalahan login
                    Toast.makeText(this@MainActivity2, "Username atau Password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
