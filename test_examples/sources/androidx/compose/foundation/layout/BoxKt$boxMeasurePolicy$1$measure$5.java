package androidx.compose.foundation.layout;

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
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b0$a;", "Lm7/n;", "invoke", "(Lj1/b0$a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BoxKt$boxMeasurePolicy$1$measure$5 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0[] f1900j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<p> f1901k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t f1902l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f1903m;
    public final /* synthetic */ Ref$IntRef n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q0.a f1904o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxKt$boxMeasurePolicy$1$measure$5(b0[] b0VarArr, List<? extends p> list, t tVar, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, q0.a aVar) {
        super(1);
        this.f1900j = b0VarArr;
        this.f1901k = list;
        this.f1902l = tVar;
        this.f1903m = ref$IntRef;
        this.n = ref$IntRef2;
        this.f1904o = aVar;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        q0.a aVar3 = this.f1904o;
        b0[] b0VarArr = this.f1900j;
        int length = b0VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            b0 b0Var = b0VarArr[i11];
            int i12 = i10 + 1;
            if (b0Var != null) {
                BoxKt.b(aVar2, b0Var, this.f1901k.get(i10), this.f1902l.getLayoutDirection(), this.f1903m.f13058i, this.n.f13058i, aVar3);
                i11++;
                i10 = i12;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            }
        }
        return n.f16010a;
    }
}
