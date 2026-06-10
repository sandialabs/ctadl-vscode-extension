package ma;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.navigation.t;
import androidx.navigation.u;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import b6.g;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.SortingOrder;
import j1.b0;
import j1.p;
import j1.q;
import ja.f0;
import ja.l1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.l;
import l8.i0;
import m3.a;
import o4.x;
import u1.m;
import u1.n;
import u1.r;
import u7.s;
import ua.k0;
import v7.g;
import w6.o;
import x6.y;
import y9.c0;
import y9.h0;

/* loaded from: classes.dex */
public class i implements z3.a, r, w1.e, x9.g {

    /* renamed from: m  reason: collision with root package name */
    public static final int f16046m = 9;
    public static final int n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f16047o = 10;

    /* renamed from: p  reason: collision with root package name */
    public static final int f16048p = 5;

    /* renamed from: q  reason: collision with root package name */
    public static final int f16049q = 15;

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f16036b = new kotlinx.coroutines.internal.r("NULL");
    public static final kotlinx.coroutines.internal.r c = new kotlinx.coroutines.internal.r("UNINITIALIZED");

    /* renamed from: d  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.r f16037d = new kotlinx.coroutines.internal.r("DONE");

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f16038e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f16039f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f16040g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    public static final float[][] f16041h = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: i  reason: collision with root package name */
    public static final float[][] f16042i = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f16043j = {95.047f, 100.0f, 108.883f};

    /* renamed from: k  reason: collision with root package name */
    public static final float[][] f16044k = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: l  reason: collision with root package name */
    public static final qa.b[] f16045l = new qa.b[0];

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f16050r = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f16051s = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f16052t = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f16053u = {R.attr.startDestination};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f16054v = {16842753, 16842960};

    /* renamed from: w  reason: collision with root package name */
    public static final Object[] f16055w = new Object[0];

    /* renamed from: x  reason: collision with root package name */
    public static final i f16056x = new i();

    public static final void A() {
        b2.i.b(0L);
    }

    public static float B(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final a.C0185a C(String str) {
        v7.g.f(str, "name");
        return new a.C0185a(str);
    }

    public static final void D(Context context) {
        Map K1;
        StringBuilder sb;
        File file;
        v7.g.f(context, "context");
        File y10 = y(context);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && y10.exists()) {
            n4.g.d().a(x.f16355a, "Migrating WorkDatabase to the no-backup directory");
            if (i10 >= 23) {
                File y11 = y(context);
                if (i10 < 23) {
                    file = y(context);
                } else {
                    file = new File(o4.a.f16276a.a(context), "androidx.work.workdb");
                }
                String[] strArr = x.f16356b;
                int O0 = m0.b.O0(strArr.length);
                if (O0 < 16) {
                    O0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
                for (String str : strArr) {
                    linkedHashMap.put(new File(y11.getPath() + str), new File(file.getPath() + str));
                }
                Pair pair = new Pair(y11, file);
                if (linkedHashMap.isEmpty()) {
                    K1 = m0.b.P0(pair);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(y11, file);
                    K1 = linkedHashMap2;
                }
            } else {
                K1 = kotlin.collections.d.K1();
            }
            for (Map.Entry entry : K1.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        n4.g.d().g(x.f16355a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        sb = new StringBuilder("Migrated ");
                        sb.append(file2);
                        sb.append("to ");
                        sb.append(file3);
                    } else {
                        sb = new StringBuilder("Renaming ");
                        sb.append(file2);
                        sb.append(" to ");
                        sb.append(file3);
                        sb.append(" failed");
                    }
                    n4.g.d().a(x.f16355a, sb.toString());
                }
            }
        }
    }

    public static final t E(u7.l lVar) {
        v7.g.g(lVar, "optionsBuilder");
        u uVar = new u();
        lVar.U(uVar);
        t.a aVar = uVar.f5539a;
        aVar.getClass();
        int i10 = uVar.f5540b;
        boolean z10 = uVar.c;
        aVar.getClass();
        aVar.getClass();
        return new t(false, i10, z10, aVar.f5536a, aVar.f5537b, aVar.c, aVar.f5538d);
    }

