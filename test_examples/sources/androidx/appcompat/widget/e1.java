package androidx.appcompat.widget;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.d;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.folder.FolderFragment;
import java.lang.reflect.Method;
import kotlin.collections.EmptyList;
import m2.f;
import n4.g;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f917i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f918j;

    public /* synthetic */ e1(int i10, Object obj) {
        this.f917i = i10;
        this.f918j = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        boolean z10;
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f918j;
        v7.g.f(constraintTrackingWorker, "this$0");
        if (!(constraintTrackingWorker.f6329p.f6306i instanceof AbstractFuture.b)) {
            Object obj = constraintTrackingWorker.f6219j.f6200b.f6214a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            n4.g d5 = n4.g.d();
            v7.g.e(d5, "get()");
            if (str != null && str.length() != 0) {
                z10 = false;
                if (!z10) {
                    d5.b(z4.a.f19117a, "No worker to delegate to.");
                } else {
                    androidx.work.d a10 = constraintTrackingWorker.f6219j.f6202e.a(constraintTrackingWorker.f6218i, str, constraintTrackingWorker.f6327m);
                    constraintTrackingWorker.f6330q = a10;
                    if (a10 == null) {
                        d5.a(z4.a.f19117a, "No worker to delegate to.");
                    } else {
                        o4.a0 d10 = o4.a0.d(constraintTrackingWorker.f6218i);
                        v7.g.e(d10, "getInstance(applicationContext)");
                        w4.t w10 = d10.c.w();
                        String uuid = constraintTrackingWorker.f6219j.f6199a.toString();
                        v7.g.e(uuid, "id.toString()");
                        w4.s l2 = w10.l(uuid);
                        if (l2 != null) {
                            u4.o oVar = d10.f16288j;
                            v7.g.e(oVar, "workManagerImpl.trackers");
                            s4.d dVar = new s4.d(oVar, constraintTrackingWorker);
                            dVar.d(a1.c.N0(l2));
                            String uuid2 = constraintTrackingWorker.f6219j.f6199a.toString();
                            v7.g.e(uuid2, "id.toString()");
                            if (dVar.c(uuid2)) {
                                String str2 = z4.a.f19117a;
                                d5.a(str2, "Constraints met for delegate " + str);
                                try {
                                    androidx.work.d dVar2 = constraintTrackingWorker.f6330q;
                                    v7.g.c(dVar2);
                                    androidx.work.impl.utils.futures.a g10 = dVar2.g();
                                    v7.g.e(g10, "delegate!!.startWork()");
                                    g10.a(new androidx.biometric.f(constraintTrackingWorker, 2, g10), constraintTrackingWorker.f6219j.c);
                                    return;
                                } catch (Throwable th) {
                                    String str3 = z4.a.f19117a;
                                    String m10 = a4.b.m("Delegated worker ", str, " threw exception in startWork.");
                                    if (((g.a) d5).c <= 3) {
                                        Log.d(str3, m10, th);
                                    }
                                    synchronized (constraintTrackingWorker.n) {
                                        if (constraintTrackingWorker.f6328o) {
                                            d5.a(str3, "Constraints were unmet, Retrying.");
                                            androidx.work.impl.utils.futures.a<d.a> aVar = constraintTrackingWorker.f6329p;
                                            v7.g.e(aVar, "future");
                                            aVar.i(new d.a.b());
                                        } else {
                                            androidx.work.impl.utils.futures.a<d.a> aVar2 = constraintTrackingWorker.f6329p;
                                            v7.g.e(aVar2, "future");
                                            aVar2.i(new d.a.C0048a());
                                        }
                                        return;
                                    }
                                }
                            }
                            String str4 = z4.a.f19117a;
                            d5.a(str4, "Constraints not met for delegate " + str + ". Requesting retry.");
                            androidx.work.impl.utils.futures.a<d.a> aVar3 = constraintTrackingWorker.f6329p;
                            v7.g.e(aVar3, "future");
                            aVar3.i(new d.a.b());
                            return;
                        }
                    }
                }
                androidx.work.impl.utils.futures.a<d.a> aVar4 = constraintTrackingWorker.f6329p;
                v7.g.e(aVar4, "future");
                String str5 = z4.a.f19117a;
                aVar4.i(new d.a.C0048a());
            }
            z10 = true;
            if (!z10) {
            }
            androidx.work.impl.utils.futures.a<d.a> aVar42 = constraintTrackingWorker.f6329p;
            v7.g.e(aVar42, "future");
            String str52 = z4.a.f19117a;
            aVar42.i(new d.a.C0048a());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:58|(4:62|63|(3:73|74|(7:80|81|82|(3:86|(2:88|89)(1:92)|90)|93|(0)(0)|90))|67)|95|63|(0)|68|73|74|(1:76)(8:77|80|81|82|(3:86|(0)(0)|90)|93|(0)(0)|90)|67) */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156 A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #1 {all -> 0x016c, blocks: (B:63:0x00fc, B:66:0x0105, B:69:0x010e, B:71:0x011c, B:81:0x0159, B:79:0x0130, B:80:0x0156), top: B:99:0x00fc }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        Object obj;
        Object obj2;
        boolean z11;
        boolean z12 = true;
        switch (this.f917i) {
            case 0:
                ((Toolbar) this.f918j).l();
                return;
            case 1:
                androidx.biometric.n nVar = ((androidx.biometric.k) this.f918j).f1203d0;
                if (nVar.f1213e == null) {
                    nVar.f1213e = new androidx.biometric.m();
                }
                nVar.f1213e.getClass();
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                Activity activity = (Activity) this.f918j;
                int i10 = m2.b.f15908b;
                if (!activity.isFinishing()) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        Class<?> cls = m2.f.f15915a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = m2.f.f15915a;
                        if (i11 != 26 && i11 != 27) {
                            z10 = false;
                            Method method = m2.f.f15919f;
                            if ((z10 || method != null) && (m2.f.f15918e != null || m2.f.f15917d != null)) {
                                obj = m2.f.c.get(activity);
                                if (obj != null && (obj2 = m2.f.f15916b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    f.a aVar = new f.a(activity);
                                    application.registerActivityLifecycleCallbacks(aVar);
                                    Handler handler = m2.f.f15920g;
                                    handler.post(new m2.c(aVar, obj));
                                    if (i11 != 26 && i11 != 27) {
                                        z11 = false;
                                        if (!z11) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj2, obj, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new m2.d(application, aVar));
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    handler.post(new m2.d(application, aVar));
                                }
                            }
                            z12 = false;
                        }
                        z10 = true;
                        Method method2 = m2.f.f15919f;
                        if (z10) {
                        }
                        obj = m2.f.c.get(activity);
                        if (obj != null) {
                            Application application2 = activity.getApplication();
                            f.a aVar2 = new f.a(activity);
                            application2.registerActivityLifecycleCallbacks(aVar2);
                            Handler handler2 = m2.f.f15920g;
                            handler2.post(new m2.c(aVar2, obj));
                            if (i11 != 26) {
                                z11 = false;
                                if (!z11) {
                                }
                                handler2.post(new m2.d(application2, aVar2));
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            handler2.post(new m2.d(application2, aVar2));
                        }
                        z12 = false;
                    }
                    if (!z12) {
                        activity.recreate();
                        return;
                    }
                    return;
                }
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                ((l.b) this.f918j).c();
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                a4.b.s(this.f918j);
                v7.g.f(null, "this$0");
                throw null;
            case 5:
                y3.f fVar = (y3.f) this.f918j;
                synchronized (fVar.f18838l) {
                    fVar.f18833g = false;
                    fVar.f18835i.d();
                    m7.n nVar2 = m7.n.f16010a;
                }
                return;
            case 6:
                v7.g.f((y3.i) this.f918j, "this$0");
                EmptyList emptyList = EmptyList.f12981i;
                throw null;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                v7.g.f((y3.k) this.f918j, "this$0");
                throw null;
            case 8:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f918j;
                v7.g.f(coroutineWorker, "this$0");
                if (coroutineWorker.n.f6306i instanceof AbstractFuture.b) {
                    coroutineWorker.f6169m.c(null);
                    return;
                }
                return;
            case ma.i.f16046m /* 9 */:
                androidx.work.impl.background.systemalarm.c.c((androidx.work.impl.background.systemalarm.c) this.f918j);
                return;
            case ma.i.f16047o /* 10 */:
                a();
                return;
            case 11:
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) this.f918j;
                g0.f1 f1Var = EpoxyRecyclerView.f6588a1;
                v7.g.f(epoxyRecyclerView, "this$0");
                if (epoxyRecyclerView.W0) {
                    epoxyRecyclerView.W0 = false;
                    RecyclerView.Adapter<?> adapter = epoxyRecyclerView.getAdapter();
                    if (adapter != null) {
                        epoxyRecyclerView.setLayoutFrozen(false);
                        epoxyRecyclerView.g0(null, true, true);
                        epoxyRecyclerView.W(true);
                        epoxyRecyclerView.requestLayout();
                        epoxyRecyclerView.T0 = null;
                        if (epoxyRecyclerView.W0) {
                            epoxyRecyclerView.removeCallbacks(epoxyRecyclerView.X0);
                            epoxyRecyclerView.W0 = false;
                        }
                        epoxyRecyclerView.o0();
                        epoxyRecyclerView.T0 = adapter;
                    }
                    if (a1.b.i0(epoxyRecyclerView.getContext())) {
                        epoxyRecyclerView.getRecycledViewPool().a();
                        return;
                    }
                    return;
                }
                return;
            case 12:
            default:
                s6.i iVar = (s6.i) this.f918j;
                int i12 = FolderFragment.f8358k0;
                v7.g.f(iVar, "$this_enableSearch");
                iVar.f17371d.requestFocus();
                return;
            case 13:
                s6.e eVar = (s6.e) this.f918j;
                int i13 = FilteredFragment.f8233f0;
                v7.g.f(eVar, "$this_enableSearch");
                eVar.c.requestFocus();
                return;
        }
    }
}
