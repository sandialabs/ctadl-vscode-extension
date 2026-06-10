package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.SortingOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import n6.c;
import s6.x;
import t6.d;
import u7.t;
import z6.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001H\u008a@"}, d2 = {"Ln6/c;", "", "Lkotlin/Pair;", "Lt6/a;", "", "folders", "Lcom/noto/app/domain/model/FolderListSortingType;", "sortingType", "Lcom/noto/app/domain/model/SortingOrder;", "sortingOrder", "", "isShowNotesCount", "Lt6/d;", "allNotes", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainFragment$setupState$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MainFragment$setupState$1 extends SuspendLambda implements t<n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>>, FolderListSortingType, SortingOrder, Boolean, List<? extends d>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8882m;
    public /* synthetic */ FolderListSortingType n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ boolean f8883o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ List f8884p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8885q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ x f8886r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupState$1(MainFragment mainFragment, x xVar, p7.c<? super MainFragment$setupState$1> cVar) {
        super(6, cVar);
        this.f8885q = mainFragment;
        this.f8886r = xVar;
    }

    @Override // u7.t
    public final Object E(n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar, FolderListSortingType folderListSortingType, SortingOrder sortingOrder, Boolean bool, List<? extends d> list, p7.c<? super n> cVar2) {
        SortingOrder sortingOrder2 = sortingOrder;
        boolean booleanValue = bool.booleanValue();
        MainFragment$setupState$1 mainFragment$setupState$1 = new MainFragment$setupState$1(this.f8885q, this.f8886r, cVar2);
        mainFragment$setupState$1.f8882m = cVar;
        mainFragment$setupState$1.n = folderListSortingType;
        mainFragment$setupState$1.f8883o = booleanValue;
        mainFragment$setupState$1.f8884p = list;
        return mainFragment$setupState$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        n6.c cVar = this.f8882m;
        FolderListSortingType folderListSortingType = this.n;
        boolean z11 = this.f8883o;
        List list = this.f8884p;
        int i10 = MainFragment.A0;
        MainFragment mainFragment = this.f8885q;
        mainFragment.getClass();
        boolean z12 = cVar instanceof c.b;
        x xVar = this.f8886r;
        if (z12) {
            xVar.f17482b.p0(new MainFragment$setupFolders$1(mainFragment, cVar, folderListSortingType, xVar, list, z11));
        }
        if (folderListSortingType == FolderListSortingType.Manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m mVar = mainFragment.f8845w0;
            if (mVar != null) {
                androidx.recyclerview.widget.n nVar = new androidx.recyclerview.widget.n(new e(mVar, new MainFragment$setupItemTouchHelper$itemTouchHelperCallback$1(xVar, mainFragment), new MainFragment$setupItemTouchHelper$itemTouchHelperCallback$2(xVar, mainFragment)));
                nVar.i(xVar.f17482b);
                mainFragment.f8846x0 = nVar;
            }
        } else {
            androidx.recyclerview.widget.n nVar2 = mainFragment.f8846x0;
            if (nVar2 != null) {
                nVar2.i(null);
            }
        }
        return n.f16010a;
    }
}
