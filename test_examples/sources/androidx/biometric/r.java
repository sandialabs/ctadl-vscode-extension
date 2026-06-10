package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.biometric.BiometricPrompt;
import com.noto.R;

/* loaded from: classes.dex */
public final class r extends androidx.fragment.app.m {

    /* renamed from: t0  reason: collision with root package name */
    public final Handler f1239t0 = new Handler(Looper.getMainLooper());

    /* renamed from: u0  reason: collision with root package name */
    public final a f1240u0 = new a();

    /* renamed from: v0  reason: collision with root package name */
    public n f1241v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f1242w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f1243x0;

    /* renamed from: y0  reason: collision with root package name */
    public ImageView f1244y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f1245z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r rVar = r.this;
            Context j2 = rVar.j();
            if (j2 == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                return;
            }
            rVar.f1241v0.h(1);
            rVar.f1241v0.g(j2.getString(R.string.fingerprint_dialog_touch_sensor));
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a() {
            return R.attr.colorError;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void C() {
        this.K = true;
        this.f1239t0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void E() {
        this.K = true;
        n nVar = this.f1241v0;
        nVar.f1233z = 0;
        nVar.h(1);
        this.f1241v0.g(q(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.m
    public final Dialog c0() {
        CharSequence charSequence;
        CharSequence e10;
        b.a aVar = new b.a(S());
        BiometricPrompt.d dVar = this.f1241v0.f1214f;
        if (dVar != null) {
            charSequence = dVar.f1178a;
        } else {
            charSequence = null;
        }
        AlertController.b bVar = aVar.f536a;
        bVar.f522d = charSequence;
        View inflate = LayoutInflater.from(bVar.f520a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.f1241v0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.f1241v0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f1244y0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.f1245z0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (androidx.biometric.c.a(this.f1241v0.d())) {
            e10 = q(R.string.confirm_device_credential_password);
        } else {
            e10 = this.f1241v0.e();
        }
        s sVar = new s(this);
        bVar.f524f = e10;
        bVar.f525g = sVar;
        bVar.f529k = inflate;
        androidx.appcompat.app.b a10 = aVar.a();
        a10.setCanceledOnTouchOutside(false);
        return a10;
    }

    public final int g0(int i10) {
        Context j2 = j();
        if (j2 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        j2.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = j2.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        n nVar = this.f1241v0;
        if (nVar.f1232y == null) {
            nVar.f1232y = new androidx.lifecycle.v<>();
        }
        n.j(nVar.f1232y, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        int i10;
        super.w(bundle);
        n a10 = BiometricPrompt.a(this, this.n.getBoolean("host_activity", true));
        this.f1241v0 = a10;
        if (a10.A == null) {
            a10.A = new androidx.lifecycle.v<>();
        }
        a10.A.d(this, new t(this));
        n nVar = this.f1241v0;
        if (nVar.B == null) {
            nVar.B = new androidx.lifecycle.v<>();
        }
        nVar.B.d(this, new u(this));
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = g0(c.a());
        } else {
            Context j2 = j();
            if (j2 != null) {
                i10 = n2.a.b(j2, R.color.biometric_error_color);
            } else {
                i10 = 0;
            }
        }
        this.f1242w0 = i10;
        this.f1243x0 = g0(16842808);
    }
}
