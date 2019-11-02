package com.lutfi.responsi_100

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var id_us1: EditText
    private lateinit var id_pas1:EditText
    private lateinit var btn_log1: Button
    private lateinit var btn_Reg2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        id_us1 = findViewById(R.id.id_us1)
        id_pas1 = findViewById(R.id.id_pas1)
        btn_log1 = findViewById(R.id.btn_log1)
        btn_Reg2 = findViewById(R.id.btn_reg2)

        var nama :String? = ""
        var ttl  :String? = ""
        var User :String? = ""
        var Pass :String? = ""

        if (intent.extras != null){
            val bundle = intent.extras
            nama = bundle?.getString("name")
            ttl  = bundle?.getString("ttl")
            User = bundle?.getString("User")
            Pass = bundle?.getString("Pass")
        }

        btn_log1.setOnClickListener (){
            if (id_us1.text.toString() == "Kurakura" && id_pas1.text.toString() == "ninja"){
                val intent = Intent(this,HomeActivity::class.java)
                intent.putExtra("nama",nama)
                intent.putExtra("ttl",ttl)
                intent.putExtra("User",User)
                intent.putExtra("Pass",Pass)

                Toast.makeText(this,"Log in Berhasil",Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }

        }
        btn_reg2.setOnClickListener {
            val intent = Intent(this, RegistrasiActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
