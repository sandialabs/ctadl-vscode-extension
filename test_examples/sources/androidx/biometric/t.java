package androidx.biometric;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import androidx.biometric.r;
import com.noto.R;
import n2.a;

/* loaded from: classes.dex */
public final class t implements androidx.lifecycle.w<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f1248a;

    public t(r rVar) {
        this.f1248a = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r1 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r1 != 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    @Override // androidx.lifecycle.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Integer num) {
        int i10;
        Drawable b5;
        boolean z10;
        int i11;
        Integer num2 = num;
        r rVar = this.f1248a;
        Handler handler = rVar.f1239t0;
        r.a aVar = rVar.f1240u0;
        handler.removeCallbacks(aVar);
        int intValue = num2.intValue();
        boolean z11 = false;
        if (rVar.f1244y0 != null && Build.VERSION.SDK_INT >= 23) {
            int i12 = rVar.f1241v0.f1233z;
            Context j2 = rVar.j();
            if (j2 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                if (i12 != 0 || intValue != 1) {
                    if (i12 == 1 && intValue == 2) {
                        i10 = R.drawable.fingerprint_dialog_error;
                        Object obj = n2.a.f16069a;
                        b5 = a.b.b(j2, i10);
                        if (b5 != null) {
                            rVar.f1244y0.setImageDrawable(b5);
                            if (i12 == 0) {
                                if (intValue == 1) {
                                    z10 = false;
                                    if (z10) {
                                        r.b.a(b5);
                                    }
                                    rVar.f1241v0.f1233z = intValue;
                                }
                            }
                            if (i12 == 1) {
                                if (intValue == 2) {
                                    z10 = true;
                                    if (z10) {
                                    }
                                    rVar.f1241v0.f1233z = intValue;
                                }
                            }
                            if (i12 == 2) {
                            }
                            z10 = false;
                            if (z10) {
                            }
                            rVar.f1241v0.f1233z = intValue;
                        }
                    } else {
                        if (i12 == 2) {
                            if (intValue == 1) {
                            }
                        }
                        if (i12 == 1) {
                        }
                    }
                }
                i10 = R.drawable.fingerprint_dialog_fp_icon;
                Object obj2 = n2.a.f16069a;
                b5 = a.b.b(j2, i10);
                if (b5 != null) {
                }
            }
            b5 = null;
            if (b5 != null) {
            }
        }
        int intValue2 = num2.intValue();
        TextView textView = rVar.f1245z0;
        if (textView != null) {
            if (intValue2 == 2) {
                z11 = true;
            }
            if (z11) {
                i11 = rVar.f1242w0;
            } else {
                i11 = rVar.f1243x0;
            }
            textView.setTextColor(i11);
        }
        rVar.f1239t0.postDelayed(aVar, 2000L);
    }
}
