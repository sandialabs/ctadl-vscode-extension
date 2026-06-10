package g2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: f  reason: collision with root package name */
    public static int f11216f;

    /* renamed from: b  reason: collision with root package name */
    public final int f11218b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f11217a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f11219d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f11220e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.c cVar) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            cVar.getClass();
            androidx.constraintlayout.core.c.o(constraintAnchor);
            androidx.constraintlayout.core.c.o(constraintWidget.L);
            androidx.constraintlayout.core.c.o(constraintWidget.M);
            androidx.constraintlayout.core.c.o(constraintWidget.N);
            androidx.constraintlayout.core.c.o(constraintWidget.O);
        }
    }

    public j(int i10) {
        this.f11218b = -1;
        int i11 = f11216f;
        f11216f = i11 + 1;
        this.f11218b = i11;
        this.c = i10;
    }

    public final void a(ArrayList<j> arrayList) {
        int size = this.f11217a.size();
        if (this.f11220e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j jVar = arrayList.get(i10);
                if (this.f11220e == jVar.f11218b) {
                    c(this.c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(androidx.constraintlayout.core.c cVar, int i10) {
        int o10;
        ConstraintAnchor constraintAnchor;
        ArrayList<ConstraintWidget> arrayList = this.f11217a;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).W;
        cVar.u();
        dVar.c(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).c(cVar, false);
        }
        if (i10 == 0 && dVar.B0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.C0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f11219d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f11219d.add(new a(arrayList.get(i12), cVar));
        }
        if (i10 == 0) {
            o10 = androidx.constraintlayout.core.c.o(dVar.K);
            constraintAnchor = dVar.M;
        } else {
            o10 = androidx.constraintlayout.core.c.o(dVar.L);
            constraintAnchor = dVar.N;
        }
        int o11 = androidx.constraintlayout.core.c.o(constraintAnchor);
        cVar.u();
        return o11 - o10;
    }

    public final void c(int i10, j jVar) {
        Iterator<ConstraintWidget> it = this.f11217a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i11 = jVar.f11218b;
            if (hasNext) {
                ConstraintWidget next = it.next();
                ArrayList<ConstraintWidget> arrayList = jVar.f11217a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i10 == 0) {
                    next.f4266q0 = i11;
                } else {
                    next.f4268r0 = i11;
                }
            } else {
                this.f11220e = i11;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        Iterator<ConstraintWidget> it;
        StringBuilder sb = new StringBuilder();
        int i10 = this.c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f11218b);
        sb.append("] <");
        String sb2 = sb.toString();
        while (this.f11217a.iterator().hasNext()) {
            sb2 = sb2 + " " + it.next().f4255k0;
        }
        return a4.b.l(sb2, " >");
    }
}
