package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import b2.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb2/g;", "it", "Lr/g;", "invoke--gyyYBs", "(J)Lr/g;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class VectorConvertersKt$IntOffsetToVector$1 extends Lambda implements l<g, r.g> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorConvertersKt$IntOffsetToVector$1 f1341j = new VectorConvertersKt$IntOffsetToVector$1();

    public VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    @Override // u7.l
    public final r.g U(g gVar) {
        long j2 = gVar.f6345a;
        return new r.g((int) (j2 >> 32), g.a(j2));
    }
}
