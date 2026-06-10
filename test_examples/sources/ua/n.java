package ua;

import kotlin.Result;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17992a;

    static {
        Object Q;
        try {
            Q = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        if (!(Q instanceof Result.Failure)) {
            Class cls = (Class) Q;
            Q = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (Q instanceof Result.Failure) {
            Q = obj;
        }
        f17992a = ((Boolean) Q).booleanValue();
    }
}
