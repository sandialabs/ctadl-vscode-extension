package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$archiveSelectedNotes$1$1$1", f = "FolderViewModel.kt", l = {372}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$archiveSelectedNotes$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8467m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ h0 f8468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$archiveSelectedNotes$1$1$1(FolderViewModel folderViewModel, h0 h0Var, p7.c<? super FolderViewModel$archiveSelectedNotes$1$1$1> cVar) {
        super(2, cVar);
        this.n = folderViewModel;
        this.f8468o = h0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$archiveSelectedNotes$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$archiveSelectedNotes$1$1$1(this.n, this.f8468o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8467m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            u6.d dVar = this.n.f8426e;
            t6.d a10 = t6.d.a(this.f8468o.f18683a, 0L, 0L, null, null, 0, false, true, null, null, 0, 3967);
            this.f8467m = 1;
            if (dVar.c(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
