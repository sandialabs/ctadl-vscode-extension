package com.robinhood.ticker;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f10178a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f10179b;
    public final HashMap c;

    /* renamed from: com.robinhood.ticker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0101a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10180a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10181b;

        public C0101a(int i10, int i11) {
            this.f10180a = i10;
            this.f10181b = i11;
        }
    }

    public a(String str) {
        int i10 = 0;
        if (str.contains(Character.toString((char) 0))) {
            throw new IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.f10178a = length;
        this.c = new HashMap(length);
        for (int i11 = 0; i11 < length; i11++) {
            this.c.put(Character.valueOf(charArray[i11]), Integer.valueOf(i11));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.f10179b = cArr;
        cArr[0] = 0;
        while (i10 < length) {
            char[] cArr2 = this.f10179b;
            int i12 = i10 + 1;
            cArr2[i12] = charArray[i10];
            cArr2[length + 1 + i10] = charArray[i10];
            i10 = i12;
        }
    }

    public final int a(char c) {
        if (c == 0) {
            return 0;
        }
        HashMap hashMap = this.c;
        if (hashMap.containsKey(Character.valueOf(c))) {
            return ((Integer) hashMap.get(Character.valueOf(c))).intValue() + 1;
        }
        return -1;
    }
}
