package com.noto.app.note;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReminderReceiver$onReceive$1$1", f = "NoteReminderReceiver.kt", l = {34, 36, 38, 42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteReminderReceiver$onReceive$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public t6.a f9195m;
    public t6.d n;

    /* renamed from: o  reason: collision with root package name */
    public int f9196o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteReminderReceiver f9197p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f9198q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f9199r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Context f9200s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ NotificationManager f9201t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReminderReceiver$onReceive$1$1(NoteReminderReceiver noteReminderReceiver, long j2, long j10, Context context, NotificationManager notificationManager, p7.c<? super NoteReminderReceiver$onReceive$1$1> cVar) {
        super(2, cVar);
        this.f9197p = noteReminderReceiver;
        this.f9198q = j2;
        this.f9199r = j10;
        this.f9200s = context;
        this.f9201t = notificationManager;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteReminderReceiver$onReceive$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteReminderReceiver$onReceive$1$1(this.f9197p, this.f9198q, this.f9199r, this.f9200s, this.f9201t, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object c;
        t6.a aVar;
        Object c10;
        Object c11;
        t6.d dVar;
        Context context;
        NotificationManager notificationManager;
        t6.d a10;
        String str;
        String str2;
        String str3;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f9196o;
        NoteReminderReceiver noteReminderReceiver = this.f9197p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            m0.b.n1(obj);
                            return m7.n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t6.d dVar2 = this.n;
                    t6.a aVar2 = this.f9195m;
                    m0.b.n1(obj);
                    dVar = dVar2;
                    aVar = aVar2;
                    c11 = obj;
                    Icon icon = (Icon) c11;
                    if (dVar != null && aVar != null && (context = this.f9200s) != null) {
                        notificationManager = this.f9201t;
                        if (notificationManager != null) {
                            long j2 = dVar.f17621a;
                            PendingIntent b5 = f7.p.b(context, j2, dVar.f17622b);
                            m2.n nVar = new m2.n();
                            String str4 = dVar.f17623d;
                            boolean T0 = ha.i.T0(str4);
                            String str5 = dVar.c;
                            if (T0) {
                                str = str5;
                            } else {
                                str = str4;
                            }
                            nVar.f15936b = m2.o.b(str);
                            m2.o oVar = new m2.o(context, "Reminders");
                            if (ha.i.T0(str5)) {
                                str2 = str4;
                            } else {
                                str2 = str5;
                            }
                            oVar.f15940e = m2.o.b(str2);
                            if (ha.i.T0(str4)) {
                                str4 = str5;
                            }
                            oVar.f15941f = m2.o.b(str4);
                            oVar.f15942g = b5;
                            oVar.f15946k = m2.o.b(ModelUtilsKt.o(context, aVar));
                            oVar.d(nVar);
                            oVar.f15952r = q.b(context, q.j(aVar.f17595e));
                            oVar.n = true;
                            oVar.f15949o = true;
                            if (Build.VERSION.SDK_INT >= 23) {
                                str3 = "reminder";
                            } else {
                                str3 = null;
                            }
                            oVar.f15950p = str3;
                            if (icon != null) {
                                i10 = q.i(icon);
                            } else {
                                i10 = R.mipmap.ic_launcher_futuristic;
                            }
                            oVar.f15956v.icon = i10;
                            oVar.f15943h = 1;
                            oVar.c(16);
                            oVar.f15947l = ModelUtilsKt.o(context, aVar);
                            oVar.f15948m = true;
                            Notification a11 = oVar.a();
                            v7.g.e(a11, "Builder(context, Reminde…ry(true)\n        .build()");
                            notificationManager.notify(ModelUtilsKt.o(context, aVar), (int) j2, a11);
                        }
                        a10 = t6.d.a(dVar, 0L, 0L, null, null, 0, false, false, null, null, 0, 3839);
                        this.f9195m = null;
                        this.n = null;
                        this.f9196o = 4;
                        if (((u6.d) noteReminderReceiver.f9190j.getValue()).c(a10, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return m7.n.f16010a;
                }
                aVar = this.f9195m;
                m0.b.n1(obj);
                c10 = obj;
                t6.d dVar3 = (t6.d) c10;
                kotlinx.coroutines.flow.b<Icon> icon2 = ((u6.e) noteReminderReceiver.f9191k.getValue()).getIcon();
                this.f9195m = aVar;
                this.n = dVar3;
                this.f9196o = 3;
                c11 = FlowKt__ReduceKt.c(icon2, this);
                if (c11 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar3;
                Icon icon3 = (Icon) c11;
                if (dVar != null) {
                    notificationManager = this.f9201t;
                    if (notificationManager != null) {
                    }
                    a10 = t6.d.a(dVar, 0L, 0L, null, null, 0, false, false, null, null, 0, 3839);
                    this.f9195m = null;
                    this.n = null;
                    this.f9196o = 4;
                    if (((u6.d) noteReminderReceiver.f9190j.getValue()).c(a10, this) == coroutineSingletons) {
                    }
                }
                return m7.n.f16010a;
            }
            m0.b.n1(obj);
            c = obj;
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.b<t6.a> d5 = ((u6.a) noteReminderReceiver.f9189i.getValue()).d(this.f9198q);
            this.f9196o = 1;
            c = FlowKt__ReduceKt.c(d5, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        aVar = (t6.a) c;
        kotlinx.coroutines.flow.b<t6.d> f10 = ((u6.d) noteReminderReceiver.f9190j.getValue()).f(this.f9199r);
        this.f9195m = aVar;
        this.f9196o = 2;
        c10 = FlowKt__ReduceKt.c(f10, this);
        if (c10 == coroutineSingletons) {
            return coroutineSingletons;
        }
        t6.d dVar32 = (t6.d) c10;
        kotlinx.coroutines.flow.b<Icon> icon22 = ((u6.e) noteReminderReceiver.f9191k.getValue()).getIcon();
        this.f9195m = aVar;
        this.n = dVar32;
        this.f9196o = 3;
        c11 = FlowKt__ReduceKt.c(icon22, this);
        if (c11 != coroutineSingletons) {
        }
    }
}
