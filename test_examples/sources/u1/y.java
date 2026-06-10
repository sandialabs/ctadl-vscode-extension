package u1;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import g0.g1;

/* loaded from: classes.dex */
public interface y extends g1<Object> {

    /* loaded from: classes.dex */
    public static final class a implements y, g1<Object> {

        /* renamed from: i  reason: collision with root package name */
        public final AsyncFontListLoader f17774i;

        public a(AsyncFontListLoader asyncFontListLoader) {
            this.f17774i = asyncFontListLoader;
        }

        @Override // u1.y
        public final boolean e() {
            return this.f17774i.f4091o;
        }

        @Override // g0.g1
        public final Object getValue() {
            return this.f17774i.getValue();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements y {

        /* renamed from: i  reason: collision with root package name */
        public final Object f17775i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f17776j;

        public b(Object obj, boolean z10) {
            v7.g.f(obj, "value");
            this.f17775i = obj;
            this.f17776j = z10;
        }

        @Override // u1.y
        public final boolean e() {
            return this.f17776j;
        }

        @Override // g0.g1
        public final Object getValue() {
            return this.f17775i;
        }
    }

    boolean e();
}
