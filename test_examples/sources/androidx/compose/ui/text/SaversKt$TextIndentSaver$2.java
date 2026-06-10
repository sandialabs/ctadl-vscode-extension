package androidx.compose.ui.text;

import a2.j;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.f;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "La2/j;", "invoke", "(Ljava/lang/Object;)La2/j;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$TextIndentSaver$2 extends Lambda implements l<Object, j> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$TextIndentSaver$2 f4047j = new SaversKt$TextIndentSaver$2();

    public SaversKt$TextIndentSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final j U(Object obj) {
        i iVar;
        Object obj2;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj3 = list.get(0);
        b2.j[] jVarArr = i.f6347b;
        f fVar = SaversKt.f4014p;
        Boolean bool = Boolean.FALSE;
        i iVar2 = null;
        if (!g.a(obj3, bool) && obj3 != null) {
            iVar = (i) fVar.f16183b.U(obj3);
            g.c(iVar);
            obj2 = list.get(1);
            if (!g.a(obj2, bool) && obj2 != null) {
                iVar2 = (i) fVar.f16183b.U(obj2);
            }
            g.c(iVar2);
            return new j(iVar.f6348a, iVar2.f6348a);
        }
        iVar = null;
        g.c(iVar);
        obj2 = list.get(1);
        if (!g.a(obj2, bool)) {
            iVar2 = (i) fVar.f16183b.U(obj2);
        }
        g.c(iVar2);
        return new j(iVar.f6348a, iVar2.f6348a);
    }
}
