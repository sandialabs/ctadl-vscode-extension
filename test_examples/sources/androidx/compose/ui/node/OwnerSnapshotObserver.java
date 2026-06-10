package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import h0.e;
import l1.c0;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: a  reason: collision with root package name */
    public final SnapshotStateObserver f3537a;

    /* renamed from: b  reason: collision with root package name */
    public final l<LayoutNode, n> f3538b = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.f3548j;
    public final l<LayoutNode, n> c = OwnerSnapshotObserver$onCommitAffectingMeasure$1.f3549j;

    /* renamed from: d  reason: collision with root package name */
    public final l<LayoutNode, n> f3539d = OwnerSnapshotObserver$onCommitAffectingLayout$1.f3544j;

    /* renamed from: e  reason: collision with root package name */
    public final l<LayoutNode, n> f3540e = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.f3545j;

    /* renamed from: f  reason: collision with root package name */
    public final l<LayoutNode, n> f3541f = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.f3546j;

    /* renamed from: g  reason: collision with root package name */
    public final l<LayoutNode, n> f3542g = OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.f3547j;

    public OwnerSnapshotObserver(l<? super u7.a<n>, n> lVar) {
        this.f3537a = new SnapshotStateObserver(lVar);
    }

    public final void a() {
        SnapshotStateObserver snapshotStateObserver = this.f3537a;
        OwnerSnapshotObserver$clearInvalidObservations$1 ownerSnapshotObserver$clearInvalidObservations$1 = OwnerSnapshotObserver$clearInvalidObservations$1.f3543j;
        snapshotStateObserver.getClass();
        g.f(ownerSnapshotObserver$clearInvalidObservations$1, "predicate");
        synchronized (snapshotStateObserver.f2961d) {
            e<SnapshotStateObserver.ObservedScopeMap> eVar = snapshotStateObserver.f2961d;
            int i10 = eVar.f11334k;
            if (i10 > 0) {
                SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = eVar.f11332i;
                g.d(observedScopeMapArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    observedScopeMapArr[i11].d(ownerSnapshotObserver$clearInvalidObservations$1);
                    i11++;
                } while (i11 < i10);
                n nVar = n.f16010a;
            } else {
                n nVar2 = n.f16010a;
            }
        }
    }

    public final <T extends c0> void b(T t10, l<? super T, n> lVar, u7.a<n> aVar) {
        g.f(t10, "target");
        g.f(lVar, "onChanged");
        this.f3537a.b(t10, lVar, aVar);
    }
}
