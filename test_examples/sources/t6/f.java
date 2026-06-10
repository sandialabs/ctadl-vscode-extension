package t6;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import t6.a;
import t6.c;
import t6.d;
import t6.e;
import t6.v;
import ua.f0;

@qa.d
/* loaded from: classes.dex */
public final class f {
    public static final b Companion = new b();

    /* renamed from: a  reason: collision with root package name */
    public final List<t6.a> f17638a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f17639b;
    public final List<c> c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f17640d;

    /* renamed from: e  reason: collision with root package name */
    public final v f17641e;

    /* loaded from: classes.dex */
    public static final class a implements f0<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17642a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17643b;

        static {
            a aVar = new a();
            f17642a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.noto.app.domain.model.NotoData", aVar, 5);
            pluginGeneratedSerialDescriptor.l("folders", true);
            pluginGeneratedSerialDescriptor.l("notes", true);
            pluginGeneratedSerialDescriptor.l("labels", true);
            pluginGeneratedSerialDescriptor.l("noteLabels", true);
            pluginGeneratedSerialDescriptor.l("settings", true);
            f17643b = pluginGeneratedSerialDescriptor;
        }

        @Override // qa.b, qa.e, qa.a
        public final sa.e a() {
            return f17643b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
            if (v7.g.a(r8, new t6.v(0)) != false) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
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
            f fVar = (f) obj;
            v7.g.f(dVar, "encoder");
            v7.g.f(fVar, "value");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17643b;
            ta.b b5 = dVar.b(pluginGeneratedSerialDescriptor);
            b bVar = f.Companion;
            v7.g.f(b5, "output");
            v7.g.f(pluginGeneratedSerialDescriptor, "serialDesc");
            boolean n06 = b5.n0(pluginGeneratedSerialDescriptor);
            boolean z14 = false;
            List<t6.a> list = fVar.f17638a;
            if (!n06 && v7.g.a(list, EmptyList.f12981i)) {
                z10 = false;
                if (z10) {
                    b5.g0(pluginGeneratedSerialDescriptor, 0, new ua.e(a.C0226a.f17611a), list);
                }
                n02 = b5.n0(pluginGeneratedSerialDescriptor);
                List<d> list2 = fVar.f17639b;
                if (!n02 && v7.g.a(list2, EmptyList.f12981i)) {
                    z11 = false;
                    if (z11) {
                        b5.g0(pluginGeneratedSerialDescriptor, 1, new ua.e(d.a.f17632a), list2);
                    }
                    n03 = b5.n0(pluginGeneratedSerialDescriptor);
                    List<c> list3 = fVar.c;
                    if (!n03 && v7.g.a(list3, EmptyList.f12981i)) {
                        z12 = false;
                        if (z12) {
                            b5.g0(pluginGeneratedSerialDescriptor, 2, new ua.e(c.a.f17619a), list3);
                        }
                        n04 = b5.n0(pluginGeneratedSerialDescriptor);
                        List<e> list4 = fVar.f17640d;
                        if (!n04 && v7.g.a(list4, EmptyList.f12981i)) {
                            z13 = false;
                            if (z13) {
                                b5.g0(pluginGeneratedSerialDescriptor, 3, new ua.e(e.a.f17636a), list4);
                            }
                            n05 = b5.n0(pluginGeneratedSerialDescriptor);
                            v vVar = fVar.f17641e;
                            if (!n05) {
                            }
                            z14 = true;
                            if (z14) {
                                b5.g0(pluginGeneratedSerialDescriptor, 4, v.a.f17693a, vVar);
                            }
                            b5.a(pluginGeneratedSerialDescriptor);
                        }
                        z13 = true;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        v vVar2 = fVar.f17641e;
                        if (!n05) {
                        }
                        z14 = true;
                        if (z14) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z12 = true;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    List<e> list42 = fVar.f17640d;
                    if (!n04) {
                        z13 = false;
                        if (z13) {
                        }
                        n05 = b5.n0(pluginGeneratedSerialDescriptor);
                        v vVar22 = fVar.f17641e;
                        if (!n05) {
                        }
                        z14 = true;
                        if (z14) {
                        }
                        b5.a(pluginGeneratedSerialDescriptor);
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    v vVar222 = fVar.f17641e;
                    if (!n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z11 = true;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                List<c> list32 = fVar.c;
                if (!n03) {
                    z12 = false;
                    if (z12) {
                    }
                    n04 = b5.n0(pluginGeneratedSerialDescriptor);
                    List<e> list422 = fVar.f17640d;
                    if (!n04) {
                    }
                    z13 = true;
                    if (z13) {
                    }
                    n05 = b5.n0(pluginGeneratedSerialDescriptor);
                    v vVar2222 = fVar.f17641e;
                    if (!n05) {
                    }
                    z14 = true;
                    if (z14) {
                    }
                    b5.a(pluginGeneratedSerialDescriptor);
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                List<e> list4222 = fVar.f17640d;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                v vVar22222 = fVar.f17641e;
                if (!n05) {
                }
                z14 = true;
                if (z14) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z10 = true;
            if (z10) {
            }
            n02 = b5.n0(pluginGeneratedSerialDescriptor);
            List<d> list22 = fVar.f17639b;
            if (!n02) {
                z11 = false;
                if (z11) {
                }
                n03 = b5.n0(pluginGeneratedSerialDescriptor);
                List<c> list322 = fVar.c;
                if (!n03) {
                }
                z12 = true;
                if (z12) {
                }
                n04 = b5.n0(pluginGeneratedSerialDescriptor);
                List<e> list42222 = fVar.f17640d;
                if (!n04) {
                }
                z13 = true;
                if (z13) {
                }
                n05 = b5.n0(pluginGeneratedSerialDescriptor);
                v vVar222222 = fVar.f17641e;
                if (!n05) {
                }
                z14 = true;
                if (z14) {
                }
                b5.a(pluginGeneratedSerialDescriptor);
            }
            z11 = true;
            if (z11) {
            }
            n03 = b5.n0(pluginGeneratedSerialDescriptor);
            List<c> list3222 = fVar.c;
            if (!n03) {
            }
            z12 = true;
            if (z12) {
            }
            n04 = b5.n0(pluginGeneratedSerialDescriptor);
            List<e> list422222 = fVar.f17640d;
            if (!n04) {
            }
            z13 = true;
            if (z13) {
            }
            n05 = b5.n0(pluginGeneratedSerialDescriptor);
            v vVar2222222 = fVar.f17641e;
            if (!n05) {
            }
            z14 = true;
            if (z14) {
            }
            b5.a(pluginGeneratedSerialDescriptor);
        }

        @Override // ua.f0
        public final qa.b<?>[] c() {
            return new qa.b[]{new ua.e(a.C0226a.f17611a), new ua.e(d.a.f17632a), new ua.e(c.a.f17619a), new ua.e(e.a.f17636a), v.a.f17693a};
        }

        @Override // ua.f0
        public final void d() {
        }

        @Override // qa.a
        public final Object e(ta.c cVar) {
            v7.g.f(cVar, "decoder");
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f17643b;
            ta.a b5 = cVar.b(pluginGeneratedSerialDescriptor);
            b5.C();
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int t10 = b5.t(pluginGeneratedSerialDescriptor);
                if (t10 != -1) {
                    if (t10 != 0) {
                        if (t10 != 1) {
                            if (t10 != 2) {
                                if (t10 != 3) {
                                    if (t10 == 4) {
                                        obj4 = b5.A(pluginGeneratedSerialDescriptor, 4, v.a.f17693a, obj4);
                                        i10 |= 16;
                                    } else {
                                        throw new UnknownFieldException(t10);
                                    }
                                } else {
                                    obj3 = b5.A(pluginGeneratedSerialDescriptor, 3, new ua.e(e.a.f17636a), obj3);
                                    i10 |= 8;
                                }
                            } else {
                                obj2 = b5.A(pluginGeneratedSerialDescriptor, 2, new ua.e(c.a.f17619a), obj2);
                                i10 |= 4;
                            }
                        } else {
                            obj = b5.A(pluginGeneratedSerialDescriptor, 1, new ua.e(d.a.f17632a), obj);
                            i10 |= 2;
                        }
                    } else {
                        obj5 = b5.A(pluginGeneratedSerialDescriptor, 0, new ua.e(a.C0226a.f17611a), obj5);
                        i10 |= 1;
                    }
                } else {
                    z10 = false;
                }
            }
            b5.a(pluginGeneratedSerialDescriptor);
            return new f(i10, (List) obj5, (List) obj, (List) obj2, (List) obj3, (v) obj4);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final qa.b<f> serializer() {
            return a.f17642a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f() {
        this(r4, r4, r4, r4, new v(0));
        EmptyList emptyList = EmptyList.f12981i;
    }

    public f(List<t6.a> list, List<d> list2, List<c> list3, List<e> list4, v vVar) {
        v7.g.f(list, "folders");
        v7.g.f(list2, "notes");
        v7.g.f(list3, "labels");
        v7.g.f(list4, "noteLabels");
        v7.g.f(vVar, "settings");
        this.f17638a = list;
        this.f17639b = list2;
        this.c = list3;
        this.f17640d = list4;
        this.f17641e = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return v7.g.a(this.f17638a, fVar.f17638a) && v7.g.a(this.f17639b, fVar.f17639b) && v7.g.a(this.c, fVar.c) && v7.g.a(this.f17640d, fVar.f17640d) && v7.g.a(this.f17641e, fVar.f17641e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17639b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f17640d.hashCode();
        return this.f17641e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f17638a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NotoData(folders=" + this.f17638a + ", notes=" + this.f17639b + ", labels=" + this.c + ", noteLabels=" + this.f17640d + ", settings=" + this.f17641e + ")";
    }

    public f(int i10, List list, List list2, List list3, List list4, v vVar) {
        if ((i10 & 0) == 0) {
            this.f17638a = (i10 & 1) == 0 ? EmptyList.f12981i : list;
            this.f17639b = (i10 & 2) == 0 ? EmptyList.f12981i : list2;
            this.c = (i10 & 4) == 0 ? EmptyList.f12981i : list3;
            this.f17640d = (i10 & 8) == 0 ? EmptyList.f12981i : list4;
            this.f17641e = (i10 & 16) == 0 ? new v(0) : vVar;
            return;
        }
        a1.b.F0(i10, 0, a.f17643b);
        throw null;
    }
}
