package com.noto.app.filtered;

import android.content.Context;
import android.view.MenuItem;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import f7.q;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import t6.a;
import u7.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"", "Lt6/a;", "", "visibility", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$6", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$6 extends SuspendLambda implements p<Map<a, ? extends Boolean>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8268m;
    public final /* synthetic */ MenuItem n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8269o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f8270p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f8271q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$6(MenuItem menuItem, FilteredFragment filteredFragment, String str, String str2, p7.c<? super FilteredFragment$setupState$6> cVar) {
        super(2, cVar);
        this.n = menuItem;
        this.f8269o = filteredFragment;
        this.f8270p = str;
        this.f8271q = str2;
    }

    @Override // u7.p
    public final Object R(Map<a, ? extends Boolean> map, p7.c<? super n> cVar) {
        return ((FilteredFragment$setupState$6) a(map, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FilteredFragment$setupState$6 filteredFragment$setupState$6 = new FilteredFragment$setupState$6(this.n, this.f8269o, this.f8270p, this.f8271q, cVar);
        filteredFragment$setupState$6.f8268m = obj;
        return filteredFragment$setupState$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        b.n1(obj);
        Map map = (Map) this.f8268m;
        boolean z10 = false;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        }
        FilteredFragment filteredFragment = this.f8269o;
        MenuItem menuItem = this.n;
        Context j2 = filteredFragment.j();
        if (z10) {
            menuItem.setIcon(j2 != null ? q.c(j2, R.drawable.ic_round_collapse_24) : null);
            str = this.f8270p;
        } else {
            menuItem.setIcon(j2 != null ? q.c(j2, R.drawable.ic_round_expand_24) : null);
            str = this.f8271q;
        }
        menuItem.setTitle(str);
        a3.q.a(menuItem, str);
        return n.f16010a;
    }
}
