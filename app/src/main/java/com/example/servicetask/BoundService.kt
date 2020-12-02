package com.example.servicetask

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class BoundService:Service(){
    private var binder:IBinder = MyBinder()

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }
    class MyBinder: Binder(){
        fun getBoundService():BoundService{
            return BoundService()
        }
    }
}