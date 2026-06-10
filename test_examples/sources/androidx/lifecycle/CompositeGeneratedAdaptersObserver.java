package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/o;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements o {

    /* renamed from: i  reason: collision with root package name */
    public final h[] f5309i;

    public CompositeGeneratedAdaptersObserver(h[] hVarArr) {
        this.f5309i = hVarArr;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        new HashMap();
        h[] hVarArr = this.f5309i;
        for (h hVar : hVarArr) {
            hVar.a();
        }
        for (h hVar2 : hVarArr) {
            hVar2.a();
        }
    }
}
