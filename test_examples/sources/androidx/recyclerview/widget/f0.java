package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f5848a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5849b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5850a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f5851b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5852d;

        /* renamed from: e  reason: collision with root package name */
        public int f5853e;

        public final boolean a() {
            int i10 = this.f5850a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.f5852d;
                int i13 = this.f5851b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 0) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 112) != 0) {
                int i14 = this.f5852d;
                int i15 = this.c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f5853e;
                int i17 = this.f5851b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f5853e;
                int i19 = this.c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b(View view);

        View c(int i10);

        int d();

        int e(View view);
    }

    public f0(b bVar) {
        this.f5848a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        b bVar = this.f5848a;
        int d5 = bVar.d();
        int a10 = bVar.a();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View c = bVar.c(i10);
            int b5 = bVar.b(c);
            int e10 = bVar.e(c);
            a aVar = this.f5849b;
            aVar.f5851b = d5;
            aVar.c = a10;
            aVar.f5852d = b5;
            aVar.f5853e = e10;
            if (i12 != 0) {
                aVar.f5850a = i12 | 0;
                if (aVar.a()) {
                    return c;
                }
            }
            if (i13 != 0) {
                aVar.f5850a = i13 | 0;
                if (aVar.a()) {
                    view = c;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f5848a;
        int d5 = bVar.d();
        int a10 = bVar.a();
        int b5 = bVar.b(view);
        int e10 = bVar.e(view);
        a aVar = this.f5849b;
        aVar.f5851b = d5;
        aVar.c = a10;
        aVar.f5852d = b5;
        aVar.f5853e = e10;
        aVar.f5850a = 24579 | 0;
        return aVar.a();
    }
}
