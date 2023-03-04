package animation.almonten.koola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.appwood.mylibrarys.SmallAnimationClass;
import com.appwood.mylibrarys.NextAnimationClass;
import com.appwood.mylibrarys.BigAnimationClass;

public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
    }

    @Override
    public void onBackPressed() {
        NextAnimationClass.BackAnimation(this);
    }

    public void ADSs(View view) {
        NextAnimationClass.NextAnimation(this, new Intent(this, MainActivity.class), 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BigAnimationClass.BigAnimation(this, findViewById(R.id.native_detail), findViewById(R.id.banner_native), findViewById(R.id.addcontain), findViewById(R.id.ad_native_fb), findViewById(R.id.native_ad_layout), findViewById(R.id.custom_native), findViewById(R.id.applovin_native));

        //banner
        SmallAnimationClass.SmallAnimation(this, findViewById(R.id.bottomsads), findViewById(R.id.google_banner), findViewById(R.id.fb_banner), findViewById(R.id.applovin_banner));
    }


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }
}