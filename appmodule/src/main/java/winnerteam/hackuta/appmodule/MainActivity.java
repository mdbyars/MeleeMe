package winnerteam.hackuta.appmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartNow(View view){
        Intent intent=new Intent(this, ListeningActivity.class);
        startActivity(intent);
        populateCharacters();

    }

    private void populateCharacters() {
        Log.i(TAG, "populateCharacters: ");

        Character

    }


}
