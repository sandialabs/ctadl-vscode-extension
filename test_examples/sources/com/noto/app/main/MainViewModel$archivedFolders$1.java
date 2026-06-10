package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FolderListSortingType;
import com.noto.app.domain.model.SortingOrder;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.s;

@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u008a@"}, d2 = {"", "Lt6/a;", "folders", "Lt6/b;", "notesCount", "Lcom/noto/app/domain/model/FolderListSortingType;", "sortingType", "Lcom/noto/app/domain/model/SortingOrder;", "sortingOrder", "Lkotlin/Pair;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainViewModel$archivedFolders$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MainViewModel$archivedFolders$1 extends SuspendLambda implements s<List<? extends t6.a>, List<? extends t6.b>, FolderListSortingType, SortingOrder, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f8929m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ FolderListSortingType f8930o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ SortingOrder f8931p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ MainViewModel f8932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$archivedFolders$1(MainViewModel mainViewModel, p7.c<? super MainViewModel$archivedFolders$1> cVar) {
        super(5, cVar);
        this.f8932q = mainViewModel;
    }

    @Override // u7.s
    public final Object V(List<? extends t6.a> list, List<? extends t6.b> list2, FolderListSortingType folderListSortingType, SortingOrder sortingOrder, p7.c<? super List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar) {
        MainViewModel$archivedFolders$1 mainViewModel$archivedFolders$1 = new MainViewModel$archivedFolders$1(this.f8932q, cVar);
        mainViewModel$archivedFolders$1.f8929m = list;
        mainViewModel$archivedFolders$1.n = list2;
        mainViewModel$archivedFolders$1.f8930o = folderListSortingType;
        mainViewModel$archivedFolders$1.f8931p = sortingOrder;
        return mainViewModel$archivedFolders$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        List list = this.f8929m;
        List list2 = this.n;
        FolderListSortingType folderListSortingType = this.f8930o;
        SortingOrder sortingOrder = this.f8931p;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((t6.a) obj2).f17593b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        this.f8932q.getClass();
        return ModelUtilsKt.A(MainViewModel.d(arrayList, list, list2, folderListSortingType, sortingOrder), folderListSortingType, sortingOrder);
    }
}
