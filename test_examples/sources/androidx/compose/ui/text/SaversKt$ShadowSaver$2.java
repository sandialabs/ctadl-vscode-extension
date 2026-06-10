package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import u0.c;
import u7.l;
import v0.g0;
import v0.r;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lv0/g0;", "invoke", "(Ljava/lang/Object;)Lv0/g0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$ShadowSaver$2 extends Lambda implements l<Object, g0> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$ShadowSaver$2 f4039j = new SaversKt$ShadowSaver$2();

    public SaversKt$ShadowSaver$2() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g0 U(Object obj) {
        r rVar;
        Object obj2;
        f fVar;
        c cVar;
        Object obj3;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj4 = list.get(0);
        int i10 = r.f18134h;
        f fVar2 = SaversKt.f4013o;
        Boolean bool = Boolean.FALSE;
        Float f10 = null;
        if (!g.a(obj4, bool) && obj4 != null) {
            rVar = (r) fVar2.f16183b.U(obj4);
            g.c(rVar);
            long j2 = rVar.f18135a;
            obj2 = list.get(1);
            int i11 = c.f17723e;
            fVar = SaversKt.f4015q;
            if (!g.a(obj2, bool) && obj2 != null) {
                cVar = (c) fVar.f16183b.U(obj2);
                g.c(cVar);
                long j10 = cVar.f17724a;
                obj3 = list.get(2);
                if (obj3 != null) {
                    f10 = (Float) obj3;
                }
                g.c(f10);
                return new g0(j2, j10, f10.floatValue());
            }
            cVar = null;
            g.c(cVar);
            long j102 = cVar.f17724a;
            obj3 = list.get(2);
            if (obj3 != null) {
            }
            g.c(f10);
            return new g0(j2, j102, f10.floatValue());
        }
        rVar = null;
        g.c(rVar);
        long j22 = rVar.f18135a;
        obj2 = list.get(1);
        int i112 = c.f17723e;
        fVar = SaversKt.f4015q;
        if (!g.a(obj2, bool)) {
            cVar = (c) fVar.f16183b.U(obj2);
            g.c(cVar);
            long j1022 = cVar.f17724a;
            obj3 = list.get(2);
            if (obj3 != null) {
            }
            g.c(f10);
            return new g0(j22, j1022, f10.floatValue());
        }
        cVar = null;
        g.c(cVar);
        long j10222 = cVar.f17724a;
        obj3 = list.get(2);
        if (obj3 != null) {
        }
        g.c(f10);
        return new g0(j22, j10222, f10.floatValue());
    }
}
