package com.maxdexter.mytelegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.maxdexter.mytelegram.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawer: Drawer
    private lateinit var header: AccountHeader
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()


    }

    private fun createHeader() {
        header = AccountHeaderBuilder().withActivity(this)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem().withName("Max Sazonov")
                    .withEmail("maxdexter@bk.ru")
            )
            .build()
    }

    private fun initFunc() {
        setSupportActionBar(toolbar)
        createHeader()
        createDrawer()
    }

    private fun createDrawer() {
        drawer = DrawerBuilder()
            .withActivity(this)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(header)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("Создать группу")
                    .withSelectable(false)
            ).build()
    }

    private fun initFields() {
        toolbar = binding.mainToolbar
    }
}