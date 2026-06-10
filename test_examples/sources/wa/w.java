package wa;

import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.internal.WriteMode;
import sa.h;

/* loaded from: classes.dex */
public final class w {
    public static final sa.e a(sa.e eVar, androidx.datastore.preferences.protobuf.k kVar) {
        sa.e eVar2;
        sa.e a10;
        qa.b w02;
        v7.g.f(eVar, "<this>");
        v7.g.f(kVar, "module");
        if (v7.g.a(eVar.h(), h.a.f17530a)) {
            c8.b R = a1.b.R(eVar);
            if (R != null && (w02 = kVar.w0(R, EmptyList.f12981i)) != null) {
                eVar2 = w02.a();
            } else {
                eVar2 = null;
            }
            if (eVar2 != null && (a10 = a(eVar2, kVar)) != null) {
                return a10;
            }
            return eVar;
        } else if (eVar.i()) {
            return a(eVar.j(0), kVar);
        } else {
            return eVar;
        }
    }

    public static final WriteMode b(sa.e eVar, va.a aVar) {
        v7.g.f(aVar, "<this>");
        v7.g.f(eVar, "desc");
        sa.h h10 = eVar.h();
        if (h10 instanceof sa.c) {
            return WriteMode.POLY_OBJ;
        }
        boolean a10 = v7.g.a(h10, b.C0175b.f15610a);
        WriteMode writeMode = WriteMode.LIST;
        if (!a10) {
            if (v7.g.a(h10, b.c.f15611a)) {
                sa.e a11 = a(eVar.j(0), aVar.f18192b);
                sa.h h11 = a11.h();
                if (!(h11 instanceof sa.d) && !v7.g.a(h11, h.b.f17531a)) {
                    if (!aVar.f18191a.f18211d) {
                        throw a1.c.p(a11);
                    }
                }
                return WriteMode.MAP;
            }
            return WriteMode.OBJ;
        }
        return writeMode;
    }
}
