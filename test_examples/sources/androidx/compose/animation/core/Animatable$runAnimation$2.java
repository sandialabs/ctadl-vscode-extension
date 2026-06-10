package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import m7.n;
import r.e;
import r.i;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Lr/i;", "V", "Lr/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends SuspendLambda implements l<p7.c<? super r.b<Object, i>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public e f1255m;
    public Ref$BooleanRef n;

    /* renamed from: o  reason: collision with root package name */
    public int f1256o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a<Object, i> f1257p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f1258q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ r.a<Object, i> f1259r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f1260s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l<a<Object, i>, n> f1261t;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lr/i;", "V", "Lr/c;", "Lm7/n;", "invoke", "(Lr/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements l<r.c<Object, i>, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a<Object, i> f1262j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e<Object, i> f1263k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ l<a<Object, i>, n> f1264l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f1265m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(a<Object, i> aVar, e<Object, i> eVar, l<? super a<Object, i>, n> lVar, Ref$BooleanRef ref$BooleanRef) {
            super(1);
            this.f1262j = aVar;
            this.f1263k = eVar;
            this.f1264l = lVar;
            this.f1265m = ref$BooleanRef;
        }

        @Override // u7.l
        public final n U(r.c<Object, i> cVar) {
            r.c<Object, i> cVar2 = cVar;
            g.f(cVar2, "$this$animate");
            a<Object, i> aVar = this.f1262j;
            SuspendAnimationKt.g(cVar2, aVar.c);
            Object b5 = aVar.b(cVar2.a());
            boolean a10 = g.a(b5, cVar2.a());
            l<a<Object, i>, n> lVar = this.f1264l;
            if (!a10) {
                aVar.c.f16975j.setValue(b5);
                this.f1263k.f16975j.setValue(b5);
                if (lVar != null) {
                    lVar.U(aVar);
                }
                cVar2.f16971i.setValue(Boolean.FALSE);
                cVar2.f16966d.k0();
                this.f1265m.f13056i = true;
            } else if (lVar != null) {
                lVar.U(aVar);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(a<Object, i> aVar, Object obj, r.a<Object, i> aVar2, long j2, l<? super a<Object, i>, n> lVar, p7.c<? super Animatable$runAnimation$2> cVar) {
        super(1, cVar);
        this.f1257p = aVar;
        this.f1258q = obj;
        this.f1259r = aVar2;
        this.f1260s = j2;
        this.f1261t = lVar;
    }

    @Override // u7.l
    public final Object U(p7.c<? super r.b<Object, i>> cVar) {
        return ((Animatable$runAnimation$2) i(cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> i(p7.c<?> cVar) {
        return new Animatable$runAnimation$2(this.f1257p, this.f1258q, this.f1259r, this.f1260s, this.f1261t, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        e eVar;
        AnimationEndReason animationEndReason;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1256o;
        a<Object, i> aVar = this.f1257p;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ref$BooleanRef = this.n;
                    eVar = this.f1255m;
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                e<Object, i> eVar2 = aVar.c;
                V v3 = (V) aVar.f1353a.a().U(this.f1258q);
                eVar2.getClass();
                g.f(v3, "<set-?>");
                eVar2.f16976k = v3;
                aVar.f1356e.setValue(this.f1259r.e());
                aVar.f1355d.setValue(Boolean.TRUE);
                e<Object, i> eVar3 = aVar.c;
                e eVar4 = new e(eVar3.f16974i, eVar3.getValue(), a1.c.m0(eVar3.f16976k), eVar3.f16977l, Long.MIN_VALUE, eVar3.n);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                r.a<Object, i> aVar2 = this.f1259r;
                long j2 = this.f1260s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, eVar4, this.f1261t, ref$BooleanRef2);
                this.f1255m = eVar4;
                this.n = ref$BooleanRef2;
                this.f1256o = 1;
                if (SuspendAnimationKt.a(eVar4, aVar2, j2, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                eVar = eVar4;
            }
            if (ref$BooleanRef.f13056i) {
                animationEndReason = AnimationEndReason.BoundReached;
            } else {
                animationEndReason = AnimationEndReason.Finished;
            }
            e<Object, i> eVar5 = aVar.c;
            eVar5.f16976k.d();
            eVar5.f16977l = Long.MIN_VALUE;
            aVar.f1355d.setValue(Boolean.FALSE);
            return new r.b(eVar, animationEndReason);
        } catch (CancellationException e10) {
            e<Object, i> eVar6 = aVar.c;
            eVar6.f16976k.d();
            eVar6.f16977l = Long.MIN_VALUE;
            aVar.f1355d.setValue(Boolean.FALSE);
            throw e10;
        }
    }
}
