package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f6149a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f6150b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f6151d;

    /* renamed from: e  reason: collision with root package name */
    public int f6152e;

    /* renamed from: f  reason: collision with root package name */
    public int f6153f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6154g;

    /* renamed from: h  reason: collision with root package name */
    public int f6155h;

    /* renamed from: i  reason: collision with root package name */
    public int f6156i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6157j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6158k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6159l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6160m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6161a;

        /* renamed from: b  reason: collision with root package name */
        public float f6162b;
        public int c;
    }

    public c(ViewPager2 viewPager2) {
        this.f6150b = viewPager2;
        ViewPager2.i iVar = viewPager2.f6127r;
        this.c = iVar;
        this.f6151d = (LinearLayoutManager) iVar.getLayoutManager();
        this.f6154g = new a();
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i10, RecyclerView recyclerView) {
        boolean z10;
        boolean z11;
        ViewPager2.e eVar;
        int i11 = this.f6152e;
        boolean z12 = true;
        if ((i11 != 1 || this.f6153f != 1) && i10 == 1) {
            this.f6160m = false;
            this.f6152e = 1;
            int i12 = this.f6156i;
            if (i12 != -1) {
                this.f6155h = i12;
                this.f6156i = -1;
            } else if (this.f6155h == -1) {
                this.f6155h = this.f6151d.T0();
            }
            d(1);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
            if (!z10 && i10 == 2) {
                if (this.f6158k) {
                    d(2);
                    this.f6157j = true;
                    return;
                }
                return;
            }
            if (i11 != 1 && i11 != 4) {
                z11 = false;
                a aVar = this.f6154g;
                if (z11 && i10 == 0) {
                    f();
                    if (this.f6158k) {
                        int i13 = aVar.f6161a;
                        if (i13 != -1 && (eVar = this.f6149a) != null) {
                            eVar.b(0.0f, i13, 0);
                        }
                    } else if (aVar.c == 0) {
                        int i14 = this.f6155h;
                        int i15 = aVar.f6161a;
                        if (i14 != i15) {
                            c(i15);
                        }
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        d(0);
                        e();
                    }
                }
                if (this.f6152e != 2 && i10 == 0 && this.f6159l) {
                    f();
                    if (aVar.c == 0) {
                        int i16 = this.f6156i;
                        int i17 = aVar.f6161a;
                        if (i16 != i17) {
                            if (i17 == -1) {
                                i17 = 0;
                            }
                            c(i17);
                        }
                        d(0);
                        e();
                        return;
                    }
                    return;
                }
                return;
            }
            z11 = true;
            a aVar2 = this.f6154g;
            if (z11) {
                f();
                if (this.f6158k) {
                }
                if (z12) {
                }
            }
            if (this.f6152e != 2) {
                return;
            }
            return;
        }
        z10 = true;
        if (!z10) {
        }
        if (i11 != 1) {
            z11 = false;
            a aVar22 = this.f6154g;
            if (z11) {
            }
            if (this.f6152e != 2) {
            }
        }
        z11 = true;
        a aVar222 = this.f6154g;
        if (z11) {
        }
        if (this.f6152e != 2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        this.f6158k = true;
        f();
        boolean z13 = this.f6157j;
        a aVar = this.f6154g;
        if (z13) {
            this.f6157j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                    if (i10 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f6150b.f6124o.E() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 == z12) {
                    }
                }
                z10 = false;
                if (!z10 && aVar.c != 0) {
                    i12 = aVar.f6161a + 1;
                } else {
                    i12 = aVar.f6161a;
                }
                this.f6156i = i12;
                if (this.f6155h != i12) {
                    c(i12);
                }
            }
            z10 = true;
            if (!z10) {
            }
            i12 = aVar.f6161a;
            this.f6156i = i12;
            if (this.f6155h != i12) {
            }
        } else if (this.f6152e == 0) {
            i12 = aVar.f6161a;
            if (i12 == -1) {
                i12 = 0;
            }
            c(i12);
        }
        int i13 = aVar.f6161a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f10 = aVar.f6162b;
        int i14 = aVar.c;
        ViewPager2.e eVar = this.f6149a;
        if (eVar != null) {
            eVar.b(f10, i13, i14);
        }
        int i15 = aVar.f6161a;
        int i16 = this.f6156i;
        if ((i15 == i16 || i16 == -1) && aVar.c == 0 && this.f6153f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i10) {
        ViewPager2.e eVar = this.f6149a;
        if (eVar != null) {
            eVar.c(i10);
        }
    }

    public final void d(int i10) {
        if ((this.f6152e == 3 && this.f6153f == 0) || this.f6153f == i10) {
            return;
        }
        this.f6153f = i10;
        ViewPager2.e eVar = this.f6149a;
        if (eVar != null) {
            eVar.a(i10);
        }
    }

    public final void e() {
        this.f6152e = 0;
        this.f6153f = 0;
        a aVar = this.f6154g;
        aVar.f6161a = -1;
        aVar.f6162b = 0.0f;
        aVar.c = 0;
        this.f6155h = -1;
        this.f6156i = -1;
        this.f6157j = false;
        this.f6158k = false;
        this.f6160m = false;
        this.f6159l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z10;
        int top;
        boolean z11;
        boolean z12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top2;
        int i10;
        int bottom;
        int i11;
        int A;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        LinearLayoutManager linearLayoutManager = this.f6151d;
        int T0 = linearLayoutManager.T0();
        a aVar = this.f6154g;
        aVar.f6161a = T0;
        float f10 = 0.0f;
        if (T0 == -1) {
            aVar.f6161a = -1;
            aVar.f6162b = 0.0f;
            aVar.c = 0;
            return;
        }
        View u10 = linearLayoutManager.u(T0);
        if (u10 == null) {
            aVar.f6161a = -1;
            aVar.f6162b = 0.0f;
            aVar.c = 0;
            return;
        }
        int F = RecyclerView.l.F(u10);
        int M = RecyclerView.l.M(u10);
        int O = RecyclerView.l.O(u10);
        int y10 = RecyclerView.l.y(u10);
        ViewGroup.LayoutParams layoutParams = u10.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            F += marginLayoutParams2.leftMargin;
            M += marginLayoutParams2.rightMargin;
            O += marginLayoutParams2.topMargin;
            y10 += marginLayoutParams2.bottomMargin;
        }
        int height = u10.getHeight() + O + y10;
        int width = u10.getWidth() + F + M;
        if (linearLayoutManager.f5580q == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        RecyclerView recyclerView = this.c;
        if (z10) {
            top = (u10.getLeft() - F) - recyclerView.getPaddingLeft();
            if (this.f6150b.f6124o.E() == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                top = -top;
            }
            height = width;
        } else {
            top = (u10.getTop() - O) - recyclerView.getPaddingTop();
        }
        int i13 = -top;
        aVar.c = i13;
        if (i13 < 0) {
            int A2 = linearLayoutManager.A();
            if (A2 != 0) {
                if (linearLayoutManager.f5580q == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, A2, 2);
                for (int i14 = 0; i14 < A2; i14++) {
                    View z16 = linearLayoutManager.z(i14);
                    if (z16 != null) {
                        ViewGroup.LayoutParams layoutParams2 = z16.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        } else {
                            marginLayoutParams = m4.b.f15978a;
                        }
                        int[] iArr2 = iArr[i14];
                        if (z11) {
                            top2 = z16.getLeft();
                            i10 = marginLayoutParams.leftMargin;
                        } else {
                            top2 = z16.getTop();
                            i10 = marginLayoutParams.topMargin;
                        }
                        iArr2[0] = top2 - i10;
                        int[] iArr3 = iArr[i14];
                        if (z11) {
                            bottom = z16.getRight();
                            i11 = marginLayoutParams.rightMargin;
                        } else {
                            bottom = z16.getBottom();
                            i11 = marginLayoutParams.bottomMargin;
                        }
                        iArr3[1] = bottom + i11;
                    } else {
                        throw new IllegalStateException("null view contained in the view hierarchy");
                    }
                }
                Arrays.sort(iArr, new m4.a());
                int i15 = 1;
                while (true) {
                    if (i15 < A2) {
                        if (iArr[i15 - 1][1] != iArr[i15][0]) {
                            break;
                        }
                        i15++;
                    } else {
                        int[] iArr4 = iArr[0];
                        int i16 = iArr4[1];
                        int i17 = iArr4[0];
                        int i18 = i16 - i17;
                        if (i17 <= 0) {
                            if (iArr[A2 - 1][1] < i18) {
                            }
                        }
                    }
                }
                z12 = false;
                if (z12 || linearLayoutManager.A() <= 1) {
                    A = linearLayoutManager.A();
                    i12 = 0;
                    while (true) {
                        if (i12 >= A) {
                            if (m4.b.a(linearLayoutManager.z(i12))) {
                                z13 = true;
                                break;
                            }
                            i12++;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (z13) {
                        z14 = true;
                        if (z14) {
                            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        }
                        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.c)));
                    }
                }
                z14 = false;
                if (z14) {
                }
            }
            z12 = true;
            if (z12) {
            }
            A = linearLayoutManager.A();
            i12 = 0;
            while (true) {
                if (i12 >= A) {
                }
                i12++;
            }
            if (z13) {
            }
            z14 = false;
            if (z14) {
            }
        } else {
            if (height != 0) {
                f10 = i13 / height;
            }
            aVar.f6162b = f10;
        }
    }
}
