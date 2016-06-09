package ru.ltst.saturday_data_binding.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import ru.ltst.saturday_data_binding.R;

public class TempButterknifeActivity extends Activity implements View.OnClickListener {

    @BindView(R.id.images_container)
    FrameLayout imageContainer;

    @BindView(R.id.background_image_view)
    ImageView backgroundImageView;

    @BindView(R.id.avatar_image_view)
    ImageView avatarImageView;

    @BindView(R.id.user_data_container)
    LinearLayout userDataContainer;

    @BindView(R.id.first_name)
    TextView firstNameView;

    @BindView(R.id.last_name)
    TextView lastNameView;

    @BindView(R.id.email_field)
    TextView emailView;

    @BindView(R.id.user_phone)
    TextView phoneNumberView;

    @BindView(R.id.friends_container)
    LinearLayout friendsContainer;

    @BindView(R.id.best_friend_first)
    ImageView firstFriendView;

    @BindView(R.id.best_friend_second)
    ImageView secondFriendView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onClickForElements();
    }

    private void onClickForElements() {
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
