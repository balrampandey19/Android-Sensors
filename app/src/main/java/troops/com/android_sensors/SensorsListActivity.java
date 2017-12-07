package troops.com.android_sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SensorsListActivity extends AppCompatActivity {
    private SensorManager mSensorManager;
    String sensorText = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSensorManager =
                (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList =
                mSensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor currentSensor : sensorList) {
            sensorText = sensorText + " " + currentSensor.getName() + System.getProperty("line.separator") + " " + System.getProperty("line.separator");
        }
        TextView sensorTextView = (TextView) findViewById(R.id.sensor_list);
        sensorTextView.setText(sensorText);

    }
}
