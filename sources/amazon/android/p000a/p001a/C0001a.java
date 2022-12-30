package amazon.android.p000a.p001a;

import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

/* renamed from: amazon.android.a.a.a */
public final class C0001a {

    /* renamed from: a */
    public final String f2a = "hand";

    /* renamed from: b */
    public final String f3b = "zoom";

    /* renamed from: c */
    public final String f4c = "sound";

    /* renamed from: d */
    public final String f5d = "misiyo";

    /* renamed from: e */
    public final String f6e = "ids";

    /* renamed from: f */
    public final String f7f = "nickname";

    /* renamed from: g */
    public final String f8g = "playcount";

    /* renamed from: h */
    public final String f9h = "none";

    /* renamed from: i */
    SQLiteDatabase f10i = null;

    /* renamed from: j */
    TsumiNekoPadAppDelegate f11j;

    /* renamed from: k */
    private final String f12k = "TsumiNekoPad.db";

    /* renamed from: l */
    private String f13l = "";

    public C0001a(TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate) {
        this.f11j = tsumiNekoPadAppDelegate;
        this.f13l = "/data/data/" + tsumiNekoPadAppDelegate.getPackageName() + "/TsumiNekoPad.db";
        this.f10i = SQLiteDatabase.openOrCreateDatabase(this.f13l, (SQLiteDatabase.CursorFactory) null);
    }

