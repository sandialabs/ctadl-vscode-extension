package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.f0;
import g0.t0;
import g0.w0;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f2694j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<q<g0.c<?>, z0, t0, n>> f2695k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ w0 f2696l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ f0 f2697m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1(ComposerImpl composerImpl, ArrayList arrayList, w0 w0Var, f0 f0Var) {
        super(0);
        this.f2694j = composerImpl;
        this.f2695k = arrayList;
        this.f2696l = w0Var;
        this.f2697m = f0Var;
    }

    @Override // u7.a
    public final n k0() {
        List<q<g0.c<?>, z0, t0, n>> list = this.f2695k;
        w0 w0Var = this.f2696l;
        f0 f0Var = this.f2697m;
        ComposerImpl composerImpl = this.f2694j;
        List<q<g0.c<?>, z0, t0, n>> list2 = composerImpl.f2643e;
        try {
            composerImpl.f2643e = list;
            w0 w0Var2 = composerImpl.D;
            int[] iArr = composerImpl.n;
            composerImpl.n = null;
            composerImpl.D = w0Var;
            ComposerImpl.E(composerImpl, f0Var.f11044a, f0Var.f11049g, f0Var.f11045b);
            n nVar = n.f16010a;
            composerImpl.D = w0Var2;
            composerImpl.n = iArr;
            composerImpl.f2643e = list2;
            return n.f16010a;
        } catch (Throwable th) {
            composerImpl.f2643e = list2;
            throw th;
        }
    }
}
