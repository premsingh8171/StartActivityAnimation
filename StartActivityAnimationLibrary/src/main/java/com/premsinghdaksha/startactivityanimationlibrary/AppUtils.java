package com.premsinghdaksha.startactivityanimationlibrary;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class AppUtils {

    public static void startActivityRightToLeft(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public static void finishActivityLeftToRight(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public static void finishActivityRightToLeft(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


    public static void startActivityForResultRightToLeft(Activity activity, Intent intent, int
            requestCode) {
        activity.startActivityForResult(intent, requestCode);
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }


    public static void startActivityForResultWithRightToLeftfinish(Activity activity, Intent intent, int
            requestCode) {
        activity.startActivityForResult(intent, requestCode);
        activity.finish();
        activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public static void startActivityBrowserIntent(Activity activity, String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(browserIntent);
    }
}
