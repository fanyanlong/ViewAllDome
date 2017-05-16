package activity.bw.com.viewalldome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import view.FylView;

public class FylViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fyl_view);

       FylView mFyl= (FylView) findViewById(R.id.fylview);

    }
}
