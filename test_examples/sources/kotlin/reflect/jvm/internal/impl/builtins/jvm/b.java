package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import c8.j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.s;
import v7.g;
import v7.i;
import x9.h;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13419h = {i.c(new PropertyReference1Impl(i.a(b.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: f  reason: collision with root package name */
    public u7.a<a> f13420f;

    /* renamed from: g  reason: collision with root package name */
    public final x9.e f13421g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final s f13422a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13423b;

        public a(s sVar, boolean z10) {
            g.f(sVar, "ownerModuleDescriptor");
            this.f13422a = sVar;
            this.f13423b = z10;
        }
    }

    public b(LockBasedStorageManager lockBasedStorageManager) {
        super(lockBasedStorageManager);
        this.f13421g = lockBasedStorageManager.a(new JvmBuiltIns$customizer$2(this, lockBasedStorageManager));
    }

    public final JvmBuiltInsCustomizer M() {
        return (JvmBuiltInsCustomizer) m0.b.u0(this.f13421g, f13419h[0]);
    }

    public final void N(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        this.f13420f = new JvmBuiltIns$initialize$1(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.e
    public final n8.a e() {
        return M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.e
    public final Iterable m() {
        Iterable<n8.b> m10 = super.m();
        h hVar = this.f13327d;
        if (hVar != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.c l2 = l();
            g.e(l2, "builtInsModule");
            return kotlin.collections.c.y2(m10, new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(hVar, l2));
        }
        e.a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.e
    public final n8.c q() {
        return M();
    }
}
