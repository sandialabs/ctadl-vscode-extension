package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.datastore.preferences.PreferencesProto$Value;
import h0.c;
import h0.e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import p0.f;
import u7.a;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Lp0/f;", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(Ljava/util/Set;Lp0/f;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$applyObserver$1 extends Lambda implements p<Set<? extends Object>, f, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SnapshotStateObserver f2978j;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SnapshotStateObserver f2979j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SnapshotStateObserver snapshotStateObserver) {
            super(0);
            this.f2979j = snapshotStateObserver;
        }

        @Override // u7.a
        public final n k0() {
            SnapshotStateObserver snapshotStateObserver = this.f2979j;
            synchronized (snapshotStateObserver.f2961d) {
                e<SnapshotStateObserver.ObservedScopeMap> eVar = snapshotStateObserver.f2961d;
                int i10 = eVar.f11334k;
                if (i10 > 0) {
                    SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = eVar.f11332i;
                    g.d(observedScopeMapArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i11 = 0;
                    do {
                        SnapshotStateObserver.ObservedScopeMap observedScopeMap = observedScopeMapArr[i11];
                        c<Object> cVar = observedScopeMap.f2970g;
                        int i12 = cVar.f11325i;
                        for (int i13 = 0; i13 < i12; i13++) {
                            observedScopeMap.f2965a.U(cVar.get(i13));
                        }
                        cVar.clear();
                        i11++;
                    } while (i11 < i10);
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.f2978j = snapshotStateObserver;
    }

    @Override // u7.p
    public final n R(Set<? extends Object> set, f fVar) {
        boolean z10;
        Set<? extends Object> set2 = set;
        g.f(set2, "applied");
        g.f(fVar, "<anonymous parameter 1>");
        SnapshotStateObserver snapshotStateObserver = this.f2978j;
        synchronized (snapshotStateObserver.f2961d) {
            e<SnapshotStateObserver.ObservedScopeMap> eVar = snapshotStateObserver.f2961d;
            int i10 = eVar.f11334k;
            z10 = false;
            if (i10 > 0) {
                SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = eVar.f11332i;
                g.d(observedScopeMapArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                boolean z11 = false;
                do {
                    if (!observedScopeMapArr[i11].b(set2) && !z11) {
                        z11 = false;
                        i11++;
                    }
                    z11 = true;
                    i11++;
                } while (i11 < i10);
                z10 = z11;
            }
            n nVar = n.f16010a;
        }
        if (z10) {
            SnapshotStateObserver snapshotStateObserver2 = this.f2978j;
            snapshotStateObserver2.f2959a.U(new AnonymousClass2(snapshotStateObserver2));
        }
        return n.f16010a;
    }
}
