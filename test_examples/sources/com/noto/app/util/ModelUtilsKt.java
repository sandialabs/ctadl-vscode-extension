package com.noto.app.util;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Base64;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.domain.model.SortingOrder;
import f7.m;
import f7.o;
import f7.q;
import g0.t0;
import g0.z0;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m7.n;
import u7.l;
import u7.p;
import x6.h0;

/* loaded from: classes.dex */
public final class ModelUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9848a = q.d(2);

    /* renamed from: b  reason: collision with root package name */
    public static final k f9849b = new k(new j());

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((h0) t11).f18683a.f17626g), Boolean.valueOf(((h0) t10).f18683a.f17626g));
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer num;
            t6.c cVar = (t6.c) kotlin.collections.c.p2((List) ((Pair) t10).f12962i);
            Integer num2 = null;
            if (cVar != null) {
                num = Integer.valueOf(cVar.f17618e);
            } else {
                num = null;
            }
            t6.c cVar2 = (t6.c) kotlin.collections.c.p2((List) ((Pair) t11).f12962i);
            if (cVar2 != null) {
                num2 = Integer.valueOf(cVar2.f17618e);
            }
            return a1.c.g0(num, num2);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer num;
            t6.c cVar = (t6.c) kotlin.collections.c.p2((List) ((Pair) t11).f12962i);
            Integer num2 = null;
            if (cVar != null) {
                num = Integer.valueOf(cVar.f17618e);
            } else {
                num = null;
            }
            t6.c cVar2 = (t6.c) kotlin.collections.c.p2((List) ((Pair) t10).f12962i);
            if (cVar2 != null) {
                num2 = Integer.valueOf(cVar2.f17618e);
            }
            return a1.c.g0(num, num2);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((t6.a) ((Pair) t11).f12962i).f17600j), Boolean.valueOf(((t6.a) ((Pair) t10).f12962i).f17600j));
        }
    }

    /* loaded from: classes.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((h0) t11).f18683a.f17626g), Boolean.valueOf(((h0) t10).f18683a.f17626g));
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f9854a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FolderListSortingType f9855b;

        public f(d dVar, FolderListSortingType folderListSortingType) {
            this.f9854a = dVar;
            this.f9855b = folderListSortingType;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparable valueOf;
            Comparable valueOf2;
            int compare = this.f9854a.compare(t10, t11);
            if (compare == 0) {
                Pair pair = (Pair) t10;
                FolderListSortingType folderListSortingType = this.f9855b;
                int ordinal = folderListSortingType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            valueOf = ((t6.a) pair.f12962i).c;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        valueOf = ((t6.a) pair.f12962i).f17596f;
                    }
                } else {
                    valueOf = Integer.valueOf(((t6.a) pair.f12962i).f17594d);
                }
                Pair pair2 = (Pair) t11;
                int ordinal2 = folderListSortingType.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            valueOf2 = ((t6.a) pair2.f12962i).c;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        valueOf2 = ((t6.a) pair2.f12962i).f17596f;
                    }
                } else {
                    valueOf2 = Integer.valueOf(((t6.a) pair2.f12962i).f17594d);
                }
                return a1.c.g0(valueOf, valueOf2);
            }
            return compare;
        }
    }

    /* loaded from: classes.dex */
    public static final class g<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f9856a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FolderListSortingType f9857b;

        public g(d dVar, FolderListSortingType folderListSortingType) {
            this.f9856a = dVar;
            this.f9857b = folderListSortingType;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparable valueOf;
            Comparable valueOf2;
            int compare = this.f9856a.compare(t10, t11);
            if (compare == 0) {
                Pair pair = (Pair) t11;
                FolderListSortingType folderListSortingType = this.f9857b;
                int ordinal = folderListSortingType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            valueOf = ((t6.a) pair.f12962i).c;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        valueOf = ((t6.a) pair.f12962i).f17596f;
                    }
                } else {
                    valueOf = Integer.valueOf(((t6.a) pair.f12962i).f17594d);
                }
                Pair pair2 = (Pair) t10;
                int ordinal2 = folderListSortingType.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            valueOf2 = ((t6.a) pair2.f12962i).c;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        valueOf2 = ((t6.a) pair2.f12962i).f17596f;
                    }
                } else {
                    valueOf2 = Integer.valueOf(((t6.a) pair2.f12962i).f17594d);
                }
                return a1.c.g0(valueOf, valueOf2);
            }
            return compare;
        }
    }

    /* loaded from: classes.dex */
    public static final class h<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f9862a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NoteListSortingType f9863b;

        public h(e eVar, NoteListSortingType noteListSortingType) {
            this.f9862a = eVar;
            this.f9863b = noteListSortingType;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparable valueOf;
            Comparable valueOf2;
            int compare = this.f9862a.compare(t10, t11);
            if (compare == 0) {
                h0 h0Var = (h0) t10;
                NoteListSortingType noteListSortingType = this.f9863b;
                int ordinal = noteListSortingType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                valueOf = h0Var.f18683a.f17630k;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String str = h0Var.f18683a.c;
                            if (ha.i.T0(str)) {
                                valueOf = h0Var.f18683a.f17623d;
                            } else {
                                valueOf = str;
                            }
                        }
                    } else {
                        valueOf = h0Var.f18683a.f17625f;
                    }
                } else {
                    valueOf = Integer.valueOf(h0Var.f18683a.f17624e);
                }
                h0 h0Var2 = (h0) t11;
                int ordinal2 = noteListSortingType.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 == 3) {
                                valueOf2 = h0Var2.f18683a.f17630k;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String str2 = h0Var2.f18683a.c;
                            if (ha.i.T0(str2)) {
                                valueOf2 = h0Var2.f18683a.f17623d;
                            } else {
                                valueOf2 = str2;
                            }
                        }
                    } else {
                        valueOf2 = h0Var2.f18683a.f17625f;
                    }
                } else {
                    valueOf2 = Integer.valueOf(h0Var2.f18683a.f17624e);
                }
                return a1.c.g0(valueOf, valueOf2);
            }
            return compare;
        }
    }

    /* loaded from: classes.dex */
    public static final class i<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f9864a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NoteListSortingType f9865b;

        public i(e eVar, NoteListSortingType noteListSortingType) {
            this.f9864a = eVar;
            this.f9865b = noteListSortingType;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparable valueOf;
            Comparable valueOf2;
            int compare = this.f9864a.compare(t10, t11);
            if (compare == 0) {
                h0 h0Var = (h0) t11;
                NoteListSortingType noteListSortingType = this.f9865b;
                int ordinal = noteListSortingType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                valueOf = h0Var.f18683a.f17630k;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String str = h0Var.f18683a.c;
                            if (ha.i.T0(str)) {
                                valueOf = h0Var.f18683a.f17623d;
                            } else {
                                valueOf = str;
                            }
                        }
                    } else {
                        valueOf = h0Var.f18683a.f17625f;
                    }
                } else {
                    valueOf = Integer.valueOf(h0Var.f18683a.f17624e);
                }
                h0 h0Var2 = (h0) t10;
                int ordinal2 = noteListSortingType.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 == 3) {
                                valueOf2 = h0Var2.f18683a.f17630k;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String str2 = h0Var2.f18683a.c;
                            if (ha.i.T0(str2)) {
                                valueOf2 = h0Var2.f18683a.f17623d;
                            } else {
                                valueOf2 = str2;
                            }
                        }
                    } else {
                        valueOf2 = h0Var2.f18683a.f17625f;
                    }
                } else {
                    valueOf2 = Integer.valueOf(h0Var2.f18683a.f17624e);
                }
                return a1.c.g0(valueOf, valueOf2);
            }
            return compare;
        }
    }

    /* loaded from: classes.dex */
    public static final class j<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Boolean.valueOf(((y6.h) t11).f18913b), Boolean.valueOf(((y6.h) t10).f18913b));
        }
    }

    /* loaded from: classes.dex */
    public static final class k<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f9866a;

        public k(j jVar) {
            this.f9866a = jVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int compare = this.f9866a.compare(t10, t11);
            if (compare == 0) {
                return a1.c.g0(Integer.valueOf(((y6.h) t10).f18912a.f17618e), Integer.valueOf(((y6.h) t11).f18912a.f17618e));
            }
            return compare;
        }
    }

    public static final List<Pair<t6.a, Integer>> A(List<Pair<t6.a, Integer>> list, FolderListSortingType folderListSortingType, SortingOrder sortingOrder) {
        Comparator fVar;
        v7.g.f(list, "<this>");
        v7.g.f(folderListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        d dVar = new d();
        int ordinal = sortingOrder.ordinal();
        if (ordinal == 0) {
            fVar = new f(dVar, folderListSortingType);
        } else if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        } else {
            fVar = new g(dVar, folderListSortingType);
        }
        return kotlin.collections.c.G2(list, fVar);
    }

    public static final List<h0> B(List<h0> list, NoteListSortingType noteListSortingType, SortingOrder sortingOrder) {
        Comparator hVar;
        v7.g.f(list, "<this>");
        v7.g.f(noteListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        e eVar = new e();
        int ordinal = sortingOrder.ordinal();
        if (ordinal == 0) {
            hVar = new h(eVar, noteListSortingType);
        } else if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        } else {
            hVar = new i(eVar, noteListSortingType);
        }
        return kotlin.collections.c.G2(list, hVar);
    }

    public static final String C(String str) {
        List<String> h12;
        List i22;
        String obj = (str == null || (h12 = kotlin.text.b.h1(str)) == null || (i22 = kotlin.collections.c.i2(h12)) == null) ? null : kotlin.text.b.w1(kotlin.collections.c.t2(i22, "\n", null, null, null, 62)).toString();
        return obj == null ? "" : obj;
    }

    public static final String D(String str, int i10) {
        v7.g.f(str, "<this>");
        return kotlin.collections.c.t2(kotlin.collections.c.I2(kotlin.text.b.h1(str), i10), "\n", null, null, null, 62);
    }

    public static final String E(Icon icon, boolean z10) {
        String str;
        v7.g.f(icon, "<this>");
        switch (icon.ordinal()) {
            case 0:
                if (!z10) {
                    str = "Futuristic";
                    break;
                } else {
                    str = "AppActivity";
                    break;
                }
            case 1:
                str = "DarkRain";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                str = "Airplane";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                str = "BlossomIce";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                str = "DarkAlpine";
                break;
            case 5:
                str = "DarkSide";
                break;
            case 6:
                str = "Earth";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "Fire";
                break;
            case 8:
                str = "Purpleberry";
                break;
            case ma.i.f16046m /* 9 */:
                str = "SanguineSun";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return "com.noto.app.".concat(str);
    }

    public static final Locale F(Language language) {
        v7.g.f(language, "<this>");
        switch (language.ordinal()) {
            case 0:
                Locale locale = Locale.getDefault();
                v7.g.e(locale, "getDefault()");
                return locale;
            case 1:
                return new Locale("en");
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new Locale("tr");
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new Locale("ar");
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return new Locale("in");
            case 5:
                return new Locale("ru");
            case 6:
                return new Locale("ta");
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Locale("es");
            case 8:
                return new Locale("fr");
            case ma.i.f16046m /* 9 */:
                return new Locale("de");
            case ma.i.f16047o /* 10 */:
                return new Locale("it");
            case 11:
                return new Locale("cs");
            case 12:
                return new Locale("lt");
            case 13:
                return new Locale("zh");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Context G(Language language, g0.d dVar) {
        v7.g.f(language, "<this>");
        dVar.f(590525938);
        u7.q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        Locale F = F(language);
        Context context = (Context) dVar.w(AndroidCompositionLocals_androidKt.f3656b);
        Configuration configuration = new Configuration((Configuration) dVar.w(AndroidCompositionLocals_androidKt.f3655a));
        configuration.setLocale(F);
        configuration.setLayoutDirection(F);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        if (createConfigurationContext != null) {
            context = createConfigurationContext;
        }
        dVar.u();
        return context;
    }

    public static final String a(Language language, g0.d dVar) {
        int i10;
        v7.g.f(language, "<this>");
        dVar.f(1821667724);
        u7.q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        switch (language.ordinal()) {
            case 0:
                dVar.f(1746058469);
                i10 = R.string.follow_system;
                break;
            case 1:
                dVar.f(1746058541);
                i10 = R.string.english;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                dVar.f(1746058607);
                i10 = R.string.turkish;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                dVar.f(1746058672);
                i10 = R.string.arabic;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                dVar.f(1746058740);
                i10 = R.string.indonesian;
                break;
            case 5:
                dVar.f(1746058809);
                i10 = R.string.russian;
                break;
            case 6:
                dVar.f(1746058873);
                i10 = R.string.tamil;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                dVar.f(1746058937);
                i10 = R.string.spanish;
                break;
            case 8:
                dVar.f(1746059002);
                i10 = R.string.french;
                break;
            case ma.i.f16046m /* 9 */:
                dVar.f(1746059066);
                i10 = R.string.german;
                break;
            case ma.i.f16047o /* 10 */:
                dVar.f(1746059131);
                i10 = R.string.italian;
                break;
            case 11:
                dVar.f(1746059195);
                i10 = R.string.czech;
                break;
            case 12:
                dVar.f(1746059262);
                i10 = R.string.lithuanian;
                break;
            case 13:
                dVar.f(1746059341);
                i10 = R.string.simplified_chinese;
                break;
            default:
                dVar.f(1746047938);
                dVar.u();
                throw new NoWhenBranchMatchedException();
        }
        String m12 = m0.b.m1(i10, dVar);
        dVar.u();
        dVar.u();
        return m12;
    }

    public static final String b(ScreenBrightnessLevel screenBrightnessLevel, g0.d dVar) {
        int i10;
        v7.g.f(screenBrightnessLevel, "<this>");
        dVar.f(609074559);
        u7.q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        switch (screenBrightnessLevel.ordinal()) {
            case 0:
                dVar.f(1746057793);
                i10 = R.string.follow_system;
                break;
            case 1:
                dVar.f(1746057874);
                i10 = R.string.min;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                dVar.f(1746057949);
                i10 = R.string.very_low;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                dVar.f(1746058025);
                i10 = R.string.low;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                dVar.f(1746058099);
                i10 = R.string.medium;
                break;
            case 5:
                dVar.f(1746058174);
                i10 = R.string.high;
                break;
            case 6:
                dVar.f(1746058251);
                i10 = R.string.very_high;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                dVar.f(1746058328);
                i10 = R.string.max;
                break;
            default:
                dVar.f(1746047938);
                dVar.u();
                throw new NoWhenBranchMatchedException();
        }
        String m12 = m0.b.m1(i10, dVar);
        dVar.u();
        dVar.u();
        return m12;
    }

    public static final int c(List<Pair<t6.a, Integer>> list) {
        v7.g.f(list, "<this>");
        int size = list.size();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            size += c(((t6.a) ((Pair) it.next()).f12962i).f17610u);
        }
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0.add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList d(ArrayList arrayList, String str) {
        v7.g.f(str, "content");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h0 h0Var = (h0) next;
            boolean z10 = true;
            if (!kotlin.text.b.Y0(h0Var.f18683a.c, str, true) && !kotlin.text.b.Y0(h0Var.f18683a.f17623d, str, true)) {
                z10 = false;
            }
        }
        return arrayList2;
    }

    public static final LinkedHashMap e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static final ArrayList f(List list, l lVar) {
        v7.g.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) lVar.U(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            t6.a aVar = (t6.a) pair.f12962i;
            arrayList2.add(new Pair(t6.a.a(aVar, null, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, f(aVar.f17610u, lVar), 1048575), pair.f12963j));
        }
        return arrayList2;
    }

    public static final ArrayList g(List list) {
        v7.g.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((y6.h) obj).f18913b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y6.h) it.next()).f18912a);
        }
        return arrayList2;
    }

    public static final ArrayList h(Map map) {
        v7.g.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((t6.c) entry2.getKey());
        }
        return arrayList;
    }

    public static final ArrayList i(List list, List list2, FilteringType filteringType) {
        boolean z10;
        v7.g.f(list, "<this>");
        v7.g.f(list2, "selectedLabels");
        v7.g.f(filteringType, "filteringType");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            h0 h0Var = (h0) obj;
            boolean z11 = true;
            if (!list2.isEmpty()) {
                int ordinal = filteringType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            z11 = v7.g.a(h0Var.f18684b, list2);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        z11 = h0Var.f18684b.containsAll(list2);
                    }
                } else {
                    List<t6.c> list3 = h0Var.f18684b;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (t6.c cVar : list3) {
                            if (!list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    if (v7.g.a((t6.c) it.next(), cVar)) {
                                        z10 = true;
                                        continue;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            continue;
                            if (z10) {
                                break;
                            }
                        }
                    }
                    z11 = false;
                }
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Pair<t6.a, Integer> j(List<Pair<t6.a, Integer>> list, l<? super Pair<t6.a, Integer>, Boolean> lVar) {
        Object obj;
        v7.g.f(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (lVar.U(obj).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Pair<t6.a, Integer> pair = (Pair) obj;
        if (pair != null) {
            return pair;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<t6.a, Integer> j2 = j(((t6.a) ((Pair) it2.next()).f12962i).f17610u, lVar);
            if (j2 != null) {
                return j2;
            }
        }
        return null;
    }

    public static final String k(String str) {
        List<String> h12;
        String str2;
        String obj = (str == null || (h12 = kotlin.text.b.h1(str)) == null || (str2 = (String) kotlin.collections.c.p2(h12)) == null) ? null : kotlin.text.b.w1(str2).toString();
        return obj == null ? "" : obj;
    }

    public static final void l(List<Pair<t6.a, Integer>> list, int i10, p<? super Pair<t6.a, Integer>, ? super Integer, n> pVar) {
        v7.g.f(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            pVar.R(pair, Integer.valueOf(i10));
            l(((t6.a) pair.f12962i).f17610u, i10 + 1, pVar);
        }
    }

    public static final String m(t6.d dVar) {
        v7.g.f(dVar, "<this>");
        return kotlin.text.b.w1(kotlin.text.a.N0("\n    " + dVar.c + "\n    \n    " + dVar.f17623d + "\n")).toString();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:669)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:527)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:281)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:251)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:257)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:241)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:132)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:95)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:384)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:332)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object n(u6.b r11, long r12, t6.c r14, p7.c<? super java.lang.Long> r15) {
        /*
            boolean r0 = r15 instanceof com.noto.app.util.ModelUtilsKt$getOrCreateLabel$1
            if (r0 == 0) goto L13
            r0 = r15
            com.noto.app.util.ModelUtilsKt$getOrCreateLabel$1 r0 = (com.noto.app.util.ModelUtilsKt$getOrCreateLabel$1) r0
            int r1 = r0.f9861p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9861p = r1
            goto L18
        L13:
            com.noto.app.util.ModelUtilsKt$getOrCreateLabel$1 r0 = new com.noto.app.util.ModelUtilsKt$getOrCreateLabel$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f9860o
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f9861p
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            m0.b.n1(r15)
            goto La3
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            long r12 = r0.n
            t6.c r14 = r0.f9859m
            u6.b r11 = r0.f9858l
            m0.b.n1(r15)
            goto L53
        L3d:
            m0.b.n1(r15)
            kotlinx.coroutines.flow.b r15 = r11.e(r12)
            r0.f9858l = r11
            r0.f9859m = r14
            r0.n = r12
            r0.f9861p = r3
            java.lang.Object r15 = kotlinx.coroutines.flow.FlowKt__ReduceKt.a(r15, r0)
            if (r15 != r1) goto L53
            return r1
        L53:
            r6 = r12
            r5 = r14
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r12 = r15.iterator()
        L5b:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L74
            java.lang.Object r13 = r12.next()
            r15 = r13
            t6.c r15 = (t6.c) r15
            java.lang.String r15 = r15.c
            java.lang.String r2 = r5.c
            boolean r15 = v7.g.a(r15, r2)
            if (r15 == 0) goto L5b
            goto L75
        L74:
            r13 = r14
        L75:
            t6.c r13 = (t6.c) r13
            if (r13 == 0) goto L81
            java.lang.Long r12 = new java.lang.Long
            long r8 = r13.f17615a
            r12.<init>(r8)
            goto L82
        L81:
            r12 = r14
        L82:
            if (r12 == 0) goto L8e
            long r11 = r12.longValue()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            return r13
        L8e:
            r8 = 0
            r9 = 0
            r10 = 28
            t6.c r12 = t6.c.a(r5, r6, r8, r9, r10)
            r0.f9858l = r14
            r0.f9859m = r14
            r0.f9861p = r4
            java.lang.Object r15 = r11.f(r12, r3, r0)
            if (r15 != r1) goto La3
            return r1
        La3:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.noto.app.util.ModelUtilsKt.n(u6.b, long, t6.c, p7.c):java.lang.Object");
    }

    public static final String o(Context context, t6.a aVar) {
        v7.g.f(aVar, "<this>");
        v7.g.f(context, "context");
        if (u(aVar)) {
            return q.f(context, R.string.general, new Object[0]);
        }
        return aVar.c;
    }

    public static final int p(String str) {
        List list;
        v7.g.f(str, "<this>");
        int i10 = 0;
        if (ha.i.T0(str)) {
            return 0;
        }
        Regex regex = new Regex("\\s+");
        kotlin.text.b.l1(0);
        Matcher matcher = regex.f15129i.matcher(str);
        if (!matcher.find()) {
            list = a1.c.N0(str.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(i10, matcher.start()).toString());
                i10 = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(i10, str.length()).toString());
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!ha.i.T0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size();
    }

    public static final List<Pair<na.d, List<h0>>> q(List<h0> list, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, GroupingOrder groupingOrder) {
        v7.g.f(noteListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        v7.g.f(groupingOrder, "groupingOrder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            na.d e10 = f7.g.e(((h0) obj).f18683a.f17630k);
            Object obj2 = linkedHashMap.get(e10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(e10, obj2);
            }
            ((List) obj2).add(obj);
        }
        return z(linkedHashMap, noteListSortingType, sortingOrder, groupingOrder);
    }

    public static final List<Pair<na.d, List<h0>>> r(List<h0> list, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, GroupingOrder groupingOrder) {
        v7.g.f(noteListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        v7.g.f(groupingOrder, "groupingOrder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            na.d e10 = f7.g.e(((h0) obj).f18683a.f17625f);
            Object obj2 = linkedHashMap.get(e10);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(e10, obj2);
            }
            ((List) obj2).add(obj);
        }
        return z(linkedHashMap, noteListSortingType, sortingOrder, groupingOrder);
    }

    public static final List<Pair<List<t6.c>, List<h0>>> s(List<h0> list, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, GroupingOrder groupingOrder) {
        Comparator bVar;
        v7.g.f(noteListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        v7.g.f(groupingOrder, "groupingOrder");
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        for (h0 h0Var : list) {
            arrayList.add(new Pair(h0Var.f18684b, h0.a(h0Var, EmptyList.f12981i, false, 0, 13)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            List list2 = (List) pair.f12962i;
            Object obj = linkedHashMap.get(list2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(list2, obj);
            }
            ((List) obj).add((h0) pair.f12963j);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.b.O0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), kotlin.collections.c.G2(B((List) entry.getValue(), noteListSortingType, sortingOrder), new a()));
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList2.add(new Pair(entry2.getKey(), entry2.getValue()));
        }
        if (groupingOrder == GroupingOrder.Descending) {
            bVar = new c();
        } else {
            bVar = new b();
        }
        return kotlin.collections.c.G2(arrayList2, bVar);
    }

    public static final String t(String str) {
        v7.g.f(str, "<this>");
        char[] charArray = str.toCharArray();
        v7.g.e(charArray, "this as java.lang.String).toCharArray()");
        String encodeToString = Base64.encodeToString(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(charArray, new byte[16], 65536, 128)).getEncoded(), 0);
        v7.g.e(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public static final boolean u(t6.a aVar) {
        v7.g.f(aVar, "<this>");
        return aVar.f17592a == -1;
    }

    public static final boolean v(t6.d dVar) {
        long t12;
        boolean z10;
        na.c cVar;
        na.c cVar2;
        v7.g.f(dVar, "<this>");
        na.c.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        v7.g.e(instant, "systemUTC().instant()");
        na.c cVar3 = new na.c(instant);
        int i10 = ia.b.f11864l;
        DurationUnit durationUnit = DurationUnit.DAYS;
        v7.g.f(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.SECONDS;
        if (durationUnit.compareTo(durationUnit2) <= 0) {
            t12 = m0.b.V(a1.b.F(7, durationUnit, DurationUnit.NANOSECONDS));
        } else {
            t12 = m0.b.t1(7, durationUnit);
        }
        long o10 = ia.b.o(t12);
        try {
            Instant plusNanos = cVar3.f16147i.plusSeconds(ia.b.m(o10, durationUnit2)).plusNanos(ia.b.j(o10));
            v7.g.e(plusNanos, "value.plusSeconds(second…nos(nanoseconds.toLong())");
            cVar2 = new na.c(plusNanos);
        } catch (Exception e10) {
            if (!(e10 instanceof ArithmeticException) && !(e10 instanceof DateTimeException)) {
                throw e10;
            }
            if (o10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar = na.c.f16146k;
            } else {
                cVar = na.c.f16145j;
            }
            cVar2 = cVar;
        }
        na.c cVar4 = dVar.f17630k;
        cVar4.getClass();
        v7.g.f(cVar2, "other");
        if (cVar4.f16147i.compareTo(cVar2.f16147i) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean w(t6.d dVar) {
        v7.g.f(dVar, "<this>");
        return (ha.i.T0(dVar.c) ^ true) || (ha.i.T0(dVar.f17623d) ^ true);
    }

    public static final ArrayList x(List list, List list2, List list3, long[] jArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        List list4 = list2;
        v7.g.f(list, "<this>");
        v7.g.f(list4, "labels");
        v7.g.f(list3, "noteLabels");
        v7.g.f(jArr, "selectedNoteIds");
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t6.d dVar = (t6.d) it.next();
            List G2 = kotlin.collections.c.G2(list4, new f7.i());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : G2) {
                t6.c cVar = (t6.c) obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list3) {
                    Iterator it2 = it;
                    if (((t6.e) obj2).f17635b == dVar.f17621a) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList3.add(obj2);
                    }
                    it = it2;
                }
                Iterator it3 = it;
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        if (((t6.e) it4.next()).c == cVar.f17615a) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    arrayList2.add(obj);
                }
                it = it3;
            }
            arrayList.add(new h0(dVar, arrayList2, kotlin.collections.b.j2(dVar.f17621a, jArr), -1));
            list4 = list2;
            it = it;
        }
        return arrayList;
    }

    public static final List z(LinkedHashMap linkedHashMap, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, GroupingOrder groupingOrder) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m0.b.O0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), kotlin.collections.c.G2(B((List) entry.getValue(), noteListSortingType, sortingOrder), new m()));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        }
        return kotlin.collections.c.G2(arrayList, groupingOrder == GroupingOrder.Descending ? new o() : new f7.n());
    }
}
