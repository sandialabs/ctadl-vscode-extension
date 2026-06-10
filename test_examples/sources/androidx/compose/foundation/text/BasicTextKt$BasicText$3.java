package androidx.compose.foundation.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt$BasicText$3 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f2088j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ q0.d f2089k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p1.p f2090l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l<p1.n, n> f2091m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f2092o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f2093p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2094q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2095r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextKt$BasicText$3(String str, q0.d dVar, p1.p pVar, l<? super p1.n, n> lVar, int i10, boolean z10, int i11, int i12, int i13) {
        super(2);
        this.f2088j = str;
        this.f2089k = dVar;
        this.f2090l = pVar;
        this.f2091m = lVar;
        this.n = i10;
        this.f2092o = z10;
        this.f2093p = i11;
        this.f2094q = i12;
        this.f2095r = i13;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        BasicTextKt.a(this.f2088j, this.f2089k, this.f2090l, this.f2091m, this.n, this.f2092o, this.f2093p, dVar, this.f2094q | 1, this.f2095r);
        return n.f16010a;
    }
}
