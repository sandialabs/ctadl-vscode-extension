package e1;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import h0.e;
import j1.x;
import k1.d;
import k1.f;
import k1.g;
import k1.h;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class c implements d, f<c>, x {

    /* renamed from: i  reason: collision with root package name */
    public final l<b, Boolean> f10600i;

    /* renamed from: j  reason: collision with root package name */
    public final l<b, Boolean> f10601j = null;

    /* renamed from: k  reason: collision with root package name */
    public FocusModifier f10602k;

    /* renamed from: l  reason: collision with root package name */
    public c f10603l;

    /* renamed from: m  reason: collision with root package name */
    public LayoutNode f10604m;

    public c(l lVar) {
        this.f10600i = lVar;
    }

    @Override // k1.d
    public final void T(g gVar) {
        e<c> eVar;
        e<c> eVar2;
        v7.g.f(gVar, "scope");
        FocusModifier focusModifier = this.f10602k;
        if (focusModifier != null && (eVar2 = focusModifier.f3030x) != null) {
            eVar2.l(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) gVar.i(FocusModifierKt.f3032a);
        this.f10602k = focusModifier2;
        if (focusModifier2 != null && (eVar = focusModifier2.f3030x) != null) {
            eVar.b(this);
        }
        this.f10603l = (c) gVar.i(KeyInputModifierKt.f3249a);
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean a(KeyEvent keyEvent) {
        Boolean bool;
        v7.g.f(keyEvent, "keyEvent");
        l<b, Boolean> lVar = this.f10600i;
        if (lVar != null) {
            bool = lVar.U(new b(keyEvent));
        } else {
            bool = null;
        }
        if (v7.g.a(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        c cVar = this.f10603l;
        if (cVar != null) {
            return cVar.a(keyEvent);
        }
        return false;
    }

    public final boolean c(KeyEvent keyEvent) {
        Boolean bool;
        v7.g.f(keyEvent, "keyEvent");
        c cVar = this.f10603l;
        if (cVar != null) {
            bool = Boolean.valueOf(cVar.c(keyEvent));
        } else {
            bool = null;
        }
        if (v7.g.a(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        l<b, Boolean> lVar = this.f10601j;
        if (lVar != null) {
            return lVar.U(new b(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // k1.f
    public final h<c> getKey() {
        return KeyInputModifierKt.f3249a;
    }

    @Override // k1.f
    public final c getValue() {
        return this;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // j1.x
    public final void o(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "coordinates");
        this.f10604m = nodeCoordinator.f3499o;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
