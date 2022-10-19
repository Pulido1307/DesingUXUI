package com.polar.industries.desinguxui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.polar.industries.desinguxui.R
import com.polar.industries.desinguxui.models.Contacto

class AdapterContacto(private val context: Context, val contactoList: ArrayList<Contacto>): RecyclerView.Adapter<AdapterContacto.contactHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.card_contacto, parent, false)
        return contactHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactHolder, position: Int) {
        val contactoActual: Contacto = contactoList[position]

        holder.textViewNombre.text = contactoActual.nombre
        holder.textViewNumero.text = contactoActual.numero
    }

    override fun getItemCount(): Int {
        return contactoList.size
    }


    inner class contactHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewNombre: TextView = itemView.findViewById(R.id.textViewNombre)
        val textViewNumero: TextView = itemView.findViewById(R.id.textViewNumero)
    }
}