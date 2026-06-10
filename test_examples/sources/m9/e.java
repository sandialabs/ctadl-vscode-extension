package m9;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes.dex */
public final class e extends l {
    public e(char c) {
        super(Character.valueOf(c));
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        v7.g.f(sVar, "module");
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = sVar.u();
        u10.getClass();
        y9.v t10 = u10.t(PrimitiveType.f13297o);
        if (t10 != null) {
            return t10;
        }
        kotlin.reflect.jvm.internal.impl.builtins.e.a(62);
        throw null;
    }

    @Override // m9.g
    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        T t10 = this.f16022a;
        boolean z10 = false;
        objArr[0] = Integer.valueOf(((Character) t10).charValue());
        char charValue = ((Character) t10).charValue();
        if (charValue == '\b') {
            str = "\\b";
        } else if (charValue == '\t') {
            str = "\\t";
        } else if (charValue == '\n') {
            str = "\\n";
        } else if (charValue == '\f') {
            str = "\\f";
        } else if (charValue == '\r') {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                z10 = true;
            }
            if (z10) {
                str = String.valueOf(charValue);
            } else {
                str = "?";
            }
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        v7.g.e(format, "format(this, *args)");
        return format;
    }
}
