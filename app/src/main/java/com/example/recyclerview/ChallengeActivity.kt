package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ChallengeAdapter
import com.example.recyclerview.adapter.ContactAdapter
import com.example.recyclerview.data.MyChallenge

class ChallengeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)

        val listChallenge = arrayListOf(
            MyChallenge(R.drawable.sumatera_selatan,"Sumatera Selatan", "Rumah Limas"),
            MyChallenge(R.drawable.sumatera_barat,"Sumatera Barat", "Rumah Gadang"),
            MyChallenge(R.drawable.sulawesi_utara,"Sulawesi Utara", "Rumah Walewangko"),
            MyChallenge(R.drawable.sulawesi_tenggara,"Sulawesi Tenggara", "Rumah Buton"),
            MyChallenge(R.drawable.sulawesi_tengah,"Sulawesi Tengah", "Rumah Souraja"),
            MyChallenge(R.drawable.sulawesi_barat,"Sulawesi Barat", "Rumah Boyang"),
            MyChallenge(R.drawable.riau_rumah_selaso_jatuh,"Riau", "rumah selasa jatuh"),
            MyChallenge(R.drawable.papua_rumah_honey,"Papua", "Rumah honey"),
            MyChallenge(R.drawable.maluku_rumah_baileo,"Maluku", "Rumah Baileo"),
            MyChallenge(R.drawable.lampung_rumah_nuwo_sesat,"Lampung", "Rumah Nuwo Sesat"),
        )

        // membuat object untuk adapter
        val adapter = ChallengeAdapter(listChallenge)

        // membuat layout manajer
        val layoutManajer = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        // memanggil recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rv_content_challenge)

        // set layout manajer ke dalam recyclerview
        recyclerView.layoutManager = layoutManajer

        // set adapter pada recyclerView
        recyclerView.adapter = adapter
    }
}