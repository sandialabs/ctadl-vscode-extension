package j1;

import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    public final int f12660a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12661b;
    public final Map<a, Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f12662d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f12663e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u7.l<b0.a, m7.n> f12664f;

    public s(int i10, int i11, t tVar, Map map, u7.l lVar) {
        this.f12662d = i10;
        this.f12663e = tVar;
        this.f12664f = lVar;
        this.f12660a = i10;
        this.f12661b = i11;
        this.c = map;
    }

    @Override // j1.r
    public final int a() {
        return this.f12661b;
    }

    @Override // j1.r
    public final int b() {
        return this.f12660a;
    }

    @Override // j1.r
    public final Map<a, Integer> f() {
        return this.c;
    }

    @Override // j1.r
    public final void g() {
        l1.q qVar;
        b0.a.C0134a c0134a = b0.a.f12644a;
        t tVar = this.f12663e;
        LayoutDirection layoutDirection = tVar.getLayoutDirection();
        if (tVar instanceof l1.q) {
            qVar = (l1.q) tVar;
        } else {
            qVar = null;
        }
        h hVar = b0.a.f12646d;
        c0134a.getClass();
        int i10 = b0.a.c;
        LayoutDirection layoutDirection2 = b0.a.f12645b;
        b0.a.c = this.f12662d;
        b0.a.f12645b = layoutDirection;
        boolean i11 = b0.a.C0134a.i(c0134a, qVar);
        this.f12664f.U(c0134a);
        if (qVar != null) {
            qVar.n = i11;
        }
        b0.a.c = i10;
        b0.a.f12645b = layoutDirection2;
        b0.a.f12646d = hVar;
    }
}
