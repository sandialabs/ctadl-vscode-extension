package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg0/g1;", "it", "Lm7/n;", "invoke", "(Lg0/g1;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$doCompose$2$3 extends Lambda implements l<g1<?>, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f2685j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$doCompose$2$3(ComposerImpl composerImpl) {
        super(1);
        this.f2685j = composerImpl;
    }

    @Override // u7.l
    public final n U(g1<?> g1Var) {
        v7.g.f(g1Var, "it");
        this.f2685j.f2663z++;
        return n.f16010a;
    }
}
