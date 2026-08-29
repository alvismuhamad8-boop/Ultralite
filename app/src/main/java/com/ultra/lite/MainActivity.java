package com.ultra.lite;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        TextView tv=new TextView(this);
        tv.setText("UltraLite Jalan Bro");
        setContentView(tv);
    }
}
