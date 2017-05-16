package activity.bw.com.viewalldome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import view.Neifangwaiyuan;

public class NeifangwaiyuanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neifangwaiyuan);
       Neifangwaiyuan  mNei= (Neifangwaiyuan) findViewById(R.id.neifangwaiyuan);
        mNei.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "11",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mNei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "22",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mNei.setOnClicks(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "33",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
