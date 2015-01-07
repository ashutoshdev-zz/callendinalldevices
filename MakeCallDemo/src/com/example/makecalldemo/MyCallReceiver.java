package com.example.makecalldemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyCallReceiver extends BroadcastReceiver{
	 public static final String CUSTOM_INTENT = "com.example.makecalldemo.intent.action.TEST";
	Context context = null;
	 private static final String TAG = "Phone call";



	public void onReceive(Context context, Intent intent) {

	    Bundle extras = intent.getExtras();
	    if (extras != null) {
	        String state = extras.getString(TelephonyManager.EXTRA_STATE);
	        Log.w("DEBUG", state);
	        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {

//	                    Intent i = new Intent();
//	                    i.setAction(CUSTOM_INTENT);
//	                    context.sendBroadcast(i);

	        }
	    }
	}
	}
