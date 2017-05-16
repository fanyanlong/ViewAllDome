package view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import activity.bw.com.viewalldome.R;


/**
 * autour: 樊彦龙
 * date: 2017/5/9 15:16
 * update: 2017/5/9
 */

public class FylView extends View {
    private Paint myPaint;
    private static final String myString = "大家好才是真的好！";
    public FylView(Context context) {
        super(context);
    }

    public FylView(Context context, AttributeSet attrs) {
        super(context, attrs);

        myPaint = new Paint();
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FylView);//TypedArray是一个数组容器
        float textSize = a.getDimension(R.styleable.FylView_textSize, 30);//防止在XML文件里没有定义内容，就加上了默认值30
        int textColor = a.getColor(R.styleable.FylView_textColor, 0xFF2B62E2);//同上,这里的属性是:名字_属性名
        myPaint.setTextSize(textSize);
        myPaint.setColor(textColor);
        a.recycle();//返回以前取回的属性，供以后使用。以前取回的可能就是textSize和textColor初始化的那段
    }

    public FylView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FylView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       // myPaint.setColor(Color.RED);
        myPaint.setStyle(Paint.Style.FILL);

        canvas.drawRect(new Rect(getHeight()/2,getWidth()/2,300,200), myPaint);
        //myPaint.setColor(Color.YELLOW);
        canvas.drawText(myString, getHeight()/2,getWidth()/4, myPaint);
    }
}
