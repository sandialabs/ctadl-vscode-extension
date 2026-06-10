package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import m0.b;
import m7.n;
import n7.l;
import q7.c;
import u7.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lt6/c;", "labels", "", "labelIds", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$getWidgetData$4", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel$getWidgetData$4 extends SuspendLambda implements q<List<? extends t6.c>, List<? extends Long>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f10118m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigViewModel f10119o;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Integer.valueOf(((t6.c) t10).f17618e), Integer.valueOf(((t6.c) t11).f17618e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigViewModel$getWidgetData$4(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super NoteListWidgetConfigViewModel$getWidgetData$4> cVar) {
        super(3, cVar);
        this.f10119o = noteListWidgetConfigViewModel;
    }

    @Override // u7.q
    public final Object O(List<? extends t6.c> list, List<? extends Long> list2, p7.c<? super n> cVar) {
        NoteListWidgetConfigViewModel$getWidgetData$4 noteListWidgetConfigViewModel$getWidgetData$4 = new NoteListWidgetConfigViewModel$getWidgetData$4(this.f10119o, cVar);
        noteListWidgetConfigViewModel$getWidgetData$4.f10118m = list;
        noteListWidgetConfigViewModel$getWidgetData$4.n = list2;
        return noteListWidgetConfigViewModel$getWidgetData$4.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        b.n1(obj);
        List list = this.f10118m;
        List list2 = this.n;
        StateFlowImpl stateFlowImpl = this.f10119o.f10088l;
        List<t6.c> G2 = kotlin.collections.c.G2(list, new a());
        ArrayList arrayList = new ArrayList(l.Z1(G2, 10));
        for (t6.c cVar : G2) {
            boolean z11 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Number) it.next()).longValue() == cVar.f17615a) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
            }
            arrayList.add(new Pair(cVar, Boolean.valueOf(z11)));
        }
        stateFlowImpl.setValue(d.N1(arrayList));
        return n.f16010a;
    }
}
