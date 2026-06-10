package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.FolderRepositoryImpl$getFolderPosition$2", f = "FolderRepositoryImpl.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderRepositoryImpl$getFolderPosition$2 extends SuspendLambda implements p<x, p7.c<? super Integer>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7699m;
    public final /* synthetic */ FolderRepositoryImpl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderRepositoryImpl$getFolderPosition$2(FolderRepositoryImpl folderRepositoryImpl, p7.c<? super FolderRepositoryImpl$getFolderPosition$2> cVar) {
        super(2, cVar);
        this.n = folderRepositoryImpl;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Integer> cVar) {
        return ((FolderRepositoryImpl$getFolderPosition$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FolderRepositoryImpl$getFolderPosition$2(this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7699m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.n.f7692a.e());
            this.f7699m = 1;
            obj = FlowKt__ReduceKt.a(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return new Integer(((Collection) obj).size());
    }
}
