package com.roque.carlos.tecsupfy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.roque.carlos.tecsupfy.databinding.ItemMusicBinding

class MusicsAdapter(
    private val listMusic: List<Music>
): RecyclerView.Adapter<MusicsAdapter.MusicViewHolder>() {

    /**
     * Proporciona una referencia al tipo de vistas que está utilizando
     * (custom ViewHolder).
     */

    class MusicViewHolder(
        private val binding: ItemMusicBinding
    ): RecyclerView.ViewHolder(binding.root) {
        val picture: ImageView = binding.pictureImage
        val name: TextView = binding.nameText
        val artista: TextView = binding.artistaText
        val tipo: ImageView = binding.tipoText
        val additionalText: TextView = binding.aditionalText
        val btnplay: ImageButton = binding.play2
        val btnpause: ImageButton = binding.play
        val btnViewDetail: Button = binding.btnmusic
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        // Crear una nueva vista, que define la interfaz de usuario del elemento de la lista
        val itemBinding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(itemBinding)
    }

    // Reemplazar el contenido de una vista (invocado por el administrador de diseño)
    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        // Obtenga el elemento de su conjunto de datos en esta posición y reemplace el contenido de la vista con ese elemento
        val music: Music = listMusic[position]

        val context = holder.itemView.context

        val idRes = context.resources.getIdentifier(music.picture, "drawable", context.packageName)


        holder.name.text = music.name
        holder.artista.text = music.artista
        holder.picture.setImageResource(idRes)

        if (music.id == 100) {
            holder.artista.visibility = View.VISIBLE
        }

        if (music.tipo == "rock"){
            holder.tipo.visibility = View.VISIBLE
        }

        if (music.id > 90) {
            holder.itemView.setOnClickListener {
                Toast.makeText(context, "Click: ${music.name}", Toast.LENGTH_SHORT).show()
            }
        }

        holder.btnplay.visibility = View.VISIBLE
        holder.btnplay.setOnClickListener {
            Toast.makeText(context, "Reproduciendo ${music.name}", Toast.LENGTH_SHORT).show()
        }

        holder.btnpause.visibility = View.VISIBLE
        holder.btnpause.setOnClickListener {
            Toast.makeText(context, "Pausando ${music.name}", Toast.LENGTH_SHORT).show()
        }

        holder.btnViewDetail.visibility = View.VISIBLE
        holder.btnViewDetail.setOnClickListener {
            Toast.makeText(context, "Show Detail Teacher ${music.name}", Toast.LENGTH_SHORT).show()
        }
    }

    //Devuelve el tamaño de tu conjunto de datos (invocado por el administrador de diseño)
    override fun getItemCount(): Int {
        return listMusic.size
    }

}