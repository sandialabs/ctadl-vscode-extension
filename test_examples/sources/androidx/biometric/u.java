package androidx.biometric;

import android.os.Handler;
import android.widget.TextView;
import androidx.biometric.r;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.w<CharSequence> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f1249a;

    public u(r rVar) {
        this.f1249a = rVar;
    }

    @Override // androidx.lifecycle.w
    public final void b(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        r rVar = this.f1249a;
        Handler handler = rVar.f1239t0;
        r.a aVar = rVar.f1240u0;
        handler.removeCallbacks(aVar);
        TextView textView = rVar.f1245z0;
        if (textView != null) {
            textView.setText(charSequence2);
        }
        rVar.f1239t0.postDelayed(aVar, 2000L);
    }
}
