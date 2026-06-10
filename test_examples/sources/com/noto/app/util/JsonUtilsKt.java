package com.noto.app.util;

import v7.g;
import va.a;
import va.c;
import va.e;
import va.j;

/* loaded from: classes.dex */
public final class JsonUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final j f9819a;

    static {
        JsonUtilsKt$NotoDefaultJson$1 jsonUtilsKt$NotoDefaultJson$1 = JsonUtilsKt$NotoDefaultJson$1.f9820j;
        a.C0233a c0233a = a.f18190d;
        g.f(c0233a, "from");
        g.f(jsonUtilsKt$NotoDefaultJson$1, "builderAction");
        c cVar = new c(c0233a);
        jsonUtilsKt$NotoDefaultJson$1.U(cVar);
        if (cVar.f18204i && !g.a(cVar.f18205j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        boolean z10 = cVar.f18201f;
        String str = cVar.f18202g;
        if (!z10) {
            if (!g.a(str, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!g.a(str, "    ")) {
            boolean z11 = false;
            int i10 = 0;
            while (true) {
                boolean z12 = true;
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z12 = false;
                    }
                    i10++;
                } else {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
            }
        }
        f9819a = new j(new e(cVar.f18197a, cVar.c, cVar.f18199d, cVar.f18200e, cVar.f18201f, cVar.f18198b, cVar.f18202g, cVar.f18203h, cVar.f18204i, cVar.f18205j, cVar.f18206k, cVar.f18207l), cVar.f18208m);
    }
}
