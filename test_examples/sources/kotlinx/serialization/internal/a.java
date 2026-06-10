package kotlinx.serialization.internal;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import m7.e;
import m7.n;
import qa.b;
import ta.c;
import ta.d;
import v7.g;

/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f15661a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptyList f15662b;
    public final e c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(n nVar) {
        g.f(nVar, "objectInstance");
        this.f15661a = nVar;
        this.f15662b = EmptyList.f12981i;
        this.c = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new ObjectSerializer$descriptor$2(this));
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return (sa.e) this.c.getValue();
    }

    @Override // qa.e
    public final void b(d dVar, T t10) {
        g.f(dVar, "encoder");
        g.f(t10, "value");
        dVar.b(a()).a(a());
    }

    @Override // qa.a
    public final T e(c cVar) {
        g.f(cVar, "decoder");
        sa.e a10 = a();
        ta.a b5 = cVar.b(a10);
        int t10 = b5.t(a());
        if (t10 == -1) {
            n nVar = n.f16010a;
            b5.a(a10);
            return this.f15661a;
        }
        throw new SerializationException(androidx.activity.e.g("Unexpected index ", t10));
    }
}
