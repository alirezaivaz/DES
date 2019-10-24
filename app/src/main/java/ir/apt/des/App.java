package ir.apt.des;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.Toast;
import java.util.Locale;

public class App extends Application {

    public static Typeface vazir;

    @Override
    public void onCreate() {
        super.onCreate();
        vazir = Typeface.createFromAsset(getAssets(), "vazir.ttf");

        Configuration newConfig  = new Configuration();
        newConfig.locale = Locale.ENGLISH;
        super.onConfigurationChanged(newConfig);
        Locale.setDefault(newConfig.locale);
        getBaseContext().getResources().updateConfiguration(newConfig, getResources().getDisplayMetrics());

    }

    public static void Loger (String m){
        Log.e("Alireza Tag",m);
    }

    public static void ToastMaker (Context c, String m){
        Toast.makeText(c, m, Toast.LENGTH_SHORT).show();
    }

}
