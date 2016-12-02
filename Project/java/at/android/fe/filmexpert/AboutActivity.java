package at.android.fe.filmexpert;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(at.android.fe.filmexpert.R.layout.activity_about);

        TextView tempTextView;
        Typeface tempTypeface;


        tempTextView = (TextView) findViewById(at.android.fe.filmexpert.R.id.about_title);
        tempTypeface = Typeface.createFromAsset(getAssets(),"fonts/RobotoCondensed-Regular.ttf");

        tempTextView.setTypeface(tempTypeface);

        tempTextView = (TextView) findViewById(at.android.fe.filmexpert.R.id.about_version);
        tempTypeface = Typeface.createFromAsset(getAssets(),"fonts/RobotoCondensed-Light.ttf");

        tempTextView.setTypeface(tempTypeface);

        tempTextView = (TextView) findViewById(at.android.fe.filmexpert.R.id.about_authors);
        tempTypeface = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Medium.ttf");

        tempTextView.setTypeface(tempTypeface);

        tempTextView = (TextView) findViewById(at.android.fe.filmexpert.R.id.about_thx);
        tempTypeface = Typeface.createFromAsset(getAssets(),"fonts/RobotoCondensed-LightItalic.ttf");

        tempTextView.setTypeface(tempTypeface);
    }

}
