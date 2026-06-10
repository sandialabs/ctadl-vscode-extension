package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.c;
import m7.n;

/* loaded from: classes.dex */
public final class ModelUtilsKt$asSearchFlow$$inlined$map$1 implements b<String> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f9850i;

    /* renamed from: com.noto.app.util.ModelUtilsKt$asSearchFlow$$inlined$map$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f9851i;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
        @q7.c(c = "com.noto.app.util.ModelUtilsKt$asSearchFlow$$inlined$map$1$2", f = "ModelUtils.kt", l = {223}, m = "emit")
        /* renamed from: com.noto.app.util.ModelUtilsKt$asSearchFlow$$inlined$map$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f9852l;

            /* renamed from: m  reason: collision with root package name */
            public int f9853m;

            public AnonymousClass1(p7.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                this.f9852l = obj;
                this.f9853m |= Integer.MIN_VALUE;
                return AnonymousClass2.this.c(null, this);
            }
        }

        public AnonymousClass2(c cVar) {
            this.f9851i = cVar;
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
                int i11 = anonymousClass1.f9853m;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f9853m = i11 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.f9852l;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f9853m;
                    if (i10 != 0) {
                        m0.b.n1(obj2);
                        String obj3 = kotlin.text.b.w1((CharSequence) obj).toString();
                        anonymousClass1.f9853m = 1;
                        if (this.f9851i.c(obj3, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m0.b.n1(obj2);
                    }
                    return n.f16010a;
                }
            }
            anonymousClass1 = new AnonymousClass1(cVar);
            Object obj22 = anonymousClass1.f9852l;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = anonymousClass1.f9853m;
            if (i10 != 0) {
            }
            return n.f16010a;
        }
    }

    public ModelUtilsKt$asSearchFlow$$inlined$map$1(FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) {
        this.f9850i = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super String> cVar, p7.c cVar2) {
        Object a10 = this.f9850i.a(new AnonymousClass2(cVar), cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
    }
}
