package com.roque.carlos.tecsupfy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roque.carlos.tecsupfy.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var musicListRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        musicListRecyclerView = binding.musicsList
        musicListRecyclerView.layoutManager = LinearLayoutManager(this)
        val musics = MusicRepository()
        val musicsAdapter = MusicsAdapter(musics.musics)
        musicListRecyclerView.adapter = musicsAdapter
    }
}