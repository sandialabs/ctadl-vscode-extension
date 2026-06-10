package t6;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.GroupingOrder;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.OpenNotesIn;
import com.noto.app.domain.model.SortingOrder;
import j$.time.Clock;
import j$.time.Instant;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.f0;
import ua.n0;
import ua.s1;
import ua.x0;

@qa.d
/* loaded from: classes.dex */
public final class a {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final long f17592a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f17593b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17594d;

    /* renamed from: e  reason: collision with root package name */
    public final NotoColor f17595e;

    /* renamed from: f  reason: collision with root package name */
    public final na.c f17596f;

    /* renamed from: g  reason: collision with root package name */
    public final Layout f17597g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17598h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17599i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17600j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f17601k;

    /* renamed from: l  reason: collision with root package name */
    public final NewNoteCursorPosition f17602l;

    /* renamed from: m  reason: collision with root package name */
    public final NoteListSortingType f17603m;
    public final SortingOrder n;

    /* renamed from: o  reason: collision with root package name */
    public final Grouping f17604o;

    /* renamed from: p  reason: collision with root package name */
    public final GroupingOrder f17605p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f17606q;

    /* renamed from: r  reason: collision with root package name */
    public final int f17607r;

    /* renamed from: s  reason: collision with root package name */
    public final FilteringType f17608s;

    /* renamed from: t  reason: collision with root package name */
    public final OpenNotesIn f17609t;

    /* renamed from: u  reason: collision with root package name */
    public final List<Pair<a, Integer>> f17610u;

