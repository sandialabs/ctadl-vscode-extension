package q1;

import android.text.Layout;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Layout.Alignment f16865a;

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f16866b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (v7.g.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (v7.g.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f16865a = alignment;
        f16866b = alignment2;
    }
}
