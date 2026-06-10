package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o extends Fragment.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.a f5237a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5238b;
    public final /* synthetic */ b.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f5239d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Fragment f5240e;

    public o(Fragment fragment, n nVar, AtomicReference atomicReference, b.a aVar, androidx.activity.result.b bVar) {
        this.f5240e = fragment;
        this.f5237a = nVar;
        this.f5238b = atomicReference;
        this.c = aVar;
        this.f5239d = bVar;
    }

    @Override // androidx.fragment.app.Fragment.c
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        Fragment fragment = this.f5240e;
        sb.append(fragment.f5040m);
        sb.append("_rq#");
        sb.append(fragment.f5034a0.getAndIncrement());
        this.f5238b.set(((androidx.activity.result.f) this.f5237a.apply()).c(sb.toString(), fragment, this.c, this.f5239d));
    }
}
