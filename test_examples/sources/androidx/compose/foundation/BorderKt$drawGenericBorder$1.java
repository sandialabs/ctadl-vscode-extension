package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v0.m;
import v0.x;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/c;", "Lm7/n;", "invoke", "(Lx0/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class BorderKt$drawGenericBorder$1 extends Lambda implements l<x0.c, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x.a f1401j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m f1402k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$1(x.a aVar, m mVar) {
        super(1);
        this.f1401j = aVar;
        this.f1402k = mVar;
    }

    @Override // u7.l
    public final n U(x0.c cVar) {
        x0.c cVar2 = cVar;
        g.f(cVar2, "$this$onDrawWithContent");
        cVar2.o0();
        this.f1401j.getClass();
        x0.e.c(cVar2, null, this.f1402k, 0.0f, null, 60);
        return n.f16010a;
    }
}
