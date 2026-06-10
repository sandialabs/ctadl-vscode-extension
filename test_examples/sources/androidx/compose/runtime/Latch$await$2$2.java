package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.z;
import ja.i;
import ja.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z f2763j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i<n> f2764k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(z zVar, j jVar) {
        super(1);
        this.f2763j = zVar;
        this.f2764k = jVar;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        z zVar = this.f2763j;
        Object obj = zVar.f11116a;
        i<n> iVar = this.f2764k;
        synchronized (obj) {
            zVar.f11117b.remove(iVar);
        }
        return n.f16010a;
    }
}
