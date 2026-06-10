package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;

/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: p  reason: collision with root package name */
    public final g0.k0 f3696p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3697q;

    public ComposeView(Context context) {
        super(context, null, 0);
        this.f3696p = a1.c.V0(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(g0.d dVar, int i10) {
        ComposerImpl p10 = dVar.p(420213850);
        u7.q<g0.c<?>, g0.z0, g0.t0, m7.n> qVar = ComposerKt.f2737a;
        u7.p pVar = (u7.p) this.f3696p.getValue();
        if (pVar != null) {
            pVar.R(p10, 0);
        }
        g0.r0 T = p10.T();
        if (T != null) {
            T.f11073d = new ComposeView$Content$1(this, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3697q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setContent(u7.p<? super g0.d, ? super Integer, m7.n> pVar) {
        v7.g.f(pVar, "content");
        boolean z10 = true;
        this.f3697q = true;
        this.f3696p.setValue(pVar);
        if (isAttachedToWindow()) {
            if (this.f3554l == null && !isAttachedToWindow()) {
                z10 = false;
            }
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
    }
}
