package t6;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.f0;
import ua.n0;
import ua.s1;
import ua.x0;

@qa.d
/* loaded from: classes.dex */
public final class v {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Theme f17674a;

    /* renamed from: b  reason: collision with root package name */
    public final Font f17675b;
    public final Language c;

    /* renamed from: d  reason: collision with root package name */
    public final Icon f17676d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17677e;

    /* renamed from: f  reason: collision with root package name */
    public final VaultTimeout f17678f;

    /* renamed from: g  reason: collision with root package name */
    public final VaultTimeout f17679g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17680h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17681i;

    /* renamed from: j  reason: collision with root package name */
    public final String f17682j;

    /* renamed from: k  reason: collision with root package name */
    public final FolderListSortingType f17683k;

    /* renamed from: l  reason: collision with root package name */
    public final SortingOrder f17684l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f17685m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f17686o;

    /* renamed from: p  reason: collision with root package name */
    public final long f17687p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f17688q;

    /* renamed from: r  reason: collision with root package name */
    public final int f17689r;

    /* renamed from: s  reason: collision with root package name */
    public final int f17690s;

    /* renamed from: t  reason: collision with root package name */
    public final int f17691t;

    /* renamed from: u  reason: collision with root package name */
    public final int f17692u;

    /* loaded from: classes.dex */
    public static final class a implements f0<v> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17693a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17694b;

