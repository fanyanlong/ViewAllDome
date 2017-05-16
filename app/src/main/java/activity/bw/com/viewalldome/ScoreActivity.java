package activity.bw.com.viewalldome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import view.ScoreView;

public class ScoreActivity extends AppCompatActivity {
    private LinearLayout scoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        scoreView = (LinearLayout) findViewById(R.id.score_View);
        scoreView.addView(new ScoreView(this,80));

    }
}
