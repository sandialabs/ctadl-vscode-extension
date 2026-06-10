package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import n7.l;
import y9.m0;

/* loaded from: classes.dex */
public final class NewCapturedTypeConstructor$refine$1$1 extends Lambda implements u7.a<List<? extends m0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewCapturedTypeConstructor f14987j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f14988k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, e eVar) {
        super(0);
        this.f14987j = newCapturedTypeConstructor;
        this.f14988k = eVar;
    }

    @Override // u7.a
    public final List<? extends m0> k0() {
        Iterable<m0> iterable = (List) this.f14987j.f14983e.getValue();
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (m0 m0Var : iterable) {
            arrayList.add(m0Var.Z0(this.f14988k));
        }
        return arrayList;
    }
}
