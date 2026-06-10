package com.noto.app.filtered;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.airbnb.epoxy.m;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.filtered.FilteredViewModel;
import com.noto.app.folder.r;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import m7.n;
import o6.i;
import t6.a;
import u7.l;
import v7.g;
import w6.d;
import w6.e;
import w6.f;
import x6.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FilteredFragment$setupNotesGroupedByFolder$1 extends Lambda implements l<m, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8245j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Map<a, List<h0>> f8246k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Map<a, Boolean> f8247l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Font f8248m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilteredFragment$setupNotesGroupedByFolder$1(FilteredFragment filteredFragment, Map<a, ? extends List<h0>> map, Map<a, Boolean> map2, Font font, String str) {
        super(1);
        this.f8245j = filteredFragment;
        this.f8246k = map;
        this.f8247l = map2;
        this.f8248m = font;
        this.n = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [w6.i] */
    @Override // u7.l
    public final n U(m mVar) {
        boolean z10;
        boolean z11;
        m mVar2 = mVar;
        g.f(mVar2, "$this$withModels");
        final FilteredFragment filteredFragment = this.f8245j;
        Context j2 = filteredFragment.j();
        if (j2 != null) {
            Map<a, List<h0>> map = this.f8246k;
            Collection<List<h0>> values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (!((List) it.next()).isEmpty()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                i iVar = new i();
                iVar.E();
                iVar.F(q.f(j2, R.string.no_notes_found, new Object[0]));
                mVar2.add(iVar);
            } else {
                for (Map.Entry<a, List<h0>> entry : map.entrySet()) {
                    final a key = entry.getKey();
                    List<h0> value = entry.getValue();
                    Boolean bool = this.f8247l.get(key);
                    if (bool != null) {
                        z11 = bool.booleanValue();
                    } else {
                        z11 = true;
                    }
                    ArrayList arrayList = new ArrayList(n7.l.Z1(value, 10));
                    for (h0 h0Var : value) {
                        arrayList.add(Long.valueOf(h0Var.f18683a.f17621a));
                    }
                    long[] M2 = c.M2(arrayList);
                    o6.g gVar = new o6.g();
                    long j10 = key.f17592a;
                    gVar.l("folder " + j10);
                    gVar.H(ModelUtilsKt.o(j2, key));
                    NotoColor notoColor = key.f17595e;
                    gVar.F(notoColor);
                    gVar.p();
                    gVar.f16366l = z11;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: w6.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FilteredFragment filteredFragment2 = FilteredFragment.this;
                            v7.g.f(filteredFragment2, "this$0");
                            t6.a aVar = key;
                            v7.g.f(aVar, "$folder");
                            int i10 = FilteredFragment.f8233f0;
                            FilteredViewModel Z = filteredFragment2.Z();
                            StateFlowImpl stateFlowImpl = Z.f8296l;
                            Map map2 = (Map) Z.e().getValue();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(m0.b.O0(map2.size()));
                            for (Map.Entry entry2 : map2.entrySet()) {
                                Object key2 = entry2.getKey();
                                int i11 = (((t6.a) entry2.getKey()).f17592a > aVar.f17592a ? 1 : (((t6.a) entry2.getKey()).f17592a == aVar.f17592a ? 0 : -1));
                                boolean booleanValue = ((Boolean) entry2.getValue()).booleanValue();
                                if (i11 == 0) {
                                    if (!booleanValue) {
                                        booleanValue = true;
                                    } else {
                                        booleanValue = false;
                                    }
                                }
                                linkedHashMap.put(key2, Boolean.valueOf(booleanValue));
                            }
                            stateFlowImpl.setValue(linkedHashMap);
                        }
                    };
                    gVar.p();
                    gVar.n = onClickListener;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: w6.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FilteredFragment filteredFragment2 = FilteredFragment.this;
                            v7.g.f(filteredFragment2, "this$0");
                            t6.a aVar = key;
                            v7.g.f(aVar, "$folder");
                            NavController g10 = ViewUtilsKt.g(filteredFragment2);
                            if (g10 != null) {
                                ViewUtilsKt.o(g10, ma.i.l(aVar.f17592a, 0L, new long[0], 126), null);
                            }
                        }
                    };
                    gVar.p();
                    gVar.f16369p = onClickListener2;
                    gVar.G(new View.OnLongClickListener() { // from class: w6.i
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            FilteredFragment filteredFragment2 = FilteredFragment.this;
                            v7.g.f(filteredFragment2, "this$0");
                            t6.a aVar = key;
                            v7.g.f(aVar, "$folder");
                            NavController g10 = ViewUtilsKt.g(filteredFragment2);
                            if (g10 != null) {
                                ViewUtilsKt.o(g10, new m(aVar.f17592a), null);
                                return true;
                            }
                            return true;
                        }
                    });
                    mVar2.add(gVar);
                    if (z11) {
                        for (h0 h0Var2 : value) {
                            r rVar = new r();
                            rVar.Q(h0Var2.f18683a.f17621a);
                            rVar.W(h0Var2);
                            rVar.P(this.f8248m);
                            rVar.O(notoColor);
                            rVar.c0(this.n);
                            rVar.b0(key.f17598h);
                            rVar.V(key.f17601k);
                            rVar.R(false);
                            rVar.X(new d(filteredFragment, h0Var2, M2, 1));
                            rVar.Z(new e(filteredFragment, h0Var2, M2, 1));
                            rVar.Y(new f(1));
                            mVar2.add(rVar);
                        }
                    }
                }
            }
        }
        return n.f16010a;
    }
}
