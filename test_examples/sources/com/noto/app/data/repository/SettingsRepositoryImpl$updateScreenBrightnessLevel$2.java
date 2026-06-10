package com.noto.app.data.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import j3.d;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m3.a;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm3/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$updateScreenBrightnessLevel$2", f = "SettingsRepositoryImpl.kt", l = {449}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsRepositoryImpl$updateScreenBrightnessLevel$2 extends SuspendLambda implements p<x, p7.c<? super a>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8116m;
    public final /* synthetic */ SettingsRepositoryImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ScreenBrightnessLevel f8117o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "preferences", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.data.repository.SettingsRepositoryImpl$updateScreenBrightnessLevel$2$1", f = "SettingsRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.data.repository.SettingsRepositoryImpl$updateScreenBrightnessLevel$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<MutablePreferences, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f8118m;
        public final /* synthetic */ ScreenBrightnessLevel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScreenBrightnessLevel screenBrightnessLevel, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = screenBrightnessLevel;
        }

        @Override // u7.p
        public final Object R(MutablePreferences mutablePreferences, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(mutablePreferences, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.n, cVar);
            anonymousClass1.f8118m = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            a.C0185a<String> c0185a = q6.a.f16922a;
            ((MutablePreferences) this.f8118m).d(q6.a.f16939t, new Float(this.n.f8219i));
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepositoryImpl$updateScreenBrightnessLevel$2(SettingsRepositoryImpl settingsRepositoryImpl, ScreenBrightnessLevel screenBrightnessLevel, p7.c<? super SettingsRepositoryImpl$updateScreenBrightnessLevel$2> cVar) {
        super(2, cVar);
        this.n = settingsRepositoryImpl;
        this.f8117o = screenBrightnessLevel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super a> cVar) {
        return ((SettingsRepositoryImpl$updateScreenBrightnessLevel$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsRepositoryImpl$updateScreenBrightnessLevel$2(this.n, this.f8117o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8116m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            d<a> dVar = this.n.f7731a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8117o, null);
            this.f8116m = 1;
            obj = PreferencesKt.a(dVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
