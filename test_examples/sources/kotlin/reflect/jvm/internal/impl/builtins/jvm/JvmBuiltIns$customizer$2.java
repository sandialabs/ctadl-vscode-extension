package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.b;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
final class JvmBuiltIns$customizer$2 extends Lambda implements u7.a<JvmBuiltInsCustomizer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f13387j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h f13388k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<b.a> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f13389j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar) {
            super(0);
            this.f13389j = bVar;
        }

        @Override // u7.a
        public final b.a k0() {
            b bVar = this.f13389j;
            u7.a<b.a> aVar = bVar.f13420f;
            if (aVar != null) {
                b.a k02 = aVar.k0();
                bVar.f13420f = null;
                return k02;
            }
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(b bVar, LockBasedStorageManager lockBasedStorageManager) {
        super(0);
        this.f13387j = bVar;
        this.f13388k = lockBasedStorageManager;
    }

    @Override // u7.a
    public final JvmBuiltInsCustomizer k0() {
        b bVar = this.f13387j;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c l2 = bVar.l();
        g.e(l2, "builtInsModule");
        return new JvmBuiltInsCustomizer(l2, this.f13388k, new AnonymousClass1(bVar));
    }
}
