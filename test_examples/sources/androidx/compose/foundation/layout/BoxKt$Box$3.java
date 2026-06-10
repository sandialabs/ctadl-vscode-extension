package androidx.compose.foundation.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BoxKt$Box$3 extends Lambda implements p<d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.d f1888j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f1889k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxKt$Box$3(q0.d dVar, int i10) {
        super(2);
        this.f1888j = dVar;
        this.f1889k = i10;
    }

    @Override // u7.p
    public final n R(d dVar, Integer num) {
        num.intValue();
        BoxKt.a(this.f1888j, dVar, this.f1889k | 1);
        return n.f16010a;
    }
}
