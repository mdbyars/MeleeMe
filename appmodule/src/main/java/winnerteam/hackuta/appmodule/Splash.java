package winnerteam.hackuta.appmodule;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class Splash extends AppCompatActivity {

    private Boolean firstTime = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (isFirstTime()){

            PaperOnboardingPage scr1 = new PaperOnboardingPage("Melee Up!!",
                    "Awesome app for ",
                    Color.parseColor("#678FB4"), R.drawable.super_smash, R.drawable.ic_keyboard_voice_black_24dp);
            PaperOnboardingPage scr2 = new PaperOnboardingPage("Banks",
                    "We carefully verify all banks before add them into the app",
                    Color.parseColor("#65B0B4"), R.drawable.banks, R.drawable.ic_record_voice_over_black_24dp);
            PaperOnboardingPage scr3 = new PaperOnboardingPage("Stores",
                    "All local stores are categorized for your convenience",
                    Color.parseColor("#9B90BC"), R.drawable.stores, R.drawable.ic_videogame_asset_black_24dp);

            ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
            elements.add(scr1);
            elements.add(scr2);
            elements.add(scr3);
        }
    }


    /**
     * Checks if the user is opening the app for the first time.
     * Note that this method should be placed inside an activity and it can be called multiple times.
     * @return boolean
     */
    private boolean isFirstTime() {
        if (firstTime == null) {
            SharedPreferences mPreferences = this.getSharedPreferences("first_time", Context.MODE_PRIVATE);
            firstTime = mPreferences.getBoolean("firstTime", true);
            if (firstTime) {
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putBoolean("firstTime", false);
                editor.commit();
            }
        }
        return firstTime;
    }
}
