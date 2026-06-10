package androidx.compose.material3;

import androidx.compose.foundation.layout.b;
import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TopAppBarLayout$2$measure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f2215j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2216k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b0 f2217l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b.d f2218m;
    public final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f2219o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t f2220p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b.k f2221q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2222r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2223s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$2$measure$1(b0 b0Var, int i10, b0 b0Var2, b.d dVar, long j2, b0 b0Var3, t tVar, b.k kVar, int i11, int i12) {
        super(1);
        this.f2215j = b0Var;
        this.f2216k = i10;
        this.f2217l = b0Var2;
        this.f2218m = dVar;
        this.n = j2;
        this.f2219o = b0Var3;
        this.f2220p = tVar;
        this.f2221q = kVar;
        this.f2222r = i11;
        this.f2223s = i12;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        int max;
        int i10;
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        b0 b0Var = this.f2215j;
        int i11 = b0Var.f12641j;
        int i12 = this.f2216k;
        int i13 = 0;
        b0.a.f(aVar2, b0Var, 0, (i12 - i11) / 2);
        b.C0019b c0019b = androidx.compose.foundation.layout.b.f2001e;
        b.d dVar = this.f2218m;
        boolean a10 = g.a(dVar, c0019b);
        b0 b0Var2 = this.f2217l;
        b0 b0Var3 = this.f2219o;
        long j2 = this.n;
        if (a10) {
            max = (b2.a.f(j2) - b0Var2.f12640i) / 2;
        } else if (g.a(dVar, androidx.compose.foundation.layout.b.f1999b)) {
            max = (b2.a.f(j2) - b0Var2.f12640i) - b0Var3.f12640i;
        } else {
            max = Math.max(this.f2220p.a0(a.f2601b), b0Var.f12640i);
        }
        b.k kVar = this.f2221q;
        if (g.a(kVar, c0019b)) {
            i10 = (i12 - b0Var2.f12641j) / 2;
        } else {
            if (g.a(kVar, androidx.compose.foundation.layout.b.f2000d)) {
                int i14 = this.f2222r;
                if (i14 == 0) {
                    i10 = i12 - b0Var2.f12641j;
                } else {
                    int i15 = b0Var2.f12641j;
                    i13 = (i12 - i15) - Math.max(0, (i14 - i15) + this.f2223s);
                }
            }
            b0.a.f(aVar2, b0Var2, max, i13);
            b0.a.f(aVar2, b0Var3, b2.a.f(j2) - b0Var3.f12640i, (i12 - b0Var3.f12641j) / 2);
            return n.f16010a;
        }
        i13 = i10;
        b0.a.f(aVar2, b0Var2, max, i13);
        b0.a.f(aVar2, b0Var3, b2.a.f(j2) - b0Var3.f12640i, (i12 - b0Var3.f12641j) / 2);
        return n.f16010a;
    }
}
