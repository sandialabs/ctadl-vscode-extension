package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p extends androidx.activity.result.c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5246a;

    public p(AtomicReference atomicReference) {
        this.f5246a = atomicReference;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f5246a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }
}
