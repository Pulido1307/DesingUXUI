package com.polar.industries.desinguxui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.polar.industries.desinguxui.adapters.AdapterContacto
import com.polar.industries.desinguxui.models.Contacto

class MainActivity : AppCompatActivity() {
    private lateinit var floatingActionButton: FloatingActionButton
    private lateinit var recyclerView: RecyclerView
    private var contactoList: ArrayList<Contacto> = arrayListOf(
        Contacto("Guadalupe Jazmin Becerra", "4521020643"),
        Contacto("Jonathan Alcazar Jurado", "4521020643"),
        Contacto("Antonio Pulido Virrueta", "4521020643"),
        Contacto("Michael Rayas Cervantes", "4521020643"),
        Contacto("Arnulfo Guevara Díaz", "4521020643"),
        Contacto("Vicente Aguilera Perez", "4526666924"),
        Contacto("Jazmin Becerra Morales", "4521020643"),
        Contacto("Maria Magdalena Gutierrez", "4521020643"),
        Contacto("Nayandanty Castillo Priego", "4521020643"),
        Contacto("Salvador Morado Quiroz", "4521020643"),
        Contacto("Melica Marel", "4521020643")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        floatingActionButton = findViewById(R.id.floatingActionButton)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView!!.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        val adapter = AdapterContacto(this@MainActivity, contactoList)
        recyclerView!!.adapter = adapter

        floatingActionButton.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, AddUserActivity::class.java)
            startActivity(intent)
        }
    }
}