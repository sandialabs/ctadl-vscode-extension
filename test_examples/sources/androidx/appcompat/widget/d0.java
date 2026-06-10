package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f899i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Typeface f900j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f901k;

    public d0(TextView textView, Typeface typeface, int i10) {
        this.f899i = textView;
        this.f900j = typeface;
        this.f901k = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f899i.setTypeface(this.f900j, this.f901k);
    }
}
