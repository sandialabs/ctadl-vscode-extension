package com.noto.app.label;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.label.LabelViewModel;
import ja.x;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import m7.n;
import v7.g;

/* loaded from: classes.dex */
public final class LabelViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final u6.a f8750d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.b f8751e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8752f;

    /* renamed from: g  reason: collision with root package name */
    public final m f8753g;

    /* renamed from: h  reason: collision with root package name */
    public final m f8754h;

    /* renamed from: i  reason: collision with root package name */
    public final m f8755i;

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return c.g0(Integer.valueOf(((t6.c) t10).f17618e), Integer.valueOf(((t6.c) t11).f17618e));
        }
    }

    public LabelViewModel(u6.a aVar, u6.b bVar, long j2, long j10) {
        g.f(aVar, "folderRepository");
        g.f(bVar, "labelRepository");
        this.f8750d = aVar;
        this.f8751e = bVar;
        this.f8752f = j10;
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(aVar.d(j2));
        x d02 = a1.b.d0(this);
        StartedLazily startedLazily = s.a.f15450b;
        this.f8753g = a1.b.C0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, d02, startedLazily, new t6.a(j2, null, 2097142));
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(bVar.e(j2));
        this.f8754h = a1.b.C0(new kotlinx.coroutines.flow.b<List<? extends t6.c>>() { // from class: com.noto.app.label.LabelViewModel$special$$inlined$map$1

            /* renamed from: com.noto.app.label.LabelViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f8757i;

                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                @q7.c(c = "com.noto.app.label.LabelViewModel$special$$inlined$map$1$2", f = "LabelViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.noto.app.label.LabelViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: l  reason: collision with root package name */
                    public /* synthetic */ Object f8758l;

                    /* renamed from: m  reason: collision with root package name */
                    public int f8759m;

                    public AnonymousClass1(p7.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object k(Object obj) {
                        this.f8758l = obj;
                        this.f8759m |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                    this.f8757i = cVar;
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
                        int i11 = anonymousClass1.f8759m;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f8759m = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.f8758l;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = anonymousClass1.f8759m;
                            if (i10 != 0) {
                                m0.b.n1(obj2);
                                List G2 = kotlin.collections.c.G2((List) obj, new LabelViewModel.a());
                                anonymousClass1.f8759m = 1;
                                if (this.f8757i.c(G2, anonymousClass1) == coroutineSingletons) {
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
                    Object obj22 = anonymousClass1.f8758l;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = anonymousClass1.f8759m;
                    if (i10 != 0) {
                    }
                    return n.f16010a;
                }
            }

            @Override // kotlinx.coroutines.flow.b
            public final Object a(kotlinx.coroutines.flow.c<? super List<? extends t6.c>> cVar, p7.c cVar2) {
                Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12.a(new AnonymousClass2(cVar), cVar2);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : n.f16010a;
            }
        }, a1.b.d0(this), startedLazily, EmptyList.f12981i);
        this.f8755i = a1.b.C0(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(bVar.b(j10)), a1.b.d0(this), startedLazily, new t6.c(j10, j2, "", NotoColor.Gray, 0));
    }
}
