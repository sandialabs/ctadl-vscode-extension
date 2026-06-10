package m0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.NodeLocationHolder;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.style.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.o0;
import com.noto.R;
import com.noto.app.NotoThemeKt;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.OpenNotesIn;
import d9.d;
import d9.l;
import g0.d;
import g0.t0;
import g0.z0;
import g1.u;
import ha.i;
import j1.a0;
import j1.k;
import j1.o;
import j1.v;
import j1.x;
import j1.y;
import ja.a1;
import ja.c0;
import ja.d0;
import ja.k0;
import ja.k1;
import ja.n1;
import ja.p0;
import ja.p1;
import ja.r1;
import ja.w;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.LockSupport;
import k8.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ThreadContextKt;
import l1.b0;
import l1.e0;
import l1.h0;
import l8.i0;
import l8.s;
import l8.w;
import n1.a;
import o.a;
import org.xmlpull.v1.XmlPullParserException;
import p1.a;
import p7.d;
import q0.a;
import q0.d;
import s0.f;
import sa.e;
import t.h;
import u1.e;
import u1.m;
import u1.r;
import u1.t;
import u7.p;
import u7.q;
import u9.j;
import v.c;
import v0.z;
import v7.g;
import y9.f0;
import y9.m0;
import y9.n;
import z0.c;

/* loaded from: classes.dex */
public class b implements o0, z3.a, j, h, r, c {

    /* renamed from: b  reason: collision with root package name */
    public static final b f15890b = new b();
    public static final p7.c[] c = new p7.c[0];

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f15891d = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: e  reason: collision with root package name */
    public static final b f15892e = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f15893f = {16842755, 16842960, 16842961};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f15894g = {16842755, 16842961};

    /* renamed from: h  reason: collision with root package name */
    public static final b f15895h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f15896i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public static final Object[] f15897j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f15898k = new e[0];

    /* renamed from: l  reason: collision with root package name */
    public static final b f15899l = new b();

    public /* synthetic */ b() {
    }

    public static final int A(d.b bVar) {
        g.f(bVar, "element");
        int i10 = bVar instanceof k ? 3 : 1;
        if (bVar instanceof j1.e) {
            i10 |= 512;
        }
        if (bVar instanceof f) {
            i10 |= 4;
        }
        if (bVar instanceof o1.k) {
            i10 |= 8;
        }
        if (bVar instanceof u) {
            i10 |= 16;
        }
        if ((bVar instanceof k1.d) || (bVar instanceof k1.f) || (bVar instanceof t0.e)) {
            i10 |= 32;
        }
        if (bVar instanceof v) {
            i10 |= 256;
        }
        if (bVar instanceof a0) {
            i10 |= 64;
        }
        return ((bVar instanceof x) || (bVar instanceof y) || (bVar instanceof o)) ? i10 | 128 : i10;
    }

    public static final boolean A0(e0 e0Var) {
        g.f(e0Var, "<this>");
        return e0Var.e().f16830o;
    }

