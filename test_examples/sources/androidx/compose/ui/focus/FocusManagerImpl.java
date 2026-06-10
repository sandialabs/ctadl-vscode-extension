package androidx.compose.ui.focus;

import androidx.compose.ui.unit.LayoutDirection;
import k1.h;
import kotlin.NoWhenBranchMatchedException;
import m0.b;
import t0.a;
import t0.d;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class FocusManagerImpl implements d {

    /* renamed from: a  reason: collision with root package name */
    public final FocusModifier f3013a;

    /* renamed from: b  reason: collision with root package name */
    public final q0.d f3014b;
    public LayoutDirection c;

    public FocusManagerImpl() {
        FocusModifier focusModifier = new FocusModifier(0);
        this.f3013a = focusModifier;
        h<FocusModifier> hVar = FocusModifierKt.f3032a;
        this.f3014b = focusModifier.Z(FocusModifierKt.f3033b);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00eb  */
    @Override // t0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        l<? super a, FocusRequester> lVar;
        a aVar;
        FocusRequester U;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        FocusModifier focusModifier;
        boolean booleanValue;
        int i11;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        FocusModifier focusModifier2 = this.f3013a;
        FocusModifier X = b.X(focusModifier2);
        if (X == null) {
            return false;
        }
        LayoutDirection layoutDirection = this.c;
        if (layoutDirection != null) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            FocusPropertiesImpl focusPropertiesImpl = X.f3025s;
            if (z10) {
                U = focusPropertiesImpl.f3038b;
            } else {
                if (i10 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    U = focusPropertiesImpl.c;
                } else {
                    if (i10 == 5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        U = focusPropertiesImpl.f3039d;
                    } else {
                        if (i10 == 6) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            U = focusPropertiesImpl.f3040e;
                        } else {
                            if (i10 == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                int ordinal = layoutDirection.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        U = focusPropertiesImpl.f3044i;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    U = focusPropertiesImpl.f3043h;
                                }
                                if (g.a(U, FocusRequester.f3054b)) {
                                    U = null;
                                }
                                if (U == null) {
                                    U = focusPropertiesImpl.f3041f;
                                }
                            } else {
                                if (i10 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    int ordinal2 = layoutDirection.ordinal();
                                    if (ordinal2 != 0) {
                                        if (ordinal2 == 1) {
                                            U = focusPropertiesImpl.f3043h;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        U = focusPropertiesImpl.f3044i;
                                    }
                                    if (g.a(U, FocusRequester.f3054b)) {
                                        U = null;
                                    }
                                    if (U == null) {
                                        U = focusPropertiesImpl.f3042g;
                                    }
                                } else {
                                    if (i10 == 7) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        lVar = focusPropertiesImpl.f3045j;
                                        aVar = new a(i10);
                                    } else {
                                        if (i10 == 8) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            lVar = focusPropertiesImpl.f3046k;
                                            aVar = new a(i10);
                                        } else {
                                            throw new IllegalStateException("invalid FocusDirection".toString());
                                        }
                                    }
                                    U = lVar.U(aVar);
                                }
                            }
                        }
                    }
                }
            }
            if (!g.a(U, FocusRequester.c)) {
                if (g.a(U, FocusRequester.f3054b)) {
                    LayoutDirection layoutDirection2 = this.c;
                    if (layoutDirection2 != null) {
                        FocusManagerImpl$moveFocus$foundNextItem$1 focusManagerImpl$moveFocus$foundNextItem$1 = new FocusManagerImpl$moveFocus$foundNextItem$1(X);
                        if (i10 == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (!z18 && i10 != 2) {
                            z19 = false;
                            if (!z19) {
                                if (i10 == 1) {
                                    z30 = true;
                                } else {
                                    z30 = false;
                                }
                                if (z30) {
                                    booleanValue = OneDimensionalFocusSearchKt.b(focusModifier2, focusManagerImpl$moveFocus$foundNextItem$1);
                                } else {
                                    if (i10 == 2) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    if (z31) {
                                        booleanValue = OneDimensionalFocusSearchKt.a(focusModifier2, focusManagerImpl$moveFocus$foundNextItem$1);
                                    } else {
                                        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                                    }
                                }
                            } else {
                                if (i10 == 3) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (!z20 && i10 != 4) {
                                    z21 = false;
                                    if (!z21 && i10 != 5) {
                                        z22 = false;
                                        if (!z22 && i10 != 6) {
                                            z23 = false;
                                            if (!z23) {
                                                booleanValue = TwoDimensionalFocusSearchKt.i(focusModifier2, i10, focusManagerImpl$moveFocus$foundNextItem$1);
                                            } else {
                                                if (i10 == 7) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                                if (z24) {
                                                    int ordinal3 = layoutDirection2.ordinal();
                                                    if (ordinal3 != 0) {
                                                        if (ordinal3 == 1) {
                                                            i11 = 3;
                                                        } else {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                    } else {
                                                        i11 = 4;
                                                    }
                                                    FocusModifier X2 = b.X(focusModifier2);
                                                    if (X2 != null) {
                                                        booleanValue = TwoDimensionalFocusSearchKt.i(X2, i11, focusManagerImpl$moveFocus$foundNextItem$1);
                                                    }
                                                    booleanValue = false;
                                                } else {
                                                    if (i10 == 8) {
                                                        z25 = true;
                                                    } else {
                                                        z25 = false;
                                                    }
                                                    if (z25) {
                                                        FocusModifier X3 = b.X(focusModifier2);
                                                        if (X3 != null) {
                                                            focusModifier = b.Z(X3);
                                                        } else {
                                                            focusModifier = null;
                                                        }
                                                        if (!g.a(focusModifier, focusModifier2) && focusModifier != null) {
                                                            booleanValue = ((Boolean) focusManagerImpl$moveFocus$foundNextItem$1.U(focusModifier)).booleanValue();
                                                        }
                                                        booleanValue = false;
                                                    } else {
                                                        throw new IllegalStateException("Invalid FocusDirection".toString());
                                                    }
                                                }
                                            }
                                        }
                                        z23 = true;
                                        if (!z23) {
                                        }
                                    }
                                    z22 = true;
                                    if (!z22) {
                                        z23 = false;
                                        if (!z23) {
                                        }
                                    }
                                    z23 = true;
                                    if (!z23) {
                                    }
                                }
                                z21 = true;
                                if (!z21) {
                                    z22 = false;
                                    if (!z22) {
                                    }
                                    z23 = true;
                                    if (!z23) {
                                    }
                                }
                                z22 = true;
                                if (!z22) {
                                }
                                z23 = true;
                                if (!z23) {
                                }
                            }
                            if (!booleanValue) {
                                int ordinal4 = focusModifier2.f3019l.ordinal();
                                if (ordinal4 != 0 && ordinal4 != 1 && ordinal4 != 2) {
                                    if (ordinal4 != 3) {
                                        if (ordinal4 != 4) {
                                            if (ordinal4 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    }
                                    z26 = false;
                                    if (z26 && !focusModifier2.f3019l.a()) {
                                        if (i10 != 1) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        if (!z28 && i10 != 2) {
                                            z29 = false;
                                            if (z29) {
                                                b(false);
                                                if (focusModifier2.f3019l.a()) {
                                                    z27 = a(i10);
                                                    if (z27) {
                                                    }
                                                } else {
                                                    z27 = false;
                                                    if (z27) {
                                                    }
                                                }
                                            }
                                        }
                                        z29 = true;
                                        if (z29) {
                                        }
                                    }
                                    z27 = false;
                                    if (z27) {
                                    }
                                }
                                z26 = true;
                                if (z26) {
                                    if (i10 != 1) {
                                    }
                                    if (!z28) {
                                        z29 = false;
                                        if (z29) {
                                        }
                                    }
                                    z29 = true;
                                    if (z29) {
                                    }
                                }
                                z27 = false;
                                if (z27) {
                                }
                            }
                        }
                        z19 = true;
                        if (!z19) {
                        }
                        if (!booleanValue) {
                        }
                    } else {
                        g.l("layoutDirection");
                        throw null;
                    }
                } else {
                    U.b();
                }
                return true;
            }
            return false;
        }
        g.l("layoutDirection");
        throw null;
    }

    @Override // t0.d
    public final void b(boolean z10) {
        FocusStateImpl focusStateImpl;
        FocusModifier focusModifier = this.f3013a;
        FocusStateImpl focusStateImpl2 = focusModifier.f3019l;
        if (FocusTransactionsKt.b(focusModifier, z10)) {
            int ordinal = focusStateImpl2.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                if (ordinal != 3 && ordinal != 4) {
                    if (ordinal == 5) {
                        focusStateImpl = FocusStateImpl.Inactive;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    focusStateImpl = FocusStateImpl.Deactivated;
                }
            } else {
                focusStateImpl = FocusStateImpl.Active;
            }
            focusModifier.c(focusStateImpl);
        }
    }
}
