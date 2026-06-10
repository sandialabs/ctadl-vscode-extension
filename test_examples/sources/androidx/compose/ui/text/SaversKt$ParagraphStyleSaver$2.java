package androidx.compose.ui.text;

import a2.f;
import a2.j;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p1.h;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp1/h;", "invoke", "(Ljava/lang/Object;)Lp1/h;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements l<Object, h> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$2 f4037j = new SaversKt$ParagraphStyleSaver$2();

    public SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final h U(Object obj) {
        f fVar;
        a2.h hVar;
        i iVar;
        Object obj2;
        o0.f fVar2;
        j jVar;
        g.f(obj, "it");
        List list = (List) obj;
        Object obj3 = list.get(0);
        if (obj3 != null) {
            fVar = (f) obj3;
        } else {
            fVar = null;
        }
        Object obj4 = list.get(1);
        if (obj4 != null) {
            hVar = (a2.h) obj4;
        } else {
            hVar = null;
        }
        Object obj5 = list.get(2);
        b2.j[] jVarArr = i.f6347b;
        o0.f fVar3 = SaversKt.f4014p;
        Boolean bool = Boolean.FALSE;
        if (!g.a(obj5, bool) && obj5 != null) {
            iVar = (i) fVar3.f16183b.U(obj5);
            g.c(iVar);
            long j2 = iVar.f6348a;
            obj2 = list.get(3);
            j jVar2 = j.c;
            fVar2 = SaversKt.f4009j;
            if (!g.a(obj2, bool) && obj2 != null) {
                jVar = (j) fVar2.f16183b.U(obj2);
                return new h(fVar, hVar, j2, jVar, null, null, null);
            }
            jVar = null;
            return new h(fVar, hVar, j2, jVar, null, null, null);
        }
        iVar = null;
        g.c(iVar);
        long j22 = iVar.f6348a;
        obj2 = list.get(3);
        j jVar22 = j.c;
        fVar2 = SaversKt.f4009j;
        if (!g.a(obj2, bool)) {
            jVar = (j) fVar2.f16183b.U(obj2);
            return new h(fVar, hVar, j22, jVar, null, null, null);
        }
        jVar = null;
        return new h(fVar, hVar, j22, jVar, null, null, null);
    }
}
