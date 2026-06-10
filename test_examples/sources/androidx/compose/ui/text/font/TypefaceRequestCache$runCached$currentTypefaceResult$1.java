package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u1.w;
import u1.x;
import u1.y;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/y;", "finalResult", "Lm7/n;", "invoke", "(Lu1/y;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements l<y, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x f4116j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ w f4117k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(x xVar, w wVar) {
        super(1);
        this.f4116j = xVar;
        this.f4117k = wVar;
    }

    @Override // u7.l
    public final n U(y yVar) {
        y yVar2 = yVar;
        g.f(yVar2, "finalResult");
        x xVar = this.f4116j;
        m0.b bVar = xVar.f17772a;
        w wVar = this.f4117k;
        synchronized (bVar) {
            if (yVar2.e()) {
                xVar.f17773b.b(wVar, yVar2);
            } else {
                xVar.f17773b.c(wVar);
            }
        }
        return n.f16010a;
    }
}
