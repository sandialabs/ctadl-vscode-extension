package com.noto.app.filtered;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.e;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isVisible", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$10", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$10 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8249m;
    public final /* synthetic */ e n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$10(e eVar, p7.c<? super FilteredFragment$setupState$10> cVar) {
        super(2, cVar);
        this.n = eVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((FilteredFragment$setupState$10) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FilteredFragment$setupState$10 filteredFragment$setupState$10 = new FilteredFragment$setupState$10(this.n, cVar);
        filteredFragment$setupState$10.f8249m = ((Boolean) obj).booleanValue();
        return filteredFragment$setupState$10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        int id;
        int i11;
        b.n1(obj);
        boolean z10 = this.f8249m;
        e eVar = this.n;
        FloatingActionButton floatingActionButton = eVar.f17328d;
        g.e(floatingActionButton, "fab");
        boolean z11 = !z10;
        int i12 = 8;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        floatingActionButton.setVisibility(i10);
        BottomAppBar bottomAppBar = eVar.f17327b;
        g.e(bottomAppBar, "bab");
        if (z11) {
            i12 = 0;
        }
        bottomAppBar.setVisibility(i12);
        TextInputLayout textInputLayout = eVar.f17330f;
        g.e(textInputLayout, "tilSearch");
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
            if (z10) {
                id = -1;
            } else {
                id = eVar.f17328d.getId();
            }
            fVar.f4603l = null;
            fVar.f4602k = null;
            fVar.f4597f = id;
            if (z10) {
                i11 = 80;
            } else {
                i11 = 48;
            }
            fVar.c = i11;
            textInputLayout.setLayoutParams(fVar);
            return n.f16010a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
