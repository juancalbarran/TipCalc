package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by juan.albarran on 06/08/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://about.me/adriancatalan";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
