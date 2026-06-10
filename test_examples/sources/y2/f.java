package y2;

import ma.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18803a = new d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f18804b = new d(null, true);
    public static final d c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f18805d;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18806a = new a();

        @Override // y2.f.b
        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = f.f18803a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case i.f16049q /* 15 */:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements e {

        /* renamed from: a  reason: collision with root package name */
        public final b f18807a;

        public c(a aVar) {
            this.f18807a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
                b bVar = this.f18807a;
                if (bVar == null) {
                    return a();
                }
                int a10 = bVar.a(charSequence, i10);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    return a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18808b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f18808b = z10;
        }

        @Override // y2.f.c
        public final boolean a() {
            return this.f18808b;
        }
    }

    static {
        a aVar = a.f18806a;
        c = new d(aVar, false);
        f18805d = new d(aVar, true);
    }
}
