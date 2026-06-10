package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.d;
import g0.r0;
import g0.t0;
import g0.u0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "", "data", "Lm7/n;", "invoke", "(ILjava/lang/Object;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$deactivateToEndGroup$2 extends Lambda implements p<Integer, Object, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f2677j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2678k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "rememberManager", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends Lambda implements q<g0.c<?>, z0, t0, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f2679j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f2680k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f2681l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, int i11, Object obj) {
            super(3);
            this.f2679j = obj;
            this.f2680k = i10;
            this.f2681l = i11;
        }

        @Override // u7.q
        public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
            z0 z0Var2 = z0Var;
            t0 t0Var2 = t0Var;
            androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var2, "rememberManager");
            int i10 = this.f2680k;
            int i11 = this.f2681l;
            Object I = z0Var2.I(i10, i11);
            Object obj = this.f2679j;
            if (v7.g.a(obj, I)) {
                t0Var2.b((u0) obj);
                z0Var2.F(i11, d.a.f11039a);
                return n.f16010a;
            }
            ComposerKt.c("Slot table is out of sync".toString());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends Lambda implements q<g0.c<?>, z0, t0, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f2682j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f2683k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f2684l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i10, int i11, Object obj) {
            super(3);
            this.f2682j = obj;
            this.f2683k = i10;
            this.f2684l = i11;
        }

        @Override // u7.q
        public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
            z0 z0Var2 = z0Var;
            androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
            int i10 = this.f2683k;
            int i11 = this.f2684l;
            if (v7.g.a(this.f2682j, z0Var2.I(i10, i11))) {
                z0Var2.F(i11, d.a.f11039a);
                return n.f16010a;
            }
            ComposerKt.c("Slot table is out of sync".toString());
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$deactivateToEndGroup$2(ComposerImpl composerImpl, int i10) {
        super(2);
        this.f2677j = composerImpl;
        this.f2678k = i10;
    }

    @Override // u7.p
    public final n R(Integer num, Object obj) {
        q<? super g0.c<?>, ? super z0, ? super t0, n> anonymousClass2;
        int intValue = num.intValue();
        boolean z10 = obj instanceof u0;
        int i10 = this.f2678k;
        ComposerImpl composerImpl = this.f2677j;
        if (z10) {
            composerImpl.D.n(i10);
            anonymousClass2 = new AnonymousClass1(i10, intValue, obj);
        } else {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                b bVar = r0Var.f11072b;
                if (bVar != null) {
                    bVar.f2861v = true;
                    r0Var.f11072b = null;
                    r0Var.f11075f = null;
                    r0Var.f11076g = null;
                }
                composerImpl.D.n(i10);
                anonymousClass2 = new AnonymousClass2(i10, intValue, obj);
            }
            return n.f16010a;
        }
        composerImpl.m0(false, anonymousClass2);
        return n.f16010a;
    }
}
