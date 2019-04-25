package com.wasisoft.fitsa_user_app.Model;

public class Nutritionist_items extends GeneralUser {

    private String mItemName, mQualification, mInstitute;
    private int mExperience;
    private String mImageUriStrl;

    public Nutritionist_items(){}

    public Nutritionist_items(String mItemName, String mQualification, String mInstitute, int mExperience, String mImageUriStrl) {
        this.mItemName = mItemName;
        this.mQualification = mQualification;
        this.mInstitute = mInstitute;
        this.mExperience = mExperience;
        this.mImageUriStrl = mImageUriStrl;
    }

    public String getmItemName() {
        return mItemName;
    }

    public void setmItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public String getmQualification() {
        return mQualification;
    }

    public void setmQualification(String mQualification) {
        this.mQualification = mQualification;
    }

    public String getmInstitute() {
        return mInstitute;
    }

    public void setmInstitute(String mInstitute) {
        this.mInstitute = mInstitute;
    }

    public int getmExperience() {
        return mExperience;
    }

    public void setmExperience(int mExperience) {
        this.mExperience = mExperience;
    }

    public String getmImageUriStrl() {
        return mImageUriStrl;
    }

    public void setmImageUriStrl(String mImageUriStrl) {
        this.mImageUriStrl = mImageUriStrl;
    }
}
