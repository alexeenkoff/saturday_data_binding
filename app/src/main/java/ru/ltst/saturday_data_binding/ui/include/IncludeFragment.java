package ru.ltst.saturday_data_binding.ui.include;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.databinding.IncludeFragmentBinding;

public class IncludeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        IncludeFragmentBinding binding =
                DataBindingUtil.inflate(inflater, R.layout.include_fragment, container, false);
        User user = new User(
                "Ivan",
                "Ivanov",
                "+380990567368",
                25,
                "ivanov@gmail.com"
        );
        binding.setUser(user);
        return binding.getRoot();
    }
}
