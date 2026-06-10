package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import r.e;
import r.i;
import u7.l;

/* JADX WARN: Incorrect field signature: TV; */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lr/i;", "V", "", "it", "Lm7/n;", "invoke", "(J)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$6 extends Lambda implements l<Long, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<r.c<T, V>> f1314j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ T f1315k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r.a<T, V> f1316l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ i f1317m;
    public final /* synthetic */ e<T, V> n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f1318o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ l<r.c<T, V>, n> f1319p;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr/i;", "V", "Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e<Object, i> f1320j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e<Object, i> eVar) {
            super(0);
            this.f1320j = eVar;
        }

        @Override // u7.a
        public final n k0() {
            this.f1320j.n = false;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Lr/c<TT;TV;>;>;TT;Lr/a<TT;TV;>;TV;Lr/e<TT;TV;>;FLu7/l<-Lr/c<TT;TV;>;Lm7/n;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$6(Ref$ObjectRef ref$ObjectRef, Object obj, r.a aVar, i iVar, e eVar, float f10, l lVar) {
        super(1);
        this.f1314j = ref$ObjectRef;
        this.f1315k = obj;
        this.f1316l = aVar;
        this.f1317m = iVar;
        this.n = eVar;
        this.f1318o = f10;
        this.f1319p = lVar;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [T, r.c] */
    @Override // u7.l
    public final n U(Long l2) {
        long longValue = l2.longValue();
        T t10 = this.f1315k;
        r.a<T, V> aVar = this.f1316l;
        ?? cVar = new r.c(t10, aVar.d(), this.f1317m, longValue, aVar.e(), longValue, new AnonymousClass1(this.n));
        SuspendAnimationKt.e(cVar, longValue, this.f1318o, this.f1316l, this.n, this.f1319p);
        this.f1314j.f13060i = cVar;
        return n.f16010a;
    }
}
