package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x6.h0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$copySelectedNotes$1", f = "FolderViewModel.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderViewModel$copySelectedNotes$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public FolderViewModel f8469m;
    public Iterator n;

    /* renamed from: o  reason: collision with root package name */
    public h0 f8470o;

    /* renamed from: p  reason: collision with root package name */
    public long f8471p;

    /* renamed from: q  reason: collision with root package name */
    public int f8472q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f8473r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8474s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f8475t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$copySelectedNotes$1(FolderViewModel folderViewModel, long j2, p7.c<? super FolderViewModel$copySelectedNotes$1> cVar) {
        super(2, cVar);
        this.f8474s = folderViewModel;
        this.f8475t = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$copySelectedNotes$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderViewModel$copySelectedNotes$1 folderViewModel$copySelectedNotes$1 = new FolderViewModel$copySelectedNotes$1(this.f8474s, this.f8475t, cVar);
        folderViewModel$copySelectedNotes$1.f8473r = obj;
        return folderViewModel$copySelectedNotes$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[LOOP:0: B:16:0x00b5->B:18:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a5 -> B:15:0x00a9). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        FolderViewModel$copySelectedNotes$1 folderViewModel$copySelectedNotes$1;
        x xVar;
        FolderViewModel folderViewModel;
        Iterator it;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8472q;
        if (i10 != 0) {
            if (i10 == 1) {
                long j10 = this.f8471p;
                h0 h0Var = this.f8470o;
                Iterator it2 = this.n;
                FolderViewModel folderViewModel2 = this.f8469m;
                m0.b.n1(obj);
                folderViewModel$copySelectedNotes$1 = this;
                xVar = (x) this.f8473r;
                long j11 = j10;
                Object g10 = obj;
                long longValue = ((Number) g10).longValue();
                for (t6.c cVar : h0Var.f18684b) {
                    m0.b.M0(xVar, null, null, new FolderViewModel$copySelectedNotes$1$1$1$1(folderViewModel2, j11, cVar, longValue, null), 3);
                }
                it = it2;
                folderViewModel = folderViewModel2;
                j2 = j11;
                if (it.hasNext()) {
                    h0 h0Var2 = (h0) it.next();
                    u6.d dVar = folderViewModel.f8426e;
                    FolderViewModel$copySelectedNotes$1 folderViewModel$copySelectedNotes$12 = folderViewModel$copySelectedNotes$1;
                    x xVar2 = xVar;
                    t6.d a10 = t6.d.a(h0Var2.f18683a, 0L, j2, null, null, 0, false, false, null, null, 0, 4092);
                    folderViewModel$copySelectedNotes$12.f8473r = xVar2;
                    folderViewModel2 = folderViewModel;
                    folderViewModel$copySelectedNotes$12.f8469m = folderViewModel2;
                    folderViewModel$copySelectedNotes$12.n = it;
                    folderViewModel$copySelectedNotes$12.f8470o = h0Var2;
                    j11 = j2;
                    folderViewModel$copySelectedNotes$12.f8471p = j11;
                    folderViewModel$copySelectedNotes$12.f8472q = 1;
                    g10 = dVar.g(a10, true, folderViewModel$copySelectedNotes$12);
                    if (g10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    folderViewModel$copySelectedNotes$1 = folderViewModel$copySelectedNotes$12;
                    xVar = xVar2;
                    it2 = it;
                    h0Var = h0Var2;
                    long longValue2 = ((Number) g10).longValue();
                    while (r2.hasNext()) {
                    }
                    it = it2;
                    folderViewModel = folderViewModel2;
                    j2 = j11;
                    if (it.hasNext()) {
                        return m7.n.f16010a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            FolderViewModel folderViewModel3 = this.f8474s;
            Iterator it3 = folderViewModel3.n().iterator();
            folderViewModel$copySelectedNotes$1 = this;
            xVar = (x) this.f8473r;
            folderViewModel = folderViewModel3;
            it = it3;
            j2 = this.f8475t;
            if (it.hasNext()) {
            }
        }
    }
}
