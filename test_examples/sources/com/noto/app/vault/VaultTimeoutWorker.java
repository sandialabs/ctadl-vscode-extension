package com.noto.app.vault;

import android.app.NotificationManager;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import db.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.b;
import m7.e;
import p7.c;
import v7.g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/noto/app/vault/VaultTimeoutWorker;", "Landroidx/work/CoroutineWorker;", "Ldb/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultTimeoutWorker extends CoroutineWorker implements db.a {

    /* renamed from: p  reason: collision with root package name */
    public final NotificationManager f9933p;

    /* renamed from: q  reason: collision with root package name */
    public final e f9934q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultTimeoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.f(context, "context");
        g.f(workerParameters, "params");
        Object systemService = context.getSystemService("notification");
        g.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f9933p = (NotificationManager) systemService;
        this.f9934q = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new VaultTimeoutWorker$special$$inlined$inject$default$1(this));
    }

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(c<? super d.a> cVar) {
        VaultTimeoutWorker$doWork$1 vaultTimeoutWorker$doWork$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        VaultTimeoutWorker vaultTimeoutWorker;
        VaultTimeoutWorker vaultTimeoutWorker2;
        if (cVar instanceof VaultTimeoutWorker$doWork$1) {
            vaultTimeoutWorker$doWork$1 = (VaultTimeoutWorker$doWork$1) cVar;
            int i11 = vaultTimeoutWorker$doWork$1.f9938o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vaultTimeoutWorker$doWork$1.f9938o = i11 - Integer.MIN_VALUE;
                Object obj = vaultTimeoutWorker$doWork$1.f9937m;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = vaultTimeoutWorker$doWork$1.f9938o;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            vaultTimeoutWorker2 = vaultTimeoutWorker$doWork$1.f9936l;
                            b.n1(obj);
                            NotificationManager notificationManager = vaultTimeoutWorker2.f9933p;
                            g.f(notificationManager, "<this>");
                            notificationManager.cancel(-1);
                            return new d.a.c();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vaultTimeoutWorker = vaultTimeoutWorker$doWork$1.f9936l;
                    b.n1(obj);
                } else {
                    b.n1(obj);
                    vaultTimeoutWorker$doWork$1.f9936l = this;
                    vaultTimeoutWorker$doWork$1.f9938o = 1;
                    if (((u6.e) this.f9934q.getValue()).J(false, vaultTimeoutWorker$doWork$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vaultTimeoutWorker = this;
                }
                vaultTimeoutWorker$doWork$1.f9936l = vaultTimeoutWorker;
                vaultTimeoutWorker$doWork$1.f9938o = 2;
                if (((u6.e) vaultTimeoutWorker.f9934q.getValue()).B(null, vaultTimeoutWorker$doWork$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                vaultTimeoutWorker2 = vaultTimeoutWorker;
                NotificationManager notificationManager2 = vaultTimeoutWorker2.f9933p;
                g.f(notificationManager2, "<this>");
                notificationManager2.cancel(-1);
                return new d.a.c();
            }
        }
        vaultTimeoutWorker$doWork$1 = new VaultTimeoutWorker$doWork$1(this, cVar);
        Object obj2 = vaultTimeoutWorker$doWork$1.f9937m;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = vaultTimeoutWorker$doWork$1.f9938o;
        if (i10 == 0) {
        }
        vaultTimeoutWorker$doWork$1.f9936l = vaultTimeoutWorker;
        vaultTimeoutWorker$doWork$1.f9938o = 2;
        if (((u6.e) vaultTimeoutWorker.f9934q.getValue()).B(null, vaultTimeoutWorker$doWork$1) != coroutineSingletons) {
        }
    }
}
