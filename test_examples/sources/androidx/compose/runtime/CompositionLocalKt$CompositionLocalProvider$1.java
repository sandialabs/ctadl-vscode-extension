package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.p0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p0<?>[] f2752j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2753k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f2754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalKt$CompositionLocalProvider$1(p0<?>[] p0VarArr, p<? super g0.d, ? super Integer, n> pVar, int i10) {
        super(2);
        this.f2752j = p0VarArr;
        this.f2753k = pVar;
        this.f2754l = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        p0<?>[] p0VarArr = this.f2752j;
        CompositionLocalKt.a((p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length), this.f2753k, dVar, this.f2754l | 1);
        return n.f16010a;
    }
}
