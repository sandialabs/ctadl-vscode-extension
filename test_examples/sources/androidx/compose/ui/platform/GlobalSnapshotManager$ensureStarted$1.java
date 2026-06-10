package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements u7.p<ja.x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public la.m f3740m;
    public la.e n;

    /* renamed from: o  reason: collision with root package name */
    public int f3741o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ la.c<m7.n> f3742p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(la.c<m7.n> cVar, p7.c<? super GlobalSnapshotManager$ensureStarted$1> cVar2) {
        super(2, cVar2);
        this.f3742p = cVar;
    }

    @Override // u7.p
    public final Object R(ja.x xVar, p7.c<? super m7.n> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.f3742p, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x0077, TryCatch #4 {all -> 0x0077, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x004b, B:27:0x0062, B:29:0x0065, B:20:0x004c, B:22:0x0058), top: B:48:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:48:0x003b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        la.m mVar;
        la.m mVar2;
        la.e it;
        GlobalSnapshotManager$ensureStarted$1 globalSnapshotManager$ensureStarted$1;
        Object a10;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3741o;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    la.e eVar = this.n;
                    la.m mVar3 = this.f3740m;
                    m0.b.n1(obj);
                    mVar = mVar3;
                    la.e eVar2 = eVar;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    GlobalSnapshotManager$ensureStarted$1 globalSnapshotManager$ensureStarted$12 = this;
                    try {
                        if (!((Boolean) obj).booleanValue()) {
                            m7.n nVar = (m7.n) eVar2.next();
                            synchronized (SnapshotKt.c) {
                                Set<p0.w> set = SnapshotKt.f2945i.get().f16588g;
                                if (set != null && (!set.isEmpty())) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                SnapshotKt.a();
                            }
                            globalSnapshotManager$ensureStarted$1 = globalSnapshotManager$ensureStarted$12;
                            coroutineSingletons = coroutineSingletons2;
                            it = eVar2;
                            mVar2 = mVar;
                            globalSnapshotManager$ensureStarted$1.f3740m = mVar2;
                            globalSnapshotManager$ensureStarted$1.n = it;
                            globalSnapshotManager$ensureStarted$1.f3741o = 1;
                            a10 = it.a(globalSnapshotManager$ensureStarted$1);
                            if (a10 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                            globalSnapshotManager$ensureStarted$12 = globalSnapshotManager$ensureStarted$1;
                            obj = a10;
                            mVar = mVar2;
                            eVar2 = it;
                            coroutineSingletons2 = coroutineSingletons3;
                            if (!((Boolean) obj).booleanValue()) {
                                a1.b.t(mVar, null);
                                return m7.n.f16010a;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            a1.b.t(mVar, th);
                            throw th2;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                mVar2 = this.f3742p;
                it = mVar2.iterator();
                globalSnapshotManager$ensureStarted$1 = this;
                globalSnapshotManager$ensureStarted$1.f3740m = mVar2;
                globalSnapshotManager$ensureStarted$1.n = it;
                globalSnapshotManager$ensureStarted$1.f3741o = 1;
                a10 = it.a(globalSnapshotManager$ensureStarted$1);
                if (a10 != coroutineSingletons) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            mVar = mVar2;
        }
    }
}
