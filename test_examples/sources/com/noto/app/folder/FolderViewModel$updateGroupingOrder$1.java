package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.GroupingOrder;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$updateGroupingOrder$1", f = "FolderViewModel.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderViewModel$updateGroupingOrder$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8556m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ GroupingOrder f8557o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$updateGroupingOrder$1(FolderViewModel folderViewModel, GroupingOrder groupingOrder, p7.c<? super FolderViewModel$updateGroupingOrder$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8557o = groupingOrder;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$updateGroupingOrder$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$updateGroupingOrder$1(this.n, this.f8557o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8556m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            FolderViewModel folderViewModel = this.n;
            u6.a aVar = folderViewModel.f8425d;
            t6.a a10 = t6.a.a((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), null, null, 0, null, null, 0, false, false, false, null, null, null, null, this.f8557o, false, 0, null, null, null, 2064383);
            this.f8556m = 1;
            if (aVar.f(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
