package com.example.jake.yourcustomsoundboard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import butterknife.BindView
import butterknife.ButterKnife
import com.example.jake.yourcustomsoundboard.ui.help.HelpActivity
import com.example.jake.yourcustomsoundboard.util.EqualSpacingItemDecoration

class MainSoundboardActivity : AppCompatActivity() {

    @BindView(R.id.rv_sounds)
    var mSoundsRecycler : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        mSoundsRecycler?.layoutManager = GridLayoutManager(this, 3)
        mSoundsRecycler?.addItemDecoration(EqualSpacingItemDecoration(16))
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.main_menu,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.action_settings){
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            return true
        }
        else if (item?.itemId == R.id.action_help){
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
