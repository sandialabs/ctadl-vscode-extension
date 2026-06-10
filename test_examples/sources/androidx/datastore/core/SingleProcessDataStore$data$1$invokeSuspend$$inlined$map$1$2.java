package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import j3.e;
import j3.g;
import j3.i;
import j3.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.c;
import m7.n;

/* loaded from: classes.dex */
public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2 implements c<i<Object>> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c f4685i;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
    @q7.c(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f4686l;

        /* renamed from: m  reason: collision with root package name */
        public int f4687m;

        public AnonymousClass1(p7.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            this.f4686l = obj;
            this.f4687m |= Integer.MIN_VALUE;
            return SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2.this.c(null, this);
        }
    }

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2(c cVar) {
        this.f4685i = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i<Object> iVar, p7.c cVar) {
        AnonymousClass1 anonymousClass1;
        int i10;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.f4687m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f4687m = i11 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.f4686l;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = anonymousClass1.f4687m;
                if (i10 == 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    i<Object> iVar2 = iVar;
                    if (!(iVar2 instanceof g)) {
                        if (!(iVar2 instanceof e)) {
                            if (iVar2 instanceof j3.b) {
                                T t10 = ((j3.b) iVar2).f12668a;
                                anonymousClass1.f4687m = 1;
                                if (this.f4685i.c(t10, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else if (iVar2 instanceof j) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            throw ((e) iVar2).f12670a;
                        }
                    } else {
                        throw ((g) iVar2).f12671a;
                    }
                }
                return n.f16010a;
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar);
        Object obj2 = anonymousClass1.f4686l;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = anonymousClass1.f4687m;
        if (i10 == 0) {
        }
        return n.f16010a;
    }
}
