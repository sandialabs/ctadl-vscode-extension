package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.datastore.preferences.PreferencesProto$Value;
import g1.k;
import g1.o;
import g1.v;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {755}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1636m;
    public final /* synthetic */ v n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<o> f1637o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<o> f1638p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {758, 775}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

        /* renamed from: k  reason: collision with root package name */
        public k f1639k;

        /* renamed from: l  reason: collision with root package name */
        public int f1640l;

        /* renamed from: m  reason: collision with root package name */
        public int f1641m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<o> f1642o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<o> f1643p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<o> ref$ObjectRef, Ref$ObjectRef<o> ref$ObjectRef2, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f1642o = ref$ObjectRef;
            this.f1643p = ref$ObjectRef2;
        }

        @Override // u7.p
        public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
            return ((AnonymousClass1) a(cVar, cVar2)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1642o, this.f1643p, cVar);
            anonymousClass1.n = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[LOOP:3: B:26:0x007e->B:36:0x00a2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00a6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00a0 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r9v11, types: [g1.o, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:44:0x00bd). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object k(Object obj) {
            AnonymousClass1 anonymousClass1;
            g1.c cVar;
            int i10;
            Object obj2;
            g1.c cVar2;
            AnonymousClass1 anonymousClass12;
            int size;
            int i11;
            boolean z10;
            int size2;
            int i12;
            boolean z11;
            Object A;
            boolean z12;
            boolean z13;
            o oVar;
            T t10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.f1641m;
            k kVar = null;
            int i14 = 2;
            int i15 = 1;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        i10 = this.f1640l;
                        k kVar2 = this.f1639k;
                        cVar2 = (g1.c) this.n;
                        m0.b.n1(obj);
                        A = obj;
                        AnonymousClass1 anonymousClass13 = this;
                        List<o> list = ((k) A).f11159a;
                        int size3 = list.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                if (list.get(i16).b()) {
                                    z13 = true;
                                    break;
                                }
                                i16++;
                            } else {
                                z13 = false;
                                break;
                            }
                        }
                        if (z13) {
                            i10 = 1;
                        }
                        Ref$ObjectRef<o> ref$ObjectRef = anonymousClass13.f1642o;
                        boolean h10 = DragGestureDetectorKt.h(kVar2, ref$ObjectRef.f13060i.f11162a);
                        Ref$ObjectRef<o> ref$ObjectRef2 = anonymousClass13.f1643p;
                        List<o> list2 = kVar2.f11159a;
                        if (h10) {
                            int size4 = list2.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size4) {
                                    o oVar2 = list2.get(i17);
                                    if (g1.n.a(oVar2.f11162a, ref$ObjectRef.f13060i.f11162a)) {
                                        t10 = oVar2;
                                        break;
                                    }
                                    i17++;
                                } else {
                                    t10 = 0;
                                    break;
                                }
                            }
                            ref$ObjectRef2.f13060i = t10;
                        } else {
                            int size5 = list2.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size5) {
                                    oVar = list2.get(i18);
                                    if (oVar.f11164d) {
                                        break;
                                    }
                                    i18++;
                                } else {
                                    oVar = null;
                                    break;
                                }
                            }
                            o oVar3 = oVar;
                            if (oVar3 != 0) {
                                ref$ObjectRef.f13060i = oVar3;
                                ref$ObjectRef2.f13060i = oVar3;
                            } else {
                                i10 = 1;
                            }
                        }
                        cVar = cVar2;
                        kVar = null;
                        i14 = 2;
                        i15 = 1;
                        anonymousClass1 = anonymousClass13;
                        if (i10 == 0) {
                            PointerEventPass pointerEventPass = PointerEventPass.Main;
                            anonymousClass1.n = cVar;
                            anonymousClass1.f1639k = kVar;
                            anonymousClass1.f1640l = i10;
                            anonymousClass1.f1641m = i15;
                            obj2 = cVar.A(pointerEventPass, anonymousClass1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            AnonymousClass1 anonymousClass14 = anonymousClass1;
                            cVar2 = cVar;
                            anonymousClass12 = anonymousClass14;
                            k kVar3 = (k) obj2;
                            List<o> list3 = kVar3.f11159a;
                            size = list3.size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    if (!v0.p.g(list3.get(i11))) {
                                        z10 = false;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    z10 = true;
                                    break;
                                }
                            }
                            if (z10) {
                                i10 = 1;
                            }
                            List<o> list4 = kVar3.f11159a;
                            size2 = list4.size();
                            i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    o oVar4 = list4.get(i12);
                                    if (!oVar4.b() && !v0.p.v(oVar4, cVar2.p(), cVar2.S())) {
                                        z12 = false;
                                        if (!z12) {
                                            z11 = true;
                                            break;
                                        }
                                        i12++;
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                } else {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (z11) {
                                i10 = 1;
                            }
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            anonymousClass12.n = cVar2;
                            anonymousClass12.f1639k = kVar3;
                            anonymousClass12.f1640l = i10;
                            anonymousClass12.f1641m = i14;
                            A = cVar2.A(pointerEventPass2, anonymousClass12);
                            if (A != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            anonymousClass13 = anonymousClass12;
                            kVar2 = kVar3;
                            List<o> list5 = ((k) A).f11159a;
                            int size32 = list5.size();
                            int i162 = 0;
                            while (true) {
                                if (i162 < size32) {
                                }
                                i162++;
                            }
                            if (z13) {
                            }
                            Ref$ObjectRef<o> ref$ObjectRef3 = anonymousClass13.f1642o;
                            boolean h102 = DragGestureDetectorKt.h(kVar2, ref$ObjectRef3.f13060i.f11162a);
                            Ref$ObjectRef<o> ref$ObjectRef22 = anonymousClass13.f1643p;
                            List<o> list22 = kVar2.f11159a;
                            if (h102) {
                            }
                            cVar = cVar2;
                            kVar = null;
                            i14 = 2;
                            i15 = 1;
                            anonymousClass1 = anonymousClass13;
                            if (i10 == 0) {
                                return n.f16010a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i10 = this.f1640l;
                    m0.b.n1(obj);
                    obj2 = obj;
                    cVar2 = (g1.c) this.n;
                    anonymousClass12 = this;
                    k kVar32 = (k) obj2;
                    List<o> list32 = kVar32.f11159a;
                    size = list32.size();
                    i11 = 0;
                    while (true) {
                        if (i11 < size) {
                        }
                        i11++;
                    }
                    if (z10) {
                    }
                    List<o> list42 = kVar32.f11159a;
                    size2 = list42.size();
                    i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                        }
                        i12++;
                    }
                    if (z11) {
                    }
                    PointerEventPass pointerEventPass22 = PointerEventPass.Final;
                    anonymousClass12.n = cVar2;
                    anonymousClass12.f1639k = kVar32;
                    anonymousClass12.f1640l = i10;
                    anonymousClass12.f1641m = i14;
                    A = cVar2.A(pointerEventPass22, anonymousClass12);
                    if (A != coroutineSingletons) {
                    }
                }
            } else {
                m0.b.n1(obj);
                anonymousClass1 = this;
                cVar = (g1.c) this.n;
                i10 = 0;
                if (i10 == 0) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(v vVar, Ref$ObjectRef<o> ref$ObjectRef, Ref$ObjectRef<o> ref$ObjectRef2, p7.c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> cVar) {
        super(2, cVar);
        this.n = vVar;
        this.f1637o = ref$ObjectRef;
        this.f1638p = ref$ObjectRef2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.n, this.f1637o, this.f1638p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1636m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1637o, this.f1638p, null);
            this.f1636m = 1;
            if (this.n.Q(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return n.f16010a;
    }
}
