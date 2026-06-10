package v8;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Build;
import android.text.TextPaint;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.q;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import b2.a;
import ba.i;
import com.noto.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.i0;
import m7.n;
import n4.b;
import n7.l;
import u9.j;
import w0.h;
import y3.m;
import y9.a0;
import y9.e0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f18175a = new h(0.31006f, 0.31616f);

    /* renamed from: b  reason: collision with root package name */
    public static final h f18176b = new h(0.34567f, 0.3585f);
    public static final h c = new h(0.32168f, 0.33767f);

    /* renamed from: d  reason: collision with root package name */
    public static final h f18177d = new h(0.31271f, 0.32902f);

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f18178e = {0.964212f, 1.0f, 0.825188f};

    /* renamed from: f  reason: collision with root package name */
    public static final b2.c f18179f = new b2.c(1.0f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f18180g = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    public static final long A(long j2, int i10, int i11) {
        int h10 = b2.a.h(j2) + i10;
        int i12 = 0;
        if (h10 < 0) {
            h10 = 0;
        }
        int f10 = b2.a.f(j2);
        if (f10 != Integer.MAX_VALUE && (f10 = f10 + i10) < 0) {
            f10 = 0;
        }
        int g10 = b2.a.g(j2) + i11;
        if (g10 < 0) {
            g10 = 0;
        }
        int e10 = b2.a.e(j2);
        if (e10 != Integer.MAX_VALUE && (e10 = e10 + i11) < 0) {
            return b(h10, f10, g10, i12);
        }
        i12 = e10;
        return b(h10, f10, g10, i12);
    }

    public static final Cursor B(RoomDatabase roomDatabase, m mVar) {
        v7.g.f(roomDatabase, "db");
        v7.g.f(mVar, "sqLiteQuery");
        return roomDatabase.n(mVar, null);
    }

    public static LinkedHashSet C(h9.e eVar, Collection collection, Collection collection2, l8.b bVar, j jVar, OverridingUtil overridingUtil, boolean z10) {
        if (eVar == null) {
            a(12);
            throw null;
        } else if (collection == null) {
            a(13);
            throw null;
        } else if (collection2 == null) {
            a(14);
            throw null;
        } else if (bVar == null) {
            a(15);
            throw null;
        } else if (jVar == null) {
            a(16);
            throw null;
        } else if (overridingUtil == null) {
            a(17);
            throw null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            overridingUtil.h(eVar, collection, collection2, bVar, new a(jVar, linkedHashSet, z10));
            return linkedHashSet;
        }
    }

    public static LinkedHashSet D(h9.e eVar, AbstractCollection abstractCollection, Collection collection, l8.b bVar, j jVar, OverridingUtil overridingUtil) {
        if (eVar == null) {
            a(0);
            throw null;
        } else if (collection == null) {
            a(2);
            throw null;
        } else if (bVar == null) {
            a(3);
            throw null;
        } else if (jVar == null) {
            a(4);
            throw null;
        } else if (overridingUtil != null) {
            return C(eVar, abstractCollection, collection, bVar, jVar, overridingUtil, false);
        } else {
            a(5);
            throw null;
        }
    }

    public static LinkedHashSet E(h9.e eVar, Collection collection, AbstractCollection abstractCollection, w8.c cVar, j jVar, OverridingUtil overridingUtil) {
        if (eVar == null) {
            a(6);
            throw null;
        } else if (collection == null) {
            a(7);
            throw null;
        } else if (cVar == null) {
            a(9);
            throw null;
        } else if (jVar == null) {
            a(10);
            throw null;
        } else if (overridingUtil != null) {
            return C(eVar, collection, abstractCollection, cVar, jVar, overridingUtil, true);
        } else {
            a(11);
            throw null;
        }
    }

    public static final void F(TextPaint textPaint, float f10) {
        v7.g.f(textPaint, "<this>");
        if (Float.isNaN(f10)) {
            return;
        }
        textPaint.setAlpha(m0.b.g1(a1.c.b0(f10, 0.0f, 1.0f) * 255));
    }

    public static final byte[] G(Set set) {
        v7.g.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b.a aVar = (b.a) it.next();
                objectOutputStream.writeUTF(aVar.f16083a.toString());
                objectOutputStream.writeBoolean(aVar.f16084b);
            }
            n nVar = n.f16010a;
            m0.b.D(objectOutputStream, null);
            m0.b.D(byteArrayOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            v7.g.e(byteArray, "outputStream.toByteArray()");
            return byteArray;
        } finally {
        }
    }

    public static final r H(i0 i0Var) {
        ArrayList arrayList;
        v7.g.f(i0Var, "<this>");
        l8.f c10 = i0Var.c();
        v7.g.e(c10, "this.containingDeclaration");
        if (c10 instanceof l8.e) {
            List<i0> e10 = ((l8.e) c10).o().e();
            v7.g.e(e10, "descriptor.typeConstructor.parameters");
            arrayList = new ArrayList(l.Z1(e10, 10));
            for (i0 i0Var2 : e10) {
                e0 o10 = i0Var2.o();
                v7.g.e(o10, "it.typeConstructor");
                arrayList.add(o10);
            }
        } else if (!(c10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        } else {
            List<i0> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.e) c10).getTypeParameters();
            v7.g.e(typeParameters, "descriptor.typeParameters");
            arrayList = new ArrayList(l.Z1(typeParameters, 10));
            for (i0 i0Var3 : typeParameters) {
                e0 o11 = i0Var3.o();
                v7.g.e(o11, "it.typeConstructor");
                arrayList.add(o11);
            }
        }
        List<r> upperBounds = i0Var.getUpperBounds();
        v7.g.e(upperBounds, "upperBounds");
        return i(arrayList, upperBounds, DescriptorUtilsKt.e(i0Var));
    }

    public static final int I(WorkInfo$State workInfo$State) {
        v7.g.f(workInfo$State, "state");
        int ordinal = workInfo$State.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static boolean J(ba.l lVar, ba.g gVar, ba.g gVar2) {
        if (lVar.i(gVar) == lVar.i(gVar2) && lVar.a0(gVar) == lVar.a0(gVar2)) {
            if ((lVar.O(gVar) == null) == (lVar.O(gVar2) == null) && lVar.N(lVar.d(gVar), lVar.d(gVar2))) {
                if (lVar.G(gVar, gVar2)) {
                    return true;
                }
                int i10 = lVar.i(gVar);
                for (int i11 = 0; i11 < i10; i11++) {
                    i m10 = lVar.m(gVar, i11);
                    i m11 = lVar.m(gVar2, i11);
                    if (lVar.h(m10) != lVar.h(m11)) {
                        return false;
                    }
                    if (!lVar.h(m10) && (lVar.U(m10) != lVar.U(m11) || !K(lVar, lVar.k(m10), lVar.k(m11)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean K(ba.l lVar, ba.f fVar, ba.f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        v f10 = lVar.f(fVar);
        v f11 = lVar.f(fVar2);
        if (f10 == null || f11 == null) {
            y9.n c0 = lVar.c0(fVar);
            y9.n c02 = lVar.c0(fVar2);
            return c0 != null && c02 != null && J(lVar, lVar.e(c0), lVar.e(c02)) && J(lVar, lVar.c(c0), lVar.c(c02));
        }
        return J(lVar, f10, f11);
    }

    public static final Locale L(w1.b bVar) {
        v7.g.f(bVar, "<this>");
        w1.d dVar = bVar.f18256a;
        v7.g.d(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((w1.a) dVar).f18255a;
    }

    public static final long M(long j2) {
        return a1.c.v((int) (j2 >> 32), b2.h.b(j2));
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
                objArr[0] = "classDescriptor";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case ma.i.f16047o /* 10 */:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static final long b(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (!(i13 >= i12)) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 >= 0 && i12 >= 0) {
            z10 = true;
        }
        if (z10) {
            return a.C0052a.b(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long c(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return b(0, i10, 0, i11);
    }

    public static final long d(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = b2.e.c;
        return floatToIntBits;
    }

    public static final long e(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = b2.f.c;
        return floatToIntBits;
    }

    public static final long f(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static x6.e g(long j2, long j10, long[] jArr, long[] jArr2, int i10) {
        return new x6.e(j2, (i10 & 2) != 0 ? 0L : j10, null, (i10 & 8) != 0 ? null : jArr, (i10 & 16) != 0 ? -1 : 0, false, false, jArr2);
    }

    public static void h(q qVar, StringBuilder sb) {
        String hexString;
        int lastIndexOf;
        if (qVar == null) {
            hexString = "null";
        } else {
            String simpleName = qVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = qVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(qVar));
        }
        sb.append(hexString);
    }

    public static final r i(ArrayList arrayList, List list, kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        r k3 = TypeSubstitutor.d(new a0(arrayList)).k((r) kotlin.collections.c.n2(list), Variance.OUT_VARIANCE);
        return k3 == null ? eVar.n() : k3;
    }

    /* JADX WARN: Finally extract failed */
    public static final LinkedHashSet j(byte[] bArr) {
        v7.g.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i10 = 0; i10 < readInt; i10++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        v7.g.e(parse, "uri");
                        linkedHashSet.add(new b.a(readBoolean, parse));
                    }
                    n nVar = n.f16010a;
                    m0.b.D(objectInputStream, null);
                } finally {
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            n nVar2 = n.f16010a;
            m0.b.D(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m0.b.D(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void l(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int n(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final long o(long j2, long j10) {
        return f(a1.c.c0((int) (j10 >> 32), b2.a.h(j2), b2.a.f(j2)), a1.c.c0(b2.h.b(j10), b2.a.g(j2), b2.a.e(j2)));
    }

    public static final int p(long j2, int i10) {
        return a1.c.c0(i10, b2.a.g(j2), b2.a.e(j2));
    }

    public static final int q(long j2, int i10) {
        return a1.c.c0(i10, b2.a.h(j2), b2.a.f(j2));
    }

    public static final void r(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        ListBuilder listBuilder = new ListBuilder();
        Cursor c10 = frameworkSQLiteDatabase.c("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (c10.moveToNext()) {
            try {
                listBuilder.add(c10.getString(0));
            } finally {
            }
        }
        n nVar = n.f16010a;
        m0.b.D(c10, null);
        a1.c.S(listBuilder);
        Iterator it = listBuilder.iterator();
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) it;
            if (aVar.hasNext()) {
                String str = (String) aVar.next();
                v7.g.e(str, "triggerName");
                if (ha.i.X0(str, "room_fts_content_sync_", false)) {
                    frameworkSQLiteDatabase.g("DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final void s(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) {
        Cursor c10 = frameworkSQLiteDatabase.c("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (c10.getCount() <= 0) {
                n nVar = n.f16010a;
                m0.b.D(c10, null);
                return;
            }
            StringBuilder sb = new StringBuilder();
            int count = c10.getCount();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c10.moveToNext()) {
                if (c10.isFirst()) {
                    sb.append("Foreign key violation(s) detected in '");
                    sb.append(c10.getString(0));
                    sb.append("'.\n");
                }
                String string = c10.getString(3);
                if (!linkedHashMap.containsKey(string)) {
                    v7.g.e(string, "constraintIndex");
                    String string2 = c10.getString(2);
                    v7.g.e(string2, "cursor.getString(2)");
                    linkedHashMap.put(string, string2);
                }
            }
            sb.append("Number of different violations discovered: ");
            sb.append(linkedHashMap.keySet().size());
            sb.append("\nNumber of rows in violation: ");
            sb.append(count);
            sb.append("\nViolation(s) detected in the following constraint(s):\n");
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb.append("\tParent Table = ");
                sb.append((String) entry.getValue());
                sb.append(", Foreign Key Constraint Index = ");
                sb.append((String) entry.getKey());
                sb.append("\n");
            }
            String sb2 = sb.toString();
            v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SQLiteConstraintException(sb2);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m0.b.D(c10, th);
                throw th2;
            }
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.h t(h9.e eVar, l8.b bVar) {
        if (eVar == null) {
            a(19);
            throw null;
        } else if (bVar == null) {
            a(20);
            throw null;
        } else {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = bVar.J();
            if (J.size() != 1) {
                return null;
            }
            for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : J.iterator().next().m()) {
                if (hVar.getName().equals(eVar)) {
                    return hVar;
                }
            }
            return null;
        }
    }

    public static final BackoffPolicy u(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return BackoffPolicy.LINEAR;
            }
            throw new IllegalArgumentException(a4.b.i("Could not convert ", i10, " to BackoffPolicy"));
        }
        return BackoffPolicy.EXPONENTIAL;
    }

    public static final NetworkType v(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return NetworkType.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(a4.b.i("Could not convert ", i10, " to NetworkType"));
                        }
                        return NetworkType.METERED;
                    }
                    return NetworkType.NOT_ROAMING;
                }
                return NetworkType.UNMETERED;
            }
            return NetworkType.CONNECTED;
        }
        return NetworkType.NOT_REQUIRED;
    }

    public static final OutOfQuotaPolicy w(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(a4.b.i("Could not convert ", i10, " to OutOfQuotaPolicy"));
        }
        return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static final WorkInfo$State x(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return WorkInfo$State.CANCELLED;
                            }
                            throw new IllegalArgumentException(a4.b.i("Could not convert ", i10, " to State"));
                        }
                        return WorkInfo$State.BLOCKED;
                    }
                    return WorkInfo$State.FAILED;
                }
                return WorkInfo$State.SUCCEEDED;
            }
            return WorkInfo$State.RUNNING;
        }
        return WorkInfo$State.ENQUEUED;
    }

    public static final float y(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int z(NetworkType networkType) {
        v7.g.f(networkType, "networkType");
        int ordinal = networkType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
