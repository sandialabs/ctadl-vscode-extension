package kotlin.reflect.jvm.internal.impl.name;

import h9.c;
import ha.i;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(String str) {
        State state = State.BEGINNING;
        int i10 = 0;
        while (true) {
            int length = str.length();
            State state2 = State.AFTER_DOT;
            if (i10 >= length) {
                return state != state2;
            }
            char charAt = str.charAt(i10);
            int ordinal = state.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                    }
                } else if (charAt == '.') {
                    state = state2;
                } else if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                i10++;
            }
            if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
            state = State.MIDDLE;
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0.charAt(r2.length()) == '.') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c b(c cVar, c cVar2) {
        boolean z10;
        g.f(cVar, "<this>");
        g.f(cVar2, "prefix");
        if (!g.a(cVar, cVar2) && !cVar2.d()) {
            String b5 = cVar.b();
            g.e(b5, "this.asString()");
            String b10 = cVar2.b();
            g.e(b10, "packageName.asString()");
            z10 = false;
            if (i.X0(b5, b10, false)) {
            }
            if (z10 && !cVar2.d()) {
                if (!g.a(cVar, cVar2)) {
                    c cVar3 = c.c;
                    g.e(cVar3, "ROOT");
                    return cVar3;
                }
                String b11 = cVar.b();
                g.e(b11, "asString()");
                String substring = b11.substring(cVar2.b().length() + 1);
                g.e(substring, "this as java.lang.String).substring(startIndex)");
                return new c(substring);
            }
            return cVar;
        }
        z10 = true;
        if (z10) {
            if (!g.a(cVar, cVar2)) {
            }
        } else {
            return cVar;
        }
    }
}
