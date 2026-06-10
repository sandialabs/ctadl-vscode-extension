package wa;

import kotlinx.serialization.json.internal.WriteMode;

/* loaded from: classes.dex */
public final class l {
    public static final void a(va.a aVar, m mVar, qa.b bVar, t6.f fVar) {
        f fVar2;
        v7.g.f(aVar, "<this>");
        v7.g.f(bVar, "serializer");
        WriteMode writeMode = WriteMode.OBJ;
        va.i[] iVarArr = new va.i[WriteMode.values().length];
        if (aVar.f18191a.f18212e) {
            fVar2 = new i(mVar, aVar);
        } else {
            fVar2 = new f(mVar);
        }
        new s(fVar2, aVar, writeMode, iVarArr).a0(bVar, fVar);
    }
}
