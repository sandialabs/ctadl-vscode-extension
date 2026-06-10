package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$setParentFolder$1", f = "FolderViewModel.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderViewModel$setParentFolder$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public StateFlowImpl f8533m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8534o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Long f8535p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$setParentFolder$1(FolderViewModel folderViewModel, Long l2, p7.c<? super FolderViewModel$setParentFolder$1> cVar) {
        super(2, cVar);
        this.f8534o = folderViewModel;
        this.f8535p = l2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$setParentFolder$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$setParentFolder$1(this.f8534o, this.f8535p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        StateFlowImpl stateFlowImpl;
        t6.a aVar;
        StateFlowImpl stateFlowImpl2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                stateFlowImpl2 = this.f8533m;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            FolderViewModel folderViewModel = this.f8534o;
            stateFlowImpl = folderViewModel.f8433l;
            Long l2 = this.f8535p;
            if (l2 != null && l2.longValue() != 0) {
                kotlinx.coroutines.flow.b<t6.a> d5 = folderViewModel.f8425d.d(l2.longValue());
                this.f8533m = stateFlowImpl;
                this.n = 1;
                obj = FlowKt__ReduceKt.c(d5, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                stateFlowImpl2 = stateFlowImpl;
            } else {
                aVar = null;
                stateFlowImpl.setValue(aVar);
                return m7.n.f16010a;
            }
        }
        aVar = (t6.a) obj;
        stateFlowImpl = stateFlowImpl2;
        stateFlowImpl.setValue(aVar);
        return m7.n.f16010a;
    }
}
