package a3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final PointerIcon f168a;

    /* loaded from: classes.dex */
    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            PointerIcon create;
            create = PointerIcon.create(bitmap, f10, f11);
            return create;
        }

        public static PointerIcon b(Context context, int i10) {
            PointerIcon systemIcon;
            systemIcon = PointerIcon.getSystemIcon(context, i10);
            return systemIcon;
        }

        public static PointerIcon c(Resources resources, int i10) {
            PointerIcon load;
            load = PointerIcon.load(resources, i10);
            return load;
        }
    }

    public d0(PointerIcon pointerIcon) {
        this.f168a = pointerIcon;
    }
}
