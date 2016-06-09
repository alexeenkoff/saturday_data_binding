package ru.ltst.saturday_data_binding.ui.datachanging;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ru.ltst.saturday_data_binding.BR;

public class AutoUserModelView extends BaseObservable {

    private String firstName;
    private String lastName;
    private String avatarUrl;

    private OnFabClickListener onFabClick;

    public AutoUserModelView(String firstName, String lastName, String avatarUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatarUrl = avatarUrl;
    }

    public void setOnFabClick(OnFabClickListener onFabClick) {
        this.onFabClick = onFabClick;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        notifyPropertyChanged(BR.avatarUrl);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void onFabClick(View view){
        this.onFabClick.onClick(view);
    }

    public OnFabClickListener getOnFabClick() {
        return onFabClick;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @BindingAdapter(value = {"setAvatarFromUrl"})
    public static void setAvatar(ImageView imageView,String url){
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }


    public interface OnFabClickListener{
        void onClick(View view);
    }


}
