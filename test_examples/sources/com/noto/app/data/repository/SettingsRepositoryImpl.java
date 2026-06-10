package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.filtered.FilteredItemModel;
import ha.h;
import j3.d;
import ja.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.c;
import m3.a;
import m7.n;
import ma.i;
import n7.l;
import t6.v;
import u6.e;
import v7.g;

/* loaded from: classes.dex */
public final class SettingsRepositoryImpl implements e {

    /* renamed from: a  reason: collision with root package name */
    public final d<a> f7731a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f7732b;
    public final b<v> c;

    /* renamed from: d  reason: collision with root package name */
    public final b<Theme> f7733d;

    /* renamed from: e  reason: collision with root package name */
    public final b<Font> f7734e;

    /* renamed from: f  reason: collision with root package name */
    public final b<Language> f7735f;

    /* renamed from: g  reason: collision with root package name */
    public final b<Icon> f7736g;

    /* renamed from: h  reason: collision with root package name */
    public final b<String> f7737h;

    /* renamed from: i  reason: collision with root package name */
    public final b<VaultTimeout> f7738i;

    /* renamed from: j  reason: collision with root package name */
    public final b<VaultTimeout> f7739j;

    /* renamed from: k  reason: collision with root package name */
    public final b<Boolean> f7740k;

    /* renamed from: l  reason: collision with root package name */
    public final b<Boolean> f7741l;

    /* renamed from: m  reason: collision with root package name */
    public final b<Boolean> f7742m;
    public final b<Boolean> n;

    /* renamed from: o  reason: collision with root package name */
    public final b<Boolean> f7743o;

    /* renamed from: p  reason: collision with root package name */
    public final b<String> f7744p;

    /* renamed from: q  reason: collision with root package name */
    public final b<FolderListSortingType> f7745q;

    /* renamed from: r  reason: collision with root package name */
    public final b<SortingOrder> f7746r;

    /* renamed from: s  reason: collision with root package name */
    public final b<Boolean> f7747s;

    /* renamed from: t  reason: collision with root package name */
    public final b<Long> f7748t;

    /* renamed from: u  reason: collision with root package name */
    public final b<Boolean> f7749u;

    /* renamed from: v  reason: collision with root package name */
    public final b<Long> f7750v;

    /* renamed from: w  reason: collision with root package name */
    public final b<ScreenBrightnessLevel> f7751w;

    /* renamed from: x  reason: collision with root package name */
    public final b<Boolean> f7752x;

