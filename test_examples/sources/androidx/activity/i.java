package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f462a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f463b = new CopyOnWriteArrayList<>();
    public z2.a<Boolean> c;

    public i(boolean z10) {
        this.f462a = z10;
    }

    public abstract void a();

    public final void b(boolean z10) {
        this.f462a = z10;
        z2.a<Boolean> aVar = this.c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z10));
        }
    }
}
