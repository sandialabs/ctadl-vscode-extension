package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.app.util.EpoxyUtilsKt;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import n6.c;
import s6.r;
import u7.q;
import v7.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, d2 = {"Ln6/c;", "", "Lkotlin/Pair;", "Lt6/a;", "", "folders", "", "isShowNotesCount", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.SelectFolderDialogFragment$setupState$1", f = "SelectFolderDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectFolderDialogFragment$setupState$1 extends SuspendLambda implements q<n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>>, Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8971m;
    public /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SelectFolderDialogFragment f8972o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ r f8973p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderDialogFragment$setupState$1(SelectFolderDialogFragment selectFolderDialogFragment, r rVar, p7.c<? super SelectFolderDialogFragment$setupState$1> cVar) {
        super(3, cVar);
        this.f8972o = selectFolderDialogFragment;
        this.f8973p = rVar;
    }

    @Override // u7.q
    public final Object O(n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar, Boolean bool, p7.c<? super n> cVar2) {
        boolean booleanValue = bool.booleanValue();
        SelectFolderDialogFragment$setupState$1 selectFolderDialogFragment$setupState$1 = new SelectFolderDialogFragment$setupState$1(this.f8972o, this.f8973p, cVar2);
        selectFolderDialogFragment$setupState$1.f8971m = cVar;
        selectFolderDialogFragment$setupState$1.n = booleanValue;
        return selectFolderDialogFragment$setupState$1.k(n.f16010a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object bVar;
        m0.b.n1(obj);
        n6.c cVar = this.f8971m;
        boolean z10 = this.n;
        boolean z11 = cVar instanceof c.a;
        SelectFolderDialogFragment selectFolderDialogFragment = this.f8972o;
        if (z11) {
            bVar = c.a.f16110a;
        } else if (cVar instanceof c.b) {
            bVar = new c.b(ModelUtilsKt.f((List) ((c.b) cVar).f16111a, new SelectFolderDialogFragment$setupState$1$1$1(selectFolderDialogFragment)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = SelectFolderDialogFragment.f8953x0;
        selectFolderDialogFragment.getClass();
        boolean z12 = bVar instanceof c.a;
        r rVar = this.f8973p;
        Pair pair = null;
        if (z12) {
            EpoxyRecyclerView epoxyRecyclerView = rVar.f17461a;
            g.e(epoxyRecyclerView, "rv");
            EpoxyUtilsKt.a(epoxyRecyclerView, null);
        } else if (bVar instanceof c.b) {
            Iterable iterable = (Iterable) ((c.b) bVar).f16111a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (!ModelUtilsKt.u((t6.a) ((Pair) obj2).f12962i)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (ModelUtilsKt.u((t6.a) ((Pair) next).f12962i)) {
                    pair = next;
                    break;
                }
            }
            rVar.f17461a.p0(new SelectFolderDialogFragment$setupFolders$1(selectFolderDialogFragment, pair, arrayList, new SelectFolderDialogFragment$setupFolders$callback$1(selectFolderDialogFragment), z10));
        }
        return n.f16010a;
    }
}
