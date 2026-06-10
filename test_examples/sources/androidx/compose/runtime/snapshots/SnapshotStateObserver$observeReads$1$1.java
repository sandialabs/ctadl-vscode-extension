package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p0.f;
import p0.z;
import u7.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$observeReads$1$1 extends Lambda implements a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f2980j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a<n> f2981k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$observeReads$1$1(SnapshotStateObserver snapshotStateObserver, a<n> aVar) {
        super(0);
        this.f2980j = snapshotStateObserver;
        this.f2981k = aVar;
    }

    @Override // u7.a
    public final n k0() {
        p0.a aVar;
        f zVar;
        l<Object, n> lVar = this.f2980j.c;
        a<n> aVar2 = this.f2981k;
        g.f(aVar2, "block");
        if (lVar == null) {
            aVar2.k0();
        } else {
            f fVar = (f) SnapshotKt.f2939b.d();
            try {
                if (fVar != null && !(fVar instanceof p0.a)) {
                    zVar = fVar.r(lVar);
                    f i10 = zVar.i();
                    aVar2.k0();
                    f.o(i10);
                }
                f i102 = zVar.i();
                aVar2.k0();
                f.o(i102);
            } finally {
                zVar.c();
            }
            if (fVar instanceof p0.a) {
                aVar = (p0.a) fVar;
            } else {
                aVar = null;
            }
            zVar = new z(aVar, lVar, null, true, false);
        }
        return n.f16010a;
    }
}
