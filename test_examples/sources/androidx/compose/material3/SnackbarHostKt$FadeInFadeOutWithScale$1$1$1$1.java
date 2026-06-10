package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import e0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.e;
import o1.i;
import o1.o;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f2408j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ m f2409j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar) {
            super(0);
            this.f2409j = mVar;
        }

        @Override // u7.a
        public final Boolean k0() {
            this.f2409j.dismiss();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1(m mVar) {
        super(1);
        this.f2408j = mVar;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        g.f(oVar2, "$this$semantics");
        o1.n.f16213b.a(oVar2, o1.n.f16212a[3], new e());
        oVar2.c(i.f16204m, new o1.a(null, new AnonymousClass1(this.f2408j)));
        return n.f16010a;
    }
}
