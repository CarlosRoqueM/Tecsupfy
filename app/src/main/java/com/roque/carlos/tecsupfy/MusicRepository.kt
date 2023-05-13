package com.roque.carlos.tecsupfy

class MusicRepository (val musics:MutableList<Music> = ArrayList()){

    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music(100, "21 Guns", "Green Day", "21","rock"))
        musics.add(Music(200, "Basket Case", "Green Day", "ic_music","rock"))
        musics.add(Music(300, "Labios Rotos", "Zoé", "ic_music",""))
        musics.add(Music(400, "Via Láctea", "Zoé", "ic_music",""))
        musics.add(Music(500, "Breathing", "Yellowcard", "ic_music","rock"))
        musics.add(Music(600, "Trouble", "Coldplay", "ic_music",""))
        musics.add(Music(700, "Shape Of My Heart", "Sting", "ic_music",""))
        musics.add(Music(800, "In My Place", "Coldplay", "ic_music","rock"))
        musics.add(Music(900, "The Perfect Girl", "Mareux", "ic_music","rock"))
        musics.add(Music(1000, "Heaven", "Bryan Adams", "ic_music","rock"))
        return musics
    }
}