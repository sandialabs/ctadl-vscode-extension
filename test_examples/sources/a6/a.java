package a6;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f242i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f243j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f244k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f245l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f246a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f247b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public int f248d;

    /* renamed from: e  reason: collision with root package name */
    public int f249e;

    /* renamed from: f  reason: collision with root package name */
    public int f250f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f251g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f252h;

    public a() {
        Paint paint = new Paint();
        this.f252h = paint;
        this.f246a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f247b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f248d = q2.a.d(i10, 68);
        this.f249e = q2.a.d(i10, 20);
        this.f250f = q2.a.d(i10, 0);
        this.f246a.setColor(this.f248d);
    }
}
