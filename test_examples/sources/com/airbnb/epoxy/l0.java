package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.noto.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class l0 extends p {

    /* renamed from: g  reason: collision with root package name */
    public static final g0 f6655g = new g0();

    /* renamed from: a  reason: collision with root package name */
    public final ViewParent f6656a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b0> f6657b;
    public final RecyclerView.r c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f6658d;

    /* renamed from: e  reason: collision with root package name */
    public List<r0> f6659e;

    /* renamed from: f  reason: collision with root package name */
    public x f6660f;

    /* loaded from: classes.dex */
    public static final class a {
        public static RecyclerView.r a(ViewParent viewParent) {
            RecyclerView.r rVar = null;
            while (rVar == null) {
                if (viewParent instanceof RecyclerView) {
                    rVar = ((RecyclerView) viewParent).getRecycledViewPool();
                } else {
                    ViewParent parent = viewParent.getParent();
                    rVar = parent != null ? a(parent) : new i0();
                }
            }
            return rVar;
        }
    }

    public l0(ViewParent viewParent) {
        v7.g.f(viewParent, "modelGroupParent");
        this.f6656a = viewParent;
        this.f6657b = new ArrayList<>(4);
        this.c = a.a(viewParent);
    }

    public static void b(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof ViewStub) {
                arrayList.add(new r0(viewGroup, (ViewStub) childAt, i10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.p
    public final void a(View view) {
        ViewGroup viewGroup;
        EmptyList emptyList;
        v7.g.f(view, "itemView");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            View findViewById = viewGroup2.findViewById(R.id.epoxy_model_group_child_container);
            if (findViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) findViewById;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup2 = viewGroup;
            }
            this.f6658d = viewGroup2;
            if (viewGroup2.getChildCount() != 0) {
                ViewGroup viewGroup3 = this.f6658d;
                if (viewGroup3 != null) {
                    ArrayList arrayList = new ArrayList(4);
                    b(viewGroup3, arrayList);
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("No view stubs found. If viewgroup is not empty it must contain ViewStubs.");
                    }
                    emptyList = arrayList;
                } else {
                    v7.g.l("childContainer");
                    throw null;
                }
            } else {
                emptyList = EmptyList.f12981i;
            }
            this.f6659e = emptyList;
            return;
        }
        throw new IllegalStateException("The layout provided to EpoxyModelGroup must be a ViewGroup");
    }

    public final void c(int i10) {
        List<r0> list = this.f6659e;
        if (list != null) {
            if (!list.isEmpty()) {
                List<r0> list2 = this.f6659e;
                if (list2 != null) {
                    r0 r0Var = list2.get(i10);
                    r0Var.a();
                    r0Var.f6690a.addView(r0Var.f6691b, r0Var.c);
                } else {
                    v7.g.l("stubs");
                    throw null;
                }
            } else {
                ViewGroup viewGroup = this.f6658d;
                if (viewGroup != null) {
                    viewGroup.removeViewAt(i10);
                } else {
                    v7.g.l("childContainer");
                    throw null;
                }
            }
            b0 remove = this.f6657b.remove(i10);
            v7.g.e(remove, "viewHolders.removeAt(modelPosition)");
            b0 b0Var = remove;
            b0Var.v();
            this.c.d(b0Var);
            return;
        }
        v7.g.l("stubs");
        throw null;
    }
}
