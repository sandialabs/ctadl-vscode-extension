package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import ma.i;
import u7.l;
import v0.u;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<u, n> f3489j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f3490k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f3491l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ float f3492m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1(l<? super u, n> lVar, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j2, float f10) {
        super(0);
        this.f3489j = lVar;
        this.f3490k = layoutNodeLayoutDelegate;
        this.f3491l = j2;
        this.f3492m = f10;
    }

    @Override // u7.a
    public final n k0() {
        b0.a.C0134a c0134a = b0.a.f12644a;
        l<u, n> lVar = this.f3489j;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f3490k;
        long j2 = this.f3491l;
        float f10 = this.f3492m;
        if (lVar == null) {
            NodeCoordinator a10 = layoutNodeLayoutDelegate.a();
            c0134a.getClass();
            b0.a.d(a10, j2, f10);
        } else {
            NodeCoordinator a11 = layoutNodeLayoutDelegate.a();
            c0134a.getClass();
            g.f(a11, "$this$placeWithLayer");
            long h02 = a11.h0();
            a11.s0(i.g(((int) (j2 >> 32)) + ((int) (h02 >> 32)), b2.g.a(h02) + b2.g.a(j2)), f10, lVar);
        }
        return n.f16010a;
    }
}
