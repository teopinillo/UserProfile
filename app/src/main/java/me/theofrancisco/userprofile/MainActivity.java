package me.theofrancisco.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageProfile = findViewById(R.id.profile_picture);
        TextView textName = findViewById(R.id.name);
        TextView textBirthday = findViewById(R.id.birthday);
        TextView textCountry = findViewById(R.id.country);



        textName.setText("Teofilo Francisco");
        textName.setTextSize(getResources().getDimension(R.dimen.textsize_1));
        textName.setTextColor(Color.BLUE);

        textCountry.setText("Cuba");
        textCountry.setTextSize(getResources().getDimension(R.dimen.textsize_2));
        textCountry.setTextColor(Color.GREEN);

        textBirthday.setText("August 9, 1972");
        textBirthday.setTextSize(getResources().getDimension(R.dimen.textsize_3));
        textBirthday.setTextColor(Color.CYAN);

        imageProfile.setImageResource(R.drawable.profilepict);
    }
}
