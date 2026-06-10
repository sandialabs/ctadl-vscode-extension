package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$moveSelectedNotes$1$1$1$1$1", f = "FolderViewModel.kt", l = {396, 397, 398}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$moveSelectedNotes$1$1$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8520m;
    public final /* synthetic */ FolderViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f8521o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t6.c f8522p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ h0 f8523q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$moveSelectedNotes$1$1$1$1$1(FolderViewModel folderViewModel, long j2, t6.c cVar, h0 h0Var, p7.c<? super FolderViewModel$moveSelectedNotes$1$1$1$1$1> cVar2) {
        super(2, cVar2);
        this.n = folderViewModel;
        this.f8521o = j2;
        this.f8522p = cVar;
        this.f8523q = h0Var;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$moveSelectedNotes$1$1$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$moveSelectedNotes$1$1$1$1$1(this.n, this.f8521o, this.f8522p, this.f8523q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        u6.c cVar;
        long j2;
        long j10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8520m;
        h0 h0Var = this.f8523q;
        t6.c cVar2 = this.f8522p;
        FolderViewModel folderViewModel = this.n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        m0.b.n1(obj);
                        return m7.n.f16010a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                cVar = folderViewModel.f8428g;
                j2 = h0Var.f18683a.f17621a;
                j10 = cVar2.f17615a;
                this.f8520m = 3;
                if (cVar.a(j2, j10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return m7.n.f16010a;
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            u6.b bVar = folderViewModel.f8427f;
            this.f8520m = 1;
            obj = ModelUtilsKt.n(bVar, this.f8521o, cVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        long longValue = ((Number) obj).longValue();
        u6.c cVar3 = folderViewModel.f8428g;
        t6.e eVar = new t6.e(h0Var.f18683a.f17621a, longValue);
        this.f8520m = 2;
        if (cVar3.c(eVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        cVar = folderViewModel.f8428g;
        j2 = h0Var.f18683a.f17621a;
        j10 = cVar2.f17615a;
        this.f8520m = 3;
        if (cVar.a(j2, j10, this) == coroutineSingletons) {
        }
        return m7.n.f16010a;
    }
}
