package com.example.android.miwok;

public class FamilyMember {

    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public FamilyMember(String defaultTranslation, String miwokTranslation) {
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
