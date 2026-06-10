package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import androidx.datastore.preferences.PreferencesProto$Value;
import h9.c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import ma.i;

/* loaded from: classes.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.n, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.f13297o, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.f13298p, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.f13299q, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.f13300r, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.f13301s, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.f13302t, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.f13303u, "double", "D", "java.lang.Double");
    

    /* renamed from: u */
    public static final HashSet f14723u = new HashSet();

    /* renamed from: v */
    public static final HashMap f14724v = new HashMap();

    /* renamed from: w */
    public static final EnumMap f14725w = new EnumMap(PrimitiveType.class);

    /* renamed from: x */
    public static final HashMap f14726x = new HashMap();

    /* renamed from: i */
    public final PrimitiveType f14728i;

    /* renamed from: j */
    public final String f14729j;

    /* renamed from: k */
    public final String f14730k;

    /* renamed from: l */
    public final c f14731l;

    static {
        JvmPrimitiveType[] values;
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f14723u.add(jvmPrimitiveType.k());
            HashMap hashMap = f14724v;
            String str = jvmPrimitiveType.f14729j;
            if (str != null) {
                hashMap.put(str, jvmPrimitiveType);
                f14725w.put((EnumMap) jvmPrimitiveType.j(), (PrimitiveType) jvmPrimitiveType);
                f14726x.put(jvmPrimitiveType.i(), jvmPrimitiveType);
            } else {
                a(11);
                throw null;
            }
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            a(6);
            throw null;
        }
        this.f14728i = primitiveType;
        this.f14729j = str;
        this.f14730k = str2;
        this.f14731l = new c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case i.f16047o /* 10 */:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 2 && i10 != 4) {
                switch (i10) {
                    case i.f16047o /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[0] = "name";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case i.f16047o /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[0] = "type";
                        break;
                    case 5:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case 6:
                        objArr[0] = "primitiveType";
                        break;
                    case i.f16046m /* 9 */:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i10 == 2 && i10 != 4) {
                    switch (i10) {
                        case i.f16047o /* 10 */:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i10) {
                    case 1:
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        objArr[2] = "get";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case i.f16047o /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case 5:
                        objArr[2] = "getByDesc";
                        break;
                    case 6:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case i.f16046m /* 9 */:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 2 && i10 != 4) {
                    switch (i10) {
                        case i.f16047o /* 10 */:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 2) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 2) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 2) {
            }
            objArr[1] = "get";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 == 2) {
        }
        objArr[1] = "get";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 2) {
        }
        throw new IllegalStateException(format222);
    }

    public static JvmPrimitiveType b(String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) f14724v.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String i() {
        String str = this.f14730k;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public final PrimitiveType j() {
        PrimitiveType primitiveType = this.f14728i;
        if (primitiveType != null) {
            return primitiveType;
        }
        a(10);
        throw null;
    }

    public final c k() {
        c cVar = this.f14731l;
        if (cVar != null) {
            return cVar;
        }
        a(13);
        throw null;
    }
}
