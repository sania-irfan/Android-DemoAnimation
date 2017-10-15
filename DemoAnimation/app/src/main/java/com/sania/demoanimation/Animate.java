package com.sania.demoanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by sania on 13/09/2017.
 */

public class Animate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animate);

        Button btn=(Button)findViewById(R.id.animate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image=(ImageView)findViewById(R.id.image);
                Animation animationStart= AnimationUtils.loadAnimation(Animate.this,R.anim.anim_in);
                image.startAnimation(animationStart);
            }
        });

        Button rotate=(Button)findViewById(R.id.rotate);
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image=(ImageView)findViewById(R.id.image);
                Animation animationStart= AnimationUtils.loadAnimation(Animate.this,R.anim.hold);
                image.startAnimation(animationStart);
            }
        });

    }
}
