package j1;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.node.LayoutNode;
import g0.g1;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e0 implements g0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1 f12651a;

    public e0(g1 g1Var) {
        this.f12651a = g1Var;
    }

    @Override // g0.p
    public final void a() {
        androidx.compose.ui.layout.b a10 = ((androidx.compose.ui.layout.c) this.f12651a.getValue()).a();
        LayoutNode layoutNode = a10.f3344a;
        layoutNode.f3422r = true;
        LinkedHashMap linkedHashMap = a10.f3347e;
        for (b.a aVar : linkedHashMap.values()) {
            g0.f fVar = aVar.c;
            if (fVar != null) {
                fVar.a();
            }
        }
        layoutNode.H();
        layoutNode.f3422r = false;
        linkedHashMap.clear();
        a10.f3348f.clear();
        a10.f3353k = 0;
        a10.f3352j = 0;
        a10.f3350h.clear();
        a10.b();
    }
}
