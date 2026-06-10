package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt$Icon$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z0.c f2315j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f2316k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q0.d f2317l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f2318m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2319o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$1(z0.c cVar, String str, q0.d dVar, long j2, int i10, int i11) {
        super(2);
        this.f2315j = cVar;
        this.f2316k = str;
        this.f2317l = dVar;
        this.f2318m = j2;
        this.n = i10;
        this.f2319o = i11;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        IconKt.b(this.f2315j, this.f2316k, this.f2317l, this.f2318m, dVar, this.n | 1, this.f2319o);
        return n.f16010a;
    }
}
