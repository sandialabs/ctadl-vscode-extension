package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f15294i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.p f15295j;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f15296i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ u7.p f15297j;

        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
        @q7.c(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f15298l;

            /* renamed from: m  reason: collision with root package name */
            public int f15299m;

            /* renamed from: o  reason: collision with root package name */
            public Object f15300o;

            /* renamed from: p  reason: collision with root package name */
            public c f15301p;

            public AnonymousClass1(p7.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object k(Object obj) {
                this.f15298l = obj;
                this.f15299m |= Integer.MIN_VALUE;
                return AnonymousClass2.this.c(null, this);
            }
        }

        public AnonymousClass2(c cVar, u7.p pVar) {
            this.f15296i = cVar;
            this.f15297j = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t10, p7.c<? super m7.n> cVar) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons;
            int i10;
            Object obj;
            c cVar2;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i11 = anonymousClass1.f15299m;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f15299m = i11 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.f15298l;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f15299m;
                    if (i10 != 0) {
                        m0.b.n1(obj2);
                        anonymousClass1.f15300o = t10;
                        c cVar3 = this.f15296i;
                        anonymousClass1.f15301p = cVar3;
                        anonymousClass1.f15299m = 1;
                        if (this.f15297j.R(t10, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = t10;
                        cVar2 = cVar3;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj2);
                            return m7.n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        cVar2 = anonymousClass1.f15301p;
                        obj = anonymousClass1.f15300o;
                        m0.b.n1(obj2);
                    }
                    anonymousClass1.f15300o = null;
                    anonymousClass1.f15301p = null;
                    anonymousClass1.f15299m = 2;
                    if (cVar2.c(obj, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return m7.n.f16010a;
                }
            }
            anonymousClass1 = new AnonymousClass1(cVar);
            Object obj22 = anonymousClass1.f15298l;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = anonymousClass1.f15299m;
            if (i10 != 0) {
            }
            anonymousClass1.f15300o = null;
            anonymousClass1.f15301p = null;
            anonymousClass1.f15299m = 2;
            if (cVar2.c(obj, anonymousClass1) == coroutineSingletons) {
            }
            return m7.n.f16010a;
        }
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(u7.p pVar, b bVar) {
        this.f15294i = bVar;
        this.f15295j = pVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c cVar2) {
        Object a10 = this.f15294i.a(new AnonymousClass2(cVar, this.f15295j), cVar2);
        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
    }
}
