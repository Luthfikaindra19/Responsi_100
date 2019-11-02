package com.lutfi.responsi_100

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

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
        }

        btnAkun.setOnClickListener() {
            val intent = Intent(this,AccountActivity::class.java)
            startActivity(intent)
            intent.putExtra("nama",nama)
            intent.putExtra("ttl",ttl)
            intent.putExtra("User",User)
            intent.putExtra("pass",Pass)
        }

        listView = findViewById(R.id.listwiew)
        var list = mutableListOf<Model>()

        list.add(
            Model(
                "Gula",
                "gula tuh manis kek aku",
                R.drawable.gula
            )
        )
        list.add(
            Model(
                "Kecap",
                "kalo ini kek dia manisnya",
                R.drawable.kecap
            )
        )
        list.add(
            Model(
                "keju",
                "Berwarna kuning tapi mahal",
                R.drawable.keju
            )
        )
        list.add(
            Model(
                "Kopi",
                "Pait tapi enak ",
                R.drawable.kopi
            )
        )
        list.add(
            Model(
                "Mie",
                "Pkebanyakan bisa merusak lambung",
                R.drawable.mie
            )
        )
        list.add(
            Model(
                "Minyak",
                "minyak itu buat nggoreng",
                R.drawable.minyak
            )
        )
        list.add(
            Model(
                "Oreo",
                "Diputar di dilat dicelupin",
                R.drawable.oreo
            )
        )
        list.add(
            Model(
                "SUSU",
                "Enak Menyegarkan",
                R.drawable.susu
            )
        )
        list.add(
            Model(
                "Tango",
                "enak kalo sambil ngopi",
                R.drawable.tango
            )
        )
        list.add(
            Model(
                "teh",
                "Nikmat jika diminum berdua apalagi sama dia",
                R.drawable.teh
            )
        )

        listView.adapter = MyListAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { parent, view, position, id ->


            if (position == 0) {
                Toast.makeText(this@HomeActivity, "Gula", Toast.LENGTH_SHORT).show()
            }
            if (position == 1) {
                Toast.makeText(this@HomeActivity, "Kecap", Toast.LENGTH_SHORT).show()
            }
            if (position == 2) {
                Toast.makeText(this@HomeActivity, "Keju", Toast.LENGTH_SHORT).show()
            }
            if (position == 3) {
                Toast.makeText(this@HomeActivity, "Kopi", Toast.LENGTH_SHORT).show()
            }
            if (position == 4) {
                Toast.makeText(this@HomeActivity, "Mie", Toast.LENGTH_SHORT).show()
            }
            if (position == 5) {
                Toast.makeText(this@HomeActivity, "Minyak", Toast.LENGTH_SHORT).show()
            }
            if (position == 6) {
                Toast.makeText(this@HomeActivity, "Orea", Toast.LENGTH_SHORT).show()
            }
            if (position == 7) {
                Toast.makeText(this@HomeActivity, "Susu", Toast.LENGTH_SHORT).show()
            }
            if (position == 8) {
                Toast.makeText(this@HomeActivity, "Tango", Toast.LENGTH_SHORT).show()
            }
            if (position == 9) {
                Toast.makeText(this@HomeActivity, "Teh", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
