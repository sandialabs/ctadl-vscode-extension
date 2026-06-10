package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import r.e;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lr/i;", "V", "", "it", "Lm7/n;", "invoke", "(J)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$9 extends Lambda implements l<Long, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<r.c<T, V>> f1322j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ float f1323k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ r.a<T, V> f1324l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e<T, V> f1325m;
    public final /* synthetic */ l<r.c<T, V>, n> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$9(Ref$ObjectRef<r.c<T, V>> ref$ObjectRef, float f10, r.a<T, V> aVar, e<T, V> eVar, l<? super r.c<T, V>, n> lVar) {
        super(1);
        this.f1322j = ref$ObjectRef;
        this.f1323k = f10;
        this.f1324l = aVar;
        this.f1325m = eVar;
        this.n = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.l
    public final n U(Long l2) {
        long longValue = l2.longValue();
        T t10 = this.f1322j.f13060i;
        g.c(t10);
        SuspendAnimationKt.e((r.c) t10, longValue, this.f1323k, this.f1324l, this.f1325m, this.n);
        return n.f16010a;
    }
}
