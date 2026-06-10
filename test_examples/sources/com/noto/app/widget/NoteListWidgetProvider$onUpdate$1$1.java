package com.noto.app.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import f7.f;
import f7.h;
import f7.q;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import ma.i;
import q7.c;
import t6.d;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetProvider$onUpdate$1$1", f = "NoteListWidgetProvider.kt", l = {28, 31, 32, 33, 34, 35, 36, 37, 38}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetProvider$onUpdate$1$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {
    public final /* synthetic */ AppWidgetManager A;

    /* renamed from: m  reason: collision with root package name */
    public long f10131m;
    public Context n;

    /* renamed from: o  reason: collision with root package name */
    public t6.a f10132o;

    /* renamed from: p  reason: collision with root package name */
    public int f10133p;

    /* renamed from: q  reason: collision with root package name */
    public int f10134q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10135r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10136s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10137t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10138u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10139v;

    /* renamed from: w  reason: collision with root package name */
    public int f10140w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetProvider f10141x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f10142y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f10143z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetProvider$onUpdate$1$1(NoteListWidgetProvider noteListWidgetProvider, int i10, Context context, AppWidgetManager appWidgetManager, p7.c<? super NoteListWidgetProvider$onUpdate$1$1> cVar) {
        super(2, cVar);
        this.f10141x = noteListWidgetProvider;
        this.f10142y = i10;
        this.f10143z = context;
        this.A = appWidgetManager;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteListWidgetProvider$onUpdate$1$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteListWidgetProvider$onUpdate$1$1(this.f10141x, this.f10142y, this.f10143z, this.A, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0214 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0240 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0410  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object a10;
        Context context;
        int i10;
        RemoteViews remoteViews;
        Object a11;
        long j2;
        int i11;
        Object a12;
        Context context2;
        boolean z10;
        Object a13;
        boolean z11;
        Context context3;
        int i12;
        boolean z12;
        Object a14;
        Context context4;
        boolean z13;
        Object a15;
        Context context5;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        boolean z17;
        int i13;
        int intValue;
        Object a16;
        t6.a aVar;
        Object a17;
        Context context6;
        Object a18;
        boolean z18;
        AppWidgetManager appWidgetManager;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int d5;
        int i21;
        int i22;
        int i23;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i24 = this.f10140w;
        int i25 = this.f10142y;
        NoteListWidgetProvider noteListWidgetProvider = this.f10141x;
        switch (i24) {
            case 0:
                b.n1(obj);
                final kotlinx.coroutines.flow.b<Long> L = NoteListWidgetProvider.b(noteListWidgetProvider).L(i25);
                kotlinx.coroutines.flow.b<Long> bVar = new kotlinx.coroutines.flow.b<Long>() { // from class: com.noto.app.widget.NoteListWidgetProvider$onUpdate$1$1$invokeSuspend$$inlined$filter$1

                    /* renamed from: com.noto.app.widget.NoteListWidgetProvider$onUpdate$1$1$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                        /* renamed from: i  reason: collision with root package name */
                        public final /* synthetic */ kotlinx.coroutines.flow.c f10125i;

                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                        @c(c = "com.noto.app.widget.NoteListWidgetProvider$onUpdate$1$1$invokeSuspend$$inlined$filter$1$2", f = "NoteListWidgetProvider.kt", l = {223}, m = "emit")
                        /* renamed from: com.noto.app.widget.NoteListWidgetProvider$onUpdate$1$1$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                        /* loaded from: classes.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: l  reason: collision with root package name */
                            public /* synthetic */ Object f10126l;

                            /* renamed from: m  reason: collision with root package name */
                            public int f10127m;

                            public AnonymousClass1(p7.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object k(Object obj) {
                                this.f10126l = obj;
                                this.f10127m |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.c(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                            this.f10125i = cVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                        @Override // kotlinx.coroutines.flow.c
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object c(Object obj, p7.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.f10127m;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f10127m = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.f10126l;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i10 = anonymousClass1.f10127m;
                                    if (i10 != 0) {
                                        b.n1(obj2);
                                        if (((Number) obj).longValue() != 0) {
                                            anonymousClass1.f10127m = 1;
                                            if (this.f10125i.c(obj, anonymousClass1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        }
                                    } else if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    } else {
                                        b.n1(obj2);
                                    }
                                    return n.f16010a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.f10126l;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f10127m;
                            if (i10 != 0) {
                            }
                            return n.f16010a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.b
                    public final Object a(kotlinx.coroutines.flow.c<? super Long> cVar, p7.c cVar2) {
                        Object a19 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar), cVar2);
                        return a19 == CoroutineSingletons.COROUTINE_SUSPENDED ? a19 : n.f16010a;
                    }
                };
                this.f10140w = 1;
                a10 = FlowKt__ReduceKt.a(bVar, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                long longValue = ((Number) a10).longValue();
                context = this.f10143z;
                if (context == null) {
                    kotlinx.coroutines.flow.b<Boolean> l2 = NoteListWidgetProvider.b(noteListWidgetProvider).l(i25);
                    this.n = context;
                    this.f10131m = longValue;
                    this.f10133p = i25;
                    this.f10140w = 2;
                    a11 = FlowKt__ReduceKt.a(l2, this);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j2 = longValue;
                    i11 = i25;
                    boolean booleanValue = ((Boolean) a11).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> Z = NoteListWidgetProvider.b(noteListWidgetProvider).Z(i25);
                    this.n = context;
                    this.f10131m = j2;
                    this.f10133p = i11;
                    this.f10135r = booleanValue;
                    this.f10140w = 3;
                    a12 = FlowKt__ReduceKt.a(Z, this);
                    if (a12 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context2 = context;
                    z10 = booleanValue;
                    boolean booleanValue2 = ((Boolean) a12).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> H = NoteListWidgetProvider.b(noteListWidgetProvider).H(i25);
                    this.n = context2;
                    this.f10131m = j2;
                    this.f10133p = i11;
                    this.f10135r = z10;
                    this.f10136s = booleanValue2;
                    this.f10140w = 4;
                    a13 = FlowKt__ReduceKt.a(H, this);
                    if (a13 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Context context7 = context2;
                    z11 = z10;
                    context3 = context7;
                    i12 = i11;
                    z12 = booleanValue2;
                    boolean booleanValue3 = ((Boolean) a13).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> b5 = NoteListWidgetProvider.b(noteListWidgetProvider).b(i25);
                    this.n = context3;
                    this.f10131m = j2;
                    this.f10133p = i12;
                    this.f10135r = z11;
                    this.f10136s = z12;
                    this.f10137t = booleanValue3;
                    this.f10140w = 5;
                    a14 = FlowKt__ReduceKt.a(b5, this);
                    if (a14 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context4 = context3;
                    z13 = booleanValue3;
                    boolean booleanValue4 = ((Boolean) a14).booleanValue();
                    kotlinx.coroutines.flow.b<Integer> k3 = NoteListWidgetProvider.b(noteListWidgetProvider).k(i25);
                    this.n = context4;
                    this.f10131m = j2;
                    this.f10133p = i12;
                    this.f10135r = z11;
                    this.f10136s = z12;
                    this.f10137t = z13;
                    this.f10138u = booleanValue4;
                    this.f10140w = 6;
                    a15 = FlowKt__ReduceKt.a(k3, this);
                    if (a15 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context5 = context4;
                    boolean z19 = z11;
                    z14 = z13;
                    int i26 = i12;
                    z15 = z12;
                    z16 = booleanValue4;
                    j10 = j2;
                    z17 = z19;
                    i13 = i26;
                    intValue = ((Number) a15).intValue();
                    kotlinx.coroutines.flow.b<t6.a> d10 = ((u6.a) noteListWidgetProvider.f10121i.getValue()).d(j10);
                    this.n = context5;
                    this.f10131m = j10;
                    this.f10133p = i13;
                    this.f10135r = z17;
                    this.f10136s = z15;
                    this.f10137t = z14;
                    this.f10138u = z16;
                    this.f10134q = intValue;
                    this.f10140w = 7;
                    a16 = FlowKt__ReduceKt.a(d10, this);
                    if (a16 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = (t6.a) a16;
                    kotlinx.coroutines.flow.b<List<d>> d11 = ((u6.d) noteListWidgetProvider.f10122j.getValue()).d(j10);
                    this.n = context5;
                    this.f10132o = aVar;
                    this.f10133p = i13;
                    this.f10135r = z17;
                    this.f10136s = z15;
                    this.f10137t = z14;
                    this.f10138u = z16;
                    this.f10134q = intValue;
                    this.f10140w = 8;
                    a17 = FlowKt__ReduceKt.a(d11, this);
                    if (a17 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context6 = context5;
                    boolean isEmpty = ((List) a17).isEmpty();
                    kotlinx.coroutines.flow.b<Icon> icon = NoteListWidgetProvider.b(noteListWidgetProvider).getIcon();
                    this.n = context6;
                    this.f10132o = aVar;
                    this.f10133p = i13;
                    this.f10135r = z17;
                    this.f10136s = z15;
                    this.f10137t = z14;
                    this.f10138u = z16;
                    this.f10134q = intValue;
                    this.f10139v = isEmpty;
                    this.f10140w = 9;
                    a18 = FlowKt__ReduceKt.a(icon, this);
                    if (a18 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z18 = isEmpty;
                    Icon icon2 = (Icon) a18;
                    g.f(context6, "<this>");
                    g.f(aVar, "folder");
                    g.f(icon2, "icon");
                    int b10 = q.b(context6, q.j(aVar.f17595e));
                    RemoteViews remoteViews2 = new RemoteViews(context6.getPackageName(), (int) R.layout.note_list_widget);
                    remoteViews2.setTextViewText(R.id.tv_folder_title, ModelUtilsKt.o(context6, aVar));
                    remoteViews2.setTextColor(R.id.tv_folder_title, b10);
                    if (!z17) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.ll_header, i14);
                    if (!z15) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.iv_edit_widget, i15);
                    if (!z14) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.iv_app_icon, i16);
                    if (!z16) {
                        i17 = 0;
                    } else {
                        i17 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.fab, i17);
                    if (!z16) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.fab, i18);
                    if (!z18) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.tv_placeholder, i19);
                    if (!z18) {
                        i20 = 8;
                    } else {
                        i20 = 0;
                    }
                    remoteViews2.setViewVisibility(R.id.lv, i20);
                    Intent intent = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE", null, context6, NoteListWidgetConfigActivity.class);
                    intent.putExtra("appWidgetId", i13);
                    long j11 = aVar.f17592a;
                    intent.putExtra("folder_id", j11);
                    intent.setData(Uri.parse(intent.toUri(1)));
                    int i27 = h.f10949a;
                    remoteViews2.setOnClickPendingIntent(R.id.iv_edit_widget, PendingIntent.getActivity(context6, i13, intent, i27));
                    i10 = i25;
                    Intent intent2 = new Intent("com.noto.intent.action.CREATE_NOTE", (Uri) null);
                    intent2.setComponent(f.d(context6));
                    intent2.putExtra("folder_id", j11);
                    remoteViews2.setOnClickPendingIntent(R.id.ib_fab, PendingIntent.getActivity(context6, i13, intent2, i27));
                    remoteViews2.setOnClickPendingIntent(R.id.iv_app_icon, a1.c.q0(context6, i13));
                    Intent intent3 = new Intent("com.noto.intent.action.OPEN_FOLDER", (Uri) null);
                    intent3.setComponent(f.d(context6));
                    intent3.putExtra("folder_id", j11);
                    remoteViews2.setOnClickPendingIntent(R.id.tv_folder_title, PendingIntent.getActivity(context6, i13, intent3, i27));
                    Intent intent4 = new Intent(context6, NoteListWidgetService.class);
                    intent4.putExtra("appWidgetId", i13);
                    intent4.putExtra("folder_id", j11);
                    intent4.setData(Uri.parse(intent4.toUri(1)));
                    remoteViews2.setRemoteAdapter(R.id.lv, intent4);
                    Intent intent5 = new Intent("com.noto.intent.action.OPEN_NOTE", (Uri) null);
                    intent5.setComponent(f.d(context6));
                    intent5.putExtra("appWidgetId", i13);
                    intent5.setData(Uri.parse(intent5.toUri(1)));
                    remoteViews2.setPendingIntentTemplate(R.id.lv, PendingIntent.getActivity(context6, i13, intent5, h.f10950b));
                    remoteViews2.setInt(R.id.ll, "setBackgroundResource", a1.c.Q1(intValue));
                    remoteViews2.setInt(R.id.ll_header, "setBackgroundResource", a1.c.P1(intValue));
                    remoteViews2.setInt(R.id.iv_fab, "setColorFilter", b10);
                    remoteViews2.setInt(R.id.iv_app_icon, "setImageResource", q.i(icon2));
                    if (!z14) {
                        int d12 = q.d(0);
                        int d13 = q.d(16);
                        int d14 = q.d(0);
                        d5 = q.d(16);
                        i23 = d14;
                        i21 = d12;
                        i22 = d13;
                    } else {
                        int d15 = q.d(16);
                        int d16 = q.d(16);
                        int d17 = q.d(16);
                        d5 = q.d(16);
                        i21 = d15;
                        i22 = d16;
                        i23 = d17;
                    }
                    remoteViews2.setViewPadding(R.id.tv_folder_title, i21, i22, i23, d5);
                    remoteViews = remoteViews2;
                    appWidgetManager = this.A;
                    if (appWidgetManager != null) {
                        appWidgetManager.updateAppWidget(i10, remoteViews);
                    }
                    return n.f16010a;
                }
                i10 = i25;
                remoteViews = null;
                appWidgetManager = this.A;
                if (appWidgetManager != null) {
                }
                return n.f16010a;
            case 1:
                b.n1(obj);
                a10 = obj;
                long longValue2 = ((Number) a10).longValue();
                context = this.f10143z;
                if (context == null) {
                }
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                int i28 = this.f10133p;
                long j12 = this.f10131m;
                Context context8 = this.n;
                b.n1(obj);
                j2 = j12;
                i11 = i28;
                context = context8;
                a11 = obj;
                boolean booleanValue5 = ((Boolean) a11).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> Z2 = NoteListWidgetProvider.b(noteListWidgetProvider).Z(i25);
                this.n = context;
                this.f10131m = j2;
                this.f10133p = i11;
                this.f10135r = booleanValue5;
                this.f10140w = 3;
                a12 = FlowKt__ReduceKt.a(Z2, this);
                if (a12 != coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                z10 = this.f10135r;
                i11 = this.f10133p;
                long j13 = this.f10131m;
                Context context9 = this.n;
                b.n1(obj);
                a12 = obj;
                context2 = context9;
                j2 = j13;
                boolean booleanValue22 = ((Boolean) a12).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> H2 = NoteListWidgetProvider.b(noteListWidgetProvider).H(i25);
                this.n = context2;
                this.f10131m = j2;
                this.f10133p = i11;
                this.f10135r = z10;
                this.f10136s = booleanValue22;
                this.f10140w = 4;
                a13 = FlowKt__ReduceKt.a(H2, this);
                if (a13 != coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                boolean z20 = this.f10136s;
                boolean z21 = this.f10135r;
                int i29 = this.f10133p;
                long j14 = this.f10131m;
                Context context10 = this.n;
                b.n1(obj);
                a13 = obj;
                z12 = z20;
                context3 = context10;
                j2 = j14;
                i12 = i29;
                z11 = z21;
                boolean booleanValue32 = ((Boolean) a13).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> b52 = NoteListWidgetProvider.b(noteListWidgetProvider).b(i25);
                this.n = context3;
                this.f10131m = j2;
                this.f10133p = i12;
                this.f10135r = z11;
                this.f10136s = z12;
                this.f10137t = booleanValue32;
                this.f10140w = 5;
                a14 = FlowKt__ReduceKt.a(b52, this);
                if (a14 != coroutineSingletons) {
                }
                break;
            case 5:
                z13 = this.f10137t;
                z12 = this.f10136s;
                z11 = this.f10135r;
                i12 = this.f10133p;
                j2 = this.f10131m;
                context4 = this.n;
                b.n1(obj);
                a14 = obj;
                boolean booleanValue42 = ((Boolean) a14).booleanValue();
                kotlinx.coroutines.flow.b<Integer> k32 = NoteListWidgetProvider.b(noteListWidgetProvider).k(i25);
                this.n = context4;
                this.f10131m = j2;
                this.f10133p = i12;
                this.f10135r = z11;
                this.f10136s = z12;
                this.f10137t = z13;
                this.f10138u = booleanValue42;
                this.f10140w = 6;
                a15 = FlowKt__ReduceKt.a(k32, this);
                if (a15 != coroutineSingletons) {
                }
                break;
            case 6:
                boolean z22 = this.f10138u;
                boolean z23 = this.f10137t;
                boolean z24 = this.f10136s;
                boolean z25 = this.f10135r;
                int i30 = this.f10133p;
                long j15 = this.f10131m;
                Context context11 = this.n;
                b.n1(obj);
                a15 = obj;
                context5 = context11;
                j10 = j15;
                i13 = i30;
                z17 = z25;
                z15 = z24;
                z14 = z23;
                z16 = z22;
                intValue = ((Number) a15).intValue();
                kotlinx.coroutines.flow.b<t6.a> d102 = ((u6.a) noteListWidgetProvider.f10121i.getValue()).d(j10);
                this.n = context5;
                this.f10131m = j10;
                this.f10133p = i13;
                this.f10135r = z17;
                this.f10136s = z15;
                this.f10137t = z14;
                this.f10138u = z16;
                this.f10134q = intValue;
                this.f10140w = 7;
                a16 = FlowKt__ReduceKt.a(d102, this);
                if (a16 == coroutineSingletons) {
                }
                aVar = (t6.a) a16;
                kotlinx.coroutines.flow.b<List<d>> d112 = ((u6.d) noteListWidgetProvider.f10122j.getValue()).d(j10);
                this.n = context5;
                this.f10132o = aVar;
                this.f10133p = i13;
                this.f10135r = z17;
                this.f10136s = z15;
                this.f10137t = z14;
                this.f10138u = z16;
                this.f10134q = intValue;
                this.f10140w = 8;
                a17 = FlowKt__ReduceKt.a(d112, this);
                if (a17 == coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                intValue = this.f10134q;
                z16 = this.f10138u;
                z14 = this.f10137t;
                z15 = this.f10136s;
                z17 = this.f10135r;
                i13 = this.f10133p;
                j10 = this.f10131m;
                context5 = this.n;
                b.n1(obj);
                a16 = obj;
                aVar = (t6.a) a16;
                kotlinx.coroutines.flow.b<List<d>> d1122 = ((u6.d) noteListWidgetProvider.f10122j.getValue()).d(j10);
                this.n = context5;
                this.f10132o = aVar;
                this.f10133p = i13;
                this.f10135r = z17;
                this.f10136s = z15;
                this.f10137t = z14;
                this.f10138u = z16;
                this.f10134q = intValue;
                this.f10140w = 8;
                a17 = FlowKt__ReduceKt.a(d1122, this);
                if (a17 == coroutineSingletons) {
                }
                break;
            case 8:
                intValue = this.f10134q;
                z16 = this.f10138u;
                z14 = this.f10137t;
                z15 = this.f10136s;
                z17 = this.f10135r;
                i13 = this.f10133p;
                t6.a aVar2 = this.f10132o;
                Context context12 = this.n;
                b.n1(obj);
                a17 = obj;
                aVar = aVar2;
                context6 = context12;
                boolean isEmpty2 = ((List) a17).isEmpty();
                kotlinx.coroutines.flow.b<Icon> icon3 = NoteListWidgetProvider.b(noteListWidgetProvider).getIcon();
                this.n = context6;
                this.f10132o = aVar;
                this.f10133p = i13;
                this.f10135r = z17;
                this.f10136s = z15;
                this.f10137t = z14;
                this.f10138u = z16;
                this.f10134q = intValue;
                this.f10139v = isEmpty2;
                this.f10140w = 9;
                a18 = FlowKt__ReduceKt.a(icon3, this);
                if (a18 != coroutineSingletons) {
                }
                break;
            case i.f16046m /* 9 */:
                z18 = this.f10139v;
                intValue = this.f10134q;
                boolean z26 = this.f10138u;
                boolean z27 = this.f10137t;
                boolean z28 = this.f10136s;
                boolean z29 = this.f10135r;
                int i31 = this.f10133p;
                t6.a aVar3 = this.f10132o;
                context6 = this.n;
                b.n1(obj);
                aVar = aVar3;
                i13 = i31;
                z17 = z29;
                z15 = z28;
                z14 = z27;
                z16 = z26;
                a18 = obj;
                Icon icon22 = (Icon) a18;
                g.f(context6, "<this>");
                g.f(aVar, "folder");
                g.f(icon22, "icon");
                int b102 = q.b(context6, q.j(aVar.f17595e));
                RemoteViews remoteViews22 = new RemoteViews(context6.getPackageName(), (int) R.layout.note_list_widget);
                remoteViews22.setTextViewText(R.id.tv_folder_title, ModelUtilsKt.o(context6, aVar));
                remoteViews22.setTextColor(R.id.tv_folder_title, b102);
                if (!z17) {
                }
                remoteViews22.setViewVisibility(R.id.ll_header, i14);
                if (!z15) {
                }
                remoteViews22.setViewVisibility(R.id.iv_edit_widget, i15);
                if (!z14) {
                }
                remoteViews22.setViewVisibility(R.id.iv_app_icon, i16);
                if (!z16) {
                }
                remoteViews22.setViewVisibility(R.id.fab, i17);
                if (!z16) {
                }
                remoteViews22.setViewVisibility(R.id.fab, i18);
                if (!z18) {
                }
                remoteViews22.setViewVisibility(R.id.tv_placeholder, i19);
                if (!z18) {
                }
                remoteViews22.setViewVisibility(R.id.lv, i20);
                Intent intent6 = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE", null, context6, NoteListWidgetConfigActivity.class);
                intent6.putExtra("appWidgetId", i13);
                long j112 = aVar.f17592a;
                intent6.putExtra("folder_id", j112);
                intent6.setData(Uri.parse(intent6.toUri(1)));
                int i272 = h.f10949a;
                remoteViews22.setOnClickPendingIntent(R.id.iv_edit_widget, PendingIntent.getActivity(context6, i13, intent6, i272));
                i10 = i25;
                Intent intent22 = new Intent("com.noto.intent.action.CREATE_NOTE", (Uri) null);
                intent22.setComponent(f.d(context6));
                intent22.putExtra("folder_id", j112);
                remoteViews22.setOnClickPendingIntent(R.id.ib_fab, PendingIntent.getActivity(context6, i13, intent22, i272));
                remoteViews22.setOnClickPendingIntent(R.id.iv_app_icon, a1.c.q0(context6, i13));
                Intent intent32 = new Intent("com.noto.intent.action.OPEN_FOLDER", (Uri) null);
                intent32.setComponent(f.d(context6));
                intent32.putExtra("folder_id", j112);
                remoteViews22.setOnClickPendingIntent(R.id.tv_folder_title, PendingIntent.getActivity(context6, i13, intent32, i272));
                Intent intent42 = new Intent(context6, NoteListWidgetService.class);
                intent42.putExtra("appWidgetId", i13);
                intent42.putExtra("folder_id", j112);
                intent42.setData(Uri.parse(intent42.toUri(1)));
                remoteViews22.setRemoteAdapter(R.id.lv, intent42);
                Intent intent52 = new Intent("com.noto.intent.action.OPEN_NOTE", (Uri) null);
                intent52.setComponent(f.d(context6));
                intent52.putExtra("appWidgetId", i13);
                intent52.setData(Uri.parse(intent52.toUri(1)));
                remoteViews22.setPendingIntentTemplate(R.id.lv, PendingIntent.getActivity(context6, i13, intent52, h.f10950b));
                remoteViews22.setInt(R.id.ll, "setBackgroundResource", a1.c.Q1(intValue));
                remoteViews22.setInt(R.id.ll_header, "setBackgroundResource", a1.c.P1(intValue));
                remoteViews22.setInt(R.id.iv_fab, "setColorFilter", b102);
                remoteViews22.setInt(R.id.iv_app_icon, "setImageResource", q.i(icon22));
                if (!z14) {
                }
                remoteViews22.setViewPadding(R.id.tv_folder_title, i21, i22, i23, d5);
                remoteViews = remoteViews22;
                appWidgetManager = this.A;
                if (appWidgetManager != null) {
                }
                return n.f16010a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
