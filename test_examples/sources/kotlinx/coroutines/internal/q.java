package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15494a = 0;

    static {
        Object Q;
        Object Q2;
        try {
            Q = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        if (Result.a(Q) != null) {
            Q = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) Q;
        try {
            Q2 = q.class.getCanonicalName();
        } catch (Throwable th2) {
            Q2 = m0.b.Q(th2);
        }
        if (Result.a(Q2) != null) {
            Q2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) Q2;
    }
}
