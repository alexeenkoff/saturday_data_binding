package ru.ltst.saturday_data_binding.ui.imports;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.databinding.ImportsFragmentBinding;

public class ImportsFragment extends Fragment {

    public static final String SHOW_ALL = "ImportsFragment.ShowAllInFrame";
    public static final String SHOW_LIST = "ImportFragment.ShowList";
    public static final String CAMMEL_STRING = "ImportsFragment.CammelString";

    private ImportsFragmentBinding binding;

    private boolean showAllInFrameLayout;
    private boolean showListElements;
    private String stringForCammel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        showAllInFrameLayout = bundle.getBoolean(SHOW_ALL);
        showListElements = bundle.getBoolean(SHOW_LIST);
        stringForCammel = bundle.getString(CAMMEL_STRING);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.imports_fragment, container, false);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        ImportsData data = new ImportsData(showAllInFrameLayout);
        binding.setData(data);
        if (showListElements) {
            List<String> stringList = Arrays.asList(
                    "First string",
                    "Second String",
                    "Third String");
            binding.setStringList(stringList);
        }
        binding.setCamelString(stringForCammel);
    }
}
