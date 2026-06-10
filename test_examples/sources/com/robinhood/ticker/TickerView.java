package com.robinhood.ticker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.activity.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import u4.o;

/* loaded from: classes.dex */
public class TickerView extends View {
    public static final AccelerateDecelerateInterpolator B = new AccelerateDecelerateInterpolator();
    public String A;

    /* renamed from: i  reason: collision with root package name */
    public final TextPaint f10146i;

    /* renamed from: j  reason: collision with root package name */
    public final c f10147j;

    /* renamed from: k  reason: collision with root package name */
    public final o f10148k;

    /* renamed from: l  reason: collision with root package name */
    public final ValueAnimator f10149l;

    /* renamed from: m  reason: collision with root package name */
    public a f10150m;
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f10151o;

    /* renamed from: p  reason: collision with root package name */
    public String f10152p;

    /* renamed from: q  reason: collision with root package name */
    public int f10153q;

    /* renamed from: r  reason: collision with root package name */
    public int f10154r;

    /* renamed from: s  reason: collision with root package name */
    public int f10155s;

    /* renamed from: t  reason: collision with root package name */
    public int f10156t;

    /* renamed from: u  reason: collision with root package name */
    public float f10157u;

    /* renamed from: v  reason: collision with root package name */
    public int f10158v;

    /* renamed from: w  reason: collision with root package name */
    public long f10159w;

    /* renamed from: x  reason: collision with root package name */
    public long f10160x;

    /* renamed from: y  reason: collision with root package name */
    public Interpolator f10161y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10162z;

    /* loaded from: classes.dex */
    public enum ScrollingDirection {
        ANY,
        UP,
        DOWN
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f10167a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10168b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final Interpolator f10169d;

        public a(String str, long j2, long j10, Interpolator interpolator) {
            this.f10167a = str;
            this.f10168b = j2;
            this.c = j10;
            this.f10169d = interpolator;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        public int f10171b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public float f10172d;

        /* renamed from: e  reason: collision with root package name */
        public float f10173e;

        /* renamed from: f  reason: collision with root package name */
        public String f10174f;

        /* renamed from: h  reason: collision with root package name */
        public float f10176h;

        /* renamed from: i  reason: collision with root package name */
        public int f10177i;

        /* renamed from: g  reason: collision with root package name */
        public int f10175g = -16777216;

        /* renamed from: a  reason: collision with root package name */
        public int f10170a = 8388611;

        public b(Resources resources) {
            this.f10176h = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
        }

        public final void a(TypedArray typedArray) {
            this.f10170a = typedArray.getInt(4, this.f10170a);
            this.f10171b = typedArray.getColor(6, this.f10171b);
            this.c = typedArray.getFloat(7, this.c);
            this.f10172d = typedArray.getFloat(8, this.f10172d);
            this.f10173e = typedArray.getFloat(9, this.f10173e);
            this.f10174f = typedArray.getString(5);
            this.f10175g = typedArray.getColor(3, this.f10175g);
            this.f10176h = typedArray.getDimension(1, this.f10176h);
            this.f10177i = typedArray.getInt(2, this.f10177i);
        }
    }

