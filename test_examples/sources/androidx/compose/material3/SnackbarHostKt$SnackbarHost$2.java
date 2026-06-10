package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$2 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f2422j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f2423k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q<m, g0.d, Integer, n> f2424l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2425m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarHostKt$SnackbarHost$2(d dVar, q0.d dVar2, q<? super m, ? super g0.d, ? super Integer, n> qVar, int i10, int i11) {
        super(2);
        this.f2422j = dVar;
        this.f2423k = dVar2;
        this.f2424l = qVar;
        this.f2425m = i10;
        this.n = i11;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        SnackbarHostKt.b(this.f2422j, this.f2423k, this.f2424l, dVar, this.f2425m | 1, this.n);
        return n.f16010a;
    }
}
