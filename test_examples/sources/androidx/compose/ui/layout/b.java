package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.activity.e;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.unit.LayoutDirection;
import g0.d;
import g0.f;
import g0.g;
import g0.i;
import g0.k0;
import j1.f0;
import j1.g0;
import j1.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.i0;
import m7.n;
import p0.w;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f3344a;

    /* renamed from: b  reason: collision with root package name */
    public g f3345b;
    public g0 c;

    /* renamed from: d  reason: collision with root package name */
    public int f3346d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f3347e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f3348f;

    /* renamed from: g  reason: collision with root package name */
    public final C0023b f3349g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f3350h;

    /* renamed from: i  reason: collision with root package name */
    public final g0.a f3351i;

    /* renamed from: j  reason: collision with root package name */
    public int f3352j;

    /* renamed from: k  reason: collision with root package name */
    public int f3353k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3354l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f3355a;

        /* renamed from: b  reason: collision with root package name */
        public p<? super d, ? super Integer, n> f3356b;
        public f c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3357d;

        /* renamed from: e  reason: collision with root package name */
        public final k0 f3358e;

        public a() {
            throw null;
        }

        public a(Object obj, ComposableLambdaImpl composableLambdaImpl) {
            v7.g.f(composableLambdaImpl, "content");
            this.f3355a = obj;
            this.f3356b = composableLambdaImpl;
            this.c = null;
            this.f3358e = a1.c.V0(Boolean.TRUE);
        }
    }

    /* renamed from: androidx.compose.ui.layout.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0023b implements f0 {

        /* renamed from: i  reason: collision with root package name */
        public LayoutDirection f3359i = LayoutDirection.Rtl;

        /* renamed from: j  reason: collision with root package name */
        public float f3360j;

        /* renamed from: k  reason: collision with root package name */
        public float f3361k;

        public C0023b() {
        }

        @Override // b2.b
        public final float H(float f10) {
            return getDensity() * f10;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
        @Override // j1.f0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<j1.p> J(Object obj, p<? super d, ? super Integer, n> pVar) {
            boolean z10;
            boolean z11;
            int i10;
            Set<w> set;
            boolean z12;
            boolean z13;
            v7.g.f(pVar, "content");
            b bVar = b.this;
            bVar.getClass();
            bVar.b();
            LayoutNode.LayoutState layoutState = bVar.f3344a.K.f3444b;
            if (layoutState != LayoutNode.LayoutState.Measuring && layoutState != LayoutNode.LayoutState.LayingOut) {
                z10 = false;
                if (!z10) {
                    LinkedHashMap linkedHashMap = bVar.f3348f;
                    LayoutNode layoutNode = linkedHashMap.get(obj);
                    if (layoutNode == null) {
                        layoutNode = (LayoutNode) bVar.f3350h.remove(obj);
                        if (layoutNode != null) {
                            int i11 = bVar.f3353k;
                            if (i11 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                bVar.f3353k = i11 - 1;
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            if (bVar.f3352j != 0) {
                                int size = bVar.f3344a.o().size() - bVar.f3353k;
                                int i12 = size - bVar.f3352j;
                                int i13 = size - 1;
                                int i14 = i13;
                                while (true) {
                                    if (i14 >= i12) {
                                        Object obj2 = bVar.f3347e.get(bVar.f3344a.o().get(i14));
                                        v7.g.c(obj2);
                                        if (v7.g.a(((a) obj2).f3355a, obj)) {
                                            i10 = i14;
                                            break;
                                        }
                                        i14--;
                                    } else {
                                        i10 = -1;
                                        break;
                                    }
                                }
                                if (i10 == -1) {
                                    while (i13 >= i12) {
                                        Object obj3 = bVar.f3347e.get(bVar.f3344a.o().get(i13));
                                        v7.g.c(obj3);
                                        a aVar = (a) obj3;
                                        bVar.c.a();
                                        i13--;
                                    }
                                    i14 = i13;
                                }
                                if (i10 != -1) {
                                    if (i14 != i12) {
                                        LayoutNode layoutNode2 = bVar.f3344a;
                                        layoutNode2.f3422r = true;
                                        layoutNode2.D(i14, i12, 1);
                                        layoutNode2.f3422r = false;
                                    }
                                    bVar.f3352j--;
                                    layoutNode = bVar.f3344a.o().get(i12);
                                    Object obj4 = bVar.f3347e.get(layoutNode);
                                    v7.g.c(obj4);
                                    a aVar2 = (a) obj4;
                                    aVar2.f3358e.setValue(Boolean.TRUE);
                                    aVar2.f3357d = true;
                                    synchronized (SnapshotKt.c) {
                                        if (SnapshotKt.f2945i.get().f16588g != null) {
                                            if (!set.isEmpty()) {
                                                z12 = true;
                                            }
                                        }
                                        z12 = false;
                                    }
                                    if (z12) {
                                        SnapshotKt.a();
                                    }
                                    if (layoutNode == null) {
                                        int i15 = bVar.f3346d;
                                        LayoutNode layoutNode3 = new LayoutNode(2, true, 0);
                                        LayoutNode layoutNode4 = bVar.f3344a;
                                        layoutNode4.f3422r = true;
                                        layoutNode4.t(i15, layoutNode3);
                                        layoutNode4.f3422r = false;
                                        layoutNode = layoutNode3;
                                    }
                                }
                            }
                            layoutNode = null;
                            if (layoutNode == null) {
                            }
                        }
                        linkedHashMap.put(obj, layoutNode);
                    }
                    LayoutNode layoutNode5 = (LayoutNode) layoutNode;
                    int indexOf = bVar.f3344a.o().indexOf(layoutNode5);
                    int i16 = bVar.f3346d;
                    if (indexOf >= i16) {
                        if (i16 != indexOf) {
                            LayoutNode layoutNode6 = bVar.f3344a;
                            layoutNode6.f3422r = true;
                            layoutNode6.D(indexOf, i16, 1);
                            layoutNode6.f3422r = false;
                        }
                        bVar.f3346d++;
                        LinkedHashMap linkedHashMap2 = bVar.f3347e;
                        Object obj5 = linkedHashMap2.get(layoutNode5);
                        if (obj5 == null) {
                            obj5 = new a(obj, ComposableSingletons$SubcomposeLayoutKt.f3318a);
                            linkedHashMap2.put(layoutNode5, obj5);
                        }
                        a aVar3 = (a) obj5;
                        f fVar = aVar3.c;
                        if (fVar != null) {
                            z11 = fVar.n();
                        } else {
                            z11 = true;
                        }
                        if (aVar3.f3356b != pVar || z11 || aVar3.f3357d) {
                            aVar3.f3356b = pVar;
                            p0.f g10 = SnapshotKt.g((p0.f) SnapshotKt.f2939b.d(), null, false);
                            try {
                                p0.f i17 = g10.i();
                                LayoutNode layoutNode7 = bVar.f3344a;
                                layoutNode7.f3422r = true;
                                p<? super d, ? super Integer, n> pVar2 = aVar3.f3356b;
                                f fVar2 = aVar3.c;
                                g gVar = bVar.f3345b;
                                if (gVar != null) {
                                    ComposableLambdaImpl j02 = a1.c.j0(-34810602, new LayoutNodeSubcompositionsState$subcompose$2$1$1(aVar3, pVar2), true);
                                    if (fVar2 == null || fVar2.s()) {
                                        ViewGroup.LayoutParams layoutParams = x1.f3920a;
                                        fVar2 = i.a(new i0(layoutNode5), gVar);
                                    }
                                    fVar2.j(j02);
                                    aVar3.c = fVar2;
                                    layoutNode7.f3422r = false;
                                    n nVar = n.f16010a;
                                    p0.f.o(i17);
                                    g10.c();
                                    aVar3.f3357d = false;
                                } else {
                                    throw new IllegalStateException("parent composition reference not set".toString());
                                }
                            } catch (Throwable th) {
                                g10.c();
                                throw th;
                            }
                        }
                        return layoutNode5.m();
                    }
                    throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
            }
            z10 = true;
            if (!z10) {
            }
        }

        @Override // b2.b
        public final /* synthetic */ int a0(float f10) {
            return e.a(f10, this);
        }

        @Override // b2.b
        public final /* synthetic */ long g0(long j2) {
            return e.d(j2, this);
        }

        @Override // b2.b
        public final float getDensity() {
            return this.f3360j;
        }

        @Override // j1.g
        public final LayoutDirection getLayoutDirection() {
            return this.f3359i;
        }

        @Override // b2.b
        public final /* synthetic */ float i0(long j2) {
            return e.c(j2, this);
        }

        @Override // j1.t
        public final s m0(int i10, int i11, Map map, l lVar) {
            v7.g.f(map, "alignmentLines");
            v7.g.f(lVar, "placementBlock");
            return new s(i10, i11, this, map, lVar);
        }

        @Override // b2.b
        public final float r0(int i10) {
            return i10 / this.f3360j;
        }

        @Override // b2.b
        public final float t0(float f10) {
            return f10 / this.f3360j;
        }

        @Override // b2.b
        public final float y() {
            return this.f3361k;
        }
    }

    public b(LayoutNode layoutNode, g0 g0Var) {
        v7.g.f(layoutNode, "root");
        v7.g.f(g0Var, "slotReusePolicy");
        this.f3344a = layoutNode;
        this.c = g0Var;
        this.f3347e = new LinkedHashMap();
        this.f3348f = new LinkedHashMap();
        this.f3349g = new C0023b();
        this.f3350h = new LinkedHashMap();
        this.f3351i = new g0.a(0);
        this.f3354l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i10) {
        this.f3352j = 0;
        LayoutNode layoutNode = this.f3344a;
        int size = (layoutNode.o().size() - this.f3353k) - 1;
        if (i10 <= size) {
            g0.a aVar = this.f3351i;
            aVar.clear();
            LinkedHashMap linkedHashMap = this.f3347e;
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    Object obj = linkedHashMap.get(layoutNode.o().get(i11));
                    v7.g.c(obj);
                    aVar.f12652i.add(((a) obj).f3355a);
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.c.c(aVar);
            while (size >= i10) {
                LayoutNode layoutNode2 = layoutNode.o().get(size);
                Object obj2 = linkedHashMap.get(layoutNode2);
                v7.g.c(obj2);
                a aVar2 = (a) obj2;
                Object obj3 = aVar2.f3355a;
                if (aVar.contains(obj3)) {
                    LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                    layoutNode2.getClass();
                    layoutNode2.E = usageByParent;
                    this.f3352j++;
                    aVar2.f3358e.setValue(Boolean.FALSE);
                } else {
                    layoutNode.f3422r = true;
                    linkedHashMap.remove(layoutNode2);
                    f fVar = aVar2.c;
                    if (fVar != null) {
                        fVar.a();
                    }
                    layoutNode.I(size, 1);
                    layoutNode.f3422r = false;
                }
                this.f3348f.remove(obj3);
                size--;
            }
        }
        b();
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.f3347e;
        int size = linkedHashMap.size();
        LayoutNode layoutNode = this.f3344a;
        if (!(size == layoutNode.o().size())) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + linkedHashMap.size() + ") and the children count on the SubcomposeLayout (" + layoutNode.o().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if (!((layoutNode.o().size() - this.f3352j) - this.f3353k >= 0)) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + layoutNode.o().size() + ". Reusable children " + this.f3352j + ". Precomposed children " + this.f3353k).toString());
        }
        LinkedHashMap linkedHashMap2 = this.f3350h;
        if (linkedHashMap2.size() == this.f3353k) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f3353k + ". Map size " + linkedHashMap2.size()).toString());
    }
}
