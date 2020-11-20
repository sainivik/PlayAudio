package com.vikas.playaudio

import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.vikas.playaudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setMediaPlayer()
    }

    private fun setMediaPlayer() {
        mediaPlayer = MediaPlayer.create(this, R.raw.sprinkle)
        mediaPlayer!!.setOnPreparedListener { }
        binding.ivPush.setOnTouchListener { _, event ->
            handleTouch(event)
            true
        }
    }

    private fun handleTouch(event: MotionEvent) {

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                mediaPlayer.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
                mediaPlayer.pause()
                mediaPlayer.seekTo(0)
            }
        }
    }
}