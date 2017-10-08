package com.example.justin.myapplication;

import android.content.res.Resources;
import android.support.annotation.StyleRes;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Justin on 2017/10/8.
 */

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onApplyThemeResource(Resources.Theme theme, @StyleRes int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
        int a =3; 
        int b=4;
    }
}
