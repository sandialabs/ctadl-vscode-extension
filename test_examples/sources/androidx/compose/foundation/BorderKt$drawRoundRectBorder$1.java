package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u0.f;
import u7.l;
import v0.m;
import v7.g;
import x0.a;
import x0.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/c;", "Lm7/n;", "invoke", "(Lx0/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class BorderKt$drawRoundRectBorder$1 extends Lambda implements l<x0.c, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1407j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f1408k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f1409l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ float f1410m;
    public final /* synthetic */ float n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f1411o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f1412p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ i f1413q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRoundRectBorder$1(boolean z10, m mVar, long j2, float f10, float f11, long j10, long j11, i iVar) {
        super(1);
        this.f1407j = z10;
        this.f1408k = mVar;
        this.f1409l = j2;
        this.f1410m = f10;
        this.n = f11;
        this.f1411o = j10;
        this.f1412p = j11;
        this.f1413q = iVar;
    }

    @Override // u7.l
    public final n U(x0.c cVar) {
        long j2;
        long j10;
        i iVar;
        long j11;
        int i10;
        m mVar = this.f1408k;
        x0.c cVar2 = cVar;
        g.f(cVar2, "$this$onDrawWithContent");
        cVar2.o0();
        boolean z10 = this.f1407j;
        long j12 = this.f1409l;
        if (z10) {
            j2 = 0;
            iVar = null;
            j11 = j12;
            j10 = 0;
            i10 = 246;
        } else {
            float b5 = u0.a.b(j12);
            float f10 = this.f1410m;
            if (b5 < f10) {
                float f11 = this.n;
                float d5 = f.d(cVar2.a());
                float f12 = this.n;
                float f13 = d5 - f12;
                float b10 = f.b(cVar2.a()) - f12;
                m mVar2 = this.f1408k;
                long j13 = this.f1409l;
                a.b N = cVar2.N();
                long a10 = N.a();
                N.b().m();
                N.f18556a.b(f11, f11, f13, b10, 0);
                x0.e.f(cVar2, mVar2, 0L, 0L, j13, null, 246);
                N.b().l();
                N.c(a10);
                return n.f16010a;
            }
            long c = a.c(f10, j12);
            j2 = this.f1411o;
            j10 = this.f1412p;
            iVar = this.f1413q;
            j11 = c;
            i10 = 208;
        }
        x0.e.f(cVar2, mVar, j2, j10, j11, iVar, i10);
        return n.f16010a;
    }
}
