package com.noto.app.filtered;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.util.EpoxyUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import n6.c;
import na.d;
import q7.c;
import s6.e;
import t6.a;
import u7.s;
import v7.g;
import x6.h0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0010\u001a\u00020\u000f2.\u0010\b\u001a*\u0012&\u0012$\u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u0001j\u0002`\u00070\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u008a@"}, d2 = {"Ln6/c;", "", "Lna/d;", "", "Lkotlin/Pair;", "Lt6/a;", "Lx6/h0;", "Lcom/noto/app/filtered/NotesGroupedByDate;", "notes", "", "notesVisibility", "Lcom/noto/app/domain/model/Font;", "font", "", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$3", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$3 extends SuspendLambda implements s<n6.c<? extends Map<d, ? extends List<? extends Pair<? extends a, ? extends h0>>>>, Map<d, ? extends Boolean>, Font, String, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8260m;
    public /* synthetic */ Map n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Font f8261o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ String f8262p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8263q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ e f8264r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$3(FilteredFragment filteredFragment, e eVar, p7.c<? super FilteredFragment$setupState$3> cVar) {
        super(5, cVar);
        this.f8263q = filteredFragment;
        this.f8264r = eVar;
    }

    @Override // u7.s
    public final Object V(n6.c<? extends Map<d, ? extends List<? extends Pair<? extends a, ? extends h0>>>> cVar, Map<d, ? extends Boolean> map, Font font, String str, p7.c<? super n> cVar2) {
        FilteredFragment$setupState$3 filteredFragment$setupState$3 = new FilteredFragment$setupState$3(this.f8263q, this.f8264r, cVar2);
        filteredFragment$setupState$3.f8260m = cVar;
        filteredFragment$setupState$3.n = map;
        filteredFragment$setupState$3.f8261o = font;
        filteredFragment$setupState$3.f8262p = str;
        return filteredFragment$setupState$3.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        b.n1(obj);
        n6.c cVar = this.f8260m;
        Map map = this.n;
        Font font = this.f8261o;
        String str2 = this.f8262p;
        int i10 = FilteredFragment.f8233f0;
        FilteredFragment filteredFragment = this.f8263q;
        filteredFragment.getClass();
        boolean z10 = cVar instanceof c.a;
        e eVar = this.f8264r;
        String str3 = null;
        if (z10) {
            EpoxyRecyclerView epoxyRecyclerView = eVar.f17329e;
            g.e(epoxyRecyclerView, "rv");
            EpoxyUtilsKt.a(epoxyRecyclerView, null);
        } else if (cVar instanceof c.b) {
            Map map2 = (Map) ((c.b) cVar).f16111a;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(Integer.valueOf(((Collection) entry.getValue()).size()));
            }
            int H2 = kotlin.collections.c.H2(arrayList);
            TickerView tickerView = eVar.f17331g;
            Context j2 = filteredFragment.j();
            if (j2 != null) {
                str = q.e(j2, R.plurals.notes_count, H2, Integer.valueOf(H2));
            } else {
                str = null;
            }
            tickerView.setText(str);
            Context j10 = filteredFragment.j();
            if (j10 != null) {
                str3 = q.e(j10, R.plurals.notes_count, H2, Integer.valueOf(H2));
            }
            eVar.f17332h.setText(str3);
            eVar.f17329e.p0(new FilteredFragment$setupNotesGroupedByDate$1(filteredFragment, map2, map, font, str2));
        }
        return n.f16010a;
    }
}
