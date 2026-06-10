package com.noto.app.filtered;

import a1.b;
import androidx.activity.i;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/i;", "Lm7/n;", "invoke", "(Landroidx/activity/i;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FilteredFragment$setupListeners$6 extends Lambda implements l<i, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupListeners$6(FilteredFragment filteredFragment) {
        super(1);
        this.f8240j = filteredFragment;
    }

    @Override // u7.l
    public final n U(i iVar) {
        g.f(iVar, "$this$addCallback");
        int i10 = FilteredFragment.f8233f0;
        FilteredFragment filteredFragment = this.f8240j;
        if (((Boolean) b.m(filteredFragment.Z().f8298o).getValue()).booleanValue()) {
            FilteredViewModel Z = filteredFragment.Z();
            Z.f8298o.setValue(Boolean.FALSE);
            Z.f8299p.setValue("");
        } else if (((Boolean) filteredFragment.Z().f8302s.getValue()).booleanValue()) {
            s c = filteredFragment.c();
            if (c != null) {
                c.finish();
            }
        } else {
            NavController g10 = ViewUtilsKt.g(filteredFragment);
            if (g10 != null) {
                ViewUtilsKt.o(g10, new w6.n(true), null);
            }
        }
        return n.f16010a;
    }
}
