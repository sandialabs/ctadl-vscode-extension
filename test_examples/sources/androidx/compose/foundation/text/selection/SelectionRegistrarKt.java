package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import b0.b;
import b0.c;
import g0.r;
import java.util.Map;

/* loaded from: classes.dex */
public final class SelectionRegistrarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final r f2125a = CompositionLocalKt.b(SelectionRegistrarKt$LocalSelectionRegistrar$1.f2126j);

    public static final boolean a(c cVar, long j2) {
        Map<Long, b> c;
        if (cVar == null || (c = cVar.c()) == null) {
            return false;
        }
        return c.containsKey(Long.valueOf(j2));
    }
}
