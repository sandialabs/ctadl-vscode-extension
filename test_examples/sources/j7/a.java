package j7;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a extends d0 {

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12704h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12705i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<e> f12706j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<b> f12707k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.b0>> f12708l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f12709m = new ArrayList<>();
    public final ArrayList<ArrayList<b>> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12710o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12711p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12712q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList<RecyclerView.b0> f12713r = new ArrayList<>();

    /* renamed from: j7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0137a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            v7.g.f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            v7.g.f(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f12714a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f12715b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12716d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12717e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12718f;

        public b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
            this.f12714a = b0Var;
            this.f12715b = b0Var2;
            this.c = i10;
            this.f12716d = i11;
            this.f12717e = i12;
            this.f12718f = i13;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f12714a);
            sb.append(", newHolder=");
            sb.append(this.f12715b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.f12716d);
            sb.append(", toX=");
            sb.append(this.f12717e);
            sb.append(", toY=");
            return androidx.activity.e.h(sb, this.f12718f, '}');
        }
    }

    /* loaded from: classes.dex */
    public final class c extends C0137a {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f12719a;

        public c(RecyclerView.b0 b0Var) {
            this.f12719a = b0Var;
        }

        @Override // j7.a.C0137a, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            v7.g.f(animator, "animator");
            View view = this.f12719a.f5666a;
            v7.g.e(view, "viewHolder.itemView");
            a1.b.y(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v7.g.f(animator, "animator");
            RecyclerView.b0 b0Var = this.f12719a;
            View view = b0Var.f5666a;
            v7.g.e(view, "viewHolder.itemView");
            a1.b.y(view);
            a aVar = a.this;
            aVar.h(b0Var);
            aVar.f12710o.remove(b0Var);
            aVar.s();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v7.g.f(animator, "animator");
            a.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public final class d extends C0137a {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f12721a;

        public d(RecyclerView.b0 b0Var) {
            this.f12721a = b0Var;
        }

        @Override // j7.a.C0137a, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            v7.g.f(animator, "animator");
            View view = this.f12721a.f5666a;
            v7.g.e(view, "viewHolder.itemView");
            a1.b.y(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            v7.g.f(animator, "animator");
            RecyclerView.b0 b0Var = this.f12721a;
            View view = b0Var.f5666a;
            v7.g.e(view, "viewHolder.itemView");
            a1.b.y(view);
            a aVar = a.this;
            aVar.h(b0Var);
            aVar.f12712q.remove(b0Var);
            aVar.s();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            v7.g.f(animator, "animator");
            a.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView.b0 f12723a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12724b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12725d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12726e;

        public e(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
            v7.g.f(b0Var, "holder");
            this.f12723a = b0Var;
            this.f12724b = i10;
            this.c = i11;
            this.f12725d = i12;
            this.f12726e = i13;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ArrayList f12728j;

        public f(ArrayList arrayList) {
            this.f12728j = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            ArrayList<ArrayList<RecyclerView.b0>> arrayList = aVar.f12708l;
            ArrayList arrayList2 = this.f12728j;
            if (!arrayList.remove(arrayList2)) {
                return;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
                v7.g.e(b0Var, "holder");
                if (b0Var instanceof k7.a) {
                    ((k7.a) b0Var).b();
                } else {
                    j7.e eVar = (j7.e) aVar;
                    ViewPropertyAnimator animate = b0Var.f5666a.animate();
                    animate.translationY(0.0f);
                    animate.alpha(1.0f);
                    animate.setDuration(eVar.c);
                    animate.setInterpolator(animate.getInterpolator());
                    animate.setListener(new c(b0Var));
                    animate.setStartDelay(Math.abs((b0Var.d() * eVar.c) / 4));
                    animate.start();
                }
                aVar.f12710o.add(b0Var);
            }
            arrayList2.clear();
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ArrayList f12730j;

        public g(ArrayList arrayList) {
            this.f12730j = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            a aVar = a.this;
            ArrayList<ArrayList<b>> arrayList = aVar.n;
            ArrayList arrayList2 = this.f12730j;
            if (!arrayList.remove(arrayList2)) {
                return;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                v7.g.e(bVar, "change");
                aVar.getClass();
                RecyclerView.b0 b0Var = bVar.f12714a;
                View view2 = null;
                if (b0Var != null) {
                    view = b0Var.f5666a;
                } else {
                    view = null;
                }
                RecyclerView.b0 b0Var2 = bVar.f12715b;
                if (b0Var2 != null) {
                    view2 = b0Var2.f5666a;
                }
                ArrayList<RecyclerView.b0> arrayList3 = aVar.f12713r;
                if (view != null) {
                    if (b0Var != null) {
                        arrayList3.add(b0Var);
                    }
                    ViewPropertyAnimator duration = view.animate().setDuration(aVar.f5688f);
                    duration.translationX(bVar.f12717e - bVar.c);
                    duration.translationY(bVar.f12718f - bVar.f12716d);
                    duration.alpha(0.0f).setListener(new j7.b(aVar, bVar, duration, view)).start();
                }
                if (view2 != null) {
                    RecyclerView.b0 b0Var3 = bVar.f12715b;
                    if (b0Var3 != null) {
                        arrayList3.add(b0Var3);
                    }
                    ViewPropertyAnimator animate = view2.animate();
                    animate.translationX(0.0f).translationY(0.0f).setDuration(aVar.f5688f).alpha(1.0f).setListener(new j7.c(aVar, bVar, animate, view2)).start();
                }
            }
            arrayList2.clear();
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ArrayList f12732j;

        public h(ArrayList arrayList) {
            this.f12732j = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            ArrayList<ArrayList<e>> arrayList = aVar.f12709m;
            ArrayList arrayList2 = this.f12732j;
            if (!arrayList.remove(arrayList2)) {
                return;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                RecyclerView.b0 b0Var = eVar.f12723a;
                aVar.getClass();
                View view = b0Var.f5666a;
                v7.g.e(view, "holder.itemView");
                int i10 = eVar.f12725d - eVar.f12724b;
                int i11 = eVar.f12726e - eVar.c;
                if (i10 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i11 != 0) {
                    view.animate().translationY(0.0f);
                }
                aVar.f12711p.add(b0Var);
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(aVar.f5687e).setListener(new j7.d(aVar, b0Var, i10, view, i11, animate)).start();
            }
            arrayList2.clear();
        }
    }

    public a() {
        new DecelerateInterpolator();
        this.f5814g = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void j(RecyclerView.b0 b0Var) {
        v7.g.f(b0Var, "item");
        View view = b0Var.f5666a;
        v7.g.e(view, "item.itemView");
        view.animate().cancel();
        ArrayList<e> arrayList = this.f12706j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            v7.g.e(eVar, "pendingMoves[i]");
            if (eVar.f12723a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(b0Var);
                arrayList.remove(size);
            }
        }
        t(b0Var, this.f12707k);
        if (this.f12704h.remove(b0Var)) {
            a1.b.y(view);
            h(b0Var);
        }
        if (this.f12705i.remove(b0Var)) {
            a1.b.y(view);
            h(b0Var);
        }
        ArrayList<ArrayList<b>> arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<b> arrayList3 = arrayList2.get(size2);
            v7.g.e(arrayList3, "changesList[i]");
            ArrayList<b> arrayList4 = arrayList3;
            t(b0Var, arrayList4);
            if (arrayList4.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList5 = this.f12709m;
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList6 = arrayList5.get(size3);
            v7.g.e(arrayList6, "movesList[i]");
            ArrayList<e> arrayList7 = arrayList6;
            int size4 = arrayList7.size();
            while (true) {
                size4--;
                if (size4 >= 0) {
                    e eVar2 = arrayList7.get(size4);
                    v7.g.e(eVar2, "moves[j]");
                    if (eVar2.f12723a == b0Var) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        h(b0Var);
                        arrayList7.remove(size4);
                        if (arrayList7.isEmpty()) {
                            arrayList5.remove(size3);
                        }
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList8 = this.f12708l;
        int size5 = arrayList8.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.b0> arrayList9 = arrayList8.get(size5);
                v7.g.e(arrayList9, "additionsList[i]");
                ArrayList<RecyclerView.b0> arrayList10 = arrayList9;
                if (arrayList10.remove(b0Var)) {
                    a1.b.y(view);
                    h(b0Var);
                    if (arrayList10.isEmpty()) {
                        arrayList8.remove(size5);
                    }
                }
            } else {
                this.f12712q.remove(b0Var);
                this.f12710o.remove(b0Var);
                this.f12713r.remove(b0Var);
                this.f12711p.remove(b0Var);
                s();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void k() {
        ArrayList<e> arrayList = this.f12706j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            v7.g.e(eVar, "pendingMoves[i]");
            e eVar2 = eVar;
            View view = eVar2.f12723a.f5666a;
            v7.g.e(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar2.f12723a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.b0> arrayList2 = this.f12704h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = arrayList2.get(size2);
            v7.g.e(b0Var, "pendingRemovals[i]");
            h(b0Var);
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.b0> arrayList3 = this.f12705i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var2 = arrayList3.get(size3);
            v7.g.e(b0Var2, "pendingAdditions[i]");
            RecyclerView.b0 b0Var3 = b0Var2;
            View view2 = b0Var3.f5666a;
            v7.g.e(view2, "item.itemView");
            a1.b.y(view2);
            h(b0Var3);
            arrayList3.remove(size3);
        }
        ArrayList<b> arrayList4 = this.f12707k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            b bVar = arrayList4.get(size4);
            v7.g.e(bVar, "pendingChanges[i]");
            b bVar2 = bVar;
            RecyclerView.b0 b0Var4 = bVar2.f12714a;
            if (b0Var4 != null) {
                u(bVar2, b0Var4);
            }
            RecyclerView.b0 b0Var5 = bVar2.f12715b;
            if (b0Var5 != null) {
                u(bVar2, b0Var5);
            }
        }
        arrayList4.clear();
        if (!l()) {
            return;
        }
        ArrayList<ArrayList<e>> arrayList5 = this.f12709m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList6 = arrayList5.get(size5);
            v7.g.e(arrayList6, "movesList[i]");
            ArrayList<e> arrayList7 = arrayList6;
            int size6 = arrayList7.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar3 = arrayList7.get(size6);
                    v7.g.e(eVar3, "moves[j]");
                    e eVar4 = eVar3;
                    View view3 = eVar4.f12723a.f5666a;
                    v7.g.e(view3, "item.itemView");
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    h(eVar4.f12723a);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList5.remove(arrayList7);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.b0>> arrayList8 = this.f12708l;
        int size7 = arrayList8.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.b0> arrayList9 = arrayList8.get(size7);
            v7.g.e(arrayList9, "additionsList[i]");
            ArrayList<RecyclerView.b0> arrayList10 = arrayList9;
            int size8 = arrayList10.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.b0 b0Var6 = arrayList10.get(size8);
                    v7.g.e(b0Var6, "additions[j]");
                    RecyclerView.b0 b0Var7 = b0Var6;
                    View view4 = b0Var7.f5666a;
                    v7.g.e(view4, "item.itemView");
                    view4.setAlpha(1.0f);
                    h(b0Var7);
                    if (size8 < arrayList10.size()) {
                        arrayList10.remove(size8);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList8.remove(arrayList10);
                    }
                }
            }
        }
        ArrayList<ArrayList<b>> arrayList11 = this.n;
        int size9 = arrayList11.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<b> arrayList12 = arrayList11.get(size9);
                v7.g.e(arrayList12, "changesList[i]");
                ArrayList<b> arrayList13 = arrayList12;
                int size10 = arrayList13.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        b bVar3 = arrayList13.get(size10);
                        v7.g.e(bVar3, "changes[j]");
                        b bVar4 = bVar3;
                        RecyclerView.b0 b0Var8 = bVar4.f12714a;
                        if (b0Var8 != null) {
                            u(bVar4, b0Var8);
                        }
                        RecyclerView.b0 b0Var9 = bVar4.f12715b;
                        if (b0Var9 != null) {
                            u(bVar4, b0Var9);
                        }
                        if (arrayList13.isEmpty()) {
                            arrayList11.remove(arrayList13);
                        }
                    }
                }
            } else {
                r(this.f12712q);
                r(this.f12711p);
                r(this.f12710o);
                r(this.f12713r);
                i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean l() {
        return (this.f12705i.isEmpty() ^ true) || (this.f12707k.isEmpty() ^ true) || (this.f12706j.isEmpty() ^ true) || (this.f12704h.isEmpty() ^ true) || (this.f12711p.isEmpty() ^ true) || (this.f12712q.isEmpty() ^ true) || (this.f12710o.isEmpty() ^ true) || (this.f12713r.isEmpty() ^ true) || (this.f12709m.isEmpty() ^ true) || (this.f12708l.isEmpty() ^ true) || (this.n.isEmpty() ^ true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void m() {
        long j2;
        long j10;
        View view;
        ArrayList<RecyclerView.b0> arrayList = this.f12704h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f12706j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<b> arrayList3 = this.f12707k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.b0> arrayList4 = this.f12705i;
        boolean z13 = !arrayList4.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<RecyclerView.b0> it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.b0 next = it.next();
            v7.g.e(next, "holder");
            if (next instanceof k7.a) {
                ((k7.a) next).d();
            } else {
                j7.e eVar = (j7.e) this;
                ViewPropertyAnimator animate = next.f5666a.animate();
                animate.translationY(view.getHeight());
                animate.alpha(0.0f);
                animate.setDuration(eVar.f5686d);
                animate.setInterpolator(animate.getInterpolator());
                animate.setListener(new d(next));
                animate.setStartDelay(Math.abs((next.f5668d * eVar.f5686d) / 4));
                animate.start();
            }
            this.f12712q.add(next);
        }
        arrayList.clear();
        if (z11) {
            ArrayList<e> arrayList5 = new ArrayList<>(arrayList2);
            this.f12709m.add(arrayList5);
            arrayList2.clear();
            h hVar = new h(arrayList5);
            if (z10) {
                View view2 = arrayList5.get(0).f12723a.f5666a;
                v7.g.e(view2, "moves[0].holder.itemView");
                view2.postOnAnimationDelayed(hVar, this.f5686d);
            } else {
                hVar.run();
            }
        }
        if (z12) {
            ArrayList<b> arrayList6 = new ArrayList<>(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            g gVar = new g(arrayList6);
            if (z10) {
                RecyclerView.b0 b0Var = arrayList6.get(0).f12714a;
                v7.g.c(b0Var);
                b0Var.f5666a.postOnAnimationDelayed(gVar, this.f5686d);
            } else {
                gVar.run();
            }
        }
        if (z13) {
            ArrayList<RecyclerView.b0> arrayList7 = new ArrayList<>(arrayList4);
            this.f12708l.add(arrayList7);
            arrayList4.clear();
            f fVar = new f(arrayList7);
            if (!z10 && !z11 && !z12) {
                fVar.run();
                return;
            }
            long j11 = 0;
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
                j11 = this.f5688f;
            }
            if (j10 < j11) {
                j10 = j11;
            }
            View view3 = arrayList7.get(0).f5666a;
            v7.g.e(view3, "additions[0].itemView");
            view3.postOnAnimationDelayed(fVar, j2 + j10);
        }
    }

    @Override // androidx.recyclerview.widget.d0
    public final void n(RecyclerView.b0 b0Var) {
        v7.g.f(b0Var, "holder");
        j(b0Var);
        View view = b0Var.f5666a;
        v7.g.e(view, "holder.itemView");
        a1.b.y(view);
        if (b0Var instanceof k7.a) {
            ((k7.a) b0Var).c();
        } else {
            view.setTranslationY(view.getHeight());
            view.setAlpha(0.0f);
        }
        this.f12705i.add(b0Var);
    }

    @Override // androidx.recyclerview.widget.d0
    public final boolean o(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13) {
        if (b0Var == b0Var2) {
            return p(b0Var, i10, i11, i12, i13);
        }
        View view = b0Var.f5666a;
        v7.g.e(view, "oldHolder.itemView");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        j(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        j(b0Var2);
        View view2 = b0Var2.f5666a;
        v7.g.e(view2, "newHolder.itemView");
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        this.f12707k.add(new b(b0Var, b0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    public final boolean p(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        v7.g.f(b0Var, "holder");
        View view = b0Var.f5666a;
        v7.g.e(view, "holder.itemView");
        v7.g.e(view, "holder.itemView");
        int translationX = i10 + ((int) view.getTranslationX());
        v7.g.e(view, "holder.itemView");
        int translationY = i11 + ((int) view.getTranslationY());
        j(b0Var);
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
        this.f12706j.add(new e(b0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.d0
    public final void q(RecyclerView.b0 b0Var) {
        v7.g.f(b0Var, "holder");
        j(b0Var);
        View view = b0Var.f5666a;
        v7.g.e(view, "holder.itemView");
        a1.b.y(view);
        if (b0Var instanceof k7.a) {
            ((k7.a) b0Var).a();
        }
        this.f12704h.add(b0Var);
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
            if (size >= 0) {
                b bVar = (b) arrayList.get(size);
                if (u(bVar, b0Var) && bVar.f12714a == null && bVar.f12715b == null) {
                    arrayList.remove(bVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean u(b bVar, RecyclerView.b0 b0Var) {
        if (bVar.f12715b == b0Var) {
            bVar.f12715b = null;
        } else if (bVar.f12714a == b0Var) {
            bVar.f12714a = null;
        } else {
            return false;
        }
        v7.g.c(b0Var);
        View view = b0Var.f5666a;
        v7.g.e(view, "item!!.itemView");
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h(b0Var);
        return true;
    }
}
