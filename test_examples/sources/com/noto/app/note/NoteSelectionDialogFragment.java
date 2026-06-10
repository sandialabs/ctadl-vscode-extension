package com.noto.app.note;

import a7.o0;
import a7.p0;
import a7.r0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.lifecycle.w;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.y;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.PreviewRecyclerView;
import com.noto.app.util.SmoothLinearLayoutManager;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.n0;
import x6.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NoteSelectionDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteSelectionDialogFragment extends o6.b {
    public static final /* synthetic */ int B0 = 0;
    public final m7.e A0;

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f9202u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f9203v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m7.e f9204w0;

    /* renamed from: x0  reason: collision with root package name */
    public final m7.e f9205x0;

    /* renamed from: y0  reason: collision with root package name */
    public final m7.e f9206y0;

    /* renamed from: z0  reason: collision with root package name */
    public final m7.e f9207z0;

    /* loaded from: classes.dex */
    public static final class a implements w, v7.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u7.l f9215a;

        public a(u7.l lVar) {
            this.f9215a = lVar;
        }

        @Override // v7.e
        public final u7.l a() {
            return this.f9215a;
        }

        @Override // androidx.lifecycle.w
        public final /* synthetic */ void b(Object obj) {
            this.f9215a.U(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof w) && (obj instanceof v7.e)) {
                return v7.g.a(this.f9215a, ((v7.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f9215a.hashCode();
        }
    }

    public NoteSelectionDialogFragment() {
        super(false, 1, null);
        this.f9202u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteSelectionDialogFragment$special$$inlined$viewModel$default$1(this, new NoteSelectionDialogFragment$viewModel$2(this)));
        this.f9203v0 = new androidx.navigation.f(v7.i.a(p0.class), new NoteSelectionDialogFragment$special$$inlined$navArgs$1(this));
        this.f9204w0 = kotlin.a.b(new NoteSelectionDialogFragment$clipboardManager$2(this));
        this.f9205x0 = kotlin.a.b(new NoteSelectionDialogFragment$alarmManager$2(this));
        this.f9206y0 = kotlin.a.b(new NoteSelectionDialogFragment$parentView$2(this));
        this.f9207z0 = kotlin.a.b(NoteSelectionDialogFragment$anchorViewId$2.f9217j);
        this.A0 = kotlin.a.b(new NoteSelectionDialogFragment$folderColor$2(this));
    }

    public final int g0() {
        return ((Number) this.f9207z0.getValue()).intValue();
    }

    public final p0 h0() {
        return (p0) this.f9203v0.getValue();
    }

    public final NotoColor j0() {
        return (NotoColor) this.A0.getValue();
    }

    public final View k0() {
        return (View) this.f9206y0.getValue();
    }

    public final ArrayList l0() {
        List<h0> n = m0().n();
        ArrayList arrayList = new ArrayList(n7.l.Z1(n, 10));
        for (h0 h0Var : n) {
            arrayList.add(h0Var.f18683a);
        }
        return arrayList;
    }

    public final FolderViewModel m0() {
        return (FolderViewModel) this.f9202u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        String str;
        androidx.navigation.i d5;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_selection_dialog_fragment, viewGroup, false);
        int i11 = R.id.divider;
        if (a1.b.O(inflate, R.id.divider) != null) {
            i11 = R.id.divider2;
            View O = a1.b.O(inflate, R.id.divider2);
            if (O != null) {
                s6.d dVar = new s6.d(O);
                i11 = R.id.ll;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    i11 = R.id.rv;
                    PreviewRecyclerView previewRecyclerView = (PreviewRecyclerView) a1.b.O(inflate, R.id.rv);
                    if (previewRecyclerView != null) {
                        i11 = R.id.rv_labels;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv_labels);
                        if (epoxyRecyclerView != null) {
                            i11 = R.id.tb;
                            View O2 = a1.b.O(inflate, R.id.tb);
                            if (O2 != null) {
                                s6.c a10 = s6.c.a(O2);
                                i10 = R.id.tv_archive_notes;
                                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_archive_notes);
                                if (materialTextView != null) {
                                    i10 = R.id.tv_copy_notes;
                                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_copy_notes);
                                    if (materialTextView2 != null) {
                                        i10 = R.id.tv_copy_to_clipboard;
                                        MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_copy_to_clipboard);
                                        if (materialTextView3 != null) {
                                            i10 = R.id.tv_delete_notes;
                                            MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_delete_notes);
                                            if (materialTextView4 != null) {
                                                i10 = R.id.tv_duplicate_notes;
                                                MaterialTextView materialTextView5 = (MaterialTextView) a1.b.O(inflate, R.id.tv_duplicate_notes);
                                                if (materialTextView5 != null) {
                                                    i10 = R.id.tv_merge_notes;
                                                    MaterialTextView materialTextView6 = (MaterialTextView) a1.b.O(inflate, R.id.tv_merge_notes);
                                                    if (materialTextView6 != null) {
                                                        i10 = R.id.tv_move_notes;
                                                        MaterialTextView materialTextView7 = (MaterialTextView) a1.b.O(inflate, R.id.tv_move_notes);
                                                        if (materialTextView7 != null) {
                                                            i10 = R.id.tv_pin_notes;
                                                            MaterialTextView materialTextView8 = (MaterialTextView) a1.b.O(inflate, R.id.tv_pin_notes);
                                                            if (materialTextView8 != null) {
                                                                i10 = R.id.tv_reading_mode;
                                                                MaterialTextView materialTextView9 = (MaterialTextView) a1.b.O(inflate, R.id.tv_reading_mode);
                                                                if (materialTextView9 != null) {
                                                                    i10 = R.id.tv_select_all_notes;
                                                                    MaterialTextView materialTextView10 = (MaterialTextView) a1.b.O(inflate, R.id.tv_select_all_notes);
                                                                    if (materialTextView10 != null) {
                                                                        i10 = R.id.tv_share_notes;
                                                                        MaterialTextView materialTextView11 = (MaterialTextView) a1.b.O(inflate, R.id.tv_share_notes);
                                                                        if (materialTextView11 != null) {
                                                                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                                            n0 n0Var = new n0(nestedScrollView, dVar, previewRecyclerView, epoxyRecyclerView, a10, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialTextView9, materialTextView10, materialTextView11);
                                                                            Context j2 = j();
                                                                            d0 d0Var = null;
                                                                            if (j2 != null) {
                                                                                str = q.f(j2, R.string.options, new Object[0]);
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            a10.c.setText(str);
                                                                            j();
                                                                            previewRecyclerView.setLayoutManager(new SmoothLinearLayoutManager());
                                                                            y yVar = new y();
                                                                            yVar.a(previewRecyclerView);
                                                                            kotlinx.coroutines.flow.f.b(a1.b.z(m0().k(), m0().m(), m0().f8436p, new NoteSelectionDialogFragment$setupState$1(n0Var, null)), ma.i.z(this));
                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteSelectionDialogFragment$setupState$2(n0Var, this, null), m0().m()), ma.i.z(this));
                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(m0().k(), m0().f8444x, new NoteSelectionDialogFragment$setupState$3(n0Var, this, null)), ma.i.z(this));
                                                                            final kotlinx.coroutines.flow.m m10 = a1.b.m(m0().f8445y);
                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteSelectionDialogFragment$setupState$5(n0Var, null), new kotlinx.coroutines.flow.b<Integer>() { // from class: com.noto.app.note.NoteSelectionDialogFragment$setupState$$inlined$filter$1

                                                                                /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupState$$inlined$filter$1$2  reason: invalid class name */
                                                                                /* loaded from: classes.dex */
                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9209i;

                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                    @q7.c(c = "com.noto.app.note.NoteSelectionDialogFragment$setupState$$inlined$filter$1$2", f = "NoteSelectionDialogFragment.kt", l = {223}, m = "emit")
                                                                                    /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupState$$inlined$filter$1$2$1  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                        public /* synthetic */ Object f9210l;

                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                        public int f9211m;

                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                            super(cVar);
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                        public final Object k(Object obj) {
                                                                                            this.f9210l = obj;
                                                                                            this.f9211m |= Integer.MIN_VALUE;
                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                        }
                                                                                    }

                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                        this.f9209i = cVar;
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
                                                                                            int i11 = anonymousClass1.f9211m;
                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                anonymousClass1.f9211m = i11 - Integer.MIN_VALUE;
                                                                                                Object obj2 = anonymousClass1.f9210l;
                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9211m;
                                                                                                if (i10 != 0) {
                                                                                                    m0.b.n1(obj2);
                                                                                                    if (((Number) obj).intValue() != -1) {
                                                                                                        anonymousClass1.f9211m = 1;
                                                                                                        if (this.f9209i.c(obj, anonymousClass1) == coroutineSingletons) {
                                                                                                            return coroutineSingletons;
                                                                                                        }
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
                                                                                        Object obj22 = anonymousClass1.f9210l;
                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                        i10 = anonymousClass1.f9211m;
                                                                                        if (i10 != 0) {
                                                                                        }
                                                                                        return m7.n.f16010a;
                                                                                    }
                                                                                }

                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                public final Object a(kotlinx.coroutines.flow.c<? super Integer> cVar, p7.c cVar2) {
                                                                                    Object a11 = m10.a(new AnonymousClass2(cVar), cVar2);
                                                                                    return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : m7.n.f16010a;
                                                                                }
                                                                            }), ma.i.z(this));
                                                                            previewRecyclerView.h(new o0(yVar, n0Var, this));
                                                                            NavController g10 = ViewUtilsKt.g(this);
                                                                            if (g10 != null && (d5 = g10.d()) != null) {
                                                                                d0Var = d5.a();
                                                                            }
                                                                            materialTextView9.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.i

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9410j;

                                                                                {
                                                                                    this.f9410j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9410j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            NavController g11 = ViewUtilsKt.g(noteSelectionDialogFragment);
                                                                                            if (g11 != null) {
                                                                                                long j10 = noteSelectionDialogFragment.h0().f331a;
                                                                                                long j11 = ((t6.d) kotlin.collections.c.n2(noteSelectionDialogFragment.l0())).f17621a;
                                                                                                ArrayList l02 = noteSelectionDialogFragment.l0();
                                                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(l02, 10));
                                                                                                Iterator it = l02.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList.add(Long.valueOf(((t6.d) it.next()).f17621a));
                                                                                                }
                                                                                                ViewUtilsKt.o(g11, new r0(j10, j11, kotlin.collections.c.M2(arrayList)), null);
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        case 1:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            ViewUtilsKt.n(noteSelectionDialogFragment, noteSelectionDialogFragment.l0());
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        default:
                                                                                            int i15 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            Context j12 = noteSelectionDialogFragment.j();
                                                                                            if (j12 != null) {
                                                                                                ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j12, (t6.a) ((kotlinx.coroutines.flow.m) noteSelectionDialogFragment.m0().k()).getValue()), kotlin.collections.c.t2(noteSelectionDialogFragment.l0(), "\n\n", null, null, NoteSelectionDialogFragment$setupListeners$7$1$notesText$1.f9228j, 30));
                                                                                                ClipboardManager clipboardManager = (ClipboardManager) noteSelectionDialogFragment.f9204w0.getValue();
                                                                                                if (clipboardManager != null) {
                                                                                                    clipboardManager.setPrimaryClip(newPlainText);
                                                                                                }
                                                                                                if (Build.VERSION.SDK_INT <= 32) {
                                                                                                    String e10 = q.e(j12, R.plurals.note_copied_to_clipboard, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()));
                                                                                                    View k02 = noteSelectionDialogFragment.k0();
                                                                                                    if (k02 != null) {
                                                                                                        ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_copy_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.j

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9412j;

                                                                                {
                                                                                    this.f9412j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    androidx.navigation.i g11;
                                                                                    d0 a11;
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9412j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            NavController g12 = ViewUtilsKt.g(noteSelectionDialogFragment);
                                                                                            if (g12 != null && (g11 = g12.g()) != null && (a11 = g11.a()) != null) {
                                                                                                a11.e(Boolean.TRUE, "SelectAll");
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        default:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().d().O(new NoteSelectionDialogFragment$setupListeners$5$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.k

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9414j;

                                                                                {
                                                                                    this.f9414j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9414j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().q().O(new NoteSelectionDialogFragment$setupListeners$3$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                        default:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().j().O(new NoteSelectionDialogFragment$setupListeners$6$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView11.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.i

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9410j;

                                                                                {
                                                                                    this.f9410j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9410j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            NavController g11 = ViewUtilsKt.g(noteSelectionDialogFragment);
                                                                                            if (g11 != null) {
                                                                                                long j10 = noteSelectionDialogFragment.h0().f331a;
                                                                                                long j11 = ((t6.d) kotlin.collections.c.n2(noteSelectionDialogFragment.l0())).f17621a;
                                                                                                ArrayList l02 = noteSelectionDialogFragment.l0();
                                                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(l02, 10));
                                                                                                Iterator it = l02.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList.add(Long.valueOf(((t6.d) it.next()).f17621a));
                                                                                                }
                                                                                                ViewUtilsKt.o(g11, new r0(j10, j11, kotlin.collections.c.M2(arrayList)), null);
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        case 1:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            ViewUtilsKt.n(noteSelectionDialogFragment, noteSelectionDialogFragment.l0());
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        default:
                                                                                            int i15 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            Context j12 = noteSelectionDialogFragment.j();
                                                                                            if (j12 != null) {
                                                                                                ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j12, (t6.a) ((kotlinx.coroutines.flow.m) noteSelectionDialogFragment.m0().k()).getValue()), kotlin.collections.c.t2(noteSelectionDialogFragment.l0(), "\n\n", null, null, NoteSelectionDialogFragment$setupListeners$7$1$notesText$1.f9228j, 30));
                                                                                                ClipboardManager clipboardManager = (ClipboardManager) noteSelectionDialogFragment.f9204w0.getValue();
                                                                                                if (clipboardManager != null) {
                                                                                                    clipboardManager.setPrimaryClip(newPlainText);
                                                                                                }
                                                                                                if (Build.VERSION.SDK_INT <= 32) {
                                                                                                    String e10 = q.e(j12, R.plurals.note_copied_to_clipboard, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()));
                                                                                                    View k02 = noteSelectionDialogFragment.k0();
                                                                                                    if (k02 != null) {
                                                                                                        ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_copy_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.j

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9412j;

                                                                                {
                                                                                    this.f9412j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    androidx.navigation.i g11;
                                                                                    d0 a11;
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9412j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            NavController g12 = ViewUtilsKt.g(noteSelectionDialogFragment);
                                                                                            if (g12 != null && (g11 = g12.g()) != null && (a11 = g11.a()) != null) {
                                                                                                a11.e(Boolean.TRUE, "SelectAll");
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        default:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().d().O(new NoteSelectionDialogFragment$setupListeners$5$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.k

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9414j;

                                                                                {
                                                                                    this.f9414j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9414j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().q().O(new NoteSelectionDialogFragment$setupListeners$3$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                        default:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            noteSelectionDialogFragment.m0().j().O(new NoteSelectionDialogFragment$setupListeners$6$1(noteSelectionDialogFragment));
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.i

                                                                                /* renamed from: j  reason: collision with root package name */
                                                                                public final /* synthetic */ NoteSelectionDialogFragment f9410j;

                                                                                {
                                                                                    this.f9410j = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i12 = r2;
                                                                                    NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9410j;
                                                                                    switch (i12) {
                                                                                        case 0:
                                                                                            int i13 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            NavController g11 = ViewUtilsKt.g(noteSelectionDialogFragment);
                                                                                            if (g11 != null) {
                                                                                                long j10 = noteSelectionDialogFragment.h0().f331a;
                                                                                                long j11 = ((t6.d) kotlin.collections.c.n2(noteSelectionDialogFragment.l0())).f17621a;
                                                                                                ArrayList l02 = noteSelectionDialogFragment.l0();
                                                                                                ArrayList arrayList = new ArrayList(n7.l.Z1(l02, 10));
                                                                                                Iterator it = l02.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList.add(Long.valueOf(((t6.d) it.next()).f17621a));
                                                                                                }
                                                                                                ViewUtilsKt.o(g11, new r0(j10, j11, kotlin.collections.c.M2(arrayList)), null);
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        case 1:
                                                                                            int i14 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            ViewUtilsKt.n(noteSelectionDialogFragment, noteSelectionDialogFragment.l0());
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                        default:
                                                                                            int i15 = NoteSelectionDialogFragment.B0;
                                                                                            v7.g.f(noteSelectionDialogFragment, "this$0");
                                                                                            Context j12 = noteSelectionDialogFragment.j();
                                                                                            if (j12 != null) {
                                                                                                ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j12, (t6.a) ((kotlinx.coroutines.flow.m) noteSelectionDialogFragment.m0().k()).getValue()), kotlin.collections.c.t2(noteSelectionDialogFragment.l0(), "\n\n", null, null, NoteSelectionDialogFragment$setupListeners$7$1$notesText$1.f9228j, 30));
                                                                                                ClipboardManager clipboardManager = (ClipboardManager) noteSelectionDialogFragment.f9204w0.getValue();
                                                                                                if (clipboardManager != null) {
                                                                                                    clipboardManager.setPrimaryClip(newPlainText);
                                                                                                }
                                                                                                if (Build.VERSION.SDK_INT <= 32) {
                                                                                                    String e10 = q.e(j12, R.plurals.note_copied_to_clipboard, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()));
                                                                                                    View k02 = noteSelectionDialogFragment.k0();
                                                                                                    if (k02 != null) {
                                                                                                        ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_copy_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            noteSelectionDialogFragment.Z();
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            materialTextView2.setOnClickListener(new e(d0Var, 1, this));
                                                                            materialTextView7.setOnClickListener(new f(2, this, d0Var));
                                                                            materialTextView4.setOnClickListener(new n(this, d0Var));
                                                                            v7.g.e(nestedScrollView, "root");
                                                                            return nestedScrollView;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                            }
                        }
                    }
                }
            }
        }
        i10 = i11;
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
