package androidx.compose.ui.focus;

import a1.c;
import h0.e;
import kotlin.NoWhenBranchMatchedException;
import m0.b;
import t0.a;
import u0.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        if (r15 <= r12) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(d dVar, d dVar2, d dVar3, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        float f10;
        float f11;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        if (!b(i10, dVar3, dVar) && b(i10, dVar2, dVar)) {
            if (i10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = dVar3.f17727b;
            float f13 = dVar3.f17728d;
            float f14 = dVar3.f17726a;
            float f15 = dVar3.c;
            float f16 = dVar.f17728d;
            float f17 = dVar.f17727b;
            float f18 = dVar.c;
            float f19 = dVar.f17726a;
            if (z10) {
                if (f19 >= f15) {
                    z14 = true;
                }
                z14 = false;
            } else {
                if (i10 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (f18 <= f14) {
                        z14 = true;
                    }
                    z14 = false;
                } else {
                    if (i10 == 5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (f17 >= f13) {
                            z14 = true;
                        }
                        z14 = false;
                    } else {
                        if (i10 == 6) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                    }
                }
            }
            if (z14) {
                if (i10 == 3) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    if (i10 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (!z16) {
                        if (i10 == 3) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            f11 = dVar2.c;
                            f10 = f19;
                        } else {
                            if (i10 == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                f10 = dVar2.f17726a;
                                f11 = f18;
                            } else {
                                if (i10 == 5) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    f11 = dVar2.f17728d;
                                    f10 = f17;
                                } else {
                                    if (i10 == 6) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (z20) {
                                        f10 = dVar2.f17727b;
                                        f11 = f16;
                                    } else {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                }
                            }
                        }
                        float max = Math.max(0.0f, f10 - f11);
                        if (i10 == 3) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            f13 = f19;
                            f12 = f14;
                        } else {
                            if (i10 == 4) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (z22) {
                                f13 = f15;
                                f12 = f18;
                            } else {
                                if (i10 == 5) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    f13 = f17;
                                } else {
                                    if (i10 == 6) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        f12 = f16;
                                    } else {
                                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                    }
                                }
                            }
                        }
                        if (max < Math.max(1.0f, f13 - f12)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(int i10, d dVar, d dVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i10 != 4) {
            z11 = false;
            if (!z11) {
                if (dVar.f17728d > dVar2.f17727b && dVar.f17727b < dVar2.f17728d) {
                    return true;
                }
            } else {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 && i10 != 6) {
                    z13 = false;
                    if (!z13) {
                        if (dVar.c > dVar2.f17726a && dVar.f17726a < dVar2.c) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
                z13 = true;
                if (!z13) {
                }
            }
            return false;
        }
        z11 = true;
        if (!z11) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
        if (g(r15, r14, r7) >= g(r15, r14, r0)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092 A[PHI: r4 
      PHI: (r4v12 androidx.compose.ui.focus.FocusModifier) = (r4v11 androidx.compose.ui.focus.FocusModifier), (r4v14 androidx.compose.ui.focus.FocusModifier) binds: [B:31:0x0047, B:58:0x0092] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FocusModifier c(e<FocusModifier> eVar, d dVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        d c;
        float f11;
        int i11;
        boolean z14;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = dVar.f17726a;
        float f13 = dVar.c;
        if (z10) {
            f11 = (f13 - f12) + 1;
        } else {
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f11 = -((f13 - f12) + 1);
            } else {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                float f14 = dVar.f17727b;
                float f15 = dVar.f17728d;
                if (z12) {
                    f10 = (f15 - f14) + 1;
                } else {
                    if (i10 == 6) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f10 = -((f15 - f14) + 1);
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
                c = dVar.c(0.0f, f10);
                i11 = eVar.f11334k;
                FocusModifier focusModifier = null;
                if (i11 <= 0) {
                    FocusModifier[] focusModifierArr = eVar.f11332i;
                    g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i12 = 0;
                    do {
                        FocusModifier focusModifier2 = focusModifierArr[i12];
                        if (b.B0(focusModifier2)) {
                            d f02 = b.f0(focusModifier2);
                            if (f(i10, f02, dVar)) {
                                if (f(i10, c, dVar)) {
                                    if (!a(dVar, f02, c, i10)) {
                                        if (!a(dVar, c, f02, i10)) {
                                        }
                                    }
                                }
                                z14 = true;
                                if (z14) {
                                    focusModifier = focusModifier2;
                                    c = f02;
                                }
                            }
                            z14 = false;
                            if (z14) {
                            }
                        }
                        i12++;
                    } while (i12 < i11);
                    return focusModifier;
                }
                return focusModifier;
            }
        }
        c = dVar.c(f11, 0.0f);
        i11 = eVar.f11334k;
        FocusModifier focusModifier3 = null;
        if (i11 <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(FocusModifier focusModifier, int i10, l<? super FocusModifier, Boolean> lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d dVar;
        FocusModifier c;
        Object obj;
        g.f(focusModifier, "$this$findChildCorrespondingToFocusEnter");
        g.f(lVar, "onFound");
        Boolean a10 = focusModifier.f3025s.f3045j.U(new a(i10)).a(lVar);
        if (a10 != null) {
            return a10.booleanValue();
        }
        e t10 = b.t(focusModifier);
        int i11 = t10.f11334k;
        boolean z14 = true;
        if (i11 <= 1) {
            if (i11 != 0) {
                z14 = false;
            }
            if (z14) {
                obj = null;
            } else {
                obj = t10.f11332i[0];
            }
            FocusModifier focusModifier2 = (FocusModifier) obj;
            if (focusModifier2 == null) {
                return false;
            }
            return lVar.U(focusModifier2).booleanValue();
        }
        if (i10 == 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 3;
        }
        if (i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && i10 != 6) {
            z12 = false;
            if (!z12) {
                d f02 = b.f0(focusModifier);
                float f10 = f02.f17726a;
                float f11 = f02.f17727b;
                dVar = new d(f10, f11, f10, f11);
            } else {
                if (i10 == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && i10 != 5) {
                    z14 = false;
                }
                if (z14) {
                    d f03 = b.f0(focusModifier);
                    float f12 = f03.c;
                    float f13 = f03.f17728d;
                    dVar = new d(f12, f13, f12, f13);
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
            }
            c = c(t10, dVar, i10);
            if (c != null) {
                return false;
            }
            return lVar.U(c).booleanValue();
        }
        z12 = true;
        if (!z12) {
        }
        c = c(t10, dVar, i10);
        if (c != null) {
        }
    }

    public static final boolean e(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        if (h(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) c.p1(focusModifier, i10, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(int i10, d dVar, d dVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = dVar.f17726a;
        float f11 = dVar.c;
        float f12 = dVar2.f17726a;
        float f13 = dVar2.c;
        if (z10) {
            if ((f13 <= f11 && f12 < f11) || f12 <= f10) {
                return false;
            }
        } else {
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if ((f12 >= f10 && f13 > f10) || f13 >= f11) {
                    return false;
                }
            } else {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                float f14 = dVar.f17727b;
                float f15 = dVar.f17728d;
                float f16 = dVar2.f17727b;
                float f17 = dVar2.f17728d;
                if (z12) {
                    if ((f17 <= f15 && f16 < f15) || f16 <= f14) {
                        return false;
                    }
                } else {
                    if (i10 == 6) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if ((f16 >= f14 && f17 > f14) || f17 >= f15) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long g(int i10, d dVar, d dVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float f11;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        float f12;
        float f13;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f14 = dVar.f17728d;
        float f15 = dVar.f17727b;
        float f16 = dVar.c;
        float f17 = dVar.f17726a;
        float f18 = dVar2.f17727b;
        float f19 = dVar2.f17728d;
        float f20 = dVar2.f17726a;
        float f21 = dVar2.c;
        if (z10) {
            f11 = f17;
            f10 = f21;
        } else {
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f10 = f16;
                f11 = f20;
            } else {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f11 = f15;
                    f10 = f19;
                } else {
                    if (i10 == 6) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f10 = f14;
                        f11 = f18;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = Math.abs(Math.max(0.0f, f11 - f10));
        if (i10 == 3) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14 && i10 != 4) {
            z15 = false;
            if (!z15) {
                f12 = 2;
                f13 = ((f14 - f15) / f12) + f15;
            } else {
                if (i10 == 5) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16 && i10 != 6) {
                    z17 = false;
                    if (!z17) {
                        f12 = 2;
                        f13 = ((f16 - f17) / f12) + f17;
                        f19 = f21;
                        f18 = f20;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
                z17 = true;
                if (!z17) {
                }
            }
            long abs2 = Math.abs(f13 - (((f19 - f18) / f12) + f18));
            return (abs2 * abs2) + (13 * abs * abs);
        }
        z15 = true;
        if (!z15) {
        }
        long abs22 = Math.abs(f13 - (((f19 - f18) / f12) + f18));
        return (abs22 * abs22) + (13 * abs * abs);
    }

    public static final boolean h(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        FocusModifier c;
        e<FocusModifier> eVar = focusModifier.f3018k;
        e eVar2 = new e(new FocusModifier[eVar.f11334k]);
        eVar2.c(eVar2.f11334k, eVar);
        while (eVar2.j() && (c = c(eVar2, b.f0(focusModifier2), i10)) != null) {
            if (!c.f3019l.b()) {
                return lVar.U(c).booleanValue();
            }
            Boolean a10 = c.f3025s.f3045j.U(new a(i10)).a(lVar);
            if (a10 != null) {
                return a10.booleanValue();
            }
            if (e(c, focusModifier2, i10, lVar)) {
                return true;
            }
            eVar2.l(c);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
        r0 = m0.b.X(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        return e(r9, r0, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(FocusModifier focusModifier, int i10, l<? super FocusModifier, Boolean> lVar) {
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            boolean z10 = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return false;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ((Boolean) ((FocusManagerImpl$moveFocus$foundNextItem$1) lVar).U(focusModifier)).booleanValue();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            FocusModifier focusModifier2 = focusModifier.f3020m;
            if (focusModifier2 != null) {
                int ordinal2 = focusModifier2.f3019l.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    if (ordinal2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    }
                    if (i(focusModifier2, i10, lVar)) {
                        return true;
                    }
                    Boolean a10 = focusModifier2.f3025s.f3046k.U(new a(i10)).a(lVar);
                    if (a10 != null) {
                        return a10.booleanValue();
                    }
                    FocusStateImpl focusStateImpl = focusModifier2.f3019l;
                    if (focusStateImpl != FocusStateImpl.ActiveParent && focusStateImpl != FocusStateImpl.DeactivatedParent) {
                        z10 = false;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                return e(focusModifier, focusModifier2, i10, lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return d(focusModifier, i10, lVar);
    }
}
