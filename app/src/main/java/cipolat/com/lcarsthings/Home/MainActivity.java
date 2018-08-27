package cipolat.com.lcarsthings.Home;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import cipolat.com.lcarsthings.CustomViews.LcarTextView;
import cipolat.com.lcarsthings.R;

public class MainActivity extends Activity {
    LcarTextView mainLbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set up notitle
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set up full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mainLbl = findViewById(R.id.mainLbl);
        mainLbl.startBlink();
    }

}
