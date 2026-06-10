package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "applier", "Lg0/z0;", "<anonymous parameter 1>", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$3 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f2700j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<Object> f2701k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$3(Ref$IntRef ref$IntRef, ArrayList arrayList) {
        super(3);
        this.f2700j = ref$IntRef;
        this.f2701k = arrayList;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        g0.c<?> cVar2 = cVar;
        androidx.activity.e.p(cVar2, "applier", z0Var, "<anonymous parameter 1>", t0Var, "<anonymous parameter 2>");
        int i10 = this.f2700j.f13058i;
        List<Object> list = this.f2701k;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            cVar2.b(i12, obj);
            cVar2.e(i12, obj);
        }
        return n.f16010a;
    }
}
