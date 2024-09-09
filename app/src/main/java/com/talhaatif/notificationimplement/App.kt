package com.talhaatif.notificationimplement

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class App : Application() {
     val n1 = "C_ID1"
     val n2 = "C_ID2"
    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            val channelN1 = NotificationChannel(n1,"C1",NotificationManager.IMPORTANCE_HIGH)
            channelN1.description="Hello T1"
            val channelN2 = NotificationChannel(n2,"C2",NotificationManager.IMPORTANCE_DEFAULT)
            channelN2.description="Hello T2"
            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channelN1)
            manager.createNotificationChannel(channelN2)


        }
    }
}