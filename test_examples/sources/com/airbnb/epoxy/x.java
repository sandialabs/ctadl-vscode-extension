package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class x extends z<l0> {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6727k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public boolean f6728l;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, r rVar, b0 b0Var);
    }

    public x() {
        this.f6728l = false;
        this.f6728l = false;
    }

    @Override // com.airbnb.epoxy.z
    public final void A(l0 l0Var) {
        D(l0Var, new v());
    }

    @Override // com.airbnb.epoxy.z
    public final void B(l0 l0Var) {
        D(l0Var, new w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void D(l0 l0Var, a aVar) {
        List<r0> list;
        r rVar;
        ViewGroup viewGroup;
        b0 b0Var;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i10;
        l0Var.getClass();
        x xVar = l0Var.f6660f;
        ArrayList arrayList3 = this.f6727k;
        ArrayList<b0> arrayList4 = l0Var.f6657b;
        if (xVar != this) {
            if (xVar != null) {
                if (xVar.f6727k.size() > arrayList3.size() && (size = arrayList3.size()) <= arrayList2.size() - 1) {
                    while (true) {
                        l0Var.c(i10);
                        if (i10 == size) {
                            break;
                        }
                        i10--;
                    }
                }
            }
            l0Var.f6660f = this;
            int size2 = arrayList3.size();
            ?? r82 = 0;
            if (l0Var.f6659e != null) {
                if (!list.isEmpty()) {
                    List<r0> list2 = l0Var.f6659e;
                    if (list2 != null) {
                        if (list2.size() < size2) {
                            StringBuilder o10 = a4.b.o("Insufficient view stubs for EpoxyModelGroup. ", size2, " models were provided but only ");
                            List<r0> list3 = l0Var.f6659e;
                            if (list3 == null) {
                                v7.g.l("stubs");
                                throw null;
                            }
                            o10.append(list3.size());
                            o10.append(" view stubs exist.");
                            throw new IllegalStateException(o10.toString());
                        }
                    } else {
                        v7.g.l("stubs");
                        throw null;
                    }
                }
                arrayList4.ensureCapacity(size2);
                int i11 = 0;
                while (i11 < size2) {
                    r<?> rVar2 = (r) arrayList3.get(i11);
                    if (xVar != null && (arrayList = xVar.f6727k) != null) {
                        rVar = (r) kotlin.collections.c.q2(i11, arrayList);
                    } else {
                        rVar = r82;
                    }
                    List<r0> list4 = l0Var.f6659e;
                    if (list4 != null) {
                        r0 r0Var = (r0) kotlin.collections.c.q2(i11, list4);
                        if ((r0Var != null && (viewGroup = r0Var.f6690a) != null) || (viewGroup = l0Var.f6658d) != null) {
                            if (rVar != null) {
                                if (s0.a(rVar) == s0.a(rVar2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    l0Var.c(i11);
                                } else {
                                    i11++;
                                    r82 = 0;
                                }
                            }
                            v7.g.e(rVar2, "model");
                            int a10 = s0.a(rVar2);
                            RecyclerView.b0 b5 = l0Var.c.b(a10);
                            if (b5 instanceof b0) {
                                b0Var = (b0) b5;
                            } else {
                                b0Var = r82;
                            }
                            if (b0Var == null) {
                                g0 g0Var = l0.f6655g;
                                g0Var.getClass();
                                ViewParent viewParent = l0Var.f6656a;
                                v7.g.f(viewParent, "modelGroupParent");
                                g0Var.f6641d = rVar2;
                                g0Var.f6642e = viewParent;
                                b0Var = g0Var.c(viewGroup, a10);
                                g0Var.f6641d = null;
                                g0Var.f6642e = null;
                                r82 = 0;
                            }
                            View view = b0Var.f5666a;
                            if (r0Var == null) {
                                ViewGroup viewGroup2 = l0Var.f6658d;
                                if (viewGroup2 != null) {
                                    viewGroup2.addView(view, i11);
                                } else {
                                    v7.g.l("childContainer");
                                    throw r82;
                                }
                            } else {
                                v7.g.e(view, "holder.itemView");
                                r0Var.a();
                                ViewStub viewStub = r0Var.f6691b;
                                int inflatedId = viewStub.getInflatedId();
                                if (inflatedId != -1) {
                                    view.setId(inflatedId);
                                }
                                r0Var.f6690a.addView(view, r0Var.c, viewStub.getLayoutParams());
                            }
                            arrayList4.add(i11, b0Var);
                            i11++;
                            r82 = 0;
                        } else {
                            v7.g.l("childContainer");
                            throw null;
                        }
                    } else {
                        v7.g.l("stubs");
                        throw r82;
                    }
                }
            } else {
                v7.g.l("stubs");
                throw null;
            }
        }
        int size3 = arrayList3.size();
        for (int i12 = 0; i12 < size3; i12++) {
            aVar.a(i12, (r) arrayList3.get(i12), arrayList4.get(i12));
        }
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    /* renamed from: E */
    public void u(l0 l0Var) {
        if (l0Var.f6660f != null) {
            ArrayList<b0> arrayList = l0Var.f6657b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l0Var.c(arrayList.size() - 1);
            }
            l0Var.f6660f = null;
            return;
        }
        throw new IllegalStateException("Group is not bound");
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void e(r rVar, Object obj) {
        l0 l0Var = (l0) obj;
        if (!(rVar instanceof x)) {
            D(l0Var, new s());
        } else {
            D(l0Var, new u((x) rVar));
        }
    }

    @Override // com.airbnb.epoxy.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && super.equals(obj)) {
            return this.f6727k.equals(((x) obj).f6727k);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void f(Object obj) {
        D((l0) obj, new s());
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void g(Object obj, List list) {
        D((l0) obj, new t());
    }

    @Override // com.airbnb.epoxy.r
    public final int h() {
        throw new UnsupportedOperationException("You should set a layout with layout(...) instead of using this.");
    }

    @Override // com.airbnb.epoxy.r
    public int hashCode() {
        return this.f6727k.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.airbnb.epoxy.r
    public final int j(int i10, int i11, int i12) {
        return ((r) this.f6727k.get(0)).t(i10, i11, i12);
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void q(Object obj) {
        D((l0) obj, new v());
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void r(Object obj) {
        D((l0) obj, new w());
    }

    @Override // com.airbnb.epoxy.r
    public final boolean s() {
        return this.f6728l;
    }

    @Override // com.airbnb.epoxy.z
    public final void w(l0 l0Var) {
        D(l0Var, new s());
    }

    @Override // com.airbnb.epoxy.z
    public final void x(l0 l0Var, r rVar) {
        l0 l0Var2 = l0Var;
        if (!(rVar instanceof x)) {
            D(l0Var2, new s());
        } else {
            D(l0Var2, new u((x) rVar));
        }
    }

    @Override // com.airbnb.epoxy.z
    public final void y(l0 l0Var, List list) {
        D(l0Var, new t());
    }

    @Override // com.airbnb.epoxy.z
    public final l0 z(ViewParent viewParent) {
        return new l0(viewParent);
    }
}
