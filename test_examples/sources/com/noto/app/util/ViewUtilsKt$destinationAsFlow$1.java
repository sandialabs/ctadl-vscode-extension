package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.i;
import androidx.navigation.n;
import f7.s;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import la.k;
import m0.b;
import q7.c;
import u7.a;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "Landroidx/navigation/n;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$destinationAsFlow$1", f = "ViewUtils.kt", l = {373}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$destinationAsFlow$1 extends SuspendLambda implements p<k<? super n>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9877m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NavController f9878o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$destinationAsFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements a<m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ NavController f9879j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ NavController.b f9880k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NavController navController, s sVar) {
            super(0);
            this.f9879j = navController;
            this.f9880k = sVar;
        }

        @Override // u7.a
        public final m7.n k0() {
            this.f9879j.f5444l.remove(this.f9880k);
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$destinationAsFlow$1(NavController navController, p7.c<? super ViewUtilsKt$destinationAsFlow$1> cVar) {
        super(2, cVar);
        this.f9878o = navController;
    }

    @Override // u7.p
    public final Object R(k<? super n> kVar, p7.c<? super m7.n> cVar) {
        return ((ViewUtilsKt$destinationAsFlow$1) a(kVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$destinationAsFlow$1 viewUtilsKt$destinationAsFlow$1 = new ViewUtilsKt$destinationAsFlow$1(this.f9878o, cVar);
        viewUtilsKt$destinationAsFlow$1.n = obj;
        return viewUtilsKt$destinationAsFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [f7.s, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9877m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            final k kVar = (k) this.n;
            ?? r1 = new NavController.b() { // from class: f7.s
                @Override // androidx.navigation.NavController.b
                public final void a(androidx.navigation.n nVar) {
                    la.k.this.F(nVar);
                }
            };
            NavController navController = this.f9878o;
            ArrayDeque arrayDeque = navController.f5440h;
            if (!arrayDeque.isEmpty()) {
                r1.a(((i) arrayDeque.peekLast()).f5479j);
            }
            navController.f5444l.add(r1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(navController, r1);
            this.f9877m = 1;
            if (ProduceKt.a(kVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
