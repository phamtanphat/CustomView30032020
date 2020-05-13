package com.example.customview30032020;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EdittextCircle extends RelativeLayout {
    private TextView mTvLabel;
    private String mTextLabel;
    private Integer mResourceImage;

    public EdittextCircle(Context context) {
        super(context);
        init(context , null);
    }

    public EdittextCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context , attrs);
    }

    public EdittextCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs) {
        if (context != null && attrs != null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.item_edittext_circle_view,this , true);
            TypedArray typedArray = context.obtainStyledAttributes(attrs ,R.styleable.EdittextCircle);
            mTextLabel = typedArray.getString(R.styleable.EdittextCircle_text_label);
            mResourceImage = typedArray.getInteger(R.styleable.EdittextCircle_circle_color,0);
            typedArray.recycle();

            //Anh xa
            mTvLabel = view.findViewById(R.id.textviewLabel);

            //Gan du lieu
            mTvLabel.setText(mTextLabel);
//            ShapeDrawable drawable = (ShapeDrawable) context.getResources().getDrawable(R.drawable.bg_circle_view);
//            drawable.getPaint().setColor();
//            mTvLabel.setCompoundDrawables(null,null,drawable,null);
        }
    }
}
