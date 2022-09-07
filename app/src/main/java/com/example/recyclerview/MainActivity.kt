package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ContactAdapter
import com.example.recyclerview.data.MyContact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSeeTheChallenge = findViewById<Button>(R.id.btn_see_the_challenge)
        btnSeeTheChallenge.setOnClickListener {
            startActivity(Intent(this,ChallengeActivity::class.java))
        }

        val listContact = arrayListOf(
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333"),
            MyContact("Roisul","082133333333")
        )

        // membuat object untuk adapter
        val adapter = ContactAdapter(listContact)

        // membuat layout manajer
        val layoutManajer = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // memanggil recyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rv_content_contact)

        // set layout manajer ke dalam recyclerview
        recyclerView.layoutManager = layoutManajer

        // set adapter pada recyclerView
        recyclerView.adapter = adapter

    }
}