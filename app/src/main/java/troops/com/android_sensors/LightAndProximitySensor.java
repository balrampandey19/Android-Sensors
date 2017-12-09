package troops.com.android_sensors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LightAndProximitySensor extends AppCompatActivity {
    TextView light,proximity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_and_proximity_sensor);
        light = (TextView)findViewById(R.id.sensor_light);

    }
}
