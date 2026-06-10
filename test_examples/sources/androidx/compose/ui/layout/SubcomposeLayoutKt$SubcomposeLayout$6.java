package androidx.compose.ui.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import j1.f0;
import j1.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$6 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f3337j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f3338k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<f0, b2.a, r> f3339l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3340m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeLayoutKt$SubcomposeLayout$6(c cVar, q0.d dVar, p<? super f0, ? super b2.a, ? extends r> pVar, int i10, int i11) {
        super(2);
        this.f3337j = cVar;
        this.f3338k = dVar;
        this.f3339l = pVar;
        this.f3340m = i10;
        this.n = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SubcomposeLayoutKt.a(this.f3337j, this.f3338k, this.f3339l, dVar, this.f3340m | 1, this.n);
        return n.f16010a;
    }
}
