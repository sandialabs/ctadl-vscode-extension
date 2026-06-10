package com.noto.app.note;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$1", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9121m;
    public final /* synthetic */ NotePagerFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ k0 f9122o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$1(k0 k0Var, NotePagerFragment notePagerFragment, p7.c cVar) {
        super(2, cVar);
        this.n = notePagerFragment;
        this.f9122o = k0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NotePagerFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NotePagerFragment$setupState$1 notePagerFragment$setupState$1 = new NotePagerFragment$setupState$1(this.f9122o, this.n, cVar);
        notePagerFragment$setupState$1.f9121m = obj;
        return notePagerFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9121m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            k0 k0Var = this.f9122o;
            k0Var.f17410f.setTitle(ModelUtilsKt.o(j2, aVar));
            MaterialToolbar materialToolbar = k0Var.f17410f;
            materialToolbar.setTitleTextColor(b5);
            Drawable navigationIcon = materialToolbar.getNavigationIcon();
            if (navigationIcon != null && (mutate = navigationIcon.mutate()) != null) {
                mutate.setTint(b5);
            }
            ColorStateList h10 = q.h(b5);
            FloatingActionButton floatingActionButton = k0Var.c;
            floatingActionButton.setBackgroundTintList(h10);
            FloatingActionButton floatingActionButton2 = k0Var.f17409e;
            floatingActionButton2.setRippleColor(b5);
            FloatingActionButton floatingActionButton3 = k0Var.f17408d;
            floatingActionButton3.setRippleColor(b5);
            if (Build.VERSION.SDK_INT >= 28) {
                for (FloatingActionButton floatingActionButton4 : a1.c.O0(floatingActionButton2, floatingActionButton3, floatingActionButton)) {
                    floatingActionButton4.setOutlineAmbientShadowColor(b5);
                    floatingActionButton4.setOutlineSpotShadowColor(b5);
                }
            }
        }
        return m7.n.f16010a;
    }
}
