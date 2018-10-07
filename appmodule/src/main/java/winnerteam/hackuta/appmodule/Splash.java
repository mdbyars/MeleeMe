package winnerteam.hackuta.appmodule;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

public class Splash extends AppCompatActivity {

    private Boolean firstTime = null;
    public static final String TAG=Splash.class.getSimpleName();
    private PrefsManager prefsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefsManager = new PrefsManager(this);
        if (!prefsManager.isFirstTimeLaunch()){
            launchMainActivity();
            finish();
        }

        setContentView(R.layout.activity_splash);

        PaperOnboardingPage scr1 = new PaperOnboardingPage("Melee Up!!",
                "Awesome app for ",
                Color.parseColor("#678FB4"), R.drawable.super_smash, R.drawable.ic_keyboard_voice_black_24dp);
        PaperOnboardingPage scr2 = new PaperOnboardingPage("Banks",
                "We carefully verify all banks before add them into the app",
                Color.parseColor("#65B0B4"), R.drawable.super_smash_1, R.drawable.ic_record_voice_over_black_24dp);
        PaperOnboardingPage scr3 = new PaperOnboardingPage("Stores",
                "All local stores are categorized for your convenience",
                Color.parseColor("#9B90BC"), R.drawable.smash, R.drawable.ic_videogame_asset_black_24dp);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);

        PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(elements);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.user_onboarding_fragment_container, onBoardingFragment);
        fragmentTransaction.commit();


        onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {

                launchMainActivity();
            }
        });


    }


    /**
     * Checks if the user is opening the app for the first time.
     * Note that this method should be placed inside an activity and it can be called multiple times.
     * @return boolean
     */

    private void launchMainActivity() {
        prefsManager.setFirstTimeLaunch(false);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
