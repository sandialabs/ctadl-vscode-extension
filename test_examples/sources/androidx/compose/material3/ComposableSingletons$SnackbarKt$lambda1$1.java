package androidx.compose.material3;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;
import v0.i0;
import v0.r;
import z0.c;
import z0.d;
import z0.j;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "(Lg0/d;I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarKt$lambda1$1 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarKt$lambda1$1 f2304j = new ComposableSingletons$SnackbarKt$lambda1$1();

    public ComposableSingletons$SnackbarKt$lambda1$1() {
        super(2);
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        g0.d dVar2 = dVar;
        if ((num.intValue() & 11) == 2 && dVar2.s()) {
            dVar2.e();
            return n.f16010a;
        }
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        z0.c cVar = a1.c.f70g;
        if (cVar == null) {
            c.a aVar = new c.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, r.f18133g, 5, false);
            EmptyList emptyList = j.f19079a;
            i0 i0Var = new i0(r.f18129b);
            j0.c cVar2 = new j0.c(2);
            ((List) cVar2.f12625b).add(new d.f(19.0f, 6.41f));
            cVar2.b(17.59f, 5.0f);
            cVar2.b(12.0f, 10.59f);
            cVar2.b(6.41f, 5.0f);
            cVar2.b(5.0f, 6.41f);
            cVar2.b(10.59f, 12.0f);
            cVar2.b(5.0f, 17.59f);
            cVar2.b(6.41f, 19.0f);
            cVar2.b(12.0f, 13.41f);
            cVar2.b(17.59f, 19.0f);
            cVar2.b(19.0f, 17.59f);
            cVar2.b(13.41f, 12.0f);
            ((List) cVar2.f12625b).add(d.b.c);
            n nVar = n.f16010a;
            aVar.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, i0Var, null, "", (List) cVar2.f12625b);
            cVar = aVar.c();
            a1.c.f70g = cVar;
        }
        IconKt.b(cVar, null, null, 0L, dVar2, 48, 12);
        return n.f16010a;
    }
}
