package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v0.m;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$6 extends Lambda implements p<PathComponent, m, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$6 f3206j = new VectorComposeKt$Path$2$6();

    public VectorComposeKt$Path$2$6() {
        super(2);
    }

    @Override // u7.p
    public final n R(PathComponent pathComponent, m mVar) {
        PathComponent pathComponent2 = pathComponent;
        g.f(pathComponent2, "$this$set");
        pathComponent2.f3147g = mVar;
        pathComponent2.c();
        return n.f16010a;
    }
}
