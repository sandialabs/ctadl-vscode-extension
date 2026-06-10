package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$mergeSelectedNotes$1$1$1", f = "FolderViewModel.kt", l = {337}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$mergeSelectedNotes$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8509m;
    public final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ t6.c f8510o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8511p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$mergeSelectedNotes$1$1$1(long j2, t6.c cVar, FolderViewModel folderViewModel, p7.c<? super FolderViewModel$mergeSelectedNotes$1$1$1> cVar2) {
        super(2, cVar2);
        this.n = j2;
        this.f8510o = cVar;
        this.f8511p = folderViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$mergeSelectedNotes$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$mergeSelectedNotes$1$1$1(this.n, this.f8510o, this.f8511p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8509m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            t6.e eVar = new t6.e(this.n, this.f8510o.f17615a);
            u6.c cVar = this.f8511p.f8428g;
            this.f8509m = 1;
            if (cVar.c(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
