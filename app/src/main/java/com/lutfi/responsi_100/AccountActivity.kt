package com.lutfi.responsi_100

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupWindow
import android.widget.TextView

class AccountActivity : AppCompatActivity() {

    private lateinit var namaLengkap :TextView
    private lateinit var lahir :TextView
    private lateinit var UserA :TextView
    private lateinit var Pw :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        namaLengkap = findViewById(R.id.TV5)
        lahir = findViewById(R.id.TV6)
        UserA = findViewById(R.id.TV7)
        Pw = findViewById(R.id.TV8)

        var nama :String? = ""
        var ttl  :String? = ""
        var User :String? = ""
        var Pass :String? = ""

        if (intent.extras != null){
            val bundle = intent.extras
            nama = bundle?.getString("nama")
            ttl  = bundle?.getString("ttl")
            User = bundle?.getString("User")
            Pass = bundle?.getString("Pass")

            namaLengkap.setText("Nama Lengkap : "+nama)
            lahir.setText("Tanggal Lahir : "+ttl)
            UserA.setText("Username : "+User)
            Pw.setText("Password    : "+Pass)
        }
    }
}
