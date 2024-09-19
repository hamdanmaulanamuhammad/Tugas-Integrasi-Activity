package com.example.tugasintegrasiactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasintegrasiactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            signUpButton.setOnClickListener {
                val username = UsernameEditText.text.toString()
                val email = EmailEditText.text.toString()
                val phone = PhoneEditText.text.toString()
                val password = PasswordEditText.text.toString()
                val gender = if (maleRadioButton.isChecked) "Male" else "Female"

                // Passing data ke halaman Login
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                intent.putExtra("EXTRA_EMAIL", email)
                intent.putExtra("EXTRA_PHONE", phone)
                intent.putExtra("EXTRA_PASSWORD", password)
                intent.putExtra("EXTRA_GENDER", gender)
                startActivity(intent)
            }
        }
    }
}
