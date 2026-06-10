package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
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
@c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1", f = "FolderListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FolderListWidgetConfigViewModel$createOrUpdateWidget$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9975m;
    public final /* synthetic */ FolderListWidgetConfigViewModel n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$1", f = "FolderListWidgetConfigViewModel.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9976m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9976m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                this.f9976m = 1;
                if (eVar.c(folderListWidgetConfigViewModel.f9957d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$2", f = "FolderListWidgetConfigViewModel.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9977m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9977m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                boolean booleanValue = ((Boolean) a1.b.m(folderListWidgetConfigViewModel.f9963j).getValue()).booleanValue();
                this.f9977m = 1;
                if (eVar.t(folderListWidgetConfigViewModel.f9957d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$3", f = "FolderListWidgetConfigViewModel.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9978m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9978m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                boolean booleanValue = ((Boolean) a1.b.m(folderListWidgetConfigViewModel.f9964k).getValue()).booleanValue();
                this.f9978m = 1;
                if (eVar.e(folderListWidgetConfigViewModel.f9957d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$4", f = "FolderListWidgetConfigViewModel.kt", l = {107}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9979m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9979m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                boolean booleanValue = ((Boolean) a1.b.m(folderListWidgetConfigViewModel.f9965l).getValue()).booleanValue();
                this.f9979m = 1;
                if (eVar.i(folderListWidgetConfigViewModel.f9957d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$5", f = "FolderListWidgetConfigViewModel.kt", l = {108}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9980m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9980m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                boolean booleanValue = ((Boolean) a1.b.m(folderListWidgetConfigViewModel.f9966m).getValue()).booleanValue();
                this.f9980m = 1;
                if (eVar.q(folderListWidgetConfigViewModel.f9957d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$6", f = "FolderListWidgetConfigViewModel.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9981m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9981m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                boolean booleanValue = ((Boolean) a1.b.m(folderListWidgetConfigViewModel.n).getValue()).booleanValue();
                this.f9981m = 1;
                if (eVar.i0(folderListWidgetConfigViewModel.f9957d, this, booleanValue) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$7", f = "FolderListWidgetConfigViewModel.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: com.noto.app.widget.FolderListWidgetConfigViewModel$createOrUpdateWidget$1$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9982m;
        public final /* synthetic */ FolderListWidgetConfigViewModel n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super AnonymousClass7> cVar) {
            super(2, cVar);
            this.n = folderListWidgetConfigViewModel;
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
            int i10 = this.f9982m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
                e eVar = folderListWidgetConfigViewModel.f9960g;
                int intValue = ((Number) a1.b.m(folderListWidgetConfigViewModel.f9967o).getValue()).intValue();
                this.f9982m = 1;
                if (eVar.g0(folderListWidgetConfigViewModel.f9957d, intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigViewModel$createOrUpdateWidget$1(FolderListWidgetConfigViewModel folderListWidgetConfigViewModel, p7.c<? super FolderListWidgetConfigViewModel$createOrUpdateWidget$1> cVar) {
        super(2, cVar);
        this.n = folderListWidgetConfigViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((FolderListWidgetConfigViewModel$createOrUpdateWidget$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListWidgetConfigViewModel$createOrUpdateWidget$1 folderListWidgetConfigViewModel$createOrUpdateWidget$1 = new FolderListWidgetConfigViewModel$createOrUpdateWidget$1(this.n, cVar);
        folderListWidgetConfigViewModel$createOrUpdateWidget$1.f9975m = obj;
        return folderListWidgetConfigViewModel$createOrUpdateWidget$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        x xVar = (x) this.f9975m;
        FolderListWidgetConfigViewModel folderListWidgetConfigViewModel = this.n;
        b.M0(xVar, null, null, new AnonymousClass1(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass2(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass3(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass4(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass5(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass6(folderListWidgetConfigViewModel, null), 3);
        b.M0(xVar, null, null, new AnonymousClass7(folderListWidgetConfigViewModel, null), 3);
        return n.f16010a;
    }
}
