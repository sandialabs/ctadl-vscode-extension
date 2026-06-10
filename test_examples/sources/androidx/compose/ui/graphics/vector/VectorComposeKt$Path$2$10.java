package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v0.j0;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$10 extends Lambda implements p<PathComponent, j0, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$10 f3197j = new VectorComposeKt$Path$2$10();

    public VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // u7.p
    public final n R(PathComponent pathComponent, j0 j0Var) {
        PathComponent pathComponent2 = pathComponent;
        int i10 = j0Var.f18119a;
        g.f(pathComponent2, "$this$set");
        pathComponent2.f3148h = i10;
        pathComponent2.f3154o = true;
        pathComponent2.c();
        return n.f16010a;
    }
}
