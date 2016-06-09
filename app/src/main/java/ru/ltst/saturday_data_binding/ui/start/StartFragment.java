package ru.ltst.saturday_data_binding.ui.start;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.databinding.FragmentStartBinding;

public class StartFragment extends Fragment {

    private FragmentStartBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_start, container, false);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        StartData data = new StartData("This is some string", 55, 'R');
        binding.setStartData(data);
    }
}
