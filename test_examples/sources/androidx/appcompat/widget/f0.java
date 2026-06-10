package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f922l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f923m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f924a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f925b = false;
    public float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f926d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f927e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f928f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f929g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f930h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f931i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f932j;

    /* renamed from: k  reason: collision with root package name */
    public final f f933k;

    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder alignment2;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder includePad;
            int breakStrategy;
            StaticLayout.Builder breakStrategy2;
            int hyphenationFrequency;
            StaticLayout.Builder hyphenationFrequency2;
            StaticLayout build;
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
            includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
            breakStrategy = textView.getBreakStrategy();
            breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency2.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            build = obtain.build();
            return build;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.f0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) f0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.f0.d, androidx.appcompat.widget.f0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.f0.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) f0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public f0(TextView textView) {
        this.f931i = textView;
        this.f932j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f933k = i10 >= 29 ? new e() : i10 >= 23 ? new d() : new f();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f923m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t10) {
        try {
            try {
                t10 = (T) d(str).invoke(obj, new Object[0]);
            } catch (Exception e10) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            }
            return t10;
        } finally {
        }
    }

    public final void a() {
        boolean z10;
        int measuredWidth;
        if (i() && this.f924a != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f925b) {
            if (this.f931i.getMeasuredHeight() > 0 && this.f931i.getMeasuredWidth() > 0) {
                if (this.f933k.b(this.f931i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f931i.getMeasuredWidth() - this.f931i.getTotalPaddingLeft()) - this.f931i.getTotalPaddingRight();
                }
                int height = (this.f931i.getHeight() - this.f931i.getCompoundPaddingBottom()) - this.f931i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f922l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c10 = c(rectF);
                        if (c10 != this.f931i.getTextSize()) {
                            f(0, c10);
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f925b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(RectF rectF) {
        int i10;
        StaticLayout a10;
        boolean z10;
        CharSequence transformation;
        int length = this.f928f.length;
        if (length != 0) {
            int i11 = length - 1;
            int i12 = 1;
            int i13 = 0;
            while (i12 <= i11) {
                int i14 = (i12 + i11) / 2;
                int i15 = this.f928f[i14];
                TextView textView = this.f931i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int i16 = Build.VERSION.SDK_INT;
                int b5 = a.b(textView);
                TextPaint textPaint = this.f930h;
                if (textPaint == null) {
                    this.f930h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f930h.set(textView.getPaint());
                this.f930h.setTextSize(i15);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i16 >= 23) {
                    i10 = b5;
                    a10 = c.a(text, alignment, round, b5, this.f931i, this.f930h, this.f933k);
                } else {
                    i10 = b5;
                    a10 = a.a(text, alignment, round, textView, this.f930h);
                }
                if ((i10 == -1 || (a10.getLineCount() <= i10 && a10.getLineEnd(a10.getLineCount() - 1) == text.length())) && a10.getHeight() <= rectF.bottom) {
                    z10 = true;
                    if (!z10) {
                        int i17 = i14 + 1;
                        i13 = i12;
                        i12 = i17;
                    } else {
                        i13 = i14 - 1;
                        i11 = i13;
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            return this.f928f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Resources resources;
        Context context = this.f932j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f931i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f925b = false;
                try {
                    Method d5 = d("nullLayouts");
                    if (d5 != null) {
                        d5.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f924a == 1) {
            if (!this.f929g || this.f928f.length == 0) {
                int floor = ((int) Math.floor((this.f927e - this.f926d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.c) + this.f926d);
                }
                this.f928f = b(iArr);
            }
            this.f925b = true;
        } else {
            this.f925b = false;
        }
        return this.f925b;
    }

    public final boolean h() {
        int[] iArr = this.f928f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f929g = z10;
        if (z10) {
            this.f924a = 1;
            this.f926d = iArr[0];
            this.f927e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f931i instanceof l);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f924a = 1;
            this.f926d = f10;
            this.f927e = f11;
            this.c = f12;
            this.f929g = false;
        }
    }
}
