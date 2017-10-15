package com.sania.demoanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sania on 13/09/2017.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Button btn=(Button)findViewById(R.id.newbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Animate.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in, R.anim.
                        hold);
            }
        });
    }
}
