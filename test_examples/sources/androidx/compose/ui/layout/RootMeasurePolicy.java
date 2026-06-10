package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import j1.b0;
import j1.p;
import j1.r;
import j1.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.c {

    /* renamed from: a  reason: collision with root package name */
    public static final RootMeasurePolicy f3326a = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // j1.q
    public final r a(t tVar, List<? extends p> list, long j2) {
        r m02;
        int p10;
        l rootMeasurePolicy$measure$2;
        int i10;
        r m03;
        g.f(tVar, "$this$measure");
        if (list.isEmpty()) {
            i10 = b2.a.h(j2);
            p10 = b2.a.g(j2);
            rootMeasurePolicy$measure$2 = RootMeasurePolicy$measure$1.f3327j;
        } else {
            if (list.size() == 1) {
                b0 b5 = list.get(0).b(j2);
                int q10 = v8.b.q(j2, b5.f12640i);
                p10 = v8.b.p(j2, b5.f12641j);
                rootMeasurePolicy$measure$2 = new RootMeasurePolicy$measure$2(b5);
                i10 = q10;
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(list.get(i11).b(j2));
                }
                int size2 = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    b0 b0Var = (b0) arrayList.get(i14);
                    i12 = Math.max(b0Var.f12640i, i12);
                    i13 = Math.max(b0Var.f12641j, i13);
                }
                m02 = tVar.m0(v8.b.q(j2, i12), v8.b.p(j2, i13), d.K1(), new RootMeasurePolicy$measure$4(arrayList));
                return m02;
            }
        }
        m03 = tVar.m0(i10, p10, d.K1(), rootMeasurePolicy$measure$2);
        return m03;
    }
}
