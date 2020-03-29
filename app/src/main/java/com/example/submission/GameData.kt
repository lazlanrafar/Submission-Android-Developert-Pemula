package com.example.submission

object GameData {
    private val gameNames = arrayOf(
        "Grand Theft Auto",
        "The Sims",
        "Dota 2",
        "PlayerUnknown's Battlegrounds",
        "Auto Chess",
        "Lost Saga",
        "Point Blank",
        "Mobile Legends: Bang Bang",
        "God of War",
        "Dragon Nest"
    )

    private val gameDetail = arrayOf(
        "Grand Theft Auto adalah permainan video aksi-petualangan yang dibuat oleh DMA Design dan diterbitkan oleh Rockstar Games. Permainan ini memungkinkan pemain untuk mengambil peran seorang penjahat yang dapat berkeliaran dengan bebas di sekitar kota besar",
        "The Sims adalah sebuah serial permainan simulasi kehidupan yang dikembangkan oleh Maxis and The Sims Studio dan diterbitkan oleh Electronic Arts. Waralaba tersebut terjual hampir 200 juta di seluruh dunia, dan menjadi salah satu serial permainan video berpenjualan terbaik sepanjang masa",
        "Dota 2 adalah sebuah permainan Arena pertarungan daring multipemain, dan merupakan sekuel dari Defense of the Ancients mod pada Warcraft 3: Reign of Chaos dan Warcraft 3: The Frozen Throne",
        "PlayerUnknown's Battlegrounds adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim",
        "Diterjemahkan dari bahasa Inggris-Dota Auto Chess adalah mod video game strategi untuk video game Dota 2. Dikembangkan oleh Drodo Studio dan dirilis pada Januari 2019, permainan ini menampilkan elemen catur dan mendukung hingga delapan pemain.",
        "Lost Saga adalah game bebas untuk dimainkan dan berjenis 3D Casual Fighting. Permainan ini dikembangkan oleh IO Entertainment dari Korea Selatan.",
        "Point Blank adalah sebuah permainan komputer ber-genre FPS yang dimainkan secara online. Permainan ini dikembangkan oleh Zepetto dari Korea Selatan dan dipublikasikan oleh Zepetto.",
        "Mobile Legends: Bang Bang adalah sebuah permainan piranti bergerak berjenis MOBA yang dikembangkan dan diterbitkan oleh Moonton",
        "Diterjemahkan dari bahasa Inggris-God of War adalah waralaba game aksi-petualangan yang dibuat oleh David Jaffe di Sony Santa Monica Studio. Ini dimulai pada 2005 di konsol video game PlayStation 2, dan telah menjadi judul utama untuk merek PlayStation, yang terdiri dari delapan game di berbagai platform.",
        "Dragon Nest adalah sebuah MMORPG fantasi bebas yang dikembangkan oleh Eyedentity. Permainan ini memakai sistem manual sehingga para pemainnya memegang kendali penuh atas setiap gerakan karakternya."
    )
    private val gameImage = intArrayOf(R.drawable.gta,
        R.drawable.thesims,
        R.drawable.dota2,
        R.drawable.pubg,
        R.drawable.autochess,
        R.drawable.lostsaga,
        R.drawable.pointblank,
        R.drawable.mobilelegend,
        R.drawable.godofwar,
        R.drawable.dragonnest
    )

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices) {
                val game = Game()
                game.name = gameNames[position]
                game.detail = gameDetail[position]
                game.photo = gameImage[position]
                list.add(game)
            }
            return list
        }
}