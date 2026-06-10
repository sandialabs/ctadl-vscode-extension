package t0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.List;
import u7.p;

/* loaded from: classes.dex */
public final class j implements k1.d, k1.f<j> {

    /* renamed from: i  reason: collision with root package name */
    public j f17551i;

    /* renamed from: j  reason: collision with root package name */
    public final h0.e<FocusModifier> f17552j;

    public j(FocusRequester focusRequester) {
        v7.g.f(focusRequester, "focusRequester");
        this.f17552j = new h0.e<>(new FocusModifier[16]);
        focusRequester.f3055a.b(this);
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        v7.g.f(gVar, "scope");
        j jVar = (j) gVar.i(FocusRequesterModifierKt.f3057a);
        if (!v7.g.a(jVar, this.f17551i)) {
            j jVar2 = this.f17551i;
            h0.e<FocusModifier> eVar = this.f17552j;
            if (jVar2 != null) {
                jVar2.g(eVar);
            }
            if (jVar != null) {
                jVar.c(eVar);
            }
            this.f17551i = jVar;
        }
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final void a(FocusModifier focusModifier) {
        v7.g.f(focusModifier, "focusModifier");
        this.f17552j.b(focusModifier);
        j jVar = this.f17551i;
        if (jVar != null) {
            jVar.a(focusModifier);
        }
    }

    public final void c(h0.e<FocusModifier> eVar) {
        v7.g.f(eVar, "newModifiers");
        h0.e<FocusModifier> eVar2 = this.f17552j;
        eVar2.c(eVar2.f11334k, eVar);
        j jVar = this.f17551i;
        if (jVar != null) {
            jVar.c(eVar);
        }
    }

    public final FocusModifier d() {
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        h0.e<FocusModifier> eVar = this.f17552j;
        int i10 = eVar.f11334k;
        FocusModifier focusModifier = null;
        if (i10 > 0) {
            FocusModifier[] focusModifierArr = eVar.f11332i;
            v7.g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                FocusModifier focusModifier2 = focusModifierArr[i11];
                if (focusModifier != null && (nodeCoordinator = focusModifier.f3027u) != null && (layoutNode = nodeCoordinator.f3499o) != null) {
                    NodeCoordinator nodeCoordinator2 = focusModifier2.f3027u;
                    if (nodeCoordinator2 != null && (layoutNode2 = nodeCoordinator2.f3499o) != null) {
                        while (layoutNode.f3421q > layoutNode2.f3421q) {
                            layoutNode = layoutNode.p();
                            v7.g.c(layoutNode);
                        }
                        while (layoutNode2.f3421q > layoutNode.f3421q) {
                            layoutNode2 = layoutNode2.p();
                            v7.g.c(layoutNode2);
                        }
                        while (!v7.g.a(layoutNode.p(), layoutNode2.p())) {
                            layoutNode = layoutNode.p();
                            v7.g.c(layoutNode);
                            layoutNode2 = layoutNode2.p();
                            v7.g.c(layoutNode2);
                        }
                        LayoutNode p10 = layoutNode.p();
                        v7.g.c(p10);
                        List<LayoutNode> n = p10.n();
                        if (n.indexOf(layoutNode) < n.indexOf(layoutNode2)) {
                        }
                    }
                    i11++;
                }
                focusModifier = focusModifier2;
                i11++;
            } while (i11 < i10);
            return focusModifier;
        }
        return focusModifier;
    }

    public final void e(FocusModifier focusModifier) {
        v7.g.f(focusModifier, "focusModifier");
        this.f17552j.l(focusModifier);
        j jVar = this.f17551i;
        if (jVar != null) {
            jVar.e(focusModifier);
        }
    }

    public final void g(h0.e<FocusModifier> eVar) {
        v7.g.f(eVar, "removedModifiers");
        this.f17552j.m(eVar);
        j jVar = this.f17551i;
        if (jVar != null) {
            jVar.g(eVar);
        }
    }

    @Override // k1.f
    public final k1.h<j> getKey() {
        return FocusRequesterModifierKt.f3057a;
    }

    @Override // k1.f
    public final j getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
