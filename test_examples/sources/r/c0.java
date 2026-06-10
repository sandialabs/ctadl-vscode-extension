package r;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16972a;

    public c0(float f10, float f11, i iVar) {
        b8.i V1 = a1.c.V1(0, iVar.b());
        ArrayList arrayList = new ArrayList(n7.l.Z1(V1, 10));
        b8.h it = V1.iterator();
        while (it.f6502k) {
            arrayList.add(new androidx.compose.animation.core.c(f10, f11, iVar.a(it.nextInt())));
        }
        this.f16972a = arrayList;
    }

    @Override // r.j
    public final r get(int i10) {
        return (androidx.compose.animation.core.c) this.f16972a.get(i10);
    }
}
