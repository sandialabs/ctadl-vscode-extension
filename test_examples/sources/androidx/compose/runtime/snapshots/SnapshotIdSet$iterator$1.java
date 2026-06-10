package androidx.compose.runtime.snapshots;

import androidx.datastore.preferences.PreferencesProto$Value;
import ga.j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lga/j;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@c(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements p<j<? super Integer>, p7.c<? super n>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public int[] f2933k;

    /* renamed from: l  reason: collision with root package name */
    public int f2934l;

    /* renamed from: m  reason: collision with root package name */
    public int f2935m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f2936o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ SnapshotIdSet f2937p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, p7.c<? super SnapshotIdSet$iterator$1> cVar) {
        super(2, cVar);
        this.f2937p = snapshotIdSet;
    }

    @Override // u7.p
    public final Object R(j<? super Integer> jVar, p7.c<? super n> cVar) {
        return ((SnapshotIdSet$iterator$1) a(jVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.f2937p, cVar);
        snapshotIdSet$iterator$1.f2936o = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:20:0x0079). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:11:0x0039). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ad -> B:32:0x00b0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e7 -> B:45:0x00ed). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        j jVar;
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1;
        CoroutineSingletons coroutineSingletons;
        j jVar2;
        int length;
        int[] iArr;
        int i10;
        j jVar3;
        int i11;
        j jVar4;
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$12;
        int i12;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.n;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        int i14 = this.f2934l;
                        j jVar5 = (j) this.f2936o;
                        b.n1(obj);
                        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$13 = this;
                        coroutineSingletons = coroutineSingletons2;
                        j jVar6 = jVar5;
                        i12 = i14 + 1;
                        snapshotIdSet$iterator$12 = snapshotIdSet$iterator$13;
                        jVar4 = jVar6;
                        if (i12 < 64) {
                            SnapshotIdSet snapshotIdSet = snapshotIdSet$iterator$12.f2937p;
                            if ((snapshotIdSet.f2929i & (1 << i12)) != 0) {
                                Integer num = new Integer(i12 + 64 + snapshotIdSet.f2931k);
                                snapshotIdSet$iterator$12.f2936o = jVar4;
                                snapshotIdSet$iterator$12.f2933k = null;
                                snapshotIdSet$iterator$12.f2934l = i12;
                                snapshotIdSet$iterator$12.n = 3;
                                jVar4.a(num, snapshotIdSet$iterator$12);
                                if (coroutineSingletons2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            j jVar7 = jVar4;
                            snapshotIdSet$iterator$13 = snapshotIdSet$iterator$12;
                            i14 = i12;
                            jVar5 = jVar7;
                            j jVar62 = jVar5;
                            i12 = i14 + 1;
                            snapshotIdSet$iterator$12 = snapshotIdSet$iterator$13;
                            jVar4 = jVar62;
                            if (i12 < 64) {
                            }
                        }
                        return n.f16010a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f2934l;
                jVar3 = (j) this.f2936o;
                b.n1(obj);
                snapshotIdSet$iterator$1 = this;
                coroutineSingletons = coroutineSingletons2;
                i11++;
                if (i11 >= 64) {
                    SnapshotIdSet snapshotIdSet2 = snapshotIdSet$iterator$1.f2937p;
                    if ((snapshotIdSet2.f2930j & (1 << i11)) != 0) {
                        Integer num2 = new Integer(snapshotIdSet2.f2931k + i11);
                        snapshotIdSet$iterator$1.f2936o = jVar3;
                        snapshotIdSet$iterator$1.f2933k = null;
                        snapshotIdSet$iterator$1.f2934l = i11;
                        snapshotIdSet$iterator$1.n = 2;
                        jVar3.a(num2, snapshotIdSet$iterator$1);
                        if (coroutineSingletons2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i11++;
                        if (i11 >= 64) {
                            jVar = jVar3;
                            if (snapshotIdSet$iterator$1.f2937p.f2929i != 0) {
                                jVar4 = jVar;
                                snapshotIdSet$iterator$12 = snapshotIdSet$iterator$1;
                                i12 = 0;
                                if (i12 < 64) {
                                }
                            }
                            return n.f16010a;
                        }
                    }
                    i11++;
                    if (i11 >= 64) {
                    }
                }
            } else {
                length = this.f2935m;
                i10 = this.f2934l;
                iArr = this.f2933k;
                jVar2 = (j) this.f2936o;
                b.n1(obj);
                snapshotIdSet$iterator$1 = this;
                coroutineSingletons = coroutineSingletons2;
                i10++;
                if (i10 < length) {
                    Integer num3 = new Integer(iArr[i10]);
                    snapshotIdSet$iterator$1.f2936o = jVar2;
                    snapshotIdSet$iterator$1.f2933k = iArr;
                    snapshotIdSet$iterator$1.f2934l = i10;
                    snapshotIdSet$iterator$1.f2935m = length;
                    snapshotIdSet$iterator$1.n = 1;
                    jVar2.a(num3, snapshotIdSet$iterator$1);
                    if (coroutineSingletons2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i10++;
                    if (i10 < length) {
                        jVar = jVar2;
                        if (snapshotIdSet$iterator$1.f2937p.f2930j != 0) {
                            jVar3 = jVar;
                            i11 = 0;
                            if (i11 >= 64) {
                            }
                        }
                        if (snapshotIdSet$iterator$1.f2937p.f2929i != 0) {
                        }
                        return n.f16010a;
                    }
                }
            }
        } else {
            b.n1(obj);
            jVar = (j) this.f2936o;
            int[] iArr2 = this.f2937p.f2932l;
            if (iArr2 != null) {
                snapshotIdSet$iterator$1 = this;
                coroutineSingletons = coroutineSingletons2;
                jVar2 = jVar;
                length = iArr2.length;
                iArr = iArr2;
                i10 = 0;
                if (i10 < length) {
                }
            } else {
                snapshotIdSet$iterator$1 = this;
                coroutineSingletons = coroutineSingletons2;
                if (snapshotIdSet$iterator$1.f2937p.f2930j != 0) {
                }
                if (snapshotIdSet$iterator$1.f2937p.f2929i != 0) {
                }
                return n.f16010a;
            }
        }
    }
}