        static {
            a aVar = new a();
            f17693a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.SettingsConfig", aVar, 21);
            pluginGeneratedSerialDescriptor.l("theme", true);
            pluginGeneratedSerialDescriptor.l("font", true);
            pluginGeneratedSerialDescriptor.l("language", true);
            pluginGeneratedSerialDescriptor.l("icon", true);
            pluginGeneratedSerialDescriptor.l("vaultPasscode", true);
            pluginGeneratedSerialDescriptor.l("vaultTimeout", true);
            pluginGeneratedSerialDescriptor.l("scheduledVaultTimeout", true);
            pluginGeneratedSerialDescriptor.l("isVaultOpen", true);
            pluginGeneratedSerialDescriptor.l("isBioAuthEnabled", true);
            pluginGeneratedSerialDescriptor.l("lastVersion", true);
            pluginGeneratedSerialDescriptor.l("sortingType", true);
            pluginGeneratedSerialDescriptor.l("sortingOrder", true);
            pluginGeneratedSerialDescriptor.l("isShowNotesCount", true);
            pluginGeneratedSerialDescriptor.l("isDoNotDisturb", true);
            pluginGeneratedSerialDescriptor.l("isScreenOn", true);
            pluginGeneratedSerialDescriptor.l("mainInterfaceId", true);
            pluginGeneratedSerialDescriptor.l("isRememberScrollingPosition", true);
            pluginGeneratedSerialDescriptor.l("allNotesScrollingPosition", true);
            pluginGeneratedSerialDescriptor.l("recentNotesScrollingPosition", true);
            pluginGeneratedSerialDescriptor.l("scheduledNotesScrollingPosition", true);
            pluginGeneratedSerialDescriptor.l("archivedNotesScrollingPosition", true);
            f17694b = pluginGeneratedSerialDescriptor;
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17694b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:175:0x022b, code lost:
            if (r10 == 0) goto L126;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x015d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x017f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0193 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0194 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:122:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01a8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01a9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01bd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01d6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01d7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01eb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01ec A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0200 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0201 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0215 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0216 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00f8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x010c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x010d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0121 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x013c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0146  */
        @Override // qa.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(ta.d dVar, Object obj) {
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
            boolean z28;
            boolean n020;
            boolean z29;
            boolean n021;
            v vVar = (v) obj;
            v7.g.f(dVar, "encoder");
            v7.g.f(vVar, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17694b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = v.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n022 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z30 = false;
            Theme theme = vVar.f17674a;
            if (!n022 && theme == Theme.System) {
                z10 = false;
                if (z10) {
                    b5.g0(pluginGeneratedSerialDescriptor, 0, a1.b.I("com.noto.app.domain.model.Theme", Theme.values()), theme);
                }
                n02 = b5.n0(pluginGeneratedSerialDescriptor);
                Font font = vVar.f17675b;
                if (!n02 && font == Font.Nunito) {
                    z11 = false;
                    if (z11) {
                        b5.g0(pluginGeneratedSerialDescriptor, 1, a1.b.I("com.noto.app.domain.model.Font", Font.values()), font);
                    }
                    n03 = b5.n0(pluginGeneratedSerialDescriptor);
                    Language language = vVar.c;
                    if (!n03 && language == Language.System) {
                        z12 = false;
                        if (z12) {
                            b5.g0(pluginGeneratedSerialDescriptor, 2, a1.b.I("com.noto.app.domain.model.Language", Language.values()), language);
                        }
                        n04 = b5.n0(pluginGeneratedSerialDescriptor);
                        Icon icon = vVar.f17676d;
                        if (!n04 && icon == Icon.Futuristic) {
                            z13 = false;
                            if (z13) {
                                b5.g0(pluginGeneratedSerialDescriptor, 3, a1.b.I("com.noto.app.domain.model.Icon", Icon.values()), icon);
                            }
                            n05 = b5.n0(pluginGeneratedSerialDescriptor);
                            Comparable comparable = vVar.f17677e;
                            if (!n05 && comparable == null) {
                                z14 = false;
                                if (z14) {
                                    b5.p(pluginGeneratedSerialDescriptor, 4, s1.f18010a, comparable);
                                }
                                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                                VaultTimeout vaultTimeout = vVar.f17678f;
                                if (!n06 && vaultTimeout == VaultTimeout.Immediately) {
                                    z15 = false;
                                    if (z15) {
                                        b5.g0(pluginGeneratedSerialDescriptor, 5, a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values()), vaultTimeout);
                                    }
                                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                    Comparable comparable2 = vVar.f17679g;
                                    if (!n07 && comparable2 == null) {
                                        z16 = false;
                                        if (z16) {
                                            b5.p(pluginGeneratedSerialDescriptor, 6, a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values()), comparable2);
                                        }
                                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z31 = vVar.f17680h;
                                        if (!n08 && !z31) {
                                            z17 = false;
                                            if (z17) {
                                                b5.h0(pluginGeneratedSerialDescriptor, 7, z31);
                                            }
                                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z32 = vVar.f17681i;
                                            if (!n09 && !z32) {
                                                z18 = false;
                                                if (z18) {
                                                    b5.h0(pluginGeneratedSerialDescriptor, 8, z32);
                                                }
                                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                String str = vVar.f17682j;
                                                if (!n010 && v7.g.a(str, "2.2.2")) {
                                                    z19 = false;
                                                    if (z19) {
                                                        b5.o0(pluginGeneratedSerialDescriptor, 9, str);
                                                    }
                                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    FolderListSortingType folderListSortingType = vVar.f17683k;
                                                    if (!n011 && folderListSortingType == FolderListSortingType.CreationDate) {
                                                        z20 = false;
                                                        if (z20) {
                                                            b5.g0(pluginGeneratedSerialDescriptor, 10, a1.b.I("com.noto.app.domain.model.FolderListSortingType", FolderListSortingType.values()), folderListSortingType);
                                                        }
                                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        SortingOrder sortingOrder = vVar.f17684l;
                                                        if (!n012 && sortingOrder == SortingOrder.Descending) {
                                                            z21 = false;
                                                            if (z21) {
                                                                b5.g0(pluginGeneratedSerialDescriptor, 11, a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), sortingOrder);
                                                            }
                                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z33 = vVar.f17685m;
                                                            if (!n013 && !z33) {
                                                                z22 = false;
                                                                if (z22) {
                                                                    b5.h0(pluginGeneratedSerialDescriptor, 12, z33);
                                                                }
                                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z34 = vVar.n;
                                                                if (!n014 && !z34) {
                                                                    z23 = false;
                                                                    if (z23) {
                                                                        b5.h0(pluginGeneratedSerialDescriptor, 13, z34);
                                                                    }
                                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    boolean z35 = vVar.f17686o;
                                                                    if (!n015 && z35) {
                                                                        z24 = false;
                                                                        if (z24) {
                                                                            b5.h0(pluginGeneratedSerialDescriptor, 14, z35);
                                                                        }
                                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        long j2 = vVar.f17687p;
                                                                        if (!n016 && j2 == -4) {
                                                                            z25 = false;
                                                                            if (z25) {
                                                                                b5.h(pluginGeneratedSerialDescriptor, 15, j2);
                                                                            }
                                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            boolean z36 = vVar.f17688q;
                                                                            if (!n017 && z36) {
                                                                                z26 = false;
                                                                                if (z26) {
                                                                                    b5.h0(pluginGeneratedSerialDescriptor, 16, z36);
                                                                                }
                                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i10 = vVar.f17689r;
                                                                                if (!n018 && i10 == 0) {
                                                                                    z27 = false;
                                                                                    if (z27) {
                                                                                        b5.r(17, i10, pluginGeneratedSerialDescriptor);
                                                                                    }
                                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    int i11 = vVar.f17690s;
                                                                                    if (!n019 && i11 == 0) {
                                                                                        z28 = false;
                                                                                        if (z28) {
                                                                                            b5.r(18, i11, pluginGeneratedSerialDescriptor);
                                                                                        }
                                                                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                        int i12 = vVar.f17691t;
                                                                                        if (!n020 && i12 == 0) {
                                                                                            z29 = false;
                                                                                            if (z29) {
                                                                                                b5.r(19, i12, pluginGeneratedSerialDescriptor);
                                                                                            }
                                                                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                            int i13 = vVar.f17692u;
                                                                                            if (!n021) {
                                                                                            }
                                                                                            z30 = true;
                                                                                            if (z30) {
                                                                                                b5.r(20, i13, pluginGeneratedSerialDescriptor);
                                                                                            }
                                                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                                                        }
                                                                                        z29 = true;
                                                                                        if (z29) {
                                                                                        }
                                                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                        int i132 = vVar.f17692u;
                                                                                        if (!n021) {
                                                                                        }
                                                                                        z30 = true;
                                                                                        if (z30) {
                                                                                        }
                                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                                    }
                                                                                    z28 = true;
                                                                                    if (z28) {
                                                                                    }
                                                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    int i122 = vVar.f17691t;
                                                                                    if (!n020) {
                                                                                        z29 = false;
                                                                                        if (z29) {
                                                                                        }
                                                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                        int i1322 = vVar.f17692u;
                                                                                        if (!n021) {
                                                                                        }
                                                                                        z30 = true;
                                                                                        if (z30) {
                                                                                        }
                                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                                    }
                                                                                    z29 = true;
                                                                                    if (z29) {
                                                                                    }
                                                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    int i13222 = vVar.f17692u;
                                                                                    if (!n021) {
                                                                                    }
                                                                                    z30 = true;
                                                                                    if (z30) {
                                                                                    }
                                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                                }
                                                                                z27 = true;
                                                                                if (z27) {
                                                                                }
                                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i112 = vVar.f17690s;
                                                                                if (!n019) {
                                                                                    z28 = false;
                                                                                    if (z28) {
                                                                                    }
                                                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    int i1222 = vVar.f17691t;
                                                                                    if (!n020) {
                                                                                    }
                                                                                    z29 = true;
                                                                                    if (z29) {
                                                                                    }
                                                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                    int i132222 = vVar.f17692u;
                                                                                    if (!n021) {
                                                                                    }
                                                                                    z30 = true;
                                                                                    if (z30) {
                                                                                    }
                                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                                }
                                                                                z28 = true;
                                                                                if (z28) {
                                                                                }
                                                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i12222 = vVar.f17691t;
                                                                                if (!n020) {
                                                                                }
                                                                                z29 = true;
                                                                                if (z29) {
                                                                                }
                                                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i1322222 = vVar.f17692u;
                                                                                if (!n021) {
                                                                                }
                                                                                z30 = true;
                                                                                if (z30) {
                                                                                }
                                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                                            }
                                                                            z26 = true;
                                                                            if (z26) {
                                                                            }
                                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i102 = vVar.f17689r;
                                                                            if (!n018) {
                                                                                z27 = false;
                                                                                if (z27) {
                                                                                }
                                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i1122 = vVar.f17690s;
                                                                                if (!n019) {
                                                                                }
                                                                                z28 = true;
                                                                                if (z28) {
                                                                                }
                                                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i122222 = vVar.f17691t;
                                                                                if (!n020) {
                                                                                }
                                                                                z29 = true;
                                                                                if (z29) {
                                                                                }
                                                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                                int i13222222 = vVar.f17692u;
                                                                                if (!n021) {
                                                                                }
                                                                                z30 = true;
                                                                                if (z30) {
                                                                                }
                                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                                            }
                                                                            z27 = true;
                                                                            if (z27) {
                                                                            }
                                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i11222 = vVar.f17690s;
                                                                            if (!n019) {
                                                                            }
                                                                            z28 = true;
                                                                            if (z28) {
                                                                            }
                                                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i1222222 = vVar.f17691t;
                                                                            if (!n020) {
                                                                            }
                                                                            z29 = true;
                                                                            if (z29) {
                                                                            }
                                                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i132222222 = vVar.f17692u;
                                                                            if (!n021) {
                                                                            }
                                                                            z30 = true;
                                                                            if (z30) {
                                                                            }
                                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                                        }
                                                                        z25 = true;
                                                                        if (z25) {
                                                                        }
                                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        boolean z362 = vVar.f17688q;
                                                                        if (!n017) {
                                                                            z26 = false;
                                                                            if (z26) {
                                                                            }
                                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i1022 = vVar.f17689r;
                                                                            if (!n018) {
                                                                            }
                                                                            z27 = true;
                                                                            if (z27) {
                                                                            }
                                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i112222 = vVar.f17690s;
                                                                            if (!n019) {
                                                                            }
                                                                            z28 = true;
                                                                            if (z28) {
                                                                            }
                                                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i12222222 = vVar.f17691t;
                                                                            if (!n020) {
                                                                            }
                                                                            z29 = true;
                                                                            if (z29) {
                                                                            }
                                                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                            int i1322222222 = vVar.f17692u;
                                                                            if (!n021) {
                                                                            }
                                                                            z30 = true;
                                                                            if (z30) {
                                                                            }
                                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                                        }
                                                                        z26 = true;
                                                                        if (z26) {
                                                                        }
                                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i10222 = vVar.f17689r;
                                                                        if (!n018) {
                                                                        }
                                                                        z27 = true;
                                                                        if (z27) {
                                                                        }
                                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i1122222 = vVar.f17690s;
                                                                        if (!n019) {
                                                                        }
                                                                        z28 = true;
                                                                        if (z28) {
                                                                        }
                                                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i122222222 = vVar.f17691t;
                                                                        if (!n020) {
                                                                        }
                                                                        z29 = true;
                                                                        if (z29) {
                                                                        }
                                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i13222222222 = vVar.f17692u;
                                                                        if (!n021) {
                                                                        }
                                                                        z30 = true;
                                                                        if (z30) {
                                                                        }
                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                    }
                                                                    z24 = true;
                                                                    if (z24) {
                                                                    }
                                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    long j22 = vVar.f17687p;
                                                                    if (!n016) {
                                                                        z25 = false;
                                                                        if (z25) {
                                                                        }
                                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        boolean z3622 = vVar.f17688q;
                                                                        if (!n017) {
                                                                        }
                                                                        z26 = true;
                                                                        if (z26) {
                                                                        }
                                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i102222 = vVar.f17689r;
                                                                        if (!n018) {
                                                                        }
                                                                        z27 = true;
                                                                        if (z27) {
                                                                        }
                                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i11222222 = vVar.f17690s;
                                                                        if (!n019) {
                                                                        }
                                                                        z28 = true;
                                                                        if (z28) {
                                                                        }
                                                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i1222222222 = vVar.f17691t;
                                                                        if (!n020) {
                                                                        }
                                                                        z29 = true;
                                                                        if (z29) {
                                                                        }
                                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                        int i132222222222 = vVar.f17692u;
                                                                        if (!n021) {
                                                                        }
                                                                        z30 = true;
                                                                        if (z30) {
                                                                        }
                                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                                    }
                                                                    z25 = true;
                                                                    if (z25) {
                                                                    }
                                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    boolean z36222 = vVar.f17688q;
                                                                    if (!n017) {
                                                                    }
                                                                    z26 = true;
                                                                    if (z26) {
                                                                    }
                                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i1022222 = vVar.f17689r;
                                                                    if (!n018) {
                                                                    }
                                                                    z27 = true;
                                                                    if (z27) {
                                                                    }
                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i112222222 = vVar.f17690s;
                                                                    if (!n019) {
                                                                    }
                                                                    z28 = true;
                                                                    if (z28) {
                                                                    }
                                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i12222222222 = vVar.f17691t;
                                                                    if (!n020) {
                                                                    }
                                                                    z29 = true;
                                                                    if (z29) {
                                                                    }
                                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i1322222222222 = vVar.f17692u;
                                                                    if (!n021) {
                                                                    }
                                                                    z30 = true;
                                                                    if (z30) {
                                                                    }
                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                }
                                                                z23 = true;
                                                                if (z23) {
                                                                }
                                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z352 = vVar.f17686o;
                                                                if (!n015) {
                                                                    z24 = false;
                                                                    if (z24) {
                                                                    }
                                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    long j222 = vVar.f17687p;
                                                                    if (!n016) {
                                                                    }
                                                                    z25 = true;
                                                                    if (z25) {
                                                                    }
                                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    boolean z362222 = vVar.f17688q;
                                                                    if (!n017) {
                                                                    }
                                                                    z26 = true;
                                                                    if (z26) {
                                                                    }
                                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i10222222 = vVar.f17689r;
                                                                    if (!n018) {
                                                                    }
                                                                    z27 = true;
                                                                    if (z27) {
                                                                    }
                                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i1122222222 = vVar.f17690s;
                                                                    if (!n019) {
                                                                    }
                                                                    z28 = true;
                                                                    if (z28) {
                                                                    }
                                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i122222222222 = vVar.f17691t;
                                                                    if (!n020) {
                                                                    }
                                                                    z29 = true;
                                                                    if (z29) {
                                                                    }
                                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                    int i13222222222222 = vVar.f17692u;
                                                                    if (!n021) {
                                                                    }
                                                                    z30 = true;
                                                                    if (z30) {
                                                                    }
                                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                                }
                                                                z24 = true;
                                                                if (z24) {
                                                                }
                                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                long j2222 = vVar.f17687p;
                                                                if (!n016) {
                                                                }
                                                                z25 = true;
                                                                if (z25) {
                                                                }
                                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z3622222 = vVar.f17688q;
                                                                if (!n017) {
                                                                }
                                                                z26 = true;
                                                                if (z26) {
                                                                }
                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i102222222 = vVar.f17689r;
                                                                if (!n018) {
                                                                }
                                                                z27 = true;
                                                                if (z27) {
                                                                }
                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i11222222222 = vVar.f17690s;
                                                                if (!n019) {
                                                                }
                                                                z28 = true;
                                                                if (z28) {
                                                                }
                                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i1222222222222 = vVar.f17691t;
                                                                if (!n020) {
                                                                }
                                                                z29 = true;
                                                                if (z29) {
                                                                }
                                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i132222222222222 = vVar.f17692u;
                                                                if (!n021) {
                                                                }
                                                                z30 = true;
                                                                if (z30) {
                                                                }
                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                            }
                                                            z22 = true;
                                                            if (z22) {
                                                            }
                                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z342 = vVar.n;
                                                            if (!n014) {
                                                                z23 = false;
                                                                if (z23) {
                                                                }
                                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z3522 = vVar.f17686o;
                                                                if (!n015) {
                                                                }
                                                                z24 = true;
                                                                if (z24) {
                                                                }
                                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                long j22222 = vVar.f17687p;
                                                                if (!n016) {
                                                                }
                                                                z25 = true;
                                                                if (z25) {
                                                                }
                                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                boolean z36222222 = vVar.f17688q;
                                                                if (!n017) {
                                                                }
                                                                z26 = true;
                                                                if (z26) {
                                                                }
                                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i1022222222 = vVar.f17689r;
                                                                if (!n018) {
                                                                }
                                                                z27 = true;
                                                                if (z27) {
                                                                }
                                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i112222222222 = vVar.f17690s;
                                                                if (!n019) {
                                                                }
                                                                z28 = true;
                                                                if (z28) {
                                                                }
                                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i12222222222222 = vVar.f17691t;
                                                                if (!n020) {
                                                                }
                                                                z29 = true;
                                                                if (z29) {
                                                                }
                                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                                int i1322222222222222 = vVar.f17692u;
                                                                if (!n021) {
                                                                }
                                                                z30 = true;
                                                                if (z30) {
                                                                }
                                                                b5.a(pluginGeneratedSerialDescriptor);
                                                            }
                                                            z23 = true;
                                                            if (z23) {
                                                            }
                                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z35222 = vVar.f17686o;
                                                            if (!n015) {
                                                            }
                                                            z24 = true;
                                                            if (z24) {
                                                            }
                                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            long j222222 = vVar.f17687p;
                                                            if (!n016) {
                                                            }
                                                            z25 = true;
                                                            if (z25) {
                                                            }
                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z362222222 = vVar.f17688q;
                                                            if (!n017) {
                                                            }
                                                            z26 = true;
                                                            if (z26) {
                                                            }
                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i10222222222 = vVar.f17689r;
                                                            if (!n018) {
                                                            }
                                                            z27 = true;
                                                            if (z27) {
                                                            }
                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i1122222222222 = vVar.f17690s;
                                                            if (!n019) {
                                                            }
                                                            z28 = true;
                                                            if (z28) {
                                                            }
                                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i122222222222222 = vVar.f17691t;
                                                            if (!n020) {
                                                            }
                                                            z29 = true;
                                                            if (z29) {
                                                            }
                                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i13222222222222222 = vVar.f17692u;
                                                            if (!n021) {
                                                            }
                                                            z30 = true;
                                                            if (z30) {
                                                            }
                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                        }
                                                        z21 = true;
                                                        if (z21) {
                                                        }
                                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z332 = vVar.f17685m;
                                                        if (!n013) {
                                                            z22 = false;
                                                            if (z22) {
                                                            }
                                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z3422 = vVar.n;
                                                            if (!n014) {
                                                            }
                                                            z23 = true;
                                                            if (z23) {
                                                            }
                                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z352222 = vVar.f17686o;
                                                            if (!n015) {
                                                            }
                                                            z24 = true;
                                                            if (z24) {
                                                            }
                                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            long j2222222 = vVar.f17687p;
                                                            if (!n016) {
                                                            }
                                                            z25 = true;
                                                            if (z25) {
                                                            }
                                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            boolean z3622222222 = vVar.f17688q;
                                                            if (!n017) {
                                                            }
                                                            z26 = true;
                                                            if (z26) {
                                                            }
                                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i102222222222 = vVar.f17689r;
                                                            if (!n018) {
                                                            }
                                                            z27 = true;
                                                            if (z27) {
                                                            }
                                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i11222222222222 = vVar.f17690s;
                                                            if (!n019) {
                                                            }
                                                            z28 = true;
                                                            if (z28) {
                                                            }
                                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i1222222222222222 = vVar.f17691t;
                                                            if (!n020) {
                                                            }
                                                            z29 = true;
                                                            if (z29) {
                                                            }
                                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                            int i132222222222222222 = vVar.f17692u;
                                                            if (!n021) {
                                                            }
                                                            z30 = true;
                                                            if (z30) {
                                                            }
                                                            b5.a(pluginGeneratedSerialDescriptor);
                                                        }
                                                        z22 = true;
                                                        if (z22) {
                                                        }
                                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z34222 = vVar.n;
                                                        if (!n014) {
                                                        }
                                                        z23 = true;
                                                        if (z23) {
                                                        }
                                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z3522222 = vVar.f17686o;
                                                        if (!n015) {
                                                        }
                                                        z24 = true;
                                                        if (z24) {
                                                        }
                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        long j22222222 = vVar.f17687p;
                                                        if (!n016) {
                                                        }
                                                        z25 = true;
                                                        if (z25) {
                                                        }
                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z36222222222 = vVar.f17688q;
                                                        if (!n017) {
                                                        }
                                                        z26 = true;
                                                        if (z26) {
                                                        }
                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i1022222222222 = vVar.f17689r;
                                                        if (!n018) {
                                                        }
                                                        z27 = true;
                                                        if (z27) {
                                                        }
                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i112222222222222 = vVar.f17690s;
                                                        if (!n019) {
                                                        }
                                                        z28 = true;
                                                        if (z28) {
                                                        }
                                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i12222222222222222 = vVar.f17691t;
                                                        if (!n020) {
                                                        }
                                                        z29 = true;
                                                        if (z29) {
                                                        }
                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i1322222222222222222 = vVar.f17692u;
                                                        if (!n021) {
                                                        }
                                                        z30 = true;
                                                        if (z30) {
                                                        }
                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                    }
                                                    z20 = true;
                                                    if (z20) {
                                                    }
                                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    SortingOrder sortingOrder2 = vVar.f17684l;
                                                    if (!n012) {
                                                        z21 = false;
                                                        if (z21) {
                                                        }
                                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z3322 = vVar.f17685m;
                                                        if (!n013) {
                                                        }
                                                        z22 = true;
                                                        if (z22) {
                                                        }
                                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z342222 = vVar.n;
                                                        if (!n014) {
                                                        }
                                                        z23 = true;
                                                        if (z23) {
                                                        }
                                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z35222222 = vVar.f17686o;
                                                        if (!n015) {
                                                        }
                                                        z24 = true;
                                                        if (z24) {
                                                        }
                                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        long j222222222 = vVar.f17687p;
                                                        if (!n016) {
                                                        }
                                                        z25 = true;
                                                        if (z25) {
                                                        }
                                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        boolean z362222222222 = vVar.f17688q;
                                                        if (!n017) {
                                                        }
                                                        z26 = true;
                                                        if (z26) {
                                                        }
                                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i10222222222222 = vVar.f17689r;
                                                        if (!n018) {
                                                        }
                                                        z27 = true;
                                                        if (z27) {
                                                        }
                                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i1122222222222222 = vVar.f17690s;
                                                        if (!n019) {
                                                        }
                                                        z28 = true;
                                                        if (z28) {
                                                        }
                                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i122222222222222222 = vVar.f17691t;
                                                        if (!n020) {
                                                        }
                                                        z29 = true;
                                                        if (z29) {
                                                        }
                                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                        int i13222222222222222222 = vVar.f17692u;
                                                        if (!n021) {
                                                        }
                                                        z30 = true;
                                                        if (z30) {
                                                        }
                                                        b5.a(pluginGeneratedSerialDescriptor);
                                                    }
                                                    z21 = true;
                                                    if (z21) {
                                                    }
                                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z33222 = vVar.f17685m;
                                                    if (!n013) {
                                                    }
                                                    z22 = true;
                                                    if (z22) {
                                                    }
                                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z3422222 = vVar.n;
                                                    if (!n014) {
                                                    }
                                                    z23 = true;
                                                    if (z23) {
                                                    }
                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z352222222 = vVar.f17686o;
                                                    if (!n015) {
                                                    }
                                                    z24 = true;
                                                    if (z24) {
                                                    }
                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    long j2222222222 = vVar.f17687p;
                                                    if (!n016) {
                                                    }
                                                    z25 = true;
                                                    if (z25) {
                                                    }
                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z3622222222222 = vVar.f17688q;
                                                    if (!n017) {
                                                    }
                                                    z26 = true;
                                                    if (z26) {
                                                    }
                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i102222222222222 = vVar.f17689r;
                                                    if (!n018) {
                                                    }
                                                    z27 = true;
                                                    if (z27) {
                                                    }
                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i11222222222222222 = vVar.f17690s;
                                                    if (!n019) {
                                                    }
                                                    z28 = true;
                                                    if (z28) {
                                                    }
                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i1222222222222222222 = vVar.f17691t;
                                                    if (!n020) {
                                                    }
                                                    z29 = true;
                                                    if (z29) {
                                                    }
                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i132222222222222222222 = vVar.f17692u;
                                                    if (!n021) {
                                                    }
                                                    z30 = true;
                                                    if (z30) {
                                                    }
                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                }
                                                z19 = true;
                                                if (z19) {
                                                }
                                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                FolderListSortingType folderListSortingType2 = vVar.f17683k;
                                                if (!n011) {
                                                    z20 = false;
                                                    if (z20) {
                                                    }
                                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    SortingOrder sortingOrder22 = vVar.f17684l;
                                                    if (!n012) {
                                                    }
                                                    z21 = true;
                                                    if (z21) {
                                                    }
                                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z332222 = vVar.f17685m;
                                                    if (!n013) {
                                                    }
                                                    z22 = true;
                                                    if (z22) {
                                                    }
                                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z34222222 = vVar.n;
                                                    if (!n014) {
                                                    }
                                                    z23 = true;
                                                    if (z23) {
                                                    }
                                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z3522222222 = vVar.f17686o;
                                                    if (!n015) {
                                                    }
                                                    z24 = true;
                                                    if (z24) {
                                                    }
                                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    long j22222222222 = vVar.f17687p;
                                                    if (!n016) {
                                                    }
                                                    z25 = true;
                                                    if (z25) {
                                                    }
                                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    boolean z36222222222222 = vVar.f17688q;
                                                    if (!n017) {
                                                    }
                                                    z26 = true;
                                                    if (z26) {
                                                    }
                                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i1022222222222222 = vVar.f17689r;
                                                    if (!n018) {
                                                    }
                                                    z27 = true;
                                                    if (z27) {
                                                    }
                                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i112222222222222222 = vVar.f17690s;
                                                    if (!n019) {
                                                    }
                                                    z28 = true;
                                                    if (z28) {
                                                    }
                                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i12222222222222222222 = vVar.f17691t;
                                                    if (!n020) {
                                                    }
                                                    z29 = true;
                                                    if (z29) {
                                                    }
                                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i1322222222222222222222 = vVar.f17692u;
                                                    if (!n021) {
                                                    }
                                                    z30 = true;
                                                    if (z30) {
                                                    }
                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                }
                                                z20 = true;
                                                if (z20) {
                                                }
                                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                SortingOrder sortingOrder222 = vVar.f17684l;
                                                if (!n012) {
                                                }
                                                z21 = true;
                                                if (z21) {
                                                }
                                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z3322222 = vVar.f17685m;
                                                if (!n013) {
                                                }
                                                z22 = true;
                                                if (z22) {
                                                }
                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z342222222 = vVar.n;
                                                if (!n014) {
                                                }
                                                z23 = true;
                                                if (z23) {
                                                }
                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z35222222222 = vVar.f17686o;
                                                if (!n015) {
                                                }
                                                z24 = true;
                                                if (z24) {
                                                }
                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                long j222222222222 = vVar.f17687p;
                                                if (!n016) {
                                                }
                                                z25 = true;
                                                if (z25) {
                                                }
                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z362222222222222 = vVar.f17688q;
                                                if (!n017) {
                                                }
                                                z26 = true;
                                                if (z26) {
                                                }
                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i10222222222222222 = vVar.f17689r;
                                                if (!n018) {
                                                }
                                                z27 = true;
                                                if (z27) {
                                                }
                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i1122222222222222222 = vVar.f17690s;
                                                if (!n019) {
                                                }
                                                z28 = true;
                                                if (z28) {
                                                }
                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i122222222222222222222 = vVar.f17691t;
                                                if (!n020) {
                                                }
                                                z29 = true;
                                                if (z29) {
                                                }
                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i13222222222222222222222 = vVar.f17692u;
                                                if (!n021) {
                                                }
                                                z30 = true;
                                                if (z30) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z18 = true;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            String str2 = vVar.f17682j;
                                            if (!n010) {
                                                z19 = false;
                                                if (z19) {
                                                }
                                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                                FolderListSortingType folderListSortingType22 = vVar.f17683k;
                                                if (!n011) {
                                                }
                                                z20 = true;
                                                if (z20) {
                                                }
                                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                                SortingOrder sortingOrder2222 = vVar.f17684l;
                                                if (!n012) {
                                                }
                                                z21 = true;
                                                if (z21) {
                                                }
                                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z33222222 = vVar.f17685m;
                                                if (!n013) {
                                                }
                                                z22 = true;
                                                if (z22) {
                                                }
                                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z3422222222 = vVar.n;
                                                if (!n014) {
                                                }
                                                z23 = true;
                                                if (z23) {
                                                }
                                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z352222222222 = vVar.f17686o;
                                                if (!n015) {
                                                }
                                                z24 = true;
                                                if (z24) {
                                                }
                                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                                long j2222222222222 = vVar.f17687p;
                                                if (!n016) {
                                                }
                                                z25 = true;
                                                if (z25) {
                                                }
                                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                                boolean z3622222222222222 = vVar.f17688q;
                                                if (!n017) {
                                                }
                                                z26 = true;
                                                if (z26) {
                                                }
                                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i102222222222222222 = vVar.f17689r;
                                                if (!n018) {
                                                }
                                                z27 = true;
                                                if (z27) {
                                                }
                                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i11222222222222222222 = vVar.f17690s;
                                                if (!n019) {
                                                }
                                                z28 = true;
                                                if (z28) {
                                                }
                                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i1222222222222222222222 = vVar.f17691t;
                                                if (!n020) {
                                                }
                                                z29 = true;
                                                if (z29) {
                                                }
                                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i132222222222222222222222 = vVar.f17692u;
                                                if (!n021) {
                                                }
                                                z30 = true;
                                                if (z30) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                            FolderListSortingType folderListSortingType222 = vVar.f17683k;
                                            if (!n011) {
                                            }
                                            z20 = true;
                                            if (z20) {
                                            }
                                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                            SortingOrder sortingOrder22222 = vVar.f17684l;
                                            if (!n012) {
                                            }
                                            z21 = true;
                                            if (z21) {
                                            }
                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z332222222 = vVar.f17685m;
                                            if (!n013) {
                                            }
                                            z22 = true;
                                            if (z22) {
                                            }
                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z34222222222 = vVar.n;
                                            if (!n014) {
                                            }
                                            z23 = true;
                                            if (z23) {
                                            }
                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z3522222222222 = vVar.f17686o;
                                            if (!n015) {
                                            }
                                            z24 = true;
                                            if (z24) {
                                            }
                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                            long j22222222222222 = vVar.f17687p;
                                            if (!n016) {
                                            }
                                            z25 = true;
                                            if (z25) {
                                            }
                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z36222222222222222 = vVar.f17688q;
                                            if (!n017) {
                                            }
                                            z26 = true;
                                            if (z26) {
                                            }
                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i1022222222222222222 = vVar.f17689r;
                                            if (!n018) {
                                            }
                                            z27 = true;
                                            if (z27) {
                                            }
                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i112222222222222222222 = vVar.f17690s;
                                            if (!n019) {
                                            }
                                            z28 = true;
                                            if (z28) {
                                            }
                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i12222222222222222222222 = vVar.f17691t;
                                            if (!n020) {
                                            }
                                            z29 = true;
                                            if (z29) {
                                            }
                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i1322222222222222222222222 = vVar.f17692u;
                                            if (!n021) {
                                            }
                                            z30 = true;
                                            if (z30) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z17 = true;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z322 = vVar.f17681i;
                                        if (!n09) {
                                            z18 = false;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            String str22 = vVar.f17682j;
                                            if (!n010) {
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                            FolderListSortingType folderListSortingType2222 = vVar.f17683k;
                                            if (!n011) {
                                            }
                                            z20 = true;
                                            if (z20) {
                                            }
                                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                            SortingOrder sortingOrder222222 = vVar.f17684l;
                                            if (!n012) {
                                            }
                                            z21 = true;
                                            if (z21) {
                                            }
                                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z3322222222 = vVar.f17685m;
                                            if (!n013) {
                                            }
                                            z22 = true;
                                            if (z22) {
                                            }
                                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z342222222222 = vVar.n;
                                            if (!n014) {
                                            }
                                            z23 = true;
                                            if (z23) {
                                            }
                                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z35222222222222 = vVar.f17686o;
                                            if (!n015) {
                                            }
                                            z24 = true;
                                            if (z24) {
                                            }
                                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                            long j222222222222222 = vVar.f17687p;
                                            if (!n016) {
                                            }
                                            z25 = true;
                                            if (z25) {
                                            }
                                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z362222222222222222 = vVar.f17688q;
                                            if (!n017) {
                                            }
                                            z26 = true;
                                            if (z26) {
                                            }
                                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i10222222222222222222 = vVar.f17689r;
                                            if (!n018) {
                                            }
                                            z27 = true;
                                            if (z27) {
                                            }
                                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i1122222222222222222222 = vVar.f17690s;
                                            if (!n019) {
                                            }
                                            z28 = true;
                                            if (z28) {
                                            }
                                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i122222222222222222222222 = vVar.f17691t;
                                            if (!n020) {
                                            }
                                            z29 = true;
                                            if (z29) {
                                            }
                                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i13222222222222222222222222 = vVar.f17692u;
                                            if (!n021) {
                                            }
                                            z30 = true;
                                            if (z30) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        String str222 = vVar.f17682j;
                                        if (!n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                        FolderListSortingType folderListSortingType22222 = vVar.f17683k;
                                        if (!n011) {
                                        }
                                        z20 = true;
                                        if (z20) {
                                        }
                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                        SortingOrder sortingOrder2222222 = vVar.f17684l;
                                        if (!n012) {
                                        }
                                        z21 = true;
                                        if (z21) {
                                        }
                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z33222222222 = vVar.f17685m;
                                        if (!n013) {
                                        }
                                        z22 = true;
                                        if (z22) {
                                        }
                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3422222222222 = vVar.n;
                                        if (!n014) {
                                        }
                                        z23 = true;
                                        if (z23) {
                                        }
                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z352222222222222 = vVar.f17686o;
                                        if (!n015) {
                                        }
                                        z24 = true;
                                        if (z24) {
                                        }
                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                        long j2222222222222222 = vVar.f17687p;
                                        if (!n016) {
                                        }
                                        z25 = true;
                                        if (z25) {
                                        }
                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3622222222222222222 = vVar.f17688q;
                                        if (!n017) {
                                        }
                                        z26 = true;
                                        if (z26) {
                                        }
                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i102222222222222222222 = vVar.f17689r;
                                        if (!n018) {
                                        }
                                        z27 = true;
                                        if (z27) {
                                        }
                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i11222222222222222222222 = vVar.f17690s;
                                        if (!n019) {
                                        }
                                        z28 = true;
                                        if (z28) {
                                        }
                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i1222222222222222222222222 = vVar.f17691t;
                                        if (!n020) {
                                        }
                                        z29 = true;
                                        if (z29) {
                                        }
                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i132222222222222222222222222 = vVar.f17692u;
                                        if (!n021) {
                                        }
                                        z30 = true;
                                        if (z30) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z16 = true;
                                    if (z16) {
                                    }
                                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z312 = vVar.f17680h;
                                    if (!n08) {
                                        z17 = false;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3222 = vVar.f17681i;
                                        if (!n09) {
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        String str2222 = vVar.f17682j;
                                        if (!n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                        FolderListSortingType folderListSortingType222222 = vVar.f17683k;
                                        if (!n011) {
                                        }
                                        z20 = true;
                                        if (z20) {
                                        }
                                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                        SortingOrder sortingOrder22222222 = vVar.f17684l;
                                        if (!n012) {
                                        }
                                        z21 = true;
                                        if (z21) {
                                        }
                                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z332222222222 = vVar.f17685m;
                                        if (!n013) {
                                        }
                                        z22 = true;
                                        if (z22) {
                                        }
                                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z34222222222222 = vVar.n;
                                        if (!n014) {
                                        }
                                        z23 = true;
                                        if (z23) {
                                        }
                                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z3522222222222222 = vVar.f17686o;
                                        if (!n015) {
                                        }
                                        z24 = true;
                                        if (z24) {
                                        }
                                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                        long j22222222222222222 = vVar.f17687p;
                                        if (!n016) {
                                        }
                                        z25 = true;
                                        if (z25) {
                                        }
                                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z36222222222222222222 = vVar.f17688q;
                                        if (!n017) {
                                        }
                                        z26 = true;
                                        if (z26) {
                                        }
                                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i1022222222222222222222 = vVar.f17689r;
                                        if (!n018) {
                                        }
                                        z27 = true;
                                        if (z27) {
                                        }
                                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i112222222222222222222222 = vVar.f17690s;
                                        if (!n019) {
                                        }
                                        z28 = true;
                                        if (z28) {
                                        }
                                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i12222222222222222222222222 = vVar.f17691t;
                                        if (!n020) {
                                        }
                                        z29 = true;
                                        if (z29) {
                                        }
                                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i1322222222222222222222222222 = vVar.f17692u;
                                        if (!n021) {
                                        }
                                        z30 = true;
                                        if (z30) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z32222 = vVar.f17681i;
                                    if (!n09) {
                                    }
                                    z18 = true;
                                    if (z18) {
                                    }
                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                    String str22222 = vVar.f17682j;
                                    if (!n010) {
                                    }
                                    z19 = true;
                                    if (z19) {
                                    }
                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                    FolderListSortingType folderListSortingType2222222 = vVar.f17683k;
                                    if (!n011) {
                                    }
                                    z20 = true;
                                    if (z20) {
                                    }
                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                    SortingOrder sortingOrder222222222 = vVar.f17684l;
                                    if (!n012) {
                                    }
                                    z21 = true;
                                    if (z21) {
                                    }
                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z3322222222222 = vVar.f17685m;
                                    if (!n013) {
                                    }
                                    z22 = true;
                                    if (z22) {
                                    }
                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z342222222222222 = vVar.n;
                                    if (!n014) {
                                    }
                                    z23 = true;
                                    if (z23) {
                                    }
                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z35222222222222222 = vVar.f17686o;
                                    if (!n015) {
                                    }
                                    z24 = true;
                                    if (z24) {
                                    }
                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                    long j222222222222222222 = vVar.f17687p;
                                    if (!n016) {
                                    }
                                    z25 = true;
                                    if (z25) {
                                    }
                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z362222222222222222222 = vVar.f17688q;
                                    if (!n017) {
                                    }
                                    z26 = true;
                                    if (z26) {
                                    }
                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i10222222222222222222222 = vVar.f17689r;
                                    if (!n018) {
                                    }
                                    z27 = true;
                                    if (z27) {
                                    }
                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i1122222222222222222222222 = vVar.f17690s;
                                    if (!n019) {
                                    }
                                    z28 = true;
                                    if (z28) {
                                    }
                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i122222222222222222222222222 = vVar.f17691t;
                                    if (!n020) {
                                    }
                                    z29 = true;
                                    if (z29) {
                                    }
                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i13222222222222222222222222222 = vVar.f17692u;
                                    if (!n021) {
                                    }
                                    z30 = true;
                                    if (z30) {
                                    }
                                    b5.a(pluginGeneratedSerialDescriptor);
                                }
                                z15 = true;
                                if (z15) {
                                }
                                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                Comparable comparable22 = vVar.f17679g;
                                if (!n07) {
                                    z16 = false;
                                    if (z16) {
                                    }
                                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z3122 = vVar.f17680h;
                                    if (!n08) {
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z322222 = vVar.f17681i;
                                    if (!n09) {
                                    }
                                    z18 = true;
                                    if (z18) {
                                    }
                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                    String str222222 = vVar.f17682j;
                                    if (!n010) {
                                    }
                                    z19 = true;
                                    if (z19) {
                                    }
                                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                    FolderListSortingType folderListSortingType22222222 = vVar.f17683k;
                                    if (!n011) {
                                    }
                                    z20 = true;
                                    if (z20) {
                                    }
                                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                    SortingOrder sortingOrder2222222222 = vVar.f17684l;
                                    if (!n012) {
                                    }
                                    z21 = true;
                                    if (z21) {
                                    }
                                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z33222222222222 = vVar.f17685m;
                                    if (!n013) {
                                    }
                                    z22 = true;
                                    if (z22) {
                                    }
                                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z3422222222222222 = vVar.n;
                                    if (!n014) {
                                    }
                                    z23 = true;
                                    if (z23) {
                                    }
                                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z352222222222222222 = vVar.f17686o;
                                    if (!n015) {
                                    }
                                    z24 = true;
                                    if (z24) {
                                    }
                                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                    long j2222222222222222222 = vVar.f17687p;
                                    if (!n016) {
                                    }
                                    z25 = true;
                                    if (z25) {
                                    }
                                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z3622222222222222222222 = vVar.f17688q;
                                    if (!n017) {
                                    }
                                    z26 = true;
                                    if (z26) {
                                    }
                                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i102222222222222222222222 = vVar.f17689r;
                                    if (!n018) {
                                    }
                                    z27 = true;
                                    if (z27) {
                                    }
                                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i11222222222222222222222222 = vVar.f17690s;
                                    if (!n019) {
                                    }
                                    z28 = true;
                                    if (z28) {
                                    }
                                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i1222222222222222222222222222 = vVar.f17691t;
                                    if (!n020) {
                                    }
                                    z29 = true;
                                    if (z29) {
                                    }
                                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i132222222222222222222222222222 = vVar.f17692u;
                                    if (!n021) {
                                    }
                                    z30 = true;
                                    if (z30) {
                                    }
                                    b5.a(pluginGeneratedSerialDescriptor);
                                }
                                z16 = true;
                                if (z16) {
                                }
                                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z31222 = vVar.f17680h;
                                if (!n08) {
                                }
                                z17 = true;
                                if (z17) {
                                }
                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z3222222 = vVar.f17681i;
                                if (!n09) {
                                }
                                z18 = true;
                                if (z18) {
                                }
                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                String str2222222 = vVar.f17682j;
                                if (!n010) {
                                }
                                z19 = true;
                                if (z19) {
                                }
                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                FolderListSortingType folderListSortingType222222222 = vVar.f17683k;
                                if (!n011) {
                                }
                                z20 = true;
                                if (z20) {
                                }
                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                SortingOrder sortingOrder22222222222 = vVar.f17684l;
                                if (!n012) {
                                }
                                z21 = true;
                                if (z21) {
                                }
                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z332222222222222 = vVar.f17685m;
                                if (!n013) {
                                }
                                z22 = true;
                                if (z22) {
                                }
                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z34222222222222222 = vVar.n;
                                if (!n014) {
                                }
                                z23 = true;
                                if (z23) {
                                }
                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z3522222222222222222 = vVar.f17686o;
                                if (!n015) {
                                }
                                z24 = true;
                                if (z24) {
                                }
                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                long j22222222222222222222 = vVar.f17687p;
                                if (!n016) {
                                }
                                z25 = true;
                                if (z25) {
                                }
                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z36222222222222222222222 = vVar.f17688q;
                                if (!n017) {
                                }
                                z26 = true;
                                if (z26) {
                                }
                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i1022222222222222222222222 = vVar.f17689r;
                                if (!n018) {
                                }
                                z27 = true;
                                if (z27) {
                                }
                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i112222222222222222222222222 = vVar.f17690s;
                                if (!n019) {
                                }
                                z28 = true;
                                if (z28) {
                                }
                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i12222222222222222222222222222 = vVar.f17691t;
                                if (!n020) {
                                }
                                z29 = true;
                                if (z29) {
                                }
                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i1322222222222222222222222222222 = vVar.f17692u;
                                if (!n021) {
                                }
                                z30 = true;
                                if (z30) {
                                }
                                b5.a(pluginGeneratedSerialDescriptor);
                            }
                            z14 = true;
                            if (z14) {
                            }
                            n06 = b5.n0(pluginGeneratedSerialDescriptor);
                            VaultTimeout vaultTimeout2 = vVar.f17678f;
                            if (!n06) {
                                z15 = false;
                                if (z15) {
                                }
                                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                Comparable comparable222 = vVar.f17679g;
                                if (!n07) {
                                }
                                z16 = true;
                                if (z16) {
                                }
                                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z312222 = vVar.f17680h;
                                if (!n08) {
                                }
                                z17 = true;
                                if (z17) {
                                }
                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z32222222 = vVar.f17681i;
                                if (!n09) {
                                }
                                z18 = true;
                                if (z18) {
                                }
                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                String str22222222 = vVar.f17682j;
                                if (!n010) {
                                }
                                z19 = true;
                                if (z19) {
                                }
                                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                                FolderListSortingType folderListSortingType2222222222 = vVar.f17683k;
                                if (!n011) {
                                }
                                z20 = true;
                                if (z20) {
                                }
                                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                                SortingOrder sortingOrder222222222222 = vVar.f17684l;
                                if (!n012) {
                                }
                                z21 = true;
                                if (z21) {
                                }
                                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z3322222222222222 = vVar.f17685m;
                                if (!n013) {
                                }
                                z22 = true;
                                if (z22) {
                                }
                                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z342222222222222222 = vVar.n;
                                if (!n014) {
                                }
                                z23 = true;
                                if (z23) {
                                }
                                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z35222222222222222222 = vVar.f17686o;
                                if (!n015) {
                                }
                                z24 = true;
                                if (z24) {
                                }
                                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                                long j222222222222222222222 = vVar.f17687p;
                                if (!n016) {
                                }
                                z25 = true;
                                if (z25) {
                                }
                                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z362222222222222222222222 = vVar.f17688q;
                                if (!n017) {
                                }
                                z26 = true;
                                if (z26) {
                                }
                                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i10222222222222222222222222 = vVar.f17689r;
                                if (!n018) {
                                }
                                z27 = true;
                                if (z27) {
                                }
                                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i1122222222222222222222222222 = vVar.f17690s;
                                if (!n019) {
                                }
                                z28 = true;
                                if (z28) {
                                }
                                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i122222222222222222222222222222 = vVar.f17691t;
                                if (!n020) {
                                }
                                z29 = true;
                                if (z29) {
                                }
                                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i13222222222222222222222222222222 = vVar.f17692u;
                                if (!n021) {
                                }
                                z30 = true;
                                if (z30) {
                                }
                                b5.a(pluginGeneratedSerialDescriptor);
                            }
                            z15 = true;
                            if (z15) {
                            }
                            n07 = b5.n0(pluginGeneratedSerialDescriptor);
                            Comparable comparable2222 = vVar.f17679g;
                            if (!n07) {
                            }
                            z16 = true;
                            if (z16) {
                            }
                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z3122222 = vVar.f17680h;
                            if (!n08) {
                            }
                            z17 = true;
                            if (z17) {
                            }
                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z322222222 = vVar.f17681i;
                            if (!n09) {
                            }
                            z18 = true;
                            if (z18) {
                            }
                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                            String str222222222 = vVar.f17682j;
                            if (!n010) {
                            }
                            z19 = true;
                            if (z19) {
                            }
                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                            FolderListSortingType folderListSortingType22222222222 = vVar.f17683k;
                            if (!n011) {
                            }
                            z20 = true;
                            if (z20) {
                            }
                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                            SortingOrder sortingOrder2222222222222 = vVar.f17684l;
                            if (!n012) {
                            }
                            z21 = true;
                            if (z21) {
                            }
                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z33222222222222222 = vVar.f17685m;
                            if (!n013) {
                            }
                            z22 = true;
                            if (z22) {
                            }
                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z3422222222222222222 = vVar.n;
                            if (!n014) {
                            }
                            z23 = true;
                            if (z23) {
                            }
                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z352222222222222222222 = vVar.f17686o;
                            if (!n015) {
                            }
                            z24 = true;
                            if (z24) {
                            }
                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                            long j2222222222222222222222 = vVar.f17687p;
                            if (!n016) {
                            }
                            z25 = true;
                            if (z25) {
                            }
                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z3622222222222222222222222 = vVar.f17688q;
                            if (!n017) {
                            }
                            z26 = true;
                            if (z26) {
                            }
                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i102222222222222222222222222 = vVar.f17689r;
                            if (!n018) {
                            }
                            z27 = true;
                            if (z27) {
                            }
                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i11222222222222222222222222222 = vVar.f17690s;
                            if (!n019) {
                            }
                            z28 = true;
                            if (z28) {
                            }
                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i1222222222222222222222222222222 = vVar.f17691t;
                            if (!n020) {
                            }
                            z29 = true;
                            if (z29) {
                            }
                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i132222222222222222222222222222222 = vVar.f17692u;
                            if (!n021) {
                            }
                            z30 = true;
                            if (z30) {
                            }
                            b5.a(pluginGeneratedSerialDescriptor);
                        }
                        z13 = true;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        Comparable comparable3 = vVar.f17677e;
                        if (!n05) {
                            z14 = false;
                            if (z14) {
                            }
                            n06 = b5.n0(pluginGeneratedSerialDescriptor);
                            VaultTimeout vaultTimeout22 = vVar.f17678f;
                            if (!n06) {
                            }
                            z15 = true;
                            if (z15) {
                            }
                            n07 = b5.n0(pluginGeneratedSerialDescriptor);
                            Comparable comparable22222 = vVar.f17679g;
                            if (!n07) {
                            }
                            z16 = true;
                            if (z16) {
                            }
                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z31222222 = vVar.f17680h;
                            if (!n08) {
                            }
                            z17 = true;
                            if (z17) {
                            }
                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z3222222222 = vVar.f17681i;
                            if (!n09) {
                            }
                            z18 = true;
                            if (z18) {
                            }
                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                            String str2222222222 = vVar.f17682j;
                            if (!n010) {
                            }
                            z19 = true;
                            if (z19) {
                            }
                            n011 = b5.n0(pluginGeneratedSerialDescriptor);
                            FolderListSortingType folderListSortingType222222222222 = vVar.f17683k;
                            if (!n011) {
                            }
                            z20 = true;
                            if (z20) {
                            }
                            n012 = b5.n0(pluginGeneratedSerialDescriptor);
                            SortingOrder sortingOrder22222222222222 = vVar.f17684l;
                            if (!n012) {
                            }
                            z21 = true;
                            if (z21) {
                            }
                            n013 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z332222222222222222 = vVar.f17685m;
                            if (!n013) {
                            }
                            z22 = true;
                            if (z22) {
                            }
                            n014 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z34222222222222222222 = vVar.n;
                            if (!n014) {
                            }
                            z23 = true;
                            if (z23) {
                            }
                            n015 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z3522222222222222222222 = vVar.f17686o;
                            if (!n015) {
                            }
                            z24 = true;
                            if (z24) {
                            }
                            n016 = b5.n0(pluginGeneratedSerialDescriptor);
                            long j22222222222222222222222 = vVar.f17687p;
                            if (!n016) {
                            }
                            z25 = true;
                            if (z25) {
                            }
                            n017 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z36222222222222222222222222 = vVar.f17688q;
                            if (!n017) {
                            }
                            z26 = true;
                            if (z26) {
                            }
                            n018 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i1022222222222222222222222222 = vVar.f17689r;
                            if (!n018) {
                            }
                            z27 = true;
                            if (z27) {
                            }
                            n019 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i112222222222222222222222222222 = vVar.f17690s;
                            if (!n019) {
                            }
                            z28 = true;
                            if (z28) {
                            }
                            n020 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i12222222222222222222222222222222 = vVar.f17691t;
                            if (!n020) {
                            }
                            z29 = true;
                            if (z29) {
                            }
                            n021 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i1322222222222222222222222222222222 = vVar.f17692u;
                            if (!n021) {
                            }
                            z30 = true;
                            if (z30) {
                            }
                            b5.a(pluginGeneratedSerialDescriptor);
                        }
                        z14 = true;
                        if (z14) {
                        }
                        n06 = b5.n0(pluginGeneratedSerialDescriptor);
                        VaultTimeout vaultTimeout222 = vVar.f17678f;
                        if (!n06) {
                        }
                        z15 = true;
                        if (z15) {
                        }
                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                        Comparable comparable222222 = vVar.f17679g;
                        if (!n07) {
                        }
                        z16 = true;
                        if (z16) {
                        }
                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z312222222 = vVar.f17680h;
                        if (!n08) {
                        }
                        z17 = true;
                        if (z17) {
                        }
                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z32222222222 = vVar.f17681i;
                        if (!n09) {
                        }
                        z18 = true;
                        if (z18) {
                        }
                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                        String str22222222222 = vVar.f17682j;
                        if (!n010) {
                        }
                        z19 = true;
                        if (z19) {
                        }
                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                        FolderListSortingType folderListSortingType2222222222222 = vVar.f17683k;
                        if (!n011) {
                        }
                        z20 = true;
                        if (z20) {
                        }
                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                        SortingOrder sortingOrder222222222222222 = vVar.f17684l;
                        if (!n012) {
                        }
                        z21 = true;
                        if (z21) {
                        }
                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3322222222222222222 = vVar.f17685m;
                        if (!n013) {
                        }
                        z22 = true;
                        if (z22) {
                        }
                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z342222222222222222222 = vVar.n;
                        if (!n014) {
                        }
                        z23 = true;
                        if (z23) {
                        }
                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z35222222222222222222222 = vVar.f17686o;
                        if (!n015) {
                        }
                        z24 = true;
                        if (z24) {
                        }
                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                        long j222222222222222222222222 = vVar.f17687p;
                        if (!n016) {
                        }
                        z25 = true;
                        if (z25) {
                        }
                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z362222222222222222222222222 = vVar.f17688q;
                        if (!n017) {
                        }
                        z26 = true;
                        if (z26) {
                        }
                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i10222222222222222222222222222 = vVar.f17689r;
                        if (!n018) {
                        }
                        z27 = true;
                        if (z27) {
                        }
                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i1122222222222222222222222222222 = vVar.f17690s;
                        if (!n019) {
                        }
                        z28 = true;
                        if (z28) {
                        }
                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i122222222222222222222222222222222 = vVar.f17691t;
                        if (!n020) {
                        }
                        z29 = true;
                        if (z29) {
                        }
                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i13222222222222222222222222222222222 = vVar.f17692u;
                        if (!n021) {
                        }
                        z30 = true;
                        if (z30) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z12 = true;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    Icon icon2 = vVar.f17676d;
                    if (!n04) {
                        z13 = false;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        Comparable comparable32 = vVar.f17677e;
                        if (!n05) {
                        }
                        z14 = true;
                        if (z14) {
                        }
                        n06 = b5.n0(pluginGeneratedSerialDescriptor);
                        VaultTimeout vaultTimeout2222 = vVar.f17678f;
                        if (!n06) {
                        }
                        z15 = true;
                        if (z15) {
                        }
                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                        Comparable comparable2222222 = vVar.f17679g;
                        if (!n07) {
                        }
                        z16 = true;
                        if (z16) {
                        }
                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3122222222 = vVar.f17680h;
                        if (!n08) {
                        }
                        z17 = true;
                        if (z17) {
                        }
                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z322222222222 = vVar.f17681i;
                        if (!n09) {
                        }
                        z18 = true;
                        if (z18) {
                        }
                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                        String str222222222222 = vVar.f17682j;
                        if (!n010) {
                        }
                        z19 = true;
                        if (z19) {
                        }
                        n011 = b5.n0(pluginGeneratedSerialDescriptor);
                        FolderListSortingType folderListSortingType22222222222222 = vVar.f17683k;
                        if (!n011) {
                        }
                        z20 = true;
                        if (z20) {
                        }
                        n012 = b5.n0(pluginGeneratedSerialDescriptor);
                        SortingOrder sortingOrder2222222222222222 = vVar.f17684l;
                        if (!n012) {
                        }
                        z21 = true;
                        if (z21) {
                        }
                        n013 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z33222222222222222222 = vVar.f17685m;
                        if (!n013) {
                        }
                        z22 = true;
                        if (z22) {
                        }
                        n014 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3422222222222222222222 = vVar.n;
                        if (!n014) {
                        }
                        z23 = true;
                        if (z23) {
                        }
                        n015 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z352222222222222222222222 = vVar.f17686o;
                        if (!n015) {
                        }
                        z24 = true;
                        if (z24) {
                        }
                        n016 = b5.n0(pluginGeneratedSerialDescriptor);
                        long j2222222222222222222222222 = vVar.f17687p;
                        if (!n016) {
                        }
                        z25 = true;
                        if (z25) {
                        }
                        n017 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z3622222222222222222222222222 = vVar.f17688q;
                        if (!n017) {
                        }
                        z26 = true;
                        if (z26) {
                        }
                        n018 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i102222222222222222222222222222 = vVar.f17689r;
                        if (!n018) {
                        }
                        z27 = true;
                        if (z27) {
                        }
                        n019 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i11222222222222222222222222222222 = vVar.f17690s;
                        if (!n019) {
                        }
                        z28 = true;
                        if (z28) {
                        }
                        n020 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i1222222222222222222222222222222222 = vVar.f17691t;
                        if (!n020) {
                        }
                        z29 = true;
                        if (z29) {
                        }
                        n021 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i132222222222222222222222222222222222 = vVar.f17692u;
                        if (!n021) {
                        }
                        z30 = true;
                        if (z30) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable322 = vVar.f17677e;
                    if (!n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    VaultTimeout vaultTimeout22222 = vVar.f17678f;
                    if (!n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable22222222 = vVar.f17679g;
                    if (!n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z31222222222 = vVar.f17680h;
                    if (!n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z3222222222222 = vVar.f17681i;
                    if (!n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    String str2222222222222 = vVar.f17682j;
                    if (!n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                    FolderListSortingType folderListSortingType222222222222222 = vVar.f17683k;
                    if (!n011) {
                    }
                    z20 = true;
                    if (z20) {
                    }
                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                    SortingOrder sortingOrder22222222222222222 = vVar.f17684l;
                    if (!n012) {
                    }
                    z21 = true;
                    if (z21) {
                    }
                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z332222222222222222222 = vVar.f17685m;
                    if (!n013) {
                    }
                    z22 = true;
                    if (z22) {
                    }
                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z34222222222222222222222 = vVar.n;
                    if (!n014) {
                    }
                    z23 = true;
                    if (z23) {
                    }
                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z3522222222222222222222222 = vVar.f17686o;
                    if (!n015) {
                    }
                    z24 = true;
                    if (z24) {
                    }
                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                    long j22222222222222222222222222 = vVar.f17687p;
                    if (!n016) {
                    }
                    z25 = true;
                    if (z25) {
                    }
                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z36222222222222222222222222222 = vVar.f17688q;
                    if (!n017) {
                    }
                    z26 = true;
                    if (z26) {
                    }
                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i1022222222222222222222222222222 = vVar.f17689r;
                    if (!n018) {
                    }
                    z27 = true;
                    if (z27) {
                    }
                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i112222222222222222222222222222222 = vVar.f17690s;
                    if (!n019) {
                    }
                    z28 = true;
                    if (z28) {
                    }
                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i12222222222222222222222222222222222 = vVar.f17691t;
                    if (!n020) {
                    }
                    z29 = true;
                    if (z29) {
                    }
                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i1322222222222222222222222222222222222 = vVar.f17692u;
                    if (!n021) {
                    }
                    z30 = true;
                    if (z30) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z11 = true;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                Language language2 = vVar.c;
                if (!n03) {
                    z12 = false;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    Icon icon22 = vVar.f17676d;
                    if (!n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable3222 = vVar.f17677e;
                    if (!n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    VaultTimeout vaultTimeout222222 = vVar.f17678f;
                    if (!n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable222222222 = vVar.f17679g;
                    if (!n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z312222222222 = vVar.f17680h;
                    if (!n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z32222222222222 = vVar.f17681i;
                    if (!n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    String str22222222222222 = vVar.f17682j;
                    if (!n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    n011 = b5.n0(pluginGeneratedSerialDescriptor);
                    FolderListSortingType folderListSortingType2222222222222222 = vVar.f17683k;
                    if (!n011) {
                    }
                    z20 = true;
                    if (z20) {
                    }
                    n012 = b5.n0(pluginGeneratedSerialDescriptor);
                    SortingOrder sortingOrder222222222222222222 = vVar.f17684l;
                    if (!n012) {
                    }
                    z21 = true;
                    if (z21) {
                    }
                    n013 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z3322222222222222222222 = vVar.f17685m;
                    if (!n013) {
                    }
                    z22 = true;
                    if (z22) {
                    }
                    n014 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z342222222222222222222222 = vVar.n;
                    if (!n014) {
                    }
                    z23 = true;
                    if (z23) {
                    }
                    n015 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z35222222222222222222222222 = vVar.f17686o;
                    if (!n015) {
                    }
                    z24 = true;
                    if (z24) {
                    }
                    n016 = b5.n0(pluginGeneratedSerialDescriptor);
                    long j222222222222222222222222222 = vVar.f17687p;
                    if (!n016) {
                    }
                    z25 = true;
                    if (z25) {
                    }
                    n017 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z362222222222222222222222222222 = vVar.f17688q;
                    if (!n017) {
                    }
                    z26 = true;
                    if (z26) {
                    }
                    n018 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i10222222222222222222222222222222 = vVar.f17689r;
                    if (!n018) {
                    }
                    z27 = true;
                    if (z27) {
                    }
                    n019 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i1122222222222222222222222222222222 = vVar.f17690s;
                    if (!n019) {
                    }
                    z28 = true;
                    if (z28) {
                    }
                    n020 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i122222222222222222222222222222222222 = vVar.f17691t;
                    if (!n020) {
                    }
                    z29 = true;
                    if (z29) {
                    }
                    n021 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i13222222222222222222222222222222222222 = vVar.f17692u;
                    if (!n021) {
                    }
                    z30 = true;
                    if (z30) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                Icon icon222 = vVar.f17676d;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable32222 = vVar.f17677e;
                if (!n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                VaultTimeout vaultTimeout2222222 = vVar.f17678f;
                if (!n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable2222222222 = vVar.f17679g;
                if (!n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3122222222222 = vVar.f17680h;
                if (!n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z322222222222222 = vVar.f17681i;
                if (!n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                String str222222222222222 = vVar.f17682j;
                if (!n010) {
                }
                z19 = true;
                if (z19) {
                }
                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                FolderListSortingType folderListSortingType22222222222222222 = vVar.f17683k;
                if (!n011) {
                }
                z20 = true;
                if (z20) {
                }
                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                SortingOrder sortingOrder2222222222222222222 = vVar.f17684l;
                if (!n012) {
                }
                z21 = true;
                if (z21) {
                }
                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z33222222222222222222222 = vVar.f17685m;
                if (!n013) {
                }
                z22 = true;
                if (z22) {
                }
                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3422222222222222222222222 = vVar.n;
                if (!n014) {
                }
                z23 = true;
                if (z23) {
                }
                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z352222222222222222222222222 = vVar.f17686o;
                if (!n015) {
                }
                z24 = true;
                if (z24) {
                }
                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                long j2222222222222222222222222222 = vVar.f17687p;
                if (!n016) {
                }
                z25 = true;
                if (z25) {
                }
                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3622222222222222222222222222222 = vVar.f17688q;
                if (!n017) {
                }
                z26 = true;
                if (z26) {
                }
                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                int i102222222222222222222222222222222 = vVar.f17689r;
                if (!n018) {
                }
                z27 = true;
                if (z27) {
                }
                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                int i11222222222222222222222222222222222 = vVar.f17690s;
                if (!n019) {
                }
                z28 = true;
                if (z28) {
                }
                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1222222222222222222222222222222222222 = vVar.f17691t;
                if (!n020) {
                }
                z29 = true;
                if (z29) {
                }
                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                int i132222222222222222222222222222222222222 = vVar.f17692u;
                if (!n021) {
                }
                z30 = true;
                if (z30) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            n02 = b5.n0(pluginGeneratedSerialDescriptor);
            Font font2 = vVar.f17675b;
            if (!n02) {
                z11 = false;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                Language language22 = vVar.c;
                if (!n03) {
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                Icon icon2222 = vVar.f17676d;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable322222 = vVar.f17677e;
                if (!n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                VaultTimeout vaultTimeout22222222 = vVar.f17678f;
                if (!n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable22222222222 = vVar.f17679g;
                if (!n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z31222222222222 = vVar.f17680h;
                if (!n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3222222222222222 = vVar.f17681i;
                if (!n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                String str2222222222222222 = vVar.f17682j;
                if (!n010) {
                }
                z19 = true;
                if (z19) {
                }
                n011 = b5.n0(pluginGeneratedSerialDescriptor);
                FolderListSortingType folderListSortingType222222222222222222 = vVar.f17683k;
                if (!n011) {
                }
                z20 = true;
                if (z20) {
                }
                n012 = b5.n0(pluginGeneratedSerialDescriptor);
                SortingOrder sortingOrder22222222222222222222 = vVar.f17684l;
                if (!n012) {
                }
                z21 = true;
                if (z21) {
                }
                n013 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z332222222222222222222222 = vVar.f17685m;
                if (!n013) {
                }
                z22 = true;
                if (z22) {
                }
                n014 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z34222222222222222222222222 = vVar.n;
                if (!n014) {
                }
                z23 = true;
                if (z23) {
                }
                n015 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z3522222222222222222222222222 = vVar.f17686o;
                if (!n015) {
                }
                z24 = true;
                if (z24) {
                }
                n016 = b5.n0(pluginGeneratedSerialDescriptor);
                long j22222222222222222222222222222 = vVar.f17687p;
                if (!n016) {
                }
                z25 = true;
                if (z25) {
                }
                n017 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z36222222222222222222222222222222 = vVar.f17688q;
                if (!n017) {
                }
                z26 = true;
                if (z26) {
                }
                n018 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1022222222222222222222222222222222 = vVar.f17689r;
                if (!n018) {
                }
                z27 = true;
                if (z27) {
                }
                n019 = b5.n0(pluginGeneratedSerialDescriptor);
                int i112222222222222222222222222222222222 = vVar.f17690s;
                if (!n019) {
                }
                z28 = true;
                if (z28) {
                }
                n020 = b5.n0(pluginGeneratedSerialDescriptor);
                int i12222222222222222222222222222222222222 = vVar.f17691t;
                if (!n020) {
                }
                z29 = true;
                if (z29) {
                }
                n021 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1322222222222222222222222222222222222222 = vVar.f17692u;
                if (!n021) {
                }
                z30 = true;
                if (z30) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z11 = true;
            if (z11) {
            }
            n03 = b5.n0(pluginGeneratedSerialDescriptor);
            Language language222 = vVar.c;
            if (!n03) {
            }
            z12 = true;
            if (z12) {
            }
            n04 = b5.n0(pluginGeneratedSerialDescriptor);
            Icon icon22222 = vVar.f17676d;
            if (!n04) {
            }
            z13 = true;
            if (z13) {
            }
            n05 = b5.n0(pluginGeneratedSerialDescriptor);
            Comparable comparable3222222 = vVar.f17677e;
            if (!n05) {
            }
            z14 = true;
            if (z14) {
            }
            n06 = b5.n0(pluginGeneratedSerialDescriptor);
            VaultTimeout vaultTimeout222222222 = vVar.f17678f;
            if (!n06) {
            }
            z15 = true;
            if (z15) {
            }
            n07 = b5.n0(pluginGeneratedSerialDescriptor);
            Comparable comparable222222222222 = vVar.f17679g;
            if (!n07) {
            }
            z16 = true;
            if (z16) {
            }
            n08 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z312222222222222 = vVar.f17680h;
            if (!n08) {
            }
            z17 = true;
            if (z17) {
            }
            n09 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z32222222222222222 = vVar.f17681i;
            if (!n09) {
            }
            z18 = true;
            if (z18) {
            }
            n010 = b5.n0(pluginGeneratedSerialDescriptor);
            String str22222222222222222 = vVar.f17682j;
            if (!n010) {
            }
            z19 = true;
            if (z19) {
            }
            n011 = b5.n0(pluginGeneratedSerialDescriptor);
            FolderListSortingType folderListSortingType2222222222222222222 = vVar.f17683k;
            if (!n011) {
            }
            z20 = true;
            if (z20) {
            }
            n012 = b5.n0(pluginGeneratedSerialDescriptor);
            SortingOrder sortingOrder222222222222222222222 = vVar.f17684l;
            if (!n012) {
            }
            z21 = true;
            if (z21) {
            }
            n013 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z3322222222222222222222222 = vVar.f17685m;
            if (!n013) {
            }
            z22 = true;
            if (z22) {
            }
            n014 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z342222222222222222222222222 = vVar.n;
            if (!n014) {
            }
            z23 = true;
            if (z23) {
            }
            n015 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z35222222222222222222222222222 = vVar.f17686o;
            if (!n015) {
            }
            z24 = true;
            if (z24) {
            }
            n016 = b5.n0(pluginGeneratedSerialDescriptor);
            long j222222222222222222222222222222 = vVar.f17687p;
            if (!n016) {
            }
            z25 = true;
            if (z25) {
            }
            n017 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z362222222222222222222222222222222 = vVar.f17688q;
            if (!n017) {
            }
            z26 = true;
            if (z26) {
            }
            n018 = b5.n0(pluginGeneratedSerialDescriptor);
            int i10222222222222222222222222222222222 = vVar.f17689r;
            if (!n018) {
            }
            z27 = true;
            if (z27) {
            }
            n019 = b5.n0(pluginGeneratedSerialDescriptor);
            int i1122222222222222222222222222222222222 = vVar.f17690s;
            if (!n019) {
            }
            z28 = true;
            if (z28) {
            }
            n020 = b5.n0(pluginGeneratedSerialDescriptor);
            int i122222222222222222222222222222222222222 = vVar.f17691t;
            if (!n020) {
            }
            z29 = true;
            if (z29) {
            }
            n021 = b5.n0(pluginGeneratedSerialDescriptor);
            int i13222222222222222222222222222222222222222 = vVar.f17692u;
            if (!n021) {
            }
            z30 = true;
            if (z30) {
            }
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            s1 s1Var = s1.f18010a;
            ua.h hVar = ua.h.f17975a;
            n0 n0Var = n0.f17993a;
            return new qa.b[]{a1.b.I("com.noto.app.domain.model.Theme", Theme.values()), a1.b.I("com.noto.app.domain.model.Font", Font.values()), a1.b.I("com.noto.app.domain.model.Language", Language.values()), a1.b.I("com.noto.app.domain.model.Icon", Icon.values()), ra.a.a(s1Var), a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values()), ra.a.a(a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values())), hVar, hVar, s1Var, a1.b.I("com.noto.app.domain.model.FolderListSortingType", FolderListSortingType.values()), a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), hVar, hVar, hVar, x0.f18029a, hVar, n0Var, n0Var, n0Var, n0Var};
        }

        @Override // ua.f0
        public final void d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qa.a
        public final Object e(ta.c cVar) {
            int i10;
            int i11;
            int i12;
            v7.g.f(cVar, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17694b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            String str = null;
            long j2 = 0;
            boolean z10 = true;
            int i13 = 0;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            Object obj8 = null;
            Theme theme = null;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                switch (t10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        i13 |= 1;
                        theme = b5.A(pluginGeneratedSerialDescriptor, 0, a1.b.I("com.noto.app.domain.model.Theme", Theme.values()), theme);
                        continue;
                    case 1:
                        obj2 = b5.A(pluginGeneratedSerialDescriptor, 1, a1.b.I("com.noto.app.domain.model.Font", Font.values()), obj2);
                        i10 = i13 | 2;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        obj4 = b5.A(pluginGeneratedSerialDescriptor, 2, a1.b.I("com.noto.app.domain.model.Language", Language.values()), obj4);
                        i10 = i13 | 4;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        obj3 = b5.A(pluginGeneratedSerialDescriptor, 3, a1.b.I("com.noto.app.domain.model.Icon", Icon.values()), obj3);
                        i10 = i13 | 8;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        obj5 = b5.Y(pluginGeneratedSerialDescriptor, 4, s1.f18010a, obj5);
                        i10 = i13 | 16;
                        break;
                    case 5:
                        obj6 = b5.A(pluginGeneratedSerialDescriptor, 5, a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values()), obj6);
                        i10 = i13 | 32;
                        break;
                    case 6:
                        obj = b5.Y(pluginGeneratedSerialDescriptor, 6, a1.b.I("com.noto.app.domain.model.VaultTimeout", VaultTimeout.values()), obj);
                        i10 = i13 | 64;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        z11 = b5.e0(pluginGeneratedSerialDescriptor, 7);
                        i10 = i13 | 128;
                        break;
                    case 8:
                        z12 = b5.e0(pluginGeneratedSerialDescriptor, 8);
                        i10 = i13 | 256;
                        break;
                    case ma.i.f16046m /* 9 */:
                        str = b5.E(pluginGeneratedSerialDescriptor, 9);
                        i10 = i13 | 512;
                        break;
                    case ma.i.f16047o /* 10 */:
                        obj8 = b5.A(pluginGeneratedSerialDescriptor, 10, a1.b.I("com.noto.app.domain.model.FolderListSortingType", FolderListSortingType.values()), obj8);
                        i10 = i13 | 1024;
                        break;
                    case 11:
                        obj7 = b5.A(pluginGeneratedSerialDescriptor, 11, a1.b.I("com.noto.app.domain.model.SortingOrder", SortingOrder.values()), obj7);
                        i10 = i13 | 2048;
                        break;
                    case 12:
                        z13 = b5.e0(pluginGeneratedSerialDescriptor, 12);
                        i10 = i13 | 4096;
                        break;
                    case 13:
                        i11 = i13 | 8192;
                        z14 = b5.e0(pluginGeneratedSerialDescriptor, 13);
                        i10 = i11;
                        break;
                    case 14:
                        i11 = i13 | 16384;
                        z15 = b5.e0(pluginGeneratedSerialDescriptor, 14);
                        i10 = i11;
                        break;
                    case ma.i.f16049q /* 15 */:
                        i12 = 32768;
                        j2 = b5.y(pluginGeneratedSerialDescriptor, 15);
                        i10 = i12 | i13;
                        break;
                    case 16:
                        z16 = b5.e0(pluginGeneratedSerialDescriptor, 16);
                        i12 = 65536;
                        i10 = i12 | i13;
                        break;
                    case 17:
                        i14 = b5.u(pluginGeneratedSerialDescriptor, 17);
                        i12 = 131072;
                        i10 = i12 | i13;
                        break;
                    case 18:
                        i15 = b5.u(pluginGeneratedSerialDescriptor, 18);
                        i12 = 262144;
                        i10 = i12 | i13;
                        break;
                    case 19:
                        i16 = b5.u(pluginGeneratedSerialDescriptor, 19);
                        i12 = 524288;
                        i10 = i12 | i13;
                        break;
                    case 20:
                        i17 = b5.u(pluginGeneratedSerialDescriptor, 20);
                        i12 = 1048576;
                        i10 = i12 | i13;
                        break;
                    default:
                        throw new UnknownFieldException(t10);
                }
                i13 = i10;
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new v(i13, theme, (Font) obj2, (Language) obj4, (Icon) obj3, (String) obj5, (VaultTimeout) obj6, (VaultTimeout) obj, z11, z12, str, (FolderListSortingType) obj8, (SortingOrder) obj7, z13, z14, z15, j2, z16, i14, i15, i16, i17);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<v> serializer() {
            return a.f17693a;
        }
    }

    public v() {
        this(0);
    }

    public /* synthetic */ v(int i10) {
        this(Theme.System, Font.Nunito, Language.System, Icon.Futuristic, null, VaultTimeout.Immediately, null, false, false, "2.2.2", FolderListSortingType.CreationDate, SortingOrder.Descending, false, false, true, -4L, true, 0, 0, 0, 0);
    }

    public v(int i10, Theme theme, Font font, Language language, Icon icon, String str, VaultTimeout vaultTimeout, VaultTimeout vaultTimeout2, boolean z10, boolean z11, String str2, FolderListSortingType folderListSortingType, SortingOrder sortingOrder, boolean z12, boolean z13, boolean z14, long j2, boolean z15, int i11, int i12, int i13, int i14) {
        if ((i10 & 0) != 0) {
            a1.b.F0(i10, 0, a.f17694b);
            throw null;
        }
        this.f17674a = (i10 & 1) == 0 ? Theme.System : theme;
        this.f17675b = (i10 & 2) == 0 ? Font.Nunito : font;
        this.c = (i10 & 4) == 0 ? Language.System : language;
        this.f17676d = (i10 & 8) == 0 ? Icon.Futuristic : icon;
        if ((i10 & 16) == 0) {
            this.f17677e = null;
        } else {
            this.f17677e = str;
        }
        this.f17678f = (i10 & 32) == 0 ? VaultTimeout.Immediately : vaultTimeout;
        if ((i10 & 64) == 0) {
            this.f17679g = null;
        } else {
            this.f17679g = vaultTimeout2;
        }
        if ((i10 & 128) == 0) {
            this.f17680h = false;
        } else {
            this.f17680h = z10;
        }
        if ((i10 & 256) == 0) {
            this.f17681i = false;
        } else {
            this.f17681i = z11;
        }
        this.f17682j = (i10 & 512) == 0 ? "2.2.2" : str2;
        this.f17683k = (i10 & 1024) == 0 ? FolderListSortingType.CreationDate : folderListSortingType;
        this.f17684l = (i10 & 2048) == 0 ? SortingOrder.Descending : sortingOrder;
        if ((i10 & 4096) == 0) {
            this.f17685m = false;
        } else {
            this.f17685m = z12;
        }
        if ((i10 & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z13;
        }
        if ((i10 & 16384) == 0) {
            this.f17686o = true;
        } else {
            this.f17686o = z14;
        }
        this.f17687p = (32768 & i10) == 0 ? -4L : j2;
        if ((65536 & i10) == 0) {
            this.f17688q = true;
        } else {
            this.f17688q = z15;
        }
        if ((131072 & i10) == 0) {
            this.f17689r = 0;
        } else {
            this.f17689r = i11;
        }
        if ((262144 & i10) == 0) {
            this.f17690s = 0;
        } else {
            this.f17690s = i12;
        }
        if ((524288 & i10) == 0) {
            this.f17691t = 0;
        } else {
            this.f17691t = i13;
        }
        if ((i10 & 1048576) == 0) {
            this.f17692u = 0;
        } else {
            this.f17692u = i14;
        }
    }

    public v(Theme theme, Font font, Language language, Icon icon, String str, VaultTimeout vaultTimeout, VaultTimeout vaultTimeout2, boolean z10, boolean z11, String str2, FolderListSortingType folderListSortingType, SortingOrder sortingOrder, boolean z12, boolean z13, boolean z14, long j2, boolean z15, int i10, int i11, int i12, int i13) {
        v7.g.f(theme, "theme");
        v7.g.f(font, "font");
        v7.g.f(language, "language");
        v7.g.f(icon, "icon");
        v7.g.f(vaultTimeout, "vaultTimeout");
        v7.g.f(str2, "lastVersion");
        v7.g.f(folderListSortingType, "sortingType");
        v7.g.f(sortingOrder, "sortingOrder");
        this.f17674a = theme;
        this.f17675b = font;
        this.c = language;
        this.f17676d = icon;
        this.f17677e = str;
        this.f17678f = vaultTimeout;
        this.f17679g = vaultTimeout2;
        this.f17680h = z10;
        this.f17681i = z11;
        this.f17682j = str2;
        this.f17683k = folderListSortingType;
        this.f17684l = sortingOrder;
        this.f17685m = z12;
        this.n = z13;
        this.f17686o = z14;
        this.f17687p = j2;
        this.f17688q = z15;
        this.f17689r = i10;
        this.f17690s = i11;
        this.f17691t = i12;
        this.f17692u = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f17674a == vVar.f17674a && this.f17675b == vVar.f17675b && this.c == vVar.c && this.f17676d == vVar.f17676d && v7.g.a(this.f17677e, vVar.f17677e) && this.f17678f == vVar.f17678f && this.f17679g == vVar.f17679g && this.f17680h == vVar.f17680h && this.f17681i == vVar.f17681i && v7.g.a(this.f17682j, vVar.f17682j) && this.f17683k == vVar.f17683k && this.f17684l == vVar.f17684l && this.f17685m == vVar.f17685m && this.n == vVar.n && this.f17686o == vVar.f17686o && this.f17687p == vVar.f17687p && this.f17688q == vVar.f17688q && this.f17689r == vVar.f17689r && this.f17690s == vVar.f17690s && this.f17691t == vVar.f17691t && this.f17692u == vVar.f17692u;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f17675b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (this.f17676d.hashCode() + ((hashCode3 + ((hashCode2 + (this.f17674a.hashCode() * 31)) * 31)) * 31)) * 31;
        int i10 = 0;
        String str = this.f17677e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.f17678f.hashCode() + ((hashCode4 + hashCode) * 31)) * 31;
        VaultTimeout vaultTimeout = this.f17679g;
        if (vaultTimeout != null) {
            i10 = vaultTimeout.hashCode();
        }
        int i11 = (hashCode5 + i10) * 31;
        int i12 = 1;
        boolean z10 = this.f17680h;
        int i13 = z10;
        if (z10 != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        boolean z11 = this.f17681i;
        int i15 = z11;
        if (z11 != 0) {
            i15 = 1;
        }
        int g10 = a4.b.g(this.f17682j, (i14 + i15) * 31, 31);
        int hashCode6 = (this.f17684l.hashCode() + ((this.f17683k.hashCode() + g10) * 31)) * 31;
        boolean z12 = this.f17685m;
        int i16 = z12;
        if (z12 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode6 + i16) * 31;
        boolean z13 = this.n;
        int i18 = z13;
        if (z13 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z14 = this.f17686o;
        int i20 = z14;
        if (z14 != 0) {
            i20 = 1;
        }
        long j2 = this.f17687p;
        int i21 = (((i19 + i20) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z15 = this.f17688q;
        if (!z15) {
            i12 = z15 ? 1 : 0;
        }
        return ((((((((i21 + i12) * 31) + this.f17689r) * 31) + this.f17690s) * 31) + this.f17691t) * 31) + this.f17692u;
    }

    public final String toString() {
        return "SettingsConfig(theme=" + this.f17674a + ", font=" + this.f17675b + ", language=" + this.c + ", icon=" + this.f17676d + ", vaultPasscode=" + this.f17677e + ", vaultTimeout=" + this.f17678f + ", scheduledVaultTimeout=" + this.f17679g + ", isVaultOpen=" + this.f17680h + ", isBioAuthEnabled=" + this.f17681i + ", lastVersion=" + this.f17682j + ", sortingType=" + this.f17683k + ", sortingOrder=" + this.f17684l + ", isShowNotesCount=" + this.f17685m + ", isDoNotDisturb=" + this.n + ", isScreenOn=" + this.f17686o + ", mainInterfaceId=" + this.f17687p + ", isRememberScrollingPosition=" + this.f17688q + ", allNotesScrollingPosition=" + this.f17689r + ", recentNotesScrollingPosition=" + this.f17690s + ", scheduledNotesScrollingPosition=" + this.f17691t + ", archivedNotesScrollingPosition=" + this.f17692u + ")";
    }
}
