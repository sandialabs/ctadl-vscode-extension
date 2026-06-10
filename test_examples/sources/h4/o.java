package h4;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import h4.j;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o extends j {
    public int H;
    public ArrayList<j> F = new ArrayList<>();
    public boolean G = true;
    public boolean I = false;
    public int J = 0;

    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f11422a;

        public a(j jVar) {
            this.f11422a = jVar;
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            this.f11422a.A();
            jVar.x(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final o f11423a;

        public b(o oVar) {
            this.f11423a = oVar;
        }

        @Override // h4.m, h4.j.d
        public final void a(j jVar) {
            o oVar = this.f11423a;
            if (oVar.I) {
                return;
            }
            oVar.H();
            oVar.I = true;
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            o oVar = this.f11423a;
            int i10 = oVar.H - 1;
            oVar.H = i10;
            if (i10 == 0) {
                oVar.I = false;
                oVar.o();
            }
            jVar.x(this);
        }
    }

    @Override // h4.j
    public final void A() {
        if (this.F.isEmpty()) {
            H();
            o();
            return;
        }
        b bVar = new b(this);
        Iterator<j> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.H = this.F.size();
        if (!this.G) {
            for (int i10 = 1; i10 < this.F.size(); i10++) {
                this.F.get(i10 - 1).a(new a(this.F.get(i10)));
            }
            j jVar = this.F.get(0);
            if (jVar != null) {
                jVar.A();
                return;
            }
            return;
        }
        Iterator<j> it2 = this.F.iterator();
        while (it2.hasNext()) {
            it2.next().A();
        }
    }

    @Override // h4.j
    public final void B(long j2) {
        ArrayList<j> arrayList;
        this.f11394k = j2;
        if (j2 >= 0 && (arrayList = this.F) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).B(j2);
            }
        }
    }

    @Override // h4.j
    public final void C(j.c cVar) {
        this.A = cVar;
        this.J |= 8;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).C(cVar);
        }
    }

    @Override // h4.j
    public final void D(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList<j> arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.F.get(i10).D(timeInterpolator);
            }
        }
        this.f11395l = timeInterpolator;
    }

    @Override // h4.j
    public final void E(androidx.datastore.preferences.protobuf.k kVar) {
        super.E(kVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.size(); i10++) {
                this.F.get(i10).E(kVar);
            }
        }
    }

    @Override // h4.j
    public final void F() {
        this.J |= 2;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).F();
        }
    }

    @Override // h4.j
    public final void G(long j2) {
        this.f11393j = j2;
    }

    @Override // h4.j
    public final String I(String str) {
        String I = super.I(str);
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(I);
            sb.append("\n");
            sb.append(this.F.get(i10).I(str + "  "));
            I = sb.toString();
        }
        return I;
    }

    public final void J(j jVar) {
        this.F.add(jVar);
        jVar.f11399q = this;
        long j2 = this.f11394k;
        if (j2 >= 0) {
            jVar.B(j2);
        }
        if ((this.J & 1) != 0) {
            jVar.D(this.f11395l);
        }
        if ((this.J & 2) != 0) {
            jVar.F();
        }
        if ((this.J & 4) != 0) {
            jVar.E(this.B);
        }
        if ((this.J & 8) != 0) {
            jVar.C(this.A);
        }
    }

    @Override // h4.j
    public final void a(j.d dVar) {
        super.a(dVar);
    }

    @Override // h4.j
    public final void b(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).b(view);
        }
        this.n.add(view);
    }

    @Override // h4.j
    public final void d() {
        super.d();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).d();
        }
    }

    @Override // h4.j
    public final void e(q qVar) {
        View view = qVar.f11427b;
        if (u(view)) {
            Iterator<j> it = this.F.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.u(view)) {
                    next.e(qVar);
                    qVar.c.add(next);
                }
            }
        }
    }

    @Override // h4.j
    public final void h(q qVar) {
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).h(qVar);
        }
    }

    @Override // h4.j
    public final void i(q qVar) {
        View view = qVar.f11427b;
        if (u(view)) {
            Iterator<j> it = this.F.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.u(view)) {
                    next.i(qVar);
                    qVar.c.add(next);
                }
            }
        }
    }

    @Override // h4.j
    /* renamed from: l */
    public final j clone() {
        o oVar = (o) super.clone();
        oVar.F = new ArrayList<>();
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            j clone = this.F.get(i10).clone();
            oVar.F.add(clone);
            clone.f11399q = oVar;
        }
        return oVar;
    }

    @Override // h4.j
    public final void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j2 = this.f11393j;
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = this.F.get(i10);
            if (j2 > 0 && (this.G || i10 == 0)) {
                long j10 = jVar.f11393j;
                if (j10 > 0) {
                    jVar.G(j10 + j2);
                } else {
                    jVar.G(j2);
                }
            }
            jVar.n(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // h4.j
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).w(view);
        }
    }

    @Override // h4.j
    public final void x(j.d dVar) {
        super.x(dVar);
    }

    @Override // h4.j
    public final void y(View view) {
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            this.F.get(i10).y(view);
        }
        this.n.remove(view);
    }

    @Override // h4.j
    public final void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.F.get(i10).z(viewGroup);
        }
    }
}
