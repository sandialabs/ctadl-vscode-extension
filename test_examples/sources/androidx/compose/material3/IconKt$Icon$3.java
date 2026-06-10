package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt$Icon$3 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ y0.b f2320j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f2321k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q0.d f2322l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f2323m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$3(y0.b bVar, String str, q0.d dVar, long j2, int i10, int i11) {
        super(2);
        this.f2320j = bVar;
        this.f2321k = str;
        this.f2322l = dVar;
        this.f2323m = j2;
        this.n = i10;
        this.f2324o = i11;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        IconKt.a(this.f2320j, this.f2321k, this.f2322l, this.f2323m, dVar, this.n | 1, this.f2324o);
        return n.f16010a;
    }
}
