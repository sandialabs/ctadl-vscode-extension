package h5;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class c extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f11440b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = c.this.f11440b;
            int i10 = BottomAppBar.B0;
            bottomAppBar.getClass();
        }
    }

    public c(BottomAppBar bottomAppBar, int i10) {
        this.f11440b = bottomAppBar;
        this.f11439a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        int i10 = BottomAppBar.B0;
        floatingActionButton.setTranslationX(this.f11440b.B(this.f11439a));
        floatingActionButton.n(new a(), true);
    }
}
