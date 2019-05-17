package com.example.android.miwok;

public class Phrase {

    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public Phrase(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
