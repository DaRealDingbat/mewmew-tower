package com.amazon.android.framework.prompt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p016n.C0175a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* renamed from: com.amazon.android.framework.prompt.e */
public final class C0086e extends SimplePrompt implements C0099b {

    /* renamed from: a */
    private static final KiwiLogger f967a = new KiwiLogger("ShutdownPrompt");
    @Resource

    /* renamed from: b */
    private ContextManager f968b;
    @Resource

    /* renamed from: c */
    private C0175a f969c;

    public C0086e(PromptContent promptContent) {
        super(promptContent, C0083b.EXTENDED);
        f967a.trace("new ShutdownPrompt called!");
    }

    /* renamed from: a */
    private final Intent m247a(Context context) {
        String simOperator;
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder("https://www.amazon.com/appstore-error-help");
        PackageManager packageManager = context.getPackageManager();
        m251a(sb, "?k=", "1.1");
        m251a(sb, "&m=", this.content.getTitle());
        m251a(sb, "&ec=", String.valueOf(this.content.getErrorCode()));
        String str = (String) this.f969c.mo447a("PACKAGE");
        if (str != null) {
            m251a(sb, "&t=", str);
            m252a(sb, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f969c.mo447a("COMMAND");
        if (str2 != null) {
            m251a(sb, "&c=", str2);
        }
        String str3 = (String) this.f969c.mo447a("LICENSE_FAILURE_RAW_EXCEPTION");
        if (str3 != null) {
            m251a(sb, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            m251a(sb, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            m251a(sb, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            m251a(sb, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            m251a(sb, "&bn=", str7);
        }
        m251a(sb, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        m251a(sb, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        m251a(sb, "&p=", packageName);
        m252a(sb, "&pv=", packageName, packageManager);
        m251a(sb, "&l=", Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            f967a.trace("tm was null!");
            simOperator = null;
        } else {
            f967a.trace("tm was not null.");
            int simState = telephonyManager.getSimState();
            if (simState != 5) {
                f967a.trace("SIM not ready, returning null.  State was " + simState);
                simOperator = null;
            } else {
                simOperator = telephonyManager.getSimOperator();
            }
        }
        if (!TextUtils.isEmpty(simOperator)) {
            m251a(sb, "&mc=", simOperator);
        }
        String sb2 = sb.toString();
        f967a.trace("Starting browser for uri " + sb2);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb2));
    }

    /* renamed from: a */
    private static Intent m248a(Context context, String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + context.getPackageName() + "&ref=" + str));
    }

    /* renamed from: a */
    private void m250a(Context context, Intent intent) {
        if (!m254b(context, intent)) {
            f967a.error("Could not start activity, nothing resolves for the given data.");
            m253b();
            return;
        }
        new C0088g(context, this.f968b).execute(new Intent[]{intent});
    }

    /* renamed from: a */
    private static void m251a(StringBuilder sb, String str, String str2) {
        try {
            String encode = URLEncoder.encode(str2, "UTF-8");
            sb.append(str);
            sb.append(encode);
        } catch (UnsupportedEncodingException e) {
            f967a.error("Failed to URL-encode argument", e);
        }
    }

    /* renamed from: a */
    private static void m252a(StringBuilder sb, String str, String str2, PackageManager packageManager) {
        try {
            m251a(sb, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            f967a.error("Could not find information for package " + str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m253b() {
        f967a.trace("doShutdown()");
        f967a.test("Killing application");
        System.exit(0);
    }

    /* renamed from: b */
    private static boolean m254b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* access modifiers changed from: protected */
    public final boolean canHandleAction(C0082a aVar) {
        if (aVar == C0082a.DEFAULT) {
            return true;
        }
        Intent intent = null;
        Activity root = this.f968b.getRoot();
        if (aVar == C0082a.DEEPLINK) {
            intent = m248a((Context) root, "badcert");
        } else if (aVar == C0082a.HELP) {
            intent = m247a(root);
        }
        if (intent != null) {
            return m254b(root, intent);
        }
        f967a.error("Unexpected action " + aVar + ", could not create intent.");
        return false;
    }

    /* access modifiers changed from: protected */
    public final void doAction() {
        doAction(0);
    }

    /* access modifiers changed from: protected */
    public final void doAction(int i) {
        f967a.trace("doAction(" + i + ")");
        C0082a[] buttonActions = this.content.getButtonActions();
        C0082a aVar = i < buttonActions.length ? buttonActions[i] : C0082a.DEFAULT;
        if (aVar == C0082a.HELP) {
            f967a.trace("doAction() help");
            f967a.trace("Store contains " + this.f969c.toString());
            if (!this.content.shouldShowFixup()) {
                f967a.trace("Should not show fixup");
                new C0097p(this.f968b).execute(new Void[0]);
                return;
            }
            f967a.trace("Should show fixup");
            Activity root = this.f968b.getRoot();
            m250a((Context) root, m247a(root));
            f967a.trace("Attempted to start browser.");
        } else if (aVar == C0082a.DEEPLINK) {
            f967a.trace("doAction() deeplink");
            f967a.trace("Attempting to deep link to appstore.");
            Activity root2 = this.f968b.getRoot();
            m250a((Context) root2, m248a((Context) root2, "badcert"));
        } else if (aVar == C0082a.DEFAULT) {
            m253b();
        }
    }

    /* access modifiers changed from: protected */
    public final long getExpirationDurationInSeconds() {
        return 31536000;
    }

    public final void onResourcesPopulatedImpl() {
        this.f968b.stopServices();
    }

    public final String toString() {
        return "ShutdownPrompt";
    }
}
