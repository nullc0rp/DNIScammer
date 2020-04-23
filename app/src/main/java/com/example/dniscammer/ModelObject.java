package com.example.dniscammer;

public enum ModelObject {

    FRONT(R.string.front, R.layout.dnifront),
    BACK(R.string.back, R.layout.dniback);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}