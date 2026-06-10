package androidx.compose.foundation.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ j1.a f1879j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f1880k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f1881l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1882m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f1883o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f1884p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(j1.a aVar, float f10, int i10, int i11, int i12, b0 b0Var, int i13) {
        super(1);
        this.f1879j = aVar;
        this.f1880k = f10;
        this.f1881l = i10;
        this.f1882m = i11;
        this.n = i12;
        this.f1883o = b0Var;
        this.f1884p = i13;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        int i10;
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        boolean z10 = this.f1879j instanceof d;
        int i11 = 0;
        int i12 = this.f1881l;
        b0 b0Var = this.f1883o;
        int i13 = this.n;
        float f10 = this.f1880k;
        if (z10) {
            i10 = 0;
        } else if (!b2.d.a(f10, Float.NaN)) {
            i10 = i12;
        } else {
            i10 = (this.f1882m - i13) - b0Var.f12640i;
        }
        if (z10) {
            if (!b2.d.a(f10, Float.NaN)) {
                i11 = i12;
            } else {
                i11 = (this.f1884p - i13) - b0Var.f12641j;
            }
        }
        b0.a.f(aVar2, b0Var, i10, i11);
        return n.f16010a;
    }
}
