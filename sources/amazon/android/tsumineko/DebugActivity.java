package amazon.android.tsumineko;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.android.Kiwi;

public class DebugActivity extends Activity {
    /* renamed from: a */
    private TextView m68a(String str, String str2) {
        TextView textView = new TextView(this);
        textView.setText(String.valueOf(str) + " = " + str2);
        return textView;
    }

    private void onCreateDebugActivity(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.debug);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_layout);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        linearLayout.addView(m68a("density", String.valueOf(displayMetrics.density)));
        linearLayout.addView(m68a("densityDpi", String.valueOf(displayMetrics.densityDpi)));
        linearLayout.addView(m68a("scaledDensity", String.valueOf(displayMetrics.scaledDensity)));
        linearLayout.addView(m68a("widthPixels", String.valueOf(displayMetrics.widthPixels)));
        linearLayout.addView(m68a("heightPixels", String.valueOf(displayMetrics.heightPixels)));
        linearLayout.addView(m68a("xDpi", String.valueOf(displayMetrics.xdpi)));
        linearLayout.addView(m68a("yDpi", String.valueOf(displayMetrics.ydpi)));
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateDebugActivity(bundle);
        Kiwi.onCreate((Activity) this, true);
    }

    public Dialog onCreateDialog(int i) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        Kiwi.onDestroy((Activity) this);
    }

    public void onPause() {
        super.onPause();
        Kiwi.onPause(this);
    }

    public void onResume() {
        super.onResume();
        Kiwi.onResume(this);
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        super.onStop();
        Kiwi.onStop(this);
    }
}
