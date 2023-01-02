package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Bttambah : Button
    private lateinit var Btminus : Button
    private lateinit var Btkali : Button
    private lateinit var Btbagi : Button
    private lateinit var Bthapus : Button
    private lateinit var bil1 : EditText
    private lateinit var bil2 : EditText
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bttambah = findViewById(R.id.Bttambah)
        Btminus = findViewById(R.id.Btminus)
        Btkali = findViewById(R.id.Btkali)
        Btbagi = findViewById(R.id.Btbagi)
        Bthapus = findViewById(R.id.Bthapus)
        bil1    = findViewById(R.id.etbil1)
        bil2    = findViewById(R.id.etbil2)
        hasil    = findViewById(R.id.Hasil)

        Bttambah.setOnClickListener { tambah() }
        Btminus.setOnClickListener { minus() }
        Btkali.setOnClickListener { kali() }
        Btbagi.setOnClickListener { bagi() }
        Bthapus.setOnClickListener { HAPUS() }

    }
    fun tambah() {

        val hitung = bil1.text.toString().toInt() + bil2.text.toString().toInt()
        hasil.text = hitung.toString()
    }
    fun minus() {

        val hitung = bil1.text.toString().toInt() - bil2.text.toString().toInt()
        hasil.text = hitung.toString()
    }
    fun kali() {

        val hitung = bil1.text.toString().toInt() * bil2.text.toString().toInt()
        hasil.text = hitung.toString()
    }
    fun bagi() {

        val hitung = bil1.text.toString().toInt() / bil2.text.toString().toInt()
        hasil.text = hitung.toString()
    }
    private fun HAPUS (){

            hasil.text = 0.toString()
            bil1.text = null
            bil2.text = null
    }
}