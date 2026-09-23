package com.example.shazam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    // Contoh kondisi loading data awal (misal: cek status login/koneksi)
    private var isDataReady = false

    override fun onCreate(savedInstanceState: Bundle?) {
        // 1. Inisialisasi Splash Screen
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2. Tahan Splash Screen tetap muncul sampai 'isDataReady' bernilai true
        splashScreen.setKeepOnScreenCondition {
            !isDataReady
        }

        // 3. Simulasi proses pemuatan data di latar belakang
        loadAppInitialData()
    }

    private fun loadAppInitialData() {
        // Contoh penundaan simulasi proses loading selama 2 detik
        Thread {
            Thread.sleep(2000) // Proses fetching data/koneksi
            isDataReady = true  // Setelah selesai, Splash Screen otomatis tertutup
        }.start()
    }
}