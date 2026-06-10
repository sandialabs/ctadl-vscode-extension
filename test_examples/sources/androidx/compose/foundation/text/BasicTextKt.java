package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.a;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.unit.LayoutDirection;
import b0.c;
import b2.b;
import g0.d;
import g0.h1;
import g0.r0;
import p1.n;
import p1.p;
import q0.d;
import u1.e;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ee, code lost:
        if (r6.f11g == r15) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, d dVar, p pVar, l<? super n, m7.n> lVar, int i10, boolean z10, int i11, g0.d dVar2, int i12, int i13) {
        int i14;
        Object obj;
        int i15;
        Object obj2;
        int i16;
        BasicTextKt$BasicText$1 basicTextKt$BasicText$1;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20;
        int i21;
        c cVar;
        l<? super n, m7.n> lVar2;
        d dVar3;
        p pVar2;
        int i22;
        boolean z12;
        int i23;
        l<? super n, m7.n> lVar3;
        r0 T;
        g.f(str, "text");
        ComposerImpl p10 = dVar2.p(1022429478);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (p10.z(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i24 = i13 & 2;
        if (i24 != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            obj = dVar;
            i14 |= p10.z(obj) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i12 & 896) == 0) {
                obj2 = pVar;
                i14 |= p10.z(obj2) ? 256 : 128;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i12 & 7168) == 0) {
                    basicTextKt$BasicText$1 = lVar;
                    i14 |= p10.z(basicTextKt$BasicText$1) ? 2048 : 1024;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((57344 & i12) == 0) {
                        i18 = i10;
                        i14 |= p10.H(i18) ? 16384 : 8192;
                        i19 = i13 & 32;
                        if (i19 != 0) {
                            i14 |= 196608;
                        } else if ((458752 & i12) == 0) {
                            z11 = z10;
                            i14 |= p10.c(z11) ? 131072 : 65536;
                            i20 = i13 & 64;
                            if (i20 == 0) {
                                i14 |= 1572864;
                            } else if ((i12 & 3670016) == 0) {
                                i14 |= p10.H(i11) ? 1048576 : 524288;
                            }
                            if ((i14 & 2995931) == 599186 && p10.s()) {
                                p10.e();
                                dVar3 = obj;
                                pVar2 = obj2;
                                lVar3 = basicTextKt$BasicText$1;
                                i22 = i18;
                                z12 = z11;
                                i23 = i11;
                                T = p10.T();
                                if (T == null) {
                                    return;
                                }
                                T.f11073d = new BasicTextKt$BasicText$3(str, dVar3, pVar2, lVar3, i22, z12, i23, i12, i13);
                                return;
                            }
                            d dVar4 = d.a.f16824i;
                            if (i24 != 0) {
                                obj = dVar4;
                            }
                            if (i15 != 0) {
                                obj2 = p.c;
                            }
                            if (i16 != 0) {
                                basicTextKt$BasicText$1 = BasicTextKt$BasicText$1.f2087j;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i19 != 0) {
                                z11 = true;
                            }
                            i21 = i20 == 0 ? Integer.MAX_VALUE : i11;
                            if (i21 <= 0) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            c cVar2 = (c) p10.w(SelectionRegistrarKt.f2125a);
                            h1 h1Var = CompositionLocalsKt.f3703e;
                            b bVar = (b) p10.w(h1Var);
                            e.a aVar = (e.a) p10.w(CompositionLocalsKt.f3706h);
                            d dVar5 = obj;
                            long longValue = ((Number) a.a(new Object[]{str, cVar2}, SaverKt.a(new BasicTextKt$selectionIdSaver$1(cVar2), BasicTextKt$selectionIdSaver$2.f2098j), new BasicTextKt$BasicText$selectableId$1(cVar2), p10)).longValue();
                            p10.f(-492369756);
                            Object a02 = p10.a0();
                            if (a02 == d.a.f11039a) {
                                cVar = cVar2;
                                lVar2 = basicTextKt$BasicText$1;
                                a02 = new TextController(new TextState(new a0.c(new p1.a(str, null, 6), obj2, i21, z11, i18, bVar, aVar), longValue));
                                p10.I0(a02);
                            } else {
                                cVar = cVar2;
                                lVar2 = basicTextKt$BasicText$1;
                            }
                            p10.Q(false);
                            TextController textController = (TextController) a02;
                            TextState textState = textController.f2103a;
                            if (!p10.L) {
                                a0.c cVar3 = textState.f2118a;
                                int i25 = a0.a.f2a;
                                g.f(cVar3, "current");
                                g.f(obj2, "style");
                                g.f(bVar, "density");
                                g.f(aVar, "fontFamilyResolver");
                                if (g.a(cVar3.f6a.f16641i, str) && g.a(cVar3.f7b, obj2) && cVar3.f8d == z11) {
                                    if (cVar3.f9e == i18) {
                                        if (cVar3.c == i21) {
                                            if (g.a(cVar3.f10f, bVar)) {
                                            }
                                        }
                                    }
                                }
                                cVar3 = new a0.c(new p1.a(str, null, 6), obj2, i21, z11, i18, bVar, aVar);
                                TextState textState2 = textController.f2103a;
                                if (textState2.f2118a != cVar3) {
                                    textState2.f2118a = cVar3;
                                    textController.f2107f = m0.b.j1(dVar4, false, new TextController$createSemanticsModifierFor$1(cVar3.f6a, textController));
                                }
                            }
                            textState.getClass();
                            l<? super n, m7.n> lVar4 = lVar2;
                            g.f(lVar4, "<set-?>");
                            textState.c = lVar4;
                            c cVar4 = cVar;
                            textController.f2104b = cVar4;
                            if (cVar4 != null) {
                                a0.b bVar2 = new a0.b(textController, cVar4);
                                textController.c = bVar2;
                                dVar4 = SuspendingPointerInputFilterKt.b(dVar4, bVar2, new TextController$update$2(textController, null));
                            }
                            textController.f2108g = dVar4;
                            p10.f(959239573);
                            if (cVar4 != null) {
                                long j2 = ((b0.d) p10.w(TextSelectionColorsKt.f2127a)).f6333b;
                            }
                            p10.Q(false);
                            q0.d Z = dVar5.Z(textController.f2106e.Z(textController.f2107f).Z(textController.f2108g));
                            p10.f(544976794);
                            b bVar3 = (b) p10.w(h1Var);
                            LayoutDirection layoutDirection = (LayoutDirection) p10.w(CompositionLocalsKt.f3709k);
                            j1 j1Var = (j1) p10.w(CompositionLocalsKt.f3712o);
                            q0.d b5 = ComposedModifierKt.b(p10, Z);
                            ComposeUiNode.f3400a.getClass();
                            u7.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3402b;
                            p10.f(1405779621);
                            if (p10.f2640a instanceof g0.c) {
                                p10.r();
                                if (p10.L) {
                                    p10.m(new BasicTextKt$BasicTextBpD7jsM$$inlined$Layout$1(aVar2));
                                } else {
                                    p10.n();
                                }
                                p10.f2661x = false;
                                a1.c.s1(p10, textController.f2105d, ComposeUiNode.Companion.f3404e);
                                a1.c.s1(p10, bVar3, ComposeUiNode.Companion.f3403d);
                                a1.c.s1(p10, layoutDirection, ComposeUiNode.Companion.f3405f);
                                a1.c.s1(p10, j1Var, ComposeUiNode.Companion.f3406g);
                                a1.c.s1(p10, b5, ComposeUiNode.Companion.c);
                                p10.h();
                                p10.Q(true);
                                p10.Q(false);
                                p10.Q(false);
                                dVar3 = dVar5;
                                pVar2 = obj2;
                                i22 = i18;
                                z12 = z11;
                                i23 = i21;
                                lVar3 = lVar4;
                                T = p10.T();
                                if (T == null) {
                                }
                            } else {
                                a1.c.L0();
                                throw null;
                            }
                        }
                        z11 = z10;
                        i20 = i13 & 64;
                        if (i20 == 0) {
                        }
                        if ((i14 & 2995931) == 599186) {
                            p10.e();
                            dVar3 = obj;
                            pVar2 = obj2;
                            lVar3 = basicTextKt$BasicText$1;
                            i22 = i18;
                            z12 = z11;
                            i23 = i11;
                            T = p10.T();
                            if (T == null) {
                            }
                        }
                        q0.d dVar42 = d.a.f16824i;
                        if (i24 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 <= 0) {
                        }
                    }
                    i18 = i10;
                    i19 = i13 & 32;
                    if (i19 != 0) {
                    }
                    z11 = z10;
                    i20 = i13 & 64;
                    if (i20 == 0) {
                    }
                    if ((i14 & 2995931) == 599186) {
                    }
                    q0.d dVar422 = d.a.f16824i;
                    if (i24 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 <= 0) {
                    }
                }
                basicTextKt$BasicText$1 = lVar;
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                i18 = i10;
                i19 = i13 & 32;
                if (i19 != 0) {
                }
                z11 = z10;
                i20 = i13 & 64;
                if (i20 == 0) {
                }
                if ((i14 & 2995931) == 599186) {
                }
                q0.d dVar4222 = d.a.f16824i;
                if (i24 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 == 0) {
                }
                if (i21 <= 0) {
                }
            }
            obj2 = pVar;
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            basicTextKt$BasicText$1 = lVar;
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            i18 = i10;
            i19 = i13 & 32;
            if (i19 != 0) {
            }
            z11 = z10;
            i20 = i13 & 64;
            if (i20 == 0) {
            }
            if ((i14 & 2995931) == 599186) {
            }
            q0.d dVar42222 = d.a.f16824i;
            if (i24 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 == 0) {
            }
            if (i21 <= 0) {
            }
        }
        obj = dVar;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        obj2 = pVar;
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        basicTextKt$BasicText$1 = lVar;
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        i18 = i10;
        i19 = i13 & 32;
        if (i19 != 0) {
        }
        z11 = z10;
        i20 = i13 & 64;
        if (i20 == 0) {
        }
        if ((i14 & 2995931) == 599186) {
        }
        q0.d dVar422222 = d.a.f16824i;
        if (i24 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 == 0) {
        }
        if (i21 <= 0) {
        }
    }
}
