package troops.com.android_sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LightAndProximitySensor extends AppCompatActivity implements SensorEventListener {
    TextView light, proximity;
    private Sensor mSensorProximity;
    private Sensor mSensorLight;
    private SensorManager mSensorManager;
    private String error;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_and_proximity_sensor);
        light = findViewById(R.id.sensor_light);
        proximity = findViewById(R.id.sensor_proximity);
        error = getResources().getString(R.string.error_no_sensor);

        mSensorManager =
                (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorProximity =
                mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        mSensorLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        setLightSensor();
        setProximitySensor();

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mSensorProximity != null) {
            mSensorManager.registerListener(this, mSensorProximity,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
        if (mSensorLight != null) {
            mSensorManager.registerListener(this, mSensorLight,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    public void setProximitySensor() {
        if (mSensorLight == null) {
            light.setText(error);
        }
    }

    public void setLightSensor() {
        if (mSensorProximity == null) {
            proximity.setText(error);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        int sensorType = sensorEvent.sensor.getType();
        float currentValue = sensorEvent.values[0];
        switch (sensorType) {
            // Event came from the light sensor.
            case Sensor.TYPE_LIGHT:
                light.setText("Light:- " + currentValue);
                break;
            case Sensor.TYPE_PROXIMITY:
                proximity.setText("Proximity:-" + currentValue);
                break;
            default:
                // do nothing
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onStop() {
        super.onStop();
        mSensorManager.unregisterListener(this);
    }
}
