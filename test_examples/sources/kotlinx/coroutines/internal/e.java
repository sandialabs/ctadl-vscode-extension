package kotlinx.coroutines.internal;

import ja.x;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class e implements x {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f15474i;

    public e(CoroutineContext coroutineContext) {
        this.f15474i = coroutineContext;
    }

    @Override // ja.x
    public final CoroutineContext j() {
        return this.f15474i;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f15474i + ')';
    }
}
