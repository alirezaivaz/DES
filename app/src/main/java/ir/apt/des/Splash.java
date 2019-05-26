package ir.apt.des;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends Activity {
    Intent intent;
    TextView header;
    TextView header2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.splash);

        header = findViewById(R.id.header);
        header2 = findViewById(R.id.header2);

        header.setTypeface(App.vazir);
        header2.setTypeface(App.vazir);

        intent = new Intent(Splash.this,MainActivity.class);

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();

            }
        }, 3000);

    }

}
