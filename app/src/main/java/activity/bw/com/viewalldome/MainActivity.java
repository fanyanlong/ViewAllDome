package activity.bw.com.viewalldome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  private Button mButton1,mButton2,mButton3,mButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1= (Button) findViewById(R.id.button1);
        mButton2= (Button) findViewById(R.id.button2);
        mButton3= (Button) findViewById(R.id.button3);
        mButton4= (Button) findViewById(R.id.button4);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(this,ScoreActivity.class));
            break;
            case R.id.button2:
                startActivity(new Intent(this,NeifangwaiyuanActivity.class));

                break;
            case R.id.button3:
                startActivity(new Intent(this,FylViewActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this,ScoreActivity.class));
                break;

        }

    }
}
