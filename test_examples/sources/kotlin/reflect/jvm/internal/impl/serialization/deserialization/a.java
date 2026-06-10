package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.s;
import l8.u;
import l8.w;
import u7.l;
import u9.m;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public abstract class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public final h f14818a;

    /* renamed from: b  reason: collision with root package name */
    public final m f14819b;
    public final s c;

    /* renamed from: d  reason: collision with root package name */
    public u9.e f14820d;

    /* renamed from: e  reason: collision with root package name */
    public final x9.d<h9.c, u> f14821e;

    public a(LockBasedStorageManager lockBasedStorageManager, q8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        this.f14818a = lockBasedStorageManager;
        this.f14819b = fVar;
        this.c = cVar;
        this.f14821e = lockBasedStorageManager.h(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    }

    @Override // l8.v
    public final List<u> a(h9.c cVar) {
        g.f(cVar, "fqName");
        return a1.c.P0(this.f14821e.U(cVar));
    }

    @Override // l8.w
    public final void b(h9.c cVar, ArrayList arrayList) {
        g.f(cVar, "fqName");
        m0.b.u(arrayList, this.f14821e.U(cVar));
    }

    @Override // l8.w
    public final boolean c(h9.c cVar) {
        u uVar;
        g.f(cVar, "fqName");
        x9.d<h9.c, u> dVar = this.f14821e;
        if (((LockBasedStorageManager.j) dVar).b(cVar)) {
            uVar = dVar.U(cVar);
        } else {
            k8.e eVar = (k8.e) this;
            InputStream c = eVar.f14819b.c(cVar);
            if (c != null) {
                uVar = a.C0167a.a(cVar, eVar.f14818a, eVar.c, c, false);
            } else {
                uVar = null;
            }
        }
        if (uVar != null) {
            return false;
        }
        return true;
    }

    @Override // l8.v
    public final Collection<h9.c> q(h9.c cVar, l<? super h9.e, Boolean> lVar) {
        g.f(cVar, "fqName");
        g.f(lVar, "nameFilter");
        return EmptySet.f12983i;
    }
}
