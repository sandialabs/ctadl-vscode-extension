package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Recomposer$performRecompose$1$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h0.c<Object> f2802j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l f2803k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(l lVar, h0.c cVar) {
        super(0);
        this.f2802j = cVar;
        this.f2803k = lVar;
    }

    @Override // u7.a
    public final n k0() {
        h0.c<Object> cVar = this.f2802j;
        int i10 = cVar.f11325i;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2803k.g(cVar.get(i11));
        }
        return n.f16010a;
    }
}
