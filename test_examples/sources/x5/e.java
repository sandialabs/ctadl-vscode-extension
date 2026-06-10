package x5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f18648i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextPaint f18649j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ k f18650k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ d f18651l;

    public e(d dVar, Context context, TextPaint textPaint, k kVar) {
        this.f18651l = dVar;
        this.f18648i = context;
        this.f18649j = textPaint;
        this.f18650k = kVar;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void D0(int i10) {
        this.f18650k.D0(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void E0(Typeface typeface, boolean z10) {
        this.f18651l.g(this.f18648i, this.f18649j, typeface);
        this.f18650k.E0(typeface, z10);
    }
}
