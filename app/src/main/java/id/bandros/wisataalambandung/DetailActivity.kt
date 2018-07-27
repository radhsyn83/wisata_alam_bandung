package id.bandros.wisataalambandung

import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import id.bandros.wisataalambandung.adapter.DetailFotoAdapter
import id.bandros.wisataalambandung.model.WisataFotoModel
import id.bandros.wisataalambandung.model.WisataModel
import kotlinx.android.synthetic.main.activity_detail.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class DetailActivity : AppCompatActivity() {

    private var dotscount: Int = 0
    private var dots: Array<ImageView?>? = null
    private lateinit var wisataList: ArrayList<WisataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        val pos = intent.getIntExtra(Const.POSITION, 0)

        wisataList = WisataData.list()
        toolbar.title = wisataList[pos].nama

        navigasi.onClick {
            startActivity(intentFor<MapsActivity>(
                    "nama" to wisataList[pos].nama,
                    "lat" to wisataList[pos].lat.toString(),
                    "lon" to wisataList[pos].lon.toString()
            ))
        }

        loadProdukFoto(wisataList[pos].foto)
        sumber.text = wisataList[pos].sumber
        alamat.text = wisataList[pos].alamat
        deskripsi.text = wisataList[pos].deskripsi

        setUpMap()
    }

    fun loadProdukFoto(res: Array<WisataFotoModel>) {
        val sliderAdapter = DetailFotoAdapter(this, res)
        viewPager.setAdapter(sliderAdapter)

        dotscount = sliderAdapter.getCount()
        dots = arrayOfNulls<ImageView>(dotscount)

        for (i in 0 until dotscount) {
            dots!![i] = ImageView(this@DetailActivity)
            dots!![i]!!.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, R.drawable.dots_nonactive))
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.setMargins(5, 0, 5, 0)
            viewPager_dots.addView(dots!![i], params)
        }
        dots!![0]!!.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, R.drawable.dots_active))

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageSelected(position: Int) {
                for (i in 0 until dotscount) {
                    dots!![i]!!.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, R.drawable.dots_nonactive))
                }
                dots!![position]!!.setImageDrawable(ContextCompat.getDrawable(this@DetailActivity, R.drawable.dots_active))

                if (position == dotscount) {
                    viewPager.setCurrentItem(0)
                }

            }
            override fun onPageScrollStateChanged(state: Int) {}
        })
    }


    private fun setUpMap() {
        if (ActivityCompat.checkSelfPermission(this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), 1)
            return
        }
    }

}
