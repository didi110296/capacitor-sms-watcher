package xyz.laravelka.plugins.csw;

import android.util.Log;

public class SmsWatcher {
    private SmsMonitor smsMonitor;

    public void run(String value) {
        smsMonitor = new smsMonitor() {
            @Override
            protected void onNewSms(from, message) {
                Log.i("message", from + ": " + message);
            }
        };
    }
}
