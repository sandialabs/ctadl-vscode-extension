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
public final class SubcomposeLayoutKt$SubcomposeLayout$2 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f3331j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<f0, b2.a, r> f3332k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3333l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubcomposeLayoutKt$SubcomposeLayout$2(q0.d dVar, p<? super f0, ? super b2.a, ? extends r> pVar, int i10, int i11) {
        super(2);
        this.f3331j = dVar;
        this.f3332k = pVar;
        this.f3333l = i10;
        this.f3334m = i11;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        SubcomposeLayoutKt.b(this.f3331j, this.f3332k, dVar, this.f3333l | 1, this.f3334m);
        return n.f16010a;
    }
}