    /* renamed from: a */
    private static String m0a(Calendar calendar, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        return simpleDateFormat.format(calendar.getTime());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[Catch:{ Exception -> 0x0069, all -> 0x0073 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo1a(boolean r7) {
        /*
            r6 = this;
            r3 = 0
            java.lang.String r2 = "select sum(height) from sumneko;"
            r0 = 0
            if (r7 == 0) goto L_0x002b
            android.database.sqlite.SQLiteDatabase r4 = r6.f10i
            r4.beginTransaction()
            android.database.sqlite.SQLiteDatabase r4 = r6.f10i     // Catch:{ Exception -> 0x0053, all -> 0x005e }
            r5 = 0
            android.database.Cursor r2 = r4.rawQuery(r2, r5)     // Catch:{ Exception -> 0x0053, all -> 0x005e }
            boolean r4 = r2.moveToNext()     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            if (r4 == 0) goto L_0x001e
            r4 = 0
            long r0 = r2.getLong(r4)     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
        L_0x001e:
            android.database.sqlite.SQLiteDatabase r4 = r6.f10i     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            r4.setTransactionSuccessful()     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
            r2.close()     // Catch:{ Exception -> 0x0081 }
        L_0x0026:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i
            r2.endTransaction()
        L_0x002b:
            java.lang.String r2 = "select height from totalneko;"
            android.database.sqlite.SQLiteDatabase r4 = r6.f10i
            r4.beginTransaction()
            android.database.sqlite.SQLiteDatabase r4 = r6.f10i     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            r5 = 0
            android.database.Cursor r3 = r4.rawQuery(r2, r5)     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            boolean r2 = r3.moveToNext()     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            if (r2 == 0) goto L_0x0045
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            long r0 = r0 + r4
        L_0x0045:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x0069, all -> 0x0073 }
            r3.close()     // Catch:{ Exception -> 0x0087 }
        L_0x004d:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i
            r2.endTransaction()
        L_0x0052:
            return r0
        L_0x0053:
            r2 = move-exception
            r2 = r3
        L_0x0055:
            r2.close()     // Catch:{ Exception -> 0x007d }
        L_0x0058:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i
            r2.endTransaction()
            goto L_0x002b
        L_0x005e:
            r0 = move-exception
            r2 = r3
        L_0x0060:
            r2.close()     // Catch:{ Exception -> 0x007f }
        L_0x0063:
            android.database.sqlite.SQLiteDatabase r1 = r6.f10i
            r1.endTransaction()
            throw r0
        L_0x0069:
            r2 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0083 }
        L_0x006d:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i
            r2.endTransaction()
            goto L_0x0052
        L_0x0073:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0085 }
        L_0x0077:
            android.database.sqlite.SQLiteDatabase r1 = r6.f10i
            r1.endTransaction()
            throw r0
        L_0x007d:
            r2 = move-exception
            goto L_0x0058
        L_0x007f:
            r1 = move-exception
            goto L_0x0063
        L_0x0081:
            r2 = move-exception
            goto L_0x0026
        L_0x0083:
            r2 = move-exception
            goto L_0x006d
        L_0x0085:
            r1 = move-exception
            goto L_0x0077
        L_0x0087:
            r2 = move-exception
            goto L_0x004d
        L_0x0089:
            r0 = move-exception
            goto L_0x0060
        L_0x008b:
            r4 = move-exception
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.p000a.p001a.C0001a.mo1a(boolean):long");
    }

    /* renamed from: a */
    public final void mo2a() {
        if (this.f10i != null) {
            this.f10i.close();
            this.f10i = null;
        }
    }

    /* renamed from: a */
    public final void mo3a(C0003c cVar) {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("create table totalneko(int, big int, medium int, small int, height int, area_height int, area int, map_pt int, map_x);");
            this.f10i.execSQL(String.valueOf("insert into totalneko(big,medium,small,height,area_height,area,map_pt,map_x) values ") + "(" + cVar.f52g + "," + cVar.f54i + "," + cVar.f53h + "," + cVar.f51f + "," + cVar.f51f + ",0,0,0);");
            this.f10i.setTransactionSuccessful();
            Log.d("TsumiNekoAnd", "OK Make new table!!!");
        } catch (Exception e) {
            this.f10i.execSQL("update totalneko set big = big + " + cVar.f52g + ",medium = medium + " + cVar.f54i + ",small = small + " + cVar.f53h + ",height = height + " + cVar.f51f + ",area_height = area_height + " + cVar.f51f + ";");
            this.f10i.setTransactionSuccessful();
            Log.d("TsumiNekoAnd", "total table update OK.");
        }
        this.f10i.endTransaction();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r6.clear();
        r6.put("hand", 0);
        r6.put("zoom", 1);
        r6.put("sound", 1);
        r6.put("misiyo", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        r4 = r1;
        r1 = r0;
        r0 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:1:0x0008] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4a(java.util.HashMap r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "select * from option;"
            android.database.sqlite.SQLiteDatabase r2 = r5.f10i
            r2.beginTransaction()
            android.database.sqlite.SQLiteDatabase r2 = r5.f10i     // Catch:{ Exception -> 0x005a, all -> 0x008f }
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r1, r3)     // Catch:{ Exception -> 0x005a, all -> 0x008f }
        L_0x000f:
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x005a }
            if (r1 != 0) goto L_0x001e
            r0.close()     // Catch:{ Exception -> 0x00a0 }
        L_0x0018:
            android.database.sqlite.SQLiteDatabase r0 = r5.f10i
            r0.endTransaction()
        L_0x001d:
            return
        L_0x001e:
            r6.clear()     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "hand"
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005a }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "zoom"
            r2 = 1
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005a }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "sound"
            r2 = 2
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005a }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = "misiyo"
            r2 = 3
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x005a }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x005a }
            goto L_0x000f
        L_0x005a:
            r1 = move-exception
            r6.clear()     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "hand"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            r6.put(r1, r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "zoom"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            r6.put(r1, r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "sound"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            r6.put(r1, r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "misiyo"
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            r6.put(r1, r2)     // Catch:{ all -> 0x00a3 }
            r0.close()     // Catch:{ Exception -> 0x009c }
        L_0x0089:
            android.database.sqlite.SQLiteDatabase r0 = r5.f10i
            r0.endTransaction()
            goto L_0x001d
        L_0x008f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0093:
            r1.close()     // Catch:{ Exception -> 0x009e }
        L_0x0096:
            android.database.sqlite.SQLiteDatabase r1 = r5.f10i
            r1.endTransaction()
            throw r0
        L_0x009c:
            r0 = move-exception
            goto L_0x0089
        L_0x009e:
            r1 = move-exception
            goto L_0x0096
        L_0x00a0:
            r0 = move-exception
            goto L_0x0018
        L_0x00a3:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.p000a.p001a.C0001a.mo4a(java.util.HashMap):void");
    }

    /* renamed from: a */
    public final void mo5a(C0003c[] cVarArr) {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("create table ranking(year int, month int, day int, hour int, minute int, height int, big int, small int, midium int,wrank int);");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        }
        this.f10i.endTransaction();
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("delete from ranking;");
            for (C0003c cVar : cVarArr) {
                this.f10i.execSQL(String.valueOf("insert into ranking(year,month,day,hour,minute,height,big,small,midium,wrank) values ") + "(" + cVar.f46a + "," + cVar.f47b + "," + cVar.f48c + "," + cVar.f49d + "," + cVar.f50e + "," + cVar.f51f + "," + cVar.f52g + "," + cVar.f53h + "," + cVar.f54i + "," + cVar.f57l + ");");
            }
            Log.d("TsumiNekoAnd", "OK insertRankings");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e2) {
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* renamed from: b */
    public final void mo6b() {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("create table option(hand int, zoom int, sound int,misiyo int);");
            this.f10i.execSQL("insert into option(hand, zoom, sound,misiyo) values(0, 1, 1,0);");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* renamed from: b */
    public final void mo7b(C0003c cVar) {
        String str;
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("create table sumneko_today(year int, month int, day int, height int, big int, small int, midium);");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        }
        this.f10i.endTransaction();
        this.f10i.beginTransaction();
        try {
            if (mo15g() == 0) {
                this.f10i.execSQL("delete from sumneko_today;");
                str = String.valueOf("insert into sumneko_today(year,month,day,height,big,small,midium) values ") + "(" + cVar.f46a + "," + cVar.f47b + "," + cVar.f48c + "," + cVar.f51f + "," + cVar.f52g + "," + cVar.f53h + "," + cVar.f54i + ");";
            } else {
                str = "update sumneko_today set big = big + " + cVar.f52g + ", small = small + " + cVar.f53h + ", midium = midium + " + cVar.f54i + ";";
            }
            this.f10i.execSQL(str);
            this.f10i.setTransactionSuccessful();
        } catch (Exception e2) {
            Log.e("CommDB", "SQL=" + "" + " \n err=" + e2.getMessage());
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* renamed from: b */
    public final void mo8b(HashMap hashMap) {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("delete from option;");
            int intValue = ((Integer) hashMap.get("hand")).intValue();
            int intValue2 = ((Integer) hashMap.get("zoom")).intValue();
            int intValue3 = ((Integer) hashMap.get("sound")).intValue();
            this.f10i.execSQL("insert into option(hand, zoom, sound,misiyo) values(" + intValue + "," + intValue2 + "," + intValue3 + "," + ((Integer) hashMap.get("misiyo")).intValue() + ");");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* renamed from: c */
    public final void mo9c() {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("create table optionname(ids varchar , name varchar , playcount varchar);");
            this.f10i.execSQL("insert into optionname(ids , name , playcount ) values('0','','0');");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r4 = r1;
        r1 = r0;
        r0 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:1:0x0008] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10c(java.util.HashMap r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "select * from optionname;"
            android.database.sqlite.SQLiteDatabase r2 = r5.f10i
            r2.beginTransaction()
            android.database.sqlite.SQLiteDatabase r2 = r5.f10i     // Catch:{ Exception -> 0x0040, all -> 0x004a }
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r1, r3)     // Catch:{ Exception -> 0x0040, all -> 0x004a }
        L_0x000f:
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            if (r1 != 0) goto L_0x001e
            r0.close()     // Catch:{ Exception -> 0x005b }
        L_0x0018:
            android.database.sqlite.SQLiteDatabase r0 = r5.f10i
            r0.endTransaction()
        L_0x001d:
            return
        L_0x001e:
            r6.clear()     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            java.lang.String r1 = "ids"
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            java.lang.String r1 = "nickname"
            r2 = 1
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            java.lang.String r1 = "playcount"
            r2 = 2
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0040, all -> 0x005d }
            goto L_0x000f
        L_0x0040:
            r1 = move-exception
            r0.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0044:
            android.database.sqlite.SQLiteDatabase r0 = r5.f10i
            r0.endTransaction()
            goto L_0x001d
        L_0x004a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x004e:
            r1.close()     // Catch:{ Exception -> 0x0059 }
        L_0x0051:
            android.database.sqlite.SQLiteDatabase r1 = r5.f10i
            r1.endTransaction()
            throw r0
        L_0x0057:
            r0 = move-exception
            goto L_0x0044
        L_0x0059:
            r1 = move-exception
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x0018
        L_0x005d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.p000a.p001a.C0001a.mo10c(java.util.HashMap):void");
    }

    /* renamed from: d */
    public final void mo11d(HashMap hashMap) {
        this.f10i.beginTransaction();
        try {
            this.f10i.execSQL("delete from optionname;");
            this.f10i.execSQL("insert into optionname(ids,name,playcount) values('" + ((String) hashMap.get("ids")) + "','" + ((String) hashMap.get("nickname")) + "','" + ((String) hashMap.get("playcount")) + "');");
            this.f10i.setTransactionSuccessful();
        } catch (Exception e) {
        } finally {
            this.f10i.endTransaction();
        }
    }

    /* renamed from: d */
    public final C0003c[] mo12d() {
        Cursor cursor;
        Cursor cursor2 = null;
        int i = 0;
        C0003c[] cVarArr = new C0003c[6];
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            cVarArr[i2] = new C0003c();
        }
        this.f10i.beginTransaction();
        try {
            cursor = this.f10i.rawQuery("select * from ranking ORDER BY height DESC;", (String[]) null);
            do {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    cVarArr[i].f46a = cursor.getInt(0);
                    cVarArr[i].f47b = cursor.getInt(1);
                    cVarArr[i].f48c = cursor.getInt(2);
                    cVarArr[i].f49d = cursor.getInt(3);
                    cVarArr[i].f50e = cursor.getInt(4);
                    cVarArr[i].f51f = (double) cursor.getInt(5);
                    cVarArr[i].f52g = cursor.getInt(6);
                    cVarArr[i].f53h = cursor.getInt(7);
                    cVarArr[i].f54i = cursor.getInt(8);
                    cVarArr[i].f57l = cursor.getInt(9);
                    i++;
                } catch (Exception e) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                    }
                    this.f10i.endTransaction();
                    return cVarArr;
                } catch (Throwable th) {
                    cursor2 = cursor;
                    th = th;
                    try {
                        cursor2.close();
                    } catch (Exception e3) {
                    }
                    this.f10i.endTransaction();
                    throw th;
                }
            } while (i != 6);
            this.f10i.setTransactionSuccessful();
            try {
                cursor.close();
            } catch (Exception e4) {
            }
            this.f10i.endTransaction();
            return cVarArr;
        } catch (Exception e5) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor2.close();
            this.f10i.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ Exception -> 0x0068, all -> 0x0072 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13e() {
        /*
            r7 = this;
            r3 = 0
            java.lang.String r2 = "select sum(big) + sum(small) + sum(midium) from sumneko;"
            java.lang.String r4 = "select big + medium + small from totalneko;"
            r0 = 0
            android.database.sqlite.SQLiteDatabase r5 = r7.f10i
            r5.beginTransaction()
            android.database.sqlite.SQLiteDatabase r5 = r7.f10i     // Catch:{ Exception -> 0x0052, all -> 0x005d }
            r6 = 0
            android.database.Cursor r2 = r5.rawQuery(r2, r6)     // Catch:{ Exception -> 0x0052, all -> 0x005d }
            boolean r5 = r2.moveToNext()     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            if (r5 == 0) goto L_0x001f
            r5 = 0
            int r0 = r2.getInt(r5)     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
        L_0x001f:
            android.database.sqlite.SQLiteDatabase r5 = r7.f10i     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            r5.setTransactionSuccessful()     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            r2.close()     // Catch:{ Exception -> 0x0080 }
        L_0x0027:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i
            r2.endTransaction()
        L_0x002c:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i
            r2.beginTransaction()
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            r5 = 0
            android.database.Cursor r3 = r2.rawQuery(r4, r5)     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            boolean r2 = r3.moveToNext()     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            if (r2 == 0) goto L_0x0044
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            long r0 = r0 + r4
        L_0x0044:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x0068, all -> 0x0072 }
            r3.close()     // Catch:{ Exception -> 0x0086 }
        L_0x004c:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i
            r2.endTransaction()
        L_0x0051:
            return r0
        L_0x0052:
            r2 = move-exception
            r2 = r3
        L_0x0054:
            r2.close()     // Catch:{ Exception -> 0x007c }
        L_0x0057:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i
            r2.endTransaction()
            goto L_0x002c
        L_0x005d:
            r0 = move-exception
            r2 = r3
        L_0x005f:
            r2.close()     // Catch:{ Exception -> 0x007e }
        L_0x0062:
            android.database.sqlite.SQLiteDatabase r1 = r7.f10i
            r1.endTransaction()
            throw r0
        L_0x0068:
            r2 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0082 }
        L_0x006c:
            android.database.sqlite.SQLiteDatabase r2 = r7.f10i
            r2.endTransaction()
            goto L_0x0051
        L_0x0072:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x0084 }
        L_0x0076:
            android.database.sqlite.SQLiteDatabase r1 = r7.f10i
            r1.endTransaction()
            throw r0
        L_0x007c:
            r2 = move-exception
            goto L_0x0057
        L_0x007e:
            r1 = move-exception
            goto L_0x0062
        L_0x0080:
            r2 = move-exception
            goto L_0x0027
        L_0x0082:
            r2 = move-exception
            goto L_0x006c
        L_0x0084:
            r1 = move-exception
            goto L_0x0076
        L_0x0086:
            r2 = move-exception
            goto L_0x004c
        L_0x0088:
            r0 = move-exception
            goto L_0x005f
        L_0x008a:
            r5 = move-exception
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.p000a.p001a.C0001a.mo13e():long");
    }

    /* renamed from: f */
    public final long[] mo14f() {
        Cursor cursor;
        Throwable th;
        long[] jArr = null;
        this.f10i.beginTransaction();
        try {
            cursor = this.f10i.rawQuery("select height,area_height,area,map_pt,map_x from totalneko;", (String[]) null);
            try {
                if (cursor.moveToNext()) {
                    jArr = new long[]{cursor.getLong(0), cursor.getLong(1), cursor.getLong(2), cursor.getLong(3), cursor.getLong(4)};
                }
                this.f10i.setTransactionSuccessful();
                try {
                    cursor.close();
                } catch (Exception e) {
                }
                this.f10i.endTransaction();
            } catch (Exception e2) {
                try {
                    cursor.close();
                } catch (Exception e3) {
                }
                this.f10i.endTransaction();
                return jArr;
            } catch (Throwable th2) {
                th = th2;
                try {
                    cursor.close();
                } catch (Exception e4) {
                }
                this.f10i.endTransaction();
                throw th;
            }
        } catch (Exception e5) {
            cursor = null;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            cursor = null;
            th = th4;
            cursor.close();
            this.f10i.endTransaction();
            throw th;
        }
        return jArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x004d] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15g() {
        /*
            r6 = this;
            r0 = 0
            r2 = 0
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "select sum(big) + sum(small) + sum(midium) from sumneko_today where year = "
            r3.<init>(r4)
            java.lang.String r4 = "yyyy"
            java.lang.String r4 = m0a(r1, r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " and month = "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "MM"
            java.lang.String r4 = m0a(r1, r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " and day = "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "dd"
            java.lang.String r1 = m0a(r1, r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ";"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.database.sqlite.SQLiteDatabase r3 = r6.f10i
            r3.beginTransaction()
            android.database.sqlite.SQLiteDatabase r3 = r6.f10i     // Catch:{ Exception -> 0x0066, all -> 0x0072 }
            r4 = 0
            android.database.Cursor r1 = r3.rawQuery(r1, r4)     // Catch:{ Exception -> 0x0066, all -> 0x0072 }
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            if (r0 == 0) goto L_0x008c
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
        L_0x0058:
            android.database.sqlite.SQLiteDatabase r2 = r6.f10i     // Catch:{ Exception -> 0x008a, all -> 0x0085 }
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x008a, all -> 0x0085 }
            r1.close()     // Catch:{ Exception -> 0x0083 }
        L_0x0060:
            android.database.sqlite.SQLiteDatabase r1 = r6.f10i
            r1.endTransaction()
        L_0x0065:
            return r0
        L_0x0066:
            r1 = move-exception
            r1 = r0
            r0 = r2
        L_0x0069:
            r1.close()     // Catch:{ Exception -> 0x007f }
        L_0x006c:
            android.database.sqlite.SQLiteDatabase r1 = r6.f10i
            r1.endTransaction()
            goto L_0x0065
        L_0x0072:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0076:
            r1.close()     // Catch:{ Exception -> 0x0081 }
        L_0x0079:
            android.database.sqlite.SQLiteDatabase r1 = r6.f10i
            r1.endTransaction()
            throw r0
        L_0x007f:
            r1 = move-exception
            goto L_0x006c
        L_0x0081:
            r1 = move-exception
            goto L_0x0079
        L_0x0083:
            r1 = move-exception
            goto L_0x0060
        L_0x0085:
            r0 = move-exception
            goto L_0x0076
        L_0x0087:
            r0 = move-exception
            r0 = r2
            goto L_0x0069
        L_0x008a:
            r2 = move-exception
            goto L_0x0069
        L_0x008c:
            r0 = r2
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.p000a.p001a.C0001a.mo15g():int");
    }
}
