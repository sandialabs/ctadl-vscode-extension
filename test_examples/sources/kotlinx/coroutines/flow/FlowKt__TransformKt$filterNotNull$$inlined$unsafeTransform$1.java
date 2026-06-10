package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f15290i;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f15291i;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f15292l;

            /* renamed from: m  reason: collision with root package name */
            public int f15293m;

            public AnonymousClass1(p7.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                this.f15292l = obj;
                this.f15293m |= Integer.MIN_VALUE;
                return AnonymousClass2.this.c(null, this);
            }
        }

        public AnonymousClass2(c cVar) {
            this.f15291i = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t10, p7.c<? super m7.n> cVar) {
            AnonymousClass1 anonymousClass1;
            int i10;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i11 = anonymousClass1.f15293m;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f15293m = i11 - Integer.MIN_VALUE;
                    Object obj = anonymousClass1.f15292l;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f15293m;
                    if (i10 != 0) {
                        m0.b.n1(obj);
                        if (t10 != null) {
                            anonymousClass1.f15293m = 1;
                            if (this.f15291i.c(t10, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m0.b.n1(obj);
                    }
                    return m7.n.f16010a;
                }
            }
            anonymousClass1 = new AnonymousClass1(cVar);
            Object obj2 = anonymousClass1.f15292l;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = anonymousClass1.f15293m;
            if (i10 != 0) {
            }
            return m7.n.f16010a;
        }
    }

    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(b bVar) {
        this.f15290i = bVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c cVar2) {
        Object a10 = this.f15290i.a(new AnonymousClass2(cVar), cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
    }
}
