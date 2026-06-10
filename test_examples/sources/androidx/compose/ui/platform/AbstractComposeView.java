package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Recomposer;
import com.noto.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public WeakReference<g0.g> f3551i;

    /* renamed from: j  reason: collision with root package name */
    public IBinder f3552j;

    /* renamed from: k  reason: collision with root package name */
    public g0.f f3553k;

    /* renamed from: l  reason: collision with root package name */
    public g0.g f3554l;

    /* renamed from: m  reason: collision with root package name */
    public u7.a<m7.n> f3555m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3556o;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        g1 g1Var = new g1(this);
        addOnAttachStateChangeListener(g1Var);
        h1 h1Var = new h1(this);
        a1.b.Y(this).f11221a.add(h1Var);
        this.f3555m = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, g1Var, h1Var);
    }

    public static boolean f(g0.g gVar) {
        if ((gVar instanceof Recomposer) && ((Recomposer.State) ((Recomposer) gVar).f2789q.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(g0.g gVar) {
        if (this.f3554l != gVar) {
            this.f3554l = gVar;
            if (gVar != null) {
                this.f3551i = null;
            }
            g0.f fVar = this.f3553k;
            if (fVar != null) {
                fVar.a();
                this.f3553k = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f3552j != iBinder) {
            this.f3552j = iBinder;
            this.f3551i = null;
        }
    }

    public abstract void a(g0.d dVar, int i10);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public final void b() {
        if (this.f3556o) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f3553k == null) {
            try {
                this.f3556o = true;
                this.f3553k = x1.a(this, g(), a1.c.j0(-656146368, new AbstractComposeView$ensureCompositionCreated$1(this), true));
                this.f3556o = false;
            } catch (Throwable th) {
                this.f3556o = false;
                throw th;
            }
        }
    }

    public void d(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void e(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final g0.g g() {
        g0.g gVar;
        g0.g gVar2;
        g0.g gVar3 = this.f3554l;
        if (gVar3 == null) {
            gVar3 = u1.b(this);
            if (gVar3 == null) {
                ViewParent parent = getParent();
                gVar3 = gVar3;
                while (gVar3 == null && (parent instanceof View)) {
                    g0.g b5 = u1.b((View) parent);
                    parent = parent.getParent();
                    gVar3 = b5;
                }
            }
            Object obj = null;
            if (gVar3 != null) {
                if (f(gVar3)) {
                    gVar2 = gVar3;
                } else {
                    gVar2 = null;
                }
                if (gVar2 != null) {
                    this.f3551i = new WeakReference<>(gVar2);
                }
            } else {
                gVar3 = null;
            }
            if (gVar3 == null) {
                WeakReference<g0.g> weakReference = this.f3551i;
                gVar3 = (weakReference == null || (gVar = weakReference.get()) == null || !f(gVar)) ? null : gVar;
                if (gVar3 == null) {
                    if (isAttachedToWindow()) {
                        ViewParent parent2 = getParent();
                        View view = this;
                        while (parent2 instanceof View) {
                            View view2 = (View) parent2;
                            if (view2.getId() == 16908290) {
                                break;
                            }
                            view = view2;
                            parent2 = view2.getParent();
                        }
                        g0.g b10 = u1.b(view);
                        if (b10 == null) {
                            Recomposer a10 = r1.f3895a.get().a(view);
                            view.setTag(R.id.androidx_compose_ui_view_composition_context, a10);
                            ja.n0 n0Var = ja.n0.f12786i;
                            Handler handler = view.getHandler();
                            v7.g.e(handler, "rootView.handler");
                            int i10 = ka.f.f12955a;
                            view.addOnAttachStateChangeListener(new q1(m0.b.M0(n0Var, new kotlinx.coroutines.android.a(handler, "windowRecomposer cleanup", false).n, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(a10, view, null), 2)));
                            gVar3 = a10;
                        } else if (b10 instanceof Recomposer) {
                            gVar3 = (Recomposer) b10;
                        } else {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        if (f(gVar3)) {
                            obj = gVar3;
                        }
                        if (obj != null) {
                            this.f3551i = new WeakReference<>(obj);
                        }
                    } else {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                }
            }
        }
        return gVar3;
    }

    public final boolean getHasComposition() {
        return this.f3553k != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        d(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        e(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(g0.g gVar) {
        setParentContext(gVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.n = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((l1.b0) childAt).setShowLayoutBounds(z10);
        }
    }

    public final void setViewCompositionStrategy(i1 i1Var) {
        v7.g.f(i1Var, "strategy");
        u7.a<m7.n> aVar = this.f3555m;
        if (aVar != null) {
            aVar.k0();
        }
        this.f3555m = i1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
