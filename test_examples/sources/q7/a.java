package q7;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class a implements p7.c<Object> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16941i = new a();

    @Override // p7.c
    public final CoroutineContext f() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p7.c
    public final void t(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
