package com.swagVideo.in.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.widget.Toast;

public class LocationUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
            Toast.makeText(context, "in android.location.PROVIDERS_CHANGED",
                    Toast.LENGTH_SHORT).show();
//            Intent pushIntent = new Intent(context, LocalService.class);
//            context.startService(pushIntent);
        } else {
            Toast.makeText(context, "not in android.location.PROVIDERS_CHANGED",
                    Toast.LENGTH_SHORT).show();
            /*Intent pushIntent = new Intent(context, LocalS.class);
            context.startService(pushIntent);*/
        }
    }

}