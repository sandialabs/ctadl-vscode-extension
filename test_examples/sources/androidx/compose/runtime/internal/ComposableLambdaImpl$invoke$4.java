package androidx.compose.runtime.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg0/d;", "nc", "", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposableLambdaImpl$invoke$4 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f2904j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f2905k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f2906l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f2907m;
    public final /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2908o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$4(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f2904j = composableLambdaImpl;
        this.f2905k = obj;
        this.f2906l = obj2;
        this.f2907m = obj3;
        this.n = obj4;
        this.f2908o = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        d dVar2 = dVar;
        num.intValue();
        g.f(dVar2, "nc");
        this.f2904j.d(this.f2905k, this.f2906l, this.f2907m, this.n, dVar2, this.f2908o | 1);
        return n.f16010a;
    }
}
