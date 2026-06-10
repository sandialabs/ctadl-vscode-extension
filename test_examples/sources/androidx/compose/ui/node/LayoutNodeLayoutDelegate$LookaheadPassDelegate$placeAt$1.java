package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.r;
import m7.n;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f3470j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f3471k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j2) {
        super(0);
        this.f3470j = layoutNodeLayoutDelegate;
        this.f3471k = j2;
    }

    @Override // u7.a
    public final n k0() {
        b0.a.C0134a c0134a = b0.a.f12644a;
        r rVar = this.f3470j.a().f3508x;
        g.c(rVar);
        b0.a.e(c0134a, rVar, this.f3471k);
        return n.f16010a;
    }
}
