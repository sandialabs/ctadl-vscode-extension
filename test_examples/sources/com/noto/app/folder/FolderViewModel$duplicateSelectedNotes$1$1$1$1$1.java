package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$duplicateSelectedNotes$1$1$1$1$1", f = "FolderViewModel.kt", l = {383}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$duplicateSelectedNotes$1$1$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8503m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f8504o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t6.c f8505p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$duplicateSelectedNotes$1$1$1$1$1(long j2, t6.c cVar, FolderViewModel folderViewModel, p7.c cVar2) {
        super(2, cVar2);
        this.n = folderViewModel;
        this.f8504o = j2;
        this.f8505p = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$duplicateSelectedNotes$1$1$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$duplicateSelectedNotes$1$1$1$1$1(this.f8504o, this.f8505p, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8503m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            u6.c cVar = this.n.f8428g;
            t6.e eVar = new t6.e(this.f8504o, this.f8505p.f17615a);
            this.f8503m = 1;
            if (cVar.c(eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
