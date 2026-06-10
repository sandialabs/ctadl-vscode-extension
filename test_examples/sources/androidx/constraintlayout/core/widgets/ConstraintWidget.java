package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final ConstraintAnchor K;
    public final ConstraintAnchor L;
    public final ConstraintAnchor M;
    public final ConstraintAnchor N;
    public final ConstraintAnchor O;
    public final ConstraintAnchor P;
    public final ConstraintAnchor Q;
    public final ConstraintAnchor R;
    public final ConstraintAnchor[] S;
    public final ArrayList<ConstraintAnchor> T;
    public final boolean[] U;
    public final DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4237a0;

    /* renamed from: b  reason: collision with root package name */
    public g2.c f4238b;

    /* renamed from: b0  reason: collision with root package name */
    public int f4239b0;
    public g2.c c;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4241d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f4243e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f4245f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f4247g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f4249h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f4251i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4253j0;

    /* renamed from: k  reason: collision with root package name */
    public String f4254k;

    /* renamed from: k0  reason: collision with root package name */
    public String f4255k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4256l;

    /* renamed from: l0  reason: collision with root package name */
    public int f4257l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4258m;

    /* renamed from: m0  reason: collision with root package name */
    public int f4259m0;
    public boolean n;

    /* renamed from: n0  reason: collision with root package name */
    public final float[] f4260n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4261o;

    /* renamed from: o0  reason: collision with root package name */
    public final ConstraintWidget[] f4262o0;

    /* renamed from: p  reason: collision with root package name */
    public int f4263p;

    /* renamed from: p0  reason: collision with root package name */
    public final ConstraintWidget[] f4264p0;

    /* renamed from: q  reason: collision with root package name */
    public int f4265q;

    /* renamed from: q0  reason: collision with root package name */
    public int f4266q0;

    /* renamed from: r  reason: collision with root package name */
    public int f4267r;

    /* renamed from: r0  reason: collision with root package name */
    public int f4268r0;

    /* renamed from: s  reason: collision with root package name */
    public int f4269s;

    /* renamed from: t  reason: collision with root package name */
    public int f4270t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f4271u;

    /* renamed from: v  reason: collision with root package name */
    public int f4272v;

    /* renamed from: w  reason: collision with root package name */
    public int f4273w;

    /* renamed from: x  reason: collision with root package name */
    public float f4274x;

    /* renamed from: y  reason: collision with root package name */
    public int f4275y;

    /* renamed from: z  reason: collision with root package name */
    public int f4276z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4236a = false;

    /* renamed from: d  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f4240d = null;

    /* renamed from: e  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f4242e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4244f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f4246g = true;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4248h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f4250i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f4252j = -1;

    /* loaded from: classes.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        new HashMap();
        this.f4256l = false;
        this.f4258m = false;
        this.n = false;
        this.f4261o = false;
        this.f4263p = -1;
        this.f4265q = -1;
        this.f4267r = 0;
        this.f4269s = 0;
        this.f4270t = 0;
        this.f4271u = new int[2];
        this.f4272v = 0;
        this.f4273w = 0;
        this.f4274x = 1.0f;
        this.f4275y = 0;
        this.f4276z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.O = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.P = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.Q = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.R = constraintAnchor8;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f4237a0 = -1;
        this.f4239b0 = 0;
        this.c0 = 0;
        this.f4241d0 = 0;
        this.f4247g0 = 0.5f;
        this.f4249h0 = 0.5f;
        this.f4253j0 = 0;
        this.f4255k0 = null;
        this.f4257l0 = 0;
        this.f4259m0 = 0;
        this.f4260n0 = new float[]{-1.0f, -1.0f};
        this.f4262o0 = new ConstraintWidget[]{null, null};
        this.f4264p0 = new ConstraintWidget[]{null, null};
        this.f4266q0 = -1;
        this.f4268r0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public static void G(int i10, int i11, String str, StringBuilder sb) {
        if (i10 == i11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i10);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f10);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i10, 0, "      size", sb);
        G(i11, 0, "      min", sb);
        G(i12, Integer.MAX_VALUE, "      max", sb);
        G(i13, 0, "      matchMin", sb);
        G(i14, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f10, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f4224f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f4224f);
        sb.append("'");
        if (constraintAnchor.f4226h != Integer.MIN_VALUE || constraintAnchor.f4225g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f4225g);
            if (constraintAnchor.f4226h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f4226h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.f4256l && (!this.K.c || !this.M.c)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        if (!this.f4258m && (!this.L.c || !this.N.c)) {
            return false;
        }
        return true;
    }

    public void C() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f4237a0 = -1;
        this.f4239b0 = 0;
        this.c0 = 0;
        this.f4241d0 = 0;
        this.f4243e0 = 0;
        this.f4245f0 = 0;
        this.f4247g0 = 0.5f;
        this.f4249h0 = 0.5f;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f4251i0 = null;
        this.f4253j0 = 0;
        this.f4257l0 = 0;
        this.f4259m0 = 0;
        float[] fArr = this.f4260n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4263p = -1;
        this.f4265q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4269s = 0;
        this.f4270t = 0;
        this.f4274x = 1.0f;
        this.A = 1.0f;
        this.f4273w = Integer.MAX_VALUE;
        this.f4276z = Integer.MAX_VALUE;
        this.f4272v = 0;
        this.f4275y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f4244f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4246g = true;
        int[] iArr2 = this.f4271u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4250i = -1;
        this.f4252j = -1;
    }

    public final void D() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).j();
        }
    }

    public final void E() {
        this.f4256l = false;
        this.f4258m = false;
        this.n = false;
        this.f4261o = false;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i10);
            constraintAnchor.c = false;
            constraintAnchor.f4221b = 0;
        }
    }

    public void F(d2.a aVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void I(int i10, int i11) {
        if (this.f4256l) {
            return;
        }
        this.K.l(i10);
        this.M.l(i11);
        this.f4239b0 = i10;
        this.X = i11 - i10;
        this.f4256l = true;
    }

    public final void J(int i10, int i11) {
        if (this.f4258m) {
            return;
        }
        this.L.l(i10);
        this.N.l(i11);
        this.c0 = i10;
        this.Y = i11 - i10;
        if (this.F) {
            this.O.l(i10 + this.f4241d0);
        }
        this.f4258m = true;
    }

    public final void K(int i10) {
        this.Y = i10;
        int i11 = this.f4245f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void L(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public final void M(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public final void N(int i10) {
        this.X = i10;
        int i11 = this.f4243e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void O(boolean z10, boolean z11) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.f4240d;
        boolean z12 = z10 & cVar.f4310g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f4242e;
        boolean z13 = z11 & dVar.f4310g;
        int i12 = cVar.f4311h.f4291g;
        int i13 = dVar.f4311h.f4291g;
        int i14 = cVar.f4312i.f4291g;
        int i15 = dVar.f4312i.f4291g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f4239b0 = i12;
        }
        if (z13) {
            this.c0 = i13;
        }
        if (this.f4253j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        if (z12) {
            if (dimensionBehaviourArr[0] == dimensionBehaviour && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f4243e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z13) {
            if (dimensionBehaviourArr[1] == dimensionBehaviour && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f4245f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void P(androidx.constraintlayout.core.c cVar, boolean z10) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        androidx.constraintlayout.core.widgets.analyzer.c cVar2;
        cVar.getClass();
        int o10 = androidx.constraintlayout.core.c.o(this.K);
        int o11 = androidx.constraintlayout.core.c.o(this.L);
        int o12 = androidx.constraintlayout.core.c.o(this.M);
        int o13 = androidx.constraintlayout.core.c.o(this.N);
        if (z10 && (cVar2 = this.f4240d) != null) {
            DependencyNode dependencyNode = cVar2.f4311h;
            if (dependencyNode.f4294j) {
                DependencyNode dependencyNode2 = cVar2.f4312i;
                if (dependencyNode2.f4294j) {
                    o10 = dependencyNode.f4291g;
                    o12 = dependencyNode2.f4291g;
                }
            }
        }
        if (z10 && (dVar = this.f4242e) != null) {
            DependencyNode dependencyNode3 = dVar.f4311h;
            if (dependencyNode3.f4294j) {
                DependencyNode dependencyNode4 = dVar.f4312i;
                if (dependencyNode4.f4294j) {
                    o11 = dependencyNode3.f4291g;
                    o13 = dependencyNode4.f4291g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o10 = 0;
            o11 = 0;
            o12 = 0;
            o13 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f4239b0 = o10;
        this.c0 = o11;
        if (this.f4253j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i15 = this.f4245f0;
        if (i14 < i15) {
            this.Y = i15;
        }
        int i16 = this.f4243e0;
        if (i13 < i16) {
            this.X = i16;
        }
        int i17 = this.f4273w;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (i17 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.X = Math.min(this.X, i17);
        }
        int i18 = this.f4276z;
        if (i18 > 0 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
            this.Y = Math.min(this.Y, i18);
        }
        int i19 = this.X;
        if (i13 != i19) {
            this.f4250i = i19;
        }
        int i20 = this.Y;
        if (i14 != i20) {
            this.f4252j = i20;
        }
    }

    public final void b(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            c(cVar, dVar.V(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.K.f4220a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f4222d.b(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.M.f4220a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f4222d.b(dVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.L.f4220a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f4222d.b(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.N.f4220a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f4222d.b(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.O.f4220a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f4222d.b(dVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[LOOP:0: B:25:0x0067->B:35:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean[] zArr;
        DimensionBehaviour dimensionBehaviour;
        boolean z14;
        boolean[] zArr2;
        boolean z15;
        boolean z16;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        WeakReference<ConstraintAnchor> weakReference;
        ConstraintAnchor constraintAnchor;
        boolean z17;
        boolean z18;
        int i11;
        int i12;
        int i13;
        int i14;
        DimensionBehaviour dimensionBehaviour2;
        DimensionBehaviour dimensionBehaviour3;
        boolean z19;
        DimensionBehaviour dimensionBehaviour4;
        boolean z20;
        float f10;
        DimensionBehaviour[] dimensionBehaviourArr;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z21;
        int i19;
        boolean z22;
        char c;
        boolean z23;
        DimensionBehaviour dimensionBehaviour5;
        boolean z24;
        int i20;
        ConstraintAnchor constraintAnchor2;
        boolean z25;
        boolean z26;
        int i21;
        int[] iArr;
        DimensionBehaviour dimensionBehaviour6;
        DimensionBehaviour dimensionBehaviour7;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        DimensionBehaviour[] dimensionBehaviourArr2;
        ConstraintAnchor constraintAnchor5;
        int[] iArr2;
        int i22;
        int i23;
        char c10;
        ConstraintWidget constraintWidget3;
        androidx.constraintlayout.core.c cVar2;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        boolean z27;
        boolean z28;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        SolverVariable solverVariable12;
        SolverVariable solverVariable13;
        SolverVariable solverVariable14;
        boolean z29;
        SolverVariable solverVariable15;
        SolverVariable solverVariable16;
        boolean z30;
        boolean z31;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariable17;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariable18;
        boolean z32;
        androidx.constraintlayout.core.widgets.analyzer.c cVar3;
        DependencyNode dependencyNode;
        int i24;
        int i25;
        int i26;
        boolean x3;
        boolean y10;
        boolean z33;
        androidx.constraintlayout.core.widgets.analyzer.c cVar4;
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        ConstraintAnchor constraintAnchor6 = this.K;
        SolverVariable l2 = cVar.l(constraintAnchor6);
        ConstraintAnchor constraintAnchor7 = this.M;
        SolverVariable l4 = cVar.l(constraintAnchor7);
        ConstraintAnchor constraintAnchor8 = this.L;
        SolverVariable l7 = cVar.l(constraintAnchor8);
        ConstraintAnchor constraintAnchor9 = this.N;
        SolverVariable l10 = cVar.l(constraintAnchor9);
        ConstraintAnchor constraintAnchor10 = this.O;
        SolverVariable l11 = cVar.l(constraintAnchor10);
        ConstraintWidget constraintWidget6 = this.W;
        DimensionBehaviour dimensionBehaviour8 = DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget6 != null) {
            DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidget6.V;
            if (dimensionBehaviourArr3[0] == dimensionBehaviour8) {
                z37 = true;
            } else {
                z37 = false;
            }
            if (dimensionBehaviourArr3[1] == dimensionBehaviour8) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i27 = this.f4267r;
            if (i27 != 1) {
                if (i27 != 2) {
                    if (i27 != 3) {
                        z13 = z37;
                        z12 = z11;
                    }
                }
                z12 = z11;
                z13 = false;
            } else {
                z13 = z37;
                z12 = false;
            }
            i10 = this.f4253j0;
            zArr = this.U;
            if (i10 != 8) {
                ArrayList<ConstraintAnchor> arrayList = this.T;
                int size = arrayList.size();
                dimensionBehaviour = dimensionBehaviour8;
                int i28 = 0;
                while (true) {
                    if (i28 < size) {
                        ArrayList<ConstraintAnchor> arrayList2 = arrayList;
                        HashSet<ConstraintAnchor> hashSet = arrayList.get(i28).f4220a;
                        if (hashSet != null && hashSet.size() > 0) {
                            z36 = true;
                            if (!z36) {
                                z35 = true;
                                break;
                            } else {
                                i28++;
                                arrayList = arrayList2;
                            }
                        }
                        z36 = false;
                        if (!z36) {
                        }
                    } else {
                        z35 = false;
                        break;
                    }
                }
                if (!z35 && !zArr[0] && !zArr[1]) {
                    return;
                }
            } else {
                dimensionBehaviour = dimensionBehaviour8;
            }
            z14 = this.f4256l;
            if (!z14 && !this.f4258m) {
                zArr2 = zArr;
                boolean[] zArr3 = this.f4244f;
                if (!z10 && (cVar4 = this.f4240d) != null && (dVar = this.f4242e) != null) {
                    DependencyNode dependencyNode2 = cVar4.f4311h;
                    constraintAnchor = constraintAnchor10;
                    if (dependencyNode2.f4294j && cVar4.f4312i.f4294j && dVar.f4311h.f4294j && dVar.f4312i.f4294j) {
                        cVar.d(l2, dependencyNode2.f4291g);
                        cVar.d(l4, this.f4240d.f4312i.f4291g);
                        cVar.d(l7, this.f4242e.f4311h.f4291g);
                        cVar.d(l10, this.f4242e.f4312i.f4291g);
                        cVar.d(l11, this.f4242e.f4319k.f4291g);
                        if (this.W != null) {
                            if (z13 && zArr3[0] && !x()) {
                                cVar.f(cVar.l(this.W.M), l4, 0, 8);
                            }
                            if (z12 && zArr3[1] && !y()) {
                                z34 = false;
                                cVar.f(cVar.l(this.W.N), l10, 0, 8);
                                this.f4256l = z34;
                                this.f4258m = z34;
                                return;
                            }
                        }
                        z34 = false;
                        this.f4256l = z34;
                        this.f4258m = z34;
                        return;
                    }
                } else {
                    constraintAnchor = constraintAnchor10;
                }
                if (this.W == null) {
                    if (w(0)) {
                        ((d) this.W).R(0, this);
                        x3 = true;
                    } else {
                        x3 = x();
                    }
                    if (w(1)) {
                        ((d) this.W).R(1, this);
                        y10 = true;
                    } else {
                        y10 = y();
                    }
                    if (!x3 && z13 && this.f4253j0 != 8 && constraintAnchor6.f4224f == null && constraintAnchor7.f4224f == null) {
                        z33 = x3;
                        cVar.f(cVar.l(this.W.M), l4, 0, 1);
                    } else {
                        z33 = x3;
                    }
                    if (!y10 && z12 && this.f4253j0 != 8 && constraintAnchor8.f4224f == null && constraintAnchor9.f4224f == null && constraintAnchor == null) {
                        cVar.f(cVar.l(this.W.N), l10, 0, 1);
                    }
                    z17 = y10;
                    z18 = z33;
                } else {
                    z17 = false;
                    z18 = false;
                }
                i11 = this.X;
                i12 = this.f4243e0;
                if (i11 < i12) {
                    i12 = i11;
                }
                i13 = this.Y;
                i14 = this.f4245f0;
                if (i13 < i14) {
                    i14 = i13;
                }
                DimensionBehaviour[] dimensionBehaviourArr4 = this.V;
                int i29 = i12;
                dimensionBehaviour2 = dimensionBehaviourArr4[0];
                dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                dimensionBehaviour4 = dimensionBehaviourArr4[1];
                int i30 = i14;
                if (dimensionBehaviour4 == dimensionBehaviour3) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                int i31 = this.f4237a0;
                this.B = i31;
                f10 = this.Z;
                this.C = f10;
                int i32 = this.f4269s;
                int i33 = this.f4270t;
                if (f10 <= 0.0f) {
                    dimensionBehaviourArr = dimensionBehaviourArr4;
                    if (this.f4253j0 != 8) {
                        if (dimensionBehaviour2 == dimensionBehaviour3 && i32 == 0) {
                            i32 = 3;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour3 && i33 == 0) {
                            i33 = 3;
                        }
                        if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviour4 == dimensionBehaviour3 && i32 == 3 && i33 == 3) {
                            if (i31 == -1) {
                                if (z19 && !z20) {
                                    this.B = 0;
                                } else if (!z19 && z20) {
                                    this.B = 1;
                                    if (i31 == -1) {
                                        this.C = 1.0f / f10;
                                    }
                                }
                            }
                            if (this.B == 0 && (!constraintAnchor8.h() || !constraintAnchor9.h())) {
                                i26 = 1;
                            } else {
                                i26 = (this.B == 1 && !(constraintAnchor6.h() && constraintAnchor7.h())) ? 0 : 0;
                                if (this.B == -1 && (!constraintAnchor8.h() || !constraintAnchor9.h() || !constraintAnchor6.h() || !constraintAnchor7.h())) {
                                    if (!constraintAnchor8.h() && constraintAnchor9.h()) {
                                        this.B = 0;
                                    } else if (constraintAnchor6.h() && constraintAnchor7.h()) {
                                        this.C = 1.0f / this.C;
                                        this.B = 1;
                                    }
                                }
                                if (this.B == -1) {
                                    int i34 = this.f4272v;
                                    if (i34 > 0 && this.f4275y == 0) {
                                        this.B = 0;
                                    } else if (i34 == 0 && this.f4275y > 0) {
                                        this.C = 1.0f / this.C;
                                        this.B = 1;
                                    }
                                }
                            }
                            this.B = i26;
                            if (this.B == -1) {
                                if (!constraintAnchor8.h()) {
                                }
                                if (constraintAnchor6.h()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            if (this.B == -1) {
                            }
                        } else {
                            if (dimensionBehaviour2 == dimensionBehaviour3 && i32 == 3) {
                                this.B = 0;
                                i17 = (int) (f10 * i13);
                                if (dimensionBehaviour4 != dimensionBehaviour3) {
                                    i16 = i33;
                                    i18 = i30;
                                    z21 = false;
                                    i15 = 4;
                                }
                                i25 = i30;
                                i18 = i25;
                                i15 = i32;
                                i16 = i33;
                                z21 = true;
                            } else if (dimensionBehaviour4 == dimensionBehaviour3 && i33 == 3) {
                                this.B = 1;
                                if (i31 == -1) {
                                    this.C = 1.0f / f10;
                                }
                                i25 = (int) (this.C * i11);
                                if (dimensionBehaviour2 != dimensionBehaviour3) {
                                    i18 = i25;
                                    i15 = i32;
                                    i17 = i29;
                                    z21 = false;
                                    i16 = 4;
                                } else {
                                    i17 = i29;
                                    i18 = i25;
                                    i15 = i32;
                                    i16 = i33;
                                    z21 = true;
                                }
                            }
                            int[] iArr3 = this.f4271u;
                            iArr3[0] = i15;
                            iArr3[1] = i16;
                            if (!z21) {
                                int i35 = this.B;
                                i19 = -1;
                                if (i35 == 0 || i35 == -1) {
                                    z22 = true;
                                    if (!z21 && ((i24 = this.B) == 1 || i24 == i19)) {
                                        c = 0;
                                        z23 = true;
                                    } else {
                                        c = 0;
                                        z23 = false;
                                    }
                                    dimensionBehaviour5 = dimensionBehaviour;
                                    if (dimensionBehaviourArr[c] != dimensionBehaviour5 && (this instanceof d)) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        i20 = 0;
                                    } else {
                                        i20 = i17;
                                    }
                                    constraintAnchor2 = this.R;
                                    z25 = !constraintAnchor2.h();
                                    z26 = zArr2[0];
                                    boolean z38 = zArr2[1];
                                    i21 = this.f4263p;
                                    iArr = this.D;
                                    if (i21 != 2 && !this.f4256l) {
                                        if (z10 && (cVar3 = this.f4240d) != null) {
                                            dependencyNode = cVar3.f4311h;
                                            if (dependencyNode.f4294j && cVar3.f4312i.f4294j) {
                                                if (!z10) {
                                                    cVar.d(l2, dependencyNode.f4291g);
                                                    cVar.d(l4, this.f4240d.f4312i.f4291g);
                                                    if (this.W != null && z13 && zArr3[0] && !x()) {
                                                        cVar.f(cVar.l(this.W.M), l4, 0, 8);
                                                    }
                                                    dimensionBehaviour6 = dimensionBehaviour5;
                                                    solverVariable5 = l2;
                                                    dimensionBehaviour7 = dimensionBehaviour3;
                                                    constraintAnchor3 = constraintAnchor9;
                                                    constraintAnchor4 = constraintAnchor;
                                                    solverVariable = l7;
                                                    solverVariable2 = l10;
                                                    solverVariable3 = l11;
                                                    dimensionBehaviourArr2 = dimensionBehaviourArr;
                                                    solverVariable4 = l4;
                                                    iArr2 = iArr;
                                                    constraintAnchor5 = constraintAnchor2;
                                                    if (!z10) {
                                                        constraintWidget3 = this;
                                                        androidx.constraintlayout.core.widgets.analyzer.d dVar2 = constraintWidget3.f4242e;
                                                        if (dVar2 != null) {
                                                            DependencyNode dependencyNode3 = dVar2.f4311h;
                                                            if (dependencyNode3.f4294j && dVar2.f4312i.f4294j) {
                                                                cVar2 = cVar;
                                                                solverVariable8 = solverVariable;
                                                                cVar2.d(solverVariable8, dependencyNode3.f4291g);
                                                                solverVariable7 = solverVariable2;
                                                                cVar2.d(solverVariable7, constraintWidget3.f4242e.f4312i.f4291g);
                                                                solverVariable6 = solverVariable3;
                                                                cVar2.d(solverVariable6, constraintWidget3.f4242e.f4319k.f4291g);
                                                                ConstraintWidget constraintWidget7 = constraintWidget3.W;
                                                                if (constraintWidget7 != null && !z17 && z12) {
                                                                    c10 = 1;
                                                                    if (zArr3[1]) {
                                                                        i22 = 8;
                                                                        i23 = 0;
                                                                        cVar2.f(cVar2.l(constraintWidget7.N), solverVariable7, 0, 8);
                                                                    } else {
                                                                        i22 = 8;
                                                                        i23 = 0;
                                                                    }
                                                                } else {
                                                                    i22 = 8;
                                                                    i23 = 0;
                                                                    c10 = 1;
                                                                }
                                                                z27 = false;
                                                                if (constraintWidget3.f4265q == 2) {
                                                                    z28 = false;
                                                                } else {
                                                                    z28 = z27;
                                                                }
                                                                if (!z28 && !constraintWidget3.f4258m) {
                                                                    if (dimensionBehaviourArr2[c10] == dimensionBehaviour6 && (constraintWidget3 instanceof d)) {
                                                                        z29 = true;
                                                                    } else {
                                                                        z29 = false;
                                                                    }
                                                                    if (z29) {
                                                                        i18 = 0;
                                                                    }
                                                                    ConstraintWidget constraintWidget8 = constraintWidget3.W;
                                                                    if (constraintWidget8 != null) {
                                                                        solverVariable15 = cVar2.l(constraintWidget8.N);
                                                                    } else {
                                                                        solverVariable15 = null;
                                                                    }
                                                                    ConstraintWidget constraintWidget9 = constraintWidget3.W;
                                                                    if (constraintWidget9 != null) {
                                                                        solverVariable16 = cVar2.l(constraintWidget9.L);
                                                                    } else {
                                                                        solverVariable16 = null;
                                                                    }
                                                                    int i36 = constraintWidget3.f4241d0;
                                                                    if (i36 > 0 || constraintWidget3.f4253j0 == i22) {
                                                                        ConstraintAnchor constraintAnchor11 = constraintAnchor4;
                                                                        if (constraintAnchor11.f4224f != null) {
                                                                            cVar2.e(solverVariable6, solverVariable8, i36, i22);
                                                                            cVar2.e(solverVariable6, cVar2.l(constraintAnchor11.f4224f), constraintAnchor11.e(), i22);
                                                                            if (z12) {
                                                                                cVar2.f(solverVariable15, cVar2.l(constraintAnchor3), i23, 5);
                                                                            }
                                                                            z30 = false;
                                                                            boolean z39 = zArr3[c10];
                                                                            DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[c10];
                                                                            ConstraintAnchor constraintAnchor12 = constraintWidget3.L;
                                                                            ConstraintAnchor constraintAnchor13 = constraintWidget3.N;
                                                                            int i37 = constraintWidget3.c0;
                                                                            int i38 = constraintWidget3.f4245f0;
                                                                            int i39 = iArr2[c10];
                                                                            float f11 = constraintWidget3.f4249h0;
                                                                            if (dimensionBehaviourArr2[i23] != dimensionBehaviour7) {
                                                                                z31 = true;
                                                                            } else {
                                                                                z31 = false;
                                                                            }
                                                                            boolean z40 = z12;
                                                                            boolean z41 = z13;
                                                                            solverVariable9 = solverVariable7;
                                                                            solverVariable10 = solverVariable8;
                                                                            e(cVar, false, z40, z41, z39, solverVariable16, solverVariable15, dimensionBehaviour9, z29, constraintAnchor12, constraintAnchor13, i37, i18, i38, i39, f11, z23, z31, z17, z18, z38, i16, i15, constraintWidget3.f4275y, constraintWidget3.f4276z, constraintWidget3.A, z30);
                                                                        } else {
                                                                            if (constraintWidget3.f4253j0 == i22) {
                                                                                i36 = constraintAnchor11.e();
                                                                            }
                                                                            cVar2.e(solverVariable6, solverVariable8, i36, i22);
                                                                        }
                                                                    }
                                                                    z30 = z25;
                                                                    boolean z392 = zArr3[c10];
                                                                    DimensionBehaviour dimensionBehaviour92 = dimensionBehaviourArr2[c10];
                                                                    ConstraintAnchor constraintAnchor122 = constraintWidget3.L;
                                                                    ConstraintAnchor constraintAnchor132 = constraintWidget3.N;
                                                                    int i372 = constraintWidget3.c0;
                                                                    int i382 = constraintWidget3.f4245f0;
                                                                    int i392 = iArr2[c10];
                                                                    float f112 = constraintWidget3.f4249h0;
                                                                    if (dimensionBehaviourArr2[i23] != dimensionBehaviour7) {
                                                                    }
                                                                    boolean z402 = z12;
                                                                    boolean z412 = z13;
                                                                    solverVariable9 = solverVariable7;
                                                                    solverVariable10 = solverVariable8;
                                                                    e(cVar, false, z402, z412, z392, solverVariable16, solverVariable15, dimensionBehaviour92, z29, constraintAnchor122, constraintAnchor132, i372, i18, i382, i392, f112, z23, z31, z17, z18, z38, i16, i15, constraintWidget3.f4275y, constraintWidget3.f4276z, constraintWidget3.A, z30);
                                                                } else {
                                                                    solverVariable9 = solverVariable7;
                                                                    solverVariable10 = solverVariable8;
                                                                }
                                                                if (z21) {
                                                                    int i40 = this.B;
                                                                    float f12 = this.C;
                                                                    if (i40 == 1) {
                                                                        solverVariable13 = solverVariable9;
                                                                        solverVariable14 = solverVariable10;
                                                                        solverVariable11 = solverVariable4;
                                                                        solverVariable12 = solverVariable5;
                                                                    } else {
                                                                        solverVariable11 = solverVariable9;
                                                                        solverVariable12 = solverVariable10;
                                                                        solverVariable13 = solverVariable4;
                                                                        solverVariable14 = solverVariable5;
                                                                    }
                                                                    cVar.h(solverVariable13, solverVariable14, solverVariable11, solverVariable12, f12);
                                                                }
                                                                if (constraintAnchor5.h()) {
                                                                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                                                                    ConstraintWidget constraintWidget10 = constraintAnchor14.f4224f.f4222d;
                                                                    int e10 = constraintAnchor14.e();
                                                                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                                                                    SolverVariable l12 = cVar.l(j(type));
                                                                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                                                                    SolverVariable l13 = cVar.l(j(type2));
                                                                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                                                                    SolverVariable l14 = cVar.l(j(type3));
                                                                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                                                                    SolverVariable l15 = cVar.l(j(type4));
                                                                    SolverVariable l16 = cVar.l(constraintWidget10.j(type));
                                                                    SolverVariable l17 = cVar.l(constraintWidget10.j(type2));
                                                                    SolverVariable l18 = cVar.l(constraintWidget10.j(type3));
                                                                    SolverVariable l19 = cVar.l(constraintWidget10.j(type4));
                                                                    androidx.constraintlayout.core.b m10 = cVar.m();
                                                                    double radians = (float) Math.toRadians(this.E + 90.0f);
                                                                    double d5 = e10;
                                                                    m10.f4197d.g(l17, 0.5f);
                                                                    m10.f4197d.g(l19, 0.5f);
                                                                    m10.f4197d.g(l13, -0.5f);
                                                                    m10.f4197d.g(l15, -0.5f);
                                                                    m10.f4196b = -((float) (Math.sin(radians) * d5));
                                                                    cVar.c(m10);
                                                                    androidx.constraintlayout.core.b m11 = cVar.m();
                                                                    float cos = (float) (Math.cos(radians) * d5);
                                                                    m11.f4197d.g(l16, 0.5f);
                                                                    m11.f4197d.g(l18, 0.5f);
                                                                    m11.f4197d.g(l12, -0.5f);
                                                                    m11.f4197d.g(l14, -0.5f);
                                                                    m11.f4196b = -cos;
                                                                    cVar.c(m11);
                                                                }
                                                                this.f4256l = false;
                                                                this.f4258m = false;
                                                            }
                                                        }
                                                        cVar2 = cVar;
                                                        solverVariable6 = solverVariable3;
                                                        solverVariable7 = solverVariable2;
                                                        solverVariable8 = solverVariable;
                                                        i22 = 8;
                                                        i23 = 0;
                                                        c10 = 1;
                                                    } else {
                                                        i22 = 8;
                                                        i23 = 0;
                                                        c10 = 1;
                                                        constraintWidget3 = this;
                                                        cVar2 = cVar;
                                                        solverVariable6 = solverVariable3;
                                                        solverVariable7 = solverVariable2;
                                                        solverVariable8 = solverVariable;
                                                    }
                                                    z27 = true;
                                                    if (constraintWidget3.f4265q == 2) {
                                                    }
                                                    if (!z28) {
                                                    }
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                    if (z21) {
                                                    }
                                                    if (constraintAnchor5.h()) {
                                                    }
                                                    this.f4256l = false;
                                                    this.f4258m = false;
                                                }
                                            }
                                        }
                                        constraintWidget4 = this.W;
                                        if (constraintWidget4 == null) {
                                            solverVariable17 = cVar.l(constraintWidget4.M);
                                        } else {
                                            solverVariable17 = null;
                                        }
                                        constraintWidget5 = this.W;
                                        if (constraintWidget5 == null) {
                                            solverVariable18 = cVar.l(constraintWidget5.K);
                                        } else {
                                            solverVariable18 = null;
                                        }
                                        boolean z42 = zArr3[0];
                                        DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr[0];
                                        ConstraintAnchor constraintAnchor15 = this.K;
                                        ConstraintAnchor constraintAnchor16 = this.M;
                                        int i41 = this.f4239b0;
                                        int i42 = this.f4243e0;
                                        int i43 = iArr[0];
                                        float f13 = this.f4247g0;
                                        if (dimensionBehaviourArr[1] != dimensionBehaviour3) {
                                            z32 = true;
                                        } else {
                                            z32 = false;
                                        }
                                        dimensionBehaviour6 = dimensionBehaviour5;
                                        solverVariable3 = l11;
                                        constraintAnchor4 = constraintAnchor;
                                        dimensionBehaviour7 = dimensionBehaviour3;
                                        solverVariable2 = l10;
                                        constraintAnchor3 = constraintAnchor9;
                                        solverVariable = l7;
                                        dimensionBehaviourArr2 = dimensionBehaviourArr;
                                        iArr2 = iArr;
                                        solverVariable4 = l4;
                                        solverVariable5 = l2;
                                        constraintAnchor5 = constraintAnchor2;
                                        e(cVar, true, z13, z12, z42, solverVariable18, solverVariable17, dimensionBehaviour10, z24, constraintAnchor15, constraintAnchor16, i41, i20, i42, i43, f13, z22, z32, z18, z17, z26, i15, i16, this.f4272v, this.f4273w, this.f4274x, z25);
                                        if (!z10) {
                                        }
                                        z27 = true;
                                        if (constraintWidget3.f4265q == 2) {
                                        }
                                        if (!z28) {
                                        }
                                        solverVariable9 = solverVariable7;
                                        solverVariable10 = solverVariable8;
                                        if (z21) {
                                        }
                                        if (constraintAnchor5.h()) {
                                        }
                                        this.f4256l = false;
                                        this.f4258m = false;
                                    }
                                    dimensionBehaviour6 = dimensionBehaviour5;
                                    dimensionBehaviour7 = dimensionBehaviour3;
                                    constraintAnchor3 = constraintAnchor9;
                                    constraintAnchor4 = constraintAnchor;
                                    solverVariable = l7;
                                    solverVariable2 = l10;
                                    solverVariable3 = l11;
                                    solverVariable4 = l4;
                                    solverVariable5 = l2;
                                    dimensionBehaviourArr2 = dimensionBehaviourArr;
                                    iArr2 = iArr;
                                    constraintAnchor5 = constraintAnchor2;
                                    if (!z10) {
                                    }
                                    z27 = true;
                                    if (constraintWidget3.f4265q == 2) {
                                    }
                                    if (!z28) {
                                    }
                                    solverVariable9 = solverVariable7;
                                    solverVariable10 = solverVariable8;
                                    if (z21) {
                                    }
                                    if (constraintAnchor5.h()) {
                                    }
                                    this.f4256l = false;
                                    this.f4258m = false;
                                }
                            } else {
                                i19 = -1;
                            }
                            z22 = false;
                            if (!z21) {
                            }
                            c = 0;
                            z23 = false;
                            dimensionBehaviour5 = dimensionBehaviour;
                            if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
                            }
                            z24 = false;
                            if (z24) {
                            }
                            constraintAnchor2 = this.R;
                            z25 = !constraintAnchor2.h();
                            z26 = zArr2[0];
                            boolean z382 = zArr2[1];
                            i21 = this.f4263p;
                            iArr = this.D;
                            if (i21 != 2) {
                                if (z10) {
                                    dependencyNode = cVar3.f4311h;
                                    if (dependencyNode.f4294j) {
                                        if (!z10) {
                                        }
                                    }
                                }
                                constraintWidget4 = this.W;
                                if (constraintWidget4 == null) {
                                }
                                constraintWidget5 = this.W;
                                if (constraintWidget5 == null) {
                                }
                                boolean z422 = zArr3[0];
                                DimensionBehaviour dimensionBehaviour102 = dimensionBehaviourArr[0];
                                ConstraintAnchor constraintAnchor152 = this.K;
                                ConstraintAnchor constraintAnchor162 = this.M;
                                int i412 = this.f4239b0;
                                int i422 = this.f4243e0;
                                int i432 = iArr[0];
                                float f132 = this.f4247g0;
                                if (dimensionBehaviourArr[1] != dimensionBehaviour3) {
                                }
                                dimensionBehaviour6 = dimensionBehaviour5;
                                solverVariable3 = l11;
                                constraintAnchor4 = constraintAnchor;
                                dimensionBehaviour7 = dimensionBehaviour3;
                                solverVariable2 = l10;
                                constraintAnchor3 = constraintAnchor9;
                                solverVariable = l7;
                                dimensionBehaviourArr2 = dimensionBehaviourArr;
                                iArr2 = iArr;
                                solverVariable4 = l4;
                                solverVariable5 = l2;
                                constraintAnchor5 = constraintAnchor2;
                                e(cVar, true, z13, z12, z422, solverVariable18, solverVariable17, dimensionBehaviour102, z24, constraintAnchor152, constraintAnchor162, i412, i20, i422, i432, f132, z22, z32, z18, z17, z26, i15, i16, this.f4272v, this.f4273w, this.f4274x, z25);
                                if (!z10) {
                                }
                                z27 = true;
                                if (constraintWidget3.f4265q == 2) {
                                }
                                if (!z28) {
                                }
                                solverVariable9 = solverVariable7;
                                solverVariable10 = solverVariable8;
                                if (z21) {
                                }
                                if (constraintAnchor5.h()) {
                                }
                                this.f4256l = false;
                                this.f4258m = false;
                            }
                            dimensionBehaviour6 = dimensionBehaviour5;
                            dimensionBehaviour7 = dimensionBehaviour3;
                            constraintAnchor3 = constraintAnchor9;
                            constraintAnchor4 = constraintAnchor;
                            solverVariable = l7;
                            solverVariable2 = l10;
                            solverVariable3 = l11;
                            solverVariable4 = l4;
                            solverVariable5 = l2;
                            dimensionBehaviourArr2 = dimensionBehaviourArr;
                            iArr2 = iArr;
                            constraintAnchor5 = constraintAnchor2;
                            if (!z10) {
                            }
                            z27 = true;
                            if (constraintWidget3.f4265q == 2) {
                            }
                            if (!z28) {
                            }
                            solverVariable9 = solverVariable7;
                            solverVariable10 = solverVariable8;
                            if (z21) {
                            }
                            if (constraintAnchor5.h()) {
                            }
                            this.f4256l = false;
                            this.f4258m = false;
                        }
                        i17 = i29;
                        i25 = i30;
                        i18 = i25;
                        i15 = i32;
                        i16 = i33;
                        z21 = true;
                        int[] iArr32 = this.f4271u;
                        iArr32[0] = i15;
                        iArr32[1] = i16;
                        if (!z21) {
                        }
                        z22 = false;
                        if (!z21) {
                        }
                        c = 0;
                        z23 = false;
                        dimensionBehaviour5 = dimensionBehaviour;
                        if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
                        }
                        z24 = false;
                        if (z24) {
                        }
                        constraintAnchor2 = this.R;
                        z25 = !constraintAnchor2.h();
                        z26 = zArr2[0];
                        boolean z3822 = zArr2[1];
                        i21 = this.f4263p;
                        iArr = this.D;
                        if (i21 != 2) {
                        }
                        dimensionBehaviour6 = dimensionBehaviour5;
                        dimensionBehaviour7 = dimensionBehaviour3;
                        constraintAnchor3 = constraintAnchor9;
                        constraintAnchor4 = constraintAnchor;
                        solverVariable = l7;
                        solverVariable2 = l10;
                        solverVariable3 = l11;
                        solverVariable4 = l4;
                        solverVariable5 = l2;
                        dimensionBehaviourArr2 = dimensionBehaviourArr;
                        iArr2 = iArr;
                        constraintAnchor5 = constraintAnchor2;
                        if (!z10) {
                        }
                        z27 = true;
                        if (constraintWidget3.f4265q == 2) {
                        }
                        if (!z28) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z21) {
                        }
                        if (constraintAnchor5.h()) {
                        }
                        this.f4256l = false;
                        this.f4258m = false;
                    }
                } else {
                    dimensionBehaviourArr = dimensionBehaviourArr4;
                }
                i15 = i32;
                i16 = i33;
                i17 = i29;
                i18 = i30;
                z21 = false;
                int[] iArr322 = this.f4271u;
                iArr322[0] = i15;
                iArr322[1] = i16;
                if (!z21) {
                }
                z22 = false;
                if (!z21) {
                }
                c = 0;
                z23 = false;
                dimensionBehaviour5 = dimensionBehaviour;
                if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
                }
                z24 = false;
                if (z24) {
                }
                constraintAnchor2 = this.R;
                z25 = !constraintAnchor2.h();
                z26 = zArr2[0];
                boolean z38222 = zArr2[1];
                i21 = this.f4263p;
                iArr = this.D;
                if (i21 != 2) {
                }
                dimensionBehaviour6 = dimensionBehaviour5;
                dimensionBehaviour7 = dimensionBehaviour3;
                constraintAnchor3 = constraintAnchor9;
                constraintAnchor4 = constraintAnchor;
                solverVariable = l7;
                solverVariable2 = l10;
                solverVariable3 = l11;
                solverVariable4 = l4;
                solverVariable5 = l2;
                dimensionBehaviourArr2 = dimensionBehaviourArr;
                iArr2 = iArr;
                constraintAnchor5 = constraintAnchor2;
                if (!z10) {
                }
                z27 = true;
                if (constraintWidget3.f4265q == 2) {
                }
                if (!z28) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z21) {
                }
                if (constraintAnchor5.h()) {
                }
                this.f4256l = false;
                this.f4258m = false;
            }
            boolean z43 = this.f4248h;
            if (z14) {
                cVar.d(l2, this.f4239b0);
                cVar.d(l4, this.f4239b0 + this.X);
                if (z13 && (constraintWidget2 = this.W) != null) {
                    if (z43) {
                        d dVar3 = (d) constraintWidget2;
                        WeakReference<ConstraintAnchor> weakReference2 = dVar3.J0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            zArr2 = zArr;
                            if (constraintAnchor6.d() > dVar3.J0.get().d()) {
                            }
                            weakReference = dVar3.L0;
                            if (weakReference != null || weakReference.get() == null || constraintAnchor7.d() > dVar3.L0.get().d()) {
                                dVar3.L0 = new WeakReference<>(constraintAnchor7);
                            }
                        } else {
                            zArr2 = zArr;
                        }
                        dVar3.J0 = new WeakReference<>(constraintAnchor6);
                        weakReference = dVar3.L0;
                        if (weakReference != null) {
                        }
                        dVar3.L0 = new WeakReference<>(constraintAnchor7);
                    } else {
                        zArr2 = zArr;
                        cVar.f(cVar.l(constraintWidget2.M), l4, 0, 5);
                    }
                    if (this.f4258m) {
                        cVar.d(l7, this.c0);
                        cVar.d(l10, this.c0 + this.Y);
                        HashSet<ConstraintAnchor> hashSet2 = constraintAnchor10.f4220a;
                        if (hashSet2 != null && hashSet2.size() > 0) {
                            z16 = true;
                            if (z16) {
                                cVar.d(l11, this.c0 + this.f4241d0);
                            }
                            if (z12 && (constraintWidget = this.W) != null) {
                                if (!z43) {
                                    d dVar4 = (d) constraintWidget;
                                    WeakReference<ConstraintAnchor> weakReference3 = dVar4.I0;
                                    if (weakReference3 == null || weakReference3.get() == null || constraintAnchor8.d() > dVar4.I0.get().d()) {
                                        dVar4.I0 = new WeakReference<>(constraintAnchor8);
                                    }
                                    WeakReference<ConstraintAnchor> weakReference4 = dVar4.K0;
                                    if (weakReference4 == null || weakReference4.get() == null || constraintAnchor9.d() > dVar4.K0.get().d()) {
                                        dVar4.K0 = new WeakReference<>(constraintAnchor9);
                                    }
                                } else {
                                    z15 = false;
                                    cVar.f(cVar.l(constraintWidget.N), l10, 0, 5);
                                    if (this.f4256l && this.f4258m) {
                                        this.f4256l = z15;
                                        this.f4258m = z15;
                                        return;
                                    }
                                    boolean[] zArr32 = this.f4244f;
                                    if (!z10) {
                                    }
                                    constraintAnchor = constraintAnchor10;
                                    if (this.W == null) {
                                    }
                                    i11 = this.X;
                                    i12 = this.f4243e0;
                                    if (i11 < i12) {
                                    }
                                    i13 = this.Y;
                                    i14 = this.f4245f0;
                                    if (i13 < i14) {
                                    }
                                    DimensionBehaviour[] dimensionBehaviourArr42 = this.V;
                                    int i292 = i12;
                                    dimensionBehaviour2 = dimensionBehaviourArr42[0];
                                    dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                                    }
                                    dimensionBehaviour4 = dimensionBehaviourArr42[1];
                                    int i302 = i14;
                                    if (dimensionBehaviour4 == dimensionBehaviour3) {
                                    }
                                    int i312 = this.f4237a0;
                                    this.B = i312;
                                    f10 = this.Z;
                                    this.C = f10;
                                    int i322 = this.f4269s;
                                    int i332 = this.f4270t;
                                    if (f10 <= 0.0f) {
                                    }
                                    i15 = i322;
                                    i16 = i332;
                                    i17 = i292;
                                    i18 = i302;
                                    z21 = false;
                                    int[] iArr3222 = this.f4271u;
                                    iArr3222[0] = i15;
                                    iArr3222[1] = i16;
                                    if (!z21) {
                                    }
                                    z22 = false;
                                    if (!z21) {
                                    }
                                    c = 0;
                                    z23 = false;
                                    dimensionBehaviour5 = dimensionBehaviour;
                                    if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
                                    }
                                    z24 = false;
                                    if (z24) {
                                    }
                                    constraintAnchor2 = this.R;
                                    z25 = !constraintAnchor2.h();
                                    z26 = zArr2[0];
                                    boolean z382222 = zArr2[1];
                                    i21 = this.f4263p;
                                    iArr = this.D;
                                    if (i21 != 2) {
                                    }
                                    dimensionBehaviour6 = dimensionBehaviour5;
                                    dimensionBehaviour7 = dimensionBehaviour3;
                                    constraintAnchor3 = constraintAnchor9;
                                    constraintAnchor4 = constraintAnchor;
                                    solverVariable = l7;
                                    solverVariable2 = l10;
                                    solverVariable3 = l11;
                                    solverVariable4 = l4;
                                    solverVariable5 = l2;
                                    dimensionBehaviourArr2 = dimensionBehaviourArr;
                                    iArr2 = iArr;
                                    constraintAnchor5 = constraintAnchor2;
                                    if (!z10) {
                                    }
                                    z27 = true;
                                    if (constraintWidget3.f4265q == 2) {
                                    }
                                    if (!z28) {
                                    }
                                    solverVariable9 = solverVariable7;
                                    solverVariable10 = solverVariable8;
                                    if (z21) {
                                    }
                                    if (constraintAnchor5.h()) {
                                    }
                                    this.f4256l = false;
                                    this.f4258m = false;
                                }
                            }
                        }
                        z16 = false;
                        if (z16) {
                        }
                        if (z12) {
                            if (!z43) {
                            }
                        }
                    }
                    z15 = false;
                    if (this.f4256l) {
                        this.f4256l = z15;
                        this.f4258m = z15;
                        return;
                    }
                    boolean[] zArr322 = this.f4244f;
                    if (!z10) {
                    }
                    constraintAnchor = constraintAnchor10;
                    if (this.W == null) {
                    }
                    i11 = this.X;
                    i12 = this.f4243e0;
                    if (i11 < i12) {
                    }
                    i13 = this.Y;
                    i14 = this.f4245f0;
                    if (i13 < i14) {
                    }
                    DimensionBehaviour[] dimensionBehaviourArr422 = this.V;
                    int i2922 = i12;
                    dimensionBehaviour2 = dimensionBehaviourArr422[0];
                    dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                    }
                    dimensionBehaviour4 = dimensionBehaviourArr422[1];
                    int i3022 = i14;
                    if (dimensionBehaviour4 == dimensionBehaviour3) {
                    }
                    int i3122 = this.f4237a0;
                    this.B = i3122;
                    f10 = this.Z;
                    this.C = f10;
                    int i3222 = this.f4269s;
                    int i3322 = this.f4270t;
                    if (f10 <= 0.0f) {
                    }
                    i15 = i3222;
                    i16 = i3322;
                    i17 = i2922;
                    i18 = i3022;
                    z21 = false;
                    int[] iArr32222 = this.f4271u;
                    iArr32222[0] = i15;
                    iArr32222[1] = i16;
                    if (!z21) {
                    }
                    z22 = false;
                    if (!z21) {
                    }
                    c = 0;
                    z23 = false;
                    dimensionBehaviour5 = dimensionBehaviour;
                    if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
                    }
                    z24 = false;
                    if (z24) {
                    }
                    constraintAnchor2 = this.R;
                    z25 = !constraintAnchor2.h();
                    z26 = zArr2[0];
                    boolean z3822222 = zArr2[1];
                    i21 = this.f4263p;
                    iArr = this.D;
                    if (i21 != 2) {
                    }
                    dimensionBehaviour6 = dimensionBehaviour5;
                    dimensionBehaviour7 = dimensionBehaviour3;
                    constraintAnchor3 = constraintAnchor9;
                    constraintAnchor4 = constraintAnchor;
                    solverVariable = l7;
                    solverVariable2 = l10;
                    solverVariable3 = l11;
                    solverVariable4 = l4;
                    solverVariable5 = l2;
                    dimensionBehaviourArr2 = dimensionBehaviourArr;
                    iArr2 = iArr;
                    constraintAnchor5 = constraintAnchor2;
                    if (!z10) {
                    }
                    z27 = true;
                    if (constraintWidget3.f4265q == 2) {
                    }
                    if (!z28) {
                    }
                    solverVariable9 = solverVariable7;
                    solverVariable10 = solverVariable8;
                    if (z21) {
                    }
                    if (constraintAnchor5.h()) {
                    }
                    this.f4256l = false;
                    this.f4258m = false;
                }
            }
            zArr2 = zArr;
            if (this.f4258m) {
            }
            z15 = false;
            if (this.f4256l) {
            }
            boolean[] zArr3222 = this.f4244f;
            if (!z10) {
            }
            constraintAnchor = constraintAnchor10;
            if (this.W == null) {
            }
            i11 = this.X;
            i12 = this.f4243e0;
            if (i11 < i12) {
            }
            i13 = this.Y;
            i14 = this.f4245f0;
            if (i13 < i14) {
            }
            DimensionBehaviour[] dimensionBehaviourArr4222 = this.V;
            int i29222 = i12;
            dimensionBehaviour2 = dimensionBehaviourArr4222[0];
            dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour2 == dimensionBehaviour3) {
            }
            dimensionBehaviour4 = dimensionBehaviourArr4222[1];
            int i30222 = i14;
            if (dimensionBehaviour4 == dimensionBehaviour3) {
            }
            int i31222 = this.f4237a0;
            this.B = i31222;
            f10 = this.Z;
            this.C = f10;
            int i32222 = this.f4269s;
            int i33222 = this.f4270t;
            if (f10 <= 0.0f) {
            }
            i15 = i32222;
            i16 = i33222;
            i17 = i29222;
            i18 = i30222;
            z21 = false;
            int[] iArr322222 = this.f4271u;
            iArr322222[0] = i15;
            iArr322222[1] = i16;
            if (!z21) {
            }
            z22 = false;
            if (!z21) {
            }
            c = 0;
            z23 = false;
            dimensionBehaviour5 = dimensionBehaviour;
            if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
            }
            z24 = false;
            if (z24) {
            }
            constraintAnchor2 = this.R;
            z25 = !constraintAnchor2.h();
            z26 = zArr2[0];
            boolean z38222222 = zArr2[1];
            i21 = this.f4263p;
            iArr = this.D;
            if (i21 != 2) {
            }
            dimensionBehaviour6 = dimensionBehaviour5;
            dimensionBehaviour7 = dimensionBehaviour3;
            constraintAnchor3 = constraintAnchor9;
            constraintAnchor4 = constraintAnchor;
            solverVariable = l7;
            solverVariable2 = l10;
            solverVariable3 = l11;
            solverVariable4 = l4;
            solverVariable5 = l2;
            dimensionBehaviourArr2 = dimensionBehaviourArr;
            iArr2 = iArr;
            constraintAnchor5 = constraintAnchor2;
            if (!z10) {
            }
            z27 = true;
            if (constraintWidget3.f4265q == 2) {
            }
            if (!z28) {
            }
            solverVariable9 = solverVariable7;
            solverVariable10 = solverVariable8;
            if (z21) {
            }
            if (constraintAnchor5.h()) {
            }
            this.f4256l = false;
            this.f4258m = false;
        }
        z11 = false;
        z12 = z11;
        z13 = false;
        i10 = this.f4253j0;
        zArr = this.U;
        if (i10 != 8) {
        }
        z14 = this.f4256l;
        if (!z14) {
            zArr2 = zArr;
            boolean[] zArr32222 = this.f4244f;
            if (!z10) {
            }
            constraintAnchor = constraintAnchor10;
            if (this.W == null) {
            }
            i11 = this.X;
            i12 = this.f4243e0;
            if (i11 < i12) {
            }
            i13 = this.Y;
            i14 = this.f4245f0;
            if (i13 < i14) {
            }
            DimensionBehaviour[] dimensionBehaviourArr42222 = this.V;
            int i292222 = i12;
            dimensionBehaviour2 = dimensionBehaviourArr42222[0];
            dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour2 == dimensionBehaviour3) {
            }
            dimensionBehaviour4 = dimensionBehaviourArr42222[1];
            int i302222 = i14;
            if (dimensionBehaviour4 == dimensionBehaviour3) {
            }
            int i312222 = this.f4237a0;
            this.B = i312222;
            f10 = this.Z;
            this.C = f10;
            int i322222 = this.f4269s;
            int i332222 = this.f4270t;
            if (f10 <= 0.0f) {
            }
            i15 = i322222;
            i16 = i332222;
            i17 = i292222;
            i18 = i302222;
            z21 = false;
            int[] iArr3222222 = this.f4271u;
            iArr3222222[0] = i15;
            iArr3222222[1] = i16;
            if (!z21) {
            }
            z22 = false;
            if (!z21) {
            }
            c = 0;
            z23 = false;
            dimensionBehaviour5 = dimensionBehaviour;
            if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
            }
            z24 = false;
            if (z24) {
            }
            constraintAnchor2 = this.R;
            z25 = !constraintAnchor2.h();
            z26 = zArr2[0];
            boolean z382222222 = zArr2[1];
            i21 = this.f4263p;
            iArr = this.D;
            if (i21 != 2) {
            }
            dimensionBehaviour6 = dimensionBehaviour5;
            dimensionBehaviour7 = dimensionBehaviour3;
            constraintAnchor3 = constraintAnchor9;
            constraintAnchor4 = constraintAnchor;
            solverVariable = l7;
            solverVariable2 = l10;
            solverVariable3 = l11;
            solverVariable4 = l4;
            solverVariable5 = l2;
            dimensionBehaviourArr2 = dimensionBehaviourArr;
            iArr2 = iArr;
            constraintAnchor5 = constraintAnchor2;
            if (!z10) {
            }
            z27 = true;
            if (constraintWidget3.f4265q == 2) {
            }
            if (!z28) {
            }
            solverVariable9 = solverVariable7;
            solverVariable10 = solverVariable8;
            if (z21) {
            }
            if (constraintAnchor5.h()) {
            }
            this.f4256l = false;
            this.f4258m = false;
        }
        boolean z432 = this.f4248h;
        if (z14) {
        }
        zArr2 = zArr;
        if (this.f4258m) {
        }
        z15 = false;
        if (this.f4256l) {
        }
        boolean[] zArr322222 = this.f4244f;
        if (!z10) {
        }
        constraintAnchor = constraintAnchor10;
        if (this.W == null) {
        }
        i11 = this.X;
        i12 = this.f4243e0;
        if (i11 < i12) {
        }
        i13 = this.Y;
        i14 = this.f4245f0;
        if (i13 < i14) {
        }
        DimensionBehaviour[] dimensionBehaviourArr422222 = this.V;
        int i2922222 = i12;
        dimensionBehaviour2 = dimensionBehaviourArr422222[0];
        dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour2 == dimensionBehaviour3) {
        }
        dimensionBehaviour4 = dimensionBehaviourArr422222[1];
        int i3022222 = i14;
        if (dimensionBehaviour4 == dimensionBehaviour3) {
        }
        int i3122222 = this.f4237a0;
        this.B = i3122222;
        f10 = this.Z;
        this.C = f10;
        int i3222222 = this.f4269s;
        int i3322222 = this.f4270t;
        if (f10 <= 0.0f) {
        }
        i15 = i3222222;
        i16 = i3322222;
        i17 = i2922222;
        i18 = i3022222;
        z21 = false;
        int[] iArr32222222 = this.f4271u;
        iArr32222222[0] = i15;
        iArr32222222[1] = i16;
        if (!z21) {
        }
        z22 = false;
        if (!z21) {
        }
        c = 0;
        z23 = false;
        dimensionBehaviour5 = dimensionBehaviour;
        if (dimensionBehaviourArr[c] != dimensionBehaviour5) {
        }
        z24 = false;
        if (z24) {
        }
        constraintAnchor2 = this.R;
        z25 = !constraintAnchor2.h();
        z26 = zArr2[0];
        boolean z3822222222 = zArr2[1];
        i21 = this.f4263p;
        iArr = this.D;
        if (i21 != 2) {
        }
        dimensionBehaviour6 = dimensionBehaviour5;
        dimensionBehaviour7 = dimensionBehaviour3;
        constraintAnchor3 = constraintAnchor9;
        constraintAnchor4 = constraintAnchor;
        solverVariable = l7;
        solverVariable2 = l10;
        solverVariable3 = l11;
        solverVariable4 = l4;
        solverVariable5 = l2;
        dimensionBehaviourArr2 = dimensionBehaviourArr;
        iArr2 = iArr;
        constraintAnchor5 = constraintAnchor2;
        if (!z10) {
        }
        z27 = true;
        if (constraintWidget3.f4265q == 2) {
        }
        if (!z28) {
        }
        solverVariable9 = solverVariable7;
        solverVariable10 = solverVariable8;
        if (z21) {
        }
        if (constraintAnchor5.h()) {
        }
        this.f4256l = false;
        this.f4258m = false;
    }

    public boolean d() {
        return this.f4253j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z14, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        int i18;
        int i19;
        boolean z22;
        boolean z23;
        int i20;
        int i21;
        boolean z24;
        boolean z25;
        SolverVariable l2;
        ConstraintAnchor j2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        boolean z26;
        int i22;
        char c;
        int i23;
        boolean z27;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable7;
        int i24;
        SolverVariable solverVariable8;
        int i25;
        SolverVariable solverVariable9;
        int i26;
        boolean z28;
        boolean z29;
        int i27;
        int i28;
        boolean z30;
        int i29;
        boolean z31;
        boolean z32;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        boolean z33;
        int i30;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariable12;
        SolverVariable solverVariable13;
        boolean z34;
        boolean z35;
        SolverVariable solverVariable14;
        SolverVariable solverVariable15;
        ConstraintWidget constraintWidget5;
        int i31;
        boolean z36;
        int i32;
        int i33;
        boolean z37;
        int i34;
        int i35;
        int i36;
        boolean z38;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z39;
        boolean z40;
        boolean z41;
        int i41;
        int i42;
        SolverVariable solverVariable16;
        int i43;
        int i44 = i16;
        int i45 = i17;
        SolverVariable l4 = cVar.l(constraintAnchor);
        SolverVariable l7 = cVar.l(constraintAnchor2);
        SolverVariable l10 = cVar.l(constraintAnchor.f4224f);
        SolverVariable l11 = cVar.l(constraintAnchor2.f4224f);
        boolean h10 = constraintAnchor.h();
        boolean h11 = constraintAnchor2.h();
        boolean h12 = this.R.h();
        int i46 = h11 ? (h10 ? 1 : 0) + 1 : h10 ? 1 : 0;
        if (h12) {
            i46++;
        }
        int i47 = i46;
        int i48 = z15 ? 3 : i14;
        int ordinal = dimensionBehaviour.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal == 2) {
            if (i48 != 4) {
                z21 = true;
                i18 = this.f4250i;
                if (i18 != -1 && z10) {
                    this.f4250i = -1;
                    i11 = i18;
                    z21 = false;
                }
                i19 = this.f4252j;
                if (i19 != -1 || z10) {
                    i19 = i11;
                } else {
                    this.f4252j = -1;
                    z21 = false;
                }
                boolean z42 = z21;
                if (this.f4253j0 == 8) {
                    z22 = false;
                    i19 = 0;
                } else {
                    z22 = z42;
                }
                if (z20) {
                    if (!h10 && !h11 && !h12) {
                        cVar.d(l4, i10);
                    } else if (h10 && !h11) {
                        z23 = h12;
                        cVar.e(l4, l10, constraintAnchor.e(), 8);
                        if (!z22) {
                            if (i47 == 2 || z15 || !(i48 == 1 || i48 == 0)) {
                                if (i44 == -2) {
                                    i44 = i19;
                                }
                                if (i45 == -2) {
                                    i45 = i19;
                                }
                                if (i19 > 0 && i48 != 1) {
                                    i19 = 0;
                                }
                                if (i44 > 0) {
                                    cVar.f(l7, l4, i44, 8);
                                    i19 = Math.max(i19, i44);
                                }
                                if (i45 > 0) {
                                    if ((z11 && i48 == 1) ? false : true) {
                                        i20 = 8;
                                        cVar.g(l7, l4, i45, 8);
                                    } else {
                                        i20 = 8;
                                    }
                                    i19 = Math.min(i19, i45);
                                } else {
                                    i20 = 8;
                                }
                                if (i48 != 1) {
                                    if (i48 == 2) {
                                        ConstraintAnchor.Type type = ConstraintAnchor.Type.TOP;
                                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BOTTOM;
                                        ConstraintAnchor.Type type3 = constraintAnchor.f4223e;
                                        if (type3 != type && type3 != type2) {
                                            l2 = cVar.l(this.W.j(ConstraintAnchor.Type.LEFT));
                                            j2 = this.W.j(ConstraintAnchor.Type.RIGHT);
                                            SolverVariable l12 = cVar.l(j2);
                                            androidx.constraintlayout.core.b m10 = cVar.m();
                                            i21 = i47;
                                            m10.f4197d.g(l7, -1.0f);
                                            m10.f4197d.g(l4, 1.0f);
                                            m10.f4197d.g(l12, f11);
                                            m10.f4197d.g(l2, -f11);
                                            cVar.c(m10);
                                            if (z11) {
                                                z22 = false;
                                            }
                                            z24 = z13;
                                        }
                                        l2 = cVar.l(this.W.j(type));
                                        j2 = this.W.j(type2);
                                        SolverVariable l122 = cVar.l(j2);
                                        androidx.constraintlayout.core.b m102 = cVar.m();
                                        i21 = i47;
                                        m102.f4197d.g(l7, -1.0f);
                                        m102.f4197d.g(l4, 1.0f);
                                        m102.f4197d.g(l122, f11);
                                        m102.f4197d.g(l2, -f11);
                                        cVar.c(m102);
                                        if (z11) {
                                        }
                                        z24 = z13;
                                    } else {
                                        i21 = i47;
                                        z24 = true;
                                    }
                                    z25 = z24;
                                } else if (z11) {
                                    cVar.e(l7, l4, i19, i20);
                                } else {
                                    cVar.e(l7, l4, i19, 5);
                                    cVar.g(l7, l4, i19, i20);
                                }
                            } else {
                                int max = Math.max(i44, i19);
                                if (i45 > 0) {
                                    max = Math.min(i45, max);
                                }
                                cVar.e(l7, l4, max, 8);
                                z22 = false;
                            }
                            z25 = z13;
                            i21 = i47;
                        } else if (z14) {
                            cVar.e(l7, l4, 0, 3);
                            if (i12 > 0) {
                                cVar.f(l7, l4, i12, 8);
                            }
                            if (i13 < Integer.MAX_VALUE) {
                                cVar.g(l7, l4, i13, 8);
                            }
                            z25 = z13;
                            i21 = i47;
                        } else {
                            i20 = 8;
                            cVar.e(l7, l4, i19, i20);
                            z25 = z13;
                            i21 = i47;
                        }
                        int i49 = i44;
                        boolean z43 = z22;
                        if (z20) {
                            solverVariable3 = solverVariable;
                            solverVariable4 = solverVariable2;
                            solverVariable5 = l7;
                            solverVariable6 = l4;
                            z26 = z25;
                            i22 = i21;
                            c = 1;
                            i23 = 2;
                        } else if (z17) {
                            solverVariable3 = solverVariable;
                            solverVariable4 = solverVariable2;
                            solverVariable5 = l7;
                            solverVariable6 = l4;
                            z26 = z25;
                            i22 = i21;
                            i23 = 2;
                            c = 1;
                        } else {
                            if (!h10 && !h11 && !z23) {
                                constraintAnchor4 = constraintAnchor2;
                                solverVariable15 = l7;
                                z33 = z25;
                                solverVariable14 = l11;
                            } else if (!h10 || h11) {
                                if (h10 || !h11) {
                                    solverVariable7 = l11;
                                    if (h10 && h11) {
                                        ConstraintWidget constraintWidget6 = constraintAnchor.f4224f.f4222d;
                                        ConstraintWidget constraintWidget7 = constraintAnchor2.f4224f.f4222d;
                                        ConstraintWidget constraintWidget8 = this.W;
                                        int i50 = 6;
                                        if (z43) {
                                            if (i48 == 0) {
                                                if (i45 != 0 || i49 != 0) {
                                                    i39 = 5;
                                                    i40 = 5;
                                                    z39 = true;
                                                    z40 = false;
                                                    z41 = true;
                                                } else if (l10.n && solverVariable7.n) {
                                                    cVar.e(l4, l10, constraintAnchor.e(), 8);
                                                    cVar.e(l7, solverVariable7, -constraintAnchor2.e(), 8);
                                                    return;
                                                } else {
                                                    i39 = 8;
                                                    i40 = 8;
                                                    z39 = false;
                                                    z40 = true;
                                                    z41 = false;
                                                }
                                                if (!(constraintWidget6 instanceof a) && !(constraintWidget7 instanceof a)) {
                                                    i41 = i39;
                                                    z29 = z41;
                                                    i29 = 6;
                                                    z30 = z40;
                                                    z28 = z39;
                                                    i27 = i41;
                                                    i28 = i40;
                                                    i24 = i48;
                                                }
                                                i41 = 4;
                                                z29 = z41;
                                                i29 = 6;
                                                z30 = z40;
                                                z28 = z39;
                                                i27 = i41;
                                                i28 = i40;
                                                i24 = i48;
                                            } else if (i48 == 2) {
                                                if (!(constraintWidget6 instanceof a) && !(constraintWidget7 instanceof a)) {
                                                    i24 = i48;
                                                    i26 = 5;
                                                    solverVariable9 = solverVariable2;
                                                    i27 = i26;
                                                    i28 = 5;
                                                    z29 = true;
                                                    z28 = true;
                                                    z30 = false;
                                                    i29 = 6;
                                                    if (z29 || l10 != solverVariable7 || constraintWidget6 == constraintWidget8) {
                                                        z31 = z29;
                                                        z32 = true;
                                                    } else {
                                                        z32 = false;
                                                        z31 = false;
                                                    }
                                                    if (z28) {
                                                        if (z43 || z16 || z18 || l10 != solverVariable || solverVariable7 != solverVariable9) {
                                                            i32 = i28;
                                                            i33 = i29;
                                                            z37 = z32;
                                                            z35 = z11;
                                                        } else {
                                                            z35 = false;
                                                            i32 = 8;
                                                            z37 = false;
                                                            i33 = 8;
                                                        }
                                                        constraintWidget2 = constraintWidget7;
                                                        constraintAnchor4 = constraintAnchor2;
                                                        z33 = z25;
                                                        constraintWidget4 = constraintWidget6;
                                                        i30 = i49;
                                                        solverVariable10 = solverVariable7;
                                                        solverVariable12 = l10;
                                                        constraintWidget3 = constraintWidget8;
                                                        solverVariable11 = l7;
                                                        solverVariable13 = l4;
                                                        cVar.b(l4, l10, constraintAnchor.e(), f10, solverVariable7, l7, constraintAnchor2.e(), i33);
                                                        i28 = i32;
                                                        z34 = z37;
                                                    } else {
                                                        constraintWidget2 = constraintWidget7;
                                                        constraintAnchor4 = constraintAnchor2;
                                                        solverVariable10 = solverVariable7;
                                                        solverVariable11 = l7;
                                                        z33 = z25;
                                                        i30 = i49;
                                                        constraintWidget3 = constraintWidget8;
                                                        constraintWidget4 = constraintWidget6;
                                                        solverVariable12 = l10;
                                                        solverVariable13 = l4;
                                                        z34 = z32;
                                                        z35 = z11;
                                                    }
                                                    if (this.f4253j0 == 8) {
                                                        HashSet<ConstraintAnchor> hashSet = constraintAnchor4.f4220a;
                                                        if (hashSet == null) {
                                                            z36 = false;
                                                        } else {
                                                            z36 = hashSet.size() > 0;
                                                        }
                                                        if (!z36) {
                                                            return;
                                                        }
                                                    }
                                                    solverVariable14 = solverVariable10;
                                                    if (z31) {
                                                        if (z35 && solverVariable12 != solverVariable14 && !z43 && ((constraintWidget4 instanceof a) || (constraintWidget2 instanceof a))) {
                                                            i28 = 6;
                                                        }
                                                        cVar.f(solverVariable13, solverVariable12, constraintAnchor.e(), i28);
                                                        solverVariable15 = solverVariable11;
                                                        cVar.g(solverVariable15, solverVariable14, -constraintAnchor2.e(), i28);
                                                    } else {
                                                        solverVariable15 = solverVariable11;
                                                    }
                                                    if (z35 || !z19 || (constraintWidget4 instanceof a) || (constraintWidget2 instanceof a)) {
                                                        constraintWidget5 = constraintWidget3;
                                                    } else {
                                                        constraintWidget5 = constraintWidget3;
                                                        if (constraintWidget2 != constraintWidget5) {
                                                            i28 = 6;
                                                            i31 = 6;
                                                            z34 = true;
                                                            if (z34) {
                                                                if (z30 && (!z18 || z12)) {
                                                                    if (constraintWidget4 != constraintWidget5 && constraintWidget2 != constraintWidget5) {
                                                                        i50 = i31;
                                                                    }
                                                                    i50 = ((constraintWidget4 instanceof f) || (constraintWidget2 instanceof f)) ? 5 : 5;
                                                                    i31 = Math.max(z18 ? 5 : ((constraintWidget4 instanceof a) || (constraintWidget2 instanceof a)) ? 5 : 5, i31);
                                                                }
                                                                int i51 = i31;
                                                                if (z35) {
                                                                    i51 = Math.min(i28, i51);
                                                                    if (z15 && !z18 && (constraintWidget4 == constraintWidget5 || constraintWidget2 == constraintWidget5)) {
                                                                        i51 = 4;
                                                                    }
                                                                }
                                                                cVar.e(solverVariable13, solverVariable12, constraintAnchor.e(), i51);
                                                                cVar.e(solverVariable15, solverVariable14, -constraintAnchor2.e(), i51);
                                                            }
                                                            if (z35) {
                                                                SolverVariable solverVariable17 = solverVariable12;
                                                                int e10 = solverVariable == solverVariable17 ? constraintAnchor.e() : 0;
                                                                if (solverVariable17 != solverVariable) {
                                                                    cVar.f(solverVariable13, solverVariable, e10, 5);
                                                                }
                                                            }
                                                            if (z35 && z43 && i12 == 0 && i30 == 0) {
                                                                if (z43 || i24 != 3) {
                                                                    cVar.f(solverVariable15, solverVariable13, 0, 5);
                                                                    i42 = 5;
                                                                    if (z35 || !z33) {
                                                                        return;
                                                                    }
                                                                    if (constraintAnchor4.f4224f != null) {
                                                                        i43 = constraintAnchor2.e();
                                                                        solverVariable16 = solverVariable2;
                                                                    } else {
                                                                        solverVariable16 = solverVariable2;
                                                                        i43 = 0;
                                                                    }
                                                                    if (solverVariable14 != solverVariable16) {
                                                                        cVar.f(solverVariable16, solverVariable15, i43, i42);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                cVar.f(solverVariable15, solverVariable13, 0, 8);
                                                            }
                                                            i42 = 5;
                                                            if (z35) {
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    i31 = i27;
                                                    if (z34) {
                                                    }
                                                    if (z35) {
                                                    }
                                                    if (z35) {
                                                        if (z43) {
                                                        }
                                                        cVar.f(solverVariable15, solverVariable13, 0, 5);
                                                        i42 = 5;
                                                        if (z35) {
                                                        }
                                                    }
                                                    i42 = 5;
                                                    if (z35) {
                                                    }
                                                }
                                                i24 = i48;
                                            } else if (i48 == 1) {
                                                i24 = i48;
                                                i28 = 8;
                                                i27 = 4;
                                                solverVariable9 = solverVariable2;
                                                z29 = true;
                                                z28 = true;
                                                z30 = false;
                                                i29 = 6;
                                                if (z29) {
                                                }
                                                z31 = z29;
                                                z32 = true;
                                                if (z28) {
                                                }
                                                if (this.f4253j0 == 8) {
                                                }
                                                solverVariable14 = solverVariable10;
                                                if (z31) {
                                                }
                                                if (z35) {
                                                }
                                                constraintWidget5 = constraintWidget3;
                                                i31 = i27;
                                                if (z34) {
                                                }
                                                if (z35) {
                                                }
                                                if (z35) {
                                                }
                                                i42 = 5;
                                                if (z35) {
                                                }
                                            } else if (i48 == 3) {
                                                i24 = i48;
                                                if (this.B == -1) {
                                                    i36 = z18 ? z11 ? 5 : 4 : 8;
                                                    i34 = 5;
                                                    i35 = 8;
                                                } else if (z15) {
                                                    if (i15 != 2 && i15 != 1) {
                                                        z38 = false;
                                                        if (z38) {
                                                            i37 = 5;
                                                            i38 = 8;
                                                        } else {
                                                            i37 = 4;
                                                            i38 = 5;
                                                        }
                                                        i27 = i37;
                                                        i28 = i38;
                                                        z29 = true;
                                                        z28 = true;
                                                        z30 = true;
                                                        i29 = 6;
                                                    }
                                                    z38 = true;
                                                    if (z38) {
                                                    }
                                                    i27 = i37;
                                                    i28 = i38;
                                                    z29 = true;
                                                    z28 = true;
                                                    z30 = true;
                                                    i29 = 6;
                                                } else {
                                                    if (i45 > 0) {
                                                        i34 = 5;
                                                    } else if (i45 != 0 || i49 != 0) {
                                                        i34 = 4;
                                                    } else if (z18) {
                                                        i35 = (constraintWidget6 == constraintWidget8 || constraintWidget7 == constraintWidget8) ? 5 : 4;
                                                        i34 = 4;
                                                        i36 = 6;
                                                    } else {
                                                        i34 = 8;
                                                    }
                                                    i35 = 5;
                                                    i36 = 6;
                                                }
                                                i29 = i36;
                                                z29 = true;
                                                z28 = true;
                                                z30 = true;
                                                i27 = i34;
                                                i28 = i35;
                                            } else {
                                                i24 = i48;
                                                solverVariable9 = solverVariable2;
                                                i28 = 5;
                                                i27 = 4;
                                                z29 = false;
                                                z28 = false;
                                                z30 = false;
                                                i29 = 6;
                                                if (z29) {
                                                }
                                                z31 = z29;
                                                z32 = true;
                                                if (z28) {
                                                }
                                                if (this.f4253j0 == 8) {
                                                }
                                                solverVariable14 = solverVariable10;
                                                if (z31) {
                                                }
                                                if (z35) {
                                                }
                                                constraintWidget5 = constraintWidget3;
                                                i31 = i27;
                                                if (z34) {
                                                }
                                                if (z35) {
                                                }
                                                if (z35) {
                                                }
                                                i42 = 5;
                                                if (z35) {
                                                }
                                            }
                                            solverVariable9 = solverVariable2;
                                            if (z29) {
                                            }
                                            z31 = z29;
                                            z32 = true;
                                            if (z28) {
                                            }
                                            if (this.f4253j0 == 8) {
                                            }
                                            solverVariable14 = solverVariable10;
                                            if (z31) {
                                            }
                                            if (z35) {
                                            }
                                            constraintWidget5 = constraintWidget3;
                                            i31 = i27;
                                            if (z34) {
                                            }
                                            if (z35) {
                                            }
                                            if (z35) {
                                            }
                                            i42 = 5;
                                            if (z35) {
                                            }
                                        } else {
                                            i24 = i48;
                                            if (l10.n && solverVariable7.n) {
                                                cVar.b(l4, l10, constraintAnchor.e(), f10, solverVariable7, l7, constraintAnchor2.e(), 8);
                                                if (z11 && z25) {
                                                    if (constraintAnchor2.f4224f != null) {
                                                        i25 = constraintAnchor2.e();
                                                        solverVariable8 = solverVariable2;
                                                    } else {
                                                        solverVariable8 = solverVariable2;
                                                        i25 = 0;
                                                    }
                                                    if (solverVariable7 != solverVariable8) {
                                                        cVar.f(solverVariable8, l7, i25, 5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        solverVariable9 = solverVariable2;
                                        i26 = 4;
                                        i27 = i26;
                                        i28 = 5;
                                        z29 = true;
                                        z28 = true;
                                        z30 = false;
                                        i29 = 6;
                                        if (z29) {
                                        }
                                        z31 = z29;
                                        z32 = true;
                                        if (z28) {
                                        }
                                        if (this.f4253j0 == 8) {
                                        }
                                        solverVariable14 = solverVariable10;
                                        if (z31) {
                                        }
                                        if (z35) {
                                        }
                                        constraintWidget5 = constraintWidget3;
                                        i31 = i27;
                                        if (z34) {
                                        }
                                        if (z35) {
                                        }
                                        if (z35) {
                                        }
                                        i42 = 5;
                                        if (z35) {
                                        }
                                    }
                                } else {
                                    solverVariable7 = l11;
                                    cVar.e(l7, solverVariable7, -constraintAnchor2.e(), 8);
                                    if (z11) {
                                        cVar.f(l4, solverVariable, 0, 5);
                                    }
                                }
                                constraintAnchor4 = constraintAnchor2;
                                solverVariable14 = solverVariable7;
                                solverVariable15 = l7;
                                z33 = z25;
                            } else {
                                z35 = z11;
                                constraintAnchor4 = constraintAnchor2;
                                solverVariable15 = l7;
                                z33 = z25;
                                i42 = (z11 && (constraintAnchor.f4224f.f4222d instanceof a)) ? 8 : 5;
                                solverVariable14 = l11;
                                if (z35) {
                                }
                            }
                            z35 = z11;
                            i42 = 5;
                            if (z35) {
                            }
                        }
                        if (i22 < i23 || !z11 || !z26) {
                            return;
                        }
                        cVar.f(solverVariable6, solverVariable3, 0, 8);
                        ConstraintAnchor constraintAnchor5 = this.O;
                        if (!z10 && constraintAnchor5.f4224f != null) {
                            z27 = false;
                            if (!z10 && (constraintAnchor3 = constraintAnchor5.f4224f) != null) {
                                constraintWidget = constraintAnchor3.f4222d;
                                if (constraintWidget.Z != 0.0f) {
                                    DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                                    DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                    DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[c] == dimensionBehaviour3) {
                                        z27 = true;
                                    }
                                }
                                z27 = false;
                            }
                            if (z27) {
                                return;
                            }
                            cVar.f(solverVariable4, solverVariable5, 0, 8);
                            return;
                        }
                        z27 = true;
                        if (!z10) {
                            constraintWidget = constraintAnchor3.f4222d;
                            if (constraintWidget.Z != 0.0f) {
                            }
                            z27 = false;
                        }
                        if (z27) {
                        }
                    }
                }
                z23 = h12;
                if (!z22) {
                }
                int i492 = i44;
                boolean z432 = z22;
                if (z20) {
                }
                if (i22 < i23) {
                    return;
                }
                return;
            }
            z21 = false;
            i18 = this.f4250i;
            if (i18 != -1) {
                this.f4250i = -1;
                i11 = i18;
                z21 = false;
            }
            i19 = this.f4252j;
            if (i19 != -1) {
            }
            i19 = i11;
            boolean z422 = z21;
            if (this.f4253j0 == 8) {
            }
            if (z20) {
            }
            z23 = h12;
            if (!z22) {
            }
            int i4922 = i44;
            boolean z4322 = z22;
            if (z20) {
            }
            if (i22 < i23) {
            }
        }
        z21 = false;
        i18 = this.f4250i;
        if (i18 != -1) {
        }
        i19 = this.f4252j;
        if (i19 != -1) {
        }
        i19 = i11;
        boolean z4222 = z21;
        if (this.f4253j0 == 8) {
        }
        if (z20) {
        }
        z23 = h12;
        if (!z22) {
        }
        int i49222 = i44;
        boolean z43222 = z22;
        if (z20) {
        }
        if (i22 < i23) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018a, code lost:
        if (r13.h() != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor f10;
        ConstraintAnchor j2;
        ConstraintAnchor j10;
        ConstraintAnchor j11;
        boolean z10;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.CENTER;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.CENTER_Y;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER_X;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.RIGHT;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
        if (type == type3) {
            if (type2 == type3) {
                ConstraintAnchor j12 = j(type6);
                ConstraintAnchor j13 = j(type8);
                ConstraintAnchor j14 = j(type7);
                ConstraintAnchor j15 = j(type9);
                boolean z11 = true;
                if ((j12 != null && j12.h()) || (j13 != null && j13.h())) {
                    z10 = false;
                } else {
                    f(type6, constraintWidget, type6, 0);
                    f(type8, constraintWidget, type8, 0);
                    z10 = true;
                }
                if ((j14 != null && j14.h()) || (j15 != null && j15.h())) {
                    z11 = false;
                } else {
                    f(type7, constraintWidget, type7, 0);
                    f(type9, constraintWidget, type9, 0);
                }
                if (z10 && z11) {
                    j10 = j(type3);
                    j11 = constraintWidget.j(type3);
                } else if (z10) {
                    j10 = j(type5);
                    j11 = constraintWidget.j(type5);
                } else if (z11) {
                    j10 = j(type4);
                    j11 = constraintWidget.j(type4);
                } else {
                    return;
                }
            } else {
                if (type2 != type6 && type2 != type8) {
                    if (type2 == type7 || type2 == type9) {
                        f(type7, constraintWidget, type2, 0);
                        f(type9, constraintWidget, type2, 0);
                        j10 = j(type3);
                        j11 = constraintWidget.j(type2);
                    } else {
                        return;
                    }
                }
                f(type6, constraintWidget, type2, 0);
                f(type8, constraintWidget, type2, 0);
                j10 = j(type3);
                j11 = constraintWidget.j(type2);
            }
        } else if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor j16 = j(type6);
            j11 = constraintWidget.j(type2);
            ConstraintAnchor j17 = j(type8);
            j16.a(j11, 0);
            j17.a(j11, 0);
            j10 = j(type5);
        } else if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor j18 = constraintWidget.j(type2);
            j(type7).a(j18, 0);
            j(type9).a(j18, 0);
            j(type4).a(j18, 0);
            return;
        } else {
            if (type == type5 && type2 == type5) {
                j(type6).a(constraintWidget.j(type6), 0);
                j(type8).a(constraintWidget.j(type8), 0);
                j10 = j(type5);
            } else if (type == type4 && type2 == type4) {
                j(type7).a(constraintWidget.j(type7), 0);
                j(type9).a(constraintWidget.j(type9), 0);
                j10 = j(type4);
            } else {
                ConstraintAnchor j19 = j(type);
                ConstraintAnchor j20 = constraintWidget.j(type2);
                if (j19.i(j20)) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.BASELINE;
                    if (type == type10) {
                        ConstraintAnchor j21 = j(type7);
                        j2 = j(type9);
                        if (j21 != null) {
                            j21.j();
                        }
                        if (j2 != null) {
                            j2.j();
                        }
                        j19.a(j20, i10);
                        return;
                    }
                    if (type != type7 && type != type9) {
                        if (type == type6 || type == type8) {
                            ConstraintAnchor j22 = j(type3);
                            if (j22.f4224f != j20) {
                                j22.j();
                            }
                            f10 = j(type).f();
                            j2 = j(type5);
                            if (j2.h()) {
                                f10.j();
                                j2.j();
                            }
                        }
                        j19.a(j20, i10);
                        return;
                    }
                    ConstraintAnchor j23 = j(type10);
                    if (j23 != null) {
                        j23.j();
                    }
                    ConstraintAnchor j24 = j(type3);
                    if (j24.f4224f != j20) {
                        j24.j();
                    }
                    f10 = j(type).f();
                    j2 = j(type4);
                } else {
                    return;
                }
            }
            j11 = constraintWidget.j(type2);
        }
        j10.a(j11, 0);
    }

    public final void g(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.f4222d == this) {
            f(constraintAnchor.f4223e, constraintAnchor2.f4222d, constraintAnchor2.f4223e, i10);
        }
    }

    public final void h(androidx.constraintlayout.core.c cVar) {
        cVar.l(this.K);
        cVar.l(this.L);
        cVar.l(this.M);
        cVar.l(this.N);
        if (this.f4241d0 > 0) {
            cVar.l(this.O);
        }
    }

    public final void i() {
        if (this.f4240d == null) {
            this.f4240d = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f4242e == null) {
            this.f4242e = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public ConstraintAnchor j(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return this.L;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return this.M;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour k(int i10) {
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        if (i10 == 0) {
            return dimensionBehaviourArr[0];
        }
        if (i10 == 1) {
            return dimensionBehaviourArr[1];
        }
        return null;
    }

    public final int l() {
        if (this.f4253j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ConstraintWidget m(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.N).f4224f) != null && constraintAnchor2.f4224f == constraintAnchor) {
                return constraintAnchor2.f4222d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4224f;
        if (constraintAnchor4 == null || constraintAnchor4.f4224f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f4222d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f4254k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f4239b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.c0);
        sb.append("\n");
        p(sb, "left", this.K);
        p(sb, "top", this.L);
        p(sb, "right", this.M);
        p(sb, "bottom", this.N);
        p(sb, "baseline", this.O);
        p(sb, "centerX", this.P);
        p(sb, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f4243e0;
        int[] iArr = this.D;
        int i12 = iArr[0];
        int i13 = this.f4272v;
        int i14 = this.f4269s;
        float f10 = this.f4274x;
        float[] fArr = this.f4260n0;
        float f11 = fArr[0];
        o(sb, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Y;
        int i16 = this.f4245f0;
        int i17 = iArr[1];
        int i18 = this.f4275y;
        int i19 = this.f4270t;
        float f12 = this.A;
        float f13 = fArr[1];
        o(sb, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Z;
        int i20 = this.f4237a0;
        if (f14 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f14);
            sb.append(",");
            sb.append(i20);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f4247g0, 0.5f);
        H(sb, "    verticalBias", this.f4249h0, 0.5f);
        G(this.f4257l0, 0, "    horizontalChainStyle", sb);
        G(this.f4259m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f4253j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int r() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f4239b0 : ((d) constraintWidget).f4342z0 + this.f4239b0;
    }

    public final int s() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.c0 : ((d) constraintWidget).A0 + this.c0;
    }

    public final boolean t(int i10) {
        if (i10 == 0) {
            return (this.K.f4224f != null ? 1 : 0) + (this.M.f4224f != null ? 1 : 0) < 2;
        }
        return ((this.L.f4224f != null ? 1 : 0) + (this.N.f4224f != null ? 1 : 0)) + (this.O.f4224f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f4255k0 != null) {
            str = androidx.activity.e.k(new StringBuilder("id: "), this.f4255k0, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4239b0);
        sb.append(", ");
        sb.append(this.c0);
        sb.append(") - (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor5 = this.K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4224f;
            if (constraintAnchor6 != null && constraintAnchor6.c && (constraintAnchor4 = (constraintAnchor3 = this.M).f4224f) != null && constraintAnchor4.c) {
                if ((constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f4224f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.L;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f4224f;
            if (constraintAnchor8 != null && constraintAnchor8.c && (constraintAnchor2 = (constraintAnchor = this.N).f4224f) != null && constraintAnchor2.c) {
                if ((constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f4224f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void v(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        j(type).b(constraintWidget.j(type2), i10, i11, true);
    }

    public final boolean w(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4224f;
        return (constraintAnchor4 == null || constraintAnchor4.f4224f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f4224f) == null || constraintAnchor2.f4224f != constraintAnchor) ? false : true;
    }

    public final boolean x() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4224f;
        if (constraintAnchor2 == null || constraintAnchor2.f4224f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4224f;
            return constraintAnchor4 != null && constraintAnchor4.f4224f == constraintAnchor3;
        }
        return true;
    }

    public final boolean y() {
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4224f;
        if (constraintAnchor2 == null || constraintAnchor2.f4224f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.N;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4224f;
            return constraintAnchor4 != null && constraintAnchor4.f4224f == constraintAnchor3;
        }
        return true;
    }

    public final boolean z() {
        return this.f4246g && this.f4253j0 != 8;
    }
}
