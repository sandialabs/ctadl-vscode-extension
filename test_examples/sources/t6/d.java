package t6;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.Clock;
import j$.time.Instant;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.f0;
import ua.n0;
import ua.s1;
import ua.x0;

@qa.d
/* loaded from: classes.dex */
public final class d {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final long f17621a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17622b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17623d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17624e;

    /* renamed from: f  reason: collision with root package name */
    public final na.c f17625f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17626g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17627h;

    /* renamed from: i  reason: collision with root package name */
    public final na.c f17628i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17629j;

    /* renamed from: k  reason: collision with root package name */
    public final na.c f17630k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17631l;

    /* loaded from: classes.dex */
    public static final class a implements f0<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17632a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17633b;

        static {
            a aVar = new a();
            f17632a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.Note", aVar, 12);
            pluginGeneratedSerialDescriptor.l("id", true);
            pluginGeneratedSerialDescriptor.l("folderId", false);
            pluginGeneratedSerialDescriptor.l("title", true);
            pluginGeneratedSerialDescriptor.l("body", true);
            pluginGeneratedSerialDescriptor.l("position", false);
            pluginGeneratedSerialDescriptor.l("creationDate", true);
            pluginGeneratedSerialDescriptor.l("isPinned", true);
            pluginGeneratedSerialDescriptor.l("isArchived", true);
            pluginGeneratedSerialDescriptor.l("reminderDate", true);
            pluginGeneratedSerialDescriptor.l("isVaulted", true);
            pluginGeneratedSerialDescriptor.l("accessDate", true);
            pluginGeneratedSerialDescriptor.l("scrollingPosition", true);
            f17633b = pluginGeneratedSerialDescriptor;
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17633b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:82:0x0125, code lost:
            if (r10 == 0) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00f4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0109 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
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
            d dVar2 = (d) obj;
            v7.g.f(dVar, "encoder");
            v7.g.f(dVar2, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17633b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = d.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n011 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z19 = false;
            long j2 = dVar2.f17621a;
            if (!n011 && j2 == 0) {
                z10 = false;
                if (z10) {
                    b5.h(pluginGeneratedSerialDescriptor, 0, j2);
                }
                b5.h(pluginGeneratedSerialDescriptor, 1, dVar2.f17622b);
                n02 = b5.n0(pluginGeneratedSerialDescriptor);
                String str = dVar2.c;
                if (!n02 && v7.g.a(str, new String())) {
                    z11 = false;
                    if (z11) {
                        b5.o0(pluginGeneratedSerialDescriptor, 2, str);
                    }
                    n03 = b5.n0(pluginGeneratedSerialDescriptor);
                    String str2 = dVar2.f17623d;
                    if (!n03 && v7.g.a(str2, new String())) {
                        z12 = false;
                        if (z12) {
                            b5.o0(pluginGeneratedSerialDescriptor, 3, str2);
                        }
                        b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
                        n04 = b5.n0(pluginGeneratedSerialDescriptor);
                        na.c cVar = dVar2.f17625f;
                        if (n04) {
                            na.c.Companion.getClass();
                            Instant instant = Clock.systemUTC().instant();
                            v7.g.e(instant, "systemUTC().instant()");
                            if (v7.g.a(cVar, new na.c(instant))) {
                                z13 = false;
                                if (z13) {
                                    b5.g0(pluginGeneratedSerialDescriptor, 5, pa.d.f16791a, cVar);
                                }
                                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z20 = dVar2.f17626g;
                                if (n05 && !z20) {
                                    z14 = false;
                                    if (z14) {
                                        b5.h0(pluginGeneratedSerialDescriptor, 6, z20);
                                    }
                                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z21 = dVar2.f17627h;
                                    if (n06 && !z21) {
                                        z15 = false;
                                        if (z15) {
                                            b5.h0(pluginGeneratedSerialDescriptor, 7, z21);
                                        }
                                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                        Comparable comparable = dVar2.f17628i;
                                        if (n07 && comparable == null) {
                                            z16 = false;
                                            if (z16) {
                                                b5.p(pluginGeneratedSerialDescriptor, 8, pa.d.f16791a, comparable);
                                            }
                                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                            boolean z22 = dVar2.f17629j;
                                            if (n08 && !z22) {
                                                z17 = false;
                                                if (z17) {
                                                    b5.h0(pluginGeneratedSerialDescriptor, 9, z22);
                                                }
                                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                                na.c cVar2 = dVar2.f17630k;
                                                if (n09 && v7.g.a(cVar2, cVar)) {
                                                    z18 = false;
                                                    if (z18) {
                                                        b5.g0(pluginGeneratedSerialDescriptor, 10, pa.d.f16791a, cVar2);
                                                    }
                                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                    int i10 = dVar2.f17631l;
                                                    if (!n010) {
                                                    }
                                                    z19 = true;
                                                    if (z19) {
                                                        b5.r(11, i10, pluginGeneratedSerialDescriptor);
                                                    }
                                                    b5.a(pluginGeneratedSerialDescriptor);
                                                }
                                                z18 = true;
                                                if (z18) {
                                                }
                                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i102 = dVar2.f17631l;
                                                if (!n010) {
                                                }
                                                z19 = true;
                                                if (z19) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z17 = true;
                                            if (z17) {
                                            }
                                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                            na.c cVar22 = dVar2.f17630k;
                                            if (n09) {
                                                z18 = false;
                                                if (z18) {
                                                }
                                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                                int i1022 = dVar2.f17631l;
                                                if (!n010) {
                                                }
                                                z19 = true;
                                                if (z19) {
                                                }
                                                b5.a(pluginGeneratedSerialDescriptor);
                                            }
                                            z18 = true;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i10222 = dVar2.f17631l;
                                            if (!n010) {
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z16 = true;
                                        if (z16) {
                                        }
                                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z222 = dVar2.f17629j;
                                        if (n08) {
                                            z17 = false;
                                            if (z17) {
                                            }
                                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                            na.c cVar222 = dVar2.f17630k;
                                            if (n09) {
                                            }
                                            z18 = true;
                                            if (z18) {
                                            }
                                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                            int i102222 = dVar2.f17631l;
                                            if (!n010) {
                                            }
                                            z19 = true;
                                            if (z19) {
                                            }
                                            b5.a(pluginGeneratedSerialDescriptor);
                                        }
                                        z17 = true;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        na.c cVar2222 = dVar2.f17630k;
                                        if (n09) {
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i1022222 = dVar2.f17631l;
                                        if (!n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z15 = true;
                                    if (z15) {
                                    }
                                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                    Comparable comparable2 = dVar2.f17628i;
                                    if (n07) {
                                        z16 = false;
                                        if (z16) {
                                        }
                                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                        boolean z2222 = dVar2.f17629j;
                                        if (n08) {
                                        }
                                        z17 = true;
                                        if (z17) {
                                        }
                                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                        na.c cVar22222 = dVar2.f17630k;
                                        if (n09) {
                                        }
                                        z18 = true;
                                        if (z18) {
                                        }
                                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                        int i10222222 = dVar2.f17631l;
                                        if (!n010) {
                                        }
                                        z19 = true;
                                        if (z19) {
                                        }
                                        b5.a(pluginGeneratedSerialDescriptor);
                                    }
                                    z16 = true;
                                    if (z16) {
                                    }
                                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z22222 = dVar2.f17629j;
                                    if (n08) {
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                    na.c cVar222222 = dVar2.f17630k;
                                    if (n09) {
                                    }
                                    z18 = true;
                                    if (z18) {
                                    }
                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i102222222 = dVar2.f17631l;
                                    if (!n010) {
                                    }
                                    z19 = true;
                                    if (z19) {
                                    }
                                    b5.a(pluginGeneratedSerialDescriptor);
                                }
                                z14 = true;
                                if (z14) {
                                }
                                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z212 = dVar2.f17627h;
                                if (n06) {
                                    z15 = false;
                                    if (z15) {
                                    }
                                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                    Comparable comparable22 = dVar2.f17628i;
                                    if (n07) {
                                    }
                                    z16 = true;
                                    if (z16) {
                                    }
                                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                    boolean z222222 = dVar2.f17629j;
                                    if (n08) {
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                    na.c cVar2222222 = dVar2.f17630k;
                                    if (n09) {
                                    }
                                    z18 = true;
                                    if (z18) {
                                    }
                                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                    int i1022222222 = dVar2.f17631l;
                                    if (!n010) {
                                    }
                                    z19 = true;
                                    if (z19) {
                                    }
                                    b5.a(pluginGeneratedSerialDescriptor);
                                }
                                z15 = true;
                                if (z15) {
                                }
                                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                                Comparable comparable222 = dVar2.f17628i;
                                if (n07) {
                                }
                                z16 = true;
                                if (z16) {
                                }
                                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                                boolean z2222222 = dVar2.f17629j;
                                if (n08) {
                                }
                                z17 = true;
                                if (z17) {
                                }
                                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                                na.c cVar22222222 = dVar2.f17630k;
                                if (n09) {
                                }
                                z18 = true;
                                if (z18) {
                                }
                                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                                int i10222222222 = dVar2.f17631l;
                                if (!n010) {
                                }
                                z19 = true;
                                if (z19) {
                                }
                                b5.a(pluginGeneratedSerialDescriptor);
                            }
                        }
                        z13 = true;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z202 = dVar2.f17626g;
                        if (n05) {
                            z14 = false;
                            if (z14) {
                            }
                            n06 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z2122 = dVar2.f17627h;
                            if (n06) {
                            }
                            z15 = true;
                            if (z15) {
                            }
                            n07 = b5.n0(pluginGeneratedSerialDescriptor);
                            Comparable comparable2222 = dVar2.f17628i;
                            if (n07) {
                            }
                            z16 = true;
                            if (z16) {
                            }
                            n08 = b5.n0(pluginGeneratedSerialDescriptor);
                            boolean z22222222 = dVar2.f17629j;
                            if (n08) {
                            }
                            z17 = true;
                            if (z17) {
                            }
                            n09 = b5.n0(pluginGeneratedSerialDescriptor);
                            na.c cVar222222222 = dVar2.f17630k;
                            if (n09) {
                            }
                            z18 = true;
                            if (z18) {
                            }
                            n010 = b5.n0(pluginGeneratedSerialDescriptor);
                            int i102222222222 = dVar2.f17631l;
                            if (!n010) {
                            }
                            z19 = true;
                            if (z19) {
                            }
                            b5.a(pluginGeneratedSerialDescriptor);
                        }
                        z14 = true;
                        if (z14) {
                        }
                        n06 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z21222 = dVar2.f17627h;
                        if (n06) {
                        }
                        z15 = true;
                        if (z15) {
                        }
                        n07 = b5.n0(pluginGeneratedSerialDescriptor);
                        Comparable comparable22222 = dVar2.f17628i;
                        if (n07) {
                        }
                        z16 = true;
                        if (z16) {
                        }
                        n08 = b5.n0(pluginGeneratedSerialDescriptor);
                        boolean z222222222 = dVar2.f17629j;
                        if (n08) {
                        }
                        z17 = true;
                        if (z17) {
                        }
                        n09 = b5.n0(pluginGeneratedSerialDescriptor);
                        na.c cVar2222222222 = dVar2.f17630k;
                        if (n09) {
                        }
                        z18 = true;
                        if (z18) {
                        }
                        n010 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i1022222222222 = dVar2.f17631l;
                        if (!n010) {
                        }
                        z19 = true;
                        if (z19) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z12 = true;
                    if (z12) {
                    }
                    b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar3 = dVar2.f17625f;
                    if (n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z2022 = dVar2.f17626g;
                    if (n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z212222 = dVar2.f17627h;
                    if (n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable222222 = dVar2.f17628i;
                    if (n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z2222222222 = dVar2.f17629j;
                    if (n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar22222222222 = dVar2.f17630k;
                    if (n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i10222222222222 = dVar2.f17631l;
                    if (!n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z11 = true;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                String str22 = dVar2.f17623d;
                if (!n03) {
                    z12 = false;
                    if (z12) {
                    }
                    b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar32 = dVar2.f17625f;
                    if (n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z20222 = dVar2.f17626g;
                    if (n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    n06 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z2122222 = dVar2.f17627h;
                    if (n06) {
                    }
                    z15 = true;
                    if (z15) {
                    }
                    n07 = b5.n0(pluginGeneratedSerialDescriptor);
                    Comparable comparable2222222 = dVar2.f17628i;
                    if (n07) {
                    }
                    z16 = true;
                    if (z16) {
                    }
                    n08 = b5.n0(pluginGeneratedSerialDescriptor);
                    boolean z22222222222 = dVar2.f17629j;
                    if (n08) {
                    }
                    z17 = true;
                    if (z17) {
                    }
                    n09 = b5.n0(pluginGeneratedSerialDescriptor);
                    na.c cVar222222222222 = dVar2.f17630k;
                    if (n09) {
                    }
                    z18 = true;
                    if (z18) {
                    }
                    n010 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i102222222222222 = dVar2.f17631l;
                    if (!n010) {
                    }
                    z19 = true;
                    if (z19) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z12 = true;
                if (z12) {
                }
                b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar322 = dVar2.f17625f;
                if (n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z202222 = dVar2.f17626g;
                if (n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z21222222 = dVar2.f17627h;
                if (n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable22222222 = dVar2.f17628i;
                if (n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z222222222222 = dVar2.f17629j;
                if (n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar2222222222222 = dVar2.f17630k;
                if (n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                int i1022222222222222 = dVar2.f17631l;
                if (!n010) {
                }
                z19 = true;
                if (z19) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            b5.h(pluginGeneratedSerialDescriptor, 1, dVar2.f17622b);
            n02 = b5.n0(pluginGeneratedSerialDescriptor);
            String str3 = dVar2.c;
            if (!n02) {
                z11 = false;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                String str222 = dVar2.f17623d;
                if (!n03) {
                }
                z12 = true;
                if (z12) {
                }
                b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar3222 = dVar2.f17625f;
                if (n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z2022222 = dVar2.f17626g;
                if (n05) {
                }
                z14 = true;
                if (z14) {
                }
                n06 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z212222222 = dVar2.f17627h;
                if (n06) {
                }
                z15 = true;
                if (z15) {
                }
                n07 = b5.n0(pluginGeneratedSerialDescriptor);
                Comparable comparable222222222 = dVar2.f17628i;
                if (n07) {
                }
                z16 = true;
                if (z16) {
                }
                n08 = b5.n0(pluginGeneratedSerialDescriptor);
                boolean z2222222222222 = dVar2.f17629j;
                if (n08) {
                }
                z17 = true;
                if (z17) {
                }
                n09 = b5.n0(pluginGeneratedSerialDescriptor);
                na.c cVar22222222222222 = dVar2.f17630k;
                if (n09) {
                }
                z18 = true;
                if (z18) {
                }
                n010 = b5.n0(pluginGeneratedSerialDescriptor);
                int i10222222222222222 = dVar2.f17631l;
                if (!n010) {
                }
                z19 = true;
                if (z19) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z11 = true;
            if (z11) {
            }
            n03 = b5.n0(pluginGeneratedSerialDescriptor);
            String str2222 = dVar2.f17623d;
            if (!n03) {
            }
            z12 = true;
            if (z12) {
            }
            b5.r(4, dVar2.f17624e, pluginGeneratedSerialDescriptor);
            n04 = b5.n0(pluginGeneratedSerialDescriptor);
            na.c cVar32222 = dVar2.f17625f;
            if (n04) {
            }
            z13 = true;
            if (z13) {
            }
            n05 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z20222222 = dVar2.f17626g;
            if (n05) {
            }
            z14 = true;
            if (z14) {
            }
            n06 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z2122222222 = dVar2.f17627h;
            if (n06) {
            }
            z15 = true;
            if (z15) {
            }
            n07 = b5.n0(pluginGeneratedSerialDescriptor);
            Comparable comparable2222222222 = dVar2.f17628i;
            if (n07) {
            }
            z16 = true;
            if (z16) {
            }
            n08 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z22222222222222 = dVar2.f17629j;
            if (n08) {
            }
            z17 = true;
            if (z17) {
            }
            n09 = b5.n0(pluginGeneratedSerialDescriptor);
            na.c cVar222222222222222 = dVar2.f17630k;
            if (n09) {
            }
            z18 = true;
            if (z18) {
            }
            n010 = b5.n0(pluginGeneratedSerialDescriptor);
            int i102222222222222222 = dVar2.f17631l;
            if (!n010) {
            }
            z19 = true;
            if (z19) {
            }
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            x0 x0Var = x0.f18029a;
            s1 s1Var = s1.f18010a;
            n0 n0Var = n0.f17993a;
            pa.d dVar = pa.d.f16791a;
            ua.h hVar = ua.h.f17975a;
            return new qa.b[]{x0Var, x0Var, s1Var, s1Var, n0Var, dVar, hVar, hVar, ra.a.a(dVar), hVar, dVar, n0Var};
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
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17633b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            Object obj = null;
            String str = null;
            String str2 = null;
            long j2 = 0;
            long j10 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i15 = 0;
            na.c cVar2 = null;
            Object obj2 = null;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                switch (t10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        j2 = b5.y(pluginGeneratedSerialDescriptor, 0);
                        i13 |= 1;
                        break;
                    case 1:
                        j10 = b5.y(pluginGeneratedSerialDescriptor, 1);
                        i11 = i13 | 2;
                        i13 = i11;
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        str = b5.E(pluginGeneratedSerialDescriptor, 2);
                        i12 = i13 | 4;
                        i11 = i12;
                        i13 = i11;
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        str2 = b5.E(pluginGeneratedSerialDescriptor, 3);
                        i12 = i13 | 8;
                        i11 = i12;
                        i13 = i11;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        i14 = b5.u(pluginGeneratedSerialDescriptor, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        obj2 = b5.A(pluginGeneratedSerialDescriptor, 5, pa.d.f16791a, obj2);
                        i10 = i13 | 32;
                        i13 = i10;
                        break;
                    case 6:
                        z11 = b5.e0(pluginGeneratedSerialDescriptor, 6);
                        i10 = i13 | 64;
                        i13 = i10;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        z12 = b5.e0(pluginGeneratedSerialDescriptor, 7);
                        i10 = i13 | 128;
                        i13 = i10;
                        break;
                    case 8:
                        obj = b5.Y(pluginGeneratedSerialDescriptor, 8, pa.d.f16791a, obj);
                        i10 = i13 | 256;
                        i13 = i10;
                        break;
                    case ma.i.f16046m /* 9 */:
                        z13 = b5.e0(pluginGeneratedSerialDescriptor, 9);
                        i10 = i13 | 512;
                        i13 = i10;
                        break;
                    case ma.i.f16047o /* 10 */:
                        i10 = i13 | 1024;
                        cVar2 = b5.A(pluginGeneratedSerialDescriptor, 10, pa.d.f16791a, cVar2);
                        i13 = i10;
                        break;
                    case 11:
                        i15 = b5.u(pluginGeneratedSerialDescriptor, 11);
                        i10 = i13 | 2048;
                        i13 = i10;
                        break;
                    default:
                        throw new UnknownFieldException(t10);
                }
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new d(i13, j2, j10, str, str2, i14, (na.c) obj2, z11, z12, (na.c) obj, z13, cVar2, i15);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<d> serializer() {
            return a.f17632a;
        }
    }

    public d(int i10, long j2, long j10, String str, String str2, int i11, na.c cVar, boolean z10, boolean z11, na.c cVar2, boolean z12, na.c cVar3, int i12) {
        na.c cVar4;
        if (18 == (i10 & 18)) {
            this.f17621a = (i10 & 1) == 0 ? 0L : j2;
            this.f17622b = j10;
            this.c = (i10 & 4) == 0 ? new String() : str;
            this.f17623d = (i10 & 8) == 0 ? new String() : str2;
            this.f17624e = i11;
            if ((i10 & 32) == 0) {
                na.c.Companion.getClass();
                Instant instant = Clock.systemUTC().instant();
                v7.g.e(instant, "systemUTC().instant()");
                cVar4 = new na.c(instant);
            } else {
                cVar4 = cVar;
            }
            this.f17625f = cVar4;
            if ((i10 & 64) == 0) {
                this.f17626g = false;
            } else {
                this.f17626g = z10;
            }
            if ((i10 & 128) == 0) {
                this.f17627h = false;
            } else {
                this.f17627h = z11;
            }
            if ((i10 & 256) == 0) {
                this.f17628i = null;
            } else {
                this.f17628i = cVar2;
            }
            if ((i10 & 512) == 0) {
                this.f17629j = false;
            } else {
                this.f17629j = z12;
            }
            if ((i10 & 1024) != 0) {
                cVar4 = cVar3;
            }
            this.f17630k = cVar4;
            if ((i10 & 2048) == 0) {
                this.f17631l = 0;
                return;
            } else {
                this.f17631l = i12;
                return;
            }
        }
        a1.b.F0(i10, 18, a.f17633b);
        throw null;
    }

    public d(long j2, long j10, String str, String str2, int i10, na.c cVar, boolean z10, boolean z11, na.c cVar2, boolean z12, na.c cVar3, int i11) {
        v7.g.f(str, "title");
        v7.g.f(str2, "body");
        v7.g.f(cVar, "creationDate");
        v7.g.f(cVar3, "accessDate");
        this.f17621a = j2;
        this.f17622b = j10;
        this.c = str;
        this.f17623d = str2;
        this.f17624e = i10;
        this.f17625f = cVar;
        this.f17626g = z10;
        this.f17627h = z11;
        this.f17628i = cVar2;
        this.f17629j = z12;
        this.f17630k = cVar3;
        this.f17631l = i11;
    }

    public static d a(d dVar, long j2, long j10, String str, String str2, int i10, boolean z10, boolean z11, na.c cVar, na.c cVar2, int i11, int i12) {
        long j11 = (i12 & 1) != 0 ? dVar.f17621a : j2;
        long j12 = (i12 & 2) != 0 ? dVar.f17622b : j10;
        String str3 = (i12 & 4) != 0 ? dVar.c : str;
        String str4 = (i12 & 8) != 0 ? dVar.f17623d : str2;
        int i13 = (i12 & 16) != 0 ? dVar.f17624e : i10;
        na.c cVar3 = (i12 & 32) != 0 ? dVar.f17625f : null;
        boolean z12 = (i12 & 64) != 0 ? dVar.f17626g : z10;
        boolean z13 = (i12 & 128) != 0 ? dVar.f17627h : z11;
        na.c cVar4 = (i12 & 256) != 0 ? dVar.f17628i : cVar;
        boolean z14 = (i12 & 512) != 0 ? dVar.f17629j : false;
        na.c cVar5 = (i12 & 1024) != 0 ? dVar.f17630k : cVar2;
        int i14 = (i12 & 2048) != 0 ? dVar.f17631l : i11;
        dVar.getClass();
        v7.g.f(str3, "title");
        v7.g.f(str4, "body");
        v7.g.f(cVar3, "creationDate");
        v7.g.f(cVar5, "accessDate");
        return new d(j11, j12, str3, str4, i13, cVar3, z12, z13, cVar4, z14, cVar5, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f17621a == dVar.f17621a && this.f17622b == dVar.f17622b && v7.g.a(this.c, dVar.c) && v7.g.a(this.f17623d, dVar.f17623d) && this.f17624e == dVar.f17624e && v7.g.a(this.f17625f, dVar.f17625f) && this.f17626g == dVar.f17626g && this.f17627h == dVar.f17627h && v7.g.a(this.f17628i, dVar.f17628i) && this.f17629j == dVar.f17629j && v7.g.a(this.f17630k, dVar.f17630k) && this.f17631l == dVar.f17631l;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        long j2 = this.f17621a;
        long j10 = this.f17622b;
        int g10 = a4.b.g(this.c, ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31);
        int hashCode2 = (this.f17625f.hashCode() + ((a4.b.g(this.f17623d, g10, 31) + this.f17624e) * 31)) * 31;
        int i10 = 1;
        boolean z10 = this.f17626g;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z11 = this.f17627h;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        na.c cVar = this.f17628i;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i15 = (i14 + hashCode) * 31;
        boolean z12 = this.f17629j;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        return ((this.f17630k.hashCode() + ((i15 + i10) * 31)) * 31) + this.f17631l;
    }

    public final String toString() {
        return "Note(id=" + this.f17621a + ", folderId=" + this.f17622b + ", title=" + this.c + ", body=" + this.f17623d + ", position=" + this.f17624e + ", creationDate=" + this.f17625f + ", isPinned=" + this.f17626g + ", isArchived=" + this.f17627h + ", reminderDate=" + this.f17628i + ", isVaulted=" + this.f17629j + ", accessDate=" + this.f17630k + ", scrollingPosition=" + this.f17631l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(long j2, long j10, String str, String str2, boolean z10, int i10) {
        this(r1, j10, r5, r6, 0, r8, (i10 & 64) != 0 ? false : z10, false, null, false, (i10 & 1024) != 0 ? r8 : null, 0);
        na.c cVar;
        long j11 = (i10 & 1) != 0 ? 0L : j2;
        String str3 = (i10 & 4) != 0 ? new String() : str;
        String str4 = (i10 & 8) != 0 ? new String() : str2;
        if ((i10 & 32) != 0) {
            na.c.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            v7.g.e(instant, "systemUTC().instant()");
            cVar = new na.c(instant);
        } else {
            cVar = null;
        }
    }
}
