package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$8 extends Lambda implements p<PathComponent, Float, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$8 f3208j = new VectorComposeKt$Path$2$8();

    public VectorComposeKt$Path$2$8() {
        super(2);
    }

    @Override // u7.p
    public final n R(PathComponent pathComponent, Float f10) {
        PathComponent pathComponent2 = pathComponent;
        float floatValue = f10.floatValue();
        g.f(pathComponent2, "$this$set");
        pathComponent2.f3146f = floatValue;
        pathComponent2.c();
        return n.f16010a;
    }
}
