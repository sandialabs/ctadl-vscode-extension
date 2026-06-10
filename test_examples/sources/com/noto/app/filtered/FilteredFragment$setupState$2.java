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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import n6.c;
import q7.c;
import s6.e;
import t6.a;
import u7.s;
import v7.g;
import x6.h0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000e\u001a\u00020\r2\"\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u0002`\u00050\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u008a@"}, d2 = {"Ln6/c;", "", "Lt6/a;", "", "Lx6/h0;", "Lcom/noto/app/filtered/NotesGroupedByFolder;", "notes", "", "notesVisibility", "Lcom/noto/app/domain/model/Font;", "font", "", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$2", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$2 extends SuspendLambda implements s<n6.c<? extends Map<a, ? extends List<? extends h0>>>, Map<a, ? extends Boolean>, Font, String, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8255m;
    public /* synthetic */ Map n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Font f8256o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ String f8257p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8258q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ e f8259r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$2(FilteredFragment filteredFragment, e eVar, p7.c<? super FilteredFragment$setupState$2> cVar) {
        super(5, cVar);
        this.f8258q = filteredFragment;
        this.f8259r = eVar;
    }

    @Override // u7.s
    public final Object V(n6.c<? extends Map<a, ? extends List<? extends h0>>> cVar, Map<a, ? extends Boolean> map, Font font, String str, p7.c<? super n> cVar2) {
        FilteredFragment$setupState$2 filteredFragment$setupState$2 = new FilteredFragment$setupState$2(this.f8258q, this.f8259r, cVar2);
        filteredFragment$setupState$2.f8255m = cVar;
        filteredFragment$setupState$2.n = map;
        filteredFragment$setupState$2.f8256o = font;
        filteredFragment$setupState$2.f8257p = str;
        return filteredFragment$setupState$2.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        b.n1(obj);
        n6.c cVar = this.f8255m;
        Map map = this.n;
        Font font = this.f8256o;
        String str2 = this.f8257p;
        int i10 = FilteredFragment.f8233f0;
        FilteredFragment filteredFragment = this.f8258q;
        filteredFragment.getClass();
        boolean z10 = cVar instanceof c.a;
        e eVar = this.f8259r;
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
            eVar.f17329e.p0(new FilteredFragment$setupNotesGroupedByFolder$1(filteredFragment, map2, map, font, str2));
        }
        return n.f16010a;
    }
}
