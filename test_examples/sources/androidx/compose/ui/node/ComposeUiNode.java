package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import j1.q;
import m7.n;
import q0.d;
import u7.p;

/* loaded from: classes.dex */
public interface ComposeUiNode {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3400a = Companion.f3401a;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f3401a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final u7.a<ComposeUiNode> f3402b;
        public static final p<ComposeUiNode, d, n> c;

        /* renamed from: d  reason: collision with root package name */
        public static final p<ComposeUiNode, b2.b, n> f3403d;

        /* renamed from: e  reason: collision with root package name */
        public static final p<ComposeUiNode, q, n> f3404e;

        /* renamed from: f  reason: collision with root package name */
        public static final p<ComposeUiNode, LayoutDirection, n> f3405f;

        /* renamed from: g  reason: collision with root package name */
        public static final p<ComposeUiNode, j1, n> f3406g;

        static {
            LayoutNode.b bVar = LayoutNode.S;
            f3402b = LayoutNode.T;
            int i10 = ComposeUiNode$Companion$VirtualConstructor$1.f3412j;
            c = ComposeUiNode$Companion$SetModifier$1.f3410j;
            f3403d = ComposeUiNode$Companion$SetDensity$1.f3407j;
            f3404e = ComposeUiNode$Companion$SetMeasurePolicy$1.f3409j;
            f3405f = ComposeUiNode$Companion$SetLayoutDirection$1.f3408j;
            f3406g = ComposeUiNode$Companion$SetViewConfiguration$1.f3411j;
        }
    }

    void b(q qVar);

    void c(j1 j1Var);

    void d(LayoutDirection layoutDirection);

    void e(b2.b bVar);

    void f(d dVar);
}
