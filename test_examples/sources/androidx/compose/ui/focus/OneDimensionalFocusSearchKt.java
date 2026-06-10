package androidx.compose.ui.focus;

import a1.c;
import b8.i;
import h0.e;
import kotlin.NoWhenBranchMatchedException;
import m0.b;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    public static final boolean a(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            if (d(focusModifier, lVar)) {
                                return true;
                            }
                            if (lVar.U(focusModifier).booleanValue()) {
                                return true;
                            }
                            return false;
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
                                } else if (a(focusModifier2, lVar)) {
                                    return true;
                                } else {
                                    if (c(focusModifier, focusModifier2, 2, lVar)) {
                                        return true;
                                    }
                                }
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (a(focusModifier2, lVar)) {
                        return true;
                    } else {
                        if (lVar.U(focusModifier2).booleanValue()) {
                            return true;
                        }
                    }
                    return false;
                }
                return c(focusModifier, focusModifier2, 2, lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return d(focusModifier, lVar);
    }

    public static final boolean b(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        boolean z10;
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return lVar.U(focusModifier).booleanValue();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            FocusModifier focusModifier2 = focusModifier.f3020m;
            if (focusModifier2 != null) {
                if (!b(focusModifier2, lVar) && !c(focusModifier, focusModifier2, 1, lVar)) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        t0.l lVar2 = t0.l.f17553a;
        e<FocusModifier> eVar = focusModifier.f3018k;
        eVar.p(lVar2);
        int i10 = eVar.f11334k;
        if (i10 <= 0) {
            return false;
        }
        FocusModifier[] focusModifierArr = eVar.f11332i;
        g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        do {
            FocusModifier focusModifier3 = focusModifierArr[i11];
            if (b.B0(focusModifier3) && b(focusModifier3, lVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            i11++;
        } while (i11 < i10);
        return false;
    }

    public static final boolean c(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        if (e(focusModifier, focusModifier2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) c.p1(focusModifier, i10, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        t0.l lVar2 = t0.l.f17553a;
        e<FocusModifier> eVar = focusModifier.f3018k;
        eVar.p(lVar2);
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            int i11 = i10 - 1;
            FocusModifier[] focusModifierArr = eVar.f11332i;
            g.d(focusModifierArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                FocusModifier focusModifier2 = focusModifierArr[i11];
                if (b.B0(focusModifier2) && a(focusModifier2, lVar)) {
                    return true;
                }
                i11--;
            } while (i11 >= 0);
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        FocusStateImpl focusStateImpl = focusModifier.f3019l;
        FocusStateImpl focusStateImpl2 = FocusStateImpl.ActiveParent;
        FocusStateImpl focusStateImpl3 = FocusStateImpl.DeactivatedParent;
        boolean z14 = true;
        if (focusStateImpl != focusStateImpl2 && focusStateImpl != focusStateImpl3) {
            z10 = false;
            if (!z10) {
                t0.l lVar2 = t0.l.f17553a;
                e<FocusModifier> eVar = focusModifier.f3018k;
                eVar.p(lVar2);
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i11 = new i(0, eVar.f11334k - 1).f6498j;
                    if (i11 >= 0) {
                        boolean z15 = false;
                        int i12 = 0;
                        while (true) {
                            if (z15) {
                                FocusModifier focusModifier3 = eVar.f11332i[i12];
                                if (b.B0(focusModifier3) && b(focusModifier3, lVar)) {
                                    return true;
                                }
                            }
                            if (g.a(eVar.f11332i[i12], focusModifier2)) {
                                z15 = true;
                            }
                            if (i12 == i11) {
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (i10 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        int i13 = new i(0, eVar.f11334k - 1).f6498j;
                        if (i13 >= 0) {
                            boolean z16 = false;
                            while (true) {
                                if (z16) {
                                    FocusModifier focusModifier4 = eVar.f11332i[i13];
                                    if (b.B0(focusModifier4) && a(focusModifier4, lVar)) {
                                        return true;
                                    }
                                }
                                if (g.a(eVar.f11332i[i13], focusModifier2)) {
                                    z16 = true;
                                }
                                if (i13 == 0) {
                                    break;
                                }
                                i13--;
                            }
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                    }
                }
                if (i10 == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && focusModifier.f3019l != focusStateImpl3) {
                    if (focusModifier.f3017j != null) {
                        z14 = false;
                    }
                    if (!z14) {
                        return lVar.U(focusModifier).booleanValue();
                    }
                }
                return false;
            }
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        z10 = true;
        if (!z10) {
        }
    }
}
