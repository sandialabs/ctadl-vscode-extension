package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public final class a implements u7.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TypeSubstitutor f13527i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f13528j;

    public a(b bVar, TypeSubstitutor typeSubstitutor) {
        this.f13528j = bVar;
        this.f13527i = typeSubstitutor;
    }

    @Override // u7.a
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> k0() {
        fa.c cVar = new fa.c();
        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : this.f13528j.f()) {
            cVar.add(eVar.d(this.f13527i));
        }
        return cVar;
    }
}
