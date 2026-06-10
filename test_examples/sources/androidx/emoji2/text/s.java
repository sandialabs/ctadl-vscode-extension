package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* loaded from: classes.dex */
public final class s implements Spannable {

    /* renamed from: i  reason: collision with root package name */
    public boolean f5032i = false;

    /* renamed from: j  reason: collision with root package name */
    public Spannable f5033j;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof y2.d;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.s.a
        public final boolean a(Spannable spannable) {
            if (!(spannable instanceof PrecomputedText) && !(spannable instanceof y2.d)) {
                return false;
            }
            return true;
        }
    }

    public s(Spannable spannable) {
        this.f5033j = spannable;
    }

    public s(CharSequence charSequence) {
        this.f5033j = new SpannableString(charSequence);
    }

    public final void a() {
        a bVar;
        Spannable spannable = this.f5033j;
        if (!this.f5032i) {
            if (Build.VERSION.SDK_INT < 28) {
                bVar = new a();
            } else {
                bVar = new b();
            }
            if (bVar.a(spannable)) {
                this.f5033j = new SpannableString(spannable);
            }
        }
        this.f5032i = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f5033j.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return q.a(this.f5033j);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return r.a(this.f5033j);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5033j.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5033j.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5033j.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f5033j.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5033j.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f5033j.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5033j.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f5033j.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f5033j.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5033j.toString();
    }
}
