package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {116, 122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements u7.p<kotlinx.coroutines.flow.c<? super Float>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public la.e f3798m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f3799o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ContentResolver f3800p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Uri f3801q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ t1 f3802r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ la.c<m7.n> f3803s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Context f3804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, t1 t1Var, la.c<m7.n> cVar, Context context, p7.c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> cVar2) {
        super(2, cVar2);
        this.f3800p = contentResolver;
        this.f3801q = uri;
        this.f3802r = t1Var;
        this.f3803s = cVar;
        this.f3804t = context;
    }

    @Override // u7.p
    public final Object R(kotlinx.coroutines.flow.c<? super Float> cVar, p7.c<? super m7.n> cVar2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) a(cVar, cVar2)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.f3800p, this.f3801q, this.f3802r, this.f3803s, this.f3804t, cVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3799o = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #1 {all -> 0x0088, blocks: (B:21:0x0058, B:23:0x0060), top: B:39:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:37:0x0045). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
        kotlinx.coroutines.flow.c cVar;
        la.e<m7.n> it;
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12;
        Object a10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        try {
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            it = this.f3798m;
                            cVar = (kotlinx.coroutines.flow.c) this.f3799o;
                            m0.b.n1(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        la.e<m7.n> eVar = this.f3798m;
                        kotlinx.coroutines.flow.c cVar2 = (kotlinx.coroutines.flow.c) this.f3799o;
                        m0.b.n1(obj);
                        kotlinx.coroutines.flow.c cVar3 = cVar2;
                        la.e<m7.n> eVar2 = eVar;
                        CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = this;
                        try {
                            if (!((Boolean) obj).booleanValue()) {
                                eVar2.next();
                                Float f10 = new Float(Settings.Global.getFloat(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3804t.getContentResolver(), "animator_duration_scale", 1.0f));
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3799o = cVar3;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3798m = eVar2;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.n = 2;
                                if (cVar3.c(f10, windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12 = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
                                coroutineSingletons = coroutineSingletons2;
                                it = eVar2;
                                cVar = cVar3;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.f3799o = cVar;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.f3798m = it;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.n = 1;
                                a10 = it.a(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12);
                                if (a10 != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12;
                                obj = a10;
                                cVar3 = cVar;
                                eVar2 = it;
                                coroutineSingletons2 = coroutineSingletons3;
                                if (!((Boolean) obj).booleanValue()) {
                                    windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3800p.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3802r);
                                    return m7.n.f16010a;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3800p.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3802r);
                            throw th;
                        }
                    }
                } else {
                    m0.b.n1(obj);
                    cVar = (kotlinx.coroutines.flow.c) this.f3799o;
                    this.f3800p.registerContentObserver(this.f3801q, false, this.f3802r);
                    it = this.f3803s.iterator();
                }
                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.f3799o = cVar;
                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.f3798m = it;
                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12.n = 1;
                a10 = it.a(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12);
                if (a10 != coroutineSingletons) {
                }
            } catch (Throwable th2) {
                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12;
                th = th2;
                windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3800p.unregisterContentObserver(windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f3802r);
                throw th;
            }
            windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$12 = this;
        } catch (Throwable th3) {
            th = th3;
            windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = this;
        }
    }
}
