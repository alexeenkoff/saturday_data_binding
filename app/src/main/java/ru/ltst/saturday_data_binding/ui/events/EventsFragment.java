package ru.ltst.saturday_data_binding.ui.events;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.databinding.FragmentEventsBinding;

public class EventsFragment extends Fragment {

    private FragmentEventsBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_events, container, false);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        binding.setClicks(new EventsClicks());
    }
}
