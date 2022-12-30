package com.google.ads.util;

/* renamed from: com.google.ads.util.e */
public final class C0264e extends C0263d {

    /* renamed from: g */
    static final /* synthetic */ boolean f1321g = (!C0262c.class.desiredAssertionStatus());

    /* renamed from: h */
    private static final byte[] f1322h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: i */
    private static final byte[] f1323i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: c */
    public int f1324c = 0;

    /* renamed from: d */
    public final boolean f1325d = false;

    /* renamed from: e */
    public final boolean f1326e = false;

    /* renamed from: f */
    public final boolean f1327f = false;

    /* renamed from: j */
    private final byte[] f1328j = new byte[2];

    /* renamed from: k */
    private int f1329k;

    /* renamed from: l */
    private final byte[] f1330l = f1323i;

    public C0264e() {
        this.f1319a = null;
        this.f1329k = this.f1326e ? 19 : -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo687a(byte[] r14, int r15) {
        /*
            r13 = this;
            r6 = 2
            r12 = 13
            r11 = 10
            r3 = 1
            r4 = 0
            byte[] r7 = r13.f1330l
            byte[] r8 = r13.f1319a
            int r2 = r13.f1329k
            int r9 = r15 + 0
            r0 = -1
            int r1 = r13.f1324c
            switch(r1) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00c4;
                default: goto L_0x0015;
            }
        L_0x0015:
            r5 = r0
            r1 = r4
        L_0x0017:
            r0 = -1
            if (r5 == r0) goto L_0x01ef
            int r0 = r5 >> 18
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r4] = r0
            int r0 = r5 >> 12
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r3] = r0
            int r0 = r5 >> 6
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r6] = r0
            r6 = 3
            r0 = 4
            r5 = r5 & 63
            byte r5 = r7[r5]
            r8[r6] = r5
            int r2 = r2 + -1
            if (r2 != 0) goto L_0x01eb
            boolean r2 = r13.f1327f
            if (r2 == 0) goto L_0x0046
            r2 = 4
            r0 = 5
            r8[r2] = r12
        L_0x0046:
            int r5 = r0 + 1
            r8[r0] = r11
            r0 = 19
            r6 = r0
        L_0x004d:
            int r0 = r1 + 3
            if (r0 > r9) goto L_0x00e2
            byte r0 = r14[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            int r2 = r1 + 1
            byte r2 = r14[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = r1 + 2
            byte r2 = r14[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            int r2 = r0 >> 18
            r2 = r2 & 63
            byte r2 = r7[r2]
            r8[r5] = r2
            int r2 = r5 + 1
            int r10 = r0 >> 12
            r10 = r10 & 63
            byte r10 = r7[r10]
            r8[r2] = r10
            int r2 = r5 + 2
            int r10 = r0 >> 6
            r10 = r10 & 63
            byte r10 = r7[r10]
            r8[r2] = r10
            int r2 = r5 + 3
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r2] = r0
            int r2 = r1 + 3
            int r1 = r5 + 4
            int r0 = r6 + -1
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r13.f1327f
            if (r0 == 0) goto L_0x01e3
            int r0 = r1 + 1
            r8[r1] = r12
        L_0x009b:
            int r5 = r0 + 1
            r8[r0] = r11
            r0 = 19
            r1 = r2
            r6 = r0
            goto L_0x004d
        L_0x00a4:
            r5 = r0
            r1 = r4
            goto L_0x0017
        L_0x00a8:
            if (r6 > r9) goto L_0x0015
            byte[] r0 = r13.f1328j
            byte r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r14[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r14[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r13.f1324c = r4
            r5 = r0
            r1 = r6
            goto L_0x0017
        L_0x00c4:
            if (r9 <= 0) goto L_0x0015
            byte[] r0 = r13.f1328j
            byte r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte[] r1 = r13.f1328j
            byte r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r14[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            r13.f1324c = r4
            r5 = r0
            r1 = r3
            goto L_0x0017
        L_0x00e2:
            int r0 = r13.f1324c
            int r0 = r1 - r0
            int r2 = r9 + -1
            if (r0 != r2) goto L_0x0146
            int r0 = r13.f1324c
            if (r0 <= 0) goto L_0x013f
            byte[] r0 = r13.f1328j
            byte r0 = r0[r4]
            r2 = r3
        L_0x00f3:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 4
            int r0 = r13.f1324c
            int r0 = r0 - r2
            r13.f1324c = r0
            int r2 = r5 + 1
            int r0 = r4 >> 6
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r5] = r0
            int r0 = r2 + 1
            r4 = r4 & 63
            byte r4 = r7[r4]
            r8[r2] = r4
            boolean r2 = r13.f1325d
            if (r2 == 0) goto L_0x011e
            int r2 = r0 + 1
            r4 = 61
            r8[r0] = r4
            int r0 = r2 + 1
            r4 = 61
            r8[r2] = r4
        L_0x011e:
            boolean r2 = r13.f1326e
            if (r2 == 0) goto L_0x0130
            boolean r2 = r13.f1327f
            if (r2 == 0) goto L_0x012b
            int r2 = r0 + 1
            r8[r0] = r12
            r0 = r2
        L_0x012b:
            int r2 = r0 + 1
            r8[r0] = r11
            r0 = r2
        L_0x0130:
            r5 = r0
        L_0x0131:
            boolean r0 = f1321g
            if (r0 != 0) goto L_0x01ce
            int r0 = r13.f1324c
            if (r0 == 0) goto L_0x01ce
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x013f:
            int r2 = r1 + 1
            byte r0 = r14[r1]
            r1 = r2
            r2 = r4
            goto L_0x00f3
        L_0x0146:
            int r0 = r13.f1324c
            int r0 = r1 - r0
            int r2 = r9 + -2
            if (r0 != r2) goto L_0x01b6
            int r0 = r13.f1324c
            if (r0 <= r3) goto L_0x01aa
            byte[] r0 = r13.f1328j
            byte r0 = r0[r4]
            r4 = r3
        L_0x0157:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r10 = r0 << 10
            int r0 = r13.f1324c
            if (r0 <= 0) goto L_0x01b0
            byte[] r0 = r13.f1328j
            int r2 = r4 + 1
            byte r0 = r0[r4]
            r4 = r2
        L_0x0166:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 2
            r0 = r0 | r10
            int r2 = r13.f1324c
            int r2 = r2 - r4
            r13.f1324c = r2
            int r2 = r5 + 1
            int r4 = r0 >> 12
            r4 = r4 & 63
            byte r4 = r7[r4]
            r8[r5] = r4
            int r4 = r2 + 1
            int r5 = r0 >> 6
            r5 = r5 & 63
            byte r5 = r7[r5]
            r8[r2] = r5
            int r2 = r4 + 1
            r0 = r0 & 63
            byte r0 = r7[r0]
            r8[r4] = r0
            boolean r0 = r13.f1325d
            if (r0 == 0) goto L_0x01e1
            int r0 = r2 + 1
            r4 = 61
            r8[r2] = r4
        L_0x0196:
            boolean r2 = r13.f1326e
            if (r2 == 0) goto L_0x01a8
            boolean r2 = r13.f1327f
            if (r2 == 0) goto L_0x01a3
            int r2 = r0 + 1
            r8[r0] = r12
            r0 = r2
        L_0x01a3:
            int r2 = r0 + 1
            r8[r0] = r11
            r0 = r2
        L_0x01a8:
            r5 = r0
            goto L_0x0131
        L_0x01aa:
            int r2 = r1 + 1
            byte r0 = r14[r1]
            r1 = r2
            goto L_0x0157
        L_0x01b0:
            int r2 = r1 + 1
            byte r0 = r14[r1]
            r1 = r2
            goto L_0x0166
        L_0x01b6:
            boolean r0 = r13.f1326e
            if (r0 == 0) goto L_0x0131
            if (r5 <= 0) goto L_0x0131
            r0 = 19
            if (r6 == r0) goto L_0x0131
            boolean r0 = r13.f1327f
            if (r0 == 0) goto L_0x01df
            int r0 = r5 + 1
            r8[r5] = r12
        L_0x01c8:
            int r5 = r0 + 1
            r8[r0] = r11
            goto L_0x0131
        L_0x01ce:
            boolean r0 = f1321g
            if (r0 != 0) goto L_0x01da
            if (r1 == r9) goto L_0x01da
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x01da:
            r13.f1320b = r5
            r13.f1329k = r6
            return r3
        L_0x01df:
            r0 = r5
            goto L_0x01c8
        L_0x01e1:
            r0 = r2
            goto L_0x0196
        L_0x01e3:
            r0 = r1
            goto L_0x009b
        L_0x01e6:
            r6 = r0
            r5 = r1
            r1 = r2
            goto L_0x004d
        L_0x01eb:
            r6 = r2
            r5 = r0
            goto L_0x004d
        L_0x01ef:
            r6 = r2
            r5 = r4
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.util.C0264e.mo687a(byte[], int):boolean");
    }
}
