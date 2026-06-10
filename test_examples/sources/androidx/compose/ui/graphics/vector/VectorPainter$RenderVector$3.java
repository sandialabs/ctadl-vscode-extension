package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.r;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainter$RenderVector$3 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ VectorPainter f3234j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f3235k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ float f3236l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ float f3237m;
    public final /* synthetic */ r<Float, Float, d, Integer, n> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3238o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f10, float f11, r<? super Float, ? super Float, ? super d, ? super Integer, n> rVar, int i10) {
        super(2);
        this.f3234j = vectorPainter;
        this.f3235k = str;
        this.f3236l = f10;
        this.f3237m = f11;
        this.n = rVar;
        this.f3238o = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        this.f3234j.e(this.f3235k, this.f3236l, this.f3237m, this.n, dVar, this.f3238o | 1);
        return n.f16010a;
    }
}
