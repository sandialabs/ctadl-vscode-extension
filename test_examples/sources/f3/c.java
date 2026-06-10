package f3;

import android.content.Context;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: p  reason: collision with root package name */
    public final int f10907p;

    /* renamed from: q  reason: collision with root package name */
    public final int f10908q;

    /* renamed from: r  reason: collision with root package name */
    public final LayoutInflater f10909r;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.f10908q = i10;
        this.f10907p = i10;
        this.f10909r = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
