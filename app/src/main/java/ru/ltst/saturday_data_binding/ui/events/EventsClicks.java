package ru.ltst.saturday_data_binding.ui.events;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventsClicks {

    public void onFirstClick(View view) {
        showToast(view);
    }

    public void onSecondClick(View view) {
       showToast(view);
    }

    private void showToast(View view){
        String buttonText = ((Button) view).getText().toString();
        Toast.makeText(view.getContext(),buttonText,Toast.LENGTH_SHORT).show();
    }
}
