package androidx.compose.foundation.text;

import a0.d;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import b0.c;
import b2.b;
import b2.h;
import g0.u0;
import j1.p;
import j1.q;
import j1.r;
import j1.t;
import j1.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ma.i;
import p1.a;
import p1.j;
import p1.m;
import p1.n;
import q0.d;
import u1.e;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class TextController implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextState f2103a;

    /* renamed from: b  reason: collision with root package name */
    public c f2104b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public final TextController$measurePolicy$1 f2105d = new q() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
            if (b2.a.e(r36) == b2.a.e(r10)) goto L128;
         */
        /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01c4  */
        @Override // j1.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final r a(t tVar, List<? extends p> list, long j2) {
            TextController textController;
            n nVar;
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            MultiParagraphIntrinsics multiParagraphIntrinsics;
            boolean z12;
            n nVar2;
            boolean z13;
            boolean z14;
            boolean a10;
            int size;
            ArrayList arrayList;
            boolean z15;
            Pair pair;
            c cVar;
            n nVar3;
            boolean z16;
            boolean z17;
            int h10;
            long j10;
            boolean z18;
            boolean z19;
            g.f(tVar, "$this$measure");
            TextController textController2 = TextController.this;
            TextState textState = textController2.f2103a;
            n nVar4 = textState.f2121e;
            a0.c cVar2 = textState.f2118a;
            LayoutDirection layoutDirection = tVar.getLayoutDirection();
            cVar2.getClass();
            g.f(layoutDirection, "layoutDirection");
            int i12 = cVar2.c;
            int i13 = cVar2.f9e;
            boolean z20 = cVar2.f8d;
            p1.p pVar = cVar2.f7b;
            if (nVar4 != null) {
                a aVar = cVar2.f6a;
                g.f(aVar, "text");
                g.f(pVar, "style");
                List<a.C0207a<j>> list2 = cVar2.f12h;
                g.f(list2, "placeholders");
                b bVar = cVar2.f10f;
                g.f(bVar, "density");
                e.a aVar2 = cVar2.f11g;
                g.f(aVar2, "fontFamilyResolver");
                p1.c cVar3 = nVar4.f16697b;
                boolean b5 = cVar3.f16649a.b();
                m mVar = nVar4.f16696a;
                if (b5 || !g.a(mVar.f16687a, aVar)) {
                    nVar3 = nVar4;
                } else {
                    p1.p pVar2 = mVar.f16688b;
                    pVar2.getClass();
                    if (pVar2 != pVar) {
                        nVar3 = nVar4;
                        if (!g.a(pVar2.f16704b, pVar.f16704b) || !pVar2.f16703a.b(pVar.f16703a)) {
                            z16 = false;
                            if (z16 && g.a(mVar.c, list2) && mVar.f16689d == i12 && mVar.f16690e == z20) {
                                if (mVar.f16691f != i13) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17 && g.a(mVar.f16692g, bVar) && mVar.f16693h == layoutDirection && g.a(mVar.f16694i, aVar2)) {
                                    h10 = b2.a.h(j2);
                                    j10 = mVar.f16695j;
                                    if (h10 != b2.a.h(j10)) {
                                        if (!z20) {
                                            if (i13 == 2) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if (!z19) {
                                                z18 = true;
                                                if (z18) {
                                                    textController = textController2;
                                                    nVar = nVar3;
                                                    nVar2 = new n(new m(mVar.f16687a, cVar2.f7b, mVar.c, mVar.f16689d, mVar.f16690e, mVar.f16691f, mVar.f16692g, mVar.f16693h, mVar.f16694i, j2), cVar3, v8.b.o(j2, v8.b.f((int) Math.ceil(cVar3.f16651d), (int) Math.ceil(cVar3.f16652e))));
                                                    n nVar5 = nVar;
                                                    a10 = g.a(nVar5, nVar2);
                                                    TextController textController3 = textController;
                                                    TextState textState2 = textController3.f2103a;
                                                    if (!a10) {
                                                        textState2.c.U(nVar2);
                                                        if (nVar5 != null && !g.a(nVar5.f16696a.f16687a, nVar2.f16696a.f16687a) && (cVar = textController3.f2104b) != null) {
                                                            long j11 = textState2.f2119b;
                                                            cVar.b();
                                                        }
                                                    }
                                                    textState2.getClass();
                                                    textState2.f2123g.setValue(m7.n.f16010a);
                                                    textState2.f2121e = nVar2;
                                                    size = list.size();
                                                    arrayList = nVar2.f16700f;
                                                    if (size < arrayList.size()) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (!z15) {
                                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                                        int size2 = arrayList.size();
                                                        for (int i14 = 0; i14 < size2; i14++) {
                                                            u0.d dVar = (u0.d) arrayList.get(i14);
                                                            if (dVar != null) {
                                                                float f10 = dVar.c;
                                                                float f11 = dVar.f17726a;
                                                                float f12 = dVar.f17728d;
                                                                float f13 = dVar.f17727b;
                                                                pair = new Pair(list.get(i14).b(v8.b.c((int) Math.floor(f10 - f11), (int) Math.floor(f12 - f13), 5)), new b2.g(i.g(m0.b.g1(f11), m0.b.g1(f13))));
                                                            } else {
                                                                pair = null;
                                                            }
                                                            if (pair != null) {
                                                                arrayList2.add(pair);
                                                            }
                                                        }
                                                        long j12 = nVar2.c;
                                                        return tVar.m0((int) (j12 >> 32), h.b(j12), kotlin.collections.d.M1(new Pair(AlignmentLineKt.f3312a, Integer.valueOf(m0.b.g1(nVar2.f16698d))), new Pair(AlignmentLineKt.f3313b, Integer.valueOf(m0.b.g1(nVar2.f16699e)))), new TextController$measurePolicy$1$measure$2(arrayList2));
                                                    }
                                                    throw new IllegalStateException("Check failed.".toString());
                                                }
                                                textController = textController2;
                                                nVar = nVar3;
                                            }
                                        }
                                        if (b2.a.f(j2) == b2.a.f(j10)) {
                                        }
                                        z18 = false;
                                        if (z18) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        nVar3 = nVar4;
                    }
                    z16 = true;
                    if (z16) {
                        if (mVar.f16691f != i13) {
                        }
                        if (z17) {
                            h10 = b2.a.h(j2);
                            j10 = mVar.f16695j;
                            if (h10 != b2.a.h(j10)) {
                            }
                        }
                    }
                }
                z18 = false;
                if (z18) {
                }
            } else {
                textController = textController2;
                nVar = nVar4;
            }
            MultiParagraphIntrinsics multiParagraphIntrinsics2 = cVar2.f13i;
            if (multiParagraphIntrinsics2 == null || layoutDirection != cVar2.f14j || multiParagraphIntrinsics2.b()) {
                cVar2.f14j = layoutDirection;
                multiParagraphIntrinsics2 = new MultiParagraphIntrinsics(cVar2.f6a, androidx.compose.ui.text.a.a(pVar, layoutDirection), cVar2.f12h, cVar2.f10f, cVar2.f11g);
            }
            cVar2.f13i = multiParagraphIntrinsics2;
            int h11 = b2.a.h(j2);
            if (!z20) {
                if (i13 == 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    z10 = false;
                    if (!z10 && b2.a.d(j2)) {
                        i10 = b2.a.f(j2);
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    if (!z20) {
                        if (i13 == 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z11 = true;
                            if (z11) {
                                i11 = 1;
                            } else {
                                i11 = i12;
                            }
                            if (h11 != i10) {
                                MultiParagraphIntrinsics multiParagraphIntrinsics3 = cVar2.f13i;
                                if (multiParagraphIntrinsics3 != null) {
                                    i10 = a1.c.c0((int) Math.ceil(multiParagraphIntrinsics3.c()), h11, i10);
                                } else {
                                    throw new IllegalStateException("layoutIntrinsics must be called first");
                                }
                            }
                            multiParagraphIntrinsics = cVar2.f13i;
                            if (multiParagraphIntrinsics != null) {
                                long c = v8.b.c(i10, b2.a.e(j2), 5);
                                if (i13 == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                p1.c cVar4 = new p1.c(multiParagraphIntrinsics, c, i11, z12);
                                nVar2 = new n(new m(cVar2.f6a, cVar2.f7b, cVar2.f12h, cVar2.c, cVar2.f8d, cVar2.f9e, cVar2.f10f, layoutDirection, cVar2.f11g, j2), cVar4, v8.b.o(j2, v8.b.f((int) Math.ceil(cVar4.f16651d), (int) Math.ceil(cVar4.f16652e))));
                                n nVar52 = nVar;
                                a10 = g.a(nVar52, nVar2);
                                TextController textController32 = textController;
                                TextState textState22 = textController32.f2103a;
                                if (!a10) {
                                }
                                textState22.getClass();
                                textState22.f2123g.setValue(m7.n.f16010a);
                                textState22.f2121e = nVar2;
                                size = list.size();
                                arrayList = nVar2.f16700f;
                                if (size < arrayList.size()) {
                                }
                                if (!z15) {
                                }
                            } else {
                                throw new IllegalStateException("layoutIntrinsics must be called first");
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                    if (h11 != i10) {
                    }
                    multiParagraphIntrinsics = cVar2.f13i;
                    if (multiParagraphIntrinsics != null) {
                    }
                }
            }
            z10 = true;
            if (!z10) {
            }
            i10 = Integer.MAX_VALUE;
            if (!z20) {
            }
            z11 = false;
            if (z11) {
            }
            if (h11 != i10) {
            }
            multiParagraphIntrinsics = cVar2.f13i;
            if (multiParagraphIntrinsics != null) {
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public final q0.d f2106e;

    /* renamed from: f  reason: collision with root package name */
    public q0.d f2107f;

    /* renamed from: g  reason: collision with root package name */
    public q0.d f2108g;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.TextController$measurePolicy$1] */
    public TextController(TextState textState) {
        this.f2103a = textState;
        d.a aVar = d.a.f16824i;
        q0.d I0 = a1.c.I0(aVar, 0.0f, 0.0f, 0.0f, null, false, 65535);
        TextController$drawTextAndSelectionBehind$1 textController$drawTextAndSelectionBehind$1 = new TextController$drawTextAndSelectionBehind$1(this);
        g.f(I0, "<this>");
        l<n0, m7.n> lVar = InspectableValueKt.f3744a;
        q0.d Z = I0.Z(new s0.c(textController$drawTextAndSelectionBehind$1, lVar));
        TextController$coreModifiers$1 textController$coreModifiers$1 = new TextController$coreModifiers$1(this);
        g.f(Z, "<this>");
        this.f2106e = Z.Z(new w(textController$coreModifiers$1, lVar));
        this.f2107f = m0.b.j1(aVar, false, new TextController$createSemanticsModifierFor$1(textState.f2118a.f6a, this));
        this.f2108g = aVar;
    }

    public static final boolean d(TextController textController, long j2, long j10) {
        n nVar = textController.f2103a.f2121e;
        if (nVar != null) {
            int length = nVar.f16696a.f16687a.f16641i.length();
            int f10 = nVar.f(j2);
            int f11 = nVar.f(j10);
            int i10 = length - 1;
            if (f10 >= i10 && f11 >= i10) {
                return true;
            }
            if (f10 < 0 && f11 < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.u0
    public final void a() {
        c cVar = this.f2104b;
        if (cVar != null) {
            TextState textState = this.f2103a;
            long j2 = textState.f2119b;
            cVar.d();
            textState.getClass();
        }
    }

    @Override // g0.u0
    public final void b() {
        this.f2103a.getClass();
    }

    @Override // g0.u0
    public final void c() {
        this.f2103a.getClass();
    }
}
