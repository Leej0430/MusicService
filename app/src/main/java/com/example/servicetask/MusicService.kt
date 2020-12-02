package com.example.servicetask

import android.app.IntentService
import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.media.MediaPlayer
import android.net.Uri
import android.os.IBinder
import android.util.Log

private const val TAG = "MusicService"
class MusicService : IntentService("MusicService"){
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate")
        mediaPlayer= MediaPlayer.create(this,R.raw.music)


    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG,"onHandleIntent: ")
        mediaPlayer.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
         super.onStartCommand(intent, flags, startId)
        mediaPlayer.start()
        return Service.START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy: ")
        mediaPlayer.stop()
    }
    private val serviceConnection=
            object:ServiceConnection{
                override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                 
                }

                override fun onServiceDisconnected(name: ComponentName?) {

                }
            }

}