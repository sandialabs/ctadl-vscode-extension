package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.domain.model.SortingOrder;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$updateSortingType$1", f = "FolderViewModel.kt", l = {239, 241}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$updateSortingType$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8565m;
    public final /* synthetic */ NoteListSortingType n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8566o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$updateSortingType$1(NoteListSortingType noteListSortingType, FolderViewModel folderViewModel, p7.c<? super FolderViewModel$updateSortingType$1> cVar) {
        super(2, cVar);
        this.n = noteListSortingType;
        this.f8566o = folderViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$updateSortingType$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$updateSortingType$1(this.n, this.f8566o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8565m;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            NoteListSortingType noteListSortingType = NoteListSortingType.Manual;
            NoteListSortingType noteListSortingType2 = this.n;
            FolderViewModel folderViewModel = this.f8566o;
            if (noteListSortingType2 == noteListSortingType) {
                u6.a aVar = folderViewModel.f8425d;
                t6.a a10 = t6.a.a((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), null, null, 0, null, null, 0, false, false, false, null, this.n, SortingOrder.Ascending, null, null, false, 0, null, null, null, 2084863);
                this.f8565m = 1;
                if (aVar.f(a10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u6.a aVar2 = folderViewModel.f8425d;
                t6.a a11 = t6.a.a((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), null, null, 0, null, null, 0, false, false, false, null, this.n, null, null, null, false, 0, null, null, null, 2093055);
                this.f8565m = 2;
                if (aVar2.f(a11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return m7.n.f16010a;
    }
}
