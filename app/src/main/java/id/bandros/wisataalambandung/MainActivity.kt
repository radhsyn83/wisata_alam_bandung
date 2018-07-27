package id.bandros.wisataalambandung

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import id.bandros.wisataalambandung.adapter.WisataAdapter
import id.bandros.wisataalambandung.model.WisataFotoModel
import id.bandros.wisataalambandung.model.WisataModel
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import java.util.*


class MainActivity : AppCompatActivity(), WisataAdapter.Listener {

    private lateinit var wisataList: ArrayList<WisataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wisataList = WisataData.list()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val wstaAdapter = WisataAdapter(this, wisataList, this)
        rv_wisata.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = wstaAdapter
        }
    }


    override fun onItemClick(pos: Int) {
        startActivity(intentFor<DetailActivity>(
                Const.POSITION to pos
        ))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_info -> {
//                startActivity<ContactActivity>()
                toast("Comming Soon")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
