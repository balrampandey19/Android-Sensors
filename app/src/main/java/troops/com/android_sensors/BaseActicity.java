package troops.com.android_sensors;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaseActicity extends AppCompatActivity {
    private Activity mActivity;
    private Button sensorList;
    private Button lightAndProximity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_acticity);
        mActivity = this;
        sensorList = findViewById(R.id.button_sensorsList);
        lightAndProximity = findViewById(R.id.button_sensorsLightAndProximity);
        onClicks();
    }

    private void onClicks() {
        sensorList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mActivity, SensorsListActivity.class);
                startActivity(intent);
            }
        });
        lightAndProximity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mActivity, LightAndProximitySensor.class);
                startActivity(intent);
            }
        });
    }
}
