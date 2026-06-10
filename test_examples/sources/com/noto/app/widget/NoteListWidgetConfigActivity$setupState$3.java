package com.noto.app.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.m;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.widget.NoteListWidgetConfigActivity;
import com.noto.app.widget.NoteListWidgetConfigViewModel;
import f7.q;
import h7.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import m0.b;
import m7.n;
import q7.c;
import s6.i0;
import s6.j0;
import u7.l;
import u7.s;
import v7.g;
import x6.h0;
import y6.i;
import z6.a0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\tH\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Lx6/h0;", "notes", "", "Lt6/c;", "", "labels", "Lcom/noto/app/domain/model/FilteringType;", "filteringType", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$3", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$3 extends SuspendLambda implements s<t6.a, List<? extends h0>, Map<t6.c, ? extends Boolean>, FilteringType, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f10063m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Map f10064o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ FilteringType f10065p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10066q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ j0 f10067r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigActivity$setupState$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements l<m, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Map<t6.c, Boolean> f10068j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ NoteListWidgetConfigActivity f10069k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<t6.c, Boolean> map, NoteListWidgetConfigActivity noteListWidgetConfigActivity) {
            super(1);
            this.f10068j = map;
            this.f10069k = noteListWidgetConfigActivity;
        }

        @Override // u7.l
        public final n U(m mVar) {
            m mVar2 = mVar;
            g.f(mVar2, "$this$withModels");
            for (final Map.Entry<t6.c, Boolean> entry : this.f10068j.entrySet()) {
                i iVar = new i();
                iVar.J(entry.getKey().f17615a);
                iVar.L(entry.getKey());
                iVar.K(entry.getValue().booleanValue());
                iVar.I(NotoColor.Black);
                final NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10069k;
                iVar.M(new View.OnClickListener() { // from class: h7.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        boolean z10;
                        boolean booleanValue;
                        Map.Entry entry2 = entry;
                        v7.g.f(entry2, "$entry");
                        NoteListWidgetConfigActivity noteListWidgetConfigActivity2 = noteListWidgetConfigActivity;
                        v7.g.f(noteListWidgetConfigActivity2, "this$0");
                        if (((Boolean) entry2.getValue()).booleanValue()) {
                            int i10 = NoteListWidgetConfigActivity.L;
                            NoteListWidgetConfigViewModel s10 = noteListWidgetConfigActivity2.s();
                            long j2 = ((t6.c) entry2.getKey()).f17615a;
                            StateFlowImpl stateFlowImpl = s10.f10088l;
                            Map map = (Map) a1.b.m(stateFlowImpl).getValue();
                            ArrayList arrayList = new ArrayList(map.size());
                            for (Map.Entry entry3 : map.entrySet()) {
                                Object key = entry3.getKey();
                                if (((t6.c) entry3.getKey()).f17615a == j2) {
                                    booleanValue = false;
                                } else {
                                    booleanValue = ((Boolean) entry3.getValue()).booleanValue();
                                }
                                arrayList.add(new Pair(key, Boolean.valueOf(booleanValue)));
                            }
                            stateFlowImpl.setValue(kotlin.collections.d.N1(arrayList));
                            return;
                        }
                        int i11 = NoteListWidgetConfigActivity.L;
                        NoteListWidgetConfigViewModel s11 = noteListWidgetConfigActivity2.s();
                        long j10 = ((t6.c) entry2.getKey()).f17615a;
                        StateFlowImpl stateFlowImpl2 = s11.f10088l;
                        Map map2 = (Map) a1.b.m(stateFlowImpl2).getValue();
                        ArrayList arrayList2 = new ArrayList(map2.size());
                        for (Map.Entry entry4 : map2.entrySet()) {
                            Object key2 = entry4.getKey();
                            if (!((Boolean) entry4.getValue()).booleanValue() && ((t6.c) entry4.getKey()).f17615a != j10) {
                                z10 = false;
                                arrayList2.add(new Pair(key2, Boolean.valueOf(z10)));
                            }
                            z10 = true;
                            arrayList2.add(new Pair(key2, Boolean.valueOf(z10)));
                        }
                        stateFlowImpl2.setValue(kotlin.collections.d.N1(arrayList2));
                    }
                });
                iVar.N(new a0());
                mVar2.add(iVar);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$3(j0 j0Var, NoteListWidgetConfigActivity noteListWidgetConfigActivity, p7.c cVar) {
        super(5, cVar);
        this.f10066q = noteListWidgetConfigActivity;
        this.f10067r = j0Var;
    }

    @Override // u7.s
    public final Object V(t6.a aVar, List<? extends h0> list, Map<t6.c, ? extends Boolean> map, FilteringType filteringType, p7.c<? super n> cVar) {
        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10066q;
        NoteListWidgetConfigActivity$setupState$3 noteListWidgetConfigActivity$setupState$3 = new NoteListWidgetConfigActivity$setupState$3(this.f10067r, noteListWidgetConfigActivity, cVar);
        noteListWidgetConfigActivity$setupState$3.f10063m = aVar;
        noteListWidgetConfigActivity$setupState$3.n = list;
        noteListWidgetConfigActivity$setupState$3.f10064o = map;
        noteListWidgetConfigActivity$setupState$3.f10065p = filteringType;
        return noteListWidgetConfigActivity$setupState$3.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        int i11;
        b.n1(obj);
        t6.a aVar = this.f10063m;
        List list = this.n;
        Map map = this.f10064o;
        ArrayList i12 = ModelUtilsKt.i(list, ModelUtilsKt.h(map), this.f10065p);
        int j2 = q.j(aVar.f17595e);
        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10066q;
        int b5 = q.b(noteListWidgetConfigActivity, j2);
        j0 j0Var = this.f10067r;
        j0Var.f17401l.setTitleTextColor(b5);
        EpoxyRecyclerView epoxyRecyclerView = j0Var.f17395f;
        g.e(epoxyRecyclerView, "rv");
        if (!map.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        epoxyRecyclerView.setVisibility(i10);
        LinearLayout linearLayout = j0Var.c;
        g.e(linearLayout, "llFiltering");
        if (!map.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        j0Var.f17392b.setBackgroundColor(b5);
        j0Var.n.setText(ModelUtilsKt.o(noteListWidgetConfigActivity, aVar));
        i0 i0Var = j0Var.f17403o;
        i0Var.f17385h.setText(ModelUtilsKt.o(noteListWidgetConfigActivity, aVar));
        i0Var.f17385h.setTextColor(b5);
        Drawable background = i0Var.f17379a.getBackground();
        if (background != null) {
            background.setTint(b5);
        }
        i0Var.c.setColorFilter(b5);
        if (i12.isEmpty()) {
            ListView listView = i0Var.f17384g;
            g.e(listView, "widget.lv");
            listView.setVisibility(8);
            TextView textView = i0Var.f17386i;
            g.e(textView, "widget.tvPlaceholder");
            textView.setVisibility(0);
        } else {
            ListView listView2 = i0Var.f17384g;
            g.e(listView2, "widget.lv");
            listView2.setVisibility(0);
            TextView textView2 = i0Var.f17386i;
            g.e(textView2, "widget.tvPlaceholder");
            textView2.setVisibility(8);
            i0Var.f17384g.setAdapter((ListAdapter) new f(this.f10066q, i12, aVar.f17601k, aVar.f17595e, aVar.f17598h));
        }
        epoxyRecyclerView.p0(new AnonymousClass1(map, noteListWidgetConfigActivity));
        return n.f16010a;
    }
}
