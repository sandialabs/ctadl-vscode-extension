package t6;

import com.noto.app.domain.model.NotoColor;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.f0;
import ua.n0;
import ua.s1;
import ua.x0;

@qa.d
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final long f17615a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17616b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final NotoColor f17617d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17618e;

    /* loaded from: classes.dex */
    public static final class a implements f0<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17619a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17620b;

        static {
            a aVar = new a();
            f17619a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.Label", aVar, 5);
            pluginGeneratedSerialDescriptor.l("id", true);
            pluginGeneratedSerialDescriptor.l("folderId", false);
            pluginGeneratedSerialDescriptor.l("title", true);
            pluginGeneratedSerialDescriptor.l("color", true);
            pluginGeneratedSerialDescriptor.l("position", true);
            f17620b = pluginGeneratedSerialDescriptor;
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17620b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
            if (r10 == 0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
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
            c cVar = (c) obj;
            v7.g.f(dVar, "encoder");
            v7.g.f(cVar, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17620b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = c.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n05 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z13 = false;
            long j2 = cVar.f17615a;
            if (!n05 && j2 == 0) {
                z10 = false;
                if (z10) {
                    b5.h(pluginGeneratedSerialDescriptor, 0, j2);
                }
                b5.h(pluginGeneratedSerialDescriptor, 1, cVar.f17616b);
                n02 = b5.n0(pluginGeneratedSerialDescriptor);
                String str = cVar.c;
                if (!n02 && v7.g.a(str, "")) {
                    z11 = false;
                    if (z11) {
                        b5.o0(pluginGeneratedSerialDescriptor, 2, str);
                    }
                    n03 = b5.n0(pluginGeneratedSerialDescriptor);
                    NotoColor notoColor = cVar.f17617d;
                    if (!n03 && notoColor == NotoColor.Gray) {
                        z12 = false;
                        if (z12) {
                            b5.g0(pluginGeneratedSerialDescriptor, 3, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), notoColor);
                        }
                        n04 = b5.n0(pluginGeneratedSerialDescriptor);
                        int i10 = cVar.f17618e;
                        if (!n04) {
                        }
                        z13 = true;
                        if (z13) {
                            b5.r(4, i10, pluginGeneratedSerialDescriptor);
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z12 = true;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i102 = cVar.f17618e;
                    if (!n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z11 = true;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                NotoColor notoColor2 = cVar.f17617d;
                if (!n03) {
                    z12 = false;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    int i1022 = cVar.f17618e;
                    if (!n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                int i10222 = cVar.f17618e;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            b5.h(pluginGeneratedSerialDescriptor, 1, cVar.f17616b);
            n02 = b5.n0(pluginGeneratedSerialDescriptor);
            String str2 = cVar.c;
            if (!n02) {
                z11 = false;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                NotoColor notoColor22 = cVar.f17617d;
                if (!n03) {
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                int i102222 = cVar.f17618e;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z11 = true;
            if (z11) {
            }
            n03 = b5.n0(pluginGeneratedSerialDescriptor);
            NotoColor notoColor222 = cVar.f17617d;
            if (!n03) {
            }
            z12 = true;
            if (z12) {
            }
            n04 = b5.n0(pluginGeneratedSerialDescriptor);
            int i1022222 = cVar.f17618e;
            if (!n04) {
            }
            z13 = true;
            if (z13) {
            }
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            x0 x0Var = x0.f18029a;
            return new qa.b[]{x0Var, x0Var, s1.f18010a, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), n0.f17993a};
        }

        @Override // ua.f0
        public final void d() {
        }

        @Override // qa.a
        public final Object e(ta.c cVar) {
            v7.g.f(cVar, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17620b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            Object obj = null;
            String str = null;
            long j2 = 0;
            long j10 = 0;
            boolean z10 = true;
            int i10 = 0;
            int i11 = 0;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                if (t10 != -1) {
                    if (t10 != 0) {
                        if (t10 != 1) {
                            if (t10 != 2) {
                                if (t10 != 3) {
                                    if (t10 == 4) {
                                        i10 |= 16;
                                        i11 = b5.u(pluginGeneratedSerialDescriptor, 4);
                                    } else {
                                        throw new UnknownFieldException(t10);
                                    }
                                } else {
                                    obj = b5.A(pluginGeneratedSerialDescriptor, 3, a1.b.I("com.noto.app.domain.model.NotoColor", NotoColor.values()), obj);
                                    i10 |= 8;
                                }
                            } else {
                                str = b5.E(pluginGeneratedSerialDescriptor, 2);
                                i10 |= 4;
                            }
                        } else {
                            j10 = b5.y(pluginGeneratedSerialDescriptor, 1);
                            i10 |= 2;
                        }
                    } else {
                        j2 = b5.y(pluginGeneratedSerialDescriptor, 0);
                        i10 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new c(i10, j2, j10, str, (NotoColor) obj, i11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<c> serializer() {
            return a.f17619a;
        }
    }

    public c(int i10, long j2, long j10, String str, NotoColor notoColor, int i11) {
        if (2 != (i10 & 2)) {
            a1.b.F0(i10, 2, a.f17620b);
            throw null;
        }
        this.f17615a = (i10 & 1) == 0 ? 0L : j2;
        this.f17616b = j10;
        if ((i10 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i10 & 8) == 0) {
            this.f17617d = NotoColor.Gray;
        } else {
            this.f17617d = notoColor;
        }
        if ((i10 & 16) == 0) {
            this.f17618e = 0;
        } else {
            this.f17618e = i11;
        }
    }

    public c(long j2, long j10, String str, NotoColor notoColor, int i10) {
        v7.g.f(str, "title");
        v7.g.f(notoColor, "color");
        this.f17615a = j2;
        this.f17616b = j10;
        this.c = str;
        this.f17617d = notoColor;
        this.f17618e = i10;
    }

    public static c a(c cVar, long j2, String str, int i10, int i11) {
        long j10;
        NotoColor notoColor;
        if ((i11 & 1) != 0) {
            j10 = cVar.f17615a;
        } else {
            j10 = 0;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            j2 = cVar.f17616b;
        }
        long j12 = j2;
        if ((i11 & 4) != 0) {
            str = cVar.c;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            notoColor = cVar.f17617d;
        } else {
            notoColor = null;
        }
        NotoColor notoColor2 = notoColor;
        if ((i11 & 16) != 0) {
            i10 = cVar.f17618e;
        }
        cVar.getClass();
        v7.g.f(str2, "title");
        v7.g.f(notoColor2, "color");
        return new c(j11, j12, str2, notoColor2, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f17615a == cVar.f17615a && this.f17616b == cVar.f17616b && v7.g.a(this.c, cVar.c) && this.f17617d == cVar.f17617d && this.f17618e == cVar.f17618e;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f17615a;
        long j10 = this.f17616b;
        return ((this.f17617d.hashCode() + a4.b.g(this.c, ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31)) * 31) + this.f17618e;
    }

    public final String toString() {
        return "Label(id=" + this.f17615a + ", folderId=" + this.f17616b + ", title=" + this.c + ", color=" + this.f17617d + ", position=" + this.f17618e + ")";
    }
}
