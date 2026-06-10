package b6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: m  reason: collision with root package name */
    public static final i f6432m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final m0.b f6433a;

    /* renamed from: b  reason: collision with root package name */
    public final m0.b f6434b;
    public final m0.b c;

    /* renamed from: d  reason: collision with root package name */
    public final m0.b f6435d;

    /* renamed from: e  reason: collision with root package name */
    public final c f6436e;

    /* renamed from: f  reason: collision with root package name */
    public final c f6437f;

    /* renamed from: g  reason: collision with root package name */
    public final c f6438g;

    /* renamed from: h  reason: collision with root package name */
    public final c f6439h;

    /* renamed from: i  reason: collision with root package name */
    public final e f6440i;

    /* renamed from: j  reason: collision with root package name */
    public final e f6441j;

    /* renamed from: k  reason: collision with root package name */
    public final e f6442k;

    /* renamed from: l  reason: collision with root package name */
    public final e f6443l;

    public k() {
        this.f6433a = new j();
        this.f6434b = new j();
        this.c = new j();
        this.f6435d = new j();
        this.f6436e = new b6.a(0.0f);
        this.f6437f = new b6.a(0.0f);
        this.f6438g = new b6.a(0.0f);
        this.f6439h = new b6.a(0.0f);
        this.f6440i = new e();
        this.f6441j = new e();
        this.f6442k = new e();
        this.f6443l = new e();
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a1.b.f49r0);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c = c(obtainStyledAttributes, 5, cVar);
            c c10 = c(obtainStyledAttributes, 8, c);
            c c11 = c(obtainStyledAttributes, 9, c);
            c c12 = c(obtainStyledAttributes, 7, c);
            c c13 = c(obtainStyledAttributes, 6, c);
            a aVar = new a();
            m0.b v3 = ma.i.v(i13);
            aVar.f6444a = v3;
            float b5 = a.b(v3);
            if (b5 != -1.0f) {
                aVar.f6447e = new b6.a(b5);
            }
            aVar.f6447e = c10;
            m0.b v10 = ma.i.v(i14);
            aVar.f6445b = v10;
            float b10 = a.b(v10);
            if (b10 != -1.0f) {
                aVar.f6448f = new b6.a(b10);
            }
            aVar.f6448f = c11;
            m0.b v11 = ma.i.v(i15);
            aVar.c = v11;
            float b11 = a.b(v11);
            if (b11 != -1.0f) {
                aVar.f6449g = new b6.a(b11);
            }
            aVar.f6449g = c12;
            m0.b v12 = ma.i.v(i16);
            aVar.f6446d = v12;
            float b12 = a.b(v12);
            if (b12 != -1.0f) {
                aVar.f6450h = new b6.a(b12);
            }
            aVar.f6450h = c13;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        b6.a aVar = new b6.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.f36k0, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new b6.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10 = this.f6443l.getClass().equals(e.class) && this.f6441j.getClass().equals(e.class) && this.f6440i.getClass().equals(e.class) && this.f6442k.getClass().equals(e.class);
        float a10 = this.f6436e.a(rectF);
        return z10 && ((this.f6437f.a(rectF) > a10 ? 1 : (this.f6437f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f6439h.a(rectF) > a10 ? 1 : (this.f6439h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f6438g.a(rectF) > a10 ? 1 : (this.f6438g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f6434b instanceof j) && (this.f6433a instanceof j) && (this.c instanceof j) && (this.f6435d instanceof j));
    }

    public final k e(float f10) {
        a aVar = new a(this);
        aVar.c(f10);
        return new k(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public m0.b f6444a;

        /* renamed from: b  reason: collision with root package name */
        public m0.b f6445b;
        public m0.b c;

        /* renamed from: d  reason: collision with root package name */
        public m0.b f6446d;

        /* renamed from: e  reason: collision with root package name */
        public c f6447e;

        /* renamed from: f  reason: collision with root package name */
        public c f6448f;

        /* renamed from: g  reason: collision with root package name */
        public c f6449g;

        /* renamed from: h  reason: collision with root package name */
        public c f6450h;

        /* renamed from: i  reason: collision with root package name */
        public e f6451i;

        /* renamed from: j  reason: collision with root package name */
        public final e f6452j;

        /* renamed from: k  reason: collision with root package name */
        public e f6453k;

        /* renamed from: l  reason: collision with root package name */
        public final e f6454l;

        public a() {
            this.f6444a = new j();
            this.f6445b = new j();
            this.c = new j();
            this.f6446d = new j();
            this.f6447e = new b6.a(0.0f);
            this.f6448f = new b6.a(0.0f);
            this.f6449g = new b6.a(0.0f);
            this.f6450h = new b6.a(0.0f);
            this.f6451i = new e();
            this.f6452j = new e();
            this.f6453k = new e();
            this.f6454l = new e();
        }

        public static float b(m0.b bVar) {
            if (bVar instanceof j) {
                return ((j) bVar).f6431m;
            }
            if (bVar instanceof d) {
                return ((d) bVar).f6389m;
            }
            return -1.0f;
        }

        public final k a() {
            return new k(this);
        }

        public final void c(float f10) {
            this.f6447e = new b6.a(f10);
            this.f6448f = new b6.a(f10);
            this.f6449g = new b6.a(f10);
            this.f6450h = new b6.a(f10);
        }

        public a(k kVar) {
            this.f6444a = new j();
            this.f6445b = new j();
            this.c = new j();
            this.f6446d = new j();
            this.f6447e = new b6.a(0.0f);
            this.f6448f = new b6.a(0.0f);
            this.f6449g = new b6.a(0.0f);
            this.f6450h = new b6.a(0.0f);
            this.f6451i = new e();
            this.f6452j = new e();
            this.f6453k = new e();
            this.f6454l = new e();
            this.f6444a = kVar.f6433a;
            this.f6445b = kVar.f6434b;
            this.c = kVar.c;
            this.f6446d = kVar.f6435d;
            this.f6447e = kVar.f6436e;
            this.f6448f = kVar.f6437f;
            this.f6449g = kVar.f6438g;
            this.f6450h = kVar.f6439h;
            this.f6451i = kVar.f6440i;
            this.f6452j = kVar.f6441j;
            this.f6453k = kVar.f6442k;
            this.f6454l = kVar.f6443l;
        }
    }

    public k(a aVar) {
        this.f6433a = aVar.f6444a;
        this.f6434b = aVar.f6445b;
        this.c = aVar.c;
        this.f6435d = aVar.f6446d;
        this.f6436e = aVar.f6447e;
        this.f6437f = aVar.f6448f;
        this.f6438g = aVar.f6449g;
        this.f6439h = aVar.f6450h;
        this.f6440i = aVar.f6451i;
        this.f6441j = aVar.f6452j;
        this.f6442k = aVar.f6453k;
        this.f6443l = aVar.f6454l;
    }
}
