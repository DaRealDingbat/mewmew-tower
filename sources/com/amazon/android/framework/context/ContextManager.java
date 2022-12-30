package com.amazon.android.framework.context;

import android.app.Activity;
import android.app.Service;

public interface ContextManager {
    void finishActivities();

    Activity getRoot();

    Activity getVisible();

    boolean hasAppShutdownBeenRequested();

    boolean isVisible();

    void onCreate(Activity activity);

    void onCreate(Service service);

    void onDestroy(Activity activity);

    void onDestroy(Service service);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onStart(Activity activity);

    void onStop(Activity activity);

    void stopServices();
}
