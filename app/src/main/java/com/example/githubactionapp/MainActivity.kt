package com.example.githubactionapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubactionapp.databinding.ActivityMainBinding

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val url =getString(R.string.base_url)
        val buildType = com.example.githubactionapp.BuildConfig.BUILD_TYPE
        binding?.envUrl?.text = "buildTypeTask1 $buildType \n\nenvUrl $url"
    }
}