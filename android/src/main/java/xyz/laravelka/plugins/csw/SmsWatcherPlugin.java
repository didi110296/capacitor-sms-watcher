package xyz.laravelka.plugins.csw;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "SmsWatcher")
public abstract class SmsWatcherPlugin extends Plugin {

    // private SmsWatcher implementation = new SmsWatcher();

    private SmsMonitor smsMonitor;

    @PluginMethod
    public void watch(PluginCall call) {
        // String value = call.getString("value");

        smsMonitor =
            new SmsMonitor() {
                @Override
                protected void onNewSms(String from, String body) {
                    JSObject ret = new JSObject();
                    ret.put("from", from);
                    ret.put("body", body);

                    notifyListeners("message", ret);
                }
            };
    }
}
