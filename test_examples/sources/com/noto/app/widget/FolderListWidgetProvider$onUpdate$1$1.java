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
import f7.f;
import f7.h;
import f7.q;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetProvider$onUpdate$1$1", f = "FolderListWidgetProvider.kt", l = {27, 28, 29, 30, 31, 32, 33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListWidgetProvider$onUpdate$1$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Context f9988m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f9989o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9990p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9991q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9992r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9993s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9994t;

    /* renamed from: u  reason: collision with root package name */
    public int f9995u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f9996v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f9997w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ FolderListWidgetProvider f9998x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ AppWidgetManager f9999y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetProvider$onUpdate$1$1(Context context, int i10, FolderListWidgetProvider folderListWidgetProvider, AppWidgetManager appWidgetManager, p7.c<? super FolderListWidgetProvider$onUpdate$1$1> cVar) {
        super(2, cVar);
        this.f9996v = context;
        this.f9997w = i10;
        this.f9998x = folderListWidgetProvider;
        this.f9999y = appWidgetManager;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((FolderListWidgetProvider$onUpdate$1$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FolderListWidgetProvider$onUpdate$1$1(this.f9996v, this.f9997w, this.f9998x, this.f9999y, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object a10;
        Context context;
        int i10;
        boolean booleanValue;
        Object a11;
        boolean z10;
        int i11;
        Object a12;
        Context context2;
        boolean z11;
        Object a13;
        boolean z12;
        Context context3;
        boolean z13;
        boolean z14;
        int i12;
        Object a14;
        Context context4;
        boolean z15;
        Object a15;
        boolean z16;
        int i13;
        Context context5;
        int i14;
        boolean z17;
        boolean z18;
        boolean z19;
        Object a16;
        boolean z20;
        AppWidgetManager appWidgetManager;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int d5;
        int d10;
        int d11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i21 = this.f9995u;
        RemoteViews remoteViews = null;
        FolderListWidgetProvider folderListWidgetProvider = this.f9998x;
        int i22 = this.f9997w;
        switch (i21) {
            case 0:
                b.n1(obj);
                Context context6 = this.f9996v;
                if (context6 != null) {
                    kotlinx.coroutines.flow.b<Boolean> l2 = FolderListWidgetProvider.b(folderListWidgetProvider).l(i22);
                    this.f9988m = context6;
                    this.n = i22;
                    this.f9995u = 1;
                    a10 = FlowKt__ReduceKt.a(l2, this);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context = context6;
                    i10 = i22;
                    booleanValue = ((Boolean) a10).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> Z = FolderListWidgetProvider.b(folderListWidgetProvider).Z(i22);
                    this.f9988m = context;
                    this.n = i10;
                    this.f9990p = booleanValue;
                    this.f9995u = 2;
                    a11 = FlowKt__ReduceKt.a(Z, this);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i23 = i10;
                    z10 = booleanValue;
                    Context context7 = context;
                    i11 = i23;
                    boolean booleanValue2 = ((Boolean) a11).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> H = FolderListWidgetProvider.b(folderListWidgetProvider).H(i22);
                    this.f9988m = context7;
                    this.n = i11;
                    this.f9990p = z10;
                    this.f9991q = booleanValue2;
                    this.f9995u = 3;
                    a12 = FlowKt__ReduceKt.a(H, this);
                    if (a12 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context2 = context7;
                    z11 = booleanValue2;
                    boolean booleanValue3 = ((Boolean) a12).booleanValue();
                    kotlinx.coroutines.flow.b<Boolean> b5 = FolderListWidgetProvider.b(folderListWidgetProvider).b(i22);
                    this.f9988m = context2;
                    this.n = i11;
                    this.f9990p = z10;
                    this.f9991q = z11;
                    this.f9992r = booleanValue3;
                    this.f9995u = 4;
                    a13 = FlowKt__ReduceKt.a(b5, this);
                    if (a13 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i24 = i11;
                    z12 = z11;
                    context3 = context2;
                    z13 = z10;
                    z14 = booleanValue3;
                    i12 = i24;
                    boolean booleanValue4 = ((Boolean) a13).booleanValue();
                    kotlinx.coroutines.flow.b<Integer> k3 = FolderListWidgetProvider.b(folderListWidgetProvider).k(i22);
                    this.f9988m = context3;
                    this.n = i12;
                    this.f9990p = z13;
                    this.f9991q = z12;
                    this.f9992r = z14;
                    this.f9993s = booleanValue4;
                    this.f9995u = 5;
                    a14 = FlowKt__ReduceKt.a(k3, this);
                    if (a14 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    context4 = context3;
                    z15 = booleanValue4;
                    int intValue = ((Number) a14).intValue();
                    kotlinx.coroutines.flow.b<List<t6.a>> e10 = ((u6.a) folderListWidgetProvider.f9984i.getValue()).e();
                    this.f9988m = context4;
                    this.n = i12;
                    this.f9990p = z13;
                    this.f9991q = z12;
                    this.f9992r = z14;
                    this.f9993s = z15;
                    this.f9989o = intValue;
                    this.f9995u = 6;
                    a15 = FlowKt__ReduceKt.a(e10, this);
                    if (a15 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    boolean z21 = z14;
                    z16 = z15;
                    i13 = intValue;
                    context5 = context4;
                    i14 = i12;
                    z17 = z13;
                    z18 = z12;
                    z19 = z21;
                    boolean isEmpty = ((List) a15).isEmpty();
                    kotlinx.coroutines.flow.b<Icon> icon = FolderListWidgetProvider.b(folderListWidgetProvider).getIcon();
                    this.f9988m = context5;
                    this.n = i14;
                    this.f9990p = z17;
                    this.f9991q = z18;
                    this.f9992r = z19;
                    this.f9993s = z16;
                    this.f9989o = i13;
                    this.f9994t = isEmpty;
                    this.f9995u = 7;
                    a16 = FlowKt__ReduceKt.a(icon, this);
                    if (a16 != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z20 = isEmpty;
                    Icon icon2 = (Icon) a16;
                    g.f(context5, "<this>");
                    g.f(icon2, "icon");
                    RemoteViews remoteViews2 = new RemoteViews(context5.getPackageName(), (int) R.layout.folder_list_widget);
                    if (!z17) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.ll_header, i15);
                    if (!z18) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.iv_edit_widget, i16);
                    if (!z19) {
                        i17 = 0;
                    } else {
                        i17 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.iv_app_icon, i17);
                    if (!z16) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.fab, i18);
                    if (!z20) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    remoteViews2.setViewVisibility(R.id.tv_placeholder, i19);
                    if (!z20) {
                        i20 = 8;
                    } else {
                        i20 = 0;
                    }
                    remoteViews2.setViewVisibility(R.id.lv, i20);
                    Intent intent = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE", null, context5, FolderListWidgetConfigActivity.class);
                    intent.putExtra("appWidgetId", i14);
                    intent.setData(Uri.parse(intent.toUri(1)));
                    int i25 = h.f10949a;
                    remoteViews2.setOnClickPendingIntent(R.id.iv_edit_widget, PendingIntent.getActivity(context5, i14, intent, i25));
                    Intent component = new Intent("com.noto.intent.action.CREATE_FOLDER", (Uri) null).setComponent(f.d(context5));
                    g.e(component, "Intent(Constants.Intent.…ent(enabledComponentName)");
                    remoteViews2.setOnClickPendingIntent(R.id.fab, PendingIntent.getActivity(context5, i14, component, i25));
                    remoteViews2.setOnClickPendingIntent(R.id.iv_app_icon, a1.c.q0(context5, i14));
                    remoteViews2.setOnClickPendingIntent(R.id.tv_app_name, a1.c.q0(context5, i14));
                    Intent intent2 = new Intent(context5, FolderListWidgetService.class);
                    intent2.putExtra("appWidgetId", i14);
                    intent2.setData(Uri.parse(intent2.toUri(1)));
                    intent2.putExtra("WidgetRadius", i13);
                    remoteViews2.setRemoteAdapter(R.id.lv, intent2);
                    Intent intent3 = new Intent("com.noto.intent.action.OPEN_FOLDER", (Uri) null);
                    intent3.setComponent(f.d(context5));
                    intent3.putExtra("appWidgetId", i14);
                    intent3.setData(Uri.parse(intent3.toUri(1)));
                    remoteViews2.setPendingIntentTemplate(R.id.lv, PendingIntent.getActivity(context5, i14, intent3, h.f10950b));
                    remoteViews2.setInt(R.id.ll, "setBackgroundResource", a1.c.Q1(i13));
                    remoteViews2.setInt(R.id.ll_header, "setBackgroundResource", a1.c.P1(i13));
                    remoteViews2.setInt(R.id.iv_app_icon, "setImageResource", q.i(icon2));
                    if (!z19) {
                        d5 = q.d(0);
                        d10 = q.d(16);
                        d11 = q.d(0);
                    } else {
                        d5 = q.d(16);
                        d10 = q.d(16);
                        d11 = q.d(16);
                    }
                    remoteViews2.setViewPadding(R.id.tv_app_name, d5, d10, d11, q.d(16));
                    remoteViews = remoteViews2;
                }
                appWidgetManager = this.f9999y;
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidget(i22, remoteViews);
                }
                return n.f16010a;
            case 1:
                int i26 = this.n;
                Context context8 = this.f9988m;
                b.n1(obj);
                context = context8;
                i10 = i26;
                a10 = obj;
                booleanValue = ((Boolean) a10).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> Z2 = FolderListWidgetProvider.b(folderListWidgetProvider).Z(i22);
                this.f9988m = context;
                this.n = i10;
                this.f9990p = booleanValue;
                this.f9995u = 2;
                a11 = FlowKt__ReduceKt.a(Z2, this);
                if (a11 == coroutineSingletons) {
                }
                int i232 = i10;
                z10 = booleanValue;
                Context context72 = context;
                i11 = i232;
                boolean booleanValue22 = ((Boolean) a11).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> H2 = FolderListWidgetProvider.b(folderListWidgetProvider).H(i22);
                this.f9988m = context72;
                this.n = i11;
                this.f9990p = z10;
                this.f9991q = booleanValue22;
                this.f9995u = 3;
                a12 = FlowKt__ReduceKt.a(H2, this);
                if (a12 == coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                booleanValue = this.f9990p;
                i10 = this.n;
                context = this.f9988m;
                b.n1(obj);
                a11 = obj;
                int i2322 = i10;
                z10 = booleanValue;
                Context context722 = context;
                i11 = i2322;
                boolean booleanValue222 = ((Boolean) a11).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> H22 = FolderListWidgetProvider.b(folderListWidgetProvider).H(i22);
                this.f9988m = context722;
                this.n = i11;
                this.f9990p = z10;
                this.f9991q = booleanValue222;
                this.f9995u = 3;
                a12 = FlowKt__ReduceKt.a(H22, this);
                if (a12 == coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                z11 = this.f9991q;
                z10 = this.f9990p;
                i11 = this.n;
                context2 = this.f9988m;
                b.n1(obj);
                a12 = obj;
                boolean booleanValue32 = ((Boolean) a12).booleanValue();
                kotlinx.coroutines.flow.b<Boolean> b52 = FolderListWidgetProvider.b(folderListWidgetProvider).b(i22);
                this.f9988m = context2;
                this.n = i11;
                this.f9990p = z10;
                this.f9991q = z11;
                this.f9992r = booleanValue32;
                this.f9995u = 4;
                a13 = FlowKt__ReduceKt.a(b52, this);
                if (a13 != coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                boolean z22 = this.f9992r;
                boolean z23 = this.f9991q;
                boolean z24 = this.f9990p;
                int i27 = this.n;
                Context context9 = this.f9988m;
                b.n1(obj);
                a13 = obj;
                z14 = z22;
                context3 = context9;
                i12 = i27;
                z13 = z24;
                z12 = z23;
                boolean booleanValue42 = ((Boolean) a13).booleanValue();
                kotlinx.coroutines.flow.b<Integer> k32 = FolderListWidgetProvider.b(folderListWidgetProvider).k(i22);
                this.f9988m = context3;
                this.n = i12;
                this.f9990p = z13;
                this.f9991q = z12;
                this.f9992r = z14;
                this.f9993s = booleanValue42;
                this.f9995u = 5;
                a14 = FlowKt__ReduceKt.a(k32, this);
                if (a14 != coroutineSingletons) {
                }
                break;
            case 5:
                z15 = this.f9993s;
                z14 = this.f9992r;
                z12 = this.f9991q;
                z13 = this.f9990p;
                i12 = this.n;
                context4 = this.f9988m;
                b.n1(obj);
                a14 = obj;
                int intValue2 = ((Number) a14).intValue();
                kotlinx.coroutines.flow.b<List<t6.a>> e102 = ((u6.a) folderListWidgetProvider.f9984i.getValue()).e();
                this.f9988m = context4;
                this.n = i12;
                this.f9990p = z13;
                this.f9991q = z12;
                this.f9992r = z14;
                this.f9993s = z15;
                this.f9989o = intValue2;
                this.f9995u = 6;
                a15 = FlowKt__ReduceKt.a(e102, this);
                if (a15 != coroutineSingletons) {
                }
                break;
            case 6:
                i13 = this.f9989o;
                z16 = this.f9993s;
                z19 = this.f9992r;
                z18 = this.f9991q;
                z17 = this.f9990p;
                i14 = this.n;
                context5 = this.f9988m;
                b.n1(obj);
                a15 = obj;
                boolean isEmpty2 = ((List) a15).isEmpty();
                kotlinx.coroutines.flow.b<Icon> icon3 = FolderListWidgetProvider.b(folderListWidgetProvider).getIcon();
                this.f9988m = context5;
                this.n = i14;
                this.f9990p = z17;
                this.f9991q = z18;
                this.f9992r = z19;
                this.f9993s = z16;
                this.f9989o = i13;
                this.f9994t = isEmpty2;
                this.f9995u = 7;
                a16 = FlowKt__ReduceKt.a(icon3, this);
                if (a16 != coroutineSingletons) {
                }
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                z20 = this.f9994t;
                i13 = this.f9989o;
                boolean z25 = this.f9993s;
                boolean z26 = this.f9992r;
                boolean z27 = this.f9991q;
                boolean z28 = this.f9990p;
                int i28 = this.n;
                Context context10 = this.f9988m;
                b.n1(obj);
                context5 = context10;
                i14 = i28;
                z17 = z28;
                z18 = z27;
                z19 = z26;
                z16 = z25;
                a16 = obj;
                Icon icon22 = (Icon) a16;
                g.f(context5, "<this>");
                g.f(icon22, "icon");
                RemoteViews remoteViews22 = new RemoteViews(context5.getPackageName(), (int) R.layout.folder_list_widget);
                if (!z17) {
                }
                remoteViews22.setViewVisibility(R.id.ll_header, i15);
                if (!z18) {
                }
                remoteViews22.setViewVisibility(R.id.iv_edit_widget, i16);
                if (!z19) {
                }
                remoteViews22.setViewVisibility(R.id.iv_app_icon, i17);
                if (!z16) {
                }
                remoteViews22.setViewVisibility(R.id.fab, i18);
                if (!z20) {
                }
                remoteViews22.setViewVisibility(R.id.tv_placeholder, i19);
                if (!z20) {
                }
                remoteViews22.setViewVisibility(R.id.lv, i20);
                Intent intent4 = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE", null, context5, FolderListWidgetConfigActivity.class);
                intent4.putExtra("appWidgetId", i14);
                intent4.setData(Uri.parse(intent4.toUri(1)));
                int i252 = h.f10949a;
                remoteViews22.setOnClickPendingIntent(R.id.iv_edit_widget, PendingIntent.getActivity(context5, i14, intent4, i252));
                Intent component2 = new Intent("com.noto.intent.action.CREATE_FOLDER", (Uri) null).setComponent(f.d(context5));
                g.e(component2, "Intent(Constants.Intent.…ent(enabledComponentName)");
                remoteViews22.setOnClickPendingIntent(R.id.fab, PendingIntent.getActivity(context5, i14, component2, i252));
                remoteViews22.setOnClickPendingIntent(R.id.iv_app_icon, a1.c.q0(context5, i14));
                remoteViews22.setOnClickPendingIntent(R.id.tv_app_name, a1.c.q0(context5, i14));
                Intent intent22 = new Intent(context5, FolderListWidgetService.class);
                intent22.putExtra("appWidgetId", i14);
                intent22.setData(Uri.parse(intent22.toUri(1)));
                intent22.putExtra("WidgetRadius", i13);
                remoteViews22.setRemoteAdapter(R.id.lv, intent22);
                Intent intent32 = new Intent("com.noto.intent.action.OPEN_FOLDER", (Uri) null);
                intent32.setComponent(f.d(context5));
                intent32.putExtra("appWidgetId", i14);
                intent32.setData(Uri.parse(intent32.toUri(1)));
                remoteViews22.setPendingIntentTemplate(R.id.lv, PendingIntent.getActivity(context5, i14, intent32, h.f10950b));
                remoteViews22.setInt(R.id.ll, "setBackgroundResource", a1.c.Q1(i13));
                remoteViews22.setInt(R.id.ll_header, "setBackgroundResource", a1.c.P1(i13));
                remoteViews22.setInt(R.id.iv_app_icon, "setImageResource", q.i(icon22));
                if (!z19) {
                }
                remoteViews22.setViewPadding(R.id.tv_app_name, d5, d10, d11, q.d(16));
                remoteViews = remoteViews22;
                appWidgetManager = this.f9999y;
                if (appWidgetManager != null) {
                }
                return n.f16010a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
