package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v0.m;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx0/c;", "Lm7/n;", "invoke", "(Lx0/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class BorderKt$drawRectBorder$1 extends Lambda implements l<x0.c, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m f1403j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f1404k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ long f1405l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ k f1406m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRectBorder$1(m mVar, long j2, long j10, k kVar) {
        super(1);
        this.f1403j = mVar;
        this.f1404k = j2;
        this.f1405l = j10;
        this.f1406m = kVar;
    }

    @Override // u7.l
    public final n U(x0.c cVar) {
        x0.c cVar2 = cVar;
        g.f(cVar2, "$this$onDrawWithContent");
        cVar2.o0();
        x0.e.d(cVar2, this.f1403j, this.f1404k, this.f1405l, 0.0f, this.f1406m, 104);
        return n.f16010a;
    }
}
