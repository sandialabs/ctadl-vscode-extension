package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.domain.model.Icon;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import m7.n;
import u6.b;
import u6.c;
import u6.d;
import u6.e;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f10080d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.a f10081e;

    /* renamed from: f  reason: collision with root package name */
    public final d f10082f;

    /* renamed from: g  reason: collision with root package name */
    public final b f10083g;

    /* renamed from: h  reason: collision with root package name */
    public final c f10084h;

    /* renamed from: i  reason: collision with root package name */
    public final e f10085i;

    /* renamed from: j  reason: collision with root package name */
    public final StateFlowImpl f10086j;

    /* renamed from: k  reason: collision with root package name */
    public final StateFlowImpl f10087k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlowImpl f10088l;

    /* renamed from: m  reason: collision with root package name */
    public final m f10089m;
    public final StateFlowImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final StateFlowImpl f10090o;

    /* renamed from: p  reason: collision with root package name */
    public final StateFlowImpl f10091p;

    /* renamed from: q  reason: collision with root package name */
    public final StateFlowImpl f10092q;

    /* renamed from: r  reason: collision with root package name */
    public final StateFlowImpl f10093r;

    /* renamed from: s  reason: collision with root package name */
    public final StateFlowImpl f10094s;

    /* renamed from: t  reason: collision with root package name */
    public final m f10095t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$1", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f10096m;

        public AnonymousClass1(p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Boolean bool, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f10096m = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.n.setValue(Boolean.valueOf(this.f10096m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$2", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f10097m;

        public AnonymousClass2(p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Boolean bool, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.f10097m = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.f10090o.setValue(Boolean.valueOf(this.f10097m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$3", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f10098m;

        public AnonymousClass3(p7.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Boolean bool, p7.c<? super n> cVar) {
            return ((AnonymousClass3) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
            anonymousClass3.f10098m = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.f10091p.setValue(Boolean.valueOf(this.f10098m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$4", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f10099m;

        public AnonymousClass4(p7.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Boolean bool, p7.c<? super n> cVar) {
            return ((AnonymousClass4) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(cVar);
            anonymousClass4.f10099m = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.f10092q.setValue(Boolean.valueOf(this.f10099m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$5", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements p<Integer, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ int f10100m;

        public AnonymousClass5(p7.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Integer num, p7.c<? super n> cVar) {
            return ((AnonymousClass5) a(Integer.valueOf(num.intValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(cVar);
            anonymousClass5.f10100m = ((Number) obj).intValue();
            return anonymousClass5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.f10093r.setValue(new Integer(this.f10100m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FilteringType;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @q7.c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$6", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements p<FilteringType, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f10101m;

        public AnonymousClass6(p7.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(FilteringType filteringType, p7.c<? super n> cVar) {
            return ((AnonymousClass6) a(filteringType, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(cVar);
            anonymousClass6.f10101m = obj;
            return anonymousClass6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            m0.b.n1(obj);
            NoteListWidgetConfigViewModel.this.f10094s.setValue((FilteringType) this.f10101m);
            return n.f16010a;
        }
    }

    public NoteListWidgetConfigViewModel(int i10, u6.a aVar, d dVar, b bVar, c cVar, e eVar) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(bVar, "labelRepository");
        g.f(cVar, "noteLabelRepository");
        g.f(eVar, "settingsRepository");
        this.f10080d = i10;
        this.f10081e = aVar;
        this.f10082f = dVar;
        this.f10083g = bVar;
        this.f10084h = cVar;
        this.f10085i = eVar;
        this.f10086j = f.a(new t6.a(0L, null, 2097143));
        this.f10087k = f.a(EmptyList.f12981i);
        this.f10088l = f.a(kotlin.collections.d.K1());
        this.f10089m = a1.b.C0(eVar.r(i10), a1.b.d0(this), s.a.f15450b, Boolean.FALSE);
        Boolean bool = Boolean.TRUE;
        this.n = f.a(bool);
        this.f10090o = f.a(bool);
        this.f10091p = f.a(bool);
        this.f10092q = f.a(bool);
        this.f10093r = f.a(16);
        this.f10094s = f.a(FilteringType.Inclusive);
        this.f10095t = a1.b.C0(eVar.getIcon(), a1.b.d0(this), s.a.f15449a, Icon.Futuristic);
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), eVar.l(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), eVar.Z(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), eVar.H(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), eVar.b(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), eVar.k(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass6(null), eVar.l0(i10)), a1.b.d0(this));
    }

    public final void d(long j2) {
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteListWidgetConfigViewModel$getWidgetData$1(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10081e.d(j2))), a1.b.d0(this));
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10082f.d(j2));
        b bVar = this.f10083g;
        f.b(a1.b.z(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(bVar.e(j2)), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f10084h.b()), new NoteListWidgetConfigViewModel$getWidgetData$2(this, null)), a1.b.d0(this));
        f.b(new i(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(bVar.e(j2)), new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new NoteListWidgetConfigViewModel$getWidgetData$3(null), this.f10085i.f(j2, this.f10080d)), new NoteListWidgetConfigViewModel$getWidgetData$4(this, null)), a1.b.d0(this));
    }
}
