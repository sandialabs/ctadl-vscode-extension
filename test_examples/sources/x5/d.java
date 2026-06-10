package x5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.datastore.preferences.protobuf.k;
import p2.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f18634a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18635b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18636d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18637e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18638f;

    /* renamed from: g  reason: collision with root package name */
    public final float f18639g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f18640h;

    /* renamed from: i  reason: collision with root package name */
    public final float f18641i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f18642j;

    /* renamed from: k  reason: collision with root package name */
    public float f18643k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18644l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18645m = false;
    public Typeface n;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f18646a;

        public a(k kVar) {
            this.f18646a = kVar;
        }

        @Override // p2.f.e
        public final void c(int i10) {
            d.this.f18645m = true;
            this.f18646a.D0(i10);
        }

        @Override // p2.f.e
        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.n = Typeface.create(typeface, dVar.c);
            dVar.f18645m = true;
            this.f18646a.E0(dVar.n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a1.b.f61x0);
        this.f18643k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f18642j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.f18636d = obtainStyledAttributes.getInt(1, 1);
        int i11 = 12;
        if (!obtainStyledAttributes.hasValue(12)) {
            i11 = 10;
        }
        this.f18644l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f18635b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f18634a = c.a(context, obtainStyledAttributes, 6);
        this.f18637e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f18638f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f18639g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, a1.b.f40m0);
        this.f18640h = obtainStyledAttributes2.hasValue(0);
        this.f18641i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i10 = this.c;
        if (typeface == null && (str = this.f18635b) != null) {
            this.n = Typeface.create(str, i10);
        }
        if (this.n == null) {
            int i11 = this.f18636d;
            this.n = i11 != 1 ? i11 != 2 ? i11 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.n = Typeface.create(this.n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f18645m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b5 = p2.f.b(context, this.f18644l);
                this.n = b5;
                if (b5 != null) {
                    this.n = Typeface.create(b5, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f18635b, e10);
            }
        }
        a();
        this.f18645m = true;
        return this.n;
    }

    public final void c(Context context, k kVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f18644l;
        if (i10 == 0) {
            this.f18645m = true;
        }
        if (this.f18645m) {
            kVar.E0(this.n, true);
            return;
        }
        try {
            a aVar = new a(kVar);
            ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                p2.f.c(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f18645m = true;
            kVar.D0(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f18635b, e10);
            this.f18645m = true;
            kVar.D0(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Context context) {
        Typeface typeface;
        int i10 = this.f18644l;
        if (i10 != 0) {
            ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
            if (!context.isRestricted()) {
                typeface = p2.f.c(context, i10, new TypedValue(), 0, null, false, true);
                if (typeface == null) {
                    return true;
                }
                return false;
            }
        }
        typeface = null;
        if (typeface == null) {
        }
    }

    public final void e(Context context, TextPaint textPaint, k kVar) {
        f(context, textPaint, kVar);
        ColorStateList colorStateList = this.f18642j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f18634a;
        textPaint.setShadowLayer(this.f18639g, this.f18637e, this.f18638f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, k kVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new e(this, context, textPaint, kVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f10;
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.c;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f18643k);
        if (this.f18640h) {
            textPaint.setLetterSpacing(this.f18641i);
        }
    }
}
