package ru.ltst.saturday_data_binding.ui.datachanging;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.databinding.AutobindingFragmentBinding;

public class AutoBindingFragment extends Fragment {

    private AutobindingFragmentBinding binding;
    private AutoUserModelView userModelView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.autobinding_fragment, container, false);
        userModelView = new AutoUserModelView(
                FirstNames.IVAN.getName(),
                LastNames.IVANOV.getLastName(),
                Avatars.B.getAvatarUrl());
        userModelView.setOnFabClick(new AutoUserModelView.OnFabClickListener() {
            @Override
            public void onClick(View view) {
                changeUser();
            }
        });
        binding.setUser(userModelView);
        return binding.getRoot();
    }

    private void changeUser() {
        Random random = new Random();

        FirstNames[] firstNames = FirstNames.values();
        int firsNamesCount = firstNames.length;
        List<FirstNames> firstNamesList = Arrays.asList(firstNames);
        String newFirstName = firstNamesList.get(random.nextInt(firsNamesCount)).getName();
        userModelView.setFirstName(newFirstName);

        LastNames[] lastNames = LastNames.values();
        int lastNamesCount = lastNames.length;
        List<LastNames> lastNamesList = Arrays.asList(lastNames);
        String newLastName = lastNamesList.get(random.nextInt(lastNamesCount)).getLastName();
        userModelView.setLastName(newLastName);

        Avatars [] avatars = Avatars.values();
        int avatarsCount = avatars.length;
        List<Avatars> avatarsList = Arrays.asList(avatars);
        String newAvatar = avatarsList.get(random.nextInt(avatarsCount)).getAvatarUrl();
        userModelView.setAvatarUrl(newAvatar);

    }
}
