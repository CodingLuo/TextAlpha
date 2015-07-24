package com.example.textalpha;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt = (TextView) findViewById(R.id.txt);
		AlphaAnimation alphaAnimation = new AlphaAnimation(1, (float) 0.5);// 文字从无到有
		alphaAnimation.setDuration(1000);// 1000是渐变时间 单位是 毫秒
		alphaAnimation.setFillAfter(true);
//		alphaAnimation.setFillEnabled(true);
//		alphaAnimation.setFillBefore(false);
		txt.setAnimation(alphaAnimation);
	}
}
