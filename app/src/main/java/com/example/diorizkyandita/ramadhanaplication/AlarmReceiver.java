package com.example.diorizkyandita.ramadhanaplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by Dio Rizkyandita on 30/05/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {
    MediaPlayer azanPlayer;
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm Aktif", Toast.LENGTH_LONG).show();
        azanPlayer = MediaPlayer.create(context, R.raw.azan);
        azanPlayer.start();
    }
}
