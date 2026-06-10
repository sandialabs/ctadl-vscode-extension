package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class q extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public int f6671a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6672b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6673d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6674e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6675f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6676g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6677h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6678i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6679j;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f4  */
    @Override // androidx.recyclerview.widget.RecyclerView.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        int i12;
        int i13;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        rect.setEmpty();
        recyclerView.getClass();
        RecyclerView.b0 L = RecyclerView.L(view);
        if (L != null) {
            i10 = L.c();
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            return;
        }
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        int d5 = recyclerView.getAdapter().d();
        boolean z22 = true;
        int i14 = 0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6673d = z10;
        int i15 = d5 - 1;
        if (i10 == i15) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6674e = z11;
        this.c = layoutManager.h();
        this.f6672b = layoutManager.i();
        boolean z23 = layoutManager instanceof GridLayoutManager;
        this.f6675f = z23;
        if (z23) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            GridLayoutManager.c cVar = gridLayoutManager.L;
            int c = cVar.c(i10);
            int i16 = gridLayoutManager.G;
            int b5 = cVar.b(i10, i16);
            if (b5 == 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f6676g = z17;
            if (b5 + c == i16) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.f6677h = z18;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (i17 <= i10) {
                    i18 += cVar.c(i17);
                    if (i18 > i16) {
                        z19 = false;
                        break;
                    }
                    i17++;
                } else {
                    z19 = true;
                    break;
                }
            }
            this.f6678i = z19;
            if (!z19) {
                int i19 = 0;
                while (true) {
                    if (i15 >= i10) {
                        i19 += cVar.c(i15);
                        if (i19 > i16) {
                            z21 = false;
                            break;
                        }
                        i15--;
                    } else {
                        z21 = true;
                        break;
                    }
                }
                if (z21) {
                    z20 = true;
                    this.f6679j = z20;
                }
            }
            z20 = false;
            this.f6679j = z20;
        }
        boolean z24 = this.f6675f;
        boolean z25 = this.c;
        if (!z24 ? !z25 || this.f6673d : (!z25 || this.f6678i) && (!this.f6672b || this.f6676g)) {
            z12 = false;
            if (z24 ? !z25 || this.f6674e : (!z25 || this.f6679j) && (!this.f6672b || this.f6677h)) {
                if (!z24 ? !this.f6672b || this.f6673d : (!z25 || this.f6676g) && (!this.f6672b || this.f6678i)) {
                    if (z24 ? !this.f6672b || this.f6674e : (!z25 || this.f6677h) && (!this.f6672b || this.f6679j)) {
                        if (!(layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).f5584u) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (layoutManager.E() != 1) {
                            z22 = false;
                        }
                        if (z25 && z22) {
                            z16 = !z16;
                        }
                        if (z16) {
                            if (!this.c) {
                                boolean z26 = z14;
                                z14 = z15;
                                z15 = z26;
                                boolean z27 = z13;
                                z13 = z12;
                                z12 = z27;
                            }
                        } else {
                            boolean z28 = z13;
                            z13 = z12;
                            z12 = z28;
                        }
                        int i20 = this.f6671a / 2;
                        if (z12) {
                            i11 = i20;
                        } else {
                            i11 = 0;
                        }
                        rect.right = i11;
                        if (z13) {
                            i12 = i20;
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z14) {
                            i13 = i20;
                        } else {
                            i13 = 0;
                        }
                        rect.top = i13;
                        if (z15) {
                            i14 = i20;
                        }
                        rect.bottom = i14;
                    }
                    z15 = true;
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                    }
                    z16 = false;
                    if (layoutManager.E() != 1) {
                    }
                    if (z25) {
                        z16 = !z16;
                    }
                    if (z16) {
                    }
                    int i202 = this.f6671a / 2;
                    if (z12) {
                    }
                    rect.right = i11;
                    if (z13) {
                    }
                    rect.left = i12;
                    if (z14) {
                    }
                    rect.top = i13;
                    if (z15) {
                    }
                    rect.bottom = i14;
                }
                z14 = true;
                z15 = z24 ? false : false;
                if (!(layoutManager instanceof LinearLayoutManager)) {
                }
                z16 = false;
                if (layoutManager.E() != 1) {
                }
                if (z25) {
                }
                if (z16) {
                }
                int i2022 = this.f6671a / 2;
                if (z12) {
                }
                rect.right = i11;
                if (z13) {
                }
                rect.left = i12;
                if (z14) {
                }
                rect.top = i13;
                if (z15) {
                }
                rect.bottom = i14;
            }
            z13 = true;
            z14 = !z24 ? false : false;
            if (z24) {
            }
            if (!(layoutManager instanceof LinearLayoutManager)) {
            }
            z16 = false;
            if (layoutManager.E() != 1) {
            }
            if (z25) {
            }
            if (z16) {
            }
            int i20222 = this.f6671a / 2;
            if (z12) {
            }
            rect.right = i11;
            if (z13) {
            }
            rect.left = i12;
            if (z14) {
            }
            rect.top = i13;
            if (z15) {
            }
            rect.bottom = i14;
        }
        z12 = true;
        z13 = z24 ? false : false;
        if (!z24) {
        }
        if (z24) {
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
        }
        z16 = false;
        if (layoutManager.E() != 1) {
        }
        if (z25) {
        }
        if (z16) {
        }
        int i202222 = this.f6671a / 2;
        if (z12) {
        }
        rect.right = i11;
        if (z13) {
        }
        rect.left = i12;
        if (z14) {
        }
        rect.top = i13;
        if (z15) {
        }
        rect.bottom = i14;
    }
}
