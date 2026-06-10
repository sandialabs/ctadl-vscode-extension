package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import j1.p;
import j1.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import m7.n;
import u7.l;
import u7.s;
import v.f;
import v.q;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<p> f1944j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b0[] f1945k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ s<Integer, int[], LayoutDirection, b2.b, int[], n> f1946l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1947m;
    public final /* synthetic */ t n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int[] f1948o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ LayoutOrientation f1949p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q[] f1950q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f f1951r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f1952s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f1953t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(List<? extends p> list, b0[] b0VarArr, s<? super Integer, ? super int[], ? super LayoutDirection, ? super b2.b, ? super int[], n> sVar, int i10, t tVar, int[] iArr, LayoutOrientation layoutOrientation, q[] qVarArr, f fVar, int i11, Ref$IntRef ref$IntRef) {
        super(1);
        this.f1944j = list;
        this.f1945k = b0VarArr;
        this.f1946l = sVar;
        this.f1947m = i10;
        this.n = tVar;
        this.f1948o = iArr;
        this.f1949p = layoutOrientation;
        this.f1950q = qVarArr;
        this.f1951r = fVar;
        this.f1952s = i11;
        this.f1953t = ref$IntRef;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        LayoutOrientation layoutOrientation;
        LayoutOrientation layoutOrientation2;
        b0[] b0VarArr;
        f fVar;
        int i10;
        LayoutDirection layoutDirection;
        int i11;
        int i12;
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        int size = this.f1944j.size();
        int[] iArr = new int[size];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            layoutOrientation = LayoutOrientation.Horizontal;
            layoutOrientation2 = this.f1949p;
            b0VarArr = this.f1945k;
            if (i14 >= size) {
                break;
            }
            b0 b0Var = b0VarArr[i14];
            g.c(b0Var);
            if (layoutOrientation2 == layoutOrientation) {
                i12 = b0Var.f12640i;
            } else {
                i12 = b0Var.f12641j;
            }
            iArr[i14] = i12;
            i14++;
        }
        s<Integer, int[], LayoutDirection, b2.b, int[], n> sVar = this.f1946l;
        Integer valueOf = Integer.valueOf(this.f1947m);
        t tVar = this.n;
        sVar.V(valueOf, iArr, tVar.getLayoutDirection(), this.n, this.f1948o);
        int length = b0VarArr.length;
        int i15 = 0;
        while (i13 < length) {
            b0 b0Var2 = b0VarArr[i13];
            int i16 = i15 + 1;
            g.c(b0Var2);
            q qVar = this.f1950q[i15];
            if (qVar != null) {
                fVar = qVar.c;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                fVar = this.f1951r;
            }
            if (layoutOrientation2 == layoutOrientation) {
                i10 = b0Var2.f12641j;
            } else {
                i10 = b0Var2.f12640i;
            }
            int i17 = this.f1952s - i10;
            if (layoutOrientation2 == layoutOrientation) {
                layoutDirection = LayoutDirection.Ltr;
            } else {
                layoutDirection = tVar.getLayoutDirection();
            }
            int i18 = this.f1953t.f13058i;
            int a10 = fVar.a(i17, layoutDirection, b0Var2);
            int[] iArr2 = this.f1948o;
            if (layoutOrientation2 == layoutOrientation) {
                a10 = iArr2[i15];
                i11 = a10;
            } else {
                i11 = iArr2[i15];
            }
            b0.a.c(aVar2, b0Var2, a10, i11);
            i13++;
            i15 = i16;
        }
        return n.f16010a;
    }
}
