package aa;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.d0;
import m8.e;
import o8.j;
import o8.l;

/* loaded from: classes.dex */
public final class a extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(h9.e eVar) {
        super(r2, eVar, r4, r5, r10, LockBasedStorageManager.f14904e);
        h hVar = h.f405a;
        c cVar = h.f406b;
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.f13431i;
        EmptyList emptyList = EmptyList.f12981i;
        d0.a aVar = d0.f15835a;
        j jVar = new j(this, null, e.a.f16014a, true, CallableMemberDescriptor.Kind.DECLARATION, aVar);
        jVar.d1(emptyList, l8.l.f15841d);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.f15012o;
        String str = jVar.getName().f11572i;
        v7.g.e(str, "errorConstructor.name.toString()");
        e b5 = h.b(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        jVar.a1(new f(h.d(errorTypeKind, new String[0]), b5, errorTypeKind, emptyList, false, new String[0]));
        S0(b5, a1.c.v1(jVar), jVar);
    }

    @Override // o8.b, o8.w
    public final MemberScope K(q qVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(qVar, "typeSubstitution");
        v7.g.f(eVar, "kotlinTypeRefiner");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.f15012o;
        String str = getName().f11572i;
        v7.g.e(str, "name.toString()");
        return h.b(errorScopeKind, str, qVar.toString());
    }

    @Override // o8.b
    public final l8.b M0(TypeSubstitutor typeSubstitutor) {
        v7.g.f(typeSubstitutor, "substitutor");
        return this;
    }

    @Override // o8.b, l8.f0
    public final l8.g d(TypeSubstitutor typeSubstitutor) {
        v7.g.f(typeSubstitutor, "substitutor");
        return this;
    }

    @Override // o8.l
    public final String toString() {
        String b5 = getName().b();
        v7.g.e(b5, "name.asString()");
        return b5;
    }
}
