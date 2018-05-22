package lintregistry.jfyg.lib;

class Const {
    static final String ID = "MissingTextviewBackgroundColor";
    static final String BRIEF_DESCRIPTION = "android:background needs to be assigned";
    static final String EXPLANATION = "should use android:background to style a TextView in order to provide consistent"
                                      + " design within this project";
    static final int PRIORITY = 6;
    static final String SCHEMA = "http://schemas.android.com/apk/res/android";
    static final String TEXT_BACKGROUND = "background";
    static final String TEXTVIEW = "TextView";
}

