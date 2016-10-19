package home.smart.fly.animationdemo.property;

import android.os.Bundle;
import android.support.annotation.Nullable;

import home.smart.fly.animationdemo.R;
import home.smart.fly.animationdemo.property.basic.PointAnimView;
import home.smart.fly.animationdemo.utils.BaseActivity;

/**
 * Created by co-mall on 2016/8/9.
 */
public class ValueAnimationActivity extends BaseActivity {
    PointAnimView view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);
        view = (PointAnimView) findViewById(R.id.view);


    }



//    @Override
//    protected void onPause() {
//        super.onPause();
//        if (view != null) {
//            view.pauseAnimation();
//        }
//    }

    @Override
    protected void onStop() {
        super.onStop();
        if (view != null) {
            view.stopAnimation();
        }
    }
}
