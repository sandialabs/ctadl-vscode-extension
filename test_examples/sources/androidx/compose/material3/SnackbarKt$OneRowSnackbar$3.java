package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$3 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2459j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2460k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2461l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p1.p f2462m;
    public final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f2463o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f2464p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarKt$OneRowSnackbar$3(p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, p<? super g0.d, ? super Integer, n> pVar3, p1.p pVar4, long j2, long j10, int i10) {
        super(2);
        this.f2459j = pVar;
        this.f2460k = pVar2;
        this.f2461l = pVar3;
        this.f2462m = pVar4;
        this.n = j2;
        this.f2463o = j10;
        this.f2464p = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        SnackbarKt.d(this.f2459j, this.f2460k, this.f2461l, this.f2462m, this.n, this.f2463o, dVar, this.f2464p | 1);
        return n.f16010a;
    }
}
