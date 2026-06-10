package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.i0;
import com.noto.app.domain.model.Icon;
import ja.x;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m;
import kotlinx.coroutines.flow.s;
import m0.b;
import m7.n;
import q7.c;
import u6.d;
import u6.e;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class FolderListWidgetConfigViewModel extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f9957d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.a f9958e;

    /* renamed from: f  reason: collision with root package name */
    public final d f9959f;

    /* renamed from: g  reason: collision with root package name */
    public final e f9960g;

    /* renamed from: h  reason: collision with root package name */
    public final m f9961h;

    /* renamed from: i  reason: collision with root package name */
    public final m f9962i;

    /* renamed from: j  reason: collision with root package name */
    public final StateFlowImpl f9963j;

    /* renamed from: k  reason: collision with root package name */
    public final StateFlowImpl f9964k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlowImpl f9965l;

    /* renamed from: m  reason: collision with root package name */
    public final StateFlowImpl f9966m;
    public final StateFlowImpl n;

    /* renamed from: o  reason: collision with root package name */
    public final StateFlowImpl f9967o;

    /* renamed from: p  reason: collision with root package name */
    public final m f9968p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$1", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f9969m;

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
            anonymousClass1.f9969m = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.f9963j.setValue(Boolean.valueOf(this.f9969m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$2", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f9970m;

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
            anonymousClass2.f9970m = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.f9964k.setValue(Boolean.valueOf(this.f9970m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$3", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f9971m;

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
            anonymousClass3.f9971m = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.f9965l.setValue(Boolean.valueOf(this.f9971m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$4", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f9972m;

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
            anonymousClass4.f9972m = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.f9966m.setValue(Boolean.valueOf(this.f9972m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$5", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ boolean f9973m;

        public AnonymousClass5(p7.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Boolean bool, p7.c<? super n> cVar) {
            return ((AnonymousClass5) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(cVar);
            anonymousClass5.f9973m = ((Boolean) obj).booleanValue();
            return anonymousClass5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.n.setValue(Boolean.valueOf(this.f9973m));
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$6", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements p<Integer, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ int f9974m;

        public AnonymousClass6(p7.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
        }

        @Override // u7.p
        public final Object R(Integer num, p7.c<? super n> cVar) {
            return ((AnonymousClass6) a(Integer.valueOf(num.intValue()), cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(cVar);
            anonymousClass6.f9974m = ((Number) obj).intValue();
            return anonymousClass6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            b.n1(obj);
            FolderListWidgetConfigViewModel.this.f9967o.setValue(new Integer(this.f9974m));
            return n.f16010a;
        }
    }

    public FolderListWidgetConfigViewModel(int i10, u6.a aVar, d dVar, e eVar) {
        g.f(aVar, "folderRepository");
        g.f(dVar, "noteRepository");
        g.f(eVar, "settingsRepository");
        this.f9957d = i10;
        this.f9958e = aVar;
        this.f9959f = dVar;
        this.f9960g = eVar;
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new i(aVar.e(), dVar.h(), new FolderListWidgetConfigViewModel$folders$1(null)));
        x d02 = a1.b.d0(this);
        StartedLazily startedLazily = s.a.f15450b;
        this.f9961h = a1.b.C0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, d02, startedLazily, EmptyList.f12981i);
        this.f9962i = a1.b.C0(eVar.r(i10), a1.b.d0(this), startedLazily, Boolean.FALSE);
        Boolean bool = Boolean.TRUE;
        this.f9963j = f.a(bool);
        this.f9964k = f.a(bool);
        this.f9965l = f.a(bool);
        this.f9966m = f.a(bool);
        this.n = f.a(bool);
        this.f9967o = f.a(16);
        this.f9968p = a1.b.C0(eVar.getIcon(), a1.b.d0(this), s.a.f15449a, Icon.Futuristic);
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), eVar.l(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), eVar.Z(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), eVar.H(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), eVar.b(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), eVar.G(i10)), a1.b.d0(this));
        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass6(null), eVar.k(i10)), a1.b.d0(this));
    }
}
