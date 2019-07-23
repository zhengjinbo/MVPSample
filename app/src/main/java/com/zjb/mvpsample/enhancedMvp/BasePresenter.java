package com.zjb.mvpsample.enhancedMvp;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;


public class BasePresenter<V> {
    protected Reference<V> mViewRef;
    protected V mView;

    public void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
        mView = mViewRef.get();
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    public V getView() {
        if (mViewRef == null) {
            return null;
        }
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }
}
