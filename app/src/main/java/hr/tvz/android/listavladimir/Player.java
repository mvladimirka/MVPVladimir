package hr.tvz.android.listavladimir;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

public class Player extends AppCompatActivity {
    private MediaPlayer player;

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);

        final ModelClass item = (ModelClass) getIntent().getExtras().get("item");
        SimpleDraweeView view = findViewById(R.id.view_image);
        view.setImageURI(item.imageResource());

        this.player = MediaPlayer.create(this, R.raw.croatia_ful_of_life);
        this.player.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.player.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.player.stop();
    }
}

