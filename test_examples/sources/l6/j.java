package l6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h4.a0;
import java.util.ArrayList;
import java.util.Iterator;
import l6.q;

/* loaded from: classes.dex */
public abstract class j<P extends q> extends a0 {
    public final P H;
    public final q I;
    public final ArrayList J = new ArrayList();

    public j(P p10, q qVar) {
        this.H = p10;
        this.I = qVar;
    }

    public static void N(ArrayList arrayList, q qVar, ViewGroup viewGroup, View view, boolean z10) {
        if (qVar == null) {
            return;
        }
        Animator a10 = z10 ? qVar.a(viewGroup, view) : qVar.b(viewGroup, view);
        if (a10 != null) {
            arrayList.add(a10);
        }
    }

    @Override // h4.a0
    public final Animator L(ViewGroup viewGroup, View view, h4.q qVar) {
        return O(viewGroup, view, true);
    }

    @Override // h4.a0
    public final Animator M(ViewGroup viewGroup, View view, h4.q qVar) {
        return O(viewGroup, view, false);
    }

    public final AnimatorSet O(ViewGroup viewGroup, View view, boolean z10) {
        int c;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        N(arrayList, this.H, viewGroup, view, z10);
        N(arrayList, this.I, viewGroup, view, z10);
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            N(arrayList, (q) it.next(), viewGroup, view, z10);
        }
        Context context = viewGroup.getContext();
        int Q = Q(z10);
        int i10 = p.f15831a;
        if (Q != 0 && this.f11394k == -1 && (c = v5.a.c(context, Q, -1)) != -1) {
            this.f11394k = c;
        }
        int R = R(z10);
        TimeInterpolator P = P();
        if (R != 0 && this.f11395l == null) {
            this.f11395l = v5.a.d(context, R, P);
        }
        a1.c.i1(animatorSet, arrayList);
        return animatorSet;
    }

    public TimeInterpolator P() {
        return e5.a.f10648b;
    }

    public int Q(boolean z10) {
        return 0;
    }

    public int R(boolean z10) {
        return 0;
    }
}
