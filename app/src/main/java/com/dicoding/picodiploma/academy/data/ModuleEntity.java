package com.dicoding.picodiploma.academy.data;

public class ModuleEntity {
    public ContentEntity contentEntity;

    public String getmModuleId() {
        return mModuleId;
    }

    public void setmModuleId(String mModuleId) {
        this.mModuleId = mModuleId;
    }

    public String getmCourseId() {
        return mCourseId;
    }

    public void setmCourseId(String mCourseId) {
        this.mCourseId = mCourseId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Integer getmPosition() {
        return mPosition;
    }

    public void setmPosition(Integer mPosition) {
        this.mPosition = mPosition;
    }

    public boolean ismRead() {
        return mRead;
    }

    public void setmRead(boolean mRead) {
        this.mRead = mRead;
    }

    private String mModuleId;
    private String mCourseId;
    private String mTitle;
    private Integer mPosition;

    public ModuleEntity(String mModuleId, String mCourseId, String mTitle, Integer mPosition, Boolean mRead) {
        this.mModuleId = mModuleId;
        this.mCourseId = mCourseId;
        this.mTitle = mTitle;
        this.mPosition = mPosition;
        if (mRead != null){
            this.mRead = mRead;
        }
    }

    private boolean mRead = false;


}
