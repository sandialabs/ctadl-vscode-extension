package com.noto.app.filtered;

import androidx.appcompat.widget.e1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.e;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isSearchEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$4", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$4 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8265m;
    public final /* synthetic */ FilteredFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ e f8266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$4(FilteredFragment filteredFragment, e eVar, p7.c<? super FilteredFragment$setupState$4> cVar) {
        super(2, cVar);
        this.n = filteredFragment;
        this.f8266o = eVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((FilteredFragment$setupState$4) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FilteredFragment$setupState$4 filteredFragment$setupState$4 = new FilteredFragment$setupState$4(this.n, this.f8266o, cVar);
        filteredFragment$setupState$4.f8265m = ((Boolean) obj).booleanValue();
        return filteredFragment$setupState$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        boolean z10 = this.f8265m;
        e eVar = this.f8266o;
        FilteredFragment filteredFragment = this.n;
        if (z10) {
            int i10 = FilteredFragment.f8233f0;
            filteredFragment.getClass();
            TextInputLayout textInputLayout = eVar.f17330f;
            g.e(textInputLayout, "tilSearch");
            textInputLayout.setVisibility(0);
            eVar.f17330f.postDelayed(new e1(13, eVar), 250L);
            s c = filteredFragment.c();
            if (c != null) {
                TextInputEditText textInputEditText = eVar.c;
                g.e(textInputEditText, "etSearch");
                ViewUtilsKt.v(c, textInputEditText);
            }
        } else {
            int i11 = FilteredFragment.f8233f0;
            filteredFragment.getClass();
            TextInputLayout textInputLayout2 = eVar.f17330f;
            g.e(textInputLayout2, "tilSearch");
            textInputLayout2.setVisibility(8);
            s c10 = filteredFragment.c();
            TextInputEditText textInputEditText2 = eVar.c;
            if (c10 != null) {
                g.e(textInputEditText2, "etSearch");
                ViewUtilsKt.h(c10, textInputEditText2);
            }
            textInputEditText2.setText((CharSequence) null);
        }
        return n.f16010a;
    }
}
