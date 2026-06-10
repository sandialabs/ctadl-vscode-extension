package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import ja.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u6.e;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel$createOrUpdateWidget$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f10102m;
    public final /* synthetic */ NoteListWidgetConfigViewModel n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$1", f = "NoteListWidgetConfigViewModel.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10103m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10103m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                long j2 = ((t6.a) a1.b.m(noteListWidgetConfigViewModel.f10086j).getValue()).f17592a;
                this.f10103m = 1;
                if (eVar.S(noteListWidgetConfigViewModel.f10080d, j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$2", f = "NoteListWidgetConfigViewModel.kt", l = {152}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10104m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass2) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass2(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10104m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                this.f10104m = 1;
                if (eVar.c(noteListWidgetConfigViewModel.f10080d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$3", f = "NoteListWidgetConfigViewModel.kt", l = {153}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10105m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass3) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass3(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10105m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                boolean booleanValue = ((Boolean) a1.b.m(noteListWidgetConfigViewModel.n).getValue()).booleanValue();
                this.f10105m = 1;
                if (eVar.t(noteListWidgetConfigViewModel.f10080d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$4", f = "NoteListWidgetConfigViewModel.kt", l = {154}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10106m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass4) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass4(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10106m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                boolean booleanValue = ((Boolean) a1.b.m(noteListWidgetConfigViewModel.f10090o).getValue()).booleanValue();
                this.f10106m = 1;
                if (eVar.e(noteListWidgetConfigViewModel.f10080d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$5", f = "NoteListWidgetConfigViewModel.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10107m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass5) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass5(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10107m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                boolean booleanValue = ((Boolean) a1.b.m(noteListWidgetConfigViewModel.f10091p).getValue()).booleanValue();
                this.f10107m = 1;
                if (eVar.i(noteListWidgetConfigViewModel.f10080d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$6", f = "NoteListWidgetConfigViewModel.kt", l = {156}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10108m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass6) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass6(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10108m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                boolean booleanValue = ((Boolean) a1.b.m(noteListWidgetConfigViewModel.f10092q).getValue()).booleanValue();
                this.f10108m = 1;
                if (eVar.q(noteListWidgetConfigViewModel.f10080d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$7", f = "NoteListWidgetConfigViewModel.kt", l = {157}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10109m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass7) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass7(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10109m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                int intValue = ((Number) a1.b.m(noteListWidgetConfigViewModel.f10093r).getValue()).intValue();
                this.f10109m = 1;
                if (eVar.g0(noteListWidgetConfigViewModel.f10080d, intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$8", f = "NoteListWidgetConfigViewModel.kt", l = {158}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$8  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10110m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ List<Long> f10111o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, List<Long> list, p7.c<? super AnonymousClass8> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
            this.f10111o = list;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass8) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass8(this.n, this.f10111o, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10110m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                e eVar = noteListWidgetConfigViewModel.f10085i;
                int i11 = noteListWidgetConfigViewModel.f10080d;
                long j2 = ((t6.a) a1.b.m(noteListWidgetConfigViewModel.f10086j).getValue()).f17592a;
                List<Long> list = this.f10111o;
                this.f10110m = 1;
                if (eVar.f0(i11, j2, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$9", f = "NoteListWidgetConfigViewModel.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.NoteListWidgetConfigViewModel$createOrUpdateWidget$1$9  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f10112m;
        public final /* synthetic */ NoteListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super AnonymousClass9> cVar) {
            super(2, cVar);
            this.n = noteListWidgetConfigViewModel;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass9) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass9(this.n, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f10112m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
                this.f10112m = 1;
                if (noteListWidgetConfigViewModel.f10085i.m(noteListWidgetConfigViewModel.f10080d, (FilteringType) a1.b.m(noteListWidgetConfigViewModel.f10094s).getValue(), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigViewModel$createOrUpdateWidget$1(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super NoteListWidgetConfigViewModel$createOrUpdateWidget$1> cVar) {
        super(2, cVar);
        this.n = noteListWidgetConfigViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigViewModel$createOrUpdateWidget$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigViewModel$createOrUpdateWidget$1 noteListWidgetConfigViewModel$createOrUpdateWidget$1 = new NoteListWidgetConfigViewModel$createOrUpdateWidget$1(this.n, cVar);
        noteListWidgetConfigViewModel$createOrUpdateWidget$1.f10102m = obj;
        return noteListWidgetConfigViewModel$createOrUpdateWidget$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        x xVar = (x) this.f10102m;
        NoteListWidgetConfigViewModel noteListWidgetConfigViewModel = this.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) a1.b.m(noteListWidgetConfigViewModel.f10088l).getValue()).entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new Long(((t6.c) entry2.getKey()).f17615a));
        }
        b.M0(xVar, null, null, new AnonymousClass1(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass2(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass3(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass4(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass5(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass6(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass7(noteListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass8(noteListWidgetConfigViewModel, arrayList, null), 3);
        b.M0(xVar, null, null, new AnonymousClass9(noteListWidgetConfigViewModel, null), 3);
        return n.f16010a;
    }
}
