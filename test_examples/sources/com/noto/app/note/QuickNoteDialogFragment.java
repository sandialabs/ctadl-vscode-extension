package com.noto.app.note;

import a7.t0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.o0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/noto/app/note/QuickNoteDialogFragment;", "Lo6/b;", "<init>", "()V", "Lkotlin/Function2;", "Lt6/a;", "Lt6/d;", "Lm7/n;", "onDismiss", "(Lu7/p;)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment extends o6.b {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9328y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final u7.p<? super t6.a, ? super t6.d, m7.n> f9329u0;

    /* renamed from: v0  reason: collision with root package name */
    public final m7.e f9330v0;

    /* renamed from: w0  reason: collision with root package name */
    public final androidx.navigation.f f9331w0;

    /* renamed from: x0  reason: collision with root package name */
    public o0 f9332x0;

    public QuickNoteDialogFragment() {
        super(true);
        this.f9329u0 = QuickNoteDialogFragment$onDismiss$1.f9365j;
        this.f9330v0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new QuickNoteDialogFragment$special$$inlined$viewModel$default$1(this, new QuickNoteDialogFragment$viewModel$2(this)));
        this.f9331w0 = new androidx.navigation.f(v7.i.a(t0.class), new QuickNoteDialogFragment$special$$inlined$navArgs$1(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment(u7.p<? super t6.a, ? super t6.d, m7.n> pVar) {
        this();
        v7.g.f(pVar, "onDismiss");
        this.f9329u0 = pVar;
    }

    public final NoteViewModel g0() {
        return (NoteViewModel) this.f9330v0.getValue();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        v7.g.f(dialogInterface, "dialog");
        NoteViewModel g02 = g0();
        o0 o0Var = this.f9332x0;
        if (o0Var != null) {
            String obj = o0Var.c.getText().toString();
            o0 o0Var2 = this.f9332x0;
            if (o0Var2 != null) {
                g02.d(obj, o0Var2.f17445b.getText().toString(), true);
                this.f9329u0.R(g0().f9270q.getValue(), g0().h().getValue());
                super.onDismiss(dialogInterface);
                return;
            }
            v7.g.l("binding");
            throw null;
        }
        v7.g.l("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Typeface typeface;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.quick_note_dialog_fragment, viewGroup, false);
        int i10 = R.id.et_note_body;
        EditText editText = (EditText) a1.b.O(inflate, R.id.et_note_body);
        if (editText != null) {
            i10 = R.id.et_note_title;
            EditText editText2 = (EditText) a1.b.O(inflate, R.id.et_note_title);
            if (editText2 != null) {
                i10 = R.id.rv;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                if (epoxyRecyclerView != null) {
                    i10 = R.id.tv_dialog_title;
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_dialog_title);
                    if (materialTextView != null) {
                        i10 = R.id.tv_word_count;
                        TickerView tickerView = (TickerView) a1.b.O(inflate, R.id.tv_word_count);
                        if (tickerView != null) {
                            i10 = R.id.tv_word_count_rtl;
                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_word_count_rtl);
                            if (materialTextView2 != null) {
                                o0 o0Var = new o0((LinearLayout) inflate, editText, editText2, epoxyRecyclerView, materialTextView, tickerView, materialTextView2);
                                this.f9332x0 = o0Var;
                                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                tickerView.setAnimationInterpolator(new AccelerateInterpolator());
                                Context j2 = j();
                                if (j2 != null) {
                                    try {
                                        typeface = p2.f.b(j2, R.font.nunito_semibold);
                                    } catch (Throwable unused) {
                                    }
                                    tickerView.setTypeface(typeface);
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$1(o0Var, this, null), g0().f9270q), ma.i.z(this));
                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(g0().f9270q, g0().f(), new QuickNoteDialogFragment$onCreateView$2$2(o0Var, this, null)), ma.i.z(this));
                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText2, true));
                                    kotlinx.coroutines.flow.b<String> bVar = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1

                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                            /* renamed from: i  reason: collision with root package name */
                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9334i;

                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                            @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                            /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2$1  reason: invalid class name */
                                            /* loaded from: classes.dex */
                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                /* renamed from: l  reason: collision with root package name */
                                                public /* synthetic */ Object f9335l;

                                                /* renamed from: m  reason: collision with root package name */
                                                public int f9336m;

                                                public AnonymousClass1(p7.c cVar) {
                                                    super(cVar);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object k(Object obj) {
                                                    this.f9335l = obj;
                                                    this.f9336m |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.c(null, this);
                                                }
                                            }

                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                this.f9334i = cVar;
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
                                                    int i11 = anonymousClass1.f9336m;
                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.f9336m = i11 - Integer.MIN_VALUE;
                                                        Object obj2 = anonymousClass1.f9335l;
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                        i10 = anonymousClass1.f9336m;
                                                        if (i10 != 0) {
                                                            m0.b.n1(obj2);
                                                            String obj3 = ((CharSequence) obj).toString();
                                                            anonymousClass1.f9336m = 1;
                                                            if (this.f9334i.c(obj3, anonymousClass1) == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        } else {
                                                            m0.b.n1(obj2);
                                                        }
                                                        return m7.n.f16010a;
                                                    }
                                                }
                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                Object obj22 = anonymousClass1.f9335l;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i10 = anonymousClass1.f9336m;
                                                if (i10 != 0) {
                                                }
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // kotlinx.coroutines.flow.b
                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.a(new AnonymousClass2(cVar), cVar2);
                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                        }
                                    };
                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText, true));
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$6(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2

                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                            /* renamed from: i  reason: collision with root package name */
                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9338i;

                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                            @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                            /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2$1  reason: invalid class name */
                                            /* loaded from: classes.dex */
                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                /* renamed from: l  reason: collision with root package name */
                                                public /* synthetic */ Object f9339l;

                                                /* renamed from: m  reason: collision with root package name */
                                                public int f9340m;

                                                public AnonymousClass1(p7.c cVar) {
                                                    super(cVar);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object k(Object obj) {
                                                    this.f9339l = obj;
                                                    this.f9340m |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.c(null, this);
                                                }
                                            }

                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                this.f9338i = cVar;
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
                                                    int i11 = anonymousClass1.f9340m;
                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.f9340m = i11 - Integer.MIN_VALUE;
                                                        Object obj2 = anonymousClass1.f9339l;
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                        i10 = anonymousClass1.f9340m;
                                                        if (i10 != 0) {
                                                            m0.b.n1(obj2);
                                                            String obj3 = ((CharSequence) obj).toString();
                                                            anonymousClass1.f9340m = 1;
                                                            if (this.f9338i.c(obj3, anonymousClass1) == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        } else {
                                                            m0.b.n1(obj2);
                                                        }
                                                        return m7.n.f16010a;
                                                    }
                                                }
                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                Object obj22 = anonymousClass1.f9339l;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i10 = anonymousClass1.f9340m;
                                                if (i10 != 0) {
                                                }
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // kotlinx.coroutines.flow.b
                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12.a(new AnonymousClass2(cVar), cVar2);
                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                        }
                                    }, new QuickNoteDialogFragment$onCreateView$2$5(null)))), ma.i.z(this));
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$7(o0Var, null), g0().f9271r), ma.i.z(this));
                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText, true));
                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$9(o0Var, this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3

                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                            /* renamed from: i  reason: collision with root package name */
                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9342i;

                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                            @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                            /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2$1  reason: invalid class name */
                                            /* loaded from: classes.dex */
                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                /* renamed from: l  reason: collision with root package name */
                                                public /* synthetic */ Object f9343l;

                                                /* renamed from: m  reason: collision with root package name */
                                                public int f9344m;

                                                public AnonymousClass1(p7.c cVar) {
                                                    super(cVar);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object k(Object obj) {
                                                    this.f9343l = obj;
                                                    this.f9344m |= Integer.MIN_VALUE;
                                                    return AnonymousClass2.this.c(null, this);
                                                }
                                            }

                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                this.f9342i = cVar;
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
                                                    int i11 = anonymousClass1.f9344m;
                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                        anonymousClass1.f9344m = i11 - Integer.MIN_VALUE;
                                                        Object obj2 = anonymousClass1.f9343l;
                                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                        i10 = anonymousClass1.f9344m;
                                                        if (i10 != 0) {
                                                            m0.b.n1(obj2);
                                                            String obj3 = ((CharSequence) obj).toString();
                                                            anonymousClass1.f9344m = 1;
                                                            if (this.f9342i.c(obj3, anonymousClass1) == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else if (i10 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        } else {
                                                            m0.b.n1(obj2);
                                                        }
                                                        return m7.n.f16010a;
                                                    }
                                                }
                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                Object obj22 = anonymousClass1.f9343l;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i10 = anonymousClass1.f9344m;
                                                if (i10 != 0) {
                                                }
                                                return m7.n.f16010a;
                                            }
                                        }

                                        @Override // kotlinx.coroutines.flow.b
                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13.a(new AnonymousClass2(cVar), cVar2);
                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                        }
                                    }), ma.i.z(this));
                                    LinearLayout linearLayout = o0Var.f17444a;
                                    v7.g.e(linearLayout, "root");
                                    return linearLayout;
                                }
                                typeface = null;
                                tickerView.setTypeface(typeface);
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$1(o0Var, this, null), g0().f9270q), ma.i.z(this));
                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(g0().f9270q, g0().f(), new QuickNoteDialogFragment$onCreateView$2$2(o0Var, this, null)), ma.i.z(this));
                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText2, true));
                                kotlinx.coroutines.flow.b<String> bVar2 = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1

                                    /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                        /* renamed from: i  reason: collision with root package name */
                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9334i;

                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                        @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$1$2$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                            /* renamed from: l  reason: collision with root package name */
                                            public /* synthetic */ Object f9335l;

                                            /* renamed from: m  reason: collision with root package name */
                                            public int f9336m;

                                            public AnonymousClass1(p7.c cVar) {
                                                super(cVar);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object k(Object obj) {
                                                this.f9335l = obj;
                                                this.f9336m |= Integer.MIN_VALUE;
                                                return AnonymousClass2.this.c(null, this);
                                            }
                                        }

                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                            this.f9334i = cVar;
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
                                                int i11 = anonymousClass1.f9336m;
                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                    anonymousClass1.f9336m = i11 - Integer.MIN_VALUE;
                                                    Object obj22 = anonymousClass1.f9335l;
                                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i10 = anonymousClass1.f9336m;
                                                    if (i10 != 0) {
                                                        m0.b.n1(obj22);
                                                        String obj3 = ((CharSequence) obj).toString();
                                                        anonymousClass1.f9336m = 1;
                                                        if (this.f9334i.c(obj3, anonymousClass1) == coroutineSingletons2) {
                                                            return coroutineSingletons2;
                                                        }
                                                    } else if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    } else {
                                                        m0.b.n1(obj22);
                                                    }
                                                    return m7.n.f16010a;
                                                }
                                            }
                                            anonymousClass1 = new AnonymousClass1(cVar);
                                            Object obj222 = anonymousClass1.f9335l;
                                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i10 = anonymousClass1.f9336m;
                                            if (i10 != 0) {
                                            }
                                            return m7.n.f16010a;
                                        }
                                    }

                                    @Override // kotlinx.coroutines.flow.b
                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14.a(new AnonymousClass2(cVar), cVar2);
                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                    }
                                };
                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText, true));
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$6(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar2, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2

                                    /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                        /* renamed from: i  reason: collision with root package name */
                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9338i;

                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                        @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$2$2$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                            /* renamed from: l  reason: collision with root package name */
                                            public /* synthetic */ Object f9339l;

                                            /* renamed from: m  reason: collision with root package name */
                                            public int f9340m;

                                            public AnonymousClass1(p7.c cVar) {
                                                super(cVar);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object k(Object obj) {
                                                this.f9339l = obj;
                                                this.f9340m |= Integer.MIN_VALUE;
                                                return AnonymousClass2.this.c(null, this);
                                            }
                                        }

                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                            this.f9338i = cVar;
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
                                                int i11 = anonymousClass1.f9340m;
                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                    anonymousClass1.f9340m = i11 - Integer.MIN_VALUE;
                                                    Object obj22 = anonymousClass1.f9339l;
                                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i10 = anonymousClass1.f9340m;
                                                    if (i10 != 0) {
                                                        m0.b.n1(obj22);
                                                        String obj3 = ((CharSequence) obj).toString();
                                                        anonymousClass1.f9340m = 1;
                                                        if (this.f9338i.c(obj3, anonymousClass1) == coroutineSingletons2) {
                                                            return coroutineSingletons2;
                                                        }
                                                    } else if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    } else {
                                                        m0.b.n1(obj22);
                                                    }
                                                    return m7.n.f16010a;
                                                }
                                            }
                                            anonymousClass1 = new AnonymousClass1(cVar);
                                            Object obj222 = anonymousClass1.f9339l;
                                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i10 = anonymousClass1.f9340m;
                                            if (i10 != 0) {
                                            }
                                            return m7.n.f16010a;
                                        }
                                    }

                                    @Override // kotlinx.coroutines.flow.b
                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122.a(new AnonymousClass2(cVar), cVar2);
                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                    }
                                }, new QuickNoteDialogFragment$onCreateView$2$5(null)))), ma.i.z(this));
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$7(o0Var, null), g0().f9271r), ma.i.z(this));
                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(editText, true));
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new QuickNoteDialogFragment$onCreateView$2$9(o0Var, this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3

                                    /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2  reason: invalid class name */
                                    /* loaded from: classes.dex */
                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                        /* renamed from: i  reason: collision with root package name */
                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9342i;

                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                        @q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2", f = "QuickNoteDialogFragment.kt", l = {223}, m = "emit")
                                        /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$lambda$4$$inlined$map$3$2$1  reason: invalid class name */
                                        /* loaded from: classes.dex */
                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                            /* renamed from: l  reason: collision with root package name */
                                            public /* synthetic */ Object f9343l;

                                            /* renamed from: m  reason: collision with root package name */
                                            public int f9344m;

                                            public AnonymousClass1(p7.c cVar) {
                                                super(cVar);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object k(Object obj) {
                                                this.f9343l = obj;
                                                this.f9344m |= Integer.MIN_VALUE;
                                                return AnonymousClass2.this.c(null, this);
                                            }
                                        }

                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                            this.f9342i = cVar;
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
                                                int i11 = anonymousClass1.f9344m;
                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                    anonymousClass1.f9344m = i11 - Integer.MIN_VALUE;
                                                    Object obj22 = anonymousClass1.f9343l;
                                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i10 = anonymousClass1.f9344m;
                                                    if (i10 != 0) {
                                                        m0.b.n1(obj22);
                                                        String obj3 = ((CharSequence) obj).toString();
                                                        anonymousClass1.f9344m = 1;
                                                        if (this.f9342i.c(obj3, anonymousClass1) == coroutineSingletons2) {
                                                            return coroutineSingletons2;
                                                        }
                                                    } else if (i10 != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    } else {
                                                        m0.b.n1(obj22);
                                                    }
                                                    return m7.n.f16010a;
                                                }
                                            }
                                            anonymousClass1 = new AnonymousClass1(cVar);
                                            Object obj222 = anonymousClass1.f9343l;
                                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i10 = anonymousClass1.f9344m;
                                            if (i10 != 0) {
                                            }
                                            return m7.n.f16010a;
                                        }
                                    }

                                    @Override // kotlinx.coroutines.flow.b
                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132.a(new AnonymousClass2(cVar), cVar2);
                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                    }
                                }), ma.i.z(this));
                                LinearLayout linearLayout2 = o0Var.f17444a;
                                v7.g.e(linearLayout2, "root");
                                return linearLayout2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
