package com.example.cambiodemoneda

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.example.cambiodemoneda.ui.MainActivity
import com.example.cambiodemoneda.ui.MainActivity.Companion.MY_CHANNEL_ID

class AlarmNotification:BroadcastReceiver() {

    companion object{
        const val NOTIFICATION_ID = 1
    }

    override fun onReceive(context: Context, intent: Intent?) {

    }

    fun createSimpleNotification(context: Context){
        //Notificaciones
        val intent = Intent(context, MainActivity::class.java).apply{
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val flag = PendingIntent.FLAG_IMMUTABLE
        val pendingIntent: PendingIntent = PendingIntent.getActivity(context, 0, intent, flag)


            val notification = NotificationCompat.Builder(context, MY_CHANNEL_ID)
                .setSmallIcon(R.drawable.outline_circle_notifications_24)
                .setContentTitle("Cerro el precio del día de hoy")
                .setContentText("Entra en la aplicación para ver los valores finales del día")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_ID, notification)

    }
}