import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button play, forward, rewind, pause, stop, reset;
    MediaPlayer mediaPlayer ;
    int starttime = 0 ;
    int stopttime = 0;
    int forwardtime = 5000 ;
    int backwardtime = 5000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play= findViewById(R.id.play);
        reset=findViewById(R.id.reset);
        forward=findViewById(R.id.forward);
        rewind=findViewById(R.id.rewind);
        pause=findViewById(R.id.pause);
        stop=findViewById(R.id.stop);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Playing Media now",
                        Toast.LENGTH_SHORT).show();
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.first) ;
                mediaPlayer.start();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(starttime);
                mediaPlayer.start();
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardtime) <= (stopttime = mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardtime);
                }
            }
        });
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos-backwardtime) <= (stopttime = mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos-backwardtime);
                }
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.reset();
                mediaPlayer.stop();
            }
        });
    }
}

