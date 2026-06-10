package androidx.compose.foundation;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.g;
import o1.i;
import o1.o;
import u7.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/o;", "Lm7/n;", "invoke", "(Lo1/o;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f1446j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f1447k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1448l = null;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f1449m = null;
    public final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f1450o;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ u7.a<n> f1451j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u7.a<n> aVar) {
            super(0);
            this.f1451j = aVar;
        }

        @Override // u7.a
        public final Boolean k0() {
            this.f1451j.k0();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends Lambda implements u7.a<Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ u7.a<n> f1452j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(u7.a<n> aVar) {
            super(0);
            this.f1452j = aVar;
        }

        @Override // u7.a
        public final Boolean k0() {
            this.f1452j.k0();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$clickSemantics$1(g gVar, String str, boolean z10, u7.a aVar) {
        super(1);
        this.f1446j = gVar;
        this.f1447k = str;
        this.n = z10;
        this.f1450o = aVar;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        v7.g.f(oVar2, "$this$semantics");
        g gVar = this.f1446j;
        if (gVar != null) {
            o1.n.b(oVar2, gVar.f16190a);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1450o);
        j<Object>[] jVarArr = o1.n.f16212a;
        oVar2.c(i.f16194b, new o1.a(this.f1447k, anonymousClass1));
        u7.a<n> aVar = this.f1448l;
        if (aVar != null) {
            oVar2.c(i.c, new o1.a(this.f1449m, new AnonymousClass2(aVar)));
        }
        if (!this.n) {
            oVar2.c(SemanticsProperties.f3953i, n.f16010a);
        }
        return n.f16010a;
    }
}
