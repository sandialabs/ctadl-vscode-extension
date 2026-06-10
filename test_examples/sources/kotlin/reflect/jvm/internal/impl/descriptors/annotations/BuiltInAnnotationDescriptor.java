package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import l8.d0;
import m8.c;
import m9.g;
import y9.r;

/* loaded from: classes.dex */
public final class BuiltInAnnotationDescriptor implements c {

    /* renamed from: a  reason: collision with root package name */
    public final e f13477a;

    /* renamed from: b  reason: collision with root package name */
    public final h9.c f13478b;
    public final Map<h9.e, g<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final m7.e f13479d;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(e eVar, h9.c cVar, Map<h9.e, ? extends g<?>> map) {
        v7.g.f(eVar, "builtIns");
        v7.g.f(cVar, "fqName");
        this.f13477a = eVar;
        this.f13478b = cVar;
        this.c = map;
        this.f13479d = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new BuiltInAnnotationDescriptor$type$2(this));
    }

    @Override // m8.c
    public final Map<h9.e, g<?>> a() {
        return this.c;
    }

    @Override // m8.c
    public final r b() {
        Object value = this.f13479d.getValue();
        v7.g.e(value, "<get-type>(...)");
        return (r) value;
    }

    @Override // m8.c
    public final h9.c e() {
        return this.f13478b;
    }

    @Override // m8.c
    public final d0 j() {
        return d0.f15835a;
    }
}
