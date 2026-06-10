package ua;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final qa.b<Key> f18038a;

    /* renamed from: b  reason: collision with root package name */
    public final qa.b<Value> f18039b;

    public z0(qa.b bVar, qa.b bVar2) {
        this.f18038a = bVar;
        this.f18039b = bVar2;
    }

    @Override // qa.b, qa.e, qa.a
    public abstract sa.e a();

    @Override // qa.e
    public final void b(ta.d dVar, Collection collection) {
        v7.g.f(dVar, "encoder");
        i(collection);
        sa.e a10 = a();
        ta.b j02 = dVar.j0(a10);
        Iterator<Map.Entry<? extends Key, ? extends Value>> h10 = h(collection);
        int i10 = 0;
        while (h10.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = h10.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            j02.g0(a(), i10, this.f18038a, key);
            j02.g0(a(), i11, this.f18039b, value);
            i10 = i11 + 1;
        }
        j02.a(a10);
    }

    @Override // ua.a
    /* renamed from: n */
    public final void k(ta.a aVar, int i10, Builder builder, boolean z10) {
        int i11;
        Object A;
        v7.g.f(builder, "builder");
        Object A2 = aVar.A(a(), i10, this.f18038a, null);
        boolean z11 = true;
        if (z10) {
            i11 = aVar.t(a());
            if (i11 != i10 + 1) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalArgumentException(a4.b.j("Value must follow key in a map, index for key: ", i10, ", returned index for value: ", i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        boolean containsKey = builder.containsKey(A2);
        qa.b<Value> bVar = this.f18039b;
        if (containsKey && !(bVar.a().h() instanceof sa.d)) {
            A = aVar.A(a(), i11, bVar, kotlin.collections.d.L1(A2, builder));
        } else {
            A = aVar.A(a(), i11, bVar, null);
        }
        builder.put(A2, A);
    }
}
