package b3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: i  reason: collision with root package name */
    public final int f6352i;

    /* renamed from: j  reason: collision with root package name */
    public final g f6353j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6354k;

    public a(int i10, g gVar, int i11) {
        this.f6352i = i10;
        this.f6353j = gVar;
        this.f6354k = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6352i);
        this.f6353j.f6357a.performAction(this.f6354k, bundle);
    }
}
