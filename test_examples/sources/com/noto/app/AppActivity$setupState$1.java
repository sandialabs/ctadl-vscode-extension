package com.noto.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import f7.f;
import ja.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m2.u;
import m7.n;
import n7.l;
import o2.b;
import o2.d;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Icon;", "icon", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppActivity$setupState$1", f = "AppActivity.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AppActivity$setupState$1 extends SuspendLambda implements p<Icon, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Icon f7531m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f7532o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7533p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$setupState$1(AppActivity appActivity, p7.c<? super AppActivity$setupState$1> cVar) {
        super(2, cVar);
        this.f7533p = appActivity;
    }

    @Override // u7.p
    public final Object R(Icon icon, p7.c<? super n> cVar) {
        return ((AppActivity$setupState$1) a(icon, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        AppActivity$setupState$1 appActivity$setupState$1 = new AppActivity$setupState$1(this.f7533p, cVar);
        appActivity$setupState$1.f7532o = obj;
        return appActivity$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        AppViewModel q10;
        Icon icon;
        Icon icon2;
        Iterable<b> emptyList;
        Object systemService;
        List pinnedShortcuts;
        Object systemService2;
        List shortcuts;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        AppActivity appActivity = this.f7533p;
        if (i10 != 0) {
            if (i10 == 1) {
                icon = this.f7531m;
                icon2 = (Icon) this.f7532o;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            Icon icon3 = (Icon) this.f7532o;
            q10 = appActivity.q();
            a0 a0Var = q10.f7555p;
            this.f7532o = icon3;
            this.f7531m = icon3;
            this.n = 1;
            Object U = a0Var.U(this);
            if (U == coroutineSingletons) {
                return coroutineSingletons;
            }
            icon = icon3;
            obj = U;
            icon2 = icon;
        }
        if (icon != obj) {
            int i11 = AppActivity.N;
            PackageManager packageManager = appActivity.getPackageManager();
            if (packageManager != null) {
                packageManager.setComponentEnabledSetting(f.d(appActivity), 2, 1);
            }
            PackageManager packageManager2 = appActivity.getPackageManager();
            if (packageManager2 != null) {
                g.f(icon2, "icon");
                packageManager2.setComponentEnabledSetting(new ComponentName(appActivity, ModelUtilsKt.E(icon2, g.a(f.d(appActivity), new ComponentName(appActivity, AppActivity.class)))), 1, 1);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                systemService2 = appActivity.getSystemService(ShortcutManager.class);
                shortcuts = ((ShortcutManager) systemService2).getShortcuts(4);
                emptyList = b.a(appActivity, shortcuts);
            } else if (i12 >= 25) {
                systemService = appActivity.getSystemService(ShortcutManager.class);
                ArrayList arrayList = new ArrayList();
                pinnedShortcuts = ((ShortcutManager) systemService).getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
                emptyList = b.a(appActivity, arrayList);
            } else {
                emptyList = Collections.emptyList();
            }
            g.e(emptyList, "getShortcuts(this, Short…Compat.FLAG_MATCH_PINNED)");
            ArrayList arrayList2 = new ArrayList(l.Z1(emptyList, 10));
            for (b bVar : emptyList) {
                Intent[] intentArr = bVar.c;
                Intent component = intentArr[intentArr.length - 1].setComponent(f.d(appActivity));
                g.e(component, "it.intent.setComponent(enabledComponentName)");
                b bVar2 = new b();
                bVar2.f16219a = bVar.f16219a;
                bVar2.f16220b = bVar.f16220b;
                Intent[] intentArr2 = bVar.c;
                bVar2.c = (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length);
                bVar2.f16221d = bVar.f16221d;
                bVar2.f16222e = bVar.f16222e;
                bVar2.f16223f = bVar.f16223f;
                bVar2.f16224g = bVar.f16224g;
                bVar2.f16225h = bVar.f16225h;
                bVar2.f16226i = bVar.f16226i;
                bVar2.f16229l = bVar.f16229l;
                bVar2.f16230m = bVar.f16230m;
                bVar2.n = bVar.n;
                u[] uVarArr = bVar.f16227j;
                if (uVarArr != null) {
                    bVar2.f16227j = (u[]) Arrays.copyOf(uVarArr, uVarArr.length);
                }
                if (bVar.f16228k != null) {
                    bVar2.f16228k = new HashSet(bVar.f16228k);
                }
                PersistableBundle persistableBundle = bVar.f16231o;
                if (persistableBundle != null) {
                    bVar2.f16231o = persistableBundle;
                }
                bVar2.f16232p = bVar.f16232p;
                bVar2.f16221d = f.d(appActivity);
                bVar2.c = new Intent[]{component};
                if (!TextUtils.isEmpty(bVar2.f16222e)) {
                    Intent[] intentArr3 = bVar2.c;
                    if (intentArr3 != null && intentArr3.length != 0) {
                        arrayList2.add(bVar2);
                    } else {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                } else {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
            }
            d.j(appActivity, arrayList2);
        }
        return n.f16010a;
    }
}