    /* renamed from: t6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0226a implements f0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0226a f17611a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17612b;

        static {
            C0226a c0226a = new C0226a();
            f17611a = c0226a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.Folder", c0226a, 20);
            pluginGeneratedSerialDescriptor.l("id", true);
            pluginGeneratedSerialDescriptor.l("parentId", true);
            pluginGeneratedSerialDescriptor.l("title", true);
            pluginGeneratedSerialDescriptor.l("position", false);
            pluginGeneratedSerialDescriptor.l("color", true);
            pluginGeneratedSerialDescriptor.l("creationDate", true);
            pluginGeneratedSerialDescriptor.l("layout", true);
            pluginGeneratedSerialDescriptor.l("notePreviewSize", true);
            pluginGeneratedSerialDescriptor.l("isArchived", true);
            pluginGeneratedSerialDescriptor.l("isPinned", true);
            pluginGeneratedSerialDescriptor.l("isShowNoteCreationDate", true);
            pluginGeneratedSerialDescriptor.l("newNoteCursorPosition", true);
            pluginGeneratedSerialDescriptor.l("sortingType", true);
            pluginGeneratedSerialDescriptor.l("sortingOrder", true);
            pluginGeneratedSerialDescriptor.l("grouping", true);
            pluginGeneratedSerialDescriptor.l("groupingOrder", true);
            pluginGeneratedSerialDescriptor.l("isVaulted", true);
            pluginGeneratedSerialDescriptor.l("scrollingPosition", true);
            pluginGeneratedSerialDescriptor.l("filteringType", true);
            pluginGeneratedSerialDescriptor.l("openNotesIn", true);
            f17612b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a f(ta.c cVar) {
            int i10;
            int i11;
            int i12;
            int i13;
            v7.g.f(cVar, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17612b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            Object obj = null;
            Object obj2 = null;
            NewNoteCursorPosition newNoteCursorPosition = null;
            Grouping grouping = null;
            Object obj3 = null;
            SortingOrder sortingOrder = null;
            NoteListSortingType noteListSortingType = null;
            Layout layout = null;
            Object obj4 = null;
            String str = null;
            long j2 = 0;
            int i14 = 0;
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i17 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                switch (t10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        j2 = b5.y(pluginGeneratedSerialDescriptor, 0);
                        i14 |= 1;
                        break;
                    case 1:
                        i14 |= 2;
                        obj6 = b5.Y(pluginGeneratedSerialDescriptor, 1, x0.f18029a, obj6);
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        str = b5.E(pluginGeneratedSerialDescriptor, 2);
                        i12 = i14 | 4;
                        i14 = i12;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        i15 = b5.u(pluginGeneratedSerialDescriptor, 3);
                        i12 = i14 | 8;
                        i14 = i12;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        obj2 = b5.A(pluginGeneratedSerialDescriptor, 4, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), obj2);
                        i12 = i14 | 16;
                        i14 = i12;
                        break;
                    case 5:
                        obj = b5.A(pluginGeneratedSerialDescriptor, 5, pa.d.f16791a, obj);
                        i14 |= 32;
                        break;
                    case 6:
                        i13 = i14 | 64;
                        layout = b5.A(pluginGeneratedSerialDescriptor, 6, a1.b.I("com.noto.app.domain.model.Layout", Layout.values()), layout);
                        i14 = i13;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        i16 = b5.u(pluginGeneratedSerialDescriptor, 7);
                        i10 = i14 | 128;
                        i14 = i10;
                        break;
                    case 8:
                        z11 = b5.e0(pluginGeneratedSerialDescriptor, 8);
                        i10 = i14 | 256;
                        i14 = i10;
                        break;
                    case ma.i.f16046m /* 9 */:
                        z12 = b5.e0(pluginGeneratedSerialDescriptor, 9);
                        i10 = i14 | 512;
                        i14 = i10;
                        break;
                    case ma.i.f16047o /* 10 */:
                        z13 = b5.e0(pluginGeneratedSerialDescriptor, 10);
                        i10 = i14 | 1024;
                        i14 = i10;
                        break;
                    case 11:
                        i13 = i14 | 2048;
                        newNoteCursorPosition = b5.A(pluginGeneratedSerialDescriptor, 11, a1.b.I("com.noto.app.domain.model.NewNoteCursorPosition", NewNoteCursorPosition.values()), newNoteCursorPosition);
                        i14 = i13;
                        break;
                    case 12:
                        i13 = i14 | 4096;
                        noteListSortingType = b5.A(pluginGeneratedSerialDescriptor, 12, a1.b.I("com.noto.app.domain.model.NoteListSortingType", NoteListSortingType.values()), noteListSortingType);
                        i14 = i13;
                        break;
                    case 13:
                        i13 = i14 | 8192;
                        sortingOrder = b5.A(pluginGeneratedSerialDescriptor, 13, a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), sortingOrder);
                        i14 = i13;
                        break;
                    case 14:
                        i13 = i14 | 16384;
                        grouping = b5.A(pluginGeneratedSerialDescriptor, 14, a1.b.I("com.noto.app.domain.model.Grouping", Grouping.values()), grouping);
                        i14 = i13;
                        break;
                    case ma.i.f16049q /* 15 */:
                        obj3 = b5.A(pluginGeneratedSerialDescriptor, 15, a1.b.I("com.noto.app.domain.model.GroupingOrder", GroupingOrder.values()), obj3);
                        i11 = 32768;
                        i10 = i11 | i14;
                        i14 = i10;
                        break;
                    case 16:
                        z14 = b5.e0(pluginGeneratedSerialDescriptor, 16);
                        i11 = 65536;
                        i10 = i11 | i14;
                        i14 = i10;
                        break;
                    case 17:
                        i17 = b5.u(pluginGeneratedSerialDescriptor, 17);
                        i11 = 131072;
                        i10 = i11 | i14;
                        i14 = i10;
                        break;
                    case 18:
                        obj4 = b5.A(pluginGeneratedSerialDescriptor, 18, a1.b.I("com.noto.app.domain.model.FilteringType", FilteringType.values()), obj4);
                        i11 = 262144;
                        i10 = i11 | i14;
                        i14 = i10;
                        break;
                    case 19:
                        obj5 = b5.A(pluginGeneratedSerialDescriptor, 19, a1.b.I("com.noto.app.domain.model.OpenNotesIn", OpenNotesIn.values()), obj5);
                        i11 = 524288;
                        i10 = i11 | i14;
                        i14 = i10;
                        break;
                    default:
                        throw new UnknownFieldException(t10);
                }
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new a(i14, j2, (Long) obj6, str, i15, (NotoColor) obj2, (na.c) obj, layout, i16, z11, z12, z13, newNoteCursorPosition, noteListSortingType, sortingOrder, grouping, (GroupingOrder) obj3, z14, i17, (FilteringType) obj4, (OpenNotesIn) obj5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:161:0x0229, code lost:
            if (r9 == com.noto.app.domain.model.OpenNotesIn.Editor) goto L113;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x017a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x019b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01bc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01db A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01dc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01f0 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01f1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0205 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00e5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x010e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x010f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0123 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0124 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0138 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0159 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void g(ta.d dVar, a aVar) {
            boolean z10;
            boolean n02;
            boolean z11;
            boolean n03;
            boolean z12;
            boolean n04;
            boolean z13;
            boolean n05;
            boolean z14;
            boolean n06;
            boolean z15;
            boolean n07;
            boolean z16;
            boolean n08;
            boolean z17;
            boolean n09;
            boolean z18;
            boolean n010;
            boolean z19;
            boolean n011;
            boolean z20;
            boolean n012;
            boolean z21;
            boolean n013;
            boolean z22;
            boolean n014;
            boolean z23;
            boolean n015;
            boolean z24;
            boolean n016;
            boolean z25;
            boolean n017;
            boolean z26;
            boolean n018;
            boolean z27;
            boolean n019;
            v7.g.f(dVar, "encoder");
            v7.g.f(aVar, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17612b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n020 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z28 = false;
            long j2 = aVar.f17592a;
            if (!n020 && j2 == 0) {
                z10 = false;
                if (z10) {
                    b5.h(pluginGeneratedSerialDescriptor, 0, j2);
                }
                n02 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable = aVar.f17593b;
                if (!n02 && comparable == null) {
                    z11 = false;
                    if (z11) {
                        b5.p(pluginGeneratedSerialDescriptor, 1, x0.f18029a, comparable);
                    }
                    n03 = b5.n0(pluginGeneratedSerialDescriptor);
                    String str = aVar.c;
                    if (!n03 && v7.g.a(str, "")) {
                        z12 = false;
                        if (z12) {
                            b5.o0(pluginGeneratedSerialDescriptor, 2, str);
                        }
                        b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
                        n04 = b5.n0(pluginGeneratedSerialDescriptor);
                        NotoColor notoColor = aVar.f17595e;
                        if (!n04 && notoColor == NotoColor.Gray) {
                            z13 = false;
                            if (z13) {
                                b5.g0(pluginGeneratedSerialDescriptor, 4, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), notoColor);
                            }
                            n05 = b5.n0(pluginGeneratedSerialDescriptor);
                            na.c cVar = aVar.f17596f;
                            if (n05) {
                                na.c.Companion.getClass();
                                Instant instant = Clock.systemUTC().instant();
                                v7.g.e(instant, "systemUTC().instant()");
                                if (v7.g.a(cVar, new na.c(instant))) {
                                    z14 = false;
                                    if (z14) {
                                        b5.g0(pluginGeneratedSerialDescriptor, 5, pa.d.f16791a, cVar);
                                    }
                                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                                    Layout layout = aVar.f17597g;
                                    if (n06 && layout == Layout.Linear) {
                                        z15 = false;
                                        if (z15) {
                                            b5.g0(pluginGeneratedSerialDescriptor, 6, a1.b.I("com.noto.app.domain.model.Layout", Layout.values()), layout);
                                        }
                                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i10 = aVar.f17598h;
                                        if (n07 && i10 == 15) {
                                            z16 = false;
                                            if (z16) {
                                                b5.r(7, i10, pluginGeneratedSerialDescriptor);
                                            }
                                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z29 = aVar.f17599i;
                                            if (n08 && !z29) {
                                                z17 = false;
                                                if (z17) {
                                                    b5.h0(pluginGeneratedSerialDescriptor, 8, z29);
                                                }
                                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z30 = aVar.f17600j;
                                                if (n09 && !z30) {
                                                    z18 = false;
                                                    if (z18) {
                                                        b5.h0(pluginGeneratedSerialDescriptor, 9, z30);
                                                    }
                                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z31 = aVar.f17601k;
                                                    if (n010 && !z31) {
                                                        z19 = false;
                                                        if (z19) {
                                                            b5.h0(pluginGeneratedSerialDescriptor, 10, z31);
                                                        }
                                                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        NewNoteCursorPosition newNoteCursorPosition = aVar.f17602l;
                                                        if (n011 && newNoteCursorPosition == NewNoteCursorPosition.Body) {
                                                            z20 = false;
                                                            if (z20) {
                                                                b5.g0(pluginGeneratedSerialDescriptor, 11, a1.b.I("com.noto.app.domain.model.NewNoteCursorPosition", NewNoteCursorPosition.values()), newNoteCursorPosition);
                                                            }
                                                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            NoteListSortingType noteListSortingType = aVar.f17603m;
                                                            if (n012 && noteListSortingType == NoteListSortingType.CreationDate) {
                                                                z21 = false;
                                                                if (z21) {
                                                                    b5.g0(pluginGeneratedSerialDescriptor, 12, a1.b.I("com.noto.app.domain.model.NoteListSortingType", NoteListSortingType.values()), noteListSortingType);
                                                                }
                                                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                SortingOrder sortingOrder = aVar.n;
                                                                if (n013 && sortingOrder == SortingOrder.Descending) {
                                                                    z22 = false;
                                                                    if (z22) {
                                                                        b5.g0(pluginGeneratedSerialDescriptor, 13, a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), sortingOrder);
                                                                    }
                                                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    Grouping grouping = aVar.f17604o;
                                                                    if (n014 && grouping == Grouping.None) {
                                                                        z23 = false;
                                                                        if (z23) {
                                                                            b5.g0(pluginGeneratedSerialDescriptor, 14, a1.b.I("com.noto.app.domain.model.Grouping", Grouping.values()), grouping);
                                                                        }
                                                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        GroupingOrder groupingOrder = aVar.f17605p;
                                                                        if (n015 && groupingOrder == GroupingOrder.Descending) {
                                                                            z24 = false;
                                                                            if (z24) {
                                                                                b5.g0(pluginGeneratedSerialDescriptor, 15, a1.b.I("com.noto.app.domain.model.GroupingOrder", GroupingOrder.values()), groupingOrder);
                                                                            }
                                                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            boolean z32 = aVar.f17606q;
                                                                            if (n016 && !z32) {
                                                                                z25 = false;
                                                                                if (z25) {
                                                                                    b5.h0(pluginGeneratedSerialDescriptor, 16, z32);
                                                                                }
                                                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i11 = aVar.f17607r;
                                                                                if (n017 && i11 == 0) {
                                                                                    z26 = false;
                                                                                    if (z26) {
                                                                                        b5.r(17, i11, pluginGeneratedSerialDescriptor);
                                                                                    }
                                                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    FilteringType filteringType = aVar.f17608s;
                                                                                    if (n018 && filteringType == FilteringType.Inclusive) {
                                                                                        z27 = false;
                                                                                        if (z27) {
                                                                                            b5.g0(pluginGeneratedSerialDescriptor, 18, a1.b.I("com.noto.app.domain.model.FilteringType", FilteringType.values()), filteringType);
                                                                                        }
                                                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                        OpenNotesIn openNotesIn = aVar.f17609t;
                                                                                        if (!n019) {
                                                                                        }
                                                                                        z28 = true;
                                                                                        if (z28) {
                                                                                            b5.g0(pluginGeneratedSerialDescriptor, 19, a1.b.I("com.noto.app.domain.model.OpenNotesIn", OpenNotesIn.values()), openNotesIn);
                                                                                        }
                                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                                    }
                                                                                    z27 = true;
                                                                                    if (z27) {
                                                                                    }
                                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    OpenNotesIn openNotesIn2 = aVar.f17609t;
                                                                                    if (!n019) {
                                                                                    }
                                                                                    z28 = true;
                                                                                    if (z28) {
                                                                                    }
                                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                                }
                                                                                z26 = true;
                                                                                if (z26) {
                                                                                }
                                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                FilteringType filteringType2 = aVar.f17608s;
                                                                                if (n018) {
                                                                                    z27 = false;
                                                                                    if (z27) {
                                                                                    }
                                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    OpenNotesIn openNotesIn22 = aVar.f17609t;
                                                                                    if (!n019) {
                                                                                    }
                                                                                    z28 = true;
                                                                                    if (z28) {
                                                                                    }
                                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                                }
                                                                                z27 = true;
                                                                                if (z27) {
                                                                                }
                                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                OpenNotesIn openNotesIn222 = aVar.f17609t;
                                                                                if (!n019) {
                                                                                }
                                                                                z28 = true;
                                                                                if (z28) {
                                                                                }
                                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                                            }
                                                                            z25 = true;
                                                                            if (z25) {
                                                                            }
                                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i112 = aVar.f17607r;
                                                                            if (n017) {
                                                                                z26 = false;
                                                                                if (z26) {
                                                                                }
                                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                FilteringType filteringType22 = aVar.f17608s;
                                                                                if (n018) {
                                                                                }
                                                                                z27 = true;
                                                                                if (z27) {
                                                                                }
                                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                OpenNotesIn openNotesIn2222 = aVar.f17609t;
                                                                                if (!n019) {
                                                                                }
                                                                                z28 = true;
                                                                                if (z28) {
                                                                                }
                                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                                            }
                                                                            z26 = true;
                                                                            if (z26) {
                                                                            }
                                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            FilteringType filteringType222 = aVar.f17608s;
                                                                            if (n018) {
                                                                            }
                                                                            z27 = true;
                                                                            if (z27) {
                                                                            }
                                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            OpenNotesIn openNotesIn22222 = aVar.f17609t;
                                                                            if (!n019) {
                                                                            }
                                                                            z28 = true;
                                                                            if (z28) {
                                                                            }
                                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                                        }
                                                                        z24 = true;
                                                                        if (z24) {
                                                                        }
                                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        boolean z322 = aVar.f17606q;
                                                                        if (n016) {
                                                                            z25 = false;
                                                                            if (z25) {
                                                                            }
                                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i1122 = aVar.f17607r;
                                                                            if (n017) {
                                                                            }
                                                                            z26 = true;
                                                                            if (z26) {
                                                                            }
                                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            FilteringType filteringType2222 = aVar.f17608s;
                                                                            if (n018) {
                                                                            }
                                                                            z27 = true;
                                                                            if (z27) {
                                                                            }
                                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            OpenNotesIn openNotesIn222222 = aVar.f17609t;
                                                                            if (!n019) {
                                                                            }
                                                                            z28 = true;
                                                                            if (z28) {
                                                                            }
                                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                                        }
                                                                        z25 = true;
                                                                        if (z25) {
                                                                        }
                                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i11222 = aVar.f17607r;
                                                                        if (n017) {
                                                                        }
                                                                        z26 = true;
                                                                        if (z26) {
                                                                        }
                                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        FilteringType filteringType22222 = aVar.f17608s;
                                                                        if (n018) {
                                                                        }
                                                                        z27 = true;
                                                                        if (z27) {
                                                                        }
                                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        OpenNotesIn openNotesIn2222222 = aVar.f17609t;
                                                                        if (!n019) {
                                                                        }
                                                                        z28 = true;
                                                                        if (z28) {
                                                                        }
                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                    }
                                                                    z23 = true;
                                                                    if (z23) {
                                                                    }
                                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    GroupingOrder groupingOrder2 = aVar.f17605p;
                                                                    if (n015) {
                                                                        z24 = false;
                                                                        if (z24) {
                                                                        }
                                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        boolean z3222 = aVar.f17606q;
                                                                        if (n016) {
                                                                        }
                                                                        z25 = true;
                                                                        if (z25) {
                                                                        }
                                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i112222 = aVar.f17607r;
                                                                        if (n017) {
                                                                        }
                                                                        z26 = true;
                                                                        if (z26) {
                                                                        }
                                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        FilteringType filteringType222222 = aVar.f17608s;
                                                                        if (n018) {
                                                                        }
                                                                        z27 = true;
                                                                        if (z27) {
                                                                        }
                                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        OpenNotesIn openNotesIn22222222 = aVar.f17609t;
                                                                        if (!n019) {
                                                                        }
                                                                        z28 = true;
                                                                        if (z28) {
                                                                        }
                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                    }
                                                                    z24 = true;
                                                                    if (z24) {
                                                                    }
                                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    boolean z32222 = aVar.f17606q;
                                                                    if (n016) {
                                                                    }
                                                                    z25 = true;
                                                                    if (z25) {
                                                                    }
                                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i1122222 = aVar.f17607r;
                                                                    if (n017) {
                                                                    }
                                                                    z26 = true;
                                                                    if (z26) {
                                                                    }
                                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    FilteringType filteringType2222222 = aVar.f17608s;
                                                                    if (n018) {
                                                                    }
                                                                    z27 = true;
                                                                    if (z27) {
                                                                    }
                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    OpenNotesIn openNotesIn222222222 = aVar.f17609t;
                                                                    if (!n019) {
                                                                    }
                                                                    z28 = true;
                                                                    if (z28) {
                                                                    }
                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                }
                                                                z22 = true;
                                                                if (z22) {
                                                                }
                                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                Grouping grouping2 = aVar.f17604o;
                                                                if (n014) {
                                                                    z23 = false;
                                                                    if (z23) {
                                                                    }
                                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    GroupingOrder groupingOrder22 = aVar.f17605p;
                                                                    if (n015) {
                                                                    }
                                                                    z24 = true;
                                                                    if (z24) {
                                                                    }
                                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    boolean z322222 = aVar.f17606q;
                                                                    if (n016) {
                                                                    }
                                                                    z25 = true;
                                                                    if (z25) {
                                                                    }
                                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i11222222 = aVar.f17607r;
                                                                    if (n017) {
                                                                    }
                                                                    z26 = true;
                                                                    if (z26) {
                                                                    }
                                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    FilteringType filteringType22222222 = aVar.f17608s;
                                                                    if (n018) {
                                                                    }
                                                                    z27 = true;
                                                                    if (z27) {
                                                                    }
                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    OpenNotesIn openNotesIn2222222222 = aVar.f17609t;
                                                                    if (!n019) {
                                                                    }
                                                                    z28 = true;
                                                                    if (z28) {
                                                                    }
                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                }
                                                                z23 = true;
                                                                if (z23) {
                                                                }
                                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                GroupingOrder groupingOrder222 = aVar.f17605p;
                                                                if (n015) {
                                                                }
                                                                z24 = true;
                                                                if (z24) {
                                                                }
                                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z3222222 = aVar.f17606q;
                                                                if (n016) {
                                                                }
                                                                z25 = true;
                                                                if (z25) {
                                                                }
                                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i112222222 = aVar.f17607r;
                                                                if (n017) {
                                                                }
                                                                z26 = true;
                                                                if (z26) {
                                                                }
                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                FilteringType filteringType222222222 = aVar.f17608s;
                                                                if (n018) {
                                                                }
                                                                z27 = true;
                                                                if (z27) {
                                                                }
                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                OpenNotesIn openNotesIn22222222222 = aVar.f17609t;
                                                                if (!n019) {
                                                                }
                                                                z28 = true;
                                                                if (z28) {
                                                                }
                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                            }
                                                            z21 = true;
                                                            if (z21) {
                                                            }
                                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            SortingOrder sortingOrder2 = aVar.n;
                                                            if (n013) {
                                                                z22 = false;
                                                                if (z22) {
                                                                }
                                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                Grouping grouping22 = aVar.f17604o;
                                                                if (n014) {
                                                                }
                                                                z23 = true;
                                                                if (z23) {
                                                                }
                                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                GroupingOrder groupingOrder2222 = aVar.f17605p;
                                                                if (n015) {
                                                                }
                                                                z24 = true;
                                                                if (z24) {
                                                                }
                                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z32222222 = aVar.f17606q;
                                                                if (n016) {
                                                                }
                                                                z25 = true;
                                                                if (z25) {
                                                                }
                                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i1122222222 = aVar.f17607r;
                                                                if (n017) {
                                                                }
                                                                z26 = true;
                                                                if (z26) {
                                                                }
                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                FilteringType filteringType2222222222 = aVar.f17608s;
                                                                if (n018) {
                                                                }
                                                                z27 = true;
                                                                if (z27) {
                                                                }
                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                OpenNotesIn openNotesIn222222222222 = aVar.f17609t;
                                                                if (!n019) {
                                                                }
                                                                z28 = true;
                                                                if (z28) {
                                                                }
                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                            }
                                                            z22 = true;
                                                            if (z22) {
                                                            }
                                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            Grouping grouping222 = aVar.f17604o;
                                                            if (n014) {
                                                            }
                                                            z23 = true;
                                                            if (z23) {
                                                            }
                                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            GroupingOrder groupingOrder22222 = aVar.f17605p;
                                                            if (n015) {
                                                            }
                                                            z24 = true;
                                                            if (z24) {
                                                            }
                                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z322222222 = aVar.f17606q;
                                                            if (n016) {
                                                            }
                                                            z25 = true;
                                                            if (z25) {
                                                            }
                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i11222222222 = aVar.f17607r;
                                                            if (n017) {
                                                            }
                                                            z26 = true;
                                                            if (z26) {
                                                            }
                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            FilteringType filteringType22222222222 = aVar.f17608s;
                                                            if (n018) {
                                                            }
                                                            z27 = true;
                                                            if (z27) {
                                                            }
                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            OpenNotesIn openNotesIn2222222222222 = aVar.f17609t;
                                                            if (!n019) {
                                                            }
                                                            z28 = true;
                                                            if (z28) {
                                                            }
                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                        }
                                                        z20 = true;
                                                        if (z20) {
                                                        }
                                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        NoteListSortingType noteListSortingType2 = aVar.f17603m;
                                                        if (n012) {
                                                            z21 = false;
                                                            if (z21) {
                                                            }
                                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            SortingOrder sortingOrder22 = aVar.n;
                                                            if (n013) {
                                                            }
                                                            z22 = true;
                                                            if (z22) {
                                                            }
                                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            Grouping grouping2222 = aVar.f17604o;
                                                            if (n014) {
                                                            }
                                                            z23 = true;
                                                            if (z23) {
                                                            }
                                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            GroupingOrder groupingOrder222222 = aVar.f17605p;
                                                            if (n015) {
                                                            }
                                                            z24 = true;
                                                            if (z24) {
                                                            }
                                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z3222222222 = aVar.f17606q;
                                                            if (n016) {
                                                            }
                                                            z25 = true;
                                                            if (z25) {
                                                            }
                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i112222222222 = aVar.f17607r;
                                                            if (n017) {
                                                            }
                                                            z26 = true;
                                                            if (z26) {
                                                            }
                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            FilteringType filteringType222222222222 = aVar.f17608s;
                                                            if (n018) {
                                                            }
                                                            z27 = true;
                                                            if (z27) {
                                                            }
                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            OpenNotesIn openNotesIn22222222222222 = aVar.f17609t;
                                                            if (!n019) {
                                                            }
                                                            z28 = true;
                                                            if (z28) {
                                                            }
                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                        }
                                                        z21 = true;
                                                        if (z21) {
                                                        }
                                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        SortingOrder sortingOrder222 = aVar.n;
                                                        if (n013) {
                                                        }
                                                        z22 = true;
                                                        if (z22) {
                                                        }
                                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        Grouping grouping22222 = aVar.f17604o;
                                                        if (n014) {
                                                        }
                                                        z23 = true;
                                                        if (z23) {
                                                        }
                                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        GroupingOrder groupingOrder2222222 = aVar.f17605p;
                                                        if (n015) {
                                                        }
                                                        z24 = true;
                                                        if (z24) {
                                                        }
                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z32222222222 = aVar.f17606q;
                                                        if (n016) {
                                                        }
                                                        z25 = true;
                                                        if (z25) {
                                                        }
                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i1122222222222 = aVar.f17607r;
                                                        if (n017) {
                                                        }
                                                        z26 = true;
                                                        if (z26) {
                                                        }
                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        FilteringType filteringType2222222222222 = aVar.f17608s;
                                                        if (n018) {
                                                        }
                                                        z27 = true;
                                                        if (z27) {
                                                        }
                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        OpenNotesIn openNotesIn222222222222222 = aVar.f17609t;
                                                        if (!n019) {
                                                        }
                                                        z28 = true;
                                                        if (z28) {
                                                        }
                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                    }
                                                    z19 = true;
                                                    if (z19) {
                                                    }
                                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    NewNoteCursorPosition newNoteCursorPosition2 = aVar.f17602l;
                                                    if (n011) {
                                                        z20 = false;
                                                        if (z20) {
                                                        }
                                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        NoteListSortingType noteListSortingType22 = aVar.f17603m;
                                                        if (n012) {
                                                        }
                                                        z21 = true;
                                                        if (z21) {
                                                        }
                                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        SortingOrder sortingOrder2222 = aVar.n;
                                                        if (n013) {
                                                        }
                                                        z22 = true;
                                                        if (z22) {
                                                        }
                                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        Grouping grouping222222 = aVar.f17604o;
                                                        if (n014) {
                                                        }
                                                        z23 = true;
                                                        if (z23) {
                                                        }
                                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        GroupingOrder groupingOrder22222222 = aVar.f17605p;
                                                        if (n015) {
                                                        }
                                                        z24 = true;
                                                        if (z24) {
                                                        }
                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z322222222222 = aVar.f17606q;
                                                        if (n016) {
                                                        }
                                                        z25 = true;
                                                        if (z25) {
                                                        }
                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i11222222222222 = aVar.f17607r;
                                                        if (n017) {
                                                        }
                                                        z26 = true;
                                                        if (z26) {
                                                        }
                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        FilteringType filteringType22222222222222 = aVar.f17608s;
                                                        if (n018) {
                                                        }
                                                        z27 = true;
                                                        if (z27) {
                                                        }
                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        OpenNotesIn openNotesIn2222222222222222 = aVar.f17609t;
                                                        if (!n019) {
                                                        }
                                                        z28 = true;
                                                        if (z28) {
                                                        }
                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                    }
                                                    z20 = true;
                                                    if (z20) {
                                                    }
                                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    NoteListSortingType noteListSortingType222 = aVar.f17603m;
                                                    if (n012) {
                                                    }
                                                    z21 = true;
                                                    if (z21) {
                                                    }
                                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    SortingOrder sortingOrder22222 = aVar.n;
                                                    if (n013) {
                                                    }
                                                    z22 = true;
                                                    if (z22) {
                                                    }
                                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    Grouping grouping2222222 = aVar.f17604o;
                                                    if (n014) {
                                                    }
                                                    z23 = true;
                                                    if (z23) {
                                                    }
                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    GroupingOrder groupingOrder222222222 = aVar.f17605p;
                                                    if (n015) {
                                                    }
                                                    z24 = true;
                                                    if (z24) {
                                                    }
                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z3222222222222 = aVar.f17606q;
                                                    if (n016) {
                                                    }
                                                    z25 = true;
                                                    if (z25) {
                                                    }
                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i112222222222222 = aVar.f17607r;
                                                    if (n017) {
                                                    }
                                                    z26 = true;
                                                    if (z26) {
                                                    }
                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    FilteringType filteringType222222222222222 = aVar.f17608s;
                                                    if (n018) {
                                                    }
                                                    z27 = true;
                                                    if (z27) {
                                                    }
                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    OpenNotesIn openNotesIn22222222222222222 = aVar.f17609t;
                                                    if (!n019) {
                                                    }
                                                    z28 = true;
                                                    if (z28) {
                                                    }
                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                }
                                                z18 = true;
                                                if (z18) {
                                                }
                                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z312 = aVar.f17601k;
                                                if (n010) {
                                                    z19 = false;
                                                    if (z19) {
                                                    }
                                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    NewNoteCursorPosition newNoteCursorPosition22 = aVar.f17602l;
                                                    if (n011) {
                                                    }
                                                    z20 = true;
                                                    if (z20) {
                                                    }
                                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    NoteListSortingType noteListSortingType2222 = aVar.f17603m;
                                                    if (n012) {
                                                    }
                                                    z21 = true;
                                                    if (z21) {
                                                    }
                                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    SortingOrder sortingOrder222222 = aVar.n;
                                                    if (n013) {
                                                    }
                                                    z22 = true;
                                                    if (z22) {
                                                    }
                                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    Grouping grouping22222222 = aVar.f17604o;
                                                    if (n014) {
                                                    }
                                                    z23 = true;
                                                    if (z23) {
                                                    }
                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    GroupingOrder groupingOrder2222222222 = aVar.f17605p;
                                                    if (n015) {
                                                    }
                                                    z24 = true;
                                                    if (z24) {
                                                    }
                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z32222222222222 = aVar.f17606q;
                                                    if (n016) {
                                                    }
                                                    z25 = true;
                                                    if (z25) {
                                                    }
                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i1122222222222222 = aVar.f17607r;
                                                    if (n017) {
                                                    }
                                                    z26 = true;
                                                    if (z26) {
                                                    }
                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    FilteringType filteringType2222222222222222 = aVar.f17608s;
                                                    if (n018) {
                                                    }
                                                    z27 = true;
                                                    if (z27) {
                                                    }
                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    OpenNotesIn openNotesIn222222222222222222 = aVar.f17609t;
                                                    if (!n019) {
                                                    }
                                                    z28 = true;
                                                    if (z28) {
                                                    }
                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                }
                                                z19 = true;
                                                if (z19) {
                                                }
                                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                NewNoteCursorPosition newNoteCursorPosition222 = aVar.f17602l;
                                                if (n011) {
                                                }
                                                z20 = true;
                                                if (z20) {
                                                }
                                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                NoteListSortingType noteListSortingType22222 = aVar.f17603m;
                                                if (n012) {
                                                }
                                                z21 = true;
                                                if (z21) {
                                                }
                                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                SortingOrder sortingOrder2222222 = aVar.n;
                                                if (n013) {
                                                }
                                                z22 = true;
                                                if (z22) {
                                                }
                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                Grouping grouping222222222 = aVar.f17604o;
                                                if (n014) {
                                                }
                                                z23 = true;
                                                if (z23) {
                                                }
                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                GroupingOrder groupingOrder22222222222 = aVar.f17605p;
                                                if (n015) {
                                                }
                                                z24 = true;
                                                if (z24) {
                                                }
                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z322222222222222 = aVar.f17606q;
                                                if (n016) {
                                                }
                                                z25 = true;
                                                if (z25) {
                                                }
                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i11222222222222222 = aVar.f17607r;
                                                if (n017) {
                                                }
                                                z26 = true;
                                                if (z26) {
                                                }
                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                FilteringType filteringType22222222222222222 = aVar.f17608s;
                                                if (n018) {
                                                }
                                                z27 = true;
                                                if (z27) {
                                                }
                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                OpenNotesIn openNotesIn2222222222222222222 = aVar.f17609t;
                                                if (!n019) {
                                                }
                                                z28 = true;
                                                if (z28) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z17 = true;
                                            if (z17) {
                                            }
                                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z302 = aVar.f17600j;
                                            if (n09) {
                                                z18 = false;
                                                if (z18) {
                                                }
                                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z3122 = aVar.f17601k;
                                                if (n010) {
                                                }
                                                z19 = true;
                                                if (z19) {
                                                }
                                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                NewNoteCursorPosition newNoteCursorPosition2222 = aVar.f17602l;
                                                if (n011) {
                                                }
                                                z20 = true;
                                                if (z20) {
                                                }
                                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                NoteListSortingType noteListSortingType222222 = aVar.f17603m;
                                                if (n012) {
                                                }
                                                z21 = true;
                                                if (z21) {
                                                }
                                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                SortingOrder sortingOrder22222222 = aVar.n;
                                                if (n013) {
                                                }
                                                z22 = true;
                                                if (z22) {
                                                }
                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                Grouping grouping2222222222 = aVar.f17604o;
                                                if (n014) {
                                                }
                                                z23 = true;
                                                if (z23) {
                                                }
                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                GroupingOrder groupingOrder222222222222 = aVar.f17605p;
                                                if (n015) {
                                                }
                                                z24 = true;
                                                if (z24) {
                                                }
                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z3222222222222222 = aVar.f17606q;
                                                if (n016) {
                                                }
                                                z25 = true;
                                                if (z25) {
                                                }
                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i112222222222222222 = aVar.f17607r;
                                                if (n017) {
                                                }
                                                z26 = true;
                                                if (z26) {
                                                }
                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                FilteringType filteringType222222222222222222 = aVar.f17608s;
                                                if (n018) {
                                                }
                                                z27 = true;
                                                if (z27) {
                                                }
                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                OpenNotesIn openNotesIn22222222222222222222 = aVar.f17609t;
                                                if (!n019) {
                                                }
                                                z28 = true;
                                                if (z28) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z18 = true;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z31222 = aVar.f17601k;
                                            if (n010) {
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                            NewNoteCursorPosition newNoteCursorPosition22222 = aVar.f17602l;
                                            if (n011) {
                                            }
                                            z20 = true;
                                            if (z20) {
                                            }
                                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                            NoteListSortingType noteListSortingType2222222 = aVar.f17603m;
                                            if (n012) {
                                            }
                                            z21 = true;
                                            if (z21) {
                                            }
                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                            SortingOrder sortingOrder222222222 = aVar.n;
                                            if (n013) {
                                            }
                                            z22 = true;
                                            if (z22) {
                                            }
                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                            Grouping grouping22222222222 = aVar.f17604o;
                                            if (n014) {
                                            }
                                            z23 = true;
                                            if (z23) {
                                            }
                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                            GroupingOrder groupingOrder2222222222222 = aVar.f17605p;
                                            if (n015) {
                                            }
                                            z24 = true;
                                            if (z24) {
                                            }
                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z32222222222222222 = aVar.f17606q;
                                            if (n016) {
                                            }
                                            z25 = true;
                                            if (z25) {
                                            }
                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i1122222222222222222 = aVar.f17607r;
                                            if (n017) {
                                            }
                                            z26 = true;
                                            if (z26) {
                                            }
                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                            FilteringType filteringType2222222222222222222 = aVar.f17608s;
                                            if (n018) {
                                            }
                                            z27 = true;
                                            if (z27) {
                                            }
                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                            OpenNotesIn openNotesIn222222222222222222222 = aVar.f17609t;
                                            if (!n019) {
                                            }
                                            z28 = true;
                                            if (z28) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z16 = true;
                                        if (z16) {
                                        }
                                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z292 = aVar.f17599i;
                                        if (n08) {
                                            z17 = false;
                                            if (z17) {
                                            }
                                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z3022 = aVar.f17600j;
                                            if (n09) {
                                            }
                                            z18 = true;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z312222 = aVar.f17601k;
                                            if (n010) {
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                            NewNoteCursorPosition newNoteCursorPosition222222 = aVar.f17602l;
                                            if (n011) {
                                            }
                                            z20 = true;
                                            if (z20) {
                                            }
                                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                            NoteListSortingType noteListSortingType22222222 = aVar.f17603m;
                                            if (n012) {
                                            }
                                            z21 = true;
                                            if (z21) {
                                            }
                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                            SortingOrder sortingOrder2222222222 = aVar.n;
                                            if (n013) {
                                            }
                                            z22 = true;
                                            if (z22) {
                                            }
                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                            Grouping grouping222222222222 = aVar.f17604o;
                                            if (n014) {
                                            }
                                            z23 = true;
                                            if (z23) {
                                            }
                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                            GroupingOrder groupingOrder22222222222222 = aVar.f17605p;
                                            if (n015) {
                                            }
                                            z24 = true;
                                            if (z24) {
                                            }
                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z322222222222222222 = aVar.f17606q;
                                            if (n016) {
                                            }
                                            z25 = true;
                                            if (z25) {
                                            }
                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i11222222222222222222 = aVar.f17607r;
                                            if (n017) {
                                            }
                                            z26 = true;
                                            if (z26) {
                                            }
                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                            FilteringType filteringType22222222222222222222 = aVar.f17608s;
                                            if (n018) {
                                            }
                                            z27 = true;
                                            if (z27) {
                                            }
                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                            OpenNotesIn openNotesIn2222222222222222222222 = aVar.f17609t;
                                            if (!n019) {
                                            }
                                            z28 = true;
                                            if (z28) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z17 = true;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z30222 = aVar.f17600j;
                                        if (n09) {
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3122222 = aVar.f17601k;
                                        if (n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                        NewNoteCursorPosition newNoteCursorPosition2222222 = aVar.f17602l;
                                        if (n011) {
                                        }
                                        z20 = true;
                                        if (z20) {
                                        }
                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                        NoteListSortingType noteListSortingType222222222 = aVar.f17603m;
                                        if (n012) {
                                        }
                                        z21 = true;
                                        if (z21) {
                                        }
                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                        SortingOrder sortingOrder22222222222 = aVar.n;
                                        if (n013) {
                                        }
                                        z22 = true;
                                        if (z22) {
                                        }
                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                        Grouping grouping2222222222222 = aVar.f17604o;
                                        if (n014) {
                                        }
                                        z23 = true;
                                        if (z23) {
                                        }
                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                        GroupingOrder groupingOrder222222222222222 = aVar.f17605p;
                                        if (n015) {
                                        }
                                        z24 = true;
                                        if (z24) {
                                        }
                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3222222222222222222 = aVar.f17606q;
                                        if (n016) {
                                        }
                                        z25 = true;
                                        if (z25) {
                                        }
                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i112222222222222222222 = aVar.f17607r;
                                        if (n017) {
                                        }
                                        z26 = true;
                                        if (z26) {
                                        }
                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                        FilteringType filteringType222222222222222222222 = aVar.f17608s;
                                        if (n018) {
                                        }
                                        z27 = true;
                                        if (z27) {
                                        }
                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                        OpenNotesIn openNotesIn22222222222222222222222 = aVar.f17609t;
                                        if (!n019) {
                                        }
                                        z28 = true;
                                        if (z28) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z15 = true;
                                    if (z15) {
                                    }
                                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i102 = aVar.f17598h;
                                    if (n07) {
                                        z16 = false;
                                        if (z16) {
                                        }
                                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z2922 = aVar.f17599i;
                                        if (n08) {
                                        }
                                        z17 = true;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z302222 = aVar.f17600j;
                                        if (n09) {
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z31222222 = aVar.f17601k;
                                        if (n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                        NewNoteCursorPosition newNoteCursorPosition22222222 = aVar.f17602l;
                                        if (n011) {
                                        }
                                        z20 = true;
                                        if (z20) {
                                        }
                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                        NoteListSortingType noteListSortingType2222222222 = aVar.f17603m;
                                        if (n012) {
                                        }
                                        z21 = true;
                                        if (z21) {
                                        }
                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                        SortingOrder sortingOrder222222222222 = aVar.n;
                                        if (n013) {
                                        }
                                        z22 = true;
                                        if (z22) {
                                        }
                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                        Grouping grouping22222222222222 = aVar.f17604o;
                                        if (n014) {
                                        }
                                        z23 = true;
                                        if (z23) {
                                        }
                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                        GroupingOrder groupingOrder2222222222222222 = aVar.f17605p;
                                        if (n015) {
                                        }
                                        z24 = true;
                                        if (z24) {
                                        }
                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z32222222222222222222 = aVar.f17606q;
                                        if (n016) {
                                        }
                                        z25 = true;
                                        if (z25) {
                                        }
                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i1122222222222222222222 = aVar.f17607r;
                                        if (n017) {
                                        }
                                        z26 = true;
                                        if (z26) {
                                        }
                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                        FilteringType filteringType2222222222222222222222 = aVar.f17608s;
                                        if (n018) {
                                        }
                                        z27 = true;
                                        if (z27) {
                                        }
                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                        OpenNotesIn openNotesIn222222222222222222222222 = aVar.f17609t;
                                        if (!n019) {
                                        }
                                        z28 = true;
                                        if (z28) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z16 = true;
                                    if (z16) {
                                    }
                                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z29222 = aVar.f17599i;
                                    if (n08) {
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z3022222 = aVar.f17600j;
                                    if (n09) {
                                    }
                                    z18 = true;
                                    if (z18) {
                                    }
                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z312222222 = aVar.f17601k;
                                    if (n010) {
                                    }
                                    z19 = true;
                                    if (z19) {
                                    }
                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                    NewNoteCursorPosition newNoteCursorPosition222222222 = aVar.f17602l;
                                    if (n011) {
                                    }
                                    z20 = true;
                                    if (z20) {
                                    }
                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                    NoteListSortingType noteListSortingType22222222222 = aVar.f17603m;
                                    if (n012) {
                                    }
                                    z21 = true;
                                    if (z21) {
                                    }
                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                    SortingOrder sortingOrder2222222222222 = aVar.n;
                                    if (n013) {
                                    }
                                    z22 = true;
                                    if (z22) {
                                    }
                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                    Grouping grouping222222222222222 = aVar.f17604o;
                                    if (n014) {
                                    }
                                    z23 = true;
                                    if (z23) {
                                    }
                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                    GroupingOrder groupingOrder22222222222222222 = aVar.f17605p;
                                    if (n015) {
                                    }
                                    z24 = true;
                                    if (z24) {
                                    }
                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z322222222222222222222 = aVar.f17606q;
                                    if (n016) {
                                    }
                                    z25 = true;
                                    if (z25) {
                                    }
                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i11222222222222222222222 = aVar.f17607r;
                                    if (n017) {
                                    }
                                    z26 = true;
                                    if (z26) {
                                    }
                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                    FilteringType filteringType22222222222222222222222 = aVar.f17608s;
                                    if (n018) {
                                    }
                                    z27 = true;
                                    if (z27) {
                                    }
                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                    OpenNotesIn openNotesIn2222222222222222222222222 = aVar.f17609t;
                                    if (!n019) {
                                    }
                                    z28 = true;
                                    if (z28) {
                                    }
                                    b5.a(pluginGeneratedSerialDescriptor);
                                }
                            }
                            z14 = true;
                            if (z14) {
                            }
                            n06 = b5.n0(pluginGeneratedSerialDescriptor);
                            Layout layout2 = aVar.f17597g;
                            if (n06) {
                                z15 = false;
                                if (z15) {
                                }
                                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i1022 = aVar.f17598h;
                                if (n07) {
                                }
                                z16 = true;
                                if (z16) {
                                }
                                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z292222 = aVar.f17599i;
                                if (n08) {
                                }
                                z17 = true;
                                if (z17) {
                                }
                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z30222222 = aVar.f17600j;
                                if (n09) {
                                }
                                z18 = true;
                                if (z18) {
                                }
                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z3122222222 = aVar.f17601k;
                                if (n010) {
                                }
                                z19 = true;
                                if (z19) {
                                }
                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                NewNoteCursorPosition newNoteCursorPosition2222222222 = aVar.f17602l;
                                if (n011) {
                                }
                                z20 = true;
                                if (z20) {
                                }
                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                NoteListSortingType noteListSortingType222222222222 = aVar.f17603m;
                                if (n012) {
                                }
                                z21 = true;
                                if (z21) {
                                }
                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                SortingOrder sortingOrder22222222222222 = aVar.n;
                                if (n013) {
                                }
                                z22 = true;
                                if (z22) {
                                }
                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                Grouping grouping2222222222222222 = aVar.f17604o;
                                if (n014) {
                                }
                                z23 = true;
                                if (z23) {
                                }
                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                GroupingOrder groupingOrder222222222222222222 = aVar.f17605p;
                                if (n015) {
                                }
                                z24 = true;
                                if (z24) {
                                }
                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z3222222222222222222222 = aVar.f17606q;
                                if (n016) {
                                }
                                z25 = true;
                                if (z25) {
                                }
                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i112222222222222222222222 = aVar.f17607r;
                                if (n017) {
                                }
                                z26 = true;
                                if (z26) {
                                }
                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                FilteringType filteringType222222222222222222222222 = aVar.f17608s;
                                if (n018) {
                                }
                                z27 = true;
                                if (z27) {
                                }
                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                OpenNotesIn openNotesIn22222222222222222222222222 = aVar.f17609t;
                                if (!n019) {
                                }
                                z28 = true;
                                if (z28) {
                                }
                                b5.a(pluginGeneratedSerialDescriptor);
                            }
                            z15 = true;
                            if (z15) {
                            }
                            n07 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i10222 = aVar.f17598h;
                            if (n07) {
                            }
                            z16 = true;
                            if (z16) {
                            }
                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z2922222 = aVar.f17599i;
                            if (n08) {
                            }
                            z17 = true;
                            if (z17) {
                            }
                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z302222222 = aVar.f17600j;
                            if (n09) {
                            }
                            z18 = true;
                            if (z18) {
                            }
                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z31222222222 = aVar.f17601k;
                            if (n010) {
                            }
                            z19 = true;
                            if (z19) {
                            }
                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                            NewNoteCursorPosition newNoteCursorPosition22222222222 = aVar.f17602l;
                            if (n011) {
                            }
                            z20 = true;
                            if (z20) {
                            }
                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                            NoteListSortingType noteListSortingType2222222222222 = aVar.f17603m;
                            if (n012) {
                            }
                            z21 = true;
                            if (z21) {
                            }
                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                            SortingOrder sortingOrder222222222222222 = aVar.n;
                            if (n013) {
                            }
                            z22 = true;
                            if (z22) {
                            }
                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                            Grouping grouping22222222222222222 = aVar.f17604o;
                            if (n014) {
                            }
                            z23 = true;
                            if (z23) {
                            }
                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                            GroupingOrder groupingOrder2222222222222222222 = aVar.f17605p;
                            if (n015) {
                            }
                            z24 = true;
                            if (z24) {
                            }
                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z32222222222222222222222 = aVar.f17606q;
                            if (n016) {
                            }
                            z25 = true;
                            if (z25) {
                            }
                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i1122222222222222222222222 = aVar.f17607r;
                            if (n017) {
                            }
                            z26 = true;
                            if (z26) {
                            }
                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                            FilteringType filteringType2222222222222222222222222 = aVar.f17608s;
                            if (n018) {
                            }
                            z27 = true;
                            if (z27) {
                            }
                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                            OpenNotesIn openNotesIn222222222222222222222222222 = aVar.f17609t;
                            if (!n019) {
                            }
                            z28 = true;
                            if (z28) {
                            }
                            b5.a(pluginGeneratedSerialDescriptor);
                        }
                        z13 = true;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        na.c cVar2 = aVar.f17596f;
                        if (n05) {
                        }
                        z14 = true;
                        if (z14) {
                        }
                        n06 = b5.n0(pluginGeneratedSerialDescriptor);
                        Layout layout22 = aVar.f17597g;
                        if (n06) {
                        }
                        z15 = true;
                        if (z15) {
                        }
                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i102222 = aVar.f17598h;
                        if (n07) {
                        }
                        z16 = true;
                        if (z16) {
                        }
                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z29222222 = aVar.f17599i;
                        if (n08) {
                        }
                        z17 = true;
                        if (z17) {
                        }
                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3022222222 = aVar.f17600j;
                        if (n09) {
                        }
                        z18 = true;
                        if (z18) {
                        }
                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z312222222222 = aVar.f17601k;
                        if (n010) {
                        }
                        z19 = true;
                        if (z19) {
                        }
                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                        NewNoteCursorPosition newNoteCursorPosition222222222222 = aVar.f17602l;
                        if (n011) {
                        }
                        z20 = true;
                        if (z20) {
                        }
                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                        NoteListSortingType noteListSortingType22222222222222 = aVar.f17603m;
                        if (n012) {
                        }
                        z21 = true;
                        if (z21) {
                        }
                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                        SortingOrder sortingOrder2222222222222222 = aVar.n;
                        if (n013) {
                        }
                        z22 = true;
                        if (z22) {
                        }
                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                        Grouping grouping222222222222222222 = aVar.f17604o;
                        if (n014) {
                        }
                        z23 = true;
                        if (z23) {
                        }
                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                        GroupingOrder groupingOrder22222222222222222222 = aVar.f17605p;
                        if (n015) {
                        }
                        z24 = true;
                        if (z24) {
                        }
                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z322222222222222222222222 = aVar.f17606q;
                        if (n016) {
                        }
                        z25 = true;
                        if (z25) {
                        }
                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i11222222222222222222222222 = aVar.f17607r;
                        if (n017) {
                        }
                        z26 = true;
                        if (z26) {
                        }
                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                        FilteringType filteringType22222222222222222222222222 = aVar.f17608s;
                        if (n018) {
                        }
                        z27 = true;
                        if (z27) {
                        }
                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                        OpenNotesIn openNotesIn2222222222222222222222222222 = aVar.f17609t;
                        if (!n019) {
                        }
                        z28 = true;
                        if (z28) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z12 = true;
                    if (z12) {
                    }
                    b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    NotoColor notoColor2 = aVar.f17595e;
                    if (!n04) {
                        z13 = false;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        na.c cVar22 = aVar.f17596f;
                        if (n05) {
                        }
                        z14 = true;
                        if (z14) {
                        }
                        n06 = b5.n0(pluginGeneratedSerialDescriptor);
                        Layout layout222 = aVar.f17597g;
                        if (n06) {
                        }
                        z15 = true;
                        if (z15) {
                        }
                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i1022222 = aVar.f17598h;
                        if (n07) {
                        }
                        z16 = true;
                        if (z16) {
                        }
                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z292222222 = aVar.f17599i;
                        if (n08) {
                        }
                        z17 = true;
                        if (z17) {
                        }
                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z30222222222 = aVar.f17600j;
                        if (n09) {
                        }
                        z18 = true;
                        if (z18) {
                        }
                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3122222222222 = aVar.f17601k;
                        if (n010) {
                        }
                        z19 = true;
                        if (z19) {
                        }
                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                        NewNoteCursorPosition newNoteCursorPosition2222222222222 = aVar.f17602l;
                        if (n011) {
                        }
                        z20 = true;
                        if (z20) {
                        }
                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                        NoteListSortingType noteListSortingType222222222222222 = aVar.f17603m;
                        if (n012) {
                        }
                        z21 = true;
                        if (z21) {
                        }
                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                        SortingOrder sortingOrder22222222222222222 = aVar.n;
                        if (n013) {
                        }
                        z22 = true;
                        if (z22) {
                        }
                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                        Grouping grouping2222222222222222222 = aVar.f17604o;
                        if (n014) {
                        }
                        z23 = true;
                        if (z23) {
                        }
                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                        GroupingOrder groupingOrder222222222222222222222 = aVar.f17605p;
                        if (n015) {
                        }
                        z24 = true;
                        if (z24) {
                        }
                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3222222222222222222222222 = aVar.f17606q;
                        if (n016) {
                        }
                        z25 = true;
                        if (z25) {
                        }
                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i112222222222222222222222222 = aVar.f17607r;
                        if (n017) {
                        }
                        z26 = true;
                        if (z26) {
                        }
                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                        FilteringType filteringType222222222222222222222222222 = aVar.f17608s;
                        if (n018) {
                        }
                        z27 = true;
                        if (z27) {
                        }
                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                        OpenNotesIn openNotesIn22222222222222222222222222222 = aVar.f17609t;
                        if (!n019) {
                        }
                        z28 = true;
                        if (z28) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar222 = aVar.f17596f;
                    if (n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    Layout layout2222 = aVar.f17597g;
                    if (n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i10222222 = aVar.f17598h;
                    if (n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z2922222222 = aVar.f17599i;
                    if (n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z302222222222 = aVar.f17600j;
                    if (n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z31222222222222 = aVar.f17601k;
                    if (n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                    NewNoteCursorPosition newNoteCursorPosition22222222222222 = aVar.f17602l;
                    if (n011) {
                    }
                    z20 = true;
                    if (z20) {
                    }
                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                    NoteListSortingType noteListSortingType2222222222222222 = aVar.f17603m;
                    if (n012) {
                    }
                    z21 = true;
                    if (z21) {
                    }
                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                    SortingOrder sortingOrder222222222222222222 = aVar.n;
                    if (n013) {
                    }
                    z22 = true;
                    if (z22) {
                    }
                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                    Grouping grouping22222222222222222222 = aVar.f17604o;
                    if (n014) {
                    }
                    z23 = true;
                    if (z23) {
                    }
                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                    GroupingOrder groupingOrder2222222222222222222222 = aVar.f17605p;
                    if (n015) {
                    }
                    z24 = true;
                    if (z24) {
                    }
                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z32222222222222222222222222 = aVar.f17606q;
                    if (n016) {
                    }
                    z25 = true;
                    if (z25) {
                    }
                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i1122222222222222222222222222 = aVar.f17607r;
                    if (n017) {
                    }
                    z26 = true;
                    if (z26) {
                    }
                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                    FilteringType filteringType2222222222222222222222222222 = aVar.f17608s;
                    if (n018) {
                    }
                    z27 = true;
                    if (z27) {
                    }
                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                    OpenNotesIn openNotesIn222222222222222222222222222222 = aVar.f17609t;
                    if (!n019) {
                    }
                    z28 = true;
                    if (z28) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z11 = true;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                String str2 = aVar.c;
                if (!n03) {
                    z12 = false;
                    if (z12) {
                    }
                    b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    NotoColor notoColor22 = aVar.f17595e;
                    if (!n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar2222 = aVar.f17596f;
                    if (n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    Layout layout22222 = aVar.f17597g;
                    if (n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i102222222 = aVar.f17598h;
                    if (n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z29222222222 = aVar.f17599i;
                    if (n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z3022222222222 = aVar.f17600j;
                    if (n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z312222222222222 = aVar.f17601k;
                    if (n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                    NewNoteCursorPosition newNoteCursorPosition222222222222222 = aVar.f17602l;
                    if (n011) {
                    }
                    z20 = true;
                    if (z20) {
                    }
                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                    NoteListSortingType noteListSortingType22222222222222222 = aVar.f17603m;
                    if (n012) {
                    }
                    z21 = true;
                    if (z21) {
                    }
                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                    SortingOrder sortingOrder2222222222222222222 = aVar.n;
                    if (n013) {
                    }
                    z22 = true;
                    if (z22) {
                    }
                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                    Grouping grouping222222222222222222222 = aVar.f17604o;
                    if (n014) {
                    }
                    z23 = true;
                    if (z23) {
                    }
                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                    GroupingOrder groupingOrder22222222222222222222222 = aVar.f17605p;
                    if (n015) {
                    }
                    z24 = true;
                    if (z24) {
                    }
                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z322222222222222222222222222 = aVar.f17606q;
                    if (n016) {
                    }
                    z25 = true;
                    if (z25) {
                    }
                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i11222222222222222222222222222 = aVar.f17607r;
                    if (n017) {
                    }
                    z26 = true;
                    if (z26) {
                    }
                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                    FilteringType filteringType22222222222222222222222222222 = aVar.f17608s;
                    if (n018) {
                    }
                    z27 = true;
                    if (z27) {
                    }
                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                    OpenNotesIn openNotesIn2222222222222222222222222222222 = aVar.f17609t;
                    if (!n019) {
                    }
                    z28 = true;
                    if (z28) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z12 = true;
                if (z12) {
                }
                b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                NotoColor notoColor222 = aVar.f17595e;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar22222 = aVar.f17596f;
                if (n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                Layout layout222222 = aVar.f17597g;
                if (n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1022222222 = aVar.f17598h;
                if (n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z292222222222 = aVar.f17599i;
                if (n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z30222222222222 = aVar.f17600j;
                if (n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3122222222222222 = aVar.f17601k;
                if (n010) {
                }
                z19 = true;
                if (z19) {
                }
                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                NewNoteCursorPosition newNoteCursorPosition2222222222222222 = aVar.f17602l;
                if (n011) {
                }
                z20 = true;
                if (z20) {
                }
                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                NoteListSortingType noteListSortingType222222222222222222 = aVar.f17603m;
                if (n012) {
                }
                z21 = true;
                if (z21) {
                }
                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                SortingOrder sortingOrder22222222222222222222 = aVar.n;
                if (n013) {
                }
                z22 = true;
                if (z22) {
                }
                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                Grouping grouping2222222222222222222222 = aVar.f17604o;
                if (n014) {
                }
                z23 = true;
                if (z23) {
                }
                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                GroupingOrder groupingOrder222222222222222222222222 = aVar.f17605p;
                if (n015) {
                }
                z24 = true;
                if (z24) {
                }
                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3222222222222222222222222222 = aVar.f17606q;
                if (n016) {
                }
                z25 = true;
                if (z25) {
                }
                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                int i112222222222222222222222222222 = aVar.f17607r;
                if (n017) {
                }
                z26 = true;
                if (z26) {
                }
                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                FilteringType filteringType222222222222222222222222222222 = aVar.f17608s;
                if (n018) {
                }
                z27 = true;
                if (z27) {
                }
                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                OpenNotesIn openNotesIn22222222222222222222222222222222 = aVar.f17609t;
                if (!n019) {
                }
                z28 = true;
                if (z28) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            n02 = b5.n0(pluginGeneratedSerialDescriptor);
            Comparable comparable2 = aVar.f17593b;
            if (!n02) {
                z11 = false;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                String str22 = aVar.c;
                if (!n03) {
                }
                z12 = true;
                if (z12) {
                }
                b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                NotoColor notoColor2222 = aVar.f17595e;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar222222 = aVar.f17596f;
                if (n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                Layout layout2222222 = aVar.f17597g;
                if (n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                int i10222222222 = aVar.f17598h;
                if (n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z2922222222222 = aVar.f17599i;
                if (n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z302222222222222 = aVar.f17600j;
                if (n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z31222222222222222 = aVar.f17601k;
                if (n010) {
                }
                z19 = true;
                if (z19) {
                }
                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                NewNoteCursorPosition newNoteCursorPosition22222222222222222 = aVar.f17602l;
                if (n011) {
                }
                z20 = true;
                if (z20) {
                }
                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                NoteListSortingType noteListSortingType2222222222222222222 = aVar.f17603m;
                if (n012) {
                }
                z21 = true;
                if (z21) {
                }
                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                SortingOrder sortingOrder222222222222222222222 = aVar.n;
                if (n013) {
                }
                z22 = true;
                if (z22) {
                }
                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                Grouping grouping22222222222222222222222 = aVar.f17604o;
                if (n014) {
                }
                z23 = true;
                if (z23) {
                }
                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                GroupingOrder groupingOrder2222222222222222222222222 = aVar.f17605p;
                if (n015) {
                }
                z24 = true;
                if (z24) {
                }
                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z32222222222222222222222222222 = aVar.f17606q;
                if (n016) {
                }
                z25 = true;
                if (z25) {
                }
                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1122222222222222222222222222222 = aVar.f17607r;
                if (n017) {
                }
                z26 = true;
                if (z26) {
                }
                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                FilteringType filteringType2222222222222222222222222222222 = aVar.f17608s;
                if (n018) {
                }
                z27 = true;
                if (z27) {
                }
                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                OpenNotesIn openNotesIn222222222222222222222222222222222 = aVar.f17609t;
                if (!n019) {
                }
                z28 = true;
                if (z28) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z11 = true;
            if (z11) {
            }
            n03 = b5.n0(pluginGeneratedSerialDescriptor);
            String str222 = aVar.c;
            if (!n03) {
            }
            z12 = true;
            if (z12) {
            }
            b5.r(3, aVar.f17594d, pluginGeneratedSerialDescriptor);
            n04 = b5.n0(pluginGeneratedSerialDescriptor);
            NotoColor notoColor22222 = aVar.f17595e;
            if (!n04) {
            }
            z13 = true;
            if (z13) {
            }
            n05 = b5.n0(pluginGeneratedSerialDescriptor);
            na.c cVar2222222 = aVar.f17596f;
            if (n05) {
            }
            z14 = true;
            if (z14) {
            }
            n06 = b5.n0(pluginGeneratedSerialDescriptor);
            Layout layout22222222 = aVar.f17597g;
            if (n06) {
            }
            z15 = true;
            if (z15) {
            }
            n07 = b5.n0(pluginGeneratedSerialDescriptor);
            int i102222222222 = aVar.f17598h;
            if (n07) {
            }
            z16 = true;
            if (z16) {
            }
            n08 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z29222222222222 = aVar.f17599i;
            if (n08) {
            }
            z17 = true;
            if (z17) {
            }
            n09 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z3022222222222222 = aVar.f17600j;
            if (n09) {
            }
            z18 = true;
            if (z18) {
            }
            n010 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z312222222222222222 = aVar.f17601k;
            if (n010) {
            }
            z19 = true;
            if (z19) {
            }
            n011 = b5.n0(pluginGeneratedSerialDescriptor);
            NewNoteCursorPosition newNoteCursorPosition222222222222222222 = aVar.f17602l;
            if (n011) {
            }
            z20 = true;
            if (z20) {
            }
            n012 = b5.n0(pluginGeneratedSerialDescriptor);
            NoteListSortingType noteListSortingType22222222222222222222 = aVar.f17603m;
            if (n012) {
            }
            z21 = true;
            if (z21) {
            }
            n013 = b5.n0(pluginGeneratedSerialDescriptor);
            SortingOrder sortingOrder2222222222222222222222 = aVar.n;
            if (n013) {
            }
            z22 = true;
            if (z22) {
            }
            n014 = b5.n0(pluginGeneratedSerialDescriptor);
            Grouping grouping222222222222222222222222 = aVar.f17604o;
            if (n014) {
            }
            z23 = true;
            if (z23) {
            }
            n015 = b5.n0(pluginGeneratedSerialDescriptor);
            GroupingOrder groupingOrder22222222222222222222222222 = aVar.f17605p;
            if (n015) {
            }
            z24 = true;
            if (z24) {
            }
            n016 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z322222222222222222222222222222 = aVar.f17606q;
            if (n016) {
            }
            z25 = true;
            if (z25) {
            }
            n017 = b5.n0(pluginGeneratedSerialDescriptor);
            int i11222222222222222222222222222222 = aVar.f17607r;
            if (n017) {
            }
            z26 = true;
            if (z26) {
            }
            n018 = b5.n0(pluginGeneratedSerialDescriptor);
            FilteringType filteringType22222222222222222222222222222222 = aVar.f17608s;
            if (n018) {
            }
            z27 = true;
            if (z27) {
            }
            n019 = b5.n0(pluginGeneratedSerialDescriptor);
            OpenNotesIn openNotesIn2222222222222222222222222222222222 = aVar.f17609t;
            if (!n019) {
            }
            z28 = true;
            if (z28) {
            }
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17612b;
        }

        @Override // qa.e
        public final /* bridge */ /* synthetic */ void b(ta.d dVar, Object obj) {
            g(dVar, (a) obj);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            x0 x0Var = x0.f18029a;
            n0 n0Var = n0.f17993a;
            ua.h hVar = ua.h.f17975a;
            return new qa.b[]{x0Var, ra.a.a(x0Var), s1.f18010a, n0Var, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), pa.d.f16791a, a1.b.I("com.noto.app.domain.model.Layout", Layout.values()), n0Var, hVar, hVar, hVar, a1.b.I("com.noto.app.domain.model.NewNoteCursorPosition", NewNoteCursorPosition.values()), a1.b.I("com.noto.app.domain.model.NoteListSortingType", NoteListSortingType.values()), a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), a1.b.I("com.noto.app.domain.model.Grouping", Grouping.values()), a1.b.I("com.noto.app.domain.model.GroupingOrder", GroupingOrder.values()), hVar, n0Var, a1.b.I("com.noto.app.domain.model.FilteringType", FilteringType.values()), a1.b.I("com.noto.app.domain.model.OpenNotesIn", OpenNotesIn.values())};
        }

        @Override // ua.f0
        public final void d() {
        }

        @Override // qa.a
        public final /* bridge */ /* synthetic */ Object e(ta.c cVar) {
            return f(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<a> serializer() {
            return C0226a.f17611a;
        }
    }

    public a(int i10, long j2, Long l2, String str, int i11, NotoColor notoColor, na.c cVar, Layout layout, int i12, boolean z10, boolean z11, boolean z12, NewNoteCursorPosition newNoteCursorPosition, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, Grouping grouping, GroupingOrder groupingOrder, boolean z13, int i13, FilteringType filteringType, OpenNotesIn openNotesIn) {
        na.c cVar2;
        if (8 == (i10 & 8)) {
            this.f17592a = (i10 & 1) == 0 ? 0L : j2;
            if ((i10 & 2) == 0) {
                this.f17593b = null;
            } else {
                this.f17593b = l2;
            }
            this.c = (i10 & 4) == 0 ? "" : str;
            this.f17594d = i11;
            this.f17595e = (i10 & 16) == 0 ? NotoColor.Gray : notoColor;
            if ((i10 & 32) == 0) {
                na.c.Companion.getClass();
                Instant instant = Clock.systemUTC().instant();
                v7.g.e(instant, "systemUTC().instant()");
                cVar2 = new na.c(instant);
            } else {
                cVar2 = cVar;
            }
            this.f17596f = cVar2;
            this.f17597g = (i10 & 64) == 0 ? Layout.Linear : layout;
            this.f17598h = (i10 & 128) == 0 ? 15 : i12;
            if ((i10 & 256) == 0) {
                this.f17599i = false;
            } else {
                this.f17599i = z10;
            }
            if ((i10 & 512) == 0) {
                this.f17600j = false;
            } else {
                this.f17600j = z11;
            }
            if ((i10 & 1024) == 0) {
                this.f17601k = false;
            } else {
                this.f17601k = z12;
            }
            this.f17602l = (i10 & 2048) == 0 ? NewNoteCursorPosition.Body : newNoteCursorPosition;
            this.f17603m = (i10 & 4096) == 0 ? NoteListSortingType.CreationDate : noteListSortingType;
            this.n = (i10 & 8192) == 0 ? SortingOrder.Descending : sortingOrder;
            this.f17604o = (i10 & 16384) == 0 ? Grouping.None : grouping;
            this.f17605p = (32768 & i10) == 0 ? GroupingOrder.Descending : groupingOrder;
            if ((65536 & i10) == 0) {
                this.f17606q = false;
            } else {
                this.f17606q = z13;
            }
            if ((131072 & i10) == 0) {
                this.f17607r = 0;
            } else {
                this.f17607r = i13;
            }
            this.f17608s = (262144 & i10) == 0 ? FilteringType.Inclusive : filteringType;
            this.f17609t = (i10 & 524288) == 0 ? OpenNotesIn.Editor : openNotesIn;
            this.f17610u = EmptyList.f12981i;
            return;
        }
        a1.b.F0(i10, 8, C0226a.f17612b);
        throw null;
    }

    public a(long j2, Long l2, String str, int i10, NotoColor notoColor, na.c cVar, Layout layout, int i11, boolean z10, boolean z11, boolean z12, NewNoteCursorPosition newNoteCursorPosition, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, Grouping grouping, GroupingOrder groupingOrder, boolean z13, int i12, FilteringType filteringType, OpenNotesIn openNotesIn, List<Pair<a, Integer>> list) {
        v7.g.f(str, "title");
        v7.g.f(notoColor, "color");
        v7.g.f(cVar, "creationDate");
        v7.g.f(layout, "layout");
        v7.g.f(newNoteCursorPosition, "newNoteCursorPosition");
        v7.g.f(noteListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        v7.g.f(grouping, "grouping");
        v7.g.f(groupingOrder, "groupingOrder");
        v7.g.f(filteringType, "filteringType");
        v7.g.f(openNotesIn, "openNotesIn");
        v7.g.f(list, "folders");
        this.f17592a = j2;
        this.f17593b = l2;
        this.c = str;
        this.f17594d = i10;
        this.f17595e = notoColor;
        this.f17596f = cVar;
        this.f17597g = layout;
        this.f17598h = i11;
        this.f17599i = z10;
        this.f17600j = z11;
        this.f17601k = z12;
        this.f17602l = newNoteCursorPosition;
        this.f17603m = noteListSortingType;
        this.n = sortingOrder;
        this.f17604o = grouping;
        this.f17605p = groupingOrder;
        this.f17606q = z13;
        this.f17607r = i12;
        this.f17608s = filteringType;
        this.f17609t = openNotesIn;
        this.f17610u = list;
    }

    public static a a(a aVar, Long l2, String str, int i10, NotoColor notoColor, Layout layout, int i11, boolean z10, boolean z11, boolean z12, NewNoteCursorPosition newNoteCursorPosition, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, Grouping grouping, GroupingOrder groupingOrder, boolean z13, int i12, FilteringType filteringType, OpenNotesIn openNotesIn, List list, int i13) {
        int i14;
        OpenNotesIn openNotesIn2;
        long j2 = (i13 & 1) != 0 ? aVar.f17592a : 0L;
        Long l4 = (i13 & 2) != 0 ? aVar.f17593b : l2;
        String str2 = (i13 & 4) != 0 ? aVar.c : str;
        int i15 = (i13 & 8) != 0 ? aVar.f17594d : i10;
        NotoColor notoColor2 = (i13 & 16) != 0 ? aVar.f17595e : notoColor;
        na.c cVar = (i13 & 32) != 0 ? aVar.f17596f : null;
        Layout layout2 = (i13 & 64) != 0 ? aVar.f17597g : layout;
        int i16 = (i13 & 128) != 0 ? aVar.f17598h : i11;
        boolean z14 = (i13 & 256) != 0 ? aVar.f17599i : z10;
        boolean z15 = (i13 & 512) != 0 ? aVar.f17600j : z11;
        boolean z16 = (i13 & 1024) != 0 ? aVar.f17601k : z12;
        NewNoteCursorPosition newNoteCursorPosition2 = (i13 & 2048) != 0 ? aVar.f17602l : newNoteCursorPosition;
        NoteListSortingType noteListSortingType2 = (i13 & 4096) != 0 ? aVar.f17603m : noteListSortingType;
        SortingOrder sortingOrder2 = (i13 & 8192) != 0 ? aVar.n : sortingOrder;
        boolean z17 = z15;
        Grouping grouping2 = (i13 & 16384) != 0 ? aVar.f17604o : grouping;
        boolean z18 = z14;
        GroupingOrder groupingOrder2 = (i13 & 32768) != 0 ? aVar.f17605p : groupingOrder;
        int i17 = i16;
        boolean z19 = (i13 & 65536) != 0 ? aVar.f17606q : z13;
        int i18 = (131072 & i13) != 0 ? aVar.f17607r : i12;
        FilteringType filteringType2 = (262144 & i13) != 0 ? aVar.f17608s : filteringType;
        if ((i13 & 524288) != 0) {
            i14 = i15;
            openNotesIn2 = aVar.f17609t;
        } else {
            i14 = i15;
            openNotesIn2 = openNotesIn;
        }
        List list2 = (i13 & 1048576) != 0 ? aVar.f17610u : list;
        aVar.getClass();
        v7.g.f(str2, "title");
        v7.g.f(notoColor2, "color");
        v7.g.f(cVar, "creationDate");
        v7.g.f(layout2, "layout");
        v7.g.f(newNoteCursorPosition2, "newNoteCursorPosition");
        v7.g.f(noteListSortingType2, "sortingType");
        v7.g.f(sortingOrder2, "sortingOrder");
        v7.g.f(grouping2, "grouping");
        v7.g.f(groupingOrder2, "groupingOrder");
        v7.g.f(filteringType2, "filteringType");
        v7.g.f(openNotesIn2, "openNotesIn");
        v7.g.f(list2, "folders");
        return new a(j2, l4, str2, i14, notoColor2, cVar, layout2, i17, z18, z17, z16, newNoteCursorPosition2, noteListSortingType2, sortingOrder2, grouping2, groupingOrder2, z19, i18, filteringType2, openNotesIn2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f17592a == aVar.f17592a && v7.g.a(this.f17593b, aVar.f17593b) && v7.g.a(this.c, aVar.c) && this.f17594d == aVar.f17594d && this.f17595e == aVar.f17595e && v7.g.a(this.f17596f, aVar.f17596f) && this.f17597g == aVar.f17597g && this.f17598h == aVar.f17598h && this.f17599i == aVar.f17599i && this.f17600j == aVar.f17600j && this.f17601k == aVar.f17601k && this.f17602l == aVar.f17602l && this.f17603m == aVar.f17603m && this.n == aVar.n && this.f17604o == aVar.f17604o && this.f17605p == aVar.f17605p && this.f17606q == aVar.f17606q && this.f17607r == aVar.f17607r && this.f17608s == aVar.f17608s && this.f17609t == aVar.f17609t && v7.g.a(this.f17610u, aVar.f17610u);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        long j2 = this.f17592a;
        int i10 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        Long l2 = this.f17593b;
        if (l2 == null) {
            hashCode = 0;
        } else {
            hashCode = l2.hashCode();
        }
        String str = this.c;
        int hashCode2 = this.f17595e.hashCode();
        int hashCode3 = this.f17596f.hashCode();
        int hashCode4 = (((this.f17597g.hashCode() + ((hashCode3 + ((hashCode2 + ((a4.b.g(str, (i10 + hashCode) * 31, 31) + this.f17594d) * 31)) * 31)) * 31)) * 31) + this.f17598h) * 31;
        int i11 = 1;
        boolean z10 = this.f17599i;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode4 + i12) * 31;
        boolean z11 = this.f17600j;
        int i14 = z11;
        if (z11 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z12 = this.f17601k;
        int i16 = z12;
        if (z12 != 0) {
            i16 = 1;
        }
        int hashCode5 = this.f17602l.hashCode();
        int hashCode6 = this.f17603m.hashCode();
        int hashCode7 = this.n.hashCode();
        int hashCode8 = this.f17604o.hashCode();
        int hashCode9 = (this.f17605p.hashCode() + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((i15 + i16) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z13 = this.f17606q;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        int hashCode10 = this.f17608s.hashCode();
        int hashCode11 = this.f17609t.hashCode();
        return this.f17610u.hashCode() + ((hashCode11 + ((hashCode10 + ((((hashCode9 + i11) * 31) + this.f17607r) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Folder(id=" + this.f17592a + ", parentId=" + this.f17593b + ", title=" + this.c + ", position=" + this.f17594d + ", color=" + this.f17595e + ", creationDate=" + this.f17596f + ", layout=" + this.f17597g + ", notePreviewSize=" + this.f17598h + ", isArchived=" + this.f17599i + ", isPinned=" + this.f17600j + ", isShowNoteCreationDate=" + this.f17601k + ", newNoteCursorPosition=" + this.f17602l + ", sortingType=" + this.f17603m + ", sortingOrder=" + this.n + ", grouping=" + this.f17604o + ", groupingOrder=" + this.f17605p + ", isVaulted=" + this.f17606q + ", scrollingPosition=" + this.f17607r + ", filteringType=" + this.f17608s + ", openNotesIn=" + this.f17609t + ", folders=" + this.f17610u + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(long j2, NotoColor notoColor, int i10) {
        this(r1, (Long) null, r4, 0, r7, r8, (i10 & 64) != 0 ? Layout.Linear : null, (i10 & 128) != 0 ? 15 : 0, false, false, false, (i10 & 2048) != 0 ? NewNoteCursorPosition.Body : null, (i10 & 4096) != 0 ? NoteListSortingType.CreationDate : null, (i10 & 8192) != 0 ? SortingOrder.Descending : null, (i10 & 16384) != 0 ? Grouping.None : null, (32768 & i10) != 0 ? GroupingOrder.Descending : null, false, 0, (262144 & i10) != 0 ? FilteringType.Inclusive : null, (524288 & i10) != 0 ? OpenNotesIn.Editor : null, (List<Pair<a, Integer>>) ((i10 & 1048576) != 0 ? EmptyList.f12981i : null));
        na.c cVar;
        long j10 = (i10 & 1) != 0 ? 0L : j2;
        String str = (i10 & 4) != 0 ? "" : null;
        NotoColor notoColor2 = (i10 & 16) != 0 ? NotoColor.Gray : notoColor;
        if ((i10 & 32) != 0) {
            na.c.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            v7.g.e(instant, "systemUTC().instant()");
            cVar = new na.c(instant);
        } else {
            cVar = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(long j2, Long l2, String str, int i10, NotoColor notoColor, na.c cVar, Layout layout, int i11, boolean z10, boolean z11, boolean z12, NewNoteCursorPosition newNoteCursorPosition, NoteListSortingType noteListSortingType, SortingOrder sortingOrder, Grouping grouping, GroupingOrder groupingOrder, boolean z13, FilteringType filteringType, int i12, OpenNotesIn openNotesIn) {
        this(j2, l2, str, i10, notoColor, cVar, layout, i11, z10, z11, z12, newNoteCursorPosition, noteListSortingType, sortingOrder, grouping, groupingOrder, z13, i12, filteringType, openNotesIn, EmptyList.f12981i);
        v7.g.f(str, "title");
    }
}
