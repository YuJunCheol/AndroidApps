package com.example.myapplication.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.example.myapplication.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FirstFragment extends Fragment implements CircleProgressBar.ProgressFormatter {

    private static final String DEFAULT_PATTERN = "%d%%";
    CircleProgressBar circleProgressBar;
    private Context mContext;
    ProgressBar pro;
    Button btn;
    EditText edt;
    TextView tv;
    Thread work = null;
    int i=0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_main, container, false);

        circleProgressBar=root.findViewById(R.id.cpb_circlebar);

        circleProgressBar.setProgress(70);

        return root;
    }

    @Override
    public CharSequence format(int progress, int max) {
        return String.format(DEFAULT_PATTERN, (int) ((float) progress / (float) max * 100));
    }

}