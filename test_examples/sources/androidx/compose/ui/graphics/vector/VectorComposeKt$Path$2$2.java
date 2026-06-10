package androidx.compose.ui.graphics.vector;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;
import z0.d;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$2 extends Lambda implements p<PathComponent, List<? extends d>, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$2 f3202j = new VectorComposeKt$Path$2$2();

    public VectorComposeKt$Path$2$2() {
        super(2);
    }

    @Override // u7.p
    public final n R(PathComponent pathComponent, List<? extends d> list) {
        PathComponent pathComponent2 = pathComponent;
        List<? extends d> list2 = list;
        g.f(pathComponent2, "$this$set");
        g.f(list2, "it");
        pathComponent2.f3144d = list2;
        pathComponent2.n = true;
        pathComponent2.c();
        return n.f16010a;
    }
}
