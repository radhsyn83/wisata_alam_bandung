package id.bandros.wisataalambandung

import id.bandros.wisataalambandung.model.WisataFotoModel
import id.bandros.wisataalambandung.model.WisataModel
import java.util.ArrayList

object WisataData {
    fun list() : ArrayList<WisataModel> {
        val wisataList = ArrayList<WisataModel>()

        wisataList.add(WisataModel(
                "De Ranch Lembang, Alay Koboy Bandung",
                "De Ranch Lembang merupakan salah satu tempat liburan di Lembang yang populer. Tempatnya strategis, ngga jauh dari pusat kota Lembang sehingga mudah dijangkau. Konsep tempat wisata keluarga di Bandung ini mengusung konsep Western/Cowboy. Kita bisa bermain atau menunggang kuda, berfoto dengan kostum koboy yang tersedia, mengelilingi area dengan kuda, dan lain sebagainya.",
                "Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391.",
                "https://www.nativeindonesia.com/de-ranch-lembang/",
                -6.815118355085042,
                107.62661565095186,
                "082272605775",
                arrayOf(WisataFotoModel(R.drawable.de_ranch_lembang_bandung_1), WisataFotoModel(R.drawable.de_ranch_lembang_bandung_2), WisataFotoModel(R.drawable.de_ranch_lembang_bandung_3))
        )
        )

        wisataList.add(WisataModel(
                "Jendela Alam",
                "Jendela Alam adalah Arena belajar,tempat outbound dan rekreasi untuk anak-anak  dan dewasa dengan sentuhan alam yang indah dan udara yang sejuk, cocok pula sebagai tempat wisata keluarga untuk mengenal alam",
                "Lokasi Jendela Alam Lembang berada di dalam kompleks Graha Puspita, Jl. Sersan Bajuri Km. 4,5 Cihideung, Lembang, Bandung Barat.",
                "https://www.nativeindonesia.com/jendela-alam/",
                -6.8193725565882835,
                107.59640559554099,
                "082272605775",
                arrayOf(WisataFotoModel(R.drawable.jendela_alam_bandung_1), WisataFotoModel(R.drawable.jendela_alam_bandung_1), WisataFotoModel(R.drawable.jendela_alam_bandung_1))
        )
        )

        wisataList.add(WisataModel(
                "Kebun Teh Sukawana Bandung",
                "Kebun Teh Sukawana berada di bawah PTPN VIII, termasuk dalam kebun Bukit unggul, nama ini berasal dari nama Van Houten, seorang meneer Belanda yang memiliki perkebunan disini.",
                "Karyawangi, Parongpong",
                "https://www.nativeindonesia.com/kebun-teh-sukawana/",
                -6.776905420291548,
                107.58390180766582,
                "082272605775",
                arrayOf(WisataFotoModel(R.drawable.kebun_teh_sukawana_1), WisataFotoModel(R.drawable.kebun_teh_sukawana_2), WisataFotoModel(R.drawable.kebun_teh_sukawana_3))
        )
        )

        wisataList.add(WisataModel(
                "Situ Cisanti Bandung",
                "Situ Cisanti, danau kecil ini memang masih kalah dengan nama danau atau situ lain di Bandung seperti situ patenggang atau situ cileunca. Meskipun demikian, ternyata tempatnya ga kalah indah lho. Bahkan dalam beberapa hal bisa dikatakan lebih adem. Situ/danau Cisanti merupakan titik nol atau hulu sungai citarum, salah satu sungai terbesar di jawa barat yang dikenal dengan polusinya. Sepertinya ga bakal nyangka kalau sungai citarum yang kotor berawal dari tempat yang begitu bersih dan indah.",
                "Kampung Pejaten, Desa Tarumajaya, Kecamatan Kertasari kabupaten Bandung",
                "https://www.nativeindonesia.com/situ-cisanti-bandung/",
                -7.208453392835664,
                107.65708822757006,
                "082272605775",
                arrayOf(WisataFotoModel(R.drawable.situ_cisanti_bandung_1), WisataFotoModel(R.drawable.situ_cisanti_bandung_2), WisataFotoModel(R.drawable.situ_cisanti_bandung_3))

        )
        )

        wisataList.add(WisataModel(
                "Pinisi Resto & Glamping Lakeside Rancabali Bandung",
                "Tempat wisata baru di Bandung selatan nih,  Glamping Lakeside Rancabali Glamping Lakeside Rancabali dan Pinisi Resto Rancabali Tempatnya cukup unik, bisa memberikan suasana baru buat kamu yang mau liburan di Bandung selatan.",
                "Lokasi Glamping Lakeside Rancabali Bandung berada tepat di pinggir Situ patenggang.",
                "https://www.nativeindonesia.com/pinisi-resto-dan-glamping-lakeside-rancabali-bandung/",
                -7.167030230848054,
                107.35418133437634,
                "082272605775",
                arrayOf(WisataFotoModel(R.drawable.pinisi_resto_rancabali_bandung_1), WisataFotoModel(R.drawable.pinisi_resto_rancabali_bandung_2), WisataFotoModel(R.drawable.pinisi_resto_rancabali_bandung_3))
        )
        )

        return wisataList
    }

}