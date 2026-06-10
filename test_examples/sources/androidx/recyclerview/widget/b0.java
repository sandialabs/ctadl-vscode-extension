package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f5802d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5803e;

    /* loaded from: classes.dex */
    public static class a extends a3.a {

        /* renamed from: d  reason: collision with root package name */
        public final b0 f5804d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f5805e = new WeakHashMap();

        public a(b0 b0Var) {
            this.f5804d = b0Var;
        }

        @Override // a3.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a3.a
        public final b3.h b(View view) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // a3.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
        @Override // a3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) b3.g gVar) {
            boolean z10;
            b0 b0Var = this.f5804d;
            RecyclerView recyclerView = b0Var.f5802d;
            if (recyclerView.D && !recyclerView.M && !recyclerView.f5626m.g()) {
                z10 = false;
                if (!z10) {
                    RecyclerView recyclerView2 = b0Var.f5802d;
                    if (recyclerView2.getLayoutManager() != null) {
                        recyclerView2.getLayoutManager().c0(view, gVar);
                        a3.a aVar = (a3.a) this.f5805e.get(view);
                        if (aVar != null) {
                            aVar.d(view, gVar);
                            return;
                        }
                    }
                }
                this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
            }
            z10 = true;
            if (!z10) {
            }
            this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        }

        @Override // a3.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // a3.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a3.a aVar = (a3.a) this.f5805e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        @Override // a3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            boolean z10;
            b0 b0Var = this.f5804d;
            RecyclerView recyclerView = b0Var.f5802d;
            if (recyclerView.D && !recyclerView.M && !recyclerView.f5626m.g()) {
                z10 = false;
                if (!z10) {
                    RecyclerView recyclerView2 = b0Var.f5802d;
                    if (recyclerView2.getLayoutManager() != null) {
                        a3.a aVar = (a3.a) this.f5805e.get(view);
                        if (aVar != null) {
                            if (aVar.g(view, i10, bundle)) {
                                return true;
                            }
                        } else if (super.g(view, i10, bundle)) {
                            return true;
                        }
                        RecyclerView.s sVar = recyclerView2.getLayoutManager().f5693b.f5622k;
                        return false;
                    }
                }
                return super.g(view, i10, bundle);
            }
            z10 = true;
            if (!z10) {
            }
            return super.g(view, i10, bundle);
        }

        @Override // a3.a
        public final void h(View view, int i10) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // a3.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            a3.a aVar = (a3.a) this.f5805e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public b0(RecyclerView recyclerView) {
        this.f5802d = recyclerView;
        a aVar = this.f5803e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f5803e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // a3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f5802d;
            if (recyclerView.D && !recyclerView.M && !recyclerView.f5626m.g()) {
                z10 = false;
                if (z10) {
                    RecyclerView recyclerView2 = (RecyclerView) view;
                    if (recyclerView2.getLayoutManager() != null) {
                        recyclerView2.getLayoutManager().a0(accessibilityEvent);
                        return;
                    }
                    return;
                }
                return;
            }
            z10 = true;
            if (z10) {
            }
        }
    }

    @Override // a3.a
    public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) b3.g gVar) {
        boolean z10;
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        RecyclerView recyclerView = this.f5802d;
        if (recyclerView.D && !recyclerView.M && !recyclerView.f5626m.g()) {
            z10 = false;
            if (z10 && recyclerView.getLayoutManager() != null) {
                RecyclerView.l layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f5693b;
                layoutManager.b0(recyclerView2.f5622k, recyclerView2.f5634q0, gVar);
                return;
            }
        }
        z10 = true;
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r4.getLayoutManager() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        r4 = r4.getLayoutManager();
        r0 = r4.f5693b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        return r4.p0(r0.f5622k, r0.f5634q0, r5, r6);
     */
    @Override // a3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5802d;
        if (recyclerView.D && !recyclerView.M && !recyclerView.f5626m.g()) {
            z10 = false;
        }
        return false;
    }
}
