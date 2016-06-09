package ru.ltst.saturday_data_binding.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.ltst.saturday_data_binding.R;
import ru.ltst.saturday_data_binding.ui.datachanging.AutoBindingFragment;
import ru.ltst.saturday_data_binding.ui.events.EventsFragment;
import ru.ltst.saturday_data_binding.ui.imports.ImportsFragment;
import ru.ltst.saturday_data_binding.ui.include.IncludeFragment;
import ru.ltst.saturday_data_binding.ui.start.StartFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fragmentManager;
    private int containerId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        containerId = findViewById(R.id.main_fragment_container).getId();
        initButtons();
    }


    private void initButtons() {
        Button firstFragment = ((Button) findViewById(R.id.main_button_first_fragment));
        firstFragment.setOnClickListener(this);
        View eventsFragment = findViewById(R.id.main_button_events);
        eventsFragment.setOnClickListener(this);
        View importShowAll = findViewById(R.id.main_button_imports_all);
        importShowAll.setOnClickListener(this);
        View importShowNotAll = findViewById(R.id.main_button_imports_not_all);
        importShowNotAll.setOnClickListener(this);
        View view = findViewById(R.id.main_button_import_list);
        view.setOnClickListener(this);
        findViewById(R.id.main_button_include).setOnClickListener(this);
        findViewById(R.id.main_button_auto_change).setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        Bundle bundle = null;
        switch (v.getId()) {
            case R.id.main_button_first_fragment:
                fragment = new StartFragment();
                break;
            case R.id.main_button_events:
                fragment = new EventsFragment();
                break;
            case R.id.main_button_imports_all:
                fragment = new ImportsFragment();
                bundle = new Bundle();
                bundle.putBoolean(ImportsFragment.SHOW_ALL, true);
                break;
            case R.id.main_button_imports_not_all:
                fragment = new ImportsFragment();
                bundle = new Bundle();
                bundle.putBoolean(ImportsFragment.SHOW_ALL, false);
                break;
            case R.id.main_button_import_list:
                fragment = new ImportsFragment();
                bundle = new Bundle();
                bundle.putBoolean(ImportsFragment.SHOW_LIST, true);
                bundle.putString(ImportsFragment.CAMMEL_STRING, "this string must be like a camel");
                break;
            case R.id.main_button_include:
                fragment = new IncludeFragment();
                break;
            case R.id.main_button_auto_change:
                fragment = new AutoBindingFragment();
                break;
            default:
                break;
        }
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        fragmentManager.beginTransaction()
                .add(containerId, fragment)
                .addToBackStack(fragment.getClass().getSimpleName())
                .commit();
    }

    @Override
    public void onBackPressed() {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount == 0) {
            super.onBackPressed();
        } else {
            fragmentManager.popBackStack();
        }
    }
}
