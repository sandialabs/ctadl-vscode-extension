package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.noto.app.domain.model.FilteringType;
import j3.d;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m3.a;
import m7.n;
import ma.i;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm3/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$updateWidgetFilteringType$2", f = "SettingsRepositoryImpl.kt", l = {437}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsRepositoryImpl$updateWidgetFilteringType$2 extends SuspendLambda implements p<x, p7.c<? super a>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8134m;
    public final /* synthetic */ SettingsRepositoryImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8135o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ FilteringType f8136p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "preferences", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$updateWidgetFilteringType$2$1", f = "SettingsRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$updateWidgetFilteringType$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<MutablePreferences, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f8137m;
        public final /* synthetic */ int n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ FilteringType f8138o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, FilteringType filteringType, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = i10;
            this.f8138o = filteringType;
        }

        @Override // u7.p
        public final Object R(MutablePreferences mutablePreferences, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(mutablePreferences, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.n, this.f8138o, cVar);
            anonymousClass1.f8137m = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.f8137m;
            a.C0185a<?> N = i.N("Widget_Filtering_Type_" + this.n);
            String obj2 = this.f8138o.toString();
            mutablePreferences.getClass();
            mutablePreferences.e(N, obj2);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepositoryImpl$updateWidgetFilteringType$2(SettingsRepositoryImpl settingsRepositoryImpl, int i10, FilteringType filteringType, p7.c<? super SettingsRepositoryImpl$updateWidgetFilteringType$2> cVar) {
        super(2, cVar);
        this.n = settingsRepositoryImpl;
        this.f8135o = i10;
        this.f8136p = filteringType;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super a> cVar) {
        return ((SettingsRepositoryImpl$updateWidgetFilteringType$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsRepositoryImpl$updateWidgetFilteringType$2(this.n, this.f8135o, this.f8136p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8134m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            d<a> dVar = this.n.f7731a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8135o, this.f8136p, null);
            this.f8134m = 1;
            obj = PreferencesKt.a(dVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