    public static byte[] F(int i10, InputStream inputStream) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(androidx.activity.e.g("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] G(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i13 += inflater.inflate(bArr, i13, i11 - i13);
                        i12 += read;
                    } catch (DataFormatException e10) {
                        throw new IllegalStateException(e10.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static long H(int i10, InputStream inputStream) {
        byte[] F = F(i10, inputStream);
        long j2 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j2 += (F[i11] & 255) << (i11 * 8);
        }
        return j2;
    }

    public static int I(InputStream inputStream) {
        return (int) H(2, inputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.types.l J(kotlin.reflect.jvm.internal.impl.types.l lVar, m8.e eVar) {
        kotlin.reflect.jvm.internal.impl.types.l c10;
        v7.g.f(lVar, "<this>");
        if (kotlin.reflect.jvm.internal.impl.types.d.a(lVar) == eVar) {
            return lVar;
        }
        boolean z10 = false;
        c8.j<Object> jVar = kotlin.reflect.jvm.internal.impl.types.d.f15005a[0];
        da.g gVar = kotlin.reflect.jvm.internal.impl.types.d.f15006b;
        gVar.getClass();
        v7.g.f(jVar, "property");
        y9.c cVar = (y9.c) lVar.c().get(gVar.f10475b);
        if (cVar != null) {
            if (!lVar.isEmpty()) {
                Iterable iterable = lVar.f10480i;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!v7.g.a((c0) obj, cVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != lVar.f10480i.c()) {
                    kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
                    c10 = l.a.c(arrayList);
                    if (c10 == null) {
                        lVar = c10;
                    }
                }
            }
            c10 = lVar;
            if (c10 == null) {
            }
        }
        if (!eVar.iterator().hasNext() && eVar.isEmpty()) {
            return lVar;
        }
        y9.c cVar2 = new y9.c(eVar);
        if (lVar.f10480i.get(kotlin.reflect.jvm.internal.impl.types.l.f15045j.b(cVar2.b())) != null) {
            z10 = true;
        }
        if (!z10) {
            if (lVar.isEmpty()) {
                return new kotlin.reflect.jvm.internal.impl.types.l(a1.c.N0(cVar2));
            }
            return l.a.c(kotlin.collections.c.A2(kotlin.collections.c.L2(lVar), cVar2));
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1] */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 K(final float f10, final v.f fVar, final LayoutOrientation layoutOrientation, final s sVar) {
        v7.g.f(sVar, "arrangement");
        return new q() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            public final /* synthetic */ SizeMode c = SizeMode.Wrap;

            /* JADX WARN: Removed duplicated region for block: B:127:0x021b  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x021d  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0220  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0222  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x022c A[LOOP:2: B:133:0x022a->B:134:0x022c, LOOP_END] */
            @Override // j1.q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final j1.r a(j1.t tVar, List<? extends p> list, long j2) {
                int g10;
                int e10;
                int h10;
                int f11;
                int i10;
                float f12;
                int i11;
                v.q[] qVarArr;
                int i12;
                int i13;
                v.q[] qVarArr2;
                float f13;
                boolean z10;
                int i14;
                int i15;
                long b5;
                int i16;
                int i17;
                float f14;
                int max;
                int i18;
                int i19;
                int size;
                int i20;
                j1.r m02;
                float f15;
                int i21;
                long b10;
                int i22;
                int i23;
                int i24;
                int i25;
                int max2;
                v.q qVar;
                List<? extends p> list2 = list;
                g.f(tVar, "$this$measure");
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                LayoutOrientation layoutOrientation3 = layoutOrientation;
                if (layoutOrientation3 == layoutOrientation2) {
                    g10 = b2.a.h(j2);
                } else {
                    g10 = b2.a.g(j2);
                }
                if (layoutOrientation3 == layoutOrientation2) {
                    e10 = b2.a.f(j2);
                } else {
                    e10 = b2.a.e(j2);
                }
                if (layoutOrientation3 == layoutOrientation2) {
                    h10 = b2.a.g(j2);
                } else {
                    h10 = b2.a.h(j2);
                }
                if (layoutOrientation3 == layoutOrientation2) {
                    f11 = b2.a.e(j2);
                } else {
                    f11 = b2.a.f(j2);
                }
                int a02 = tVar.a0(f10);
                b0[] b0VarArr = new b0[list.size()];
                int size2 = list.size();
                v.q[] qVarArr3 = new v.q[size2];
                for (int i26 = 0; i26 < size2; i26++) {
                    Object n10 = list2.get(i26).n();
                    if (n10 instanceof v.q) {
                        qVar = (v.q) n10;
                    } else {
                        qVar = null;
                    }
                    qVarArr3[i26] = qVar;
                }
                int size3 = list.size();
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                float f16 = 0.0f;
                while (i27 < size3) {
                    int i32 = size3;
                    p pVar = list2.get(i27);
                    v.q qVar2 = qVarArr3[i27];
                    if (qVar2 != null) {
                        f15 = qVar2.f18075a;
                    } else {
                        f15 = 0.0f;
                    }
                    if (f15 > 0.0f) {
                        f16 += f15;
                        i29++;
                        int i33 = i28;
                        i25 = h10;
                        max2 = i33;
                    } else {
                        if (e10 == Integer.MAX_VALUE) {
                            i21 = Integer.MAX_VALUE;
                        } else {
                            i21 = e10 - i30;
                        }
                        g.f(layoutOrientation3, "orientation");
                        if (layoutOrientation3 == layoutOrientation2) {
                            b10 = v8.b.b(0, i21, 0, f11);
                        } else {
                            b10 = v8.b.b(0, f11, 0, i21);
                        }
                        b0 b11 = pVar.b(b10);
                        int i34 = e10 - i30;
                        if (layoutOrientation3 == layoutOrientation2) {
                            i22 = b11.f12640i;
                        } else {
                            i22 = b11.f12641j;
                        }
                        int min = Math.min(a02, i34 - i22);
                        if (layoutOrientation3 == layoutOrientation2) {
                            i23 = b11.f12640i;
                        } else {
                            i23 = b11.f12641j;
                        }
                        int i35 = i23 + min + i30;
                        if (layoutOrientation3 == layoutOrientation2) {
                            i31 = min;
                            i24 = b11.f12641j;
                        } else {
                            i31 = min;
                            i24 = b11.f12640i;
                        }
                        int i36 = i28;
                        i25 = h10;
                        max2 = Math.max(i36, i24);
                        b0VarArr[i27] = b11;
                        i30 = i35;
                    }
                    i27++;
                    size3 = i32;
                    int i37 = i25;
                    i28 = max2;
                    h10 = i37;
                }
                int i38 = i28;
                int i39 = h10;
                if (i29 == 0) {
                    i30 -= i31;
                    i11 = i38;
                    qVarArr = qVarArr3;
                    i12 = 0;
                } else {
                    int i40 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                    if (i40 > 0 && e10 != Integer.MAX_VALUE) {
                        i10 = e10;
                    } else {
                        i10 = g10;
                    }
                    int i41 = (i29 - 1) * a02;
                    int i42 = (i10 - i30) - i41;
                    if (i40 > 0) {
                        f12 = i42 / f16;
                    } else {
                        f12 = 0.0f;
                    }
                    int i43 = 0;
                    for (int i44 = 0; i44 < size2; i44++) {
                        v.q qVar3 = qVarArr3[i44];
                        if (qVar3 != null) {
                            f14 = qVar3.f18075a;
                        } else {
                            f14 = 0.0f;
                        }
                        i43 += m0.b.g1(f14 * f12);
                    }
                    int i45 = i42 - i43;
                    int size4 = list.size();
                    i11 = i38;
                    int i46 = 0;
                    int i47 = 0;
                    while (i46 < size4) {
                        if (b0VarArr[i46] == null) {
                            p pVar2 = list2.get(i46);
                            v.q qVar4 = qVarArr3[i46];
                            if (qVar4 != null) {
                                i13 = size4;
                                f13 = qVar4.f18075a;
                            } else {
                                i13 = size4;
                                f13 = 0.0f;
                            }
                            boolean z11 = true;
                            if (f13 > 0.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (i45 < 0) {
                                    i14 = -1;
                                } else if (i45 > 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                int i48 = i45 - i14;
                                int max3 = Math.max(0, m0.b.g1(f13 * f12) + i14);
                                if (qVar4 != null) {
                                    z11 = qVar4.f18076b;
                                }
                                if (z11 && max3 != Integer.MAX_VALUE) {
                                    i15 = max3;
                                } else {
                                    i15 = 0;
                                }
                                g.f(layoutOrientation3, "orientation");
                                if (layoutOrientation3 == layoutOrientation2) {
                                    b5 = v8.b.b(i15, max3, 0, f11);
                                } else {
                                    b5 = v8.b.b(0, f11, i15, max3);
                                }
                                qVarArr2 = qVarArr3;
                                b0 b12 = pVar2.b(b5);
                                if (layoutOrientation3 == layoutOrientation2) {
                                    i16 = b12.f12640i;
                                } else {
                                    i16 = b12.f12641j;
                                }
                                int i49 = i16 + i47;
                                if (layoutOrientation3 == layoutOrientation2) {
                                    i17 = b12.f12641j;
                                } else {
                                    i17 = b12.f12640i;
                                }
                                i11 = Math.max(i11, i17);
                                b0VarArr[i46] = b12;
                                i45 = i48;
                                i47 = i49;
                            } else {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                        } else {
                            i13 = size4;
                            qVarArr2 = qVarArr3;
                        }
                        i46++;
                        list2 = list;
                        size4 = i13;
                        qVarArr3 = qVarArr2;
                    }
                    qVarArr = qVarArr3;
                    i12 = i47 + i41;
                    int i50 = e10 - i30;
                    if (i12 > i50) {
                        i12 = i50;
                    }
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                int max4 = Math.max(i30 + i12, g10);
                if (f11 != Integer.MAX_VALUE) {
                    if (this.c == SizeMode.Expand) {
                        max = f11;
                        if (layoutOrientation3 != layoutOrientation2) {
                            i18 = max4;
                        } else {
                            i18 = max;
                        }
                        if (layoutOrientation3 != layoutOrientation2) {
                            i19 = max;
                        } else {
                            i19 = max4;
                        }
                        size = list.size();
                        int[] iArr = new int[size];
                        for (i20 = 0; i20 < size; i20++) {
                            iArr[i20] = 0;
                        }
                        m02 = tVar.m0(i18, i19, d.K1(), new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, b0VarArr, sVar, max4, tVar, iArr, layoutOrientation, qVarArr, fVar, max, ref$IntRef));
                        return m02;
                    }
                }
                max = Math.max(i11, Math.max(i39, ref$IntRef.f13058i + 0));
                if (layoutOrientation3 != layoutOrientation2) {
                }
                if (layoutOrientation3 != layoutOrientation2) {
                }
                size = list.size();
                int[] iArr2 = new int[size];
                while (i20 < size) {
                }
                m02 = tVar.m0(i18, i19, d.K1(), new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, b0VarArr, sVar, max4, tVar, iArr2, layoutOrientation, qVarArr, fVar, max, ref$IntRef));
                return m02;
            }
        };
    }

    public static void L(View view) {
        Drawable background = view.getBackground();
        if (background instanceof b6.g) {
            M(view, (b6.g) background);
        }
    }

    public static void M(View view, b6.g gVar) {
        boolean z10;
        r5.a aVar = gVar.f6391i.f6410b;
        if (aVar != null && aVar.f17066a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                f10 += j0.i.i((View) parent);
            }
            g.b bVar = gVar.f6391i;
            if (bVar.f6420m != f10) {
                bVar.f6420m = f10;
                gVar.v();
            }
        }
    }

    public static final a.C0185a N(String str) {
        v7.g.f(str, "name");
        return new a.C0185a(str);
    }

    public static final Object[] O(Collection collection) {
        v7.g.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = f16055w;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                v7.g.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                v7.g.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static final Object[] P(Collection collection, Object[] objArr) {
        Object[] objArr2;
        v7.g.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            v7.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                v7.g.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                v7.g.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static final kotlin.reflect.jvm.internal.impl.types.l Q(m8.e eVar) {
        v7.g.f(eVar, "<this>");
        if (eVar.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
            return kotlin.reflect.jvm.internal.impl.types.l.f15046k;
        }
        l.a aVar = kotlin.reflect.jvm.internal.impl.types.l.f15045j;
        List N0 = a1.c.N0(new y9.c(eVar));
        aVar.getClass();
        return l.a.c(N0);
    }

    public static final FilteringType R(int i10) {
        FilteringType[] values;
        for (FilteringType filteringType : FilteringType.values()) {
            if (filteringType.ordinal() == i10) {
                return filteringType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final GroupingOrder S(int i10) {
        GroupingOrder[] values;
        for (GroupingOrder groupingOrder : GroupingOrder.values()) {
            if (groupingOrder.ordinal() == i10) {
                return groupingOrder;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final NotoColor T(int i10) {
        NotoColor[] values;
        for (NotoColor notoColor : NotoColor.values()) {
            if (notoColor.ordinal() == i10) {
                return notoColor;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final SortingOrder U(int i10) {
        SortingOrder[] values;
        for (SortingOrder sortingOrder : SortingOrder.values()) {
            if (sortingOrder.ordinal() == i10) {
                return sortingOrder;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static String V(int i10) {
        if (i10 == 0) {
            return "Blocking";
        }
        if (i10 == 1) {
            return "Optional";
        }
        if (i10 == 2) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public static final void W(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, long j2, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j2 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        X(byteArrayOutputStream, i10, 2);
    }

    public static float Z() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final b2.c c(Context context) {
        return new b2.c(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    public static final ua.j0 e(String str, qa.b bVar) {
        return new ua.j0(str, new k0(bVar));
    }

    public static final long g(int i10, int i11) {
        long j2 = (i11 & 4294967295L) | (i10 << 32);
        int i12 = b2.g.c;
        return j2;
    }

    public static final int i(WorkDatabase workDatabase, String str) {
        int i10;
        Long a10 = workDatabase.s().a(str);
        int i11 = 0;
        if (a10 != null) {
            i10 = (int) a10.longValue();
        } else {
            i10 = 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            i11 = i10 + 1;
        }
        workDatabase.s().b(new w4.d(str, Long.valueOf(i11)));
        return i10;
    }

    public static final void j(ta.d dVar) {
        va.i iVar;
        v7.g.f(dVar, "<this>");
        if (dVar instanceof va.i) {
            iVar = (va.i) dVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + v7.i.a(dVar.getClass()));
    }

    public static o k(long j2, long j10, long[] jArr) {
        return new o(j2, j10, false, false, jArr);
    }

    public static w6.p l(long j2, long j10, long[] jArr, int i10) {
        return new w6.p(j2, (i10 & 2) != 0 ? 0L : j10, null, null, (i10 & 16) != 0 ? -1 : 0, false, false, jArr);
    }

    public static x6.x m(long j2, long j10, boolean z10, boolean z11, long[] jArr, int i10) {
        boolean z12;
        boolean z13;
        if ((i10 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        v7.g.f(jArr, "selectedNoteIds");
        return new x6.x(j2, j10, z12, z13, jArr);
    }

    public static y n(long j2, long j10, long[] jArr, long[] jArr2, int i10) {
        long j11;
        long[] jArr3;
        int i11;
        if ((i10 & 2) != 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        if ((i10 & 8) != 0) {
            jArr3 = null;
        } else {
            jArr3 = jArr;
        }
        if ((i10 & 16) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        v7.g.f(jArr2, "selectedNoteIds");
        return new y(j2, j11, null, jArr3, i11, false, false, jArr2);
    }

    public static final va.f o(ta.c cVar) {
        v7.g.f(cVar, "<this>");
        va.f fVar = cVar instanceof va.f ? (va.f) cVar : null;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + v7.i.a(cVar.getClass()));
    }

    public static int p(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int q(long[] jArr, int i10, long j2) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j2 ? 1 : (jArr[i13] == j2 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static byte[] r(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static BoringLayout t(CharSequence charSequence, x1.a aVar, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        v7.g.f(charSequence, "text");
        v7.g.f(aVar, "paint");
        v7.g.f(alignment, "alignment");
        if (i10 >= 0) {
            if (i11 >= 0) {
                return v2.a.a() ? q1.b.a(charSequence, aVar, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : q1.c.a(charSequence, aVar, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface u(String str, m mVar, int i10) {
        boolean z10;
        Typeface create;
        Typeface create2;
        String str2;
        boolean z11;
        boolean z12 = true;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && v7.g.a(mVar, m.n)) {
            if (str != null && str.length() != 0) {
                z11 = false;
                if (z11) {
                    create2 = Typeface.DEFAULT;
                    str2 = "DEFAULT";
                    v7.g.e(create2, str2);
                    return create2;
                }
            }
            z11 = true;
            if (z11) {
            }
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i11 = mVar.f17759i;
        if (i10 != 1) {
            z12 = false;
        }
        create2 = Typeface.create(create, i11, z12);
        str2 = "create(\n            fami…ontStyle.Italic\n        )";
        v7.g.e(create2, str2);
        return create2;
    }

    public static m0.b v(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new b6.j();
            }
            return new b6.d();
        }
        return new b6.j();
    }

    public static final RoomDatabase.a w(Context context, Class cls, String str) {
        if (!(ha.i.T0(str))) {
            return new RoomDatabase.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final w4.l x(w4.s sVar) {
        v7.g.f(sVar, "<this>");
        return new w4.l(sVar.f18334a, sVar.f18351t);
    }

    public static File y(Context context) {
        v7.g.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        v7.g.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public static final LifecycleCoroutineScopeImpl z(androidx.lifecycle.q qVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        v7.g.f(qVar, "<this>");
        androidx.lifecycle.r i02 = qVar.i0();
        v7.g.f(i02, "<this>");
        while (true) {
            AtomicReference<Object> atomicReference = i02.f5315a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                l1 l1Var = new l1(null);
                kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(i02, l1Var.m(kotlinx.coroutines.internal.l.f15491a.W()));
                while (true) {
                    if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    lifecycleCoroutineScopeImpl.e();
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    @Override // w1.e
    public List a() {
        Locale locale = Locale.getDefault();
        v7.g.e(locale, "getDefault()");
        return a1.c.N0(new w1.a(locale));
    }

    @Override // w1.e
    public w1.a b(String str) {
        v7.g.f(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        v7.g.e(forLanguageTag, "forLanguageTag(languageTag)");
        return new w1.a(forLanguageTag);
    }

    @Override // u1.r
    public Typeface d(n nVar, m mVar, int i10) {
        v7.g.f(nVar, "name");
        v7.g.f(mVar, "fontWeight");
        return u(nVar.f17760k, mVar, i10);
    }

    @Override // z3.a
    public /* synthetic */ void f(c4.b bVar) {
    }

    @Override // u1.r
    public Typeface h(m mVar, int i10) {
        v7.g.f(mVar, "fontWeight");
        return u(null, mVar, i10);
    }

    @Override // x9.g
    public void lock() {
    }

    public y9.f0 s(i0 i0Var, y9.m mVar, kotlin.reflect.jvm.internal.impl.types.p pVar, y9.r rVar) {
        v7.g.f(mVar, "typeAttr");
        v7.g.f(pVar, "typeParameterUpperBoundEraser");
        v7.g.f(rVar, "erasedUpperBound");
        return new h0(rVar, Variance.OUT_VARIANCE);
    }

    @Override // x9.g
    public void unlock() {
    }
}
