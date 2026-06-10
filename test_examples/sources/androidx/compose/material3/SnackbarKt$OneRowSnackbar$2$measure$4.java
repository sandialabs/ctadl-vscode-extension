package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$2$measure$4 extends Lambda implements l<b0.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f2452j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2453k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b0 f2454l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2455m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f2456o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f2457p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2458q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(b0 b0Var, int i10, b0 b0Var2, int i11, int i12, b0 b0Var3, int i13, int i14) {
        super(1);
        this.f2452j = b0Var;
        this.f2453k = i10;
        this.f2454l = b0Var2;
        this.f2455m = i11;
        this.n = i12;
        this.f2456o = b0Var3;
        this.f2457p = i13;
        this.f2458q = i14;
    }

    @Override // u7.l
    public final n U(b0.a aVar) {
        b0.a aVar2 = aVar;
        g.f(aVar2, "$this$layout");
        b0.a.f(aVar2, this.f2452j, 0, this.f2453k);
        b0 b0Var = this.f2454l;
        if (b0Var != null) {
            b0.a.f(aVar2, b0Var, this.f2455m, this.n);
        }
        b0 b0Var2 = this.f2456o;
        if (b0Var2 != null) {
            b0.a.f(aVar2, b0Var2, this.f2457p, this.f2458q);
        }
        return n.f16010a;
    }
}