    public TickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ScrollingDirection scrollingDirection;
        boolean z10 = true;
        TextPaint textPaint = new TextPaint(1);
        this.f10146i = textPaint;
        c cVar = new c(textPaint);
        this.f10147j = cVar;
        o oVar = new o(cVar);
        this.f10148k = oVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        this.f10149l = ofFloat;
        this.f10151o = new Rect();
        b bVar = new b(context.getResources());
        int[] iArr = a1.b.G0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            bVar.a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        bVar.a(obtainStyledAttributes);
        this.f10161y = B;
        this.f10160x = obtainStyledAttributes.getInt(11, 350);
        this.f10162z = obtainStyledAttributes.getBoolean(10, false);
        this.f10155s = bVar.f10170a;
        int i10 = bVar.f10171b;
        if (i10 != 0) {
            textPaint.setShadowLayer(bVar.f10173e, bVar.c, bVar.f10172d, i10);
        }
        int i11 = bVar.f10177i;
        if (i11 != 0) {
            this.f10158v = i11;
            setTypeface(textPaint.getTypeface());
        }
        setTextColor(bVar.f10175g);
        setTextSize(bVar.f10176h);
        int i12 = obtainStyledAttributes.getInt(12, 0);
        if (i12 != 1) {
            if (i12 != 2) {
                if (isInEditMode()) {
                    setCharacterLists("0123456789");
                }
            } else {
                setCharacterLists("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
            }
        } else {
            setCharacterLists("0123456789");
        }
        int i13 = obtainStyledAttributes.getInt(13, 0);
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    scrollingDirection = ScrollingDirection.DOWN;
                } else {
                    throw new IllegalArgumentException(e.g("Unsupported ticker_defaultPreferredScrollingDirection: ", i13));
                }
            } else {
                scrollingDirection = ScrollingDirection.UP;
            }
        } else {
            scrollingDirection = ScrollingDirection.ANY;
        }
        cVar.f10200e = scrollingDirection;
        if (((com.robinhood.ticker.a[]) oVar.c) == null) {
            z10 = false;
        }
        String str = bVar.f10174f;
        if (z10) {
            c(str, false);
        } else {
            this.A = str;
        }
        obtainStyledAttributes.recycle();
        ofFloat.addUpdateListener(new i7.a(this));
        ofFloat.addListener(new i7.c(this, new i7.b(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x022f, code lost:
        r1.add(1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setTextInternal(String str) {
        char[] charArray;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        char[] cArr;
        o oVar;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        this.f10152p = str;
        if (str == null) {
            charArray = new char[0];
        } else {
            charArray = str.toCharArray();
        }
        o oVar2 = this.f10148k;
        if (((com.robinhood.ticker.a[]) oVar2.c) != null) {
            int i13 = 0;
            while (true) {
                arrayList = (ArrayList) oVar2.f17798a;
                if (i13 >= arrayList.size()) {
                    break;
                }
                com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) arrayList.get(i13);
                bVar.a();
                if (bVar.f10192l > 0.0f) {
                    i13++;
                } else {
                    arrayList.remove(i13);
                }
            }
            int size = arrayList.size();
            char[] cArr2 = new char[size];
            for (int i14 = 0; i14 < size; i14++) {
                cArr2[i14] = ((com.robinhood.ticker.b) arrayList.get(i14)).c;
            }
            Set set = (Set) oVar2.f17800d;
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i15 == size) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 == charArray.length) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    break;
                } else if (z10) {
                    int length = charArray.length - i16;
                    for (int i17 = 0; i17 < length; i17++) {
                        arrayList3.add(1);
                    }
                } else if (z11) {
                    int i18 = size - i15;
                    for (int i19 = 0; i19 < i18; i19++) {
                        arrayList3.add(2);
                    }
                } else {
                    boolean contains = set.contains(Character.valueOf(cArr2[i15]));
                    boolean contains2 = set.contains(Character.valueOf(charArray[i16]));
                    if (contains && contains2) {
                        int i20 = i15 + 1;
                        while (true) {
                            if (i20 < size) {
                                if (!set.contains(Character.valueOf(cArr2[i20]))) {
                                    i11 = i20;
                                    break;
                                }
                                i20++;
                            } else {
                                i11 = size;
                                break;
                            }
                        }
                        int i21 = i16 + 1;
                        while (true) {
                            if (i21 < charArray.length) {
                                if (!set.contains(Character.valueOf(charArray[i21]))) {
                                    break;
                                }
                                i21++;
                            } else {
                                i21 = charArray.length;
                                break;
                            }
                        }
                        int i22 = i21;
                        int i23 = i11 - i15;
                        int i24 = i22 - i16;
                        int max = Math.max(i23, i24);
                        if (i23 == i24) {
                            for (int i25 = 0; i25 < max; i25++) {
                                arrayList3.add(0);
                            }
                            cArr = charArray;
                            oVar = oVar2;
                            i10 = size;
                            arrayList2 = arrayList;
                        } else {
                            int i26 = i23 + 1;
                            int i27 = i24 + 1;
                            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i26, i27);
                            for (int i28 = 0; i28 < i26; i28++) {
                                iArr[i28][0] = i28;
                            }
                            for (int i29 = 0; i29 < i27; i29++) {
                                iArr[0][i29] = i29;
                            }
                            for (int i30 = 1; i30 < i26; i30++) {
                                int i31 = 1;
                                while (i31 < i27) {
                                    int i32 = i30 - 1;
                                    o oVar3 = oVar2;
                                    int i33 = i31 - 1;
                                    int i34 = size;
                                    if (cArr2[i32 + i15] == charArray[i33 + i16]) {
                                        i12 = 0;
                                    } else {
                                        i12 = 1;
                                    }
                                    int[] iArr2 = iArr[i30];
                                    int[] iArr3 = iArr[i32];
                                    iArr2[i31] = Math.min(iArr3[i31] + 1, Math.min(iArr2[i33] + 1, iArr3[i33] + i12));
                                    i31++;
                                    oVar2 = oVar3;
                                    size = i34;
                                    charArray = charArray;
                                    arrayList = arrayList;
                                }
                                char[] cArr3 = charArray;
                                o oVar4 = oVar2;
                                int i35 = size;
                                ArrayList arrayList4 = arrayList;
                            }
                            cArr = charArray;
                            oVar = oVar2;
                            i10 = size;
                            arrayList2 = arrayList;
                            ArrayList arrayList5 = new ArrayList(max * 2);
                            int i36 = i26 - 1;
                            while (true) {
                                i27--;
                                while (true) {
                                    if (i36 <= 0 && i27 <= 0) {
                                        break;
                                    }
                                    if (i27 != 0) {
                                        int i37 = i27 - 1;
                                        int i38 = iArr[i36][i37];
                                        int i39 = i36 - 1;
                                        int[] iArr4 = iArr[i39];
                                        int i40 = iArr4[i27];
                                        int i41 = iArr4[i37];
                                        if (i38 < i40 && i38 < i41) {
                                            break;
                                        } else if (i40 >= i41) {
                                            arrayList5.add(0);
                                            i36 = i39;
                                            break;
                                        }
                                    }
                                    arrayList5.add(2);
                                    i36--;
                                }
                            }
                            for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                                arrayList3.add(arrayList5.get(size2));
                            }
                        }
                        i15 = i11;
                        i16 = i22;
                    } else {
                        cArr = charArray;
                        oVar = oVar2;
                        i10 = size;
                        arrayList2 = arrayList;
                        if (contains) {
                            arrayList3.add(1);
                        } else if (contains2) {
                            arrayList3.add(2);
                            i15++;
                        } else {
                            arrayList3.add(0);
                            i15++;
                        }
                        i16++;
                    }
                    oVar2 = oVar;
                    size = i10;
                    charArray = cArr;
                    arrayList = arrayList2;
                }
            }
            int size3 = arrayList3.size();
            int[] iArr5 = new int[size3];
            for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                iArr5[i42] = ((Integer) arrayList3.get(i42)).intValue();
            }
            int i43 = 0;
            int i44 = 0;
            for (int i45 = 0; i45 < size3; i45++) {
                int i46 = iArr5[i45];
                if (i46 != 0) {
                    if (i46 != 1) {
                        if (i46 == 2) {
                            ((com.robinhood.ticker.b) arrayList.get(i43)).c((char) 0);
                            i43++;
                        } else {
                            throw new IllegalArgumentException("Unknown action: " + iArr5[i45]);
                        }
                    } else {
                        arrayList.add(i43, new com.robinhood.ticker.b((com.robinhood.ticker.a[]) oVar2.c, (c) oVar2.f17799b));
                    }
                }
                ((com.robinhood.ticker.b) arrayList.get(i43)).c(charArray[i44]);
                i43++;
                i44++;
            }
            setContentDescription(str);
            return;
        }
        throw new IllegalStateException("Need to call #setCharacterLists first.");
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        if (this.f10153q != b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f10154r != getPaddingBottom() + getPaddingTop() + ((int) this.f10147j.c)) {
            z11 = true;
        }
        if (z10 || z11) {
            requestLayout();
        }
    }

    public final int b() {
        float f10;
        boolean z10 = this.f10162z;
        o oVar = this.f10148k;
        if (z10) {
            f10 = oVar.a();
        } else {
            ArrayList arrayList = (ArrayList) oVar.f17798a;
            int size = arrayList.size();
            float f11 = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) arrayList.get(i10);
                bVar.a();
                f11 += bVar.n;
            }
            f10 = f11;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) f10);
    }

    public final void c(String str, boolean z10) {
        if (TextUtils.equals(str, this.f10152p)) {
            return;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f10149l;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
                this.n = null;
                this.f10150m = null;
            }
        }
        if (z10) {
            this.n = new a(str, this.f10159w, this.f10160x, this.f10161y);
            if (this.f10150m == null) {
                d();
                return;
            }
            return;
        }
        setTextInternal(str);
        o oVar = this.f10148k;
        oVar.c(1.0f);
        oVar.b();
        a();
        invalidate();
    }

    public final void d() {
        a aVar = this.n;
        this.f10150m = aVar;
        this.n = null;
        if (aVar == null) {
            return;
        }
        setTextInternal(aVar.f10167a);
        long j2 = aVar.f10168b;
        ValueAnimator valueAnimator = this.f10149l;
        valueAnimator.setStartDelay(j2);
        valueAnimator.setDuration(aVar.c);
        valueAnimator.setInterpolator(aVar.f10169d);
        valueAnimator.start();
    }

    public boolean getAnimateMeasurementChange() {
        return this.f10162z;
    }

    public long getAnimationDelay() {
        return this.f10159w;
    }

    public long getAnimationDuration() {
        return this.f10160x;
    }

    public Interpolator getAnimationInterpolator() {
        return this.f10161y;
    }

    public int getGravity() {
        return this.f10155s;
    }

    public String getText() {
        return this.f10152p;
    }

    public int getTextColor() {
        return this.f10156t;
    }

    public float getTextSize() {
        return this.f10157u;
    }

    public Typeface getTypeface() {
        return this.f10146i.getTypeface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        canvas.save();
        o oVar = this.f10148k;
        float a10 = oVar.a();
        c cVar = this.f10147j;
        float f12 = cVar.c;
        int i10 = this.f10155s;
        Rect rect = this.f10151o;
        int width = rect.width();
        int height = rect.height();
        if ((i10 & 16) == 16) {
            f10 = ((height - f12) / 2.0f) + rect.top;
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 1) == 1) {
            f11 = ((width - a10) / 2.0f) + rect.left;
        } else {
            f11 = 0.0f;
        }
        if ((i10 & 48) == 48) {
            f10 = 0.0f;
        }
        if ((i10 & 80) == 80) {
            f10 = (height - f12) + rect.top;
        }
        if ((i10 & 8388611) == 8388611) {
            f11 = 0.0f;
        }
        if ((i10 & 8388613) == 8388613) {
            f11 = (width - a10) + rect.left;
        }
        canvas.translate(f11, f10);
        canvas.clipRect(0.0f, 0.0f, a10, f12);
        canvas.translate(0.0f, cVar.f10199d);
        TextPaint textPaint = this.f10146i;
        ArrayList arrayList = (ArrayList) oVar.f17798a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.robinhood.ticker.b bVar = (com.robinhood.ticker.b) arrayList.get(i11);
            if (com.robinhood.ticker.b.b(canvas, textPaint, bVar.f10185e, bVar.f10188h, bVar.f10189i)) {
                int i12 = bVar.f10188h;
                if (i12 >= 0) {
                    bVar.c = bVar.f10185e[i12];
                }
                bVar.f10194o = bVar.f10189i;
            }
            com.robinhood.ticker.b.b(canvas, textPaint, bVar.f10185e, bVar.f10188h + 1, bVar.f10189i - bVar.f10190j);
            com.robinhood.ticker.b.b(canvas, textPaint, bVar.f10185e, bVar.f10188h - 1, bVar.f10189i + bVar.f10190j);
            bVar.a();
            canvas.translate(bVar.f10192l, 0.0f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f10153q = b();
        this.f10154r = getPaddingBottom() + getPaddingTop() + ((int) this.f10147j.c);
        setMeasuredDimension(View.resolveSize(this.f10153q, i10), View.resolveSize(this.f10154r, i11));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f10151o.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
    }

    public void setAnimateMeasurementChange(boolean z10) {
        this.f10162z = z10;
    }

    public void setAnimationDelay(long j2) {
        this.f10159w = j2;
    }

    public void setAnimationDuration(long j2) {
        this.f10160x = j2;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.f10161y = interpolator;
    }

    public void setCharacterLists(String... strArr) {
        o oVar = this.f10148k;
        oVar.getClass();
        oVar.c = new com.robinhood.ticker.a[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            ((com.robinhood.ticker.a[]) oVar.c)[i10] = new com.robinhood.ticker.a(strArr[i10]);
        }
        oVar.f17800d = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            ((Set) oVar.f17800d).addAll(((com.robinhood.ticker.a[]) oVar.c)[i11].c.keySet());
        }
        Iterator it = ((ArrayList) oVar.f17798a).iterator();
        while (it.hasNext()) {
            ((com.robinhood.ticker.b) it.next()).f10182a = (com.robinhood.ticker.a[]) oVar.c;
        }
        String str = this.A;
        if (str != null) {
            c(str, false);
            this.A = null;
        }
    }

    public void setGravity(int i10) {
        if (this.f10155s != i10) {
            this.f10155s = i10;
            invalidate();
        }
    }

    public void setPaintFlags(int i10) {
        this.f10146i.setFlags(i10);
        c cVar = this.f10147j;
        cVar.f10198b.clear();
        Paint.FontMetrics fontMetrics = cVar.f10197a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        cVar.c = f10 - f11;
        cVar.f10199d = -f11;
        a();
        invalidate();
    }

    public void setPreferredScrollingDirection(ScrollingDirection scrollingDirection) {
        this.f10147j.f10200e = scrollingDirection;
    }

    public void setText(String str) {
        c(str, !TextUtils.isEmpty(this.f10152p));
    }

    public void setTextColor(int i10) {
        if (this.f10156t != i10) {
            this.f10156t = i10;
            this.f10146i.setColor(i10);
            invalidate();
        }
    }

    public void setTextSize(float f10) {
        if (this.f10157u != f10) {
            this.f10157u = f10;
            this.f10146i.setTextSize(f10);
            c cVar = this.f10147j;
            cVar.f10198b.clear();
            Paint.FontMetrics fontMetrics = cVar.f10197a.getFontMetrics();
            float f11 = fontMetrics.bottom;
            float f12 = fontMetrics.top;
            cVar.c = f11 - f12;
            cVar.f10199d = -f12;
            a();
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000b, code lost:
        if (r0 == 2) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTypeface(Typeface typeface) {
        int i10 = this.f10158v;
        int i11 = 3;
        if (i10 != 3) {
            i11 = 1;
            if (i10 != 1) {
                i11 = 2;
            }
        }
        typeface = Typeface.create(typeface, i11);
        this.f10146i.setTypeface(typeface);
        c cVar = this.f10147j;
        cVar.f10198b.clear();
        Paint.FontMetrics fontMetrics = cVar.f10197a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        cVar.c = f10 - f11;
        cVar.f10199d = -f11;
        a();
        invalidate();
    }
}
