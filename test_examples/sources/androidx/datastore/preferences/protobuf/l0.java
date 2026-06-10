package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class l0<T> implements w0<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f4901r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f4902s = f1.o();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4903a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4904b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4905d;

    /* renamed from: e  reason: collision with root package name */
    public final i0 f4906e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4907f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4908g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4909h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4910i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f4911j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4912k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4913l;

    /* renamed from: m  reason: collision with root package name */
    public final n0 f4914m;
    public final z n;

    /* renamed from: o  reason: collision with root package name */
    public final b1<?, ?> f4915o;

    /* renamed from: p  reason: collision with root package name */
    public final n<?> f4916p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f4917q;

    public l0(int[] iArr, Object[] objArr, int i10, int i11, i0 i0Var, boolean z10, int[] iArr2, int i12, int i13, n0 n0Var, z zVar, b1 b1Var, n nVar, d0 d0Var) {
        this.f4903a = iArr;
        this.f4904b = objArr;
        this.c = i10;
        this.f4905d = i11;
        this.f4908g = i0Var instanceof GeneratedMessageLite;
        this.f4909h = z10;
        this.f4907f = nVar != null && nVar.e(i0Var);
        this.f4910i = false;
        this.f4911j = iArr2;
        this.f4912k = i12;
        this.f4913l = i13;
        this.f4914m = n0Var;
        this.n = zVar;
        this.f4915o = b1Var;
        this.f4916p = nVar;
        this.f4906e = i0Var;
        this.f4917q = d0Var;
    }

    public static Field C(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder p10 = a4.b.p("Field ", str, " for ");
            p10.append(cls.getName());
            p10.append(" not found. Known fields are ");
            p10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(p10.toString());
        }
    }

    public static void I(int i10, Object obj, i iVar) {
        if (obj instanceof String) {
            iVar.f4897a.y1((String) obj, i10);
            return;
        }
        iVar.b(i10, (ByteString) obj);
    }

    public static List s(long j2, Object obj) {
        return (List) f1.n(j2, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> l0<T> u(u0 u0Var, n0 n0Var, z zVar, b1<?, ?> b1Var, n<?> nVar, d0 d0Var) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int charAt3;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char charAt4;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i20;
        char charAt9;
        int i21;
        char charAt10;
        int i22;
        char charAt11;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr2;
        int i27;
        int i28;
        int i29;
        int i30;
        int objectFieldOffset;
        int i31;
        int i32;
        int i33;
        Field C;
        char charAt12;
        int i34;
        int i35;
        Object obj;
        Field C2;
        Object obj2;
        Field C3;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        int i38;
        char charAt15;
        int i39;
        char charAt16;
        char charAt17;
        int i40 = 0;
        boolean z10 = u0Var.b() == ProtoSyntax.PROTO3;
        String e10 = u0Var.e();
        int length = e10.length();
        int charAt18 = e10.charAt(0);
        if (charAt18 >= 55296) {
            int i41 = charAt18 & 8191;
            int i42 = 1;
            int i43 = 13;
            while (true) {
                i10 = i42 + 1;
                charAt17 = e10.charAt(i42);
                if (charAt17 < 55296) {
                    break;
                }
                i41 |= (charAt17 & 8191) << i43;
                i43 += 13;
                i42 = i10;
            }
            charAt18 = i41 | (charAt17 << i43);
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int charAt19 = e10.charAt(i10);
        if (charAt19 >= 55296) {
            int i45 = charAt19 & 8191;
            int i46 = 13;
            while (true) {
                i39 = i44 + 1;
                charAt16 = e10.charAt(i44);
                if (charAt16 < 55296) {
                    break;
                }
                i45 |= (charAt16 & 8191) << i46;
                i46 += 13;
                i44 = i39;
            }
            charAt19 = i45 | (charAt16 << i46);
            i44 = i39;
        }
        if (charAt19 == 0) {
            i11 = i44;
            iArr = f4901r;
            i14 = 0;
            i13 = 0;
            charAt = 0;
            charAt2 = 0;
            i12 = 0;
            charAt3 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt20 = e10.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt11 = e10.charAt(i47);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i48 |= (charAt11 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt20 = i48 | (charAt11 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt21 = e10.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt10 = e10.charAt(i50);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i51 |= (charAt10 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt21 = i51 | (charAt10 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt22 = e10.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt9 = e10.charAt(i53);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i54 |= (charAt9 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt22 = i54 | (charAt9 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            int charAt23 = e10.charAt(i53);
            if (charAt23 >= 55296) {
                int i57 = charAt23 & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt8 = e10.charAt(i56);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i57 |= (charAt8 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt23 = i57 | (charAt8 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            charAt = e10.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt7 = e10.charAt(i59);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i60 |= (charAt7 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt = i60 | (charAt7 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            charAt2 = e10.charAt(i59);
            if (charAt2 >= 55296) {
                int i63 = charAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt6 = e10.charAt(i62);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i63 |= (charAt6 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt2 = i63 | (charAt6 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt24 = e10.charAt(i62);
            if (charAt24 >= 55296) {
                int i66 = charAt24 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt5 = e10.charAt(i65);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i66 |= (charAt5 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt24 = i66 | (charAt5 << i67);
                i65 = i16;
            }
            i11 = i65 + 1;
            charAt3 = e10.charAt(i65);
            if (charAt3 >= 55296) {
                int i68 = charAt3 & 8191;
                int i69 = i11;
                int i70 = 13;
                while (true) {
                    i15 = i69 + 1;
                    charAt4 = e10.charAt(i69);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i68 |= (charAt4 & 8191) << i70;
                    i70 += 13;
                    i69 = i15;
                }
                charAt3 = i68 | (charAt4 << i70);
                i11 = i15;
            }
            i12 = (charAt20 * 2) + charAt21;
            i13 = charAt23;
            iArr = new int[charAt3 + charAt2 + charAt24];
            i40 = charAt20;
            i14 = charAt22;
        }
        Object[] d5 = u0Var.d();
        Class<?> cls = u0Var.c().getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i71 = charAt2 + charAt3;
        int i72 = i71;
        int i73 = charAt3;
        int i74 = i11;
        int i75 = 0;
        int i76 = 0;
        while (i74 < length) {
            int i77 = i74 + 1;
            int charAt25 = e10.charAt(i74);
            int i78 = length;
            if (charAt25 >= 55296) {
                int i79 = charAt25 & 8191;
                int i80 = i77;
                int i81 = 13;
                while (true) {
                    i38 = i80 + 1;
                    charAt15 = e10.charAt(i80);
                    i23 = i71;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i79 |= (charAt15 & 8191) << i81;
                    i81 += 13;
                    i80 = i38;
                    i71 = i23;
                }
                charAt25 = i79 | (charAt15 << i81);
                i24 = i38;
            } else {
                i23 = i71;
                i24 = i77;
            }
            int i82 = i24 + 1;
            int charAt26 = e10.charAt(i24);
            if (charAt26 >= 55296) {
                int i83 = charAt26 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i37 = i84 + 1;
                    charAt14 = e10.charAt(i84);
                    i25 = charAt3;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i83 |= (charAt14 & 8191) << i85;
                    i85 += 13;
                    i84 = i37;
                    charAt3 = i25;
                }
                charAt26 = i83 | (charAt14 << i85);
                i26 = i37;
            } else {
                i25 = charAt3;
                i26 = i82;
            }
            int i86 = charAt26 & 255;
            boolean z11 = z10;
            if ((charAt26 & 1024) != 0) {
                iArr[i76] = i75;
                i76++;
            }
            int i87 = i13;
            Unsafe unsafe = f4902s;
            if (i86 >= 51) {
                int i88 = i26 + 1;
                int charAt27 = e10.charAt(i26);
                char c = 55296;
                if (charAt27 >= 55296) {
                    int i89 = 13;
                    int i90 = charAt27 & 8191;
                    int i91 = i88;
                    while (true) {
                        i36 = i91 + 1;
                        charAt13 = e10.charAt(i91);
                        if (charAt13 < c) {
                            break;
                        }
                        i90 |= (charAt13 & 8191) << i89;
                        i89 += 13;
                        i91 = i36;
                        c = 55296;
                    }
                    charAt27 = i90 | (charAt13 << i89);
                    i34 = i36;
                } else {
                    i34 = i88;
                }
                int i92 = i34;
                int i93 = i86 - 51;
                i28 = i14;
                if (i93 != 9 && i93 != 17) {
                    if (i93 == 12 && (charAt18 & 1) == 1) {
                        i35 = i12 + 1;
                        objArr[((i75 / 3) * 2) + 1] = d5[i12];
                        i12 = i35;
                    }
                    int i94 = charAt27 * 2;
                    obj = d5[i94];
                    if (obj instanceof Field) {
                        C2 = C(cls, (String) obj);
                        d5[i94] = C2;
                    } else {
                        C2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i27 = i40;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(C2);
                    int i95 = i94 + 1;
                    obj2 = d5[i95];
                    if (obj2 instanceof Field) {
                        C3 = C(cls, (String) obj2);
                        d5[i95] = C3;
                    } else {
                        C3 = (Field) obj2;
                    }
                    i32 = (int) unsafe.objectFieldOffset(C3);
                    i30 = i12;
                    i31 = i92;
                    i33 = 0;
                }
                i35 = i12 + 1;
                objArr[((i75 / 3) * 2) + 1] = d5[i12];
                i12 = i35;
                int i942 = charAt27 * 2;
                obj = d5[i942];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i27 = i40;
                objectFieldOffset = (int) unsafe.objectFieldOffset(C2);
                int i952 = i942 + 1;
                obj2 = d5[i952];
                if (obj2 instanceof Field) {
                }
                i32 = (int) unsafe.objectFieldOffset(C3);
                i30 = i12;
                i31 = i92;
                i33 = 0;
            } else {
                iArr2 = iArr3;
                i27 = i40;
                i28 = i14;
                int i96 = i12 + 1;
                Field C4 = C(cls, (String) d5[i12]);
                if (i86 != 9 && i86 != 17) {
                    if (i86 != 27 && i86 != 49) {
                        if (i86 != 12 && i86 != 30 && i86 != 44) {
                            if (i86 == 50) {
                                int i97 = i73 + 1;
                                iArr[i73] = i75;
                                int i98 = (i75 / 3) * 2;
                                int i99 = i96 + 1;
                                objArr[i98] = d5[i96];
                                if ((charAt26 & 2048) != 0) {
                                    i96 = i99 + 1;
                                    objArr[i98 + 1] = d5[i99];
                                    i73 = i97;
                                } else {
                                    i73 = i97;
                                    i96 = i99;
                                }
                            }
                            i29 = 1;
                            i30 = i96;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                            if ((charAt18 & 1) == i29 || i86 > 17) {
                                i31 = i26;
                                i32 = 0;
                                i33 = 0;
                            } else {
                                int i100 = i26 + 1;
                                int charAt28 = e10.charAt(i26);
                                if (charAt28 >= 55296) {
                                    int i101 = charAt28 & 8191;
                                    int i102 = 13;
                                    while (true) {
                                        i31 = i100 + 1;
                                        charAt12 = e10.charAt(i100);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i101 |= (charAt12 & 8191) << i102;
                                        i102 += 13;
                                        i100 = i31;
                                    }
                                    charAt28 = i101 | (charAt12 << i102);
                                } else {
                                    i31 = i100;
                                }
                                int i103 = (charAt28 / 32) + (i27 * 2);
                                Object obj3 = d5[i103];
                                if (obj3 instanceof Field) {
                                    C = (Field) obj3;
                                } else {
                                    C = C(cls, (String) obj3);
                                    d5[i103] = C;
                                }
                                i32 = (int) unsafe.objectFieldOffset(C);
                                i33 = charAt28 % 32;
                            }
                            if (i86 >= 18 && i86 <= 49) {
                                iArr[i72] = objectFieldOffset;
                                i72++;
                            }
                        }
                        i29 = 1;
                        if ((charAt18 & 1) == 1) {
                            i30 = i96 + 1;
                            objArr[((i75 / 3) * 2) + 1] = d5[i96];
                            objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                            if ((charAt18 & 1) == i29) {
                            }
                            i31 = i26;
                            i32 = 0;
                            i33 = 0;
                            if (i86 >= 18) {
                                iArr[i72] = objectFieldOffset;
                                i72++;
                            }
                        }
                        i30 = i96;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                        if ((charAt18 & 1) == i29) {
                        }
                        i31 = i26;
                        i32 = 0;
                        i33 = 0;
                        if (i86 >= 18) {
                        }
                    }
                    i29 = 1;
                    i30 = i96 + 1;
                    objArr[((i75 / 3) * 2) + 1] = d5[i96];
                    objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                    if ((charAt18 & 1) == i29) {
                    }
                    i31 = i26;
                    i32 = 0;
                    i33 = 0;
                    if (i86 >= 18) {
                    }
                }
                i29 = 1;
                objArr[((i75 / 3) * 2) + 1] = C4.getType();
                i30 = i96;
                objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                if ((charAt18 & 1) == i29) {
                }
                i31 = i26;
                i32 = 0;
                i33 = 0;
                if (i86 >= 18) {
                }
            }
            int i104 = i75 + 1;
            iArr2[i75] = charAt25;
            int i105 = i104 + 1;
            iArr2[i104] = ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i86 << 20) | objectFieldOffset;
            i75 = i105 + 1;
            iArr2[i105] = (i33 << 20) | i32;
            i40 = i27;
            i12 = i30;
            z10 = z11;
            length = i78;
            i71 = i23;
            charAt3 = i25;
            i74 = i31;
            i13 = i87;
            i14 = i28;
            iArr3 = iArr2;
        }
        int i106 = i14;
        int i107 = i13;
        boolean z12 = z10;
        int i108 = i71;
        return new l0<>(iArr3, objArr, i14, i13, u0Var.c(), z10, iArr, charAt3, i71, n0Var, zVar, b1Var, nVar, d0Var);
    }

    public static int v(long j2, Object obj) {
        return ((Integer) f1.n(j2, obj)).intValue();
    }

    public static long w(long j2, Object obj) {
        return ((Long) f1.n(j2, obj)).longValue();
    }

    public final void A(Object obj, int i10, v0 v0Var) {
        long j2;
        Object w10;
        if ((536870912 & i10) != 0) {
            j2 = i10 & 1048575;
            w10 = v0Var.J();
        } else {
            int i11 = i10 & 1048575;
            if (this.f4908g) {
                j2 = i11;
                w10 = v0Var.o();
            } else {
                j2 = i11;
                w10 = v0Var.w();
            }
        }
        f1.u(j2, obj, w10);
    }

    public final void B(Object obj, int i10, v0 v0Var) {
        boolean z10 = (536870912 & i10) != 0;
        z zVar = this.n;
        int i11 = i10 & 1048575;
        if (z10) {
            v0Var.v(zVar.c(i11, obj));
        } else {
            v0Var.s(zVar.c(i11, obj));
        }
    }

    public final void D(int i10, Object obj) {
        if (this.f4909h) {
            return;
        }
        int i11 = this.f4903a[i10 + 2];
        long j2 = i11 & 1048575;
        f1.s(f1.l(j2, obj) | (1 << (i11 >>> 20)), j2, obj);
    }

    public final void E(int i10, int i11, Object obj) {
        f1.s(i10, this.f4903a[i11 + 2] & 1048575, obj);
    }

    public final int F(int i10) {
        return this.f4903a[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Object obj, i iVar) {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z10 = this.f4907f;
        n<?> nVar = this.f4916p;
        if (z10) {
            q<?> c = nVar.c(obj);
            if (!c.i()) {
                it = c.l();
                entry = it.next();
                int[] iArr2 = this.f4903a;
                int i13 = -1;
                i10 = 0;
                int i14 = 0;
                for (length = iArr2.length; i10 < length; length = i11) {
                    int F = F(i10);
                    int i15 = iArr2[i10];
                    int i16 = (267386880 & F) >>> 20;
                    boolean z11 = this.f4909h;
                    Unsafe unsafe = f4902s;
                    if (!z11 && i16 <= 17) {
                        int i17 = iArr2[i10 + 2];
                        Map.Entry<?, Object> entry2 = entry;
                        int i18 = i17 & 1048575;
                        iArr = iArr2;
                        i11 = length;
                        if (i18 != i13) {
                            i14 = unsafe.getInt(obj, i18);
                            i13 = i18;
                        }
                        i12 = 1 << (i17 >>> 20);
                        entry = entry2;
                    } else {
                        iArr = iArr2;
                        i11 = length;
                        entry = entry;
                        i12 = 0;
                    }
                    while (entry != null) {
                        nVar.a(entry);
                        if (i15 >= 0) {
                            nVar.j(entry);
                            if (it.hasNext()) {
                                entry = it.next();
                            } else {
                                entry = null;
                            }
                        } else {
                            long j2 = F & 1048575;
                            switch (i16) {
                                case 0:
                                    if ((i12 & i14) != 0) {
                                        iVar.c(f1.j(j2, obj), i15);
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 1:
                                    if ((i12 & i14) != 0) {
                                        iVar.g(i15, f1.k(j2, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.j(unsafe.getLong(obj, j2), i15);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.r(unsafe.getLong(obj, j2), i15);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.i(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 5:
                                    if ((i12 & i14) != 0) {
                                        iVar.f(unsafe.getLong(obj, j2), i15);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 6:
                                    if ((i12 & i14) != 0) {
                                        iVar.e(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.a(i15, f1.f(j2, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 8:
                                    if ((i12 & i14) != 0) {
                                        I(i15, unsafe.getObject(obj, j2), iVar);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case ma.i.f16046m /* 9 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.k(i15, n(i10), unsafe.getObject(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case ma.i.f16047o /* 10 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.b(i15, (ByteString) unsafe.getObject(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 11:
                                    if ((i12 & i14) != 0) {
                                        iVar.q(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 12:
                                    if ((i12 & i14) != 0) {
                                        iVar.d(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 13:
                                    if ((i12 & i14) != 0) {
                                        iVar.m(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 14:
                                    if ((i12 & i14) != 0) {
                                        iVar.n(unsafe.getLong(obj, j2), i15);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case ma.i.f16049q /* 15 */:
                                    if ((i12 & i14) != 0) {
                                        iVar.o(i15, unsafe.getInt(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 16:
                                    if ((i12 & i14) != 0) {
                                        iVar.p(unsafe.getLong(obj, j2), i15);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 17:
                                    if ((i12 & i14) != 0) {
                                        iVar.h(i15, n(i10), unsafe.getObject(obj, j2));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 18:
                                    x0.F(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 19:
                                    x0.J(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 20:
                                    x0.M(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 21:
                                    x0.U(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 22:
                                    x0.L(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 23:
                                    x0.I(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 24:
                                    x0.H(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 25:
                                    x0.D(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 26:
                                    x0.S(iArr[i10], (List) unsafe.getObject(obj, j2), iVar);
                                    break;
                                case 27:
                                    x0.N(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, n(i10));
                                    break;
                                case 28:
                                    x0.E(iArr[i10], (List) unsafe.getObject(obj, j2), iVar);
                                    break;
                                case 29:
                                    x0.T(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 30:
                                    x0.G(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 31:
                                    x0.O(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 32:
                                    x0.P(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 33:
                                    x0.Q(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 34:
                                    x0.R(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, false);
                                    continue;
                                    continue;
                                    i10 += 3;
                                    iArr2 = iArr;
                                case 35:
                                    x0.F(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 36:
                                    x0.J(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 37:
                                    x0.M(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 38:
                                    x0.U(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 39:
                                    x0.L(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 40:
                                    x0.I(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 41:
                                    x0.H(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 42:
                                    x0.D(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 43:
                                    x0.T(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 44:
                                    x0.G(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 45:
                                    x0.O(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 46:
                                    x0.P(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 47:
                                    x0.Q(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 48:
                                    x0.R(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, true);
                                    break;
                                case 49:
                                    x0.K(iArr[i10], (List) unsafe.getObject(obj, j2), iVar, n(i10));
                                    break;
                                case 50:
                                    H(iVar, i15, unsafe.getObject(obj, j2), i10);
                                    break;
                                case 51:
                                    if (r(i15, i10, obj)) {
                                        iVar.c(((Double) f1.n(j2, obj)).doubleValue(), i15);
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (r(i15, i10, obj)) {
                                        iVar.g(i15, ((Float) f1.n(j2, obj)).floatValue());
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (r(i15, i10, obj)) {
                                        iVar.j(w(j2, obj), i15);
                                        break;
                                    }
                                    break;
                                case 54:
                                    if (r(i15, i10, obj)) {
                                        iVar.r(w(j2, obj), i15);
                                        break;
                                    }
                                    break;
                                case 55:
                                    if (r(i15, i10, obj)) {
                                        iVar.i(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 56:
                                    if (r(i15, i10, obj)) {
                                        iVar.f(w(j2, obj), i15);
                                        break;
                                    }
                                    break;
                                case 57:
                                    if (r(i15, i10, obj)) {
                                        iVar.e(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 58:
                                    if (r(i15, i10, obj)) {
                                        iVar.a(i15, ((Boolean) f1.n(j2, obj)).booleanValue());
                                        break;
                                    }
                                    break;
                                case 59:
                                    if (r(i15, i10, obj)) {
                                        I(i15, unsafe.getObject(obj, j2), iVar);
                                        break;
                                    }
                                    break;
                                case 60:
                                    if (r(i15, i10, obj)) {
                                        iVar.k(i15, n(i10), unsafe.getObject(obj, j2));
                                        break;
                                    }
                                    break;
                                case 61:
                                    if (r(i15, i10, obj)) {
                                        iVar.b(i15, (ByteString) unsafe.getObject(obj, j2));
                                        break;
                                    }
                                    break;
                                case 62:
                                    if (r(i15, i10, obj)) {
                                        iVar.q(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 63:
                                    if (r(i15, i10, obj)) {
                                        iVar.d(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 64:
                                    if (r(i15, i10, obj)) {
                                        iVar.m(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 65:
                                    if (r(i15, i10, obj)) {
                                        iVar.n(w(j2, obj), i15);
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (r(i15, i10, obj)) {
                                        iVar.o(i15, v(j2, obj));
                                        break;
                                    }
                                    break;
                                case 67:
                                    if (r(i15, i10, obj)) {
                                        iVar.p(w(j2, obj), i15);
                                        break;
                                    }
                                    break;
                                case 68:
                                    if (r(i15, i10, obj)) {
                                        iVar.h(i15, n(i10), unsafe.getObject(obj, j2));
                                        break;
                                    }
                                    break;
                            }
                            i10 += 3;
                            iArr2 = iArr;
                        }
                    }
                    long j22 = F & 1048575;
                    switch (i16) {
                    }
                    i10 += 3;
                    iArr2 = iArr;
                }
                Map.Entry<?, Object> entry3 = entry;
                while (entry != null) {
                    nVar.j(entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                b1<?, ?> b1Var = this.f4915o;
                b1Var.s(b1Var.g(obj), iVar);
            }
        }
        it = null;
        entry = null;
        int[] iArr22 = this.f4903a;
        int i132 = -1;
        i10 = 0;
        int i142 = 0;
        while (i10 < length) {
        }
        Map.Entry<?, Object> entry32 = entry;
        while (entry != null) {
        }
        b1<?, ?> b1Var2 = this.f4915o;
        b1Var2.s(b1Var2.g(obj), iVar);
    }

    public final void H(i iVar, int i10, Object obj, int i11) {
        if (obj != null) {
            Object m10 = m(i11);
            d0 d0Var = this.f4917q;
            c0.a<?, ?> e10 = d0Var.e(m10);
            MapFieldLite g10 = d0Var.g(obj);
            CodedOutputStream codedOutputStream = iVar.f4897a;
            codedOutputStream.getClass();
            for (Map.Entry entry : g10.entrySet()) {
                codedOutputStream.A1(i10, 2);
                codedOutputStream.C1(c0.a(e10, entry.getKey(), entry.getValue()));
                c0.b(codedOutputStream, e10, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void a(T t10, T t11) {
        t11.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4903a;
            if (i10 < iArr.length) {
                int F = F(i10);
                long j2 = F & 1048575;
                int i11 = iArr[i10];
                switch ((F & 267386880) >>> 20) {
                    case 0:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.f4870d.m(t10, j2, f1.j(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case 1:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.f4870d.n(t10, j2, f1.k(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        if (!q(i10, t11)) {
                            break;
                        }
                        f1.t(t10, j2, f1.m(j2, t11));
                        D(i10, t10);
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.t(t10, j2, f1.m(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        if (!q(i10, t11)) {
                            break;
                        }
                        f1.s(f1.l(j2, t11), j2, t10);
                        D(i10, t10);
                        break;
                    case 5:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.t(t10, j2, f1.m(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case 6:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.s(f1.l(j2, t11), j2, t10);
                            D(i10, t10);
                            break;
                        }
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.f4870d.k(t10, j2, f1.f(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case 8:
                        if (!q(i10, t11)) {
                            break;
                        }
                        f1.u(j2, t10, f1.n(j2, t11));
                        D(i10, t10);
                        break;
                    case ma.i.f16046m /* 9 */:
                    case 17:
                        long F2 = F(i10) & 1048575;
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            Object n = f1.n(F2, t10);
                            Object n10 = f1.n(F2, t11);
                            if (n != null && n10 != null) {
                                n10 = u.c(n, n10);
                            } else if (n10 == null) {
                                break;
                            }
                            f1.u(F2, t10, n10);
                            D(i10, t10);
                            break;
                        }
                    case ma.i.f16047o /* 10 */:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.u(j2, t10, f1.n(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case 11:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.s(f1.l(j2, t11), j2, t10);
                            D(i10, t10);
                            break;
                        }
                    case 12:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.s(f1.l(j2, t11), j2, t10);
                            D(i10, t10);
                            break;
                        }
                    case 13:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.s(f1.l(j2, t11), j2, t10);
                            D(i10, t10);
                            break;
                        }
                    case 14:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.t(t10, j2, f1.m(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case ma.i.f16049q /* 15 */:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.s(f1.l(j2, t11), j2, t10);
                            D(i10, t10);
                            break;
                        }
                    case 16:
                        if (!q(i10, t11)) {
                            break;
                        } else {
                            f1.t(t10, j2, f1.m(j2, t11));
                            D(i10, t10);
                            break;
                        }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(j2, t10, t11);
                        break;
                    case 50:
                        Class<?> cls = x0.f4952a;
                        f1.u(j2, t10, this.f4917q.a(f1.n(j2, t10), f1.n(j2, t11)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!r(i11, i10, t11)) {
                            break;
                        }
                        f1.u(j2, t10, f1.n(j2, t11));
                        E(i11, i10, t10);
                        break;
                    case 60:
                    case 68:
                        int F3 = F(i10);
                        int i12 = iArr[i10];
                        long j10 = F3 & 1048575;
                        if (!r(i12, i10, t11)) {
                            break;
                        } else {
                            Object n11 = f1.n(j10, t10);
                            Object n12 = f1.n(j10, t11);
                            if (n11 != null && n12 != null) {
                                n12 = u.c(n11, n12);
                            } else if (n12 == null) {
                                break;
                            }
                            f1.u(j10, t10, n12);
                            E(i12, i10, t10);
                            break;
                        }
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!r(i11, i10, t11)) {
                            break;
                        } else {
                            f1.u(j2, t10, f1.n(j2, t11));
                            E(i11, i10, t10);
                            break;
                        }
                }
                i10 += 3;
            } else if (!this.f4909h) {
                Class<?> cls2 = x0.f4952a;
                b1<?, ?> b1Var = this.f4915o;
                b1Var.o(t10, b1Var.k(b1Var.g(t10), b1Var.g(t11)));
                if (this.f4907f) {
                    x0.A(this.f4916p, t10, t11);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0257 A[Catch: InvalidWireTypeException -> 0x019c, all -> 0x028f, TryCatch #8 {InvalidWireTypeException -> 0x019c, all -> 0x028f, blocks: (B:80:0x01b0, B:81:0x01b5, B:96:0x0222, B:82:0x01bb, B:97:0x022a, B:83:0x01c1, B:98:0x0232, B:84:0x01c7, B:99:0x023a, B:85:0x01cd, B:86:0x01d5, B:101:0x024b, B:104:0x0257, B:106:0x025b, B:108:0x0264, B:87:0x01da, B:88:0x01e2, B:89:0x01ea, B:90:0x01f2, B:91:0x01fa, B:92:0x0202, B:93:0x020a, B:94:0x0212, B:95:0x021a, B:100:0x0242), top: B:235:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04da A[Catch: all -> 0x04fc, TryCatch #4 {all -> 0x04fc, blocks: (B:192:0x04bf, B:199:0x04d5, B:201:0x04da, B:202:0x04df), top: B:227:0x04bf }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0507 A[LOOP:1: B:217:0x0505->B:218:0x0507, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f8 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(T t10, v0 v0Var, m mVar) {
        Object obj;
        int i10;
        int i11;
        int i12;
        long j2;
        long I;
        long j10;
        int z10;
        long j11;
        Object a10;
        Object n;
        Object a11;
        int d5;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        List c;
        u.b l2;
        long j21;
        Object valueOf;
        long I2;
        int z11;
        GeneratedMessageLite.e b5;
        mVar.getClass();
        b1 b1Var = this.f4915o;
        int[] iArr = this.f4911j;
        int i13 = this.f4913l;
        int i14 = this.f4912k;
        c1 c1Var = null;
        q<?> qVar = null;
        while (true) {
            try {
                int r3 = v0Var.r();
                int x3 = x(r3);
                if (x3 < 0) {
                    if (r3 == Integer.MAX_VALUE) {
                        while (i14 < i13) {
                            c1Var = k(t10, iArr[i14], c1Var, b1Var);
                            i14++;
                        }
                        if (c1Var == null) {
                            return;
                        }
                    } else {
                        boolean z12 = this.f4907f;
                        n<?> nVar = this.f4916p;
                        if (!z12) {
                            b5 = null;
                        } else {
                            b5 = nVar.b(mVar, this.f4906e, r3);
                        }
                        if (b5 != null) {
                            if (qVar == null) {
                                try {
                                    qVar = nVar.d(t10);
                                } catch (Throwable th) {
                                    th = th;
                                    i10 = i14;
                                    while (i11 < i13) {
                                    }
                                    if (c1Var != null) {
                                    }
                                    throw th;
                                }
                            }
                            c1Var = nVar.g(b5);
                        } else {
                            b1Var.p();
                            if (c1Var == null) {
                                c1Var = b1Var.f(t10);
                            }
                            if (!b1Var.l(c1Var, v0Var)) {
                                while (i14 < i13) {
                                    c1Var = k(t10, iArr[i14], c1Var, b1Var);
                                    i14++;
                                }
                                if (c1Var == null) {
                                    return;
                                }
                            }
                        }
                        i10 = i14;
                        i14 = i10;
                    }
                } else {
                    int F = F(x3);
                    int i15 = (267386880 & F) >>> 20;
                    z zVar = this.n;
                    switch (i15) {
                        case 0:
                            obj = c1Var;
                            i10 = i14;
                            i12 = x3;
                            f1.f4870d.m(t10, F & 1048575, v0Var.readDouble());
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 1:
                            obj = c1Var;
                            i10 = i14;
                            f1.f4870d.n(t10, F & 1048575, v0Var.readFloat());
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            obj = c1Var;
                            i10 = i14;
                            j2 = F & 1048575;
                            I = v0Var.I();
                            f1.t(t10, j2, I);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                            obj = c1Var;
                            i10 = i14;
                            j2 = F & 1048575;
                            I = v0Var.f();
                            f1.t(t10, j2, I);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            obj = c1Var;
                            i10 = i14;
                            j10 = F & 1048575;
                            z10 = v0Var.z();
                            f1.s(z10, j10, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 5:
                            obj = c1Var;
                            i10 = i14;
                            j2 = F & 1048575;
                            I = v0Var.h();
                            f1.t(t10, j2, I);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 6:
                            obj = c1Var;
                            i10 = i14;
                            j10 = F & 1048575;
                            z10 = v0Var.p();
                            f1.s(z10, j10, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            obj = c1Var;
                            i10 = i14;
                            f1.f4870d.k(t10, F & 1048575, v0Var.q());
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 8:
                            obj = c1Var;
                            i10 = i14;
                            A(t10, F, v0Var);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case ma.i.f16046m /* 9 */:
                            obj = c1Var;
                            i10 = i14;
                            if (q(x3, t10)) {
                                n = f1.n(F & 1048575, t10);
                                a11 = v0Var.a(n(x3), mVar);
                                f1.u(F & 1048575, t10, u.c(n, a11));
                                c1Var = obj;
                                break;
                            } else {
                                j11 = F & 1048575;
                                a10 = v0Var.a(n(x3), mVar);
                                f1.u(j11, t10, a10);
                                i12 = x3;
                                D(i12, t10);
                                c1Var = obj;
                            }
                        case ma.i.f16047o /* 10 */:
                            obj = c1Var;
                            i10 = i14;
                            j11 = F & 1048575;
                            a10 = v0Var.w();
                            f1.u(j11, t10, a10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 11:
                            obj = c1Var;
                            i10 = i14;
                            j10 = F & 1048575;
                            z10 = v0Var.y();
                            f1.s(z10, j10, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 12:
                            obj = c1Var;
                            i10 = i14;
                            d5 = v0Var.d();
                            u.b l4 = l(x3);
                            if (l4 != null) {
                                if (l4.a()) {
                                }
                                c1Var = x0.C(r3, d5, obj, b1Var);
                                break;
                            }
                            f1.s(d5, F & 1048575, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 13:
                            obj = c1Var;
                            i10 = i14;
                            j10 = F & 1048575;
                            z10 = v0Var.C();
                            f1.s(z10, j10, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 14:
                            obj = c1Var;
                            i10 = i14;
                            j2 = F & 1048575;
                            I = v0Var.t();
                            f1.t(t10, j2, I);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case ma.i.f16049q /* 15 */:
                            obj = c1Var;
                            i10 = i14;
                            j10 = F & 1048575;
                            z10 = v0Var.j();
                            f1.s(z10, j10, t10);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 16:
                            obj = c1Var;
                            i10 = i14;
                            j2 = F & 1048575;
                            I = v0Var.l();
                            f1.t(t10, j2, I);
                            i12 = x3;
                            D(i12, t10);
                            c1Var = obj;
                            break;
                        case 17:
                            obj = c1Var;
                            i10 = i14;
                            if (q(x3, t10)) {
                                n = f1.n(F & 1048575, t10);
                                a11 = v0Var.N(n(x3), mVar);
                                f1.u(F & 1048575, t10, u.c(n, a11));
                                c1Var = obj;
                                break;
                            } else {
                                j11 = F & 1048575;
                                a10 = v0Var.N(n(x3), mVar);
                                f1.u(j11, t10, a10);
                                i12 = x3;
                                D(i12, t10);
                                c1Var = obj;
                            }
                        case 18:
                            obj = c1Var;
                            i10 = i14;
                            j12 = F & 1048575;
                            v0Var.E(zVar.c(j12, t10));
                            c1Var = obj;
                            break;
                        case 19:
                            obj = c1Var;
                            i10 = i14;
                            j13 = F & 1048575;
                            v0Var.x(zVar.c(j13, t10));
                            c1Var = obj;
                            break;
                        case 20:
                            obj = c1Var;
                            i10 = i14;
                            j14 = F & 1048575;
                            v0Var.G(zVar.c(j14, t10));
                            c1Var = obj;
                            break;
                        case 21:
                            obj = c1Var;
                            i10 = i14;
                            j15 = F & 1048575;
                            v0Var.u(zVar.c(j15, t10));
                            c1Var = obj;
                            break;
                        case 22:
                            obj = c1Var;
                            i10 = i14;
                            j16 = F & 1048575;
                            v0Var.L(zVar.c(j16, t10));
                            c1Var = obj;
                            break;
                        case 23:
                            obj = c1Var;
                            i10 = i14;
                            j17 = F & 1048575;
                            v0Var.K(zVar.c(j17, t10));
                            c1Var = obj;
                            break;
                        case 24:
                            obj = c1Var;
                            i10 = i14;
                            j18 = F & 1048575;
                            v0Var.g(zVar.c(j18, t10));
                            c1Var = obj;
                            break;
                        case 25:
                            obj = c1Var;
                            i10 = i14;
                            j19 = F & 1048575;
                            v0Var.n(zVar.c(j19, t10));
                            c1Var = obj;
                            break;
                        case 26:
                            obj = c1Var;
                            i10 = i14;
                            B(t10, F, v0Var);
                            c1Var = obj;
                            break;
                        case 27:
                            obj = c1Var;
                            i10 = i14;
                            z(t10, F, v0Var, n(x3), mVar);
                            c1Var = obj;
                            break;
                        case 28:
                            obj = c1Var;
                            i10 = i14;
                            v0Var.D(zVar.c(F & 1048575, t10));
                            c1Var = obj;
                            break;
                        case 29:
                            obj = c1Var;
                            i10 = i14;
                            j20 = F & 1048575;
                            v0Var.m(zVar.c(j20, t10));
                            c1Var = obj;
                            break;
                        case 30:
                            obj = c1Var;
                            c = zVar.c(F & 1048575, t10);
                            v0Var.M(c);
                            l2 = l(x3);
                            Class<?> cls = x0.f4952a;
                            if (l2 != null) {
                                if (c instanceof RandomAccess) {
                                    int size = c.size();
                                    int i16 = 0;
                                    c1Var = obj;
                                    int i17 = 0;
                                    while (i16 < size) {
                                        int i18 = i14;
                                        int intValue = c.get(i16).intValue();
                                        if (l2.a()) {
                                            if (i16 != i17) {
                                                c.set(i17, Integer.valueOf(intValue));
                                            }
                                            i17++;
                                        } else {
                                            c1Var = x0.C(r3, intValue, c1Var, b1Var);
                                        }
                                        i16++;
                                        i14 = i18;
                                    }
                                    i10 = i14;
                                    if (i17 != size) {
                                        c.subList(i17, size).clear();
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    i10 = i14;
                                    Iterator<Integer> it = c.iterator();
                                    c1Var = obj;
                                    while (it.hasNext()) {
                                        int intValue2 = it.next().intValue();
                                        if (!l2.a()) {
                                            c1Var = x0.C(r3, intValue2, c1Var, b1Var);
                                            it.remove();
                                        }
                                    }
                                    break;
                                }
                            }
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 31:
                        case 45:
                            obj = c1Var;
                            v0Var.i(zVar.c(F & 1048575, t10));
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 32:
                        case 46:
                            obj = c1Var;
                            v0Var.H(zVar.c(F & 1048575, t10));
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 33:
                        case 47:
                            obj = c1Var;
                            v0Var.c(zVar.c(F & 1048575, t10));
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 34:
                        case 48:
                            obj = c1Var;
                            v0Var.k(zVar.c(F & 1048575, t10));
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 35:
                            obj = c1Var;
                            j12 = F & 1048575;
                            i10 = i14;
                            v0Var.E(zVar.c(j12, t10));
                            c1Var = obj;
                            break;
                        case 36:
                            obj = c1Var;
                            j13 = F & 1048575;
                            i10 = i14;
                            v0Var.x(zVar.c(j13, t10));
                            c1Var = obj;
                            break;
                        case 37:
                            obj = c1Var;
                            j14 = F & 1048575;
                            i10 = i14;
                            v0Var.G(zVar.c(j14, t10));
                            c1Var = obj;
                            break;
                        case 38:
                            obj = c1Var;
                            j15 = F & 1048575;
                            i10 = i14;
                            v0Var.u(zVar.c(j15, t10));
                            c1Var = obj;
                            break;
                        case 39:
                            obj = c1Var;
                            j16 = F & 1048575;
                            i10 = i14;
                            v0Var.L(zVar.c(j16, t10));
                            c1Var = obj;
                            break;
                        case 40:
                            obj = c1Var;
                            j17 = F & 1048575;
                            i10 = i14;
                            v0Var.K(zVar.c(j17, t10));
                            c1Var = obj;
                            break;
                        case 41:
                            obj = c1Var;
                            j18 = F & 1048575;
                            i10 = i14;
                            v0Var.g(zVar.c(j18, t10));
                            c1Var = obj;
                            break;
                        case 42:
                            obj = c1Var;
                            j19 = F & 1048575;
                            i10 = i14;
                            v0Var.n(zVar.c(j19, t10));
                            c1Var = obj;
                            break;
                        case 43:
                            obj = c1Var;
                            j20 = F & 1048575;
                            i10 = i14;
                            v0Var.m(zVar.c(j20, t10));
                            c1Var = obj;
                            break;
                        case 44:
                            obj = c1Var;
                            c = zVar.c(F & 1048575, t10);
                            v0Var.M(c);
                            l2 = l(x3);
                            Class<?> cls2 = x0.f4952a;
                            if (l2 != null) {
                            }
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 49:
                            obj = c1Var;
                            try {
                                y(t10, F & 1048575, v0Var, n(x3), mVar);
                                i10 = i14;
                                c1Var = obj;
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                i10 = i14;
                                c1Var = obj;
                                b1Var.p();
                                if (c1Var == null) {
                                }
                                if (b1Var.l(c1Var, v0Var)) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i10 = i14;
                                c1Var = obj;
                                while (i11 < i13) {
                                }
                                if (c1Var != null) {
                                }
                                throw th;
                            }
                            break;
                        case 50:
                            t(t10, x3, m(x3), mVar, v0Var);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 51:
                            j21 = F & 1048575;
                            valueOf = Double.valueOf(v0Var.readDouble());
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 52:
                            j21 = F & 1048575;
                            valueOf = Float.valueOf(v0Var.readFloat());
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 53:
                            j21 = F & 1048575;
                            I2 = v0Var.I();
                            valueOf = Long.valueOf(I2);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 54:
                            j21 = F & 1048575;
                            I2 = v0Var.f();
                            valueOf = Long.valueOf(I2);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 55:
                            j21 = F & 1048575;
                            z11 = v0Var.z();
                            valueOf = Integer.valueOf(z11);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 56:
                            j21 = F & 1048575;
                            I2 = v0Var.h();
                            valueOf = Long.valueOf(I2);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 57:
                            j21 = F & 1048575;
                            z11 = v0Var.p();
                            valueOf = Integer.valueOf(z11);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 58:
                            j21 = F & 1048575;
                            valueOf = Boolean.valueOf(v0Var.q());
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 59:
                            A(t10, F, v0Var);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 60:
                            if (r(r3, x3, t10)) {
                                j21 = F & 1048575;
                                valueOf = u.c(f1.n(j21, t10), v0Var.a(n(x3), mVar));
                                f1.u(j21, t10, valueOf);
                                E(r3, x3, t10);
                                obj = c1Var;
                                i10 = i14;
                                c1Var = obj;
                                break;
                            } else {
                                f1.u(F & 1048575, t10, v0Var.a(n(x3), mVar));
                                D(x3, t10);
                                E(r3, x3, t10);
                                obj = c1Var;
                                i10 = i14;
                                c1Var = obj;
                            }
                        case 61:
                            j21 = F & 1048575;
                            valueOf = v0Var.w();
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 62:
                            j21 = F & 1048575;
                            z11 = v0Var.y();
                            valueOf = Integer.valueOf(z11);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 63:
                            d5 = v0Var.d();
                            u.b l7 = l(x3);
                            if (l7 != null && !l7.a()) {
                                obj = c1Var;
                                i10 = i14;
                                c1Var = x0.C(r3, d5, obj, b1Var);
                                break;
                            }
                            valueOf = Integer.valueOf(d5);
                            j21 = F & 1048575;
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 64:
                            j21 = F & 1048575;
                            z11 = v0Var.C();
                            valueOf = Integer.valueOf(z11);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 65:
                            j21 = F & 1048575;
                            I2 = v0Var.t();
                            valueOf = Long.valueOf(I2);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 66:
                            j21 = F & 1048575;
                            z11 = v0Var.j();
                            valueOf = Integer.valueOf(z11);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 67:
                            j21 = F & 1048575;
                            I2 = v0Var.l();
                            valueOf = Long.valueOf(I2);
                            f1.u(j21, t10, valueOf);
                            E(r3, x3, t10);
                            obj = c1Var;
                            i10 = i14;
                            c1Var = obj;
                            break;
                        case 68:
                            j21 = F & 1048575;
                            try {
                                valueOf = v0Var.N(n(x3), mVar);
                                f1.u(j21, t10, valueOf);
                                E(r3, x3, t10);
                                obj = c1Var;
                                i10 = i14;
                                c1Var = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                obj = c1Var;
                                i10 = i14;
                                c1Var = obj;
                                b1Var.p();
                                if (c1Var == null) {
                                    c1Var = b1Var.f(t10);
                                }
                                if (b1Var.l(c1Var, v0Var)) {
                                    for (int i19 = i10; i19 < i13; i19++) {
                                        c1Var = k(t10, iArr[i19], c1Var, b1Var);
                                    }
                                    if (c1Var == null) {
                                        return;
                                    }
                                    b1Var.n(t10, c1Var);
                                }
                                i14 = i10;
                            }
                        default:
                            obj = c1Var;
                            i10 = i14;
                            if (obj == null) {
                                try {
                                    c1Var = b1Var.m();
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    c1Var = obj;
                                    b1Var.p();
                                    if (c1Var == null) {
                                    }
                                    if (b1Var.l(c1Var, v0Var)) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c1Var = obj;
                                    while (i11 < i13) {
                                    }
                                    if (c1Var != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                c1Var = obj;
                            }
                            try {
                                try {
                                    if (b1Var.l(c1Var, v0Var)) {
                                        break;
                                    } else {
                                        for (int i20 = i10; i20 < i13; i20++) {
                                            c1Var = k(t10, iArr[i20], c1Var, b1Var);
                                        }
                                        if (c1Var != null) {
                                            break;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    for (i11 = i10; i11 < i13; i11++) {
                                        c1Var = k(t10, iArr[i11], c1Var, b1Var);
                                    }
                                    if (c1Var != null) {
                                        b1Var.n(t10, c1Var);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                b1Var.p();
                                if (c1Var == null) {
                                }
                                if (b1Var.l(c1Var, v0Var)) {
                                }
                            }
                            break;
                    }
                    i14 = i10;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = c1Var;
            }
        }
        b1Var.n(t10, c1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void c(T t10) {
        int[] iArr;
        int i10;
        int i11 = this.f4912k;
        while (true) {
            iArr = this.f4911j;
            i10 = this.f4913l;
            if (i11 >= i10) {
                break;
            }
            long F = F(iArr[i11]) & 1048575;
            Object n = f1.n(F, t10);
            if (n != null) {
                f1.u(F, t10, this.f4917q.d(n));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.n.a(iArr[i10], t10);
            i10++;
        }
        this.f4915o.j(t10);
        if (this.f4907f) {
            this.f4916p.f(t10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, i iVar) {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i10;
        Iterator<Map.Entry<?, Object>> it2;
        iVar.getClass();
        if (this.f4909h) {
            boolean z10 = this.f4907f;
            n<?> nVar = this.f4916p;
            if (z10) {
                q<?> c = nVar.c(obj);
                if (!c.i()) {
                    it = c.l();
                    entry = it.next();
                    int[] iArr = this.f4903a;
                    length = iArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        int F = F(i10);
                        int i11 = iArr[i10];
                        while (entry != null) {
                            nVar.a(entry);
                            if (i11 >= 0) {
                                nVar.j(entry);
                                if (it.hasNext()) {
                                    entry = it.next();
                                } else {
                                    entry = null;
                                }
                            } else {
                                switch ((267386880 & F) >>> 20) {
                                    case 0:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.c(f1.j(F & 1048575, obj), i11);
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 1:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.g(i11, f1.k(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.j(f1.m(F & 1048575, obj), i11);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.r(f1.m(F & 1048575, obj), i11);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.i(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 5:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.f(f1.m(F & 1048575, obj), i11);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 6:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.e(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.a(i11, f1.f(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 8:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            I(i11, f1.n(F & 1048575, obj), iVar);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case ma.i.f16046m /* 9 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.k(i11, n(i10), f1.n(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case ma.i.f16047o /* 10 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.b(i11, (ByteString) f1.n(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 11:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.q(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 12:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.d(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 13:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.m(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 14:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.n(f1.m(F & 1048575, obj), i11);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case ma.i.f16049q /* 15 */:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.o(i11, f1.l(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 16:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.p(f1.m(F & 1048575, obj), i11);
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 17:
                                        it2 = it;
                                        if (q(i10, obj)) {
                                            iVar.h(i11, n(i10), f1.n(F & 1048575, obj));
                                        } else {
                                            continue;
                                            continue;
                                        }
                                        i10 += 3;
                                        it = it2;
                                    case 18:
                                        it2 = it;
                                        x0.F(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 19:
                                        it2 = it;
                                        x0.J(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 20:
                                        it2 = it;
                                        x0.M(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 21:
                                        it2 = it;
                                        x0.U(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 22:
                                        it2 = it;
                                        x0.L(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 23:
                                        it2 = it;
                                        x0.I(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 24:
                                        it2 = it;
                                        x0.H(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 25:
                                        it2 = it;
                                        x0.D(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 26:
                                        it2 = it;
                                        x0.S(iArr[i10], (List) f1.n(F & 1048575, obj), iVar);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 27:
                                        it2 = it;
                                        x0.N(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, n(i10));
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 28:
                                        it2 = it;
                                        x0.E(iArr[i10], (List) f1.n(F & 1048575, obj), iVar);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 29:
                                        it2 = it;
                                        x0.T(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 30:
                                        it2 = it;
                                        x0.G(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 31:
                                        it2 = it;
                                        x0.O(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 32:
                                        it2 = it;
                                        x0.P(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 33:
                                        it2 = it;
                                        x0.Q(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 34:
                                        it2 = it;
                                        x0.R(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, false);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 35:
                                        it2 = it;
                                        x0.F(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 36:
                                        it2 = it;
                                        x0.J(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 37:
                                        it2 = it;
                                        x0.M(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 38:
                                        it2 = it;
                                        x0.U(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 39:
                                        it2 = it;
                                        x0.L(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 40:
                                        it2 = it;
                                        x0.I(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 41:
                                        it2 = it;
                                        x0.H(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 42:
                                        it2 = it;
                                        x0.D(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 43:
                                        it2 = it;
                                        x0.T(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 44:
                                        it2 = it;
                                        x0.G(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 45:
                                        it2 = it;
                                        x0.O(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 46:
                                        it2 = it;
                                        x0.P(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 47:
                                        it2 = it;
                                        x0.Q(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 48:
                                        it2 = it;
                                        x0.R(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, true);
                                        continue;
                                        continue;
                                        i10 += 3;
                                        it = it2;
                                    case 49:
                                        x0.K(iArr[i10], (List) f1.n(F & 1048575, obj), iVar, n(i10));
                                        break;
                                    case 50:
                                        H(iVar, i11, f1.n(F & 1048575, obj), i10);
                                        break;
                                    case 51:
                                        if (r(i11, i10, obj)) {
                                            iVar.c(((Double) f1.n(F & 1048575, obj)).doubleValue(), i11);
                                            break;
                                        }
                                        break;
                                    case 52:
                                        if (r(i11, i10, obj)) {
                                            iVar.g(i11, ((Float) f1.n(F & 1048575, obj)).floatValue());
                                            break;
                                        }
                                        break;
                                    case 53:
                                        if (r(i11, i10, obj)) {
                                            iVar.j(w(F & 1048575, obj), i11);
                                            break;
                                        }
                                        break;
                                    case 54:
                                        if (r(i11, i10, obj)) {
                                            iVar.r(w(F & 1048575, obj), i11);
                                            break;
                                        }
                                        break;
                                    case 55:
                                        if (r(i11, i10, obj)) {
                                            iVar.i(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 56:
                                        if (r(i11, i10, obj)) {
                                            iVar.f(w(F & 1048575, obj), i11);
                                            break;
                                        }
                                        break;
                                    case 57:
                                        if (r(i11, i10, obj)) {
                                            iVar.e(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 58:
                                        if (r(i11, i10, obj)) {
                                            iVar.a(i11, ((Boolean) f1.n(F & 1048575, obj)).booleanValue());
                                            break;
                                        }
                                        break;
                                    case 59:
                                        if (r(i11, i10, obj)) {
                                            I(i11, f1.n(F & 1048575, obj), iVar);
                                            break;
                                        }
                                        break;
                                    case 60:
                                        if (r(i11, i10, obj)) {
                                            iVar.k(i11, n(i10), f1.n(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 61:
                                        if (r(i11, i10, obj)) {
                                            iVar.b(i11, (ByteString) f1.n(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 62:
                                        if (r(i11, i10, obj)) {
                                            iVar.q(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 63:
                                        if (r(i11, i10, obj)) {
                                            iVar.d(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 64:
                                        if (r(i11, i10, obj)) {
                                            iVar.m(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 65:
                                        if (r(i11, i10, obj)) {
                                            iVar.n(w(F & 1048575, obj), i11);
                                            break;
                                        }
                                        break;
                                    case 66:
                                        if (r(i11, i10, obj)) {
                                            iVar.o(i11, v(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                    case 67:
                                        if (r(i11, i10, obj)) {
                                            iVar.p(w(F & 1048575, obj), i11);
                                            break;
                                        }
                                        break;
                                    case 68:
                                        if (r(i11, i10, obj)) {
                                            iVar.h(i11, n(i10), f1.n(F & 1048575, obj));
                                            break;
                                        }
                                        break;
                                }
                                it2 = it;
                                i10 += 3;
                                it = it2;
                            }
                        }
                        switch ((267386880 & F) >>> 20) {
                        }
                        it2 = it;
                        i10 += 3;
                        it = it2;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    while (entry != null) {
                        nVar.j(entry);
                        if (it3.hasNext()) {
                            entry = it3.next();
                        } else {
                            entry = null;
                        }
                    }
                    b1<?, ?> b1Var = this.f4915o;
                    b1Var.s(b1Var.g(obj), iVar);
                    return;
                }
            }
            it = null;
            entry = null;
            int[] iArr2 = this.f4903a;
            length = iArr2.length;
            i10 = 0;
            while (i10 < length) {
            }
            Iterator<Map.Entry<?, Object>> it32 = it;
            while (entry != null) {
            }
            b1<?, ?> b1Var2 = this.f4915o;
            b1Var2.s(b1Var2.g(obj), iVar);
            return;
        }
        G(obj, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean e(T t10) {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 < this.f4912k) {
                int i14 = this.f4911j[i12];
                int[] iArr = this.f4903a;
                int i15 = iArr[i14];
                int F = F(i14);
                boolean z13 = this.f4909h;
                if (!z13) {
                    int i16 = iArr[i14 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i11) {
                        i13 = f4902s.getInt(t10, i17);
                        i11 = i17;
                    }
                } else {
                    i10 = 0;
                }
                if ((268435456 & F) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (z13) {
                        z11 = q(i14, t10);
                    } else if ((i13 & i10) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i18 = (267386880 & F) >>> 20;
                if (i18 != 9 && i18 != 17) {
                    if (i18 != 27) {
                        if (i18 != 60 && i18 != 68) {
                            if (i18 != 49) {
                                if (i18 == 50) {
                                    Object n = f1.n(F & 1048575, t10);
                                    d0 d0Var = this.f4917q;
                                    MapFieldLite g10 = d0Var.g(n);
                                    if (!g10.isEmpty() && d0Var.e(m(i14)).c.f4828i == WireFormat$JavaType.f4837r) {
                                        Iterator it = g10.values().iterator();
                                        w0<T> w0Var = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (w0Var == null) {
                                                w0Var = s0.c.a(next.getClass());
                                            }
                                            boolean e10 = w0Var.e(next);
                                            w0Var = w0Var;
                                            if (!e10) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z12) {
                                        return false;
                                    }
                                }
                            }
                        } else if (r(i15, i14, t10) && !n(i14).e(f1.n(F & 1048575, t10))) {
                            return false;
                        }
                    }
                    List list = (List) f1.n(F & 1048575, t10);
                    if (!list.isEmpty()) {
                        ?? n10 = n(i14);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!n10.e(list.get(i19))) {
                                z12 = false;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                } else {
                    if (z13) {
                        z12 = q(i14, t10);
                    } else if ((i10 & i13) == 0) {
                        z12 = false;
                    }
                    if (z12 && !n(i14).e(f1.n(F & 1048575, t10))) {
                        return false;
                    }
                }
                i12++;
            } else if (this.f4907f && !this.f4916p.c(t10).j()) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean f(T t10, T t11) {
        boolean z10;
        int[] iArr = this.f4903a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 < length) {
                int F = F(i10);
                long j2 = F & 1048575;
                switch ((F & 267386880) >>> 20) {
                    case 0:
                        if (j(t10, i10, t11) && Double.doubleToLongBits(f1.j(j2, t10)) == Double.doubleToLongBits(f1.j(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 1:
                        if (j(t10, i10, t11) && Float.floatToIntBits(f1.k(j2, t10)) == Float.floatToIntBits(f1.k(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        if (j(t10, i10, t11) && f1.m(j2, t10) == f1.m(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j(t10, i10, t11) && f1.m(j2, t10) == f1.m(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 5:
                        if (j(t10, i10, t11) && f1.m(j2, t10) == f1.m(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 6:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(t10, i10, t11) && f1.f(j2, t10) == f1.f(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 8:
                        if (j(t10, i10, t11) && x0.B(f1.n(j2, t10), f1.n(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case ma.i.f16046m /* 9 */:
                        if (j(t10, i10, t11) && x0.B(f1.n(j2, t10), f1.n(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case ma.i.f16047o /* 10 */:
                        if (j(t10, i10, t11) && x0.B(f1.n(j2, t10), f1.n(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 11:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 12:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 13:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 14:
                        if (j(t10, i10, t11) && f1.m(j2, t10) == f1.m(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case ma.i.f16049q /* 15 */:
                        if (j(t10, i10, t11) && f1.l(j2, t10) == f1.l(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 16:
                        if (j(t10, i10, t11) && f1.m(j2, t10) == f1.m(j2, t11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 17:
                        if (j(t10, i10, t11) && x0.B(f1.n(j2, t10), f1.n(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        z11 = x0.B(f1.n(j2, t10), f1.n(j2, t11));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j10 = iArr[i10 + 2] & 1048575;
                        if (f1.l(j10, t10) == f1.l(j10, t11)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && x0.B(f1.n(j2, t10), f1.n(j2, t11))) {
                            break;
                        }
                        z11 = false;
                        break;
                }
                if (!z11) {
                    return false;
                }
                i10 += 3;
            } else {
                b1<?, ?> b1Var = this.f4915o;
                if (!b1Var.g(t10).equals(b1Var.g(t11))) {
                    return false;
                }
                if (!this.f4907f) {
                    return true;
                }
                n<?> nVar = this.f4916p;
                return nVar.c(t10).equals(nVar.c(t11));
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int g(T t10) {
        return this.f4909h ? p(t10) : o(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final T h() {
        return (T) this.f4914m.a(this.f4906e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
        if (r4 != null) goto L90;
     */
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(T t10) {
        int i10;
        double j2;
        float k3;
        long m10;
        int l2;
        boolean f10;
        Object n;
        Object n10;
        int i11;
        int[] iArr = this.f4903a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int F = F(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & F;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    j2 = f1.j(j10, t10);
                    m10 = Double.doubleToLongBits(j2);
                    l2 = u.b(m10);
                    break;
                case 1:
                    i10 = i12 * 53;
                    k3 = f1.k(j10, t10);
                    l2 = Float.floatToIntBits(k3);
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    m10 = f1.m(j10, t10);
                    l2 = u.b(m10);
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 6:
                case 11:
                case 12:
                case 13:
                case ma.i.f16049q /* 15 */:
                    i10 = i12 * 53;
                    l2 = f1.l(j10, t10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i10 = i12 * 53;
                    f10 = f1.f(j10, t10);
                    l2 = u.a(f10);
                    break;
                case 8:
                    i10 = i12 * 53;
                    l2 = ((String) f1.n(j10, t10)).hashCode();
                    break;
                case ma.i.f16046m /* 9 */:
                    n = f1.n(j10, t10);
                    break;
                case ma.i.f16047o /* 10 */:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i10 = i12 * 53;
                    n10 = f1.n(j10, t10);
                    l2 = n10.hashCode();
                    break;
                case 17:
                    n = f1.n(j10, t10);
                    if (n != null) {
                        i11 = n.hashCode();
                        i12 = (i12 * 53) + i11;
                    }
                    i11 = 37;
                    i12 = (i12 * 53) + i11;
                case 51:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        j2 = ((Double) f1.n(j10, t10)).doubleValue();
                        m10 = Double.doubleToLongBits(j2);
                        l2 = u.b(m10);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        k3 = ((Float) f1.n(j10, t10)).floatValue();
                        l2 = Float.floatToIntBits(k3);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (!r(i14, i13, t10)) {
                        continue;
                    }
                    i10 = i12 * 53;
                    m10 = w(j10, t10);
                    l2 = u.b(m10);
                    break;
                case 54:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        m10 = w(j10, t10);
                        l2 = u.b(m10);
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (!r(i14, i13, t10)) {
                        continue;
                    }
                    i10 = i12 * 53;
                    l2 = v(j10, t10);
                    break;
                case 56:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        m10 = w(j10, t10);
                        l2 = u.b(m10);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = v(j10, t10);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        f10 = ((Boolean) f1.n(j10, t10)).booleanValue();
                        l2 = u.a(f10);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = ((String) f1.n(j10, t10)).hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (!r(i14, i13, t10)) {
                        continue;
                    }
                    n10 = f1.n(j10, t10);
                    i10 = i12 * 53;
                    l2 = n10.hashCode();
                    break;
                case 61:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        n10 = f1.n(j10, t10);
                        l2 = n10.hashCode();
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = v(j10, t10);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = v(j10, t10);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = v(j10, t10);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        m10 = w(j10, t10);
                        l2 = u.b(m10);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        l2 = v(j10, t10);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (r(i14, i13, t10)) {
                        i10 = i12 * 53;
                        m10 = w(j10, t10);
                        l2 = u.b(m10);
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (r(i14, i13, t10)) {
                        n10 = f1.n(j10, t10);
                        i10 = i12 * 53;
                        l2 = n10.hashCode();
                        break;
                    } else {
                        continue;
                    }
                default:
                    continue;
            }
            i12 = l2 + i10;
        }
        int hashCode = this.f4915o.g(t10).hashCode() + (i12 * 53);
        if (this.f4907f) {
            return (hashCode * 53) + this.f4916p.c(t10).hashCode();
        }
        return hashCode;
    }

    public final boolean j(Object obj, int i10, Object obj2) {
        return q(i10, obj) == q(i10, obj2);
    }

    public final <UT, UB> UB k(Object obj, int i10, UB ub, b1<UT, UB> b1Var) {
        int i11 = this.f4903a[i10];
        Object n = f1.n(F(i10) & 1048575, obj);
        if (n == null) {
            return ub;
        }
        u.b l2 = l(i10);
        if (l2 == null) {
            return ub;
        }
        d0 d0Var = this.f4917q;
        MapFieldLite h10 = d0Var.h(n);
        c0.a<?, ?> e10 = d0Var.e(m(i10));
        Iterator it = h10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!l2.a()) {
                if (ub == null) {
                    ub = (UB) b1Var.m();
                }
                int a10 = c0.a(e10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = CodedOutputStream.f4780j;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, a10);
                try {
                    c0.b(bVar, e10, entry.getKey(), entry.getValue());
                    if (bVar.f4786m - bVar.n == 0) {
                        b1Var.d(ub, i11, new ByteString.LiteralByteString(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub;
    }

    public final u.b l(int i10) {
        return (u.b) this.f4904b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f4904b[(i10 / 3) * 2];
    }

    public final w0 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f4904b;
        w0 w0Var = (w0) objArr[i11];
        if (w0Var != null) {
            return w0Var;
        }
        w0<T> a10 = s0.c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x020b, code lost:
        if (r13 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x034b, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.ByteString) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(T t10) {
        int i10;
        int i11;
        int i12;
        long j2;
        long j10;
        int i13;
        Object object;
        int i14;
        int i15;
        int i16;
        long j11;
        int h10;
        int i17;
        int b12;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int[] iArr = this.f4903a;
            if (i19 < iArr.length) {
                int F = F(i19);
                int i22 = iArr[i19];
                int i23 = (267386880 & F) >>> 20;
                boolean z10 = this.f4910i;
                Unsafe unsafe = f4902s;
                if (i23 <= 17) {
                    i11 = iArr[i19 + 2];
                    int i24 = i11 & 1048575;
                    i12 = 1 << (i11 >>> 20);
                    i10 = i19;
                    if (i24 != i18) {
                        i21 = unsafe.getInt(t10, i24);
                        i18 = i24;
                    }
                } else {
                    i10 = i19;
                    if (z10 && i23 >= FieldType.f4788j.a() && i23 <= FieldType.f4789k.a()) {
                        i11 = iArr[i10 + 2] & 1048575;
                    } else {
                        i11 = 0;
                    }
                    i12 = 0;
                }
                long j12 = F & 1048575;
                int i25 = i10;
                switch (i23) {
                    case 0:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.N0(i22);
                        i20 += h10;
                        break;
                    case 1:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.R0(i22);
                        i20 += h10;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            j2 = unsafe.getLong(t10, j12);
                            h10 = CodedOutputStream.V0(j2, i22);
                            i20 += h10;
                            break;
                        }
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            j10 = unsafe.getLong(t10, j12);
                            h10 = CodedOutputStream.g1(j10, i22);
                            i20 += h10;
                            break;
                        }
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            i13 = unsafe.getInt(t10, j12);
                            h10 = CodedOutputStream.T0(i22, i13);
                            i20 += h10;
                            break;
                        }
                    case 5:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.Q0(i22);
                        i20 += h10;
                        break;
                    case 6:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.P0(i22);
                        i20 += h10;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.L0(i22);
                        i20 += h10;
                        break;
                    case 8:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            object = unsafe.getObject(t10, j12);
                            break;
                        }
                    case ma.i.f16046m /* 9 */:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = x0.o(i22, n(i25), unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case ma.i.f16047o /* 10 */:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.M0(i22, (ByteString) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 11:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            i14 = unsafe.getInt(t10, j12);
                            h10 = CodedOutputStream.e1(i22, i14);
                            i20 += h10;
                            break;
                        }
                    case 12:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            i15 = unsafe.getInt(t10, j12);
                            h10 = CodedOutputStream.O0(i22, i15);
                            i20 += h10;
                            break;
                        }
                    case 13:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.X0(i22);
                        i20 += h10;
                        break;
                    case 14:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.Y0(i22);
                        i20 += h10;
                        break;
                    case ma.i.f16049q /* 15 */:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            i16 = unsafe.getInt(t10, j12);
                            h10 = CodedOutputStream.Z0(i22, i16);
                            i20 += h10;
                            break;
                        }
                    case 16:
                        if ((i21 & i12) == 0) {
                            break;
                        } else {
                            j11 = unsafe.getLong(t10, j12);
                            h10 = CodedOutputStream.a1(j11, i22);
                            i20 += h10;
                            break;
                        }
                    case 17:
                        if ((i21 & i12) == 0) {
                            break;
                        }
                        h10 = CodedOutputStream.S0(i22, (i0) unsafe.getObject(t10, j12), n(i25));
                        i20 += h10;
                        break;
                    case 18:
                    case 23:
                    case 32:
                        h10 = x0.h(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        h10 = x0.f(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 20:
                        h10 = x0.m(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 21:
                        h10 = x0.x(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 22:
                        h10 = x0.k(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 25:
                        h10 = x0.a(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 26:
                        h10 = x0.u(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 27:
                        h10 = x0.p(i22, (List) unsafe.getObject(t10, j12), n(i25));
                        i20 += h10;
                        break;
                    case 28:
                        h10 = x0.c(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 29:
                        h10 = x0.v(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 30:
                        h10 = x0.d(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 33:
                        h10 = x0.q(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 34:
                        h10 = x0.s(i22, (List) unsafe.getObject(t10, j12));
                        i20 += h10;
                        break;
                    case 35:
                        i17 = x0.i((List) unsafe.getObject(t10, j12));
                        if (i17 <= 0) {
                            break;
                        }
                        break;
                    case 36:
                        i17 = x0.g((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i17 = x0.n((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i17 = x0.y((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i17 = x0.l((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i17 = x0.i((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i17 = x0.g((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i17 = x0.b((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i17 = x0.w((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i17 = x0.e((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i17 = x0.g((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i17 = x0.i((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i17 = x0.r((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i17 = x0.t((List) unsafe.getObject(t10, j12));
                        if (i17 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i11, i17);
                            }
                            i20 = CodedOutputStream.f1(i17) + CodedOutputStream.d1(i22) + i17 + i20;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        h10 = x0.j(i22, (List) unsafe.getObject(t10, j12), n(i25));
                        i20 += h10;
                        break;
                    case 50:
                        h10 = this.f4917q.b(unsafe.getObject(t10, j12), i22, m(i25));
                        i20 += h10;
                        break;
                    case 51:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.N0(i22);
                            i20 += h10;
                            break;
                        }
                    case 52:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.R0(i22);
                            i20 += h10;
                            break;
                        }
                    case 53:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            j2 = w(j12, t10);
                            h10 = CodedOutputStream.V0(j2, i22);
                            i20 += h10;
                            break;
                        }
                    case 54:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            j10 = w(j12, t10);
                            h10 = CodedOutputStream.g1(j10, i22);
                            i20 += h10;
                            break;
                        }
                    case 55:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            i13 = v(j12, t10);
                            h10 = CodedOutputStream.T0(i22, i13);
                            i20 += h10;
                            break;
                        }
                    case 56:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.Q0(i22);
                            i20 += h10;
                            break;
                        }
                    case 57:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.P0(i22);
                            i20 += h10;
                            break;
                        }
                    case 58:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.L0(i22);
                            i20 += h10;
                            break;
                        }
                    case 59:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            object = unsafe.getObject(t10, j12);
                            if (object instanceof ByteString) {
                                b12 = CodedOutputStream.M0(i22, (ByteString) object);
                                i20 = b12 + i20;
                                break;
                            }
                            b12 = CodedOutputStream.b1((String) object, i22);
                            i20 = b12 + i20;
                        }
                    case 60:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = x0.o(i22, n(i25), unsafe.getObject(t10, j12));
                            i20 += h10;
                            break;
                        }
                    case 61:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.M0(i22, (ByteString) unsafe.getObject(t10, j12));
                            i20 += h10;
                            break;
                        }
                    case 62:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            i14 = v(j12, t10);
                            h10 = CodedOutputStream.e1(i22, i14);
                            i20 += h10;
                            break;
                        }
                    case 63:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            i15 = v(j12, t10);
                            h10 = CodedOutputStream.O0(i22, i15);
                            i20 += h10;
                            break;
                        }
                    case 64:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.X0(i22);
                            i20 += h10;
                            break;
                        }
                    case 65:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.Y0(i22);
                            i20 += h10;
                            break;
                        }
                    case 66:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            i16 = v(j12, t10);
                            h10 = CodedOutputStream.Z0(i22, i16);
                            i20 += h10;
                            break;
                        }
                    case 67:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            j11 = w(j12, t10);
                            h10 = CodedOutputStream.a1(j11, i22);
                            i20 += h10;
                            break;
                        }
                    case 68:
                        if (!r(i22, i25, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.S0(i22, (i0) unsafe.getObject(t10, j12), n(i25));
                            i20 += h10;
                            break;
                        }
                }
                i19 = i25 + 3;
            } else {
                b1<?, ?> b1Var = this.f4915o;
                int h11 = b1Var.h(b1Var.g(t10)) + i20;
                if (this.f4907f) {
                    return h11 + this.f4916p.c(t10).h();
                }
                return h11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e0, code lost:
        if (r4 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0319, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.ByteString) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(T t10) {
        int i10;
        long m10;
        long m11;
        int l2;
        Object n;
        int l4;
        int l7;
        int l10;
        long m12;
        int h10;
        int i11;
        int b12;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f4903a;
            if (i12 < iArr.length) {
                int F = F(i12);
                int i14 = (267386880 & F) >>> 20;
                int i15 = iArr[i12];
                long j2 = F & 1048575;
                if (i14 >= FieldType.f4788j.a() && i14 <= FieldType.f4789k.a()) {
                    i10 = iArr[i12 + 2] & 1048575;
                } else {
                    i10 = 0;
                }
                boolean z10 = this.f4910i;
                Unsafe unsafe = f4902s;
                switch (i14) {
                    case 0:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.N0(i15);
                        i13 += h10;
                        break;
                    case 1:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.R0(i15);
                        i13 += h10;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            m10 = f1.m(j2, t10);
                            h10 = CodedOutputStream.V0(m10, i15);
                            i13 += h10;
                            break;
                        }
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            m11 = f1.m(j2, t10);
                            h10 = CodedOutputStream.g1(m11, i15);
                            i13 += h10;
                            break;
                        }
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            l2 = f1.l(j2, t10);
                            h10 = CodedOutputStream.T0(i15, l2);
                            i13 += h10;
                            break;
                        }
                    case 5:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.Q0(i15);
                        i13 += h10;
                        break;
                    case 6:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.P0(i15);
                        i13 += h10;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.L0(i15);
                        i13 += h10;
                        break;
                    case 8:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            n = f1.n(j2, t10);
                            break;
                        }
                    case ma.i.f16046m /* 9 */:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = x0.o(i15, n(i12), f1.n(j2, t10));
                        i13 += h10;
                        break;
                    case ma.i.f16047o /* 10 */:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.M0(i15, (ByteString) f1.n(j2, t10));
                        i13 += h10;
                        break;
                    case 11:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            l4 = f1.l(j2, t10);
                            h10 = CodedOutputStream.e1(i15, l4);
                            i13 += h10;
                            break;
                        }
                    case 12:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            l7 = f1.l(j2, t10);
                            h10 = CodedOutputStream.O0(i15, l7);
                            i13 += h10;
                            break;
                        }
                    case 13:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.X0(i15);
                        i13 += h10;
                        break;
                    case 14:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.Y0(i15);
                        i13 += h10;
                        break;
                    case ma.i.f16049q /* 15 */:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            l10 = f1.l(j2, t10);
                            h10 = CodedOutputStream.Z0(i15, l10);
                            i13 += h10;
                            break;
                        }
                    case 16:
                        if (!q(i12, t10)) {
                            break;
                        } else {
                            m12 = f1.m(j2, t10);
                            h10 = CodedOutputStream.a1(m12, i15);
                            i13 += h10;
                            break;
                        }
                    case 17:
                        if (!q(i12, t10)) {
                            break;
                        }
                        h10 = CodedOutputStream.S0(i15, (i0) f1.n(j2, t10), n(i12));
                        i13 += h10;
                        break;
                    case 18:
                    case 23:
                    case 32:
                        h10 = x0.h(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        h10 = x0.f(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 20:
                        h10 = x0.m(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 21:
                        h10 = x0.x(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 22:
                        h10 = x0.k(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 25:
                        h10 = x0.a(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 26:
                        h10 = x0.u(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 27:
                        h10 = x0.p(i15, s(j2, t10), n(i12));
                        i13 += h10;
                        break;
                    case 28:
                        h10 = x0.c(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 29:
                        h10 = x0.v(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 30:
                        h10 = x0.d(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 33:
                        h10 = x0.q(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 34:
                        h10 = x0.s(i15, s(j2, t10));
                        i13 += h10;
                        break;
                    case 35:
                        i11 = x0.i((List) unsafe.getObject(t10, j2));
                        if (i11 <= 0) {
                            break;
                        }
                        break;
                    case 36:
                        i11 = x0.g((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i11 = x0.n((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i11 = x0.y((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i11 = x0.l((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i11 = x0.i((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i11 = x0.g((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i11 = x0.b((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i11 = x0.w((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i11 = x0.e((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i11 = x0.g((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i11 = x0.i((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i11 = x0.r((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i11 = x0.t((List) unsafe.getObject(t10, j2));
                        if (i11 > 0) {
                            if (z10) {
                                unsafe.putInt(t10, i10, i11);
                            }
                            i13 += CodedOutputStream.f1(i11) + CodedOutputStream.d1(i15) + i11;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        h10 = x0.j(i15, s(j2, t10), n(i12));
                        i13 += h10;
                        break;
                    case 50:
                        h10 = this.f4917q.b(f1.n(j2, t10), i15, m(i12));
                        i13 += h10;
                        break;
                    case 51:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.N0(i15);
                            i13 += h10;
                            break;
                        }
                    case 52:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.R0(i15);
                            i13 += h10;
                            break;
                        }
                    case 53:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            m10 = w(j2, t10);
                            h10 = CodedOutputStream.V0(m10, i15);
                            i13 += h10;
                            break;
                        }
                    case 54:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            m11 = w(j2, t10);
                            h10 = CodedOutputStream.g1(m11, i15);
                            i13 += h10;
                            break;
                        }
                    case 55:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            l2 = v(j2, t10);
                            h10 = CodedOutputStream.T0(i15, l2);
                            i13 += h10;
                            break;
                        }
                    case 56:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.Q0(i15);
                            i13 += h10;
                            break;
                        }
                    case 57:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.P0(i15);
                            i13 += h10;
                            break;
                        }
                    case 58:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.L0(i15);
                            i13 += h10;
                            break;
                        }
                    case 59:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            n = f1.n(j2, t10);
                            if (n instanceof ByteString) {
                                b12 = CodedOutputStream.M0(i15, (ByteString) n);
                                i13 += b12;
                                break;
                            }
                            b12 = CodedOutputStream.b1((String) n, i15);
                            i13 += b12;
                        }
                    case 60:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = x0.o(i15, n(i12), f1.n(j2, t10));
                            i13 += h10;
                            break;
                        }
                    case 61:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.M0(i15, (ByteString) f1.n(j2, t10));
                            i13 += h10;
                            break;
                        }
                    case 62:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            l4 = v(j2, t10);
                            h10 = CodedOutputStream.e1(i15, l4);
                            i13 += h10;
                            break;
                        }
                    case 63:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            l7 = v(j2, t10);
                            h10 = CodedOutputStream.O0(i15, l7);
                            i13 += h10;
                            break;
                        }
                    case 64:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.X0(i15);
                            i13 += h10;
                            break;
                        }
                    case 65:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.Y0(i15);
                            i13 += h10;
                            break;
                        }
                    case 66:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            l10 = v(j2, t10);
                            h10 = CodedOutputStream.Z0(i15, l10);
                            i13 += h10;
                            break;
                        }
                    case 67:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            m12 = w(j2, t10);
                            h10 = CodedOutputStream.a1(m12, i15);
                            i13 += h10;
                            break;
                        }
                    case 68:
                        if (!r(i15, i12, t10)) {
                            break;
                        } else {
                            h10 = CodedOutputStream.S0(i15, (i0) f1.n(j2, t10), n(i12));
                            i13 += h10;
                            break;
                        }
                }
                i12 += 3;
            } else {
                b1<?, ?> b1Var = this.f4915o;
                return b1Var.h(b1Var.g(t10)) + i13;
            }
        }
    }

    public final boolean q(int i10, Object obj) {
        int i11;
        boolean equals;
        if (this.f4909h) {
            int F = F(i10);
            long j2 = F & 1048575;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (f1.j(j2, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (f1.k(j2, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    if (f1.m(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    if (f1.m(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (f1.m(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return f1.f(j2, obj);
                case 8:
                    Object n = f1.n(j2, obj);
                    if (n instanceof String) {
                        equals = ((String) n).isEmpty();
                        break;
                    } else if (n instanceof ByteString) {
                        equals = ByteString.f4776j.equals(n);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case ma.i.f16046m /* 9 */:
                    if (f1.n(j2, obj) == null) {
                        return false;
                    }
                    return true;
                case ma.i.f16047o /* 10 */:
                    equals = ByteString.f4776j.equals(f1.n(j2, obj));
                    break;
                case 11:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (f1.m(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case ma.i.f16049q /* 15 */:
                    if (f1.l(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (f1.m(j2, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (f1.n(j2, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((f1.l(i11 & 1048575, obj) & (1 << (this.f4903a[i10 + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean r(int i10, int i11, Object obj) {
        if (f1.l(this.f4903a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    public final <K, V> void t(Object obj, int i10, Object obj2, m mVar, v0 v0Var) {
        long F = F(i10) & 1048575;
        Object n = f1.n(F, obj);
        d0 d0Var = this.f4917q;
        if (n == null) {
            n = d0Var.f();
            f1.u(F, obj, n);
        } else if (d0Var.c(n)) {
            MapFieldLite f10 = d0Var.f();
            d0Var.a(f10, n);
            f1.u(F, obj, f10);
            n = f10;
        }
        v0Var.b(d0Var.h(n), d0Var.e(obj2), mVar);
    }

    public final int x(int i10) {
        if (i10 < this.c || i10 > this.f4905d) {
            return -1;
        }
        int[] iArr = this.f4903a;
        int length = (iArr.length / 3) - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final <E> void y(Object obj, long j2, v0 v0Var, w0<E> w0Var, m mVar) {
        v0Var.A(this.n.c(j2, obj), w0Var, mVar);
    }

    public final <E> void z(Object obj, int i10, v0 v0Var, w0<E> w0Var, m mVar) {
        v0Var.F(this.n.c(i10 & 1048575, obj), w0Var, mVar);
    }
}
