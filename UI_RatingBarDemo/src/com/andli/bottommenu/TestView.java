package com.andli.bottommenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;

public class TestView extends Activity {

	RatingBar mRatingBar;
	Button button1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mRatingBar = (RatingBar) findViewById(R.id.ratingBar1);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				button1.setText(mRatingBar.getRating() + "");

			}
		});
	}

}