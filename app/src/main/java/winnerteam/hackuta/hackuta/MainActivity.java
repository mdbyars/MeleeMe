package winnerteam.hackuta.hackuta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import winnerteam.hackuta.appmodule.ListeningActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goNext(Intent intent){

        Intent intent=new Intent(this, ListeningActivity.class);
        startActivity(intent);


    }



}

