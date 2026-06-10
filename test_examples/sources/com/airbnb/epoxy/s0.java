package com.airbnb.epoxy;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f6692b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public r<?> f6693a;

    public static int a(r<?> rVar) {
        int i10 = rVar.i();
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = rVar.getClass();
        HashMap hashMap = f6692b;
        Integer num = (Integer) hashMap.get(cls);
        if (num == null) {
            num = Integer.valueOf((-hashMap.size()) - 1);
            hashMap.put(cls, num);
        }
        return num.intValue();
    }
}
