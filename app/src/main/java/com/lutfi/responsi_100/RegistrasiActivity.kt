package com.lutfi.responsi_100

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registrasi.*

class RegistrasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val nama: EditText = findViewById(R.id.nm)
        val ttl: EditText = findViewById(R.id.ttl)
        val id_us2: EditText = findViewById(R.id.id_Us2)
        val id_pas2: EditText = findViewById(R.id.id_pas2)

        btn_reg6.setOnClickListener () {
            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("nama", nama.text)
            intent.putExtra("ttl", ttl.text)
            intent.putExtra("id_us2", id_us2.text)
            intent.putExtra("id_pas2", id_pas2.text)
            Toast.makeText(this, "akun berhasil di Registrasi", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

    }


}






    
