package com.google.ads.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.amazon.mas.kiwi.util.Base64;
import com.google.ads.AdActivity;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.nio.charset.UnsupportedCharsetException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdUtil {

    /* renamed from: a */
    public static final int f1302a;

    /* renamed from: b */
    private static Boolean f1303b = null;

    /* renamed from: c */
    private static String f1304c = null;

    /* renamed from: d */
    private static String f1305d;

    /* renamed from: e */
    private static String f1306e = null;

    /* renamed from: f */
    private static AudioManager f1307f;

    /* renamed from: g */
    private static boolean f1308g = true;

    /* renamed from: h */
    private static boolean f1309h = false;

    /* renamed from: i */
    private static String f1310i = null;

    public class UserActivityReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                AdUtil.m557a(true);
            } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                AdUtil.m557a(false);
            }
        }
    }

    static {
        int i;
        try {
            i = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            C0261b.m582e("The Android SDK version couldn't be parsed to an int: " + Build.VERSION.SDK);
            C0261b.m582e("Defaulting to Android SDK version 3.");
            i = 3;
        }
        f1302a = i;
    }

    /* renamed from: a */
    public static int m547a() {
        return f1302a >= 9 ? 6 : 0;
    }

    /* renamed from: a */
    public static int m548a(Context context, DisplayMetrics displayMetrics) {
        return f1302a >= 4 ? C0265f.m586a(context, displayMetrics) : displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static DisplayMetrics m549a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static String m550a(Context context) {
        if (f1304c == null) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            String a = (string == null || m566c()) ? m552a("emulator") : m552a(string);
            if (a == null) {
                return null;
            }
            f1304c = a.toUpperCase(Locale.US);
        }
        return f1304c;
    }

    /* renamed from: a */
    public static String m551a(Location location) {
        if (location == null) {
            return null;
        }
        return "e1+" + m562b(String.format("role: 6 producer: 24 historical_role: 1 historical_producer: 12 timestamp: %d latlng < latitude_e7: %d longitude_e7: %d> radius: %d", new Object[]{Long.valueOf(location.getTime() * 1000), Long.valueOf((long) (location.getLatitude() * 1.0E7d)), Long.valueOf((long) (location.getLongitude() * 1.0E7d)), Long.valueOf((long) (location.getAccuracy() * 1000.0f))}));
    }

    /* renamed from: a */
    public static String m552a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(), 0, str.length());
            return String.format("%032X", new Object[]{new BigInteger(1, instance.digest())});
        } catch (NoSuchAlgorithmException e) {
            return str.substring(0, 32);
        }
    }

    /* renamed from: a */
    public static String m553a(Map map) {
        try {
            return m564b(map).toString();
        } catch (JSONException e) {
            C0261b.m579b("JsonException in serialization: ", e);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONArray m554a(Set set) {
        JSONArray jSONArray = new JSONArray();
        if (set == null || set.isEmpty()) {
            return jSONArray;
        }
        for (Object next : set) {
            if ((next instanceof String) || (next instanceof Integer) || (next instanceof Double) || (next instanceof Long) || (next instanceof Float)) {
                jSONArray.put(next);
            } else if (next instanceof Map) {
                try {
                    jSONArray.put(m564b((Map) next));
                } catch (ClassCastException e) {
                    C0261b.m579b("Unknown map type in json serialization: ", e);
                }
            } else if (next instanceof Set) {
                try {
                    jSONArray.put(m554a((Set) next));
                } catch (ClassCastException e2) {
                    C0261b.m579b("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0261b.m582e("Unknown value in json serialization: " + next);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m555a(WebView webView) {
        webView.getSettings().setUserAgentString(m573h(webView.getContext().getApplicationContext()));
    }

    /* renamed from: a */
    public static void m556a(HttpURLConnection httpURLConnection, Context context) {
        httpURLConnection.setRequestProperty("User-Agent", m573h(context));
    }

    /* renamed from: a */
    public static void m557a(boolean z) {
        f1308g = z;
    }

    /* renamed from: a */
    private static boolean m558a(int i, int i2, String str) {
        if ((i & i2) != 0) {
            return true;
        }
        C0261b.m578b("The android:configChanges value of the com.google.ads.AdActivity must include " + str + ".");
        return false;
    }

    /* renamed from: a */
    public static boolean m559a(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* renamed from: b */
    public static int m560b() {
        return f1302a >= 9 ? 7 : 1;
    }

    /* renamed from: b */
    public static int m561b(Context context, DisplayMetrics displayMetrics) {
        return f1302a >= 4 ? C0265f.m587b(context, displayMetrics) : displayMetrics.widthPixels;
    }

    /* renamed from: b */
    private static String m562b(String str) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(new byte[]{10, 55, -112, -47, -6, 7, 11, 75, -7, -121, 121, 69, 80, -61, 15, 5}, "AES"));
            byte[] iv = instance.getIV();
            byte[] doFinal = instance.doFinal(str.getBytes());
            byte[] bArr = new byte[(iv.length + doFinal.length)];
            System.arraycopy(iv, 0, bArr, 0, iv.length);
            System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
            return C0262c.m583a(bArr);
        } catch (GeneralSecurityException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap m563b(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return hashMap;
        }
        try {
            for (String str : encodedQuery.split("&")) {
                int indexOf = str.indexOf(61);
                if (indexOf == -1) {
                    return null;
                }
                hashMap.put(URLDecoder.decode(str.substring(0, indexOf), "utf-8"), URLDecoder.decode(str.substring(indexOf + 1), "utf-8"));
            }
            return hashMap;
        } catch (UnsupportedEncodingException e) {
            C0261b.m576a((Throwable) e);
            return null;
        } catch (UnsupportedCharsetException e2) {
            C0261b.m576a((Throwable) e2);
            return null;
        } catch (IllegalArgumentException e3) {
            C0261b.m576a((Throwable) e3);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m564b(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float)) {
                jSONObject.put(str, obj);
            } else if (obj instanceof Map) {
                try {
                    jSONObject.put(str, m564b((Map) obj));
                } catch (ClassCastException e) {
                    C0261b.m579b("Unknown map type in json serialization: ", e);
                }
            } else if (obj instanceof Set) {
                try {
                    jSONObject.put(str, m554a((Set) obj));
                } catch (ClassCastException e2) {
                    C0261b.m579b("Unknown map type in json serialization: ", e2);
                }
            } else {
                C0261b.m582e("Unknown value in json serialization: " + obj);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m565b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager.checkPermission("android.permission.INTERNET", packageName) == -1) {
            C0261b.m578b("INTERNET permissions must be enabled in AndroidManifest.xml.");
            return false;
        } else if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", packageName) != -1) {
            return true;
        } else {
            C0261b.m578b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m566c() {
        return "unknown".equals(Build.BOARD) && "generic".equals(Build.DEVICE) && "generic".equals(Build.BRAND);
    }

    /* renamed from: c */
    public static boolean m567c(Context context) {
        if (f1303b != null) {
            return f1303b.booleanValue();
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent(context, AdActivity.class), 65536);
        f1303b = true;
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            C0261b.m578b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
            f1303b = false;
        } else {
            if (!m558a(resolveActivity.activityInfo.configChanges, 16, "keyboard")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 32, "keyboardHidden")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 128, "orientation")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 256, "screenLayout")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 512, "uiMode")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 1024, "screenSize")) {
                f1303b = false;
            }
            if (!m558a(resolveActivity.activityInfo.configChanges, 2048, "smallestScreenSize")) {
                f1303b = false;
            }
        }
        return f1303b.booleanValue();
    }

    /* renamed from: d */
    public static String m568d(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
                return "ed";
            case Base64.ENCODE:
                return "wi";
            default:
                return "unknown";
        }
    }

    /* renamed from: d */
    public static boolean m569d() {
        return f1308g;
    }

    /* renamed from: e */
    public static String m570e(Context context) {
        if (f1305d == null) {
            StringBuilder sb = new StringBuilder();
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                sb.append("m");
            }
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 65536);
            if (queryIntentActivities2 == null || queryIntentActivities2.size() == 0) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append("a");
            }
            List<ResolveInfo> queryIntentActivities3 = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("tel://6509313940")), 65536);
            if (queryIntentActivities3 == null || queryIntentActivities3.size() == 0) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append("t");
            }
            f1305d = sb.toString();
        }
        return f1305d;
    }

    /* renamed from: f */
    public static String m571f(Context context) {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        if (f1306e != null) {
            return f1306e;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads")), 0);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || (packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0)) == null) {
                return null;
            }
            String str = packageInfo.versionCode + "." + activityInfo.packageName;
            f1306e = str;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: g */
    public static C0260a m572g(Context context) {
        if (f1307f == null) {
            f1307f = (AudioManager) context.getSystemService("audio");
        }
        C0260a aVar = C0260a.OTHER;
        int mode = f1307f.getMode();
        if (m566c()) {
            return C0260a.EMULATOR;
        }
        if (f1307f.isMusicActive() || f1307f.isSpeakerphoneOn() || mode == 2 || mode == 1) {
            return C0260a.VIBRATE;
        }
        int ringerMode = f1307f.getRingerMode();
        return (ringerMode == 0 || ringerMode == 1) ? C0260a.VIBRATE : C0260a.SPEAKER;
    }

    /* renamed from: h */
    private static String m573h(Context context) {
        if (f1310i == null) {
            String userAgentString = new WebView(context).getSettings().getUserAgentString();
            if (userAgentString == null || userAgentString.length() == 0 || userAgentString.equals("Java0")) {
                String property = System.getProperty("os.name", "Linux");
                String str = "Android " + Build.VERSION.RELEASE;
                Locale locale = Locale.getDefault();
                String lowerCase = locale.getLanguage().toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    lowerCase = "en";
                }
                String lowerCase2 = locale.getCountry().toLowerCase(Locale.US);
                if (lowerCase2.length() > 0) {
                    lowerCase = lowerCase + "-" + lowerCase2;
                }
                userAgentString = "Mozilla/5.0 (" + property + "; U; " + str + "; " + lowerCase + "; " + (Build.MODEL + " Build/" + Build.ID) + ") AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0 Mobile Safari/0.0";
            }
            f1310i = userAgentString + " (Mobile; afma-sdk-a-v4.3.1)";
        }
        return f1310i;
    }
}
