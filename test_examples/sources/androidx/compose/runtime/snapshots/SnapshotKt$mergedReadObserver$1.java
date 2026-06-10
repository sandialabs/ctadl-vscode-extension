package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lm7/n;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SnapshotKt$mergedReadObserver$1 extends Lambda implements l<Object, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<Object, n> f2949j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l<Object, n> f2950k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedReadObserver$1(l<Object, n> lVar, l<Object, n> lVar2) {
        super(1);
        this.f2949j = lVar;
        this.f2950k = lVar2;
    }

    @Override // u7.l
    public final n U(Object obj) {
        g.f(obj, "state");
        this.f2949j.U(obj);
        this.f2950k.U(obj);
        return n.f16010a;
    }
}
