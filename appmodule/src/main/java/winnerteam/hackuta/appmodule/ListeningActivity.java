package winnerteam.hackuta.appmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ListeningActivity extends AppCompatActivity {

    private ImageView imageView;
    public static final String TAG=MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

        // Call the init() method
    }



    private void init(){

        imageView=(ImageView) findViewById(R.id.microphone);
        if(imageView==null) Log.d(TAG,"Imageview is null");
        else {
            final Animation animShake = AnimationUtils.loadAnimation(this, R.anim.shake);
            imageView.startAnimation(animShake);
        }

    }
}
