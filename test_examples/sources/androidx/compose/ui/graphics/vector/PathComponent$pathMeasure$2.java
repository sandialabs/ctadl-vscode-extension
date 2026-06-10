package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;
import v0.b0;
import v0.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv0/b0;", "invoke", "()Lv0/b0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class PathComponent$pathMeasure$2 extends Lambda implements a<b0> {

    /* renamed from: j  reason: collision with root package name */
    public static final PathComponent$pathMeasure$2 f3161j = new PathComponent$pathMeasure$2();

    public PathComponent$pathMeasure$2() {
        super(0);
    }

    @Override // u7.a
    public final b0 k0() {
        return new i(new PathMeasure());
    }
}
