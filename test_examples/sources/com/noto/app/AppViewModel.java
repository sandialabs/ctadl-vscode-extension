package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.Language;
import com.noto.app.domain.model.Theme;
import com.noto.app.domain.model.VaultTimeout;
import ja.a0;
import ja.u0;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.t;
import m0.b;
import m7.n;
import q7.c;
import u6.d;
import u6.e;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class AppViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f7544d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7545e;

    /* renamed from: f  reason: collision with root package name */
    public final e f7546f;

    /* renamed from: g  reason: collision with root package name */
    public final l f7547g;

    /* renamed from: h  reason: collision with root package name */
    public final m f7548h;

    /* renamed from: i  reason: collision with root package name */
    public final m f7549i;

    /* renamed from: j  reason: collision with root package name */
    public final m f7550j;

    /* renamed from: k  reason: collision with root package name */
    public final l f7551k;

    /* renamed from: l  reason: collision with root package name */
    public final m f7552l;

    /* renamed from: m  reason: collision with root package name */
    public final l f7553m;
    public final m n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7554o;

    /* renamed from: p  reason: collision with root package name */
    public final a0 f7555p;

    /* renamed from: q  reason: collision with root package name */
    public Theme f7556q;

    /* renamed from: r  reason: collision with root package name */
    public final StateFlowImpl f7557r;

    /* renamed from: s  reason: collision with root package name */
    public final m f7558s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/VaultTimeout;", "timeout", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.AppViewModel$1", f = "AppViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.AppViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<VaultTimeout, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f7563m;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(VaultTimeout vaultTimeout, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(vaultTimeout, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f7563m = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            if (((VaultTimeout) this.f7563m) == VaultTimeout.Immediately) {
                AppViewModel.this.d();
            }
            return n.f16010a;
        }
    }

    public AppViewModel(u6.a aVar, d dVar, e eVar) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(eVar, "settingsRepository");
        this.f7544d = aVar;
        this.f7545e = dVar;
        this.f7546f = eVar;
        kotlinx.coroutines.flow.b K = a1.b.K(eVar.k0());
        x d02 = a1.b.d0(this);
        t tVar = s.a.f15449a;
        this.f7547g = a1.b.A0(K, d02);
        final kotlinx.coroutines.flow.b<Language> h02 = eVar.h0();
        this.f7548h = a1.b.C0(new kotlinx.coroutines.flow.b<Language>() { // from class: com.noto.app.AppViewModel$special$$inlined$map$1

            /* renamed from: com.noto.app.AppViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f7560i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @c(c = "com.noto.app.AppViewModel$special$$inlined$map$1$2", f = "AppViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.AppViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f7561l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f7562m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f7561l = obj;
                        this.f7562m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.f7560i = cVar;
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
                        int i11 = anonymousClass1.f7562m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f7562m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f7561l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f7562m;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    b.n1(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                b.n1(obj2);
                                Language language = (Language) obj;
                                List<Language> list = Language.f8182i;
                                if (Language.f8182i.contains(language)) {
                                    language = Language.System;
                                }
                                anonymousClass1.f7562m = 1;
                                if (this.f7560i.c(language, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.f7561l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f7562m;
                    if (i10 == 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super Language> cVar, p7.c cVar2) {
                Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, a1.b.d0(this), tVar, Language.System);
        this.f7549i = a1.b.C0(eVar.getIcon(), a1.b.d0(this), tVar, Icon.Futuristic);
        m C0 = a1.b.C0(eVar.u(), a1.b.d0(this), tVar, VaultTimeout.Immediately);
        this.f7550j = C0;
        this.f7551k = a1.b.A0(a1.b.K(eVar.n()), a1.b.d0(this));
        this.f7552l = a1.b.C0(eVar.A(), a1.b.d0(this), s.a.f15450b, Boolean.FALSE);
        this.f7553m = a1.b.A0(a1.b.K(eVar.V()), a1.b.d0(this));
        this.n = a1.b.C0(eVar.e0(), a1.b.d0(this), tVar, -4L);
        this.f7554o = true;
        x d03 = a1.b.d0(this);
        p appViewModel$currentIcon$1 = new AppViewModel$currentIcon$1(this, null);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        a0 a0Var = new a0(CoroutineContextKt.c(d03, emptyCoroutineContext), true);
        a0Var.D0(coroutineStart, a0Var, appViewModel$currentIcon$1);
        this.f7555p = a0Var;
        this.f7557r = f.a(null);
        this.f7558s = a1.b.C0(eVar.K(), a1.b.d0(this), tVar, -1L);
        b.M0(a1.b.d0(this), null, null, new AppViewModel$createGeneralFolder$1(this, null), 3);
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), C0), a1.b.d0(this));
    }

    public final u0 d() {
        return b.M0(a1.b.d0(this), null, null, new AppViewModel$closeVault$1(this, null), 3);
    }

    public final void e(String str, p pVar) {
        b.M0(a1.b.d0(this), null, null, new AppViewModel$createQuickNote$1(str, this, pVar, null), 3);
    }

    public final void f(VaultTimeout vaultTimeout) {
        b.M0(a1.b.d0(this), null, null, new AppViewModel$setScheduledVaultTimeout$1(this, vaultTimeout, null), 3);
    }

    public final void g(Language language) {
        g.f(language, "value");
        b.M0(a1.b.d0(this), null, null, new AppViewModel$updateLanguage$1(this, language, null), 3);
    }
}
