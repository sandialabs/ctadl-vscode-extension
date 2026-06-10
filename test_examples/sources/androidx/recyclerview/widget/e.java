package androidx.recyclerview.widget;

import a3.j0;
import a3.v0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e extends d0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f5815s;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5816h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5817i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<C0044e> f5818j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<d> f5819k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.b0>> f5820l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<C0044e>> f5821m = new ArrayList<>();
    public final ArrayList<ArrayList<d>> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5822o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5823p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5824q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f5825r = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5826i;

        public a(ArrayList arrayList) {
            this.f5826i = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f5826i;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    C0044e c0044e = (C0044e) it.next();
                    RecyclerView.b0 b0Var = c0044e.f5837a;
                    eVar.getClass();
                    View view = b0Var.f5666a;
                    int i10 = c0044e.f5839d - c0044e.f5838b;
                    int i11 = c0044e.f5840e - c0044e.c;
                    if (i10 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i11 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    eVar.f5823p.add(b0Var);
                    animate.setDuration(eVar.f5687e).setListener(new h(eVar, b0Var, i10, view, i11, animate)).start();
                } else {
                    arrayList.clear();
                    eVar.f5821m.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5828i;

        public b(ArrayList arrayList) {
            this.f5828i = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            ArrayList arrayList = this.f5828i;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    d dVar = (d) it.next();
                    eVar.getClass();
                    RecyclerView.b0 b0Var = dVar.f5832a;
                    View view2 = null;
                    if (b0Var == null) {
                        view = null;
                    } else {
                        view = b0Var.f5666a;
                    }
                    RecyclerView.b0 b0Var2 = dVar.f5833b;
                    if (b0Var2 != null) {
                        view2 = b0Var2.f5666a;
                    }
                    ArrayList<RecyclerView.b0> arrayList2 = eVar.f5825r;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(eVar.f5688f);
                        arrayList2.add(dVar.f5832a);
                        duration.translationX(dVar.f5835e - dVar.c);
                        duration.translationY(dVar.f5836f - dVar.f5834d);
                        duration.alpha(0.0f).setListener(new i(eVar, dVar, duration, view)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(dVar.f5833b);
                        animate.translationX(0.0f).translationY(0.0f).setDuration(eVar.f5688f).alpha(1.0f).setListener(new j(eVar, dVar, animate, view2)).start();
                    }
                } else {
                    arrayList.clear();
                    eVar.n.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5830i;

        public c(ArrayList arrayList) {
            this.f5830i = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f5830i;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e eVar = e.this;
                if (hasNext) {
                    RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
                    eVar.getClass();
                    View view = b0Var.f5666a;
                    ViewPropertyAnimator animate = view.animate();
                    eVar.f5822o.add(b0Var);
                    animate.alpha(1.0f).setDuration(eVar.c).setListener(new g(view, animate, eVar, b0Var)).start();
                } else {
                    arrayList.clear();
                    eVar.f5820l.remove(arrayList);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f5832a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f5833b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5834d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5835e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5836f;

        public d(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
            this.f5832a = b0Var;
            this.f5833b = b0Var2;
            this.c = i10;
            this.f5834d = i11;
            this.f5835e = i12;
            this.f5836f = i13;
        }

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f5832a);
            sb.append(", newHolder=");
            sb.append(this.f5833b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.f5834d);
            sb.append(", toX=");
            sb.append(this.f5835e);
            sb.append(", toY=");
            return androidx.activity.e.h(sb, this.f5836f, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0044e {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f5837a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5838b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5839d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5840e;

        public C0044e(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
            this.f5837a = b0Var;
            this.f5838b = i10;
            this.c = i11;
            this.f5839d = i12;
            this.f5840e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g(RecyclerView.b0 b0Var, List<Object> list) {
        if (list.isEmpty() && !f(b0Var)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    @SuppressLint({"UnknownNullness"})
    public final void j(RecyclerView.b0 b0Var) {
        View view = b0Var.f5666a;
        view.animate().cancel();
        ArrayList<C0044e> arrayList = this.f5818j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size).f5837a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(b0Var);
                arrayList.remove(size);
            }
        }
        t(b0Var, this.f5819k);
        if (this.f5816h.remove(b0Var)) {
            view.setAlpha(1.0f);
            h(b0Var);
        }
        if (this.f5817i.remove(b0Var)) {
            view.setAlpha(1.0f);
            h(b0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            t(b0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<C0044e>> arrayList4 = this.f5821m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<C0044e> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList5.get(size4).f5837a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(b0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList6 = this.f5820l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.b0> arrayList7 = arrayList6.get(size5);
                if (arrayList7.remove(b0Var)) {
                    view.setAlpha(1.0f);
                    h(b0Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f5824q.remove(b0Var);
                this.f5822o.remove(b0Var);
                this.f5825r.remove(b0Var);
                this.f5823p.remove(b0Var);
                s();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void k() {
        ArrayList<C0044e> arrayList = this.f5818j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0044e c0044e = arrayList.get(size);
            View view = c0044e.f5837a.f5666a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(c0044e.f5837a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.b0> arrayList2 = this.f5816h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.b0> arrayList3 = this.f5817i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList3.get(size3);
            b0Var.f5666a.setAlpha(1.0f);
            h(b0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f5819k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = arrayList4.get(size4);
            RecyclerView.b0 b0Var2 = dVar.f5832a;
            if (b0Var2 != null) {
                u(dVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = dVar.f5833b;
            if (b0Var3 != null) {
                u(dVar, b0Var3);
            }
        }
        arrayList4.clear();
        if (!l()) {
            return;
        }
        ArrayList<ArrayList<C0044e>> arrayList5 = this.f5821m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<C0044e> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C0044e c0044e2 = arrayList6.get(size6);
                    View view2 = c0044e2.f5837a.f5666a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(c0044e2.f5837a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList7 = this.f5820l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.b0> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.b0 b0Var4 = arrayList8.get(size8);
                    b0Var4.f5666a.setAlpha(1.0f);
                    h(b0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<d>> arrayList9 = this.n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        d dVar2 = arrayList10.get(size10);
                        RecyclerView.b0 b0Var5 = dVar2.f5832a;
                        if (b0Var5 != null) {
                            u(dVar2, b0Var5);
                        }
                        RecyclerView.b0 b0Var6 = dVar2.f5833b;
                        if (b0Var6 != null) {
                            u(dVar2, b0Var6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            } else {
                r(this.f5824q);
                r(this.f5823p);
                r(this.f5822o);
                r(this.f5825r);
                i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean l() {
        if (this.f5817i.isEmpty() && this.f5819k.isEmpty() && this.f5818j.isEmpty() && this.f5816h.isEmpty() && this.f5823p.isEmpty() && this.f5824q.isEmpty() && this.f5822o.isEmpty() && this.f5825r.isEmpty() && this.f5821m.isEmpty() && this.f5820l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void m() {
        long j2;
        long j10;
        ArrayList<RecyclerView.b0> arrayList = this.f5816h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<C0044e> arrayList2 = this.f5818j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f5819k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.b0> arrayList4 = this.f5817i;
        boolean z13 = !arrayList4.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<RecyclerView.b0> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.b0 next = it.next();
            View view = next.f5666a;
            ViewPropertyAnimator animate = view.animate();
            this.f5824q.add(next);
            animate.setDuration(this.f5686d).alpha(0.0f).setListener(new f(view, animate, this, next)).start();
        }
        arrayList.clear();
        if (z11) {
            ArrayList<C0044e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f5821m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (z10) {
                View view2 = arrayList5.get(0).f5837a.f5666a;
                long j11 = this.f5686d;
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.n(view2, aVar, j11);
            } else {
                aVar.run();
            }
        }
        if (z12) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (z10) {
                View view3 = arrayList6.get(0).f5832a.f5666a;
                long j12 = this.f5686d;
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                j0.d.n(view3, bVar, j12);
            } else {
                bVar.run();
            }
        }
        if (z13) {
            ArrayList<RecyclerView.b0> arrayList7 = new ArrayList<>();
            arrayList7.addAll(arrayList4);
            this.f5820l.add(arrayList7);
            arrayList4.clear();
            c cVar = new c(arrayList7);
            if (!z10 && !z11 && !z12) {
                cVar.run();
                return;
            }
            long j13 = 0;
            if (z10) {
                j2 = this.f5686d;
            } else {
                j2 = 0;
            }
            if (z11) {
                j10 = this.f5687e;
            } else {
                j10 = 0;
            }
            if (z12) {
                j13 = this.f5688f;
            }
            View view4 = arrayList7.get(0).f5666a;
            WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
            j0.d.n(view4, cVar, Math.max(j10, j13) + j2);
        }
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public final void n(RecyclerView.b0 b0Var) {
        v(b0Var);
        b0Var.f5666a.setAlpha(0.0f);
        this.f5817i.add(b0Var);
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public final boolean o(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
        if (b0Var == b0Var2) {
            return p(b0Var, i10, i11, i12, i13);
        }
        View view = b0Var.f5666a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        v(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        v(b0Var2);
        View view2 = b0Var2.f5666a;
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        this.f5819k.add(new d(b0Var, b0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public final boolean p(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f5666a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b0Var.f5666a.getTranslationY());
        v(b0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(b0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5818j.add(new C0044e(b0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    @SuppressLint({"UnknownNullness"})
    public final void q(RecyclerView.b0 b0Var) {
        v(b0Var);
        this.f5816h.add(b0Var);
    }

    public final void r(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((RecyclerView.b0) arrayList.get(size)).f5666a.animate().cancel();
        }
    }

    public final void s() {
        if (l()) {
            return;
        }
        i();
    }

    public final void t(RecyclerView.b0 b0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = (d) arrayList.get(size);
            if (u(dVar, b0Var) && dVar.f5832a == null && dVar.f5833b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean u(d dVar, RecyclerView.b0 b0Var) {
        if (dVar.f5833b == b0Var) {
            dVar.f5833b = null;
        } else if (dVar.f5832a == b0Var) {
            dVar.f5832a = null;
        } else {
            return false;
        }
        b0Var.f5666a.setAlpha(1.0f);
        View view = b0Var.f5666a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h(b0Var);
        return true;
    }

    public final void v(RecyclerView.b0 b0Var) {
        if (f5815s == null) {
            f5815s = new ValueAnimator().getInterpolator();
        }
        b0Var.f5666a.animate().setInterpolator(f5815s);
        j(b0Var);
    }
}
