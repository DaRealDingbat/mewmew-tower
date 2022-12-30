package amazon.android.tsumineko;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
    }
}
