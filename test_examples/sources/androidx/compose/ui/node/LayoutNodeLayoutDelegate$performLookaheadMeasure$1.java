package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.r;
import m7.n;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$performLookaheadMeasure$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f3494j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f3495k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$performLookaheadMeasure$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j2) {
        super(0);
        this.f3494j = layoutNodeLayoutDelegate;
        this.f3495k = j2;
    }

    @Override // u7.a
    public final n k0() {
        r rVar = this.f3494j.a().f3508x;
        g.c(rVar);
        rVar.b(this.f3495k);
        return n.f16010a;
    }
}
