package j1;

import androidx.compose.ui.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends LayoutNode.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.b f12655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u7.p<f0, b2.a, r> f12656b;

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f12657a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.b f12658b;
        public final /* synthetic */ int c;

        public a(r rVar, androidx.compose.ui.layout.b bVar, int i10) {
            this.f12657a = rVar;
            this.f12658b = bVar;
            this.c = i10;
        }

        @Override // j1.r
        public final int a() {
            return this.f12657a.a();
        }

        @Override // j1.r
        public final int b() {
            return this.f12657a.b();
        }

        @Override // j1.r
        public final Map<j1.a, Integer> f() {
            return this.f12657a.f();
        }

        @Override // j1.r
        public final void g() {
            androidx.compose.ui.layout.b bVar = this.f12658b;
            bVar.f3346d = this.c;
            this.f12657a.g();
            bVar.a(bVar.f3346d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(androidx.compose.ui.layout.b bVar, u7.p<? super f0, ? super b2.a, ? extends r> pVar, String str) {
        super(str);
        this.f12655a = bVar;
        this.f12656b = pVar;
    }

    @Override // j1.q
    public final r a(t tVar, List<? extends p> list, long j2) {
        v7.g.f(tVar, "$this$measure");
        androidx.compose.ui.layout.b bVar = this.f12655a;
        b.C0023b c0023b = bVar.f3349g;
        LayoutDirection layoutDirection = tVar.getLayoutDirection();
        c0023b.getClass();
        v7.g.f(layoutDirection, "<set-?>");
        c0023b.f3359i = layoutDirection;
        float density = tVar.getDensity();
        b.C0023b c0023b2 = bVar.f3349g;
        c0023b2.f3360j = density;
        c0023b2.f3361k = tVar.y();
        bVar.f3346d = 0;
        return new a(this.f12656b.R(c0023b2, new b2.a(j2)), bVar, bVar.f3346d);
    }
}
