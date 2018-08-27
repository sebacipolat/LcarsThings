package cipolat.com.lcarsthings.CustomViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import cipolat.com.lcarsthings.R;

public class LcarTextView extends TextView {

    private Animation animationBlink;
    private Context ctx;
    private boolean blinkEnabled = false;


    public LcarTextView(Context context) {
        super(context);
        this.ctx = context;
        setupView();
    }

    public LcarTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ctx = context;
        setupView();
    }

    public LcarTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, R.style.StarTrek);
        this.ctx = context;
        setupView();
    }

    public LcarTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, R.style.StarTrek);
        this.ctx = context;
        setupView();
    }

    private void setupView() {
        setTextAppearance(ctx, R.style.StarTrek);
        animationBlink = AnimationUtils.loadAnimation(ctx, R.anim.blink);
    }

    public void startBlink() {
        this.blinkEnabled = true;
        startAnimation(animationBlink);
    }

    public void stopBlink() {
        this.blinkEnabled = false;
        clearAnimation();
        animationBlink.cancel();
    }

}
