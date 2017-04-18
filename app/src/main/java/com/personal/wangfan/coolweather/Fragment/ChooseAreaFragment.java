package com.personal.wangfan.coolweather.Fragment;


import android.app.Fragment;
import android.app.ProgressDialog;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangfan on 2017/4/19.
 */

public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVENCE = 0;
    public static final int LEVEL_CITY = 1;
    public static final int LEVEL_COUNTY = 2;

    private ProgressDialog progressDialog;
    private TextView titleText;
    private Button backButton;
    private TextView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();

    

}
