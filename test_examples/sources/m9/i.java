package m9;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* loaded from: classes.dex */
public final class i extends g<Pair<? extends h9.b, ? extends h9.e>> {

    /* renamed from: b  reason: collision with root package name */
    public final h9.b f16023b;
    public final h9.e c;

    public i(h9.b bVar, h9.e eVar) {
        super(new Pair(bVar, eVar));
        this.f16023b = bVar;
        this.c = eVar;
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        h9.b bVar = this.f16023b;
        l8.b a10 = FindClassInModuleKt.a(sVar, bVar);
        y9.v vVar = null;
        if (a10 != null) {
            if (!k9.d.n(a10, ClassKind.f13433k)) {
                a10 = null;
            }
            if (a10 != null) {
                vVar = a10.r();
            }
        }
        if (vVar == null) {
            ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
            String bVar2 = bVar.toString();
            v7.g.e(bVar2, "enumClassId.toString()");
            String str = this.c.f11572i;
            v7.g.e(str, "enumEntryName.toString()");
            return aa.h.c(errorTypeKind, bVar2, str);
        }
        return vVar;
    }

    @Override // m9.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16023b.j());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