    public static final Map A1(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        g.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final String B(String str) {
        g.f(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z10 = true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            g.e(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final boolean B0(FocusModifier focusModifier) {
        boolean z10;
        boolean z11;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        g.f(focusModifier, "<this>");
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator != null && (layoutNode2 = nodeCoordinator.f3499o) != null && layoutNode2.A) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (nodeCoordinator != null && (layoutNode = nodeCoordinator.f3499o) != null && layoutNode.z()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static final TreeMap B1(LinkedHashMap linkedHashMap, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }

    public static final int C(float f10) {
        return (int) Math.ceil(f10);
    }

    public static final boolean C0(l8.v vVar, h9.c cVar) {
        g.f(vVar, "<this>");
        g.f(cVar, "fqName");
        return vVar instanceof w ? ((w) vVar).c(cVar) : T0(vVar, cVar).isEmpty();
    }

    public static final m7.h C1(String str) {
        int i10;
        int i11;
        a1.b.v(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        if (g.h(charAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int i13 = 119304647;
        int i14 = 119304647;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            int i15 = i12 ^ Integer.MIN_VALUE;
            if (Integer.compare(i15, i14 ^ Integer.MIN_VALUE) > 0) {
                if (i14 == i13) {
                    i11 = i10;
                    i14 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i15, i14 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i11 = i10;
            int i16 = i12 * 10;
            int i17 = i16 + digit;
            if (Integer.compare(i17 ^ Integer.MIN_VALUE, i16 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10 = i11 + 1;
            i12 = i17;
            i13 = 119304647;
        }
        return new m7.h(i12);
    }

    public static final void D(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a1.c.M(th, th2);
            }
        }
    }

    public static final boolean D0(y9.r rVar) {
        g.f(rVar, "<this>");
        m0 X0 = rVar.X0();
        if (!(X0 instanceof aa.f) && (!(X0 instanceof n) || !(((n) X0).b1() instanceof aa.f))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m7.j D1(String str) {
        int i10;
        int i11;
        long j2;
        g.f(str, "<this>");
        int i12 = 10;
        a1.b.v(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            if (g.h(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            long j10 = 10;
            long j11 = 0;
            long j12 = 0;
            long j13 = 512409557603043100L;
            while (i10 < length) {
                int digit = Character.digit((int) str.charAt(i10), i12);
                if (digit >= 0) {
                    int i13 = length;
                    long j14 = j12 ^ Long.MIN_VALUE;
                    int i14 = i10;
                    if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                        if (j13 == 512409557603043100L) {
                            if (j10 < j11) {
                                if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                                    j13 = j11;
                                    if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                                    }
                                } else {
                                    j2 = 1;
                                }
                            } else {
                                long j15 = (Long.MAX_VALUE / j10) << 1;
                                if ((((-1) - (j15 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE)) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                j2 = j15 + i11;
                            }
                            j13 = j2;
                            if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                            }
                        }
                    }
                    long j16 = j12 * j10;
                    long j17 = (digit & 4294967295L) + j16;
                    if (Long.compare(j17 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE) >= 0) {
                        i10 = i14 + 1;
                        j12 = j17;
                        length = i13;
                        i12 = 10;
                        j11 = 0;
                    }
                }
            }
            return new m7.j(j12);
        }
        return null;
    }

    public static final o1.j E(h0 h0Var) {
        g.f(h0Var, "<this>");
        d.c cVar = h0Var.e().f16829m;
        d.c cVar2 = null;
        if (cVar != null && (cVar.f16827k & 8) != 0) {
            while (cVar != null) {
                if ((cVar.f16826j & 8) != 0) {
                    break;
                }
                cVar = cVar.f16829m;
            }
        }
        cVar = null;
        if (cVar instanceof h0) {
            cVar2 = cVar;
        }
        h0 h0Var2 = (h0) cVar2;
        if (h0Var2 != null && !h0Var.t().f16208k) {
            o1.j t10 = h0Var.t();
            t10.getClass();
            o1.j jVar = new o1.j();
            jVar.f16207j = t10.f16207j;
            jVar.f16208k = t10.f16208k;
            jVar.f16206i.putAll(t10.f16206i);
            o1.j E = E(h0Var2);
            g.f(E, "peer");
            if (E.f16207j) {
                jVar.f16207j = true;
            }
            if (E.f16208k) {
                jVar.f16208k = true;
            }
            for (Map.Entry entry : E.f16206i.entrySet()) {
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) entry.getKey();
                Object value = entry.getValue();
                LinkedHashMap linkedHashMap = jVar.f16206i;
                if (!linkedHashMap.containsKey(aVar)) {
                    linkedHashMap.put(aVar, value);
                } else if (value instanceof o1.a) {
                    Object obj = linkedHashMap.get(aVar);
                    g.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                    o1.a aVar2 = (o1.a) obj;
                    String str = aVar2.f16184a;
                    if (str == null) {
                        str = ((o1.a) value).f16184a;
                    }
                    m7.c cVar3 = aVar2.f16185b;
                    if (cVar3 == null) {
                        cVar3 = ((o1.a) value).f16185b;
                    }
                    linkedHashMap.put(aVar, new o1.a(str, cVar3));
                }
            }
            return jVar;
        }
        return h0Var.t();
    }

    public static final boolean E0(long j2) {
        return ((int) (j2 & 4294967295L)) != 0;
    }

    public static final Class E1(ClassLoader classLoader, String str) {
        g.f(classLoader, "<this>");
        g.f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final void F(l8.v vVar, h9.c cVar, ArrayList arrayList) {
        g.f(vVar, "<this>");
        g.f(cVar, "fqName");
        if (vVar instanceof w) {
            ((w) vVar).b(cVar, arrayList);
        } else {
            arrayList.addAll(vVar.a(cVar));
        }
    }

    public static final boolean F0(z zVar, float f10, float f11) {
        u0.d dVar = new u0.d(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        v0.h k3 = k();
        k3.n(dVar);
        v0.h k10 = k();
        k10.h(zVar, k3, 1);
        boolean o10 = k10.o();
        k10.l();
        k3.l();
        return !o10;
    }

    public static final boolean F1(String str, String str2) {
        g.f(str, "lower");
        g.f(str2, "upper");
        if (!g.a(str, i.W0(str2, "?", "")) && (!i.R0(str2, "?") || !g.a(str.concat("?"), str2))) {
            if (!g.a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    public static final List G(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return a1.c.N0(kotlin.collections.c.n2(arrayList));
        }
        return EmptyList.f12981i;
    }

    public static final boolean G0(l8.z zVar) {
        g.f(zVar, "<this>");
        return zVar.s() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e[] H(List list) {
        boolean z10;
        e[] eVarArr;
        if (list != null && !list.isEmpty()) {
            z10 = false;
            if (!z10) {
                list = null;
            }
            return (list != null || (eVarArr = (e[]) list.toArray(new e[0])) == null) ? f15898k : eVarArr;
        }
        z10 = true;
        if (!z10) {
        }
        if (list != null) {
        }
    }

    public static final boolean H0(l8.b bVar) {
        h9.b bVar2;
        LinkedHashSet linkedHashSet = kotlin.reflect.jvm.internal.impl.builtins.a.f13321a;
        if (k9.d.l(bVar)) {
            LinkedHashSet linkedHashSet2 = kotlin.reflect.jvm.internal.impl.builtins.a.f13321a;
            h9.b f10 = DescriptorUtilsKt.f(bVar);
            if (f10 != null) {
                bVar2 = f10.g();
            } else {
                bVar2 = null;
            }
            if (kotlin.collections.c.h2(linkedHashSet2, bVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final void H1(FocusModifier focusModifier) {
        FocusPropertiesKt.a(focusModifier);
        h0.e<FocusModifier> eVar = focusModifier.f3018k;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            FocusModifier[] focusModifierArr = eVar.f11332i;
            g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                H1(focusModifierArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public static final int I(long j2, long j10) {
        boolean E0 = E0(j2);
        if (E0 != E0(j10)) {
            if (E0) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final boolean I0(y9.r rVar) {
        l8.d c10 = rVar.U0().c();
        i0 i0Var = c10 instanceof i0 ? (i0) c10 : null;
        if (i0Var == null) {
            return false;
        }
        return c1(TypeUtilsKt.h(i0Var));
    }

    public static final Object I1(p7.c cVar, CoroutineContext coroutineContext, p pVar) {
        CoroutineContext a10;
        CoroutineContext f10 = cVar.f();
        if (!CoroutineContextKt.b(coroutineContext)) {
            a10 = f10.m(coroutineContext);
        } else {
            a10 = CoroutineContextKt.a(f10, coroutineContext, false);
        }
        a1.b.L(a10);
        if (a10 == f10) {
            kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(cVar, a10);
            return a1.c.B1(pVar2, pVar2, pVar);
        }
        d.a aVar = d.a.f16777i;
        if (g.a(a10.a(aVar), f10.a(aVar))) {
            p1 p1Var = new p1(cVar, a10);
            Object c10 = ThreadContextKt.c(a10, null);
            try {
                Object B1 = a1.c.B1(p1Var, p1Var, pVar);
                ThreadContextKt.a(a10, c10);
                return B1;
            } catch (Throwable th) {
                ThreadContextKt.a(a10, c10);
                throw th;
            }
        }
        c0 c0Var = new c0(cVar, a10);
        try {
            a1.b.z0(y0(P(c0Var, c0Var, pVar)), m7.n.f16010a, null);
            return c0Var.E0();
        } catch (Throwable th2) {
            c0Var.t(Q(th2));
            throw th2;
        }
    }

    public static final m8.e J(m8.e eVar, m8.e eVar2) {
        g.f(eVar, "first");
        g.f(eVar2, "second");
        return eVar.isEmpty() ? eVar2 : eVar2.isEmpty() ? eVar : new CompositeAnnotations(eVar, eVar2);
    }

    public static final boolean J0(String str, int i10) {
        char charAt = str.charAt(i10);
        return 'A' <= charAt && charAt < '[';
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J1(ContinuationImpl continuationImpl) {
        kotlinx.coroutines.internal.f fVar;
        boolean z10;
        Object obj;
        CoroutineContext f10 = continuationImpl.f();
        a1.b.L(f10);
        p7.c y02 = y0(continuationImpl);
        if (y02 instanceof kotlinx.coroutines.internal.f) {
            fVar = (kotlinx.coroutines.internal.f) y02;
        } else {
            fVar = null;
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (fVar != null) {
            CoroutineDispatcher coroutineDispatcher = fVar.f15476l;
            boolean z11 = true;
            if (coroutineDispatcher.V(f10)) {
                fVar.n = m7.n.f16010a;
                fVar.f12761k = 1;
                coroutineDispatcher.U(f10, fVar);
            } else {
                r1 r1Var = new r1();
                CoroutineContext m10 = f10.m(r1Var);
                m7.n nVar = m7.n.f16010a;
                fVar.n = nVar;
                fVar.f12761k = 1;
                coroutineDispatcher.U(m10, fVar);
                if (r1Var.f12799j) {
                    k0 a10 = n1.a();
                    kotlinx.coroutines.internal.a<d0<?>> aVar = a10.f12782m;
                    if (aVar != null && aVar.f15470b != aVar.c) {
                        z10 = false;
                        if (!z10) {
                            if (a10.Z()) {
                                fVar.n = nVar;
                                fVar.f12761k = 1;
                                a10.X(fVar);
                                if (z11) {
                                }
                            } else {
                                a10.Y(true);
                                try {
                                    fVar.run();
                                    do {
                                    } while (a10.b0());
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
            }
            obj = coroutineSingletons;
            if (obj != coroutineSingletons) {
                return obj;
            }
            return m7.n.f16010a;
        }
        obj = m7.n.f16010a;
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ba.f K(ba.f fVar, HashSet hashSet) {
        ba.f K;
        boolean z10;
        kotlin.reflect.jvm.internal.impl.types.checker.h hVar = kotlin.reflect.jvm.internal.impl.types.checker.h.f15004a;
        y9.e0 J = hVar.J(fVar);
        if (!hashSet.add(J)) {
            return null;
        }
        i0 x3 = b.a.x(J);
        if (x3 != null) {
            y9.r u10 = b.a.u(x3);
            K = K(u10, hashSet);
            if (K == null) {
                return null;
            }
            if (!b.a.K(hVar.J(u10)) && (!(u10 instanceof ba.g) || !b.a.Q((ba.g) u10))) {
                z10 = false;
                if (!(K instanceof ba.g) && b.a.Q((ba.g) K) && b.a.P(fVar) && z10) {
                    return hVar.n0(u10);
                }
                if (!b.a.P(K)) {
                    if (hVar.m0(fVar)) {
                    }
                    return hVar.n0(K);
                }
                return K;
            }
            z10 = true;
            if (!(K instanceof ba.g)) {
            }
            if (!b.a.P(K)) {
            }
            return K;
        } else if (b.a.K(J)) {
            y9.v y10 = b.a.y(fVar);
            if (y10 == null || (K = K(y10, hashSet)) == null) {
                return null;
            }
            if (b.a.P(fVar)) {
                if (!b.a.P(K)) {
                    if ((K instanceof ba.g) && b.a.Q((ba.g) K)) {
                        return fVar;
                    }
                    return hVar.n0(K);
                }
                return fVar;
            }
            return K;
        } else {
            return fVar;
        }
    }

    public static final v7.a K0(Object[] objArr) {
        g.f(objArr, "array");
        return new v7.a(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String L(l8.b bVar, l lVar) {
        l8.b bVar2;
        g.f(bVar, "klass");
        g.f(lVar, "typeMappingConfiguration");
        lVar.b(bVar);
        l8.f c10 = bVar.c();
        g.e(c10, "klass.containingDeclaration");
        h9.e name = bVar.getName();
        if (name != null) {
            h9.e eVar = h9.g.f11575a;
            if (!name.f11573j) {
                String i10 = name.i();
                g.e(i10, "safeIdentifier(klass.name).identifier");
                if (!(c10 instanceof l8.u)) {
                    h9.c e10 = ((l8.u) c10).e();
                    if (!e10.d()) {
                        return i.V0(e10.b(), '.', '/') + '/' + i10;
                    }
                    return i10;
                }
                if (c10 instanceof l8.b) {
                    bVar2 = (l8.b) c10;
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    lVar.d(bVar2);
                    String L = L(bVar2, lVar);
                    return L + '$' + i10;
                }
                throw new IllegalArgumentException("Unexpected container: " + c10 + " for " + bVar);
            }
        }
        name = h9.g.c;
        String i102 = name.i();
        g.e(i102, "safeIdentifier(klass.name).identifier");
        if (!(c10 instanceof l8.u)) {
        }
    }

    public static final c8.b L0(c8.k kVar) {
        g.f(kVar, "<this>");
        c8.c c10 = kVar.c();
        if (c10 instanceof c8.b) {
            return (c8.b) c10;
        }
        if (!(c10 instanceof c8.l)) {
            throw new IllegalStateException(("Only KClass supported as classifier, got " + c10).toString());
        }
        throw new IllegalStateException(("Captured type parameter " + c10 + " from generic non-reified function. Such functionality cannot be supported as " + c10 + " is erased, either specify serializer explicitly or make calling function inline with reified " + c10).toString());
    }

    public static final long M(long j2, int i10) {
        int i11 = p1.o.c;
        int i12 = (int) (j2 >> 32);
        int c0 = a1.c.c0(i12, 0, i10);
        int c02 = a1.c.c0(p1.o.a(j2), 0, i10);
        if (c0 == i12 && c02 == p1.o.a(j2)) {
            return j2;
        }
        return m(c0, c02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [ja.a, ja.k1] */
    public static k1 M0(ja.x xVar, CoroutineDispatcher coroutineDispatcher, CoroutineStart coroutineStart, p pVar, int i10) {
        boolean z10;
        a1 a1Var;
        CoroutineContext coroutineContext = coroutineDispatcher;
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f13021i;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineContext c10 = CoroutineContextKt.c(xVar, coroutineContext);
        coroutineStart.getClass();
        if (coroutineStart == CoroutineStart.LAZY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a1Var = new a1(c10, pVar);
        } else {
            a1Var = new k1(c10, true);
        }
        a1Var.D0(coroutineStart, a1Var, pVar);
        return a1Var;
    }

    public static EdgeEffect N(Context context) {
        g.f(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? s.a.f17195a.a(context, null) : new EdgeEffect(context);
    }

    public static final q0.d N0(String str) {
        return new j1.i(str, InspectableValueKt.f3744a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface O(String str, m mVar, int i10) {
        boolean z10;
        Typeface create;
        String str2;
        boolean z11;
        boolean z12 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && g.a(mVar, m.n)) {
            if (str != null && str.length() != 0) {
                z11 = false;
                if (z11) {
                    Typeface typeface = Typeface.DEFAULT;
                    g.e(typeface, "DEFAULT");
                    return typeface;
                }
            }
            z11 = true;
            if (z11) {
            }
        }
        int g02 = g0(mVar, i10);
        if ((str == null || str.length() == 0) ? true : true) {
            create = Typeface.defaultFromStyle(g02);
            str2 = "{\n            Typeface.d…le(targetStyle)\n        }";
        } else {
            create = Typeface.create(str, g02);
            str2 = "{\n            Typeface.c…y, targetStyle)\n        }";
        }
        g.e(create, str2);
        return create;
    }

    public static final int O0(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final p7.c P(final Object obj, final p7.c cVar, final p pVar) {
        g.f(pVar, "<this>");
        g.f(cVar, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).a(obj, cVar);
        }
        final CoroutineContext f10 = cVar.f();
        return f10 == EmptyCoroutineContext.f13021i ? new RestrictedContinuationImpl(obj, cVar, pVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* renamed from: j  reason: collision with root package name */
            public int f13030j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ p f13031k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ Object f13032l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar);
                this.f13031k = pVar;
                g.d(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj2) {
                int i10 = this.f13030j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.f13030j = 2;
                        m0.b.n1(obj2);
                        return obj2;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f13030j = 1;
                m0.b.n1(obj2);
                p pVar2 = this.f13031k;
                g.d(pVar2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                v7.l.d(2, pVar2);
                return pVar2.R(this.f13032l, this);
            }
        } : new ContinuationImpl(cVar, f10, pVar, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* renamed from: l  reason: collision with root package name */
            public int f13033l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ p f13034m;
            public final /* synthetic */ Object n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVar, f10);
                this.f13034m = pVar;
                this.n = obj;
                g.d(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj2) {
                int i10 = this.f13033l;
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.f13033l = 2;
                        m0.b.n1(obj2);
                        return obj2;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f13033l = 1;
                m0.b.n1(obj2);
                p pVar2 = this.f13034m;
                g.d(pVar2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                v7.l.d(2, pVar2);
                return pVar2.R(this.n, this);
            }
        };
    }

    public static final Map P0(Pair pair) {
        g.f(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f12962i, pair.f12963j);
        g.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final Result.Failure Q(Throwable th) {
        g.f(th, "exception");
        return new Result.Failure(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0248, code lost:
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Type inference failed for: r5v13, types: [d9.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q0(y9.r rVar, d9.m mVar, q qVar) {
        boolean z10;
        boolean z11;
        d.b bVar;
        d.b b5;
        y9.r rVar2;
        d9.m mVar2;
        Object Q0;
        n g10;
        d9.e eVar = d9.e.f10459a;
        a1.b bVar2 = a1.b.C0;
        g.f(rVar, "kotlinType");
        g.f(qVar, "writeGenericType");
        if (kotlin.reflect.jvm.internal.impl.builtins.c.i(rVar)) {
            o8.z zVar = i8.f.f11827a;
            kotlin.reflect.jvm.internal.impl.builtins.c.i(rVar);
            kotlin.reflect.jvm.internal.impl.builtins.e g11 = TypeUtilsKt.g(rVar);
            m8.e annotations = rVar.getAnnotations();
            y9.r f10 = kotlin.reflect.jvm.internal.impl.builtins.c.f(rVar);
            List<y9.r> d5 = kotlin.reflect.jvm.internal.impl.builtins.c.d(rVar);
            List<f0> g12 = kotlin.reflect.jvm.internal.impl.builtins.c.g(rVar);
            ArrayList arrayList = new ArrayList(n7.l.Z1(g12, 10));
            for (f0 f0Var : g12) {
                arrayList.add(f0Var.b());
            }
            kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
            kotlin.reflect.jvm.internal.impl.types.l lVar = kotlin.reflect.jvm.internal.impl.types.l.f15046k;
            y9.e0 o10 = i8.f.f11827a.o();
            kotlin.reflect.jvm.internal.impl.builtins.c.h(rVar);
            y9.r b10 = ((f0) kotlin.collections.c.v2(rVar.S0())).b();
            g.e(b10, "arguments.last().type");
            ArrayList A2 = kotlin.collections.c.A2(arrayList, KotlinTypeFactory.f(lVar, o10, a1.c.N0(TypeUtilsKt.a(b10)), false, null));
            y9.v p10 = TypeUtilsKt.g(rVar).p();
            g.e(p10, "suspendFunType.builtIns.nullableAnyType");
            return Q0(kotlin.reflect.jvm.internal.impl.builtins.c.b(g11, annotations, f10, d5, A2, p10, false).Y0(rVar.V0()), mVar, qVar);
        }
        y9.v i10 = b.a.i(rVar);
        if (i10 == null && ((g10 = b.a.g(rVar)) == null || (i10 = b.a.W(g10)) == null)) {
            i10 = b.a.i(rVar);
            g.c(i10);
        }
        y9.e0 g02 = b.a.g0(i10);
        if (b.a.G(g02)) {
            PrimitiveType t10 = b.a.t(g02);
            if (t10 != null) {
                d.c c10 = eVar.c(t10);
                if (!b.a.P(rVar)) {
                    h9.c cVar = u8.q.f17877p;
                    g.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (!b.a.C(rVar, cVar)) {
                        z11 = false;
                        g.f(c10, "possiblyPrimitiveType");
                        bVar = c10;
                        if (z11) {
                            JvmPrimitiveType jvmPrimitiveType = c10.f10458i;
                            bVar = c10;
                            if (jvmPrimitiveType != null) {
                                String e10 = p9.b.c(jvmPrimitiveType.k()).e();
                                g.e(e10, "byFqNameWithoutInnerClas…apperFqName).internalName");
                                bVar = new d.b(e10);
                            }
                        }
                    }
                }
                z11 = true;
                g.f(c10, "possiblyPrimitiveType");
                bVar = c10;
                if (z11) {
                }
            } else {
                PrimitiveType s10 = b.a.s(g02);
                if (s10 != null) {
                    StringBuilder sb = new StringBuilder("[");
                    JvmPrimitiveType jvmPrimitiveType2 = (JvmPrimitiveType) JvmPrimitiveType.f14725w.get(s10);
                    if (jvmPrimitiveType2 != null) {
                        sb.append(jvmPrimitiveType2.i());
                        bVar = d9.e.a(sb.toString());
                    } else {
                        JvmPrimitiveType.a(4);
                        throw null;
                    }
                } else if (b.a.V(g02)) {
                    h9.d p11 = b.a.p(g02);
                    String str = k8.c.f12921a;
                    h9.b g13 = k8.c.g(p11);
                    if (g13 != null) {
                        if (!mVar.f10470g) {
                            List<c.a> list = k8.c.n;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (c.a aVar : list) {
                                    if (g.a(aVar.f12933a, g13)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        }
                        String e11 = p9.b.b(g13).e();
                        g.e(e11, "byClassId(classId).internalName");
                        bVar = eVar.b(e11);
                    }
                }
            }
            if (bVar == null) {
                d.b bVar3 = bVar;
                if (mVar.f10465a) {
                    boolean z12 = bVar instanceof d.c;
                    bVar3 = bVar;
                    if (z12) {
                        JvmPrimitiveType jvmPrimitiveType3 = ((d.c) bVar).f10458i;
                        bVar3 = bVar;
                        if (jvmPrimitiveType3 != null) {
                            String e12 = p9.b.c(jvmPrimitiveType3.k()).e();
                            g.e(e12, "byFqNameWithoutInnerClas…apperFqName).internalName");
                            bVar3 = new d.b(e12);
                        }
                    }
                }
                qVar.O(rVar, bVar3, mVar);
                return bVar3;
            }
            y9.e0 U0 = rVar.U0();
            if (U0 instanceof IntersectionTypeConstructor) {
                IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) U0;
                y9.r rVar3 = intersectionTypeConstructor.f14941a;
                if (rVar3 != null) {
                    return Q0(TypeUtilsKt.m(rVar3), mVar, qVar);
                }
                bVar2.B(intersectionTypeConstructor.f14942b);
                throw null;
            }
            l8.d c11 = U0.c();
            if (c11 != null) {
                if (aa.h.f(c11)) {
                    l8.b bVar4 = (l8.b) c11;
                    return eVar.b("error/NonExistentClass");
                }
                boolean z13 = c11 instanceof l8.b;
                boolean z14 = mVar.c;
                if (z13 && kotlin.reflect.jvm.internal.impl.builtins.e.z(rVar)) {
                    if (rVar.S0().size() == 1) {
                        f0 f0Var2 = rVar.S0().get(0);
                        y9.r b11 = f0Var2.b();
                        g.e(b11, "memberProjection.type");
                        if (f0Var2.a() == Variance.IN_VARIANCE) {
                            Q0 = eVar.b("java/lang/Object");
                        } else {
                            Variance a10 = f0Var2.a();
                            g.e(a10, "memberProjection.projectionKind");
                            if (!z14) {
                                int ordinal = a10.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        mVar2 = mVar.f10469f;
                                        if (mVar2 == null) {
                                        }
                                        Q0 = Q0(b11, mVar2, qVar);
                                    } else {
                                        mVar2 = mVar.f10471h;
                                        if (mVar2 == null) {
                                        }
                                        Q0 = Q0(b11, mVar2, qVar);
                                    }
                                } else {
                                    mVar2 = mVar.f10472i;
                                }
                            }
                            mVar2 = mVar;
                            Q0 = Q0(b11, mVar2, qVar);
                        }
                        return d9.e.a("[" + eVar.f(Q0));
                    }
                    throw new UnsupportedOperationException("arrays must have one type argument");
                } else if (z13) {
                    if (k9.e.b(c11) && !mVar.f10466b && (rVar2 = (y9.r) K(rVar, new HashSet())) != null) {
                        return Q0(rVar2, new d9.m(mVar.f10465a, true, mVar.c, mVar.f10467d, mVar.f10468e, mVar.f10469f, mVar.f10470g, mVar.f10471h, mVar.f10472i, false, 512), qVar);
                    }
                    if (z14 && kotlin.reflect.jvm.internal.impl.builtins.e.c((l8.b) c11, g.a.P)) {
                        b5 = eVar.d();
                    } else {
                        l8.b bVar5 = (l8.b) c11;
                        v7.g.e(bVar5.a(), "descriptor.original");
                        if (bVar5.h() == ClassKind.f13434l) {
                            l8.f c12 = bVar5.c();
                            v7.g.d(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            bVar5 = (l8.b) c12;
                        }
                        l8.b a11 = bVar5.a();
                        v7.g.e(a11, "enumClassIfEnumEntry.original");
                        b5 = eVar.b(L(a11, bVar2));
                    }
                    qVar.O(rVar, b5, mVar);
                    return b5;
                } else if (c11 instanceof i0) {
                    y9.r h10 = TypeUtilsKt.h((i0) c11);
                    if (rVar.V0()) {
                        h10 = TypeUtilsKt.k(h10);
                    }
                    return Q0(h10, mVar, FunctionsKt.f15114b);
                } else if ((c11 instanceof l8.h0) && mVar.f10473j) {
                    return Q0(((l8.h0) c11).H0(), mVar, qVar);
                } else {
                    throw new UnsupportedOperationException("Unknown type " + rVar);
                }
            }
            throw new UnsupportedOperationException("no descriptor for type constructor of " + rVar);
        }
        bVar = null;
        if (bVar == null) {
        }
    }

    public static final androidx.compose.ui.text.font.b R(Context context) {
        int i10;
        AndroidFontLoader androidFontLoader = new AndroidFontLoader(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i10 = 0;
        }
        return new androidx.compose.ui.text.font.b(androidFontLoader, new u1.b(i10));
    }

    public static final k1.h R0(u7.a aVar) {
        v7.g.f(aVar, "defaultFactory");
        return new k1.h(aVar);
    }

    public static final Object S(long j2, p7.c cVar) {
        if (j2 <= 0) {
            return m7.n.f16010a;
        }
        ja.j jVar = new ja.j(1, y0(cVar));
        jVar.u();
        if (j2 < Long.MAX_VALUE) {
            l0(jVar.f12777m).v(j2, jVar);
        }
        Object s10 = jVar.s();
        return s10 == CoroutineSingletons.COROUTINE_SUSPENDED ? s10 : m7.n.f16010a;
    }

    public static void S0(EdgeEffect edgeEffect, float f10) {
        v7.g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            s.a.f17195a.c(edgeEffect, f10, 0.0f);
        } else {
            edgeEffect.onPull(f10, 0.0f);
        }
    }

    public static final long T(long j2) {
        long j10 = (j2 << 1) + 1;
        int i10 = ia.b.f11864l;
        int i11 = ia.c.f11866a;
        return j10;
    }

    public static final ArrayList T0(l8.v vVar, h9.c cVar) {
        v7.g.f(vVar, "<this>");
        v7.g.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        F(vVar, cVar, arrayList);
        return arrayList;
    }

    public static final long U(long j2) {
        return new b8.l(-4611686018426L, 4611686018426L).g(j2) ? V(j2 * 1000000) : T(a1.c.d0(j2, -4611686018427387903L, 4611686018427387903L));
    }

    public static q0.d U0(j1.d dVar, float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f11 = Float.NaN;
        }
        v7.g.f(dVar, "alignmentLine");
        return new androidx.compose.foundation.layout.a(dVar, f10, f11, InspectableValueKt.f3744a);
    }

    public static final long V(long j2) {
        long j10 = j2 << 1;
        int i10 = ia.b.f11864l;
        int i11 = ia.c.f11866a;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y0.b V0(int i10, g0.d dVar) {
        boolean z10;
        y0.b aVar;
        int next;
        boolean z11;
        long j2;
        int i11;
        int i12;
        boolean z12;
        String str;
        String str2;
        int i13;
        int c10;
        int i14;
        int c11;
        int i15;
        String str3;
        boolean j12;
        dVar.f(473971343);
        q<g0.c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        g0.o0 o0Var = AndroidCompositionLocals_androidKt.f3656b;
        Context context = (Context) dVar.w(o0Var);
        dVar.w(AndroidCompositionLocals_androidKt.f3655a);
        Resources resources = ((Context) dVar.w(o0Var)).getResources();
        v7.g.e(resources, "LocalContext.current.resources");
        dVar.f(-492369756);
        Object g10 = dVar.g();
        Object obj = d.a.f11039a;
        if (g10 == obj) {
            g10 = new TypedValue();
            dVar.q(g10);
        }
        dVar.u();
        TypedValue typedValue = (TypedValue) g10;
        int i16 = 1;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (charSequence instanceof String) {
                j12 = i.R0((String) charSequence, ".xml");
            } else {
                j12 = kotlin.text.b.j1(charSequence, charSequence.length() - ".xml".length(), ".xml", 0, ".xml".length(), false);
            }
            if (j12) {
                z10 = true;
                a.C0189a c0189a = null;
                if (!z10) {
                    dVar.f(-738265327);
                    Resources.Theme theme = context.getTheme();
                    v7.g.e(theme, "context.theme");
                    int i17 = typedValue.changingConfigurations;
                    dVar.f(21855625);
                    n1.a aVar2 = (n1.a) dVar.w(AndroidCompositionLocals_androidKt.c);
                    a.b bVar = new a.b(i10, theme);
                    aVar2.getClass();
                    HashMap<a.b, WeakReference<a.C0189a>> hashMap = aVar2.f16064a;
                    WeakReference<a.C0189a> weakReference = hashMap.get(bVar);
                    if (weakReference != null) {
                        c0189a = weakReference.get();
                    }
                    if (c0189a == null) {
                        XmlResourceParser xml = resources.getXml(i10);
                        v7.g.e(xml, "res.getXml(id)");
                        while (true) {
                            next = xml.next();
                            if (next == 2 || next == 1) {
                                break;
                            }
                        }
                        if (next == 2) {
                            if (v7.g.a(xml.getName(), "vector")) {
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                a1.a aVar3 = new a1.a(xml);
                                v7.g.e(asAttributeSet, "attrs");
                                TypedArray e10 = aVar3.e(resources, theme, asAttributeSet, a1.b.f17a);
                                if (!p2.k.f(xml, "autoMirrored")) {
                                    z11 = false;
                                } else {
                                    z11 = e10.getBoolean(5, false);
                                }
                                aVar3.f(e10.getChangingConfigurations());
                                float b5 = aVar3.b(e10, "viewportWidth", 7, 0.0f);
                                float b10 = aVar3.b(e10, "viewportHeight", 8, 0.0f);
                                if (b5 > 0.0f) {
                                    if (b10 > 0.0f) {
                                        int i18 = 3;
                                        float dimension = e10.getDimension(3, 0.0f);
                                        aVar3.f(e10.getChangingConfigurations());
                                        float dimension2 = e10.getDimension(2, 0.0f);
                                        aVar3.f(e10.getChangingConfigurations());
                                        if (e10.hasValue(1)) {
                                            TypedValue typedValue2 = new TypedValue();
                                            e10.getValue(1, typedValue2);
                                            if (typedValue2.type != 2) {
                                                ColorStateList a10 = p2.k.a(e10, xml, theme);
                                                aVar3.f(e10.getChangingConfigurations());
                                                if (a10 != null) {
                                                    j2 = a10.getDefaultColor() << 32;
                                                    int i19 = v0.r.f18134h;
                                                    long j10 = j2;
                                                    i11 = e10.getInt(6, -1);
                                                    aVar3.f(e10.getChangingConfigurations());
                                                    if (i11 != -1) {
                                                        if (i11 != 3) {
                                                            if (i11 != 5) {
                                                                if (i11 != 9) {
                                                                    switch (i11) {
                                                                        case 14:
                                                                            i12 = 13;
                                                                            break;
                                                                        case ma.i.f16049q /* 15 */:
                                                                            i12 = 14;
                                                                            break;
                                                                        case 16:
                                                                            i12 = 12;
                                                                            break;
                                                                    }
                                                                } else {
                                                                    i12 = 9;
                                                                }
                                                            }
                                                        } else {
                                                            i12 = 3;
                                                        }
                                                        e10.recycle();
                                                        c.a aVar4 = new c.a("", dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, b5, b10, j10, i12, z11);
                                                        int i20 = 0;
                                                        while (true) {
                                                            if (xml.getEventType() != i16 && (xml.getDepth() >= i16 || xml.getEventType() != i18)) {
                                                                z12 = false;
                                                                if (!z12) {
                                                                    int eventType = xml.getEventType();
                                                                    if (eventType != 2) {
                                                                        if (eventType == i18 && v7.g.a("group", xml.getName())) {
                                                                            int i21 = i20 + 1;
                                                                            for (int i22 = 0; i22 < i21; i22++) {
                                                                                aVar4.d();
                                                                            }
                                                                            i20 = 0;
                                                                            xml.next();
                                                                            i16 = 1;
                                                                            i18 = 3;
                                                                        }
                                                                    } else {
                                                                        String name = xml.getName();
                                                                        if (name != null) {
                                                                            int hashCode = name.hashCode();
                                                                            if (hashCode != -1649314686) {
                                                                                if (hashCode != 3433509) {
                                                                                    if (hashCode == 98629247 && name.equals("group")) {
                                                                                        TypedArray e11 = aVar3.e(resources, theme, asAttributeSet, a1.b.f19b);
                                                                                        float b11 = aVar3.b(e11, "rotation", 5, 0.0f);
                                                                                        float f10 = e11.getFloat(1, 0.0f);
                                                                                        aVar3.f(e11.getChangingConfigurations());
                                                                                        float f11 = e11.getFloat(2, 0.0f);
                                                                                        aVar3.f(e11.getChangingConfigurations());
                                                                                        float b12 = aVar3.b(e11, "scaleX", 3, 1.0f);
                                                                                        float b13 = aVar3.b(e11, "scaleY", 4, 1.0f);
                                                                                        float b14 = aVar3.b(e11, "translateX", 6, 0.0f);
                                                                                        float b15 = aVar3.b(e11, "translateY", 7, 0.0f);
                                                                                        String d5 = aVar3.d(e11, 0);
                                                                                        if (d5 == null) {
                                                                                            str3 = "";
                                                                                        } else {
                                                                                            str3 = d5;
                                                                                        }
                                                                                        e11.recycle();
                                                                                        aVar4.a(str3, b11, f10, f11, b12, b13, b14, b15, z0.j.f19079a);
                                                                                    }
                                                                                } else if (name.equals("path")) {
                                                                                    TypedArray e12 = aVar3.e(resources, theme, asAttributeSet, a1.b.c);
                                                                                    if (p2.k.f(xml, "pathData")) {
                                                                                        String d10 = aVar3.d(e12, 0);
                                                                                        if (d10 == null) {
                                                                                            str2 = "";
                                                                                        } else {
                                                                                            str2 = d10;
                                                                                        }
                                                                                        List<z0.d> a11 = z0.j.a(aVar3.d(e12, 2));
                                                                                        p2.c a12 = aVar3.a(e12, theme, "fillColor", 1);
                                                                                        float b16 = aVar3.b(e12, "fillAlpha", 12, 1.0f);
                                                                                        int c12 = aVar3.c(e12, "strokeLineCap", 8, -1);
                                                                                        if (c12 != 0) {
                                                                                            if (c12 != 1) {
                                                                                                if (c12 == 2) {
                                                                                                    i13 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i13 = 1;
                                                                                            }
                                                                                            c10 = aVar3.c(e12, "strokeLineJoin", 9, -1);
                                                                                            if (c10 == 0) {
                                                                                                if (c10 != 1) {
                                                                                                    i14 = 2;
                                                                                                } else {
                                                                                                    i14 = 1;
                                                                                                }
                                                                                            } else {
                                                                                                i14 = 0;
                                                                                            }
                                                                                            float b17 = aVar3.b(e12, "strokeMiterLimit", 10, 1.0f);
                                                                                            p2.c a13 = aVar3.a(e12, theme, "strokeColor", 3);
                                                                                            float b18 = aVar3.b(e12, "strokeAlpha", 11, 1.0f);
                                                                                            float b19 = aVar3.b(e12, "strokeWidth", 4, 1.0f);
                                                                                            float b20 = aVar3.b(e12, "trimPathEnd", 6, 1.0f);
                                                                                            float b21 = aVar3.b(e12, "trimPathOffset", 7, 0.0f);
                                                                                            float b22 = aVar3.b(e12, "trimPathStart", 5, 0.0f);
                                                                                            c11 = aVar3.c(e12, "fillType", 13, 0);
                                                                                            e12.recycle();
                                                                                            v0.m Y0 = a1.c.Y0(a12);
                                                                                            v0.m Y02 = a1.c.Y0(a13);
                                                                                            if (c11 != 0) {
                                                                                                i15 = 0;
                                                                                            } else {
                                                                                                i15 = 1;
                                                                                            }
                                                                                            aVar4.b(b16, b18, b19, b17, b22, b20, b21, i15, i13, i14, Y0, Y02, str2, a11);
                                                                                        }
                                                                                        i13 = 0;
                                                                                        c10 = aVar3.c(e12, "strokeLineJoin", 9, -1);
                                                                                        if (c10 == 0) {
                                                                                        }
                                                                                        float b172 = aVar3.b(e12, "strokeMiterLimit", 10, 1.0f);
                                                                                        p2.c a132 = aVar3.a(e12, theme, "strokeColor", 3);
                                                                                        float b182 = aVar3.b(e12, "strokeAlpha", 11, 1.0f);
                                                                                        float b192 = aVar3.b(e12, "strokeWidth", 4, 1.0f);
                                                                                        float b202 = aVar3.b(e12, "trimPathEnd", 6, 1.0f);
                                                                                        float b212 = aVar3.b(e12, "trimPathOffset", 7, 0.0f);
                                                                                        float b222 = aVar3.b(e12, "trimPathStart", 5, 0.0f);
                                                                                        c11 = aVar3.c(e12, "fillType", 13, 0);
                                                                                        e12.recycle();
                                                                                        v0.m Y03 = a1.c.Y0(a12);
                                                                                        v0.m Y022 = a1.c.Y0(a132);
                                                                                        if (c11 != 0) {
                                                                                        }
                                                                                        aVar4.b(b16, b182, b192, b172, b222, b202, b212, i15, i13, i14, Y03, Y022, str2, a11);
                                                                                    } else {
                                                                                        throw new IllegalArgumentException("No path data available");
                                                                                    }
                                                                                }
                                                                            } else if (name.equals("clip-path")) {
                                                                                TypedArray e13 = aVar3.e(resources, theme, asAttributeSet, a1.b.f21d);
                                                                                String d11 = aVar3.d(e13, 0);
                                                                                if (d11 == null) {
                                                                                    str = "";
                                                                                } else {
                                                                                    str = d11;
                                                                                }
                                                                                List<z0.d> a14 = z0.j.a(aVar3.d(e13, 1));
                                                                                e13.recycle();
                                                                                aVar4.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a14);
                                                                                i20++;
                                                                                xml.next();
                                                                                i16 = 1;
                                                                                i18 = 3;
                                                                            }
                                                                            xml.next();
                                                                            i16 = 1;
                                                                            i18 = 3;
                                                                        }
                                                                    }
                                                                    xml.next();
                                                                    i16 = 1;
                                                                    i18 = 3;
                                                                } else {
                                                                    c0189a = new a.C0189a(aVar4.c(), i17);
                                                                    hashMap.put(bVar, new WeakReference<>(c0189a));
                                                                }
                                                            }
                                                            z12 = true;
                                                            if (!z12) {
                                                            }
                                                        }
                                                    }
                                                    i12 = 5;
                                                    e10.recycle();
                                                    c.a aVar42 = new c.a("", dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, b5, b10, j10, i12, z11);
                                                    int i202 = 0;
                                                    while (true) {
                                                        if (xml.getEventType() != i16) {
                                                            z12 = false;
                                                            if (!z12) {
                                                            }
                                                        }
                                                        z12 = true;
                                                        if (!z12) {
                                                        }
                                                        xml.next();
                                                        i16 = 1;
                                                        i18 = 3;
                                                    }
                                                }
                                            }
                                        }
                                        j2 = v0.r.f18133g;
                                        long j102 = j2;
                                        i11 = e10.getInt(6, -1);
                                        aVar3.f(e10.getChangingConfigurations());
                                        if (i11 != -1) {
                                        }
                                        i12 = 5;
                                        e10.recycle();
                                        c.a aVar422 = new c.a("", dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, b5, b10, j102, i12, z11);
                                        int i2022 = 0;
                                        while (true) {
                                            if (xml.getEventType() != i16) {
                                            }
                                            z12 = true;
                                            if (!z12) {
                                            }
                                            xml.next();
                                            i16 = 1;
                                            i18 = 3;
                                        }
                                    } else {
                                        throw new XmlPullParserException(e10.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                                    }
                                } else {
                                    throw new XmlPullParserException(e10.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                                }
                            } else {
                                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                    q<g0.c<?>, z0, t0, m7.n> qVar2 = ComposerKt.f2737a;
                    dVar.u();
                    aVar = VectorPainterKt.b(c0189a.f16065a, dVar);
                } else {
                    dVar.f(-738265172);
                    Object valueOf = Integer.valueOf(i10);
                    Object theme2 = context.getTheme();
                    dVar.f(1618982084);
                    boolean z13 = dVar.z(charSequence);
                    boolean z14 = dVar.z(theme2) | dVar.z(valueOf) | z13;
                    Object g11 = dVar.g();
                    if (z14 || g11 == obj) {
                        Drawable drawable = resources.getDrawable(i10, null);
                        v7.g.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        v7.g.e(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
                        g11 = new v0.e(bitmap);
                        dVar.q(g11);
                    }
                    dVar.u();
                    aVar = new y0.a((v0.w) g11);
                }
                dVar.u();
                dVar.u();
                return aVar;
            }
        }
        z10 = false;
        a.C0189a c0189a2 = null;
        if (!z10) {
        }
        dVar.u();
        dVar.u();
        return aVar;
    }

    public static String W(ArrayList arrayList, String str, u7.l lVar, int i10) {
        CharSequence charSequence;
        int i11;
        String str2;
        CharSequence valueOf;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i10 & 2) != 0) {
            charSequence = "";
        } else {
            charSequence = null;
        }
        if ((i10 & 4) == 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            str2 = "...";
        } else {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        v7.g.f(arrayList, "<this>");
        v7.g.f(str, "separator");
        v7.g.f(charSequence, "prefix");
        v7.g.f(str3, "postfix");
        v7.g.f(str2, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            i12++;
            boolean z10 = true;
            if (i12 > 1) {
                sb.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                obj = lVar.U(obj);
            } else {
                if (obj != null) {
                    z10 = obj instanceof CharSequence;
                }
                if (!z10) {
                    if (obj instanceof Character) {
                        sb.append(((Character) obj).charValue());
                    } else {
                        valueOf = String.valueOf(obj);
                        sb.append(valueOf);
                    }
                }
            }
            valueOf = (CharSequence) obj;
            sb.append(valueOf);
        }
        if (i11 >= 0 && i12 > i11) {
            sb.append((CharSequence) str2);
        }
        sb.append((CharSequence) str3);
        String sb2 = sb.toString();
        v7.g.e(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static final long W0(String str) {
        int i10;
        boolean z10;
        int length = str.length();
        if (length > 0 && kotlin.text.b.Z0("+-", str.charAt(0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (length - i10 > 16) {
            b8.i iVar = new b8.i(i10, kotlin.text.b.a1(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                b8.h it = iVar.iterator();
                while (it.f6502k) {
                    if (!new b8.c('0', '9').g(str.charAt(it.nextInt()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                if (str.charAt(0) == '-') {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
        }
        if (i.X0(str, "+", false)) {
            str = ha.j.x1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final FocusModifier X(FocusModifier focusModifier) {
        v7.g.f(focusModifier, "<this>");
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    return null;
                }
                return focusModifier;
            }
            FocusModifier focusModifier2 = focusModifier.f3020m;
            if (focusModifier2 != null) {
                return X(focusModifier2);
            }
            return null;
        }
        return focusModifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0106, code lost:
        if (h9.e.l(r6) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h9.e X0(h9.e eVar, String str, String str2, int i10) {
        boolean z10;
        boolean z11;
        String k12;
        boolean z12;
        boolean z13;
        Object obj;
        boolean z14 = false;
        if ((i10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!eVar.f11573j) {
            String i11 = eVar.i();
            v7.g.e(i11, "methodName.identifier");
            if (i.X0(i11, str, false) && i11.length() != str.length()) {
                char charAt = i11.charAt(str.length());
                if ('a' <= charAt && charAt < '{') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (str2 != null) {
                        k12 = str2.concat(kotlin.text.b.k1(str, i11));
                    } else if (z10) {
                        k12 = kotlin.text.b.k1(str, i11);
                        if (k12.length() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12 && J0(k12, 0)) {
                            if (k12.length() != 1 && J0(k12, 1)) {
                                b8.h it = new b8.i(0, k12.length() - 1).iterator();
                                while (true) {
                                    if (it.f6502k) {
                                        obj = it.next();
                                        if (!J0(k12, ((Number) obj).intValue())) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    int intValue = num.intValue() - 1;
                                    String substring = k12.substring(0, intValue);
                                    v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    String z15 = z1(substring);
                                    String substring2 = k12.substring(intValue);
                                    v7.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                                    k12 = z15.concat(substring2);
                                } else {
                                    k12 = z1(k12);
                                }
                            }
                            if (k12.length() == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                char charAt2 = k12.charAt(0);
                                if ('A' <= charAt2 && charAt2 < '[') {
                                    z14 = true;
                                }
                                if (z14) {
                                    char lowerCase = Character.toLowerCase(charAt2);
                                    String substring3 = k12.substring(1);
                                    v7.g.e(substring3, "this as java.lang.String).substring(startIndex)");
                                    k12 = lowerCase + substring3;
                                }
                            }
                        }
                    } else {
                        return eVar;
                    }
                    return h9.e.k(k12);
                }
            }
        }
        return null;
    }

    public static final FocusModifier Y(FocusModifier focusModifier) {
        FocusModifier Y;
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    return null;
                }
                return focusModifier;
            }
            FocusModifier focusModifier2 = focusModifier.f3020m;
            if (focusModifier2 == null || (Y = Y(focusModifier2)) == null) {
                throw new IllegalStateException("no child".toString());
            }
            return Y;
        }
        return focusModifier;
    }

    public static final String Y0(h9.e eVar) {
        boolean z10;
        boolean z11;
        v7.g.f(eVar, "<this>");
        String b5 = eVar.b();
        v7.g.e(b5, "asString()");
        boolean z12 = true;
        if (!j9.c.f12754a.contains(b5)) {
            int i10 = 0;
            while (true) {
                if (i10 < b5.length()) {
                    char charAt = b5.charAt(i10);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                z12 = false;
            }
        }
        if (z12) {
            StringBuilder sb = new StringBuilder();
            String b10 = eVar.b();
            v7.g.e(b10, "asString()");
            sb.append("`".concat(b10));
            sb.append('`');
            return sb.toString();
        }
        String b11 = eVar.b();
        v7.g.e(b11, "asString()");
        return b11;
    }

    public static final FocusModifier Z(FocusModifier focusModifier) {
        FocusModifier focusModifier2 = focusModifier.f3017j;
        if (focusModifier2 != null) {
            int ordinal = focusModifier.f3019l.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return focusModifier;
                }
            }
            return Z(focusModifier2);
        }
        return null;
    }

    public static final String Z0(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h9.e eVar = (h9.e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(Y0(eVar));
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final r8.d a0(Annotation[] annotationArr, h9.c cVar) {
        Annotation annotation;
        v7.g.f(annotationArr, "<this>");
        v7.g.f(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (v7.g.a(ReflectClassUtilKt.a(a1.c.y0(a1.c.t0(annotation))).b(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new r8.d(annotation);
        }
        return null;
    }

    public static final String a1(String str, String str2, String str3, String str4, String str5) {
        v7.g.f(str, "lowerRendered");
        v7.g.f(str2, "lowerPrefix");
        v7.g.f(str3, "upperRendered");
        v7.g.f(str4, "upperPrefix");
        v7.g.f(str5, "foldedPrefix");
        if (i.X0(str, str2, false) && i.X0(str3, str4, false)) {
            String substring = str.substring(str2.length());
            v7.g.e(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            v7.g.e(substring2, "this as java.lang.String).substring(startIndex)");
            String concat = str5.concat(substring);
            if (v7.g.a(substring, substring2)) {
                return concat;
            }
            if (F1(substring, substring2)) {
                return concat + '!';
            }
            return null;
        }
        return null;
    }

    public static final NodeCoordinator b0(LayoutNode layoutNode) {
        d.c e10;
        NodeCoordinator nodeCoordinator;
        v7.g.f(layoutNode, "<this>");
        h0 q10 = v0.p.q(layoutNode);
        if (q10 == null) {
            q10 = v0.p.r(layoutNode);
        }
        if (q10 == null || (e10 = q10.e()) == null || (nodeCoordinator = e10.n) == null) {
            return layoutNode.J.f15779b;
        }
        return nodeCoordinator;
    }

    public static final b0 b1(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "<this>");
        b0 b0Var = layoutNode.f3420p;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final LayoutNode c0(LayoutNode layoutNode, u7.l lVar) {
        v7.g.f(layoutNode, "<this>");
        if (((Boolean) lVar.U(layoutNode)).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> n = layoutNode.n();
        int size = n.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode c0 = c0(n.get(i10), lVar);
            if (c0 != null) {
                return c0;
            }
        }
        return null;
    }

    public static final boolean c1(y9.r rVar) {
        boolean z10;
        boolean z11;
        l8.d c10 = rVar.U0().c();
        if (c10 != null) {
            if (k9.e.b(c10) && !v7.g.a(DescriptorUtilsKt.g((l8.b) c10), kotlin.reflect.jvm.internal.impl.builtins.g.f13350g)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = true;
                if (z10 && !I0(rVar)) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
        return true;
    }

    public static final void d0(LayoutNode layoutNode, List list) {
        ArrayList N2;
        v7.g.f(layoutNode, "<this>");
        v7.g.f(list, "list");
        if (!layoutNode.z()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> n = layoutNode.n();
        int size = n.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = n.get(i10);
            if (layoutNode2.z()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        try {
            NodeLocationHolder.f3924m = NodeLocationHolder.ComparisonStrategy.Stripe;
            N2 = kotlin.collections.c.N2(arrayList);
            if (N2.size() > 1) {
                Collections.sort(N2);
            }
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.f3924m = NodeLocationHolder.ComparisonStrategy.Location;
            N2 = kotlin.collections.c.N2(arrayList);
            if (N2.size() > 1) {
                Collections.sort(N2);
            }
        }
        ArrayList arrayList2 = new ArrayList(N2.size());
        int size2 = N2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(((NodeLocationHolder) N2.get(i11)).f3926j);
        }
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i12);
            h0 r3 = v0.p.r(layoutNode3);
            if (r3 != null) {
                list.add(r3);
            } else {
                d0(layoutNode3, list);
            }
        }
    }

    public static final void d1(int i10, int i11, Object[] objArr) {
        v7.g.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static final j1.h e0(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "<this>");
        while (true) {
            NodeCoordinator T0 = nodeCoordinator.T0();
            if (T0 == null) {
                break;
            }
            nodeCoordinator = T0;
        }
        while (true) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator.f3501q;
            if (nodeCoordinator2 != null) {
                nodeCoordinator = nodeCoordinator2;
            } else {
                return nodeCoordinator;
            }
        }
    }

    public static final LazyJavaAnnotations e1(x8.c cVar, b9.d dVar) {
        v7.g.f(cVar, "<this>");
        v7.g.f(dVar, "annotationsOwner");
        return new LazyJavaAnnotations(cVar, dVar, false);
    }

    public static final u0.d f0(FocusModifier focusModifier) {
        u0.d t10;
        v7.g.f(focusModifier, "<this>");
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator == null || (t10 = ((NodeCoordinator) e0(nodeCoordinator)).t(nodeCoordinator, false)) == null) {
            return u0.d.f17725e;
        }
        return t10;
    }

    public static final l8.b f1(s sVar, h9.c cVar) {
        l8.d dVar;
        MemberScope w02;
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_BUILTINS;
        v7.g.f(sVar, "<this>");
        v7.g.f(cVar, "fqName");
        if (cVar.d()) {
            return null;
        }
        h9.c e10 = cVar.e();
        v7.g.e(e10, "fqName.parent()");
        MemberScope w10 = sVar.t0(e10).w();
        h9.e f10 = cVar.f();
        v7.g.e(f10, "fqName.shortName()");
        l8.d e11 = w10.e(f10, noLookupLocation);
        l8.b bVar = e11 instanceof l8.b ? (l8.b) e11 : null;
        if (bVar != null) {
            return bVar;
        }
        h9.c e12 = cVar.e();
        v7.g.e(e12, "fqName.parent()");
        l8.b f12 = f1(sVar, e12);
        if (f12 == null || (w02 = f12.w0()) == null) {
            dVar = null;
        } else {
            h9.e f11 = cVar.f();
            v7.g.e(f11, "fqName.shortName()");
            dVar = w02.e(f11, noLookupLocation);
        }
        if (dVar instanceof l8.b) {
            return (l8.b) dVar;
        }
        return null;
    }

    public static final int g0(m mVar, int i10) {
        boolean z10;
        boolean z11;
        v7.g.f(mVar, "fontWeight");
        if (mVar.compareTo(m.f17753l) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        if (!z11) {
            return 0;
        }
        return 2;
    }

    public static final int g1(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static final ArrayList h0(Annotation[] annotationArr) {
        v7.g.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new r8.d(annotation));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r6.a(r1) == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h1(CoroutineContext coroutineContext, p pVar) {
        k0 k0Var;
        CoroutineContext a10;
        kotlinx.coroutines.scheduling.b bVar;
        long j2;
        ja.s sVar;
        Thread currentThread = Thread.currentThread();
        d.a aVar = d.a.f16777i;
        p7.d dVar = (p7.d) coroutineContext.a(aVar);
        if (dVar == null) {
            k0Var = n1.a();
            a10 = CoroutineContextKt.a(EmptyCoroutineContext.f13021i, coroutineContext.m(k0Var), true);
            bVar = ja.f0.f12766a;
            if (a10 != bVar && a10.a(aVar) == null) {
                a10 = a10.m(bVar);
            }
        } else {
            if (dVar instanceof k0) {
                k0 k0Var2 = (k0) dVar;
            }
            k0Var = n1.f12787a.get();
            a10 = CoroutineContextKt.a(EmptyCoroutineContext.f13021i, coroutineContext, true);
            bVar = ja.f0.f12766a;
            if (a10 != bVar) {
            }
        }
        ja.d dVar2 = new ja.d(a10, currentThread, k0Var);
        dVar2.D0(CoroutineStart.DEFAULT, dVar2, pVar);
        k0 k0Var3 = dVar2.f12760l;
        if (k0Var3 != null) {
            try {
                int i10 = k0.n;
                k0Var3.Y(false);
            } finally {
            }
        }
        while (!Thread.interrupted()) {
            if (k0Var3 != null) {
                j2 = k0Var3.a0();
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (!(!(dVar2.i0() instanceof p0))) {
                LockSupport.parkNanos(dVar2, j2);
            } else {
                if (k0Var3 != null) {
                    int i11 = k0.n;
                    k0Var3.W(false);
                }
                Object T1 = a1.c.T1(dVar2.i0());
                if (T1 instanceof ja.s) {
                    sVar = (ja.s) T1;
                } else {
                    sVar = null;
                }
                if (sVar == null) {
                    return T1;
                }
                throw sVar.f12801a;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        dVar2.V(interruptedException);
        throw interruptedException;
    }

    public static /* synthetic */ void i(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "b";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case ma.i.f16047o /* 10 */:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case ma.i.f16046m /* 9 */:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case ma.i.f16046m /* 9 */:
                objArr[2] = "capture";
                break;
            case ma.i.f16047o /* 10 */:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final int i0(kotlin.reflect.jvm.internal.calls.a aVar) {
        v7.g.f(aVar, "<this>");
        return aVar.l().size();
    }

    public static final Object i1(Set set, Enum r22, Enum r3, Object obj, boolean z10) {
        Set Q2;
        if (!z10) {
            if (obj != null && (Q2 = kotlin.collections.c.Q2(n7.l.b2(set, obj))) != null) {
                set = Q2;
            }
            return kotlin.collections.c.D2(set);
        }
        Enum r1 = set.contains(r22) ? r22 : set.contains(r3) ? r3 : null;
        if (v7.g.a(r1, r22) && v7.g.a(obj, r3)) {
            return null;
        }
        return obj == null ? r1 : obj;
    }

    public static final long j(int i10) {
        long j2 = (i10 << 32) | (0 & 4294967295L);
        int i11 = e1.a.f10598k;
        return j2;
    }

    public static final h9.b j0(f9.c cVar, int i10) {
        v7.g.f(cVar, "<this>");
        return h9.b.f(cVar.b(i10), cVar.a(i10));
    }

    public static final q0.d j1(q0.d dVar, boolean z10, u7.l lVar) {
        v7.g.f(dVar, "<this>");
        v7.g.f(lVar, "properties");
        return dVar.Z(new o1.l(z10, false, lVar, InspectableValueKt.f3744a));
    }

    public static final v0.h k() {
        return new v0.h(0);
    }

    public static final long l(float f10, float f11) {
        long floatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i10 = j1.d0.f12650b;
        return floatToIntBits;
    }

    public static final ja.b0 l0(CoroutineContext coroutineContext) {
        ja.b0 b0Var;
        int i10 = p7.d.f16776f;
        CoroutineContext.a a10 = coroutineContext.a(d.a.f16777i);
        if (a10 instanceof ja.b0) {
            b0Var = (ja.b0) a10;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            return ja.z.f12817a;
        }
        return b0Var;
    }

    public static final String l1(Object obj) {
        v7.g.f(obj, "obj");
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        v7.g.e(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    public static final long m(int i10, int i11) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0) {
                z11 = true;
            }
            if (z11) {
                long j2 = (i11 & 4294967295L) | (i10 << 32);
                int i12 = p1.o.c;
                return j2;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    public static n6.b m0(g0.d dVar) {
        dVar.f(2054871046);
        q<g0.c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        n6.b bVar = (n6.b) dVar.w(NotoThemeKt.f7585h);
        dVar.u();
        return bVar;
    }

    public static final String m1(int i10, g0.d dVar) {
        q<g0.c<?>, z0, t0, m7.n> qVar = ComposerKt.f2737a;
        dVar.w(AndroidCompositionLocals_androidKt.f3655a);
        Resources resources = ((Context) dVar.w(AndroidCompositionLocals_androidKt.f3656b)).getResources();
        v7.g.e(resources, "LocalContext.current.resources");
        String string = resources.getString(i10);
        v7.g.e(string, "resources.getString(id)");
        return string;
    }

    public static final long n(float f10, boolean z10) {
        return ((z10 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
    }

    public static float n0(EdgeEffect edgeEffect) {
        v7.g.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return s.a.f17195a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final void n1(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f12965i;
        }
    }

    public static final int o(l1.q qVar, j1.a aVar) {
        boolean z10;
        l1.q y02 = qVar.y0();
        if (y02 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (qVar.C0().f().containsKey(aVar)) {
                Integer num = qVar.C0().f().get(aVar);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int f02 = y02.f0(aVar);
            if (f02 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            y02.f15759m = true;
            qVar.n = true;
            qVar.G0();
            y02.f15759m = false;
            qVar.n = false;
            if (aVar instanceof j1.d) {
                return b2.g.a(y02.E0()) + f02;
            }
            long E0 = y02.E0();
            int i10 = b2.g.c;
            return f02 + ((int) (E0 >> 32));
        }
        throw new IllegalStateException(("Child of " + qVar + " cannot be null when calculating alignment line").toString());
    }

    public static final boolean o0(int i10) {
        return (i10 & 128) != 0;
    }

    public static final long o1(long j2, long j10) {
        boolean z10;
        float d5 = u0.f.d(j2);
        long j11 = j1.d0.f12649a;
        boolean z11 = true;
        if (j10 != j11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * d5;
            float b5 = u0.f.b(j2);
            if (j10 == j11) {
                z11 = false;
            }
            if (z11) {
                return a1.c.v(intBitsToFloat, Float.intBitsToFloat((int) (j10 & 4294967295L)) * b5);
            }
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final h9.c p(h9.d dVar, String str) {
        h9.c h10 = dVar.b(h9.e.k(str)).h();
        v7.g.e(h10, "child(Name.identifier(name)).toSafe()");
        return h10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c8.b p0(c8.c cVar) {
        l8.b bVar;
        c8.b p02;
        boolean z10;
        if (cVar instanceof c8.b) {
            return (c8.b) cVar;
        }
        if (cVar instanceof c8.l) {
            List<c8.k> upperBounds = ((c8.l) cVar).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                c8.k kVar = (c8.k) next;
                v7.g.d(kVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                l8.d c10 = ((KTypeImpl) kVar).f13217a.U0().c();
                if (c10 instanceof l8.b) {
                    bVar = (l8.b) c10;
                }
                if (bVar != null && bVar.h() != ClassKind.f13432j && bVar.h() != ClassKind.f13435m) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    bVar = next;
                    break;
                }
            }
            c8.k kVar2 = (c8.k) bVar;
            if (kVar2 == null) {
                kVar2 = (c8.k) kotlin.collections.c.p2(upperBounds);
            }
            if (kVar2 != null) {
                c8.c c11 = kVar2.c();
                if (c11 == null || (p02 = p0(c11)) == null) {
                    throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kVar2);
                }
                return p02;
            }
            return v7.i.a(Object.class);
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableString p1(p1.a aVar, b2.b bVar, e.a aVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        androidx.compose.ui.text.style.a aVar3;
        int i10;
        boolean z13;
        v7.g.f(bVar, "density");
        v7.g.f(aVar2, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(aVar.f16641i);
        List<a.C0207a<p1.k>> list = aVar.f16642j;
        int size = list.size();
        int i11 = 0;
        while (true) {
            boolean z14 = true;
            if (i11 >= size) {
                break;
            }
            a.C0207a<p1.k> c0207a = list.get(i11);
            p1.k kVar = c0207a.f16645a;
            int i12 = c0207a.f16646b;
            int i13 = c0207a.c;
            long a10 = kVar.a();
            long j2 = kVar.f16672b;
            int i14 = i11;
            if (v0.r.c(a10, kVar.a())) {
                aVar3 = kVar.f16671a;
            } else {
                if (a10 != v0.r.f18133g) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    aVar3 = new a2.c(a10);
                } else {
                    aVar3 = a.C0028a.f4166a;
                }
            }
            androidx.compose.ui.text.platform.extensions.a.c(spannableString, aVar3.a(), i12, i13);
            androidx.compose.ui.text.platform.extensions.a.d(spannableString, j2, bVar, i12, i13);
            m mVar = kVar.c;
            u1.i iVar = kVar.f16673d;
            if (mVar != null || iVar != null) {
                if (mVar == null) {
                    mVar = m.n;
                }
                if (iVar != null) {
                    i10 = iVar.f17748a;
                } else {
                    i10 = 0;
                }
                spannableString.setSpan(new StyleSpan(g0(mVar, i10)), i12, i13, 33);
            }
            a2.g gVar = kVar.f16682m;
            if (gVar != null) {
                int i15 = gVar.f102a;
                if ((1 | i15) == i15) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    spannableString.setSpan(new UnderlineSpan(), i12, i13, 33);
                }
                if ((2 | i15) != i15) {
                    z14 = false;
                }
                if (z14) {
                    spannableString.setSpan(new StrikethroughSpan(), i12, i13, 33);
                }
            }
            a2.i iVar2 = kVar.f16679j;
            if (iVar2 != null) {
                spannableString.setSpan(new ScaleXSpan(iVar2.f104a), i12, i13, 33);
            }
            androidx.compose.ui.text.platform.extensions.a.e(spannableString, kVar.f16680k, i12, i13);
            androidx.compose.ui.text.platform.extensions.a.b(spannableString, kVar.f16681l, i12, i13);
            i11 = i14 + 1;
        }
        int length = aVar.length();
        List<a.C0207a<? extends Object>> list2 = aVar.f16644l;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            a.C0207a<? extends Object> c0207a2 = list2.get(i16);
            a.C0207a<? extends Object> c0207a3 = c0207a2;
            if ((c0207a3.f16645a instanceof p1.q) && p1.b.b(0, length, c0207a3.f16646b, c0207a3.c)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(c0207a2);
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            a.C0207a c0207a4 = (a.C0207a) arrayList.get(i17);
            p1.q qVar = (p1.q) c0207a4.f16645a;
            v7.g.f(qVar, "<this>");
            if (qVar instanceof p1.s) {
                TtsSpan build = new TtsSpan.VerbatimBuilder(((p1.s) qVar).f16706a).build();
                v7.g.e(build, "builder.build()");
                spannableString.setSpan(build, c0207a4.f16646b, c0207a4.c, 33);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        int length2 = aVar.length();
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size4 = list2.size();
        for (int i18 = 0; i18 < size4; i18++) {
            a.C0207a<? extends Object> c0207a5 = list2.get(i18);
            a.C0207a<? extends Object> c0207a6 = c0207a5;
            if ((c0207a6.f16645a instanceof p1.r) && p1.b.b(0, length2, c0207a6.f16646b, c0207a6.c)) {
                z10 = true;
                if (!z10) {
                    arrayList2.add(c0207a5);
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        int size5 = arrayList2.size();
        for (int i19 = 0; i19 < size5; i19++) {
            a.C0207a c0207a7 = (a.C0207a) arrayList2.get(i19);
            p1.r rVar = (p1.r) c0207a7.f16645a;
            v7.g.f(rVar, "<this>");
            spannableString.setSpan(new URLSpan(rVar.f16705a), c0207a7.f16646b, c0207a7.c, 33);
        }
        return spannableString;
    }

    public static final Typeface q(Context context, u1.s sVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return t.f17766a.a(context, sVar);
        }
        Typeface b5 = p2.f.b(context, sVar.f17762a);
        v7.g.c(b5);
        return b5;
    }

    public static final Object q0(j1.p pVar) {
        v7.g.f(pVar, "<this>");
        Object n = pVar.n();
        j1.j jVar = n instanceof j1.j ? (j1.j) n : null;
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }

    public static final Rect q1(u0.d dVar) {
        v7.g.f(dVar, "<this>");
        return new Rect((int) dVar.f17726a, (int) dVar.f17727b, (int) dVar.c, (int) dVar.f17728d);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x007e A[EDGE_INSN: B:114:0x007e->B:45:0x007e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b A[LOOP:1: B:34:0x0054->B:44:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long r(String str) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        DurationUnit durationUnit;
        long t12;
        boolean z13;
        int length = str.length();
        if (length != 0) {
            int i11 = ia.b.f11864l;
            char charAt = str.charAt(0);
            if (charAt != '+' && charAt != '-') {
                i10 = 0;
                if (i10 <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && kotlin.text.b.o1(str, '-')) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (length <= i10) {
                    if (str.charAt(i10) == 'P') {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            DurationUnit durationUnit2 = null;
                            long j2 = 0;
                            boolean z14 = false;
                            while (i12 < length) {
                                if (str.charAt(i12) == 'T') {
                                    if (!z14 && (i12 = i12 + 1) != length) {
                                        z14 = true;
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                } else {
                                    int i13 = i12;
                                    while (i13 < str.length()) {
                                        char charAt2 = str.charAt(i13);
                                        if (!new b8.c('0', '9').g(charAt2) && !kotlin.text.b.Z0("+-.", charAt2)) {
                                            z13 = false;
                                            if (z13) {
                                                break;
                                            }
                                            i13++;
                                        }
                                        z13 = true;
                                        if (z13) {
                                        }
                                    }
                                    String substring = str.substring(i12, i13);
                                    v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    if (substring.length() == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        int length2 = substring.length() + i12;
                                        if (length2 >= 0 && length2 <= kotlin.text.b.a1(str)) {
                                            char charAt3 = str.charAt(length2);
                                            int i14 = length2 + 1;
                                            if (!z14) {
                                                if (charAt3 == 'D') {
                                                    durationUnit = DurationUnit.DAYS;
                                                } else {
                                                    throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                                }
                                            } else if (charAt3 == 'H') {
                                                durationUnit = DurationUnit.HOURS;
                                            } else if (charAt3 == 'M') {
                                                durationUnit = DurationUnit.MINUTES;
                                            } else if (charAt3 == 'S') {
                                                durationUnit = DurationUnit.SECONDS;
                                            } else {
                                                throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                            }
                                            if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                                                throw new IllegalArgumentException("Unexpected order of duration components");
                                            }
                                            int d12 = kotlin.text.b.d1(substring, '.', 0, false, 6);
                                            if (durationUnit == DurationUnit.SECONDS && d12 > 0) {
                                                String substring2 = substring.substring(0, d12);
                                                v7.g.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                j2 = ia.b.l(j2, t1(W0(substring2), durationUnit));
                                                String substring3 = substring.substring(d12);
                                                v7.g.e(substring3, "this as java.lang.String).substring(startIndex)");
                                                t12 = s1(Double.parseDouble(substring3), durationUnit);
                                            } else {
                                                t12 = t1(W0(substring), durationUnit);
                                            }
                                            j2 = ia.b.l(j2, t12);
                                            durationUnit2 = durationUnit;
                                            i12 = i14;
                                        } else {
                                            throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                        }
                                    } else {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                            if (z11) {
                                return ia.b.o(j2);
                            }
                            return j2;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException("No components");
            }
            i10 = 1;
            if (i10 <= 0) {
            }
            if (!z10) {
            }
            z11 = false;
            if (length <= i10) {
            }
        } else {
            throw new IllegalArgumentException("The string is empty");
        }
    }

    public static final h9.e r0(f9.c cVar, int i10) {
        v7.g.f(cVar, "<this>");
        return h9.e.j(cVar.getString(i10));
    }

    public static z8.a r1(TypeUsage typeUsage, boolean z10, boolean z11, o8.i iVar, int i10) {
        boolean z12 = (i10 & 1) != 0 ? false : z10;
        boolean z13 = (i10 & 2) != 0 ? false : z11;
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return new z8.a(typeUsage, z13, z12, iVar != null ? a1.c.v1(iVar) : null, 34);
    }

    public static final void s(LayoutNode layoutNode, h0.e eVar, u7.l lVar) {
        h0.e<LayoutNode> r3 = layoutNode.r();
        int i10 = r3.f11334k;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = r3.f11332i;
            v7.g.d(layoutNodeArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                int i12 = eVar.f11334k;
                Object U = lVar.U(layoutNodeArr[i11]);
                if (i12 <= i11) {
                    eVar.b(U);
                } else {
                    Object[] objArr = eVar.f11332i;
                    Object obj = objArr[i11];
                    objArr[i11] = U;
                }
                i11++;
            } while (i11 < i10);
            eVar.o(layoutNode.n().size(), eVar.f11334k);
        }
        eVar.o(layoutNode.n().size(), eVar.f11334k);
    }

    public static final ja.j s0(p7.c cVar) {
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            ja.j j2 = ((kotlinx.coroutines.internal.f) cVar).j();
            if (j2 != null) {
                if (!j2.C()) {
                    j2 = null;
                }
                if (j2 != null) {
                    return j2;
                }
            }
            return new ja.j(2, cVar);
        }
        return new ja.j(1, cVar);
    }

    public static final long s1(double d5, DurationUnit durationUnit) {
        double E = a1.b.E(d5, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(E)) {
            if (!Double.isNaN(E)) {
                long round = Math.round(E);
                if (new b8.l(-4611686018426999999L, 4611686018426999999L).g(round)) {
                    return V(round);
                }
                double E2 = a1.b.E(d5, durationUnit, DurationUnit.MILLISECONDS);
                if (!Double.isNaN(E2)) {
                    return U(Math.round(E2));
                }
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final h0.e t(FocusModifier focusModifier) {
        boolean z10;
        v7.g.f(focusModifier, "<this>");
        h0.e<FocusModifier> eVar = focusModifier.f3018k;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            FocusModifier[] focusModifierArr = eVar.f11332i;
            v7.g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            while (!focusModifierArr[i11].f3019l.b()) {
                i11++;
                if (i11 >= i10) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            return eVar;
        }
        h0.e eVar2 = new h0.e(new FocusModifier[16]);
        int i12 = eVar.f11334k;
        if (i12 > 0) {
            FocusModifier[] focusModifierArr2 = eVar.f11332i;
            v7.g.d(focusModifierArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i13 = 0;
            do {
                FocusModifier focusModifier2 = focusModifierArr2[i13];
                if (!focusModifier2.f3019l.b()) {
                    eVar2.b(focusModifier2);
                } else {
                    FocusRequester U = focusModifier2.f3025s.f3045j.U(new t0.a(7));
                    if (v7.g.a(U, FocusRequester.c)) {
                        return new h0.e(new FocusModifier[16]);
                    }
                    if (v7.g.a(U, FocusRequester.f3054b)) {
                        eVar2.c(eVar2.f11334k, t(focusModifier2));
                    } else {
                        h0.e<t0.j> eVar3 = U.f3055a;
                        int i14 = eVar3.f11334k;
                        if (i14 > 0) {
                            t0.j[] jVarArr = eVar3.f11332i;
                            v7.g.d(jVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i15 = 0;
                            do {
                                FocusModifier d5 = jVarArr[i15].d();
                                if (d5 != null) {
                                    eVar2.b(d5);
                                }
                                i15++;
                            } while (i15 < i14);
                        }
                    }
                }
                i13++;
            } while (i13 < i12);
            return eVar2;
        }
        return eVar2;
    }

    public static final l8.d t0(l8.f fVar) {
        v7.g.f(fVar, "<this>");
        l8.f c10 = fVar.c();
        if (c10 != null && !(fVar instanceof l8.u)) {
            if (!(c10.c() instanceof l8.u)) {
                return t0(c10);
            }
            if (!(c10 instanceof l8.d)) {
                return null;
            }
            return (l8.d) c10;
        }
        return null;
    }

    public static final long t1(long j2, DurationUnit durationUnit) {
        v7.g.f(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long F = a1.b.F(4611686018426999999L, durationUnit2, durationUnit);
        if (new b8.l(-F, F).g(j2)) {
            return V(a1.b.F(j2, durationUnit, durationUnit2));
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        v7.g.f(durationUnit3, "targetUnit");
        return T(a1.c.d0(durationUnit3.f15142i.convert(j2, durationUnit.f15142i), -4611686018427387903L, 4611686018427387903L));
    }

    public static final void u(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final Object u0(x9.e eVar, c8.j jVar) {
        v7.g.f(eVar, "<this>");
        v7.g.f(jVar, "p");
        return eVar.k0();
    }

    public static final Grouping u1(int i10) {
        Grouping[] values;
        for (Grouping grouping : Grouping.values()) {
            if (grouping.ordinal() == i10) {
                return grouping;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Object[] v(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final void v0(CoroutineContext coroutineContext, Throwable th) {
        try {
            ja.w wVar = (ja.w) coroutineContext.a(w.a.f12807i);
            if (wVar != null) {
                wVar.M(coroutineContext, th);
            } else {
                kotlinx.coroutines.a.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a1.c.M(runtimeException, th);
                th = runtimeException;
            }
            kotlinx.coroutines.a.a(coroutineContext, th);
        }
    }

    public static final Layout v1(int i10) {
        Layout[] values;
        for (Layout layout : Layout.values()) {
            if (layout.ordinal() == i10) {
                return layout;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int w(int i10, int i11, int[] iArr) {
        v7.g.f(iArr, "<this>");
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

    public static final boolean w0(p1.k kVar) {
        v7.g.f(kVar, "<this>");
        if (kVar.f16675f == null && kVar.f16673d == null && kVar.c == null) {
            return false;
        }
        return true;
    }

    public static final NewNoteCursorPosition w1(int i10) {
        NewNoteCursorPosition[] values;
        for (NewNoteCursorPosition newNoteCursorPosition : NewNoteCursorPosition.values()) {
            if (newNoteCursorPosition.ordinal() == i10) {
                return newNoteCursorPosition;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final u0.d x(androidx.compose.ui.node.b bVar) {
        v7.g.f(bVar, "<this>");
        NodeCoordinator T0 = bVar.T0();
        if (T0 != null) {
            return T0.t(bVar, true);
        }
        long j2 = bVar.f12642k;
        return new u0.d(0.0f, 0.0f, (int) (j2 >> 32), b2.h.b(j2));
    }

    public static final boolean x0(Spanned spanned, Class cls) {
        v7.g.f(spanned, "<this>");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final NoteListSortingType x1(int i10) {
        NoteListSortingType[] values;
        for (NoteListSortingType noteListSortingType : NoteListSortingType.values()) {
            if (noteListSortingType.ordinal() == i10) {
                return noteListSortingType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final u0.d y(NodeCoordinator nodeCoordinator) {
        v7.g.f(nodeCoordinator, "<this>");
        return ((NodeCoordinator) e0(nodeCoordinator)).t(nodeCoordinator, true);
    }

    public static final p7.c y0(p7.c cVar) {
        ContinuationImpl continuationImpl;
        v7.g.f(cVar, "<this>");
        if (cVar instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) cVar;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl != null && (cVar = continuationImpl.f13037k) == null) {
            p7.d dVar = (p7.d) continuationImpl.f().a(d.a.f16777i);
            if (dVar == null || (cVar = dVar.w(continuationImpl)) == null) {
                cVar = continuationImpl;
            }
            continuationImpl.f13037k = cVar;
        }
        return cVar;
    }

    public static final OpenNotesIn y1(int i10) {
        OpenNotesIn[] values;
        for (OpenNotesIn openNotesIn : OpenNotesIn.values()) {
            if (openNotesIn.ordinal() == i10) {
                return openNotesIn;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final Set z(sa.e eVar) {
        v7.g.f(eVar, "<this>");
        if (eVar instanceof ua.m) {
            return ((ua.m) eVar).e();
        }
        HashSet hashSet = new HashSet(eVar.c());
        int c10 = eVar.c();
        for (int i10 = 0; i10 < c10; i10++) {
            hashSet.add(eVar.d(i10));
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final m0 z0(ArrayList arrayList) {
        y9.v vVar;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
                Iterator it = arrayList.iterator();
                boolean z10 = false;
                boolean z11 = false;
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    if (!z10 && !D0(m0Var)) {
                        z10 = false;
                        if (!(m0Var instanceof y9.v)) {
                            vVar = (y9.v) m0Var;
                        } else if (m0Var instanceof n) {
                            if (kotlin.reflect.jvm.internal.impl.types.f.a(m0Var)) {
                                return m0Var;
                            }
                            vVar = ((n) m0Var).f18958j;
                            z11 = true;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(vVar);
                    }
                    z10 = true;
                    if (!(m0Var instanceof y9.v)) {
                    }
                    arrayList2.add(vVar);
                }
                if (z10) {
                    return aa.h.c(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
                }
                if (!z11) {
                    return TypeIntersector.f14989a.b(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(n7.l.Z1(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(a1.b.K0((m0) it2.next()));
                }
                TypeIntersector typeIntersector = TypeIntersector.f14989a;
                return KotlinTypeFactory.c(typeIntersector.b(arrayList2), typeIntersector.b(arrayList3));
            }
            return (m0) kotlin.collections.c.C2(arrayList);
        }
        throw new IllegalStateException("Expected some types".toString());
    }

    public static final String z1(String str) {
        v7.g.f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "builder.toString()");
        return sb2;
    }

    public void G1(o.b bVar) {
        float f10;
        a.C0201a c0201a = (a.C0201a) bVar;
        if (!o.a.this.getUseCompatPadding()) {
            c0201a.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c0201a.f16162a;
        float f11 = ((o.c) drawable).f16167e;
        float f12 = ((o.c) drawable).f16164a;
        o.a aVar = o.a.this;
        if (aVar.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - o.d.f16174a) * f12) + f11);
        } else {
            int i10 = o.d.f16175b;
            f10 = f11;
        }
        int ceil = (int) Math.ceil(f10);
        int ceil2 = (int) Math.ceil(o.d.a(f11, f12, aVar.getPreventCornerOverlap()));
        c0201a.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.airbnb.epoxy.o0
    public void a(String str) {
    }

    @Override // u9.j
    public void b(o8.b bVar, ArrayList arrayList) {
        v7.g.f(bVar, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + bVar.getName() + ", unresolved classes " + arrayList);
    }

    @Override // v.c
    public q0.d c() {
        return new v.b(a.C0210a.c, InspectableValueKt.f3744a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // u1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface d(u1.n nVar, m mVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        String str2;
        boolean z14;
        Typeface typeface;
        v7.g.f(nVar, "name");
        v7.g.f(mVar, "fontWeight");
        String str3 = nVar.f17760k;
        v7.g.f(str3, "name");
        int i11 = mVar.f17759i / 100;
        boolean z15 = true;
        if (i11 >= 0 && i11 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "-thin";
        } else {
            if (2 <= i11 && i11 < 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str = "-light";
            } else {
                if (i11 != 4) {
                    if (i11 == 5) {
                        str = "-medium";
                    } else {
                        if (6 <= i11 && i11 < 8) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            if (8 <= i11 && i11 < 11) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                str = "-black";
                            }
                        }
                    }
                }
                str2 = str3;
                if (str2.length() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                typeface = null;
                if (z14) {
                    Typeface O = O(str2, mVar, i10);
                    if (v7.g.a(O, Typeface.create(Typeface.DEFAULT, g0(mVar, i10))) || v7.g.a(O, O(null, mVar, i10))) {
                        z15 = false;
                    }
                    if (z15) {
                        typeface = O;
                    }
                }
                if (typeface != null) {
                    return O(str3, mVar, i10);
                }
                return typeface;
            }
        }
        str2 = str3.concat(str);
        if (str2.length() != 0) {
        }
        typeface = null;
        if (z14) {
        }
        if (typeface != null) {
        }
    }

    @Override // t.h
    public long e(g1.c cVar, g1.k kVar) {
        v7.g.f(cVar, "$this$calculateMouseWheelScroll");
        u0.c cVar2 = new u0.c(u0.c.f17721b);
        List<g1.o> list = kVar.f11159a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            long j2 = cVar2.f17724a;
            if (i10 < size) {
                i10++;
                cVar2 = new u0.c(u0.c.f(j2, list.get(i10).f11169i));
            } else {
                return u0.c.g(-cVar.H(64), j2);
            }
        }
    }

    @Override // z3.a
    public /* synthetic */ void f(c4.b bVar) {
    }

    @Override // u9.j
    public void g(CallableMemberDescriptor callableMemberDescriptor) {
        v7.g.f(callableMemberDescriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }

    @Override // u1.r
    public Typeface h(m mVar, int i10) {
        v7.g.f(mVar, "fontWeight");
        return O(null, mVar, i10);
    }

    public void k0(float f10, float f11, b6.n nVar) {
        throw null;
    }

    public void k1(o.b bVar, float f10) {
        a.C0201a c0201a = (a.C0201a) bVar;
        o.c cVar = (o.c) c0201a.f16162a;
        boolean useCompatPadding = o.a.this.getUseCompatPadding();
        boolean preventCornerOverlap = o.a.this.getPreventCornerOverlap();
        if (f10 != cVar.f16167e || cVar.f16168f != useCompatPadding || cVar.f16169g != preventCornerOverlap) {
            cVar.f16167e = f10;
            cVar.f16168f = useCompatPadding;
            cVar.f16169g = preventCornerOverlap;
            cVar.c(null);
            cVar.invalidateSelf();
        }
        G1(c0201a);
    }

    @Override // com.airbnb.epoxy.o0
    public void stop() {
    }

    public /* synthetic */ b(int i10) {
    }

    public /* synthetic */ b(Locale locale, CharSequence charSequence) {
        int length = charSequence.length();
        boolean z10 = true;
        if (!(charSequence.length() >= 0)) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (length < 0 || length > charSequence.length()) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        v7.g.e(wordInstance, "getWordInstance(locale)");
        Math.max(0, -50);
        Math.min(charSequence.length(), length + 50);
        wordInstance.setText(new q1.d(charSequence, length));
    }
}
