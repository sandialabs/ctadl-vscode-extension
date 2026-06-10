package g9;

import androidx.datastore.preferences.PreferencesProto$Value;
import ma.i;

/* loaded from: classes.dex */
public final class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i10 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i10 == 3) {
            objArr[1] = "encode8to7";
        } else if (i10 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i10 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i10 == 10) {
            objArr[1] = "dropMarker";
        } else if (i10 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i10 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i10) {
            case 1:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 6:
            case 8:
            case i.f16047o /* 10 */:
            case 12:
            case 14:
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[2] = "encode8to7";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "decodeBytes";
                break;
            case i.f16046m /* 9 */:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 12 && i10 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static byte[] b(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    strArr2[0] = strArr2[0].substring(1);
                    int i10 = 0;
                    for (String str : strArr2) {
                        i10 += str.length();
                    }
                    byte[] bArr = new byte[i10];
                    int i11 = 0;
                    for (String str2 : strArr2) {
                        int length = str2.length();
                        int i12 = 0;
                        while (i12 < length) {
                            bArr[i11] = (byte) str2.charAt(i12);
                            i12++;
                            i11++;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = (String[]) strArr.clone();
                    strArr[0] = strArr[0].substring(1);
                }
            }
            int i13 = 0;
            for (String str3 : strArr) {
                i13 += str3.length();
            }
            byte[] bArr2 = new byte[i13];
            int i14 = 0;
            for (String str4 : strArr) {
                int length2 = str4.length();
                int i15 = 0;
                while (i15 < length2) {
                    bArr2[i14] = (byte) str4.charAt(i15);
                    i15++;
                    i14++;
                }
            }
            for (int i16 = 0; i16 < i13; i16++) {
                bArr2[i16] = (byte) ((bArr2[i16] + Byte.MAX_VALUE) & 127);
            }
            int i17 = (i13 * 7) / 8;
            byte[] bArr3 = new byte[i17];
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < i17; i20++) {
                i18++;
                int i21 = i19 + 1;
                bArr3[i20] = (byte) (((bArr2[i18] & 255) >>> i19) + ((bArr2[i18] & ((1 << i21) - 1)) << (7 - i19)));
                if (i19 == 6) {
                    i18++;
                    i19 = 0;
                } else {
                    i19 = i21;
                }
            }
            return bArr3;
        }
        a(7);
        throw null;
    }
}
