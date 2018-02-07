package arin.oops;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer oopsplayer;
    private MediaPlayer groanplayer;
    private MediaPlayer goplayer;
    Button oopsButton;
    Button groanButton;
    Button goButton;
    AsyncTask<Void, Void, Void> asyncTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oopsplayer = MediaPlayer.create(MainActivity.this, R.raw.oops);
        groanplayer = MediaPlayer.create(MainActivity.this, R.raw.arin_groan);
        goplayer = MediaPlayer.create(MainActivity.this, R.raw.we_go);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        oopsButton = (Button) findViewById(R.id.button6);
        groanButton = (Button) findViewById(R.id.button8);
        goButton = (Button) findViewById(R.id.button7);

        oopsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oopsplayer.isPlaying()) {
                    oopsplayer.seekTo(0);
                }
                oopsplayer.start();
            }
        });

        groanButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (groanplayer.isPlaying()) {
                    groanplayer.seekTo(0);
                }
                groanplayer.start();
            }
        });

        goButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (goplayer.isPlaying()) {
                    goplayer.seekTo(0);
                }
                goplayer.start();
            }
        });
    }
}