    /* JADX WARN: Type inference failed for: r1v60, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$38] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$22] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$24] */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$26] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$28] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$30] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$32] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$34] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$4] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$36] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$8] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$11] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$13] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$15] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$17] */
    public SettingsRepositoryImpl(d dVar) {
        kotlinx.coroutines.scheduling.a aVar = f0.f12767b;
        g.f(dVar, "storage");
        g.f(aVar, "dispatcher");
        this.f7731a = dVar;
        this.f7732b = aVar;
        final b b5 = dVar.b();
        this.c = a1.b.Q(new b<v>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7869i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ SettingsRepositoryImpl f7870j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public boolean A;
                    public boolean B;
                    public boolean C;
                    public boolean D;
                    public boolean E;
                    public boolean F;
                    public long G;
                    public int H;
                    public int I;
                    public int J;

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7871l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7872m;
                    public c n;

                    /* renamed from: p  reason: collision with root package name */
                    public Object f7874p;

                    /* renamed from: q  reason: collision with root package name */
                    public Enum f7875q;

                    /* renamed from: r  reason: collision with root package name */
                    public Enum f7876r;

                    /* renamed from: s  reason: collision with root package name */
                    public Enum f7877s;

                    /* renamed from: t  reason: collision with root package name */
                    public Object f7878t;

                    /* renamed from: u  reason: collision with root package name */
                    public Object f7879u;

                    /* renamed from: v  reason: collision with root package name */
                    public VaultTimeout f7880v;

                    /* renamed from: w  reason: collision with root package name */
                    public Object f7881w;

                    /* renamed from: x  reason: collision with root package name */
                    public Object f7882x;

                    /* renamed from: y  reason: collision with root package name */
                    public Enum f7883y;

                    /* renamed from: z  reason: collision with root package name */
                    public SortingOrder f7884z;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7871l = obj;
                        this.f7872m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, SettingsRepositoryImpl settingsRepositoryImpl) {
                    this.f7869i = cVar;
                    this.f7870j = settingsRepositoryImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x08fd A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:101:0x08fe  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0969 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:105:0x096a  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x09e0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x09e1  */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x0a5b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0a5c  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0ad5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0ad6  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0b27 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x021b  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0280  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x02de  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0339  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x03c9  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0410  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0441  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0477  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x04a1  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x04d3  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x04f7  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0521  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x053f  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x055f  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0575  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x058a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0597  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x05c8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x05c9  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x05e5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x05e6  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0603 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0604  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x062a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x062b  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x064c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x064d  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0679 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x067a  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x06a0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:65:0x06a1  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x06d8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x06d9  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0707 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0708  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0741 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0742  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0776 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0777  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x07b8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:85:0x07b9  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x07fb A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x07fc  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x084c A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:93:0x084d  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x08a0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:97:0x08a1  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    c cVar2;
                    AnonymousClass2<T> anonymousClass2;
                    Object a10;
                    Theme theme;
                    Object a11;
                    AnonymousClass2<T> anonymousClass22;
                    c cVar3;
                    Font font;
                    Object a12;
                    Language language;
                    Theme theme2;
                    Font font2;
                    c cVar4;
                    Object a13;
                    AnonymousClass2<T> anonymousClass23;
                    c cVar5;
                    Icon icon;
                    Object a14;
                    String str;
                    Theme theme3;
                    Language language2;
                    Icon icon2;
                    c cVar6;
                    Font font3;
                    Object a15;
                    AnonymousClass2<T> anonymousClass24;
                    c cVar7;
                    VaultTimeout vaultTimeout;
                    Object a16;
                    VaultTimeout vaultTimeout2;
                    Theme theme4;
                    Language language3;
                    String str2;
                    VaultTimeout vaultTimeout3;
                    c cVar8;
                    Font font4;
                    Icon icon3;
                    Object a17;
                    AnonymousClass2<T> anonymousClass25;
                    c cVar9;
                    boolean z10;
                    Object a18;
                    boolean z11;
                    Theme theme5;
                    Language language4;
                    String str3;
                    VaultTimeout vaultTimeout4;
                    boolean z12;
                    VaultTimeout vaultTimeout5;
                    c cVar10;
                    Font font5;
                    Icon icon4;
                    Object a19;
                    boolean z13;
                    AnonymousClass2<T> anonymousClass26;
                    c cVar11;
                    String str4;
                    Object a20;
                    Theme theme6;
                    Language language5;
                    String str5;
                    VaultTimeout vaultTimeout6;
                    FolderListSortingType folderListSortingType;
                    boolean z14;
                    String str6;
                    Font font6;
                    Icon icon5;
                    VaultTimeout vaultTimeout7;
                    Object a21;
                    CoroutineSingletons coroutineSingletons;
                    Theme theme7;
                    Font font7;
                    SortingOrder sortingOrder;
                    boolean z15;
                    CoroutineSingletons coroutineSingletons2;
                    CoroutineSingletons coroutineSingletons3;
                    Icon icon6;
                    VaultTimeout vaultTimeout8;
                    String str7;
                    SortingOrder sortingOrder2;
                    boolean z16;
                    boolean z17;
                    boolean z18;
                    Language language6;
                    String str8;
                    VaultTimeout vaultTimeout9;
                    FolderListSortingType folderListSortingType2;
                    CoroutineSingletons coroutineSingletons4;
                    CoroutineSingletons coroutineSingletons5;
                    String str9;
                    VaultTimeout vaultTimeout10;
                    VaultTimeout vaultTimeout11;
                    String str10;
                    FolderListSortingType folderListSortingType3;
                    SortingOrder sortingOrder3;
                    boolean z19;
                    boolean z20;
                    Language language7;
                    Icon icon7;
                    boolean z21;
                    boolean z22;
                    CoroutineSingletons coroutineSingletons6;
                    CoroutineSingletons coroutineSingletons7;
                    FolderListSortingType folderListSortingType4;
                    VaultTimeout vaultTimeout12;
                    SortingOrder sortingOrder4;
                    VaultTimeout vaultTimeout13;
                    boolean z23;
                    String str11;
                    boolean z24;
                    Icon icon8;
                    String str12;
                    boolean z25;
                    boolean z26;
                    boolean z27;
                    CoroutineSingletons coroutineSingletons8;
                    CoroutineSingletons coroutineSingletons9;
                    boolean z28;
                    boolean z29;
                    boolean z30;
                    SortingOrder sortingOrder5;
                    boolean z31;
                    FolderListSortingType folderListSortingType5;
                    boolean z32;
                    long j2;
                    CoroutineSingletons coroutineSingletons10;
                    CoroutineSingletons coroutineSingletons11;
                    FolderListSortingType folderListSortingType6;
                    boolean z33;
                    boolean z34;
                    boolean z35;
                    boolean z36;
                    boolean z37;
                    SortingOrder sortingOrder6;
                    boolean z38;
                    AnonymousClass2<T> anonymousClass27;
                    long j10;
                    Theme theme8;
                    CoroutineSingletons coroutineSingletons12;
                    CoroutineSingletons coroutineSingletons13;
                    SortingOrder sortingOrder7;
                    boolean z39;
                    boolean z40;
                    String str13;
                    FolderListSortingType folderListSortingType7;
                    boolean z41;
                    boolean z42;
                    boolean z43;
                    boolean z44;
                    int i10;
                    AnonymousClass2<T> anonymousClass28;
                    long j11;
                    Theme theme9;
                    CoroutineSingletons coroutineSingletons14;
                    CoroutineSingletons coroutineSingletons15;
                    long j12;
                    boolean z45;
                    boolean z46;
                    AnonymousClass2<T> anonymousClass29;
                    boolean z47;
                    boolean z48;
                    Theme theme10;
                    boolean z49;
                    boolean z50;
                    SortingOrder sortingOrder8;
                    int i11;
                    int i12;
                    CoroutineSingletons coroutineSingletons16;
                    int i13;
                    FolderListSortingType folderListSortingType8;
                    int i14;
                    Language language8;
                    SortingOrder sortingOrder9;
                    Theme theme11;
                    boolean z51;
                    VaultTimeout vaultTimeout14;
                    int i15;
                    boolean z52;
                    Icon icon9;
                    Font font8;
                    boolean z53;
                    boolean z54;
                    String str14;
                    VaultTimeout vaultTimeout15;
                    String str15;
                    boolean z55;
                    boolean z56;
                    long j13;
                    c cVar12;
                    v vVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i16 = anonymousClass1.f7872m;
                        if ((i16 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7872m = i16 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7871l;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            switch (anonymousClass1.f7872m) {
                                case 0:
                                    m0.b.n1(obj2);
                                    a aVar = (a) obj;
                                    b<Theme> bVar = this.f7870j.f7733d;
                                    anonymousClass1.n = this;
                                    cVar2 = this.f7869i;
                                    anonymousClass1.f7874p = cVar2;
                                    anonymousClass1.f7872m = 1;
                                    obj2 = FlowKt__ReduceKt.a(bVar, anonymousClass1);
                                    if (obj2 == coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    anonymousClass2 = this;
                                    Theme theme12 = (Theme) obj2;
                                    b<Font> bVar2 = anonymousClass2.f7870j.f7734e;
                                    anonymousClass1.n = anonymousClass2;
                                    anonymousClass1.f7874p = cVar2;
                                    anonymousClass1.f7875q = theme12;
                                    anonymousClass1.f7872m = 2;
                                    a10 = FlowKt__ReduceKt.a(bVar2, anonymousClass1);
                                    if (a10 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    theme = theme12;
                                    obj2 = a10;
                                    Font font9 = (Font) obj2;
                                    b<Language> bVar3 = anonymousClass2.f7870j.f7735f;
                                    anonymousClass1.n = anonymousClass2;
                                    anonymousClass1.f7874p = cVar2;
                                    anonymousClass1.f7875q = theme;
                                    anonymousClass1.f7876r = font9;
                                    anonymousClass1.f7872m = 3;
                                    a11 = FlowKt__ReduceKt.a(bVar3, anonymousClass1);
                                    if (a11 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    anonymousClass22 = anonymousClass2;
                                    cVar3 = cVar2;
                                    font = font9;
                                    obj2 = a11;
                                    Language language9 = (Language) obj2;
                                    b<Icon> bVar4 = anonymousClass22.f7870j.f7736g;
                                    anonymousClass1.n = anonymousClass22;
                                    anonymousClass1.f7874p = cVar3;
                                    anonymousClass1.f7875q = theme;
                                    anonymousClass1.f7876r = font;
                                    anonymousClass1.f7877s = language9;
                                    anonymousClass1.f7872m = 4;
                                    a12 = FlowKt__ReduceKt.a(bVar4, anonymousClass1);
                                    if (a12 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    Theme theme13 = theme;
                                    language = language9;
                                    obj2 = a12;
                                    theme2 = theme13;
                                    c cVar13 = cVar3;
                                    font2 = font;
                                    cVar4 = cVar13;
                                    Icon icon10 = (Icon) obj2;
                                    b<String> bVar5 = anonymousClass22.f7870j.f7737h;
                                    anonymousClass1.n = anonymousClass22;
                                    anonymousClass1.f7874p = cVar4;
                                    anonymousClass1.f7875q = theme2;
                                    anonymousClass1.f7876r = font2;
                                    anonymousClass1.f7877s = language;
                                    anonymousClass1.f7878t = icon10;
                                    anonymousClass1.f7872m = 5;
                                    a13 = FlowKt__ReduceKt.a(bVar5, anonymousClass1);
                                    if (a13 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    anonymousClass23 = anonymousClass22;
                                    cVar5 = cVar4;
                                    icon = icon10;
                                    obj2 = a13;
                                    String str16 = (String) obj2;
                                    b<VaultTimeout> bVar6 = anonymousClass23.f7870j.f7738i;
                                    anonymousClass1.n = anonymousClass23;
                                    anonymousClass1.f7874p = cVar5;
                                    anonymousClass1.f7875q = theme2;
                                    anonymousClass1.f7876r = font2;
                                    anonymousClass1.f7877s = language;
                                    anonymousClass1.f7878t = icon;
                                    anonymousClass1.f7879u = str16;
                                    anonymousClass1.f7872m = 6;
                                    a14 = FlowKt__ReduceKt.a(bVar6, anonymousClass1);
                                    if (a14 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    Language language10 = language;
                                    str = str16;
                                    obj2 = a14;
                                    theme3 = theme2;
                                    language2 = language10;
                                    Font font10 = font2;
                                    icon2 = icon;
                                    cVar6 = cVar5;
                                    font3 = font10;
                                    VaultTimeout vaultTimeout16 = (VaultTimeout) obj2;
                                    b<VaultTimeout> bVar7 = anonymousClass23.f7870j.f7739j;
                                    anonymousClass1.n = anonymousClass23;
                                    anonymousClass1.f7874p = cVar6;
                                    anonymousClass1.f7875q = theme3;
                                    anonymousClass1.f7876r = font3;
                                    anonymousClass1.f7877s = language2;
                                    anonymousClass1.f7878t = icon2;
                                    anonymousClass1.f7879u = str;
                                    anonymousClass1.f7880v = vaultTimeout16;
                                    anonymousClass1.f7872m = 7;
                                    a15 = FlowKt__ReduceKt.a(bVar7, anonymousClass1);
                                    if (a15 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    anonymousClass24 = anonymousClass23;
                                    cVar7 = cVar6;
                                    vaultTimeout = vaultTimeout16;
                                    obj2 = a15;
                                    VaultTimeout vaultTimeout17 = (VaultTimeout) obj2;
                                    b<Boolean> bVar8 = anonymousClass24.f7870j.f7740k;
                                    anonymousClass1.n = anonymousClass24;
                                    anonymousClass1.f7874p = cVar7;
                                    anonymousClass1.f7875q = theme3;
                                    anonymousClass1.f7876r = font3;
                                    anonymousClass1.f7877s = language2;
                                    anonymousClass1.f7878t = icon2;
                                    anonymousClass1.f7879u = str;
                                    anonymousClass1.f7880v = vaultTimeout;
                                    anonymousClass1.f7881w = vaultTimeout17;
                                    anonymousClass1.f7872m = 8;
                                    a16 = FlowKt__ReduceKt.a(bVar8, anonymousClass1);
                                    if (a16 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    String str17 = str;
                                    vaultTimeout2 = vaultTimeout17;
                                    obj2 = a16;
                                    theme4 = theme3;
                                    language3 = language2;
                                    str2 = str17;
                                    Icon icon11 = icon2;
                                    vaultTimeout3 = vaultTimeout;
                                    cVar8 = cVar7;
                                    font4 = font3;
                                    icon3 = icon11;
                                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar9 = anonymousClass24.f7870j.f7741l;
                                    anonymousClass1.n = anonymousClass24;
                                    anonymousClass1.f7874p = cVar8;
                                    anonymousClass1.f7875q = theme4;
                                    anonymousClass1.f7876r = font4;
                                    anonymousClass1.f7877s = language3;
                                    anonymousClass1.f7878t = icon3;
                                    anonymousClass1.f7879u = str2;
                                    anonymousClass1.f7880v = vaultTimeout3;
                                    anonymousClass1.f7881w = vaultTimeout2;
                                    anonymousClass1.A = booleanValue;
                                    anonymousClass1.f7872m = 9;
                                    a17 = FlowKt__ReduceKt.a(bVar9, anonymousClass1);
                                    if (a17 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    anonymousClass25 = anonymousClass24;
                                    cVar9 = cVar8;
                                    z10 = booleanValue;
                                    obj2 = a17;
                                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                    b<String> bVar10 = anonymousClass25.f7870j.f7744p;
                                    anonymousClass1.n = anonymousClass25;
                                    anonymousClass1.f7874p = cVar9;
                                    anonymousClass1.f7875q = theme4;
                                    anonymousClass1.f7876r = font4;
                                    anonymousClass1.f7877s = language3;
                                    anonymousClass1.f7878t = icon3;
                                    anonymousClass1.f7879u = str2;
                                    anonymousClass1.f7880v = vaultTimeout3;
                                    anonymousClass1.f7881w = vaultTimeout2;
                                    anonymousClass1.A = z10;
                                    anonymousClass1.B = booleanValue2;
                                    anonymousClass1.f7872m = 10;
                                    a18 = FlowKt__ReduceKt.a(bVar10, anonymousClass1);
                                    if (a18 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    boolean z57 = z10;
                                    z11 = booleanValue2;
                                    obj2 = a18;
                                    theme5 = theme4;
                                    language4 = language3;
                                    str3 = str2;
                                    vaultTimeout4 = vaultTimeout2;
                                    z12 = z57;
                                    Icon icon12 = icon3;
                                    vaultTimeout5 = vaultTimeout3;
                                    cVar10 = cVar9;
                                    font5 = font4;
                                    icon4 = icon12;
                                    String str18 = (String) obj2;
                                    b<FolderListSortingType> bVar11 = anonymousClass25.f7870j.f7745q;
                                    anonymousClass1.n = anonymousClass25;
                                    anonymousClass1.f7874p = cVar10;
                                    anonymousClass1.f7875q = theme5;
                                    anonymousClass1.f7876r = font5;
                                    anonymousClass1.f7877s = language4;
                                    anonymousClass1.f7878t = icon4;
                                    anonymousClass1.f7879u = str3;
                                    anonymousClass1.f7880v = vaultTimeout5;
                                    anonymousClass1.f7881w = vaultTimeout4;
                                    anonymousClass1.f7882x = str18;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z11;
                                    anonymousClass1.f7872m = 11;
                                    a19 = FlowKt__ReduceKt.a(bVar11, anonymousClass1);
                                    if (a19 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    obj2 = a19;
                                    z13 = z11;
                                    anonymousClass26 = anonymousClass25;
                                    cVar11 = cVar10;
                                    str4 = str18;
                                    FolderListSortingType folderListSortingType9 = (FolderListSortingType) obj2;
                                    b<SortingOrder> bVar12 = anonymousClass26.f7870j.f7746r;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme5;
                                    anonymousClass1.f7876r = font5;
                                    anonymousClass1.f7877s = language4;
                                    anonymousClass1.f7878t = icon4;
                                    anonymousClass1.f7879u = str3;
                                    anonymousClass1.f7880v = vaultTimeout5;
                                    anonymousClass1.f7881w = vaultTimeout4;
                                    anonymousClass1.f7882x = str4;
                                    anonymousClass1.f7883y = folderListSortingType9;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z13;
                                    boolean z58 = z13;
                                    anonymousClass1.f7872m = 12;
                                    a20 = FlowKt__ReduceKt.a(bVar12, anonymousClass1);
                                    if (a20 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    theme6 = theme5;
                                    language5 = language4;
                                    str5 = str3;
                                    vaultTimeout6 = vaultTimeout4;
                                    folderListSortingType = folderListSortingType9;
                                    obj2 = a20;
                                    z14 = z58;
                                    VaultTimeout vaultTimeout18 = vaultTimeout5;
                                    str6 = str4;
                                    font6 = font5;
                                    icon5 = icon4;
                                    vaultTimeout7 = vaultTimeout18;
                                    SortingOrder sortingOrder10 = (SortingOrder) obj2;
                                    b<Boolean> bVar13 = anonymousClass26.f7870j.f7747s;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme6;
                                    anonymousClass1.f7876r = font6;
                                    anonymousClass1.f7877s = language5;
                                    anonymousClass1.f7878t = icon5;
                                    anonymousClass1.f7879u = str5;
                                    anonymousClass1.f7880v = vaultTimeout7;
                                    anonymousClass1.f7881w = vaultTimeout6;
                                    anonymousClass1.f7882x = str6;
                                    anonymousClass1.f7883y = folderListSortingType;
                                    anonymousClass1.f7884z = sortingOrder10;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z14;
                                    boolean z59 = z14;
                                    anonymousClass1.f7872m = 13;
                                    a21 = FlowKt__ReduceKt.a(bVar13, anonymousClass1);
                                    if (a21 != coroutineSingletons17) {
                                        return coroutineSingletons17;
                                    }
                                    coroutineSingletons = coroutineSingletons17;
                                    theme7 = theme6;
                                    font7 = font6;
                                    sortingOrder = sortingOrder10;
                                    obj2 = a21;
                                    z15 = z59;
                                    boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar14 = anonymousClass26.f7870j.f7742m;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language5;
                                    anonymousClass1.f7878t = icon5;
                                    anonymousClass1.f7879u = str5;
                                    anonymousClass1.f7880v = vaultTimeout7;
                                    anonymousClass1.f7881w = vaultTimeout6;
                                    anonymousClass1.f7882x = str6;
                                    anonymousClass1.f7883y = folderListSortingType;
                                    anonymousClass1.f7884z = sortingOrder;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z15;
                                    boolean z60 = z15;
                                    anonymousClass1.C = booleanValue3;
                                    anonymousClass1.f7872m = 14;
                                    obj2 = FlowKt__ReduceKt.a(bVar14, anonymousClass1);
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (obj2 != coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                    coroutineSingletons3 = coroutineSingletons2;
                                    icon6 = icon5;
                                    vaultTimeout8 = vaultTimeout7;
                                    str7 = str6;
                                    sortingOrder2 = sortingOrder;
                                    z16 = z60;
                                    z17 = booleanValue3;
                                    FolderListSortingType folderListSortingType10 = folderListSortingType;
                                    z18 = z12;
                                    language6 = language5;
                                    str8 = str5;
                                    vaultTimeout9 = vaultTimeout6;
                                    folderListSortingType2 = folderListSortingType10;
                                    boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar15 = anonymousClass26.f7870j.n;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language6;
                                    anonymousClass1.f7878t = icon6;
                                    anonymousClass1.f7879u = str8;
                                    anonymousClass1.f7880v = vaultTimeout8;
                                    anonymousClass1.f7881w = vaultTimeout9;
                                    anonymousClass1.f7882x = str7;
                                    anonymousClass1.f7883y = folderListSortingType2;
                                    anonymousClass1.f7884z = sortingOrder2;
                                    anonymousClass1.A = z18;
                                    anonymousClass1.B = z16;
                                    Icon icon13 = icon6;
                                    anonymousClass1.C = z17;
                                    anonymousClass1.D = booleanValue4;
                                    anonymousClass1.f7872m = 15;
                                    obj2 = FlowKt__ReduceKt.a(bVar15, anonymousClass1);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (obj2 != coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    coroutineSingletons5 = coroutineSingletons4;
                                    str9 = str8;
                                    vaultTimeout10 = vaultTimeout8;
                                    vaultTimeout11 = vaultTimeout9;
                                    str10 = str7;
                                    folderListSortingType3 = folderListSortingType2;
                                    sortingOrder3 = sortingOrder2;
                                    z19 = z18;
                                    z20 = z16;
                                    language7 = language6;
                                    icon7 = icon13;
                                    z21 = z17;
                                    z22 = booleanValue4;
                                    boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                                    b<Long> bVar16 = anonymousClass26.f7870j.f7748t;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon7;
                                    anonymousClass1.f7879u = str9;
                                    anonymousClass1.f7880v = vaultTimeout10;
                                    anonymousClass1.f7881w = vaultTimeout11;
                                    anonymousClass1.f7882x = str10;
                                    anonymousClass1.f7883y = folderListSortingType3;
                                    anonymousClass1.f7884z = sortingOrder3;
                                    anonymousClass1.A = z19;
                                    anonymousClass1.B = z20;
                                    String str19 = str9;
                                    anonymousClass1.C = z21;
                                    anonymousClass1.D = z22;
                                    anonymousClass1.E = booleanValue5;
                                    anonymousClass1.f7872m = 16;
                                    obj2 = FlowKt__ReduceKt.a(bVar16, anonymousClass1);
                                    coroutineSingletons6 = coroutineSingletons5;
                                    if (obj2 != coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                    coroutineSingletons7 = coroutineSingletons6;
                                    folderListSortingType4 = folderListSortingType3;
                                    vaultTimeout12 = vaultTimeout10;
                                    sortingOrder4 = sortingOrder3;
                                    vaultTimeout13 = vaultTimeout11;
                                    z23 = z19;
                                    str11 = str10;
                                    z24 = z20;
                                    icon8 = icon7;
                                    str12 = str19;
                                    z25 = z21;
                                    z26 = z22;
                                    z27 = booleanValue5;
                                    boolean z61 = z24;
                                    boolean z62 = z23;
                                    long longValue = ((Number) obj2).longValue();
                                    b<Boolean> bVar17 = anonymousClass26.f7870j.f7749u;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType4;
                                    anonymousClass1.f7884z = sortingOrder4;
                                    FolderListSortingType folderListSortingType11 = folderListSortingType4;
                                    anonymousClass1.A = z62;
                                    anonymousClass1.B = z61;
                                    anonymousClass1.C = z25;
                                    anonymousClass1.D = z26;
                                    anonymousClass1.E = z27;
                                    anonymousClass1.G = longValue;
                                    anonymousClass1.f7872m = 17;
                                    obj2 = FlowKt__ReduceKt.a(bVar17, anonymousClass1);
                                    coroutineSingletons8 = coroutineSingletons7;
                                    if (obj2 != coroutineSingletons8) {
                                        return coroutineSingletons8;
                                    }
                                    coroutineSingletons9 = coroutineSingletons8;
                                    z28 = z62;
                                    z29 = z25;
                                    z30 = z27;
                                    sortingOrder5 = sortingOrder4;
                                    z31 = z61;
                                    folderListSortingType5 = folderListSortingType11;
                                    z32 = z26;
                                    j2 = longValue;
                                    boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                                    boolean z63 = z31;
                                    b<Integer> m02 = anonymousClass26.f7870j.m0(FilteredItemModel.All);
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType5;
                                    anonymousClass1.f7884z = sortingOrder5;
                                    anonymousClass1.A = z28;
                                    anonymousClass1.B = z63;
                                    boolean z64 = z28;
                                    anonymousClass1.C = z29;
                                    anonymousClass1.D = z32;
                                    boolean z65 = z30;
                                    anonymousClass1.E = z65;
                                    Theme theme14 = theme7;
                                    AnonymousClass2<T> anonymousClass210 = anonymousClass26;
                                    long j14 = j2;
                                    anonymousClass1.G = j14;
                                    anonymousClass1.F = booleanValue6;
                                    anonymousClass1.f7872m = 18;
                                    obj2 = FlowKt__ReduceKt.a(m02, anonymousClass1);
                                    coroutineSingletons10 = coroutineSingletons9;
                                    if (obj2 != coroutineSingletons10) {
                                        return coroutineSingletons10;
                                    }
                                    coroutineSingletons11 = coroutineSingletons10;
                                    folderListSortingType6 = folderListSortingType5;
                                    z33 = z64;
                                    z34 = z29;
                                    z35 = z32;
                                    z36 = z65;
                                    z37 = booleanValue6;
                                    sortingOrder6 = sortingOrder5;
                                    z38 = z63;
                                    anonymousClass27 = anonymousClass210;
                                    j10 = j14;
                                    theme8 = theme14;
                                    int intValue = ((Number) obj2).intValue();
                                    boolean z66 = z38;
                                    b<Integer> m03 = anonymousClass27.f7870j.m0(FilteredItemModel.Recent);
                                    anonymousClass1.n = anonymousClass27;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme8;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType6;
                                    anonymousClass1.f7884z = sortingOrder6;
                                    anonymousClass1.A = z33;
                                    anonymousClass1.B = z66;
                                    FolderListSortingType folderListSortingType12 = folderListSortingType6;
                                    anonymousClass1.C = z34;
                                    anonymousClass1.D = z35;
                                    boolean z67 = z36;
                                    anonymousClass1.E = z67;
                                    Theme theme15 = theme8;
                                    AnonymousClass2<T> anonymousClass211 = anonymousClass27;
                                    long j15 = j10;
                                    anonymousClass1.G = j15;
                                    anonymousClass1.F = z37;
                                    anonymousClass1.H = intValue;
                                    anonymousClass1.f7872m = 19;
                                    obj2 = FlowKt__ReduceKt.a(m03, anonymousClass1);
                                    coroutineSingletons12 = coroutineSingletons11;
                                    if (obj2 != coroutineSingletons12) {
                                        return coroutineSingletons12;
                                    }
                                    coroutineSingletons13 = coroutineSingletons12;
                                    sortingOrder7 = sortingOrder6;
                                    z39 = z33;
                                    z40 = z66;
                                    str13 = str11;
                                    folderListSortingType7 = folderListSortingType12;
                                    z41 = z34;
                                    z42 = z35;
                                    z43 = z67;
                                    z44 = z37;
                                    i10 = intValue;
                                    anonymousClass28 = anonymousClass211;
                                    j11 = j15;
                                    theme9 = theme15;
                                    int intValue2 = ((Number) obj2).intValue();
                                    boolean z68 = z40;
                                    b<Integer> m04 = anonymousClass28.f7870j.m0(FilteredItemModel.Scheduled);
                                    anonymousClass1.n = anonymousClass28;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme9;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str13;
                                    anonymousClass1.f7883y = folderListSortingType7;
                                    anonymousClass1.f7884z = sortingOrder7;
                                    anonymousClass1.A = z39;
                                    anonymousClass1.B = z68;
                                    SortingOrder sortingOrder11 = sortingOrder7;
                                    anonymousClass1.C = z41;
                                    anonymousClass1.D = z42;
                                    boolean z69 = z43;
                                    anonymousClass1.E = z69;
                                    Theme theme16 = theme9;
                                    AnonymousClass2<T> anonymousClass212 = anonymousClass28;
                                    long j16 = j11;
                                    anonymousClass1.G = j16;
                                    anonymousClass1.F = z44;
                                    anonymousClass1.H = i10;
                                    anonymousClass1.I = intValue2;
                                    anonymousClass1.f7872m = 20;
                                    obj2 = FlowKt__ReduceKt.a(m04, anonymousClass1);
                                    coroutineSingletons14 = coroutineSingletons13;
                                    if (obj2 != coroutineSingletons14) {
                                        return coroutineSingletons14;
                                    }
                                    coroutineSingletons15 = coroutineSingletons14;
                                    j12 = j16;
                                    z45 = z39;
                                    z46 = z69;
                                    anonymousClass29 = anonymousClass212;
                                    z47 = z42;
                                    z48 = z41;
                                    theme10 = theme16;
                                    z49 = z68;
                                    z50 = z44;
                                    sortingOrder8 = sortingOrder11;
                                    i11 = i10;
                                    i12 = intValue2;
                                    int intValue3 = ((Number) obj2).intValue();
                                    b<Integer> m05 = anonymousClass29.f7870j.m0(FilteredItemModel.Archived);
                                    anonymousClass1.n = cVar11;
                                    anonymousClass1.f7874p = theme10;
                                    anonymousClass1.f7875q = font7;
                                    anonymousClass1.f7876r = language7;
                                    anonymousClass1.f7877s = icon8;
                                    anonymousClass1.f7878t = str12;
                                    anonymousClass1.f7879u = vaultTimeout12;
                                    anonymousClass1.f7880v = vaultTimeout13;
                                    anonymousClass1.f7881w = str13;
                                    anonymousClass1.f7882x = folderListSortingType7;
                                    anonymousClass1.f7883y = sortingOrder8;
                                    anonymousClass1.f7884z = null;
                                    anonymousClass1.A = z45;
                                    anonymousClass1.B = z49;
                                    boolean z70 = z48;
                                    anonymousClass1.C = z70;
                                    boolean z71 = z45;
                                    anonymousClass1.D = z47;
                                    boolean z72 = z46;
                                    anonymousClass1.E = z72;
                                    Theme theme17 = theme10;
                                    long j17 = j12;
                                    anonymousClass1.G = j17;
                                    anonymousClass1.F = z50;
                                    anonymousClass1.H = i11;
                                    anonymousClass1.I = i12;
                                    anonymousClass1.J = intValue3;
                                    anonymousClass1.f7872m = 21;
                                    obj2 = FlowKt__ReduceKt.a(m05, anonymousClass1);
                                    coroutineSingletons16 = coroutineSingletons15;
                                    if (obj2 != coroutineSingletons16) {
                                        return coroutineSingletons16;
                                    }
                                    i13 = intValue3;
                                    folderListSortingType8 = folderListSortingType7;
                                    i14 = i12;
                                    language8 = language7;
                                    sortingOrder9 = sortingOrder8;
                                    theme11 = theme17;
                                    z51 = z72;
                                    vaultTimeout14 = vaultTimeout13;
                                    i15 = i11;
                                    z52 = z70;
                                    icon9 = icon8;
                                    font8 = font7;
                                    z53 = z50;
                                    z54 = z47;
                                    str14 = str13;
                                    vaultTimeout15 = vaultTimeout12;
                                    str15 = str12;
                                    c cVar14 = cVar11;
                                    z55 = z49;
                                    z56 = z71;
                                    j13 = j17;
                                    cVar12 = cVar14;
                                    vVar = new v(theme11, font8, language8, icon9, str15, vaultTimeout15, vaultTimeout14, z56, z55, str14, folderListSortingType8, sortingOrder9, z52, z54, z51, j13, z53, i15, i14, i13, ((Number) obj2).intValue());
                                    anonymousClass1.n = null;
                                    anonymousClass1.f7874p = null;
                                    anonymousClass1.f7875q = null;
                                    anonymousClass1.f7876r = null;
                                    anonymousClass1.f7877s = null;
                                    anonymousClass1.f7878t = null;
                                    anonymousClass1.f7879u = null;
                                    anonymousClass1.f7880v = null;
                                    anonymousClass1.f7881w = null;
                                    anonymousClass1.f7882x = null;
                                    anonymousClass1.f7883y = null;
                                    anonymousClass1.f7872m = 22;
                                    if (cVar12.c(vVar, anonymousClass1) == coroutineSingletons16) {
                                        return coroutineSingletons16;
                                    }
                                    return n.f16010a;
                                case 1:
                                    cVar2 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    anonymousClass2 = (AnonymousClass2) anonymousClass1.n;
                                    Theme theme122 = (Theme) obj2;
                                    b<Font> bVar22 = anonymousClass2.f7870j.f7734e;
                                    anonymousClass1.n = anonymousClass2;
                                    anonymousClass1.f7874p = cVar2;
                                    anonymousClass1.f7875q = theme122;
                                    anonymousClass1.f7872m = 2;
                                    a10 = FlowKt__ReduceKt.a(bVar22, anonymousClass1);
                                    if (a10 != coroutineSingletons17) {
                                    }
                                    break;
                                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                    c cVar15 = (c) anonymousClass1.f7874p;
                                    anonymousClass2 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    theme = (Theme) anonymousClass1.f7875q;
                                    cVar2 = cVar15;
                                    Font font92 = (Font) obj2;
                                    b<Language> bVar32 = anonymousClass2.f7870j.f7735f;
                                    anonymousClass1.n = anonymousClass2;
                                    anonymousClass1.f7874p = cVar2;
                                    anonymousClass1.f7875q = theme;
                                    anonymousClass1.f7876r = font92;
                                    anonymousClass1.f7872m = 3;
                                    a11 = FlowKt__ReduceKt.a(bVar32, anonymousClass1);
                                    if (a11 != coroutineSingletons17) {
                                    }
                                    break;
                                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                    font = (Font) anonymousClass1.f7876r;
                                    theme = (Theme) anonymousClass1.f7875q;
                                    cVar3 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    anonymousClass22 = (AnonymousClass2) anonymousClass1.n;
                                    Language language92 = (Language) obj2;
                                    b<Icon> bVar42 = anonymousClass22.f7870j.f7736g;
                                    anonymousClass1.n = anonymousClass22;
                                    anonymousClass1.f7874p = cVar3;
                                    anonymousClass1.f7875q = theme;
                                    anonymousClass1.f7876r = font;
                                    anonymousClass1.f7877s = language92;
                                    anonymousClass1.f7872m = 4;
                                    a12 = FlowKt__ReduceKt.a(bVar42, anonymousClass1);
                                    if (a12 != coroutineSingletons17) {
                                    }
                                    break;
                                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                    Font font11 = (Font) anonymousClass1.f7876r;
                                    anonymousClass22 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    language = (Language) anonymousClass1.f7877s;
                                    cVar4 = (c) anonymousClass1.f7874p;
                                    theme2 = (Theme) anonymousClass1.f7875q;
                                    font2 = font11;
                                    Icon icon102 = (Icon) obj2;
                                    b<String> bVar52 = anonymousClass22.f7870j.f7737h;
                                    anonymousClass1.n = anonymousClass22;
                                    anonymousClass1.f7874p = cVar4;
                                    anonymousClass1.f7875q = theme2;
                                    anonymousClass1.f7876r = font2;
                                    anonymousClass1.f7877s = language;
                                    anonymousClass1.f7878t = icon102;
                                    anonymousClass1.f7872m = 5;
                                    a13 = FlowKt__ReduceKt.a(bVar52, anonymousClass1);
                                    if (a13 != coroutineSingletons17) {
                                    }
                                    break;
                                case 5:
                                    icon = (Icon) anonymousClass1.f7878t;
                                    language = (Language) anonymousClass1.f7877s;
                                    font2 = (Font) anonymousClass1.f7876r;
                                    theme2 = (Theme) anonymousClass1.f7875q;
                                    cVar5 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    anonymousClass23 = (AnonymousClass2) anonymousClass1.n;
                                    String str162 = (String) obj2;
                                    b<VaultTimeout> bVar62 = anonymousClass23.f7870j.f7738i;
                                    anonymousClass1.n = anonymousClass23;
                                    anonymousClass1.f7874p = cVar5;
                                    anonymousClass1.f7875q = theme2;
                                    anonymousClass1.f7876r = font2;
                                    anonymousClass1.f7877s = language;
                                    anonymousClass1.f7878t = icon;
                                    anonymousClass1.f7879u = str162;
                                    anonymousClass1.f7872m = 6;
                                    a14 = FlowKt__ReduceKt.a(bVar62, anonymousClass1);
                                    if (a14 != coroutineSingletons17) {
                                    }
                                    break;
                                case 6:
                                    Icon icon14 = (Icon) anonymousClass1.f7878t;
                                    anonymousClass23 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    str = (String) anonymousClass1.f7879u;
                                    cVar6 = (c) anonymousClass1.f7874p;
                                    theme3 = (Theme) anonymousClass1.f7875q;
                                    font3 = (Font) anonymousClass1.f7876r;
                                    language2 = (Language) anonymousClass1.f7877s;
                                    icon2 = icon14;
                                    VaultTimeout vaultTimeout162 = (VaultTimeout) obj2;
                                    b<VaultTimeout> bVar72 = anonymousClass23.f7870j.f7739j;
                                    anonymousClass1.n = anonymousClass23;
                                    anonymousClass1.f7874p = cVar6;
                                    anonymousClass1.f7875q = theme3;
                                    anonymousClass1.f7876r = font3;
                                    anonymousClass1.f7877s = language2;
                                    anonymousClass1.f7878t = icon2;
                                    anonymousClass1.f7879u = str;
                                    anonymousClass1.f7880v = vaultTimeout162;
                                    anonymousClass1.f7872m = 7;
                                    a15 = FlowKt__ReduceKt.a(bVar72, anonymousClass1);
                                    if (a15 != coroutineSingletons17) {
                                    }
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    vaultTimeout = anonymousClass1.f7880v;
                                    str = (String) anonymousClass1.f7879u;
                                    icon2 = (Icon) anonymousClass1.f7878t;
                                    language2 = (Language) anonymousClass1.f7877s;
                                    font3 = (Font) anonymousClass1.f7876r;
                                    theme3 = (Theme) anonymousClass1.f7875q;
                                    cVar7 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    anonymousClass24 = (AnonymousClass2) anonymousClass1.n;
                                    VaultTimeout vaultTimeout172 = (VaultTimeout) obj2;
                                    b<Boolean> bVar82 = anonymousClass24.f7870j.f7740k;
                                    anonymousClass1.n = anonymousClass24;
                                    anonymousClass1.f7874p = cVar7;
                                    anonymousClass1.f7875q = theme3;
                                    anonymousClass1.f7876r = font3;
                                    anonymousClass1.f7877s = language2;
                                    anonymousClass1.f7878t = icon2;
                                    anonymousClass1.f7879u = str;
                                    anonymousClass1.f7880v = vaultTimeout;
                                    anonymousClass1.f7881w = vaultTimeout172;
                                    anonymousClass1.f7872m = 8;
                                    a16 = FlowKt__ReduceKt.a(bVar82, anonymousClass1);
                                    if (a16 != coroutineSingletons17) {
                                    }
                                    break;
                                case 8:
                                    VaultTimeout vaultTimeout19 = anonymousClass1.f7880v;
                                    anonymousClass24 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    vaultTimeout2 = (VaultTimeout) anonymousClass1.f7881w;
                                    cVar8 = (c) anonymousClass1.f7874p;
                                    theme4 = (Theme) anonymousClass1.f7875q;
                                    font4 = (Font) anonymousClass1.f7876r;
                                    language3 = (Language) anonymousClass1.f7877s;
                                    icon3 = (Icon) anonymousClass1.f7878t;
                                    str2 = (String) anonymousClass1.f7879u;
                                    vaultTimeout3 = vaultTimeout19;
                                    boolean booleanValue7 = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar92 = anonymousClass24.f7870j.f7741l;
                                    anonymousClass1.n = anonymousClass24;
                                    anonymousClass1.f7874p = cVar8;
                                    anonymousClass1.f7875q = theme4;
                                    anonymousClass1.f7876r = font4;
                                    anonymousClass1.f7877s = language3;
                                    anonymousClass1.f7878t = icon3;
                                    anonymousClass1.f7879u = str2;
                                    anonymousClass1.f7880v = vaultTimeout3;
                                    anonymousClass1.f7881w = vaultTimeout2;
                                    anonymousClass1.A = booleanValue7;
                                    anonymousClass1.f7872m = 9;
                                    a17 = FlowKt__ReduceKt.a(bVar92, anonymousClass1);
                                    if (a17 != coroutineSingletons17) {
                                    }
                                    break;
                                case i.f16046m /* 9 */:
                                    z10 = anonymousClass1.A;
                                    vaultTimeout2 = (VaultTimeout) anonymousClass1.f7881w;
                                    vaultTimeout3 = anonymousClass1.f7880v;
                                    str2 = (String) anonymousClass1.f7879u;
                                    icon3 = (Icon) anonymousClass1.f7878t;
                                    language3 = (Language) anonymousClass1.f7877s;
                                    font4 = (Font) anonymousClass1.f7876r;
                                    theme4 = (Theme) anonymousClass1.f7875q;
                                    cVar9 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    anonymousClass25 = (AnonymousClass2) anonymousClass1.n;
                                    boolean booleanValue22 = ((Boolean) obj2).booleanValue();
                                    b<String> bVar102 = anonymousClass25.f7870j.f7744p;
                                    anonymousClass1.n = anonymousClass25;
                                    anonymousClass1.f7874p = cVar9;
                                    anonymousClass1.f7875q = theme4;
                                    anonymousClass1.f7876r = font4;
                                    anonymousClass1.f7877s = language3;
                                    anonymousClass1.f7878t = icon3;
                                    anonymousClass1.f7879u = str2;
                                    anonymousClass1.f7880v = vaultTimeout3;
                                    anonymousClass1.f7881w = vaultTimeout2;
                                    anonymousClass1.A = z10;
                                    anonymousClass1.B = booleanValue22;
                                    anonymousClass1.f7872m = 10;
                                    a18 = FlowKt__ReduceKt.a(bVar102, anonymousClass1);
                                    if (a18 != coroutineSingletons17) {
                                    }
                                    break;
                                case i.f16047o /* 10 */:
                                    z11 = anonymousClass1.B;
                                    z12 = anonymousClass1.A;
                                    VaultTimeout vaultTimeout20 = anonymousClass1.f7880v;
                                    anonymousClass25 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    vaultTimeout4 = (VaultTimeout) anonymousClass1.f7881w;
                                    cVar10 = (c) anonymousClass1.f7874p;
                                    theme5 = (Theme) anonymousClass1.f7875q;
                                    font5 = (Font) anonymousClass1.f7876r;
                                    language4 = (Language) anonymousClass1.f7877s;
                                    icon4 = (Icon) anonymousClass1.f7878t;
                                    str3 = (String) anonymousClass1.f7879u;
                                    vaultTimeout5 = vaultTimeout20;
                                    String str182 = (String) obj2;
                                    b<FolderListSortingType> bVar112 = anonymousClass25.f7870j.f7745q;
                                    anonymousClass1.n = anonymousClass25;
                                    anonymousClass1.f7874p = cVar10;
                                    anonymousClass1.f7875q = theme5;
                                    anonymousClass1.f7876r = font5;
                                    anonymousClass1.f7877s = language4;
                                    anonymousClass1.f7878t = icon4;
                                    anonymousClass1.f7879u = str3;
                                    anonymousClass1.f7880v = vaultTimeout5;
                                    anonymousClass1.f7881w = vaultTimeout4;
                                    anonymousClass1.f7882x = str182;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z11;
                                    anonymousClass1.f7872m = 11;
                                    a19 = FlowKt__ReduceKt.a(bVar112, anonymousClass1);
                                    if (a19 != coroutineSingletons17) {
                                    }
                                    break;
                                case 11:
                                    boolean z73 = anonymousClass1.B;
                                    z12 = anonymousClass1.A;
                                    str4 = (String) anonymousClass1.f7882x;
                                    vaultTimeout4 = (VaultTimeout) anonymousClass1.f7881w;
                                    vaultTimeout5 = anonymousClass1.f7880v;
                                    str3 = (String) anonymousClass1.f7879u;
                                    icon4 = (Icon) anonymousClass1.f7878t;
                                    language4 = (Language) anonymousClass1.f7877s;
                                    font5 = (Font) anonymousClass1.f7876r;
                                    theme5 = (Theme) anonymousClass1.f7875q;
                                    cVar11 = (c) anonymousClass1.f7874p;
                                    m0.b.n1(obj2);
                                    z13 = z73;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    FolderListSortingType folderListSortingType92 = (FolderListSortingType) obj2;
                                    b<SortingOrder> bVar122 = anonymousClass26.f7870j.f7746r;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme5;
                                    anonymousClass1.f7876r = font5;
                                    anonymousClass1.f7877s = language4;
                                    anonymousClass1.f7878t = icon4;
                                    anonymousClass1.f7879u = str3;
                                    anonymousClass1.f7880v = vaultTimeout5;
                                    anonymousClass1.f7881w = vaultTimeout4;
                                    anonymousClass1.f7882x = str4;
                                    anonymousClass1.f7883y = folderListSortingType92;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z13;
                                    boolean z582 = z13;
                                    anonymousClass1.f7872m = 12;
                                    a20 = FlowKt__ReduceKt.a(bVar122, anonymousClass1);
                                    if (a20 != coroutineSingletons17) {
                                    }
                                    break;
                                case 12:
                                    boolean z74 = anonymousClass1.B;
                                    z12 = anonymousClass1.A;
                                    String str20 = (String) anonymousClass1.f7882x;
                                    VaultTimeout vaultTimeout21 = anonymousClass1.f7880v;
                                    c cVar16 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    z14 = z74;
                                    folderListSortingType = (FolderListSortingType) anonymousClass1.f7883y;
                                    font6 = (Font) anonymousClass1.f7876r;
                                    language5 = (Language) anonymousClass1.f7877s;
                                    icon5 = (Icon) anonymousClass1.f7878t;
                                    str5 = (String) anonymousClass1.f7879u;
                                    vaultTimeout7 = vaultTimeout21;
                                    vaultTimeout6 = (VaultTimeout) anonymousClass1.f7881w;
                                    str6 = str20;
                                    theme6 = (Theme) anonymousClass1.f7875q;
                                    cVar11 = cVar16;
                                    SortingOrder sortingOrder102 = (SortingOrder) obj2;
                                    b<Boolean> bVar132 = anonymousClass26.f7870j.f7747s;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme6;
                                    anonymousClass1.f7876r = font6;
                                    anonymousClass1.f7877s = language5;
                                    anonymousClass1.f7878t = icon5;
                                    anonymousClass1.f7879u = str5;
                                    anonymousClass1.f7880v = vaultTimeout7;
                                    anonymousClass1.f7881w = vaultTimeout6;
                                    anonymousClass1.f7882x = str6;
                                    anonymousClass1.f7883y = folderListSortingType;
                                    anonymousClass1.f7884z = sortingOrder102;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z14;
                                    boolean z592 = z14;
                                    anonymousClass1.f7872m = 13;
                                    a21 = FlowKt__ReduceKt.a(bVar132, anonymousClass1);
                                    if (a21 != coroutineSingletons17) {
                                    }
                                    break;
                                case 13:
                                    boolean z75 = anonymousClass1.B;
                                    z12 = anonymousClass1.A;
                                    sortingOrder = anonymousClass1.f7884z;
                                    folderListSortingType = (FolderListSortingType) anonymousClass1.f7883y;
                                    str6 = (String) anonymousClass1.f7882x;
                                    vaultTimeout6 = (VaultTimeout) anonymousClass1.f7881w;
                                    vaultTimeout7 = anonymousClass1.f7880v;
                                    str5 = (String) anonymousClass1.f7879u;
                                    icon5 = (Icon) anonymousClass1.f7878t;
                                    language5 = (Language) anonymousClass1.f7877s;
                                    c cVar17 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    z15 = z75;
                                    coroutineSingletons = coroutineSingletons17;
                                    theme7 = (Theme) anonymousClass1.f7875q;
                                    font7 = (Font) anonymousClass1.f7876r;
                                    cVar11 = cVar17;
                                    boolean booleanValue32 = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar142 = anonymousClass26.f7870j.f7742m;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language5;
                                    anonymousClass1.f7878t = icon5;
                                    anonymousClass1.f7879u = str5;
                                    anonymousClass1.f7880v = vaultTimeout7;
                                    anonymousClass1.f7881w = vaultTimeout6;
                                    anonymousClass1.f7882x = str6;
                                    anonymousClass1.f7883y = folderListSortingType;
                                    anonymousClass1.f7884z = sortingOrder;
                                    anonymousClass1.A = z12;
                                    anonymousClass1.B = z15;
                                    boolean z602 = z15;
                                    anonymousClass1.C = booleanValue32;
                                    anonymousClass1.f7872m = 14;
                                    obj2 = FlowKt__ReduceKt.a(bVar142, anonymousClass1);
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (obj2 != coroutineSingletons2) {
                                    }
                                    break;
                                case 14:
                                    boolean z76 = anonymousClass1.C;
                                    boolean z77 = anonymousClass1.B;
                                    boolean z78 = anonymousClass1.A;
                                    SortingOrder sortingOrder12 = anonymousClass1.f7884z;
                                    VaultTimeout vaultTimeout22 = anonymousClass1.f7880v;
                                    font7 = (Font) anonymousClass1.f7876r;
                                    Theme theme18 = (Theme) anonymousClass1.f7875q;
                                    c cVar18 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    icon6 = (Icon) anonymousClass1.f7878t;
                                    str8 = (String) anonymousClass1.f7879u;
                                    vaultTimeout8 = vaultTimeout22;
                                    vaultTimeout9 = (VaultTimeout) anonymousClass1.f7881w;
                                    str7 = (String) anonymousClass1.f7882x;
                                    folderListSortingType2 = (FolderListSortingType) anonymousClass1.f7883y;
                                    sortingOrder2 = sortingOrder12;
                                    z18 = z78;
                                    z16 = z77;
                                    language6 = (Language) anonymousClass1.f7877s;
                                    cVar11 = cVar18;
                                    z17 = z76;
                                    coroutineSingletons3 = coroutineSingletons17;
                                    theme7 = theme18;
                                    boolean booleanValue42 = ((Boolean) obj2).booleanValue();
                                    b<Boolean> bVar152 = anonymousClass26.f7870j.n;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language6;
                                    anonymousClass1.f7878t = icon6;
                                    anonymousClass1.f7879u = str8;
                                    anonymousClass1.f7880v = vaultTimeout8;
                                    anonymousClass1.f7881w = vaultTimeout9;
                                    anonymousClass1.f7882x = str7;
                                    anonymousClass1.f7883y = folderListSortingType2;
                                    anonymousClass1.f7884z = sortingOrder2;
                                    anonymousClass1.A = z18;
                                    anonymousClass1.B = z16;
                                    Icon icon132 = icon6;
                                    anonymousClass1.C = z17;
                                    anonymousClass1.D = booleanValue42;
                                    anonymousClass1.f7872m = 15;
                                    obj2 = FlowKt__ReduceKt.a(bVar152, anonymousClass1);
                                    coroutineSingletons4 = coroutineSingletons3;
                                    if (obj2 != coroutineSingletons4) {
                                    }
                                    break;
                                case i.f16049q /* 15 */:
                                    boolean z79 = anonymousClass1.D;
                                    boolean z80 = anonymousClass1.C;
                                    boolean z81 = anonymousClass1.B;
                                    boolean z82 = anonymousClass1.A;
                                    SortingOrder sortingOrder13 = anonymousClass1.f7884z;
                                    VaultTimeout vaultTimeout23 = anonymousClass1.f7880v;
                                    Font font12 = (Font) anonymousClass1.f7876r;
                                    Theme theme19 = (Theme) anonymousClass1.f7875q;
                                    c cVar19 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    str9 = (String) anonymousClass1.f7879u;
                                    vaultTimeout10 = vaultTimeout23;
                                    vaultTimeout11 = (VaultTimeout) anonymousClass1.f7881w;
                                    str10 = (String) anonymousClass1.f7882x;
                                    folderListSortingType3 = (FolderListSortingType) anonymousClass1.f7883y;
                                    sortingOrder3 = sortingOrder13;
                                    z19 = z82;
                                    z20 = z81;
                                    language7 = (Language) anonymousClass1.f7877s;
                                    font7 = font12;
                                    coroutineSingletons5 = coroutineSingletons17;
                                    theme7 = theme19;
                                    z22 = z79;
                                    z21 = z80;
                                    icon7 = (Icon) anonymousClass1.f7878t;
                                    cVar11 = cVar19;
                                    boolean booleanValue52 = ((Boolean) obj2).booleanValue();
                                    b<Long> bVar162 = anonymousClass26.f7870j.f7748t;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon7;
                                    anonymousClass1.f7879u = str9;
                                    anonymousClass1.f7880v = vaultTimeout10;
                                    anonymousClass1.f7881w = vaultTimeout11;
                                    anonymousClass1.f7882x = str10;
                                    anonymousClass1.f7883y = folderListSortingType3;
                                    anonymousClass1.f7884z = sortingOrder3;
                                    anonymousClass1.A = z19;
                                    anonymousClass1.B = z20;
                                    String str192 = str9;
                                    anonymousClass1.C = z21;
                                    anonymousClass1.D = z22;
                                    anonymousClass1.E = booleanValue52;
                                    anonymousClass1.f7872m = 16;
                                    obj2 = FlowKt__ReduceKt.a(bVar162, anonymousClass1);
                                    coroutineSingletons6 = coroutineSingletons5;
                                    if (obj2 != coroutineSingletons6) {
                                    }
                                    break;
                                case 16:
                                    boolean z83 = anonymousClass1.E;
                                    boolean z84 = anonymousClass1.D;
                                    boolean z85 = anonymousClass1.C;
                                    boolean z86 = anonymousClass1.B;
                                    boolean z87 = anonymousClass1.A;
                                    SortingOrder sortingOrder14 = anonymousClass1.f7884z;
                                    VaultTimeout vaultTimeout24 = anonymousClass1.f7880v;
                                    Language language11 = (Language) anonymousClass1.f7877s;
                                    Font font13 = (Font) anonymousClass1.f7876r;
                                    Theme theme20 = (Theme) anonymousClass1.f7875q;
                                    c cVar20 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    folderListSortingType4 = (FolderListSortingType) anonymousClass1.f7883y;
                                    vaultTimeout12 = vaultTimeout24;
                                    sortingOrder4 = sortingOrder14;
                                    vaultTimeout13 = (VaultTimeout) anonymousClass1.f7881w;
                                    z23 = z87;
                                    str11 = (String) anonymousClass1.f7882x;
                                    z24 = z86;
                                    icon8 = (Icon) anonymousClass1.f7878t;
                                    font7 = font13;
                                    z27 = z83;
                                    coroutineSingletons7 = coroutineSingletons17;
                                    theme7 = theme20;
                                    z26 = z84;
                                    str12 = (String) anonymousClass1.f7879u;
                                    cVar11 = cVar20;
                                    z25 = z85;
                                    language7 = language11;
                                    boolean z612 = z24;
                                    boolean z622 = z23;
                                    long longValue2 = ((Number) obj2).longValue();
                                    b<Boolean> bVar172 = anonymousClass26.f7870j.f7749u;
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType4;
                                    anonymousClass1.f7884z = sortingOrder4;
                                    FolderListSortingType folderListSortingType112 = folderListSortingType4;
                                    anonymousClass1.A = z622;
                                    anonymousClass1.B = z612;
                                    anonymousClass1.C = z25;
                                    anonymousClass1.D = z26;
                                    anonymousClass1.E = z27;
                                    anonymousClass1.G = longValue2;
                                    anonymousClass1.f7872m = 17;
                                    obj2 = FlowKt__ReduceKt.a(bVar172, anonymousClass1);
                                    coroutineSingletons8 = coroutineSingletons7;
                                    if (obj2 != coroutineSingletons8) {
                                    }
                                    break;
                                case 17:
                                    long j18 = anonymousClass1.G;
                                    boolean z88 = anonymousClass1.E;
                                    boolean z89 = anonymousClass1.D;
                                    boolean z90 = anonymousClass1.C;
                                    boolean z91 = anonymousClass1.B;
                                    boolean z92 = anonymousClass1.A;
                                    sortingOrder5 = anonymousClass1.f7884z;
                                    folderListSortingType5 = (FolderListSortingType) anonymousClass1.f7883y;
                                    VaultTimeout vaultTimeout25 = anonymousClass1.f7880v;
                                    String str21 = (String) anonymousClass1.f7879u;
                                    Language language12 = (Language) anonymousClass1.f7877s;
                                    Font font14 = (Font) anonymousClass1.f7876r;
                                    Theme theme21 = (Theme) anonymousClass1.f7875q;
                                    c cVar21 = (c) anonymousClass1.f7874p;
                                    anonymousClass26 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    z28 = z92;
                                    vaultTimeout12 = vaultTimeout25;
                                    font7 = font14;
                                    z30 = z88;
                                    language7 = language12;
                                    j2 = j18;
                                    coroutineSingletons9 = coroutineSingletons17;
                                    theme7 = theme21;
                                    z32 = z89;
                                    icon8 = (Icon) anonymousClass1.f7878t;
                                    str12 = str21;
                                    z29 = z90;
                                    str11 = (String) anonymousClass1.f7882x;
                                    z31 = z91;
                                    vaultTimeout13 = (VaultTimeout) anonymousClass1.f7881w;
                                    cVar11 = cVar21;
                                    boolean booleanValue62 = ((Boolean) obj2).booleanValue();
                                    boolean z632 = z31;
                                    b<Integer> m022 = anonymousClass26.f7870j.m0(FilteredItemModel.All);
                                    anonymousClass1.n = anonymousClass26;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme7;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType5;
                                    anonymousClass1.f7884z = sortingOrder5;
                                    anonymousClass1.A = z28;
                                    anonymousClass1.B = z632;
                                    boolean z642 = z28;
                                    anonymousClass1.C = z29;
                                    anonymousClass1.D = z32;
                                    boolean z652 = z30;
                                    anonymousClass1.E = z652;
                                    Theme theme142 = theme7;
                                    AnonymousClass2<T> anonymousClass2102 = anonymousClass26;
                                    long j142 = j2;
                                    anonymousClass1.G = j142;
                                    anonymousClass1.F = booleanValue62;
                                    anonymousClass1.f7872m = 18;
                                    obj2 = FlowKt__ReduceKt.a(m022, anonymousClass1);
                                    coroutineSingletons10 = coroutineSingletons9;
                                    if (obj2 != coroutineSingletons10) {
                                    }
                                    break;
                                case 18:
                                    boolean z93 = anonymousClass1.F;
                                    long j19 = anonymousClass1.G;
                                    boolean z94 = anonymousClass1.E;
                                    boolean z95 = anonymousClass1.D;
                                    boolean z96 = anonymousClass1.C;
                                    boolean z97 = anonymousClass1.B;
                                    boolean z98 = anonymousClass1.A;
                                    SortingOrder sortingOrder15 = anonymousClass1.f7884z;
                                    VaultTimeout vaultTimeout26 = anonymousClass1.f7880v;
                                    String str22 = (String) anonymousClass1.f7879u;
                                    Icon icon15 = (Icon) anonymousClass1.f7878t;
                                    Language language13 = (Language) anonymousClass1.f7877s;
                                    Font font15 = (Font) anonymousClass1.f7876r;
                                    Theme theme22 = (Theme) anonymousClass1.f7875q;
                                    c cVar22 = (c) anonymousClass1.f7874p;
                                    anonymousClass27 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    folderListSortingType6 = (FolderListSortingType) anonymousClass1.f7883y;
                                    sortingOrder6 = sortingOrder15;
                                    z33 = z98;
                                    z38 = z97;
                                    vaultTimeout12 = vaultTimeout26;
                                    z37 = z93;
                                    coroutineSingletons11 = coroutineSingletons17;
                                    theme8 = theme22;
                                    z35 = z95;
                                    str11 = (String) anonymousClass1.f7882x;
                                    cVar11 = cVar22;
                                    z34 = z96;
                                    vaultTimeout13 = (VaultTimeout) anonymousClass1.f7881w;
                                    font7 = font15;
                                    z36 = z94;
                                    icon8 = icon15;
                                    str12 = str22;
                                    language7 = language13;
                                    j10 = j19;
                                    int intValue4 = ((Number) obj2).intValue();
                                    boolean z662 = z38;
                                    b<Integer> m032 = anonymousClass27.f7870j.m0(FilteredItemModel.Recent);
                                    anonymousClass1.n = anonymousClass27;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme8;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str11;
                                    anonymousClass1.f7883y = folderListSortingType6;
                                    anonymousClass1.f7884z = sortingOrder6;
                                    anonymousClass1.A = z33;
                                    anonymousClass1.B = z662;
                                    FolderListSortingType folderListSortingType122 = folderListSortingType6;
                                    anonymousClass1.C = z34;
                                    anonymousClass1.D = z35;
                                    boolean z672 = z36;
                                    anonymousClass1.E = z672;
                                    Theme theme152 = theme8;
                                    AnonymousClass2<T> anonymousClass2112 = anonymousClass27;
                                    long j152 = j10;
                                    anonymousClass1.G = j152;
                                    anonymousClass1.F = z37;
                                    anonymousClass1.H = intValue4;
                                    anonymousClass1.f7872m = 19;
                                    obj2 = FlowKt__ReduceKt.a(m032, anonymousClass1);
                                    coroutineSingletons12 = coroutineSingletons11;
                                    if (obj2 != coroutineSingletons12) {
                                    }
                                    break;
                                case 19:
                                    int i17 = anonymousClass1.H;
                                    boolean z99 = anonymousClass1.F;
                                    long j20 = anonymousClass1.G;
                                    boolean z100 = anonymousClass1.E;
                                    boolean z101 = anonymousClass1.D;
                                    boolean z102 = anonymousClass1.C;
                                    boolean z103 = anonymousClass1.B;
                                    boolean z104 = anonymousClass1.A;
                                    SortingOrder sortingOrder16 = anonymousClass1.f7884z;
                                    VaultTimeout vaultTimeout27 = (VaultTimeout) anonymousClass1.f7881w;
                                    VaultTimeout vaultTimeout28 = anonymousClass1.f7880v;
                                    String str23 = (String) anonymousClass1.f7879u;
                                    Icon icon16 = (Icon) anonymousClass1.f7878t;
                                    Language language14 = (Language) anonymousClass1.f7877s;
                                    Font font16 = (Font) anonymousClass1.f7876r;
                                    Theme theme23 = (Theme) anonymousClass1.f7875q;
                                    c cVar23 = (c) anonymousClass1.f7874p;
                                    anonymousClass28 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    sortingOrder7 = sortingOrder16;
                                    z39 = z104;
                                    z40 = z103;
                                    str13 = (String) anonymousClass1.f7882x;
                                    font7 = font16;
                                    z43 = z100;
                                    folderListSortingType7 = (FolderListSortingType) anonymousClass1.f7883y;
                                    cVar11 = cVar23;
                                    z41 = z102;
                                    vaultTimeout12 = vaultTimeout28;
                                    i10 = i17;
                                    coroutineSingletons13 = coroutineSingletons17;
                                    theme9 = theme23;
                                    z42 = z101;
                                    vaultTimeout13 = vaultTimeout27;
                                    z44 = z99;
                                    str12 = str23;
                                    icon8 = icon16;
                                    language7 = language14;
                                    j11 = j20;
                                    int intValue22 = ((Number) obj2).intValue();
                                    boolean z682 = z40;
                                    b<Integer> m042 = anonymousClass28.f7870j.m0(FilteredItemModel.Scheduled);
                                    anonymousClass1.n = anonymousClass28;
                                    anonymousClass1.f7874p = cVar11;
                                    anonymousClass1.f7875q = theme9;
                                    anonymousClass1.f7876r = font7;
                                    anonymousClass1.f7877s = language7;
                                    anonymousClass1.f7878t = icon8;
                                    anonymousClass1.f7879u = str12;
                                    anonymousClass1.f7880v = vaultTimeout12;
                                    anonymousClass1.f7881w = vaultTimeout13;
                                    anonymousClass1.f7882x = str13;
                                    anonymousClass1.f7883y = folderListSortingType7;
                                    anonymousClass1.f7884z = sortingOrder7;
                                    anonymousClass1.A = z39;
                                    anonymousClass1.B = z682;
                                    SortingOrder sortingOrder112 = sortingOrder7;
                                    anonymousClass1.C = z41;
                                    anonymousClass1.D = z42;
                                    boolean z692 = z43;
                                    anonymousClass1.E = z692;
                                    Theme theme162 = theme9;
                                    AnonymousClass2<T> anonymousClass2122 = anonymousClass28;
                                    long j162 = j11;
                                    anonymousClass1.G = j162;
                                    anonymousClass1.F = z44;
                                    anonymousClass1.H = i10;
                                    anonymousClass1.I = intValue22;
                                    anonymousClass1.f7872m = 20;
                                    obj2 = FlowKt__ReduceKt.a(m042, anonymousClass1);
                                    coroutineSingletons14 = coroutineSingletons13;
                                    if (obj2 != coroutineSingletons14) {
                                    }
                                    break;
                                case 20:
                                    int i18 = anonymousClass1.I;
                                    int i19 = anonymousClass1.H;
                                    boolean z105 = anonymousClass1.F;
                                    long j21 = anonymousClass1.G;
                                    boolean z106 = anonymousClass1.E;
                                    boolean z107 = anonymousClass1.D;
                                    boolean z108 = anonymousClass1.C;
                                    boolean z109 = anonymousClass1.B;
                                    boolean z110 = anonymousClass1.A;
                                    SortingOrder sortingOrder17 = anonymousClass1.f7884z;
                                    String str24 = (String) anonymousClass1.f7882x;
                                    VaultTimeout vaultTimeout29 = (VaultTimeout) anonymousClass1.f7881w;
                                    VaultTimeout vaultTimeout30 = anonymousClass1.f7880v;
                                    String str25 = (String) anonymousClass1.f7879u;
                                    Icon icon17 = (Icon) anonymousClass1.f7878t;
                                    Language language15 = (Language) anonymousClass1.f7877s;
                                    Font font17 = (Font) anonymousClass1.f7876r;
                                    Theme theme24 = (Theme) anonymousClass1.f7875q;
                                    c cVar24 = (c) anonymousClass1.f7874p;
                                    anonymousClass29 = (AnonymousClass2) anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    j12 = j21;
                                    z45 = z110;
                                    folderListSortingType7 = (FolderListSortingType) anonymousClass1.f7883y;
                                    icon8 = icon17;
                                    font7 = font17;
                                    z46 = z106;
                                    z48 = z108;
                                    z49 = z109;
                                    sortingOrder8 = sortingOrder17;
                                    vaultTimeout13 = vaultTimeout29;
                                    cVar11 = cVar24;
                                    str13 = str24;
                                    i12 = i18;
                                    coroutineSingletons15 = coroutineSingletons17;
                                    theme10 = theme24;
                                    i11 = i19;
                                    str12 = str25;
                                    z50 = z105;
                                    language7 = language15;
                                    z47 = z107;
                                    vaultTimeout12 = vaultTimeout30;
                                    int intValue32 = ((Number) obj2).intValue();
                                    b<Integer> m052 = anonymousClass29.f7870j.m0(FilteredItemModel.Archived);
                                    anonymousClass1.n = cVar11;
                                    anonymousClass1.f7874p = theme10;
                                    anonymousClass1.f7875q = font7;
                                    anonymousClass1.f7876r = language7;
                                    anonymousClass1.f7877s = icon8;
                                    anonymousClass1.f7878t = str12;
                                    anonymousClass1.f7879u = vaultTimeout12;
                                    anonymousClass1.f7880v = vaultTimeout13;
                                    anonymousClass1.f7881w = str13;
                                    anonymousClass1.f7882x = folderListSortingType7;
                                    anonymousClass1.f7883y = sortingOrder8;
                                    anonymousClass1.f7884z = null;
                                    anonymousClass1.A = z45;
                                    anonymousClass1.B = z49;
                                    boolean z702 = z48;
                                    anonymousClass1.C = z702;
                                    boolean z712 = z45;
                                    anonymousClass1.D = z47;
                                    boolean z722 = z46;
                                    anonymousClass1.E = z722;
                                    Theme theme172 = theme10;
                                    long j172 = j12;
                                    anonymousClass1.G = j172;
                                    anonymousClass1.F = z50;
                                    anonymousClass1.H = i11;
                                    anonymousClass1.I = i12;
                                    anonymousClass1.J = intValue32;
                                    anonymousClass1.f7872m = 21;
                                    obj2 = FlowKt__ReduceKt.a(m052, anonymousClass1);
                                    coroutineSingletons16 = coroutineSingletons15;
                                    if (obj2 != coroutineSingletons16) {
                                    }
                                    break;
                                case 21:
                                    int i20 = anonymousClass1.J;
                                    int i21 = anonymousClass1.I;
                                    int i22 = anonymousClass1.H;
                                    boolean z111 = anonymousClass1.F;
                                    long j22 = anonymousClass1.G;
                                    boolean z112 = anonymousClass1.E;
                                    boolean z113 = anonymousClass1.D;
                                    boolean z114 = anonymousClass1.C;
                                    z55 = anonymousClass1.B;
                                    boolean z115 = anonymousClass1.A;
                                    folderListSortingType8 = (FolderListSortingType) anonymousClass1.f7882x;
                                    String str26 = (String) anonymousClass1.f7881w;
                                    VaultTimeout vaultTimeout31 = anonymousClass1.f7880v;
                                    VaultTimeout vaultTimeout32 = (VaultTimeout) anonymousClass1.f7879u;
                                    String str27 = (String) anonymousClass1.f7878t;
                                    Icon icon18 = (Icon) anonymousClass1.f7877s;
                                    Language language16 = (Language) anonymousClass1.f7876r;
                                    Font font18 = (Font) anonymousClass1.f7875q;
                                    Theme theme25 = (Theme) anonymousClass1.f7874p;
                                    cVar12 = anonymousClass1.n;
                                    m0.b.n1(obj2);
                                    i13 = i20;
                                    coroutineSingletons16 = coroutineSingletons17;
                                    i14 = i21;
                                    theme11 = theme25;
                                    i15 = i22;
                                    font8 = font18;
                                    z53 = z111;
                                    language8 = language16;
                                    sortingOrder9 = (SortingOrder) anonymousClass1.f7883y;
                                    z51 = z112;
                                    vaultTimeout15 = vaultTimeout32;
                                    z54 = z113;
                                    vaultTimeout14 = vaultTimeout31;
                                    z52 = z114;
                                    z56 = z115;
                                    str14 = str26;
                                    str15 = str27;
                                    icon9 = icon18;
                                    j13 = j22;
                                    vVar = new v(theme11, font8, language8, icon9, str15, vaultTimeout15, vaultTimeout14, z56, z55, str14, folderListSortingType8, sortingOrder9, z52, z54, z51, j13, z53, i15, i14, i13, ((Number) obj2).intValue());
                                    anonymousClass1.n = null;
                                    anonymousClass1.f7874p = null;
                                    anonymousClass1.f7875q = null;
                                    anonymousClass1.f7876r = null;
                                    anonymousClass1.f7877s = null;
                                    anonymousClass1.f7878t = null;
                                    anonymousClass1.f7879u = null;
                                    anonymousClass1.f7880v = null;
                                    anonymousClass1.f7881w = null;
                                    anonymousClass1.f7882x = null;
                                    anonymousClass1.f7883y = null;
                                    anonymousClass1.f7872m = 22;
                                    if (cVar12.c(vVar, anonymousClass1) == coroutineSingletons16) {
                                    }
                                    return n.f16010a;
                                case 22:
                                    m0.b.n1(obj2);
                                    return n.f16010a;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7871l;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (anonymousClass1.f7872m) {
                    }
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super v> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, this), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b10 = dVar.b();
        final ?? r22 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7926i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7927l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7928m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7927l = obj;
                        this.f7928m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7926i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7928m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7928m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7927l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7928m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16922a);
                                anonymousClass1.f7928m = 1;
                                if (this.f7926i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7927l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7928m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7733d = a1.b.Q(new b<Theme>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$3

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7970i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$3$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7971l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7972m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7971l = obj;
                        this.f7972m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7970i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7972m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7972m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7971l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7972m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                Theme valueOf = str != null ? Theme.valueOf(str) : Theme.System;
                                anonymousClass1.f7972m = 1;
                                if (this.f7970i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7971l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7972m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Theme> cVar, p7.c cVar2) {
                Object a10 = r22.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b11 = dVar.b();
        final ?? r23 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$4

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8014i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$4$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8015l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8016m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8015l = obj;
                        this.f8016m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8014i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8016m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8016m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8015l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8016m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16923b);
                                anonymousClass1.f8016m = 1;
                                if (this.f8014i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8015l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8016m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7734e = a1.b.Q(new b<Font>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$5

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8018i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$5$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$5$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8019l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8020m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8019l = obj;
                        this.f8020m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8018i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8020m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8020m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8019l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8020m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                Font valueOf = str != null ? Font.valueOf(str) : Font.Nunito;
                                anonymousClass1.f8020m = 1;
                                if (this.f8018i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8019l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8020m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Font> cVar, p7.c cVar2) {
                Object a10 = r23.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b12 = dVar.b();
        final ?? r24 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$6

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$6$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8022i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$6$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$6$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8023l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8024m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8023l = obj;
                        this.f8024m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8022i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8024m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8024m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8023l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8024m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.c);
                                anonymousClass1.f8024m = 1;
                                if (this.f8022i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8023l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8024m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7735f = a1.b.Q(new b<Language>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$7

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$7$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8026i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$7$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$7$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8027l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8028m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8027l = obj;
                        this.f8028m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8026i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8028m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8028m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8027l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8028m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                Language valueOf = str != null ? Language.valueOf(str) : Language.System;
                                anonymousClass1.f8028m = 1;
                                if (this.f8026i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8027l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8028m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Language> cVar, p7.c cVar2) {
                Object a10 = r24.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b13 = dVar.b();
        final ?? r25 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$8

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$8$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8030i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$8$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$8$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8031l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8032m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8031l = obj;
                        this.f8032m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8030i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8032m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8032m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8031l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8032m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16924d);
                                anonymousClass1.f8032m = 1;
                                if (this.f8030i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8031l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8032m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7736g = a1.b.Q(new b<Icon>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$9

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$9$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8034i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$9$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$9$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8035l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8036m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8035l = obj;
                        this.f8036m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8034i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8036m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8036m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8035l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8036m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                Icon valueOf = str != null ? Icon.valueOf(str) : Icon.Futuristic;
                                anonymousClass1.f8036m = 1;
                                if (this.f8034i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8035l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8036m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Icon> cVar, p7.c cVar2) {
                Object a10 = r25.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b14 = dVar.b();
        this.f7737h = a1.b.Q(new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$10

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$10$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7886i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$10$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$10$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7887l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7888m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7887l = obj;
                        this.f7888m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7886i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7888m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7888m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7887l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7888m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16929i);
                                anonymousClass1.f7888m = 1;
                                if (this.f7886i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7887l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7888m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b15 = dVar.b();
        final ?? r26 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$11

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$11$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7890i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$11$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$11$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7891l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7892m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7891l = obj;
                        this.f7892m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7890i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7892m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7892m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7891l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7892m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16930j);
                                anonymousClass1.f7892m = 1;
                                if (this.f7890i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7891l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7892m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7738i = a1.b.Q(new b<VaultTimeout>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$12

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$12$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7894i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$12$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$12$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7895l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7896m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7895l = obj;
                        this.f7896m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7894i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7896m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7896m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7895l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7896m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                VaultTimeout valueOf = str != null ? VaultTimeout.valueOf(str) : VaultTimeout.Immediately;
                                anonymousClass1.f7896m = 1;
                                if (this.f7894i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7895l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7896m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super VaultTimeout> cVar, p7.c cVar2) {
                Object a10 = r26.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b16 = dVar.b();
        final ?? r27 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$13

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$13$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7898i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$13$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$13$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7899l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7900m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7899l = obj;
                        this.f7900m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7898i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7900m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7900m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7899l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7900m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16931k);
                                anonymousClass1.f7900m = 1;
                                if (this.f7898i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7899l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7900m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7739j = a1.b.Q(new b<VaultTimeout>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$14

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$14$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7902i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$14$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$14$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7903l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7904m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7903l = obj;
                        this.f7904m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7902i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7904m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7904m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7903l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7904m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                VaultTimeout valueOf = str != null ? VaultTimeout.valueOf(str) : null;
                                anonymousClass1.f7904m = 1;
                                if (this.f7902i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7903l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7904m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super VaultTimeout> cVar, p7.c cVar2) {
                Object a10 = r27.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b17 = dVar.b();
        final ?? r28 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$15

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$15$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7906i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$15$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$15$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7907l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7908m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7907l = obj;
                        this.f7908m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7906i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7908m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7908m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7907l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7908m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16928h);
                                anonymousClass1.f7908m = 1;
                                if (this.f7906i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7907l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7908m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7740k = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$16

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$16$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7910i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$16$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$16$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7911l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7912m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7911l = obj;
                        this.f7912m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7910i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7912m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7912m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7911l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7912m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                                anonymousClass1.f7912m = 1;
                                if (this.f7910i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7911l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7912m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r28.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b18 = dVar.b();
        final ?? r29 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$17

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$17$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7914i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$17$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$17$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7915l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7916m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7915l = obj;
                        this.f7916m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7914i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7916m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7916m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7915l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7916m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16935p);
                                anonymousClass1.f7916m = 1;
                                if (this.f7914i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7915l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7916m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7741l = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$18

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$18$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7918i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$18$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$18$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7919l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7920m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7919l = obj;
                        this.f7920m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7918i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7920m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7920m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7919l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7920m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                                anonymousClass1.f7920m = 1;
                                if (this.f7918i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7919l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7920m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r29.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b19 = dVar.b();
        this.f7742m = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$19

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$19$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7922i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$19$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$19$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7923l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7924m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7923l = obj;
                        this.f7924m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7922i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7924m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7924m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7923l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7924m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Boolean bool = (Boolean) ((a) obj).b(q6.a.f16933m);
                                if (bool != null) {
                                    z10 = bool.booleanValue();
                                } else {
                                    z10 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7924m = 1;
                                if (this.f7922i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7923l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7924m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b20 = dVar.b();
        this.n = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$20

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$20$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7930i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$20$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$20$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7931l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7932m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7931l = obj;
                        this.f7932m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7930i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7932m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7932m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7931l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7932m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Boolean bool = (Boolean) ((a) obj).b(q6.a.n);
                                if (bool != null) {
                                    z10 = bool.booleanValue();
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7932m = 1;
                                if (this.f7930i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7931l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7932m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b21 = dVar.b();
        this.f7743o = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$21

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$21$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7934i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$21$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$21$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7935l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7936m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7935l = obj;
                        this.f7936m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7934i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7936m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7936m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7935l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7936m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Boolean bool = (Boolean) ((a) obj).b(q6.a.f16934o);
                                if (bool != null) {
                                    z10 = bool.booleanValue();
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7936m = 1;
                                if (this.f7934i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7935l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7936m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b22 = dVar.b();
        final ?? r210 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$22

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$22$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7938i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$22$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$22$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7939l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7940m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7939l = obj;
                        this.f7940m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7938i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7940m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7940m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7939l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7940m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16932l);
                                anonymousClass1.f7940m = 1;
                                if (this.f7938i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7939l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7940m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7744p = a1.b.Q(new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$23

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$23$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7942i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$23$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$23$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7943l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7944m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7943l = obj;
                        this.f7944m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7942i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7944m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7944m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7943l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7944m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str == null) {
                                    str = "2.2.2";
                                }
                                anonymousClass1.f7944m = 1;
                                if (this.f7942i.c(str, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7943l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7944m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = r210.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b23 = dVar.b();
        final ?? r211 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$24

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$24$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7946i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$24$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$24$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7947l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7948m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7947l = obj;
                        this.f7948m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7946i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7948m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7948m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7947l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7948m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16925e);
                                anonymousClass1.f7948m = 1;
                                if (this.f7946i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7947l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7948m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7745q = a1.b.Q(new b<FolderListSortingType>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$25

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$25$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7950i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$25$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$25$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7951l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7952m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7951l = obj;
                        this.f7952m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7950i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7952m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7952m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7951l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7952m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                FolderListSortingType valueOf = str != null ? FolderListSortingType.valueOf(str) : FolderListSortingType.CreationDate;
                                anonymousClass1.f7952m = 1;
                                if (this.f7950i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7951l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7952m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super FolderListSortingType> cVar, p7.c cVar2) {
                Object a10 = r211.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b24 = dVar.b();
        final ?? r212 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$26

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$26$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7954i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$26$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$26$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7955l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7956m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7955l = obj;
                        this.f7956m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7954i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7956m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7956m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7955l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7956m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16926f);
                                anonymousClass1.f7956m = 1;
                                if (this.f7954i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7955l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7956m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7746r = a1.b.Q(new b<SortingOrder>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$27

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$27$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7958i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$27$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$27$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7959l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7960m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7959l = obj;
                        this.f7960m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7958i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7960m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7960m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7959l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7960m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                SortingOrder valueOf = str != null ? SortingOrder.valueOf(str) : SortingOrder.Descending;
                                anonymousClass1.f7960m = 1;
                                if (this.f7958i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7959l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7960m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super SortingOrder> cVar, p7.c cVar2) {
                Object a10 = r212.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b25 = dVar.b();
        final ?? r213 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$28

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$28$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7962i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$28$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$28$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7963l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7964m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7963l = obj;
                        this.f7964m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7962i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7964m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7964m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7963l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7964m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16927g);
                                anonymousClass1.f7964m = 1;
                                if (this.f7962i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7963l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7964m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7747s = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$29

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$29$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7966i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$29$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$29$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7967l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7968m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7967l = obj;
                        this.f7968m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7966i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7968m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7968m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7967l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7968m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7968m = 1;
                                if (this.f7966i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7967l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7968m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r213.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b26 = dVar.b();
        final ?? r214 = new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$30

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$30$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7974i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$30$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$30$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7975l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7976m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7975l = obj;
                        this.f7976m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7974i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7976m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7976m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7975l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7976m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16936q);
                                anonymousClass1.f7976m = 1;
                                if (this.f7974i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7975l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7976m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7748t = a1.b.Q(new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$31

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$31$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7978i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$31$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$31$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7979l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7980m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7979l = obj;
                        this.f7980m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7978i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    long j2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7980m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7980m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7979l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7980m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Long l2 = (Long) obj;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = -4;
                                }
                                Long l4 = new Long(j2);
                                anonymousClass1.f7980m = 1;
                                if (this.f7978i.c(l4, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7979l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7980m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = r214.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b27 = dVar.b();
        final ?? r215 = new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$32

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$32$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7982i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$32$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$32$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7983l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7984m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7983l = obj;
                        this.f7984m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7982i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7984m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7984m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7983l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7984m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16937r);
                                anonymousClass1.f7984m = 1;
                                if (this.f7982i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7983l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7984m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7749u = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$33

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$33$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7986i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$33$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$33$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7987l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7988m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7987l = obj;
                        this.f7988m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7986i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7988m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7988m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7987l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7988m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Boolean bool = (Boolean) obj;
                                if (bool != null) {
                                    z10 = bool.booleanValue();
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7988m = 1;
                                if (this.f7986i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7987l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7988m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r215.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b28 = dVar.b();
        final ?? r216 = new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$34

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$34$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7990i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$34$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$34$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7991l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7992m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7991l = obj;
                        this.f7992m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7990i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7992m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7992m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7991l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7992m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16938s);
                                anonymousClass1.f7992m = 1;
                                if (this.f7990i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7991l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7992m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7750v = a1.b.Q(new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$35

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$35$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7994i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$35$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$35$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7995l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7996m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7995l = obj;
                        this.f7996m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7994i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    long j2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7996m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7996m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7995l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7996m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Long l2 = (Long) obj;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = -1;
                                }
                                Long l4 = new Long(j2);
                                anonymousClass1.f7996m = 1;
                                if (this.f7994i.c(l4, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7995l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7996m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = r216.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b29 = dVar.b();
        final ?? r217 = new b<Float>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$36

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$36$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7998i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$36$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$36$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7999l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8000m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7999l = obj;
                        this.f8000m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7998i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8000m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8000m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7999l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8000m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16939t);
                                anonymousClass1.f8000m = 1;
                                if (this.f7998i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7999l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8000m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Float> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7751w = a1.b.Q(new b<ScreenBrightnessLevel>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$37

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$37$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8002i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$37$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$37$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8003l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8004m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8003l = obj;
                        this.f8004m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8002i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    ScreenBrightnessLevel screenBrightnessLevel;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8004m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8004m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8003l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8004m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Float f10 = (Float) obj;
                                ScreenBrightnessLevel[] values = ScreenBrightnessLevel.values();
                                int length = values.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < length) {
                                        screenBrightnessLevel = values[i12];
                                        float f11 = screenBrightnessLevel.f8219i;
                                        if (f10 != null && f11 == f10.floatValue()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        screenBrightnessLevel = null;
                                        break;
                                    }
                                }
                                if (screenBrightnessLevel == null) {
                                    screenBrightnessLevel = ScreenBrightnessLevel.System;
                                }
                                anonymousClass1.f8004m = 1;
                                if (this.f8002i.c(screenBrightnessLevel, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8003l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8004m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super ScreenBrightnessLevel> cVar, p7.c cVar2) {
                Object a10 = r217.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
        final b b30 = dVar.b();
        final ?? r1 = new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$38

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$38$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8006i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$38$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$38$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8007l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8008m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8007l = obj;
                        this.f8008m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8006i = cVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8008m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8008m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8007l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8008m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                Object b5 = ((a) obj).b(q6.a.f16940u);
                                anonymousClass1.f8008m = 1;
                                if (this.f8006i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8007l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8008m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        this.f7752x = a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$39

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$39$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f8010i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$39$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$special$$inlined$map$39$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8011l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8012m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8011l = obj;
                        this.f8012m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f8010i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f8012m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8012m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8011l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8012m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Boolean bool = (Boolean) obj;
                                if (bool != null) {
                                    z10 = bool.booleanValue();
                                } else {
                                    z10 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f8012m = 1;
                                if (this.f8010i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f8011l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8012m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, aVar);
    }

    @Override // u6.e
    public final b<Boolean> A() {
        return this.f7740k;
    }

    @Override // u6.e
    public final Object B(VaultTimeout vaultTimeout, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateScheduledVaultTimeout$2(this, vaultTimeout, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object C(v vVar, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateConfig$2(vVar, this, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object D(long j2, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateMainInterfaceId$2(this, j2, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object E(SortingOrder sortingOrder, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateSortingOrder$2(this, sortingOrder, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object F(FolderListSortingType folderListSortingType, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateSortingType$2(this, folderListSortingType, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> G(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7835i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7836j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7837l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7838m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7837l = obj;
                        this.f7838m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7835i = cVar;
                    this.f7836j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7838m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7838m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7837l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7838m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Notes_Count_" + this.f7836j));
                                anonymousClass1.f7838m = 1;
                                if (this.f7835i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7837l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7838m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7840i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetNotesCount$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7841l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7842m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7841l = obj;
                        this.f7842m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7840i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7842m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7842m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7841l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7842m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7842m = 1;
                                if (this.f7840i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7841l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7842m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> H(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7765i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7766j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7767l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7768m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7767l = obj;
                        this.f7768m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7765i = cVar;
                    this.f7766j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7768m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7768m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7767l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7768m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_App_Icon_" + this.f7766j));
                                anonymousClass1.f7768m = 1;
                                if (this.f7765i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7767l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7768m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7770i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetAppIconEnabled$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7771l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7772m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7771l = obj;
                        this.f7772m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7770i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7772m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7772m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7771l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7772m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7772m = 1;
                                if (this.f7770i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7771l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7772m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object I(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsFullScreen$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object J(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsVaultOpen$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Long> K() {
        return this.f7750v;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$1] */
    @Override // u6.e
    public final b<Long> L(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7825i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7826j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7827l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7828m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7827l = obj;
                        this.f7828m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7825i = cVar;
                    this.f7826j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7828m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7828m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7827l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7828m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.C("Widget_Id_Folder_Id_" + this.f7826j));
                                anonymousClass1.f7828m = 1;
                                if (this.f7825i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7827l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7828m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Long>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7830i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFolderId$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7831l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7832m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7831l = obj;
                        this.f7832m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7830i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    long j2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7832m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7832m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7831l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7832m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Long l2 = (Long) obj;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = 0;
                                }
                                Long l4 = new Long(j2);
                                anonymousClass1.f7832m = 1;
                                if (this.f7830i.c(l4, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7831l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7832m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Long> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final b<ScreenBrightnessLevel> M() {
        return this.f7751w;
    }

    @Override // u6.e
    public final b<SortingOrder> N() {
        return this.f7746r;
    }

    @Override // u6.e
    public final Object O(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsBioAuthEnabled$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Boolean> P() {
        return this.f7749u;
    }

    @Override // u6.e
    public final b<Boolean> Q() {
        return this.n;
    }

    @Override // u6.e
    public final Object R(ScreenBrightnessLevel screenBrightnessLevel, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateScreenBrightnessLevel$2(this, screenBrightnessLevel, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object S(int i10, long j2, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateWidgetFolderId$2(this, i10, j2, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object T(String str, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateVaultPasscode$2(this, str, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object U(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateQuickExit$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<String> V() {
        return this.f7744p;
    }

    @Override // u6.e
    public final Object W(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsRememberScrollingPosition$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object X(Font font, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateFont$2(this, font, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object Y(String str, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateLastVersion$2(this, str, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> Z(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7785i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7786j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7787l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7788m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7787l = obj;
                        this.f7788m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7785i = cVar;
                    this.f7786j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7788m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7788m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7787l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7788m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Edit_Button" + this.f7786j));
                                anonymousClass1.f7788m = 1;
                                if (this.f7785i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7787l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7788m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7790i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetEditButtonEnabled$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7791l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7792m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7791l = obj;
                        this.f7792m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7790i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7792m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7792m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7791l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7792m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7792m = 1;
                                if (this.f7790i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7791l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7792m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object a(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsDoNotDisturb$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object a0(Language language, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateLanguage$2(this, language, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> b(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7805i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7806j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7807l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7808m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7807l = obj;
                        this.f7808m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7805i = cVar;
                    this.f7806j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7808m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7808m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7807l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7808m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_New_Item_Button_" + this.f7806j));
                                anonymousClass1.f7808m = 1;
                                if (this.f7805i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7807l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7808m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7810i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetNewItemButtonEnabled$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7811l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7812m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7811l = obj;
                        this.f7812m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7810i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7812m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7812m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7811l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7812m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7812m = 1;
                                if (this.f7810i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7811l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7812m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object b0(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsScreenOn$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object c(int i10, p7.c cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsWidgetCreated$2(this, i10, true, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Boolean> c0() {
        return this.f7741l;
    }

    @Override // u6.e
    public final Object d(long j2, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateQuickNoteFolderId$2(this, j2, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object d0(boolean z10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsShowNotesCount$2(this, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object e(int i10, p7.c cVar, boolean z10) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsWidgetEditButtonEnabled$2(this, i10, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Long> e0() {
        return this.f7748t;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$1] */
    @Override // u6.e
    public final b f(final long j2, final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7856i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7857j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ long f7858k;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7859l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7860m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7859l = obj;
                        this.f7860m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10, long j2) {
                    this.f7856i = cVar;
                    this.f7857j = i10;
                    this.f7858k = j2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7860m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7860m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7859l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7860m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Id_" + this.f7857j + "_folder_id" + this.f7858k));
                                anonymousClass1.f7860m = 1;
                                if (this.f7856i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7859l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7860m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10, j2), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<List<? extends Long>>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7863i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ SettingsRepositoryImpl f7864j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetSelectedLabelIds$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7865l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7866m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7865l = obj;
                        this.f7866m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, SettingsRepositoryImpl settingsRepositoryImpl) {
                    this.f7863i = cVar;
                    this.f7864j = settingsRepositoryImpl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
                /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.flow.c] */
                /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    ?? r82;
                    boolean z10;
                    List<String> list;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7866m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7866m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7865l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7866m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    this.f7864j.getClass();
                                    String[] strArr = {", "};
                                    String str2 = strArr[0];
                                    if (str2.length() == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        list = kotlin.text.b.m1(0, str, str2, false);
                                    } else {
                                        ga.n nVar = new ga.n(kotlin.text.b.i1(str, strArr, false, 0));
                                        ArrayList arrayList = new ArrayList(l.Z1(nVar, 10));
                                        Iterator<Object> it = nVar.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(kotlin.text.b.p1(str, (b8.i) it.next()));
                                        }
                                        list = arrayList;
                                    }
                                    r82 = new ArrayList();
                                    for (String str3 : list) {
                                        Long Q0 = h.Q0(str3);
                                        if (Q0 != null) {
                                            r82.add(Q0);
                                        }
                                    }
                                } else {
                                    r82 = EmptyList.f12981i;
                                }
                                anonymousClass1.f7866m = 1;
                                if (this.f7863i.c(r82, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7865l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7866m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super List<? extends Long>> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar, this), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object f0(int i10, long j2, List<Long> list, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateWidgetSelectedLabelIds$2(this, i10, j2, list, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Boolean> g() {
        return this.f7743o;
    }

    @Override // u6.e
    public final Object g0(int i10, int i11, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateWidgetRadius$2(this, i10, i11, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Icon> getIcon() {
        return this.f7736g;
    }

    @Override // u6.e
    public final b<Font> h() {
        return this.f7734e;
    }

    @Override // u6.e
    public final b<Language> h0() {
        return this.f7735f;
    }

    @Override // u6.e
    public final Object i(int i10, p7.c cVar, boolean z10) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsWidgetAppIconEnabled$2(this, i10, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object i0(int i10, p7.c cVar, boolean z10) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateWidgetNotesCount$2(this, i10, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object j(VaultTimeout vaultTimeout, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateVaultTimeout$2(this, vaultTimeout, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<String> j0() {
        return this.f7737h;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$1] */
    @Override // u6.e
    public final b<Integer> k(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7845i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7846j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7847l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7848m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7847l = obj;
                        this.f7848m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7845i = cVar;
                    this.f7846j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7848m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7848m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7847l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7848m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Radius_" + this.f7846j));
                                anonymousClass1.f7848m = 1;
                                if (this.f7845i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7847l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7848m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Integer>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7850i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetRadius$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7851l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7852m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7851l = obj;
                        this.f7852m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7850i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    int i11;
                    Integer P0;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i12 = anonymousClass1.f7852m;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7852m = i12 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7851l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7852m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null && (P0 = h.P0(str)) != null) {
                                    i11 = P0.intValue();
                                } else {
                                    i11 = 16;
                                }
                                Integer num = new Integer(i11);
                                anonymousClass1.f7852m = 1;
                                if (this.f7850i.c(num, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7851l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7852m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Integer> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final b<Theme> k0() {
        return this.f7733d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> l(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7795i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7796j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7797l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7798m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7797l = obj;
                        this.f7798m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7795i = cVar;
                    this.f7796j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7798m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7798m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7797l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7798m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Header_" + this.f7796j));
                                anonymousClass1.f7798m = 1;
                                if (this.f7795i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7797l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7798m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7800i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetHeaderEnabled$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7801l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7802m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7801l = obj;
                        this.f7802m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7800i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7802m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7802m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7801l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7802m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                if (str != null) {
                                    z10 = Boolean.parseBoolean(str);
                                } else {
                                    z10 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z10);
                                anonymousClass1.f7802m = 1;
                                if (this.f7800i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7801l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7802m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$1] */
    @Override // u6.e
    public final b<FilteringType> l0(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7815i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7816j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7817l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7818m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7817l = obj;
                        this.f7818m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7815i = cVar;
                    this.f7816j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7818m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7818m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7817l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7818m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Filtering_Type_" + this.f7816j));
                                anonymousClass1.f7818m = 1;
                                if (this.f7815i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7817l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7818m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<FilteringType>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7820i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getWidgetFilteringType$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7821l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7822m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7821l = obj;
                        this.f7822m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7820i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7822m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7822m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7821l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7822m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                String str = (String) obj;
                                FilteringType valueOf = str != null ? FilteringType.valueOf(str) : FilteringType.Inclusive;
                                anonymousClass1.f7822m = 1;
                                if (this.f7820i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                m0.b.n1(obj2);
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7821l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7822m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super FilteringType> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object m(int i10, FilteringType filteringType, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateWidgetFilteringType$2(this, i10, filteringType, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$1] */
    @Override // u6.e
    public final b<Integer> m0(final FilteredItemModel filteredItemModel) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<Integer>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7755i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ FilteredItemModel f7756j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7757l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7758m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7757l = obj;
                        this.f7758m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, FilteredItemModel filteredItemModel) {
                    this.f7755i = cVar;
                    this.f7756j = filteredItemModel;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    FilteredItemModel filteredItemModel;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7758m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7758m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7757l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7758m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                a.C0185a<String> c0185a = q6.a.f16922a;
                                g.f(this.f7756j, "model");
                                String str = "Filtered_Item_Model_" + filteredItemModel.f8286i;
                                g.f(str, "name");
                                Object b5 = ((a) obj).b(new a.C0185a<>(str));
                                anonymousClass1.f7758m = 1;
                                if (this.f7755i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7757l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7758m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Integer> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, filteredItemModel), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Integer>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7760i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getFilteredNotesScrollingPosition$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7761l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7762m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7761l = obj;
                        this.f7762m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7760i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    int i11;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i12 = anonymousClass1.f7762m;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7762m = i12 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7761l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7762m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    i11 = num.intValue();
                                } else {
                                    i11 = 0;
                                }
                                Integer num2 = new Integer(i11);
                                anonymousClass1.f7762m = 1;
                                if (this.f7760i.c(num2, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7761l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7762m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Integer> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final b<VaultTimeout> n() {
        return this.f7739j;
    }

    @Override // u6.e
    public final b<FolderListSortingType> o() {
        return this.f7745q;
    }

    @Override // u6.e
    public final b<Boolean> p() {
        return this.f7742m;
    }

    @Override // u6.e
    public final Object q(int i10, p7.c cVar, boolean z10) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsWidgetNewItemButtonEnabled$2(this, i10, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$1] */
    @Override // u6.e
    public final b<Boolean> r(final int i10) {
        final b<a> b5 = this.f7731a.b();
        final ?? r1 = new b<String>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$1

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7775i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ int f7776j;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7777l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7778m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7777l = obj;
                        this.f7778m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar, int i10) {
                    this.f7775i = cVar;
                    this.f7776j = i10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7778m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7778m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7777l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7778m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Object b5 = ((a) obj).b(i.N("Widget_Id_" + this.f7776j));
                                anonymousClass1.f7778m = 1;
                                if (this.f7775i.c(b5, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7777l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7778m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super String> cVar, p7.c cVar2) {
                Object a10 = b.this.a(new AnonymousClass2(cVar, i10), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        };
        return a1.b.Q(new b<Boolean>() { // from class: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$2

            /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ c f7780i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$2$2", f = "SettingsRepositoryImpl.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$getIsWidgetCreated$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7781l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7782m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7781l = obj;
                        this.f7782m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(c cVar) {
                    this.f7780i = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, p7.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.f7782m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7782m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7781l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7782m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    m0.b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                m0.b.n1(obj2);
                                Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                                anonymousClass1.f7782m = 1;
                                if (this.f7780i.c(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7781l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7782m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(c<? super Boolean> cVar, p7.c cVar2) {
                Object a10 = r1.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, this.f7732b);
    }

    @Override // u6.e
    public final Object s(Theme theme, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateTheme$2(this, theme, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final Object t(int i10, p7.c cVar, boolean z10) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIsWidgetHeaderEnabled$2(this, i10, z10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<VaultTimeout> u() {
        return this.f7738i;
    }

    @Override // u6.e
    public final Object v(FilteredItemModel filteredItemModel, int i10, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateFilteredNotesScrollingPosition$2(this, filteredItemModel, i10, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<v> w() {
        return this.c;
    }

    @Override // u6.e
    public final b<Boolean> x() {
        return this.f7752x;
    }

    @Override // u6.e
    public final Object y(Icon icon, p7.c<? super n> cVar) {
        Object I1 = m0.b.I1(cVar, this.f7732b, new SettingsRepositoryImpl$updateIcon$2(this, icon, null));
        return I1 == CoroutineSingletons.COROUTINE_SUSPENDED ? I1 : n.f16010a;
    }

    @Override // u6.e
    public final b<Boolean> z() {
        return this.f7747s;
    }
}
