package com.example.makecalldemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, Intent intent) {
		if (intent.getAction().equals(MyCallReceiver.CUSTOM_INTENT)) {
			System.out.println("GOT THE INTENT");
			//final String mobileNumber = intent.getExtras().getString("number");
			Thread thread = new Thread() {
				private int sleepTime = 400;

				@Override
				public void run() {
					super.run();
					try {
						int wait_Time = 0;

						while (wait_Time < sleepTime) {
							sleep(100);
							wait_Time += 100;
						}
					} catch (Exception e) {
						Toast.makeText(context,
								"Error Occured Because:" + e.getMessage(),
								Toast.LENGTH_SHORT).show();
					} finally {

					}

					context.startActivity(new Intent(context,
							MainActivity.class)
							.putExtra("number", "67544647").setFlags(
									Intent.FLAG_ACTIVITY_NEW_TASK));
				}
			};
			thread.run();
		}
	}
}