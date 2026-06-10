package androidx.compose.foundation.relocation;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.h;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u0.d;
import u7.p;
import x.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BringIntoViewResponderModifier$dispatchRequest$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2050m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ BringIntoViewResponderModifier f2051o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f2052p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ h f2053q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ d f2054r;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @c(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", l = {267}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f2055m;
        public final /* synthetic */ BringIntoViewResponderModifier n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ d f2056o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewResponderModifier bringIntoViewResponderModifier, d dVar, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = bringIntoViewResponderModifier;
            this.f2056o = dVar;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f2056o, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2055m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                g gVar = this.n.f2042l;
                if (gVar != null) {
                    this.f2055m = 1;
                    if (gVar.a(this.f2056o, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    v7.g.l("responder");
                    throw null;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderModifier$dispatchRequest$2(BringIntoViewResponderModifier bringIntoViewResponderModifier, d dVar, h hVar, d dVar2, p7.c<? super BringIntoViewResponderModifier$dispatchRequest$2> cVar) {
        super(2, cVar);
        this.f2051o = bringIntoViewResponderModifier;
        this.f2052p = dVar;
        this.f2053q = hVar;
        this.f2054r = dVar2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((BringIntoViewResponderModifier$dispatchRequest$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        BringIntoViewResponderModifier$dispatchRequest$2 bringIntoViewResponderModifier$dispatchRequest$2 = new BringIntoViewResponderModifier$dispatchRequest$2(this.f2051o, this.f2052p, this.f2053q, this.f2054r, cVar);
        bringIntoViewResponderModifier$dispatchRequest$2.n = obj;
        return bringIntoViewResponderModifier$dispatchRequest$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2050m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            BringIntoViewResponderModifier bringIntoViewResponderModifier = this.f2051o;
            b.M0((x) this.n, null, null, new AnonymousClass1(bringIntoViewResponderModifier, this.f2054r, null), 3);
            x.c cVar = bringIntoViewResponderModifier.f18545j;
            if (cVar == null) {
                cVar = bringIntoViewResponderModifier.f18544i;
            }
            this.f2050m = 1;
            if (cVar.a(this.f2052p, this.f2053q, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
