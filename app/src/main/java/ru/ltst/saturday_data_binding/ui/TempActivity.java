package ru.ltst.saturday_data_binding.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ru.ltst.saturday_data_binding.R;

public class TempActivity extends Activity implements View.OnClickListener {

    private FrameLayout imageContainer;

    private ImageView backgroundImageView;

    private ImageView avatarImageView;

    private LinearLayout userDataContainer;

    private TextView firstNameView, lastNameView, emailView, phoneNumberView;

    private LinearLayout friendsContainer;

    private ImageView firstFriendView, secondFriendView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUi();
    }

    private void initUi() {
        imageContainer = ((FrameLayout) findViewById(R.id.images_container));
        backgroundImageView = ((ImageView) findViewById(R.id.background_image_view));
        avatarImageView = ((ImageView) findViewById(R.id.avatar_image_view));
        userDataContainer = ((LinearLayout) findViewById(R.id.user_data_container));
        firstNameView = ((TextView) findViewById(R.id.first_name));
        lastNameView = ((TextView) findViewById(R.id.last_name));
        emailView = ((TextView) findViewById(R.id.email_field));
        phoneNumberView = ((TextView) findViewById(R.id.user_phone));
        friendsContainer = ((LinearLayout) findViewById(R.id.friends_container));
        firstFriendView = ((ImageView) findViewById(R.id.best_friend_first));
        secondFriendView = ((ImageView) findViewById(R.id.best_friend_second));

        imageContainer.setOnClickListener(this);
        backgroundImageView.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        userDataContainer.setOnClickListener(this);
        firstFriendView.setOnClickListener(this);
        lastNameView.setOnClickListener(this);
        emailView.setOnClickListener(this);
        firstNameView.setOnClickListener(this);
        phoneNumberView.setOnClickListener(this);
        friendsContainer.setOnClickListener(this);
        secondFriendView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
