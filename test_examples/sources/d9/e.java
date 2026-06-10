package d9;

import androidx.datastore.preferences.PreferencesProto$Value;
import d9.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f10459a = new e();

    public static d a(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        d bVar;
        boolean z10;
        v7.g.f(str, "representation");
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                jvmPrimitiveType = values[i10];
                if (jvmPrimitiveType.i().charAt(0) == charAt) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i10++;
            } else {
                jvmPrimitiveType = null;
                break;
            }
        }
        if (jvmPrimitiveType != null) {
            return new d.c(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new d.c(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            v7.g.e(substring, "this as java.lang.String).substring(startIndex)");
            bVar = new d.a(a(substring));
        } else {
            if (charAt == 'L' && str.length() > 0) {
                a1.b.M(str.charAt(kotlin.text.b.a1(str)), ';', false);
            }
            String substring2 = str.substring(1, str.length() - 1);
            v7.g.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new d.b(substring2);
        }
        return bVar;
    }

    public static String e(d dVar) {
        StringBuilder sb;
        String i10;
        v7.g.f(dVar, "type");
        if (dVar instanceof d.a) {
            sb = new StringBuilder("[");
            sb.append(e(((d.a) dVar).f10456i));
        } else if (dVar instanceof d.c) {
            JvmPrimitiveType jvmPrimitiveType = ((d.c) dVar).f10458i;
            return (jvmPrimitiveType == null || (i10 = jvmPrimitiveType.i()) == null) ? "V" : i10;
        } else if (!(dVar instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            sb = new StringBuilder("L");
            sb.append(((d.b) dVar).f10457i);
            sb.append(';');
        }
        return sb.toString();
    }

    public final d.b b(String str) {
        v7.g.f(str, "internalName");
        return new d.b(str);
    }

    public final d.c c(PrimitiveType primitiveType) {
        switch (primitiveType.ordinal()) {
            case 0:
                return d.f10449a;
            case 1:
                return d.f10450b;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return d.c;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return d.f10451d;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return d.f10452e;
            case 5:
                return d.f10453f;
            case 6:
                return d.f10454g;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return d.f10455h;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final d.b d() {
        return new d.b("java/lang/Class");
    }

    public final /* bridge */ /* synthetic */ String f(Object obj) {
        return e((d) obj);
    }
}
