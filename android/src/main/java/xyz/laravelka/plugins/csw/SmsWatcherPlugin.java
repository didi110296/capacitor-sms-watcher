package xyz.laravelka.plugins.csw;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "SmsWatcher")
public class SmsWatcherPlugin extends Plugin {

    // private SmsWatcher implementation = new SmsWatcher();

    private SmsMonitor smsMonitor;

    @PluginMethod
    public void watch(PluginCall call) {
        // String value = call.getString("value");

        smsMonitor =
            new smsMonitor() {
                @Override
                protected void onNewSms(String from, String body) {
                    Log.i("message", from + ": " + body);
                    JSObject ret = new JSObject();
                    ret.put("from", from);
                    ret.put("body", body);
                    call.resolve(ret);
                }
            };
    }
}
