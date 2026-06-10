package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderViewModel$deleteFolder$1", f = "FolderViewModel.kt", l = {205, 207}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderViewModel$deleteFolder$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public FolderViewModel f8488m;
    public Iterator n;

    /* renamed from: o  reason: collision with root package name */
    public int f8489o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ FolderViewModel f8490p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$deleteFolder$1(FolderViewModel folderViewModel, p7.c<? super FolderViewModel$deleteFolder$1> cVar) {
        super(2, cVar);
        this.f8490p = folderViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((FolderViewModel$deleteFolder$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new FolderViewModel$deleteFolder$1(this.f8490p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8489o;
        FolderViewModel folderViewModel = this.f8490p;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.n;
                    folderViewModel = this.f8488m;
                    m0.b.n1(obj);
                    while (it.hasNext()) {
                        u6.a aVar = folderViewModel.f8425d;
                        t6.a a10 = t6.a.a((t6.a) ((Pair) it.next()).f12962i, ((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue()).f17593b, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097149);
                        this.f8488m = folderViewModel;
                        this.n = it;
                        this.f8489o = 2;
                        if (aVar.f(a10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return m7.n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            this.f8489o = 1;
            if (folderViewModel.f8425d.b((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        it = ((t6.a) ((kotlinx.coroutines.flow.m) folderViewModel.k()).getValue()).f17610u.iterator();
        while (it.hasNext()) {
        }
        return m7.n.f16010a;
    }
}
