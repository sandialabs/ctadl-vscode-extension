package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.noto.R;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1021a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1022b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1023d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1024e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1025f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1026g;

    public l1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1023d = layoutParams;
        this.f1024e = new Rect();
        this.f1025f = new int[2];
        this.f1026g = new int[2];
        this.f1021a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1022b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(l1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082692;
        layoutParams.flags = 24;
    }
}
