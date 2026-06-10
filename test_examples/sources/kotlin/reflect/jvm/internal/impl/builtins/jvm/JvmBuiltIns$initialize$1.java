package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.b;
import l8.s;

/* loaded from: classes.dex */
final class JvmBuiltIns$initialize$1 extends Lambda implements u7.a<b.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f13390j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f13391k = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        super(0);
        this.f13390j = cVar;
    }

    @Override // u7.a
    public final b.a k0() {
        return new b.a(this.f13390j, this.f13391k);
    }
}
