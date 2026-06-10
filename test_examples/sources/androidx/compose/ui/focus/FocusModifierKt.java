package androidx.compose.ui.focus;

import androidx.activity.e;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import k1.f;
import k1.h;
import q0.d;
import t0.j;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class FocusModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h<FocusModifier> f3032a = m0.b.R0(FocusModifierKt$ModifierLocalParentFocusModifier$1.f3034j);

    /* renamed from: b  reason: collision with root package name */
    public static final d f3033b;

    /* loaded from: classes.dex */
    public static final class a implements f<t0.h> {
        @Override // q0.d
        public final /* synthetic */ d Z(d dVar) {
            return e.b(this, dVar);
        }

        @Override // k1.f
        public final h<t0.h> getKey() {
            return FocusPropertiesKt.f3049a;
        }

        @Override // k1.f
        public final /* bridge */ /* synthetic */ t0.h getValue() {
            return null;
        }

        @Override // q0.d
        public final Object h0(Object obj, p pVar) {
            g.f(pVar, "operation");
            return pVar.R(obj, this);
        }

        @Override // q0.d
        public final /* synthetic */ boolean x(l lVar) {
            return a4.b.a(this, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f<t0.c> {
        @Override // q0.d
        public final /* synthetic */ d Z(d dVar) {
            return e.b(this, dVar);
        }

        @Override // k1.f
        public final h<t0.c> getKey() {
            return FocusEventModifierKt.f3009a;
        }

        @Override // k1.f
        public final /* bridge */ /* synthetic */ t0.c getValue() {
            return null;
        }

        @Override // q0.d
        public final Object h0(Object obj, p pVar) {
            g.f(pVar, "operation");
            return pVar.R(obj, this);
        }

        @Override // q0.d
        public final /* synthetic */ boolean x(l lVar) {
            return a4.b.a(this, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<j> {
        @Override // q0.d
        public final /* synthetic */ d Z(d dVar) {
            return e.b(this, dVar);
        }

        @Override // k1.f
        public final h<j> getKey() {
            return FocusRequesterModifierKt.f3057a;
        }

        @Override // k1.f
        public final /* bridge */ /* synthetic */ j getValue() {
            return null;
        }

        @Override // q0.d
        public final Object h0(Object obj, p pVar) {
            g.f(pVar, "operation");
            return pVar.R(obj, this);
        }

        @Override // q0.d
        public final /* synthetic */ boolean x(l lVar) {
            return a4.b.a(this, lVar);
        }
    }

    static {
        int i10 = d.f16823g;
        f3033b = new a().Z(new b()).Z(new c());
    }

    public static final d a(d dVar) {
        g.f(dVar, "<this>");
        return ComposedModifierKt.a(dVar, InspectableValueKt.f3744a, FocusModifierKt$focusTarget$2.f3035j);
    }
}
