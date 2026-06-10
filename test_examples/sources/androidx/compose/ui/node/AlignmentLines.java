package androidx.compose.ui.node;

import a1.c;
import androidx.compose.ui.layout.AlignmentLineKt;
import j1.d;
import java.util.HashMap;
import java.util.Map;
import v7.g;

/* loaded from: classes.dex */
public abstract class AlignmentLines {

    /* renamed from: a  reason: collision with root package name */
    public final l1.a f3372a;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3374d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3375e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3376f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3377g;

    /* renamed from: h  reason: collision with root package name */
    public l1.a f3378h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3373b = true;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f3379i = new HashMap();

    public AlignmentLines(l1.a aVar) {
        this.f3372a = aVar;
    }

    public static final void a(AlignmentLines alignmentLines, j1.a aVar, int i10, NodeCoordinator nodeCoordinator) {
        long s10;
        float b5;
        alignmentLines.getClass();
        loop0: while (true) {
            float f10 = i10;
            s10 = c.s(f10, f10);
            do {
                s10 = alignmentLines.b(nodeCoordinator, s10);
                nodeCoordinator = nodeCoordinator.f3501q;
                g.c(nodeCoordinator);
                if (g.a(nodeCoordinator, alignmentLines.f3372a.o())) {
                    break loop0;
                }
            } while (!alignmentLines.c(nodeCoordinator).containsKey(aVar));
            i10 = alignmentLines.d(nodeCoordinator, aVar);
        }
        if (aVar instanceof d) {
            b5 = u0.c.c(s10);
        } else {
            b5 = u0.c.b(s10);
        }
        int g12 = m0.b.g1(b5);
        HashMap hashMap = alignmentLines.f3379i;
        if (hashMap.containsKey(aVar)) {
            int intValue = ((Number) kotlin.collections.d.L1(aVar, hashMap)).intValue();
            d dVar = AlignmentLineKt.f3312a;
            g.f(aVar, "<this>");
            g12 = aVar.f12639a.R(Integer.valueOf(intValue), Integer.valueOf(g12)).intValue();
        }
        hashMap.put(aVar, Integer.valueOf(g12));
    }

    public abstract long b(NodeCoordinator nodeCoordinator, long j2);

    public abstract Map<j1.a, Integer> c(NodeCoordinator nodeCoordinator);

    public abstract int d(NodeCoordinator nodeCoordinator, j1.a aVar);

    public final boolean e() {
        if (!this.c && !this.f3375e && !this.f3376f && !this.f3377g) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        i();
        return this.f3378h != null;
    }

    public final void g() {
        this.f3373b = true;
        l1.a aVar = this.f3372a;
        l1.a v3 = aVar.v();
        if (v3 == null) {
            return;
        }
        if (this.c) {
            v3.Z();
        } else if (this.f3375e || this.f3374d) {
            v3.requestLayout();
        }
        if (this.f3376f) {
            aVar.Z();
        }
        if (this.f3377g) {
            v3.requestLayout();
        }
        v3.f().g();
    }

    public final void h() {
        HashMap hashMap = this.f3379i;
        hashMap.clear();
        AlignmentLines$recalculate$1 alignmentLines$recalculate$1 = new AlignmentLines$recalculate$1(this);
        l1.a aVar = this.f3372a;
        aVar.r(alignmentLines$recalculate$1);
        hashMap.putAll(c(aVar.o()));
        this.f3373b = false;
    }

    public final void i() {
        AlignmentLines f10;
        AlignmentLines f11;
        boolean e10 = e();
        l1.a aVar = this.f3372a;
        if (!e10) {
            l1.a v3 = aVar.v();
            if (v3 == null) {
                return;
            }
            aVar = v3.f().f3378h;
            if (aVar == null || !aVar.f().e()) {
                l1.a aVar2 = this.f3378h;
                if (aVar2 != null && !aVar2.f().e()) {
                    l1.a v10 = aVar2.v();
                    if (v10 != null && (f11 = v10.f()) != null) {
                        f11.i();
                    }
                    l1.a v11 = aVar2.v();
                    aVar = (v11 == null || (f10 = v11.f()) == null) ? null : f10.f3378h;
                }
                return;
            }
        }
        this.f3378h = aVar;
    }
}
