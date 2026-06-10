package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$moveSelectedNotes$1$1$1", f = "FolderViewModel.kt", l = {393}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$moveSelectedNotes$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8516m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8517o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ h0 f8518p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f8519q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$moveSelectedNotes$1$1$1(FolderViewModel folderViewModel, h0 h0Var, long j2, p7.c<? super FolderViewModel$moveSelectedNotes$1$1$1> cVar) {
        super(2, cVar);
        this.f8517o = folderViewModel;
        this.f8518p = h0Var;
        this.f8519q = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$moveSelectedNotes$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$moveSelectedNotes$1$1$1 folderViewModel$moveSelectedNotes$1$1$1 = new FolderViewModel$moveSelectedNotes$1$1$1(this.f8517o, this.f8518p, this.f8519q, cVar);
        folderViewModel$moveSelectedNotes$1$1$1.n = obj;
        return folderViewModel$moveSelectedNotes$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        x xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8516m;
        h0 h0Var = this.f8518p;
        if (i10 != 0) {
            if (i10 == 1) {
                xVar = (x) this.n;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            x xVar2 = (x) this.n;
            u6.d dVar = this.f8517o.f8426e;
            t6.d a10 = t6.d.a(h0Var.f18683a, 0L, this.f8519q, null, null, 0, false, false, null, null, 0, 4093);
            this.n = xVar2;
            this.f8516m = 1;
            if (dVar.c(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = xVar2;
        }
        List<t6.c> list = h0Var.f18684b;
        FolderViewModel folderViewModel = this.f8517o;
        long j2 = this.f8519q;
        for (t6.c cVar : list) {
            m0.b.M0(xVar, null, null, new FolderViewModel$moveSelectedNotes$1$1$1$1$1(folderViewModel, j2, cVar, h0Var, null), 3);
        }
        return m7.n.f16010a;
    }
}
