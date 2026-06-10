package com.noto.app.note;

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
import androidx.navigation.NavController;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.OpenNotesIn;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.a0;
import s6.c0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NoteDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteDialogFragment extends o6.b {
    public static final /* synthetic */ int C0 = 0;
    public final m7.e A0;
    public final m7.e B0;

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f8983u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f8984v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m7.e f8985w0;

    /* renamed from: x0  reason: collision with root package name */
    public final m7.e f8986x0;

    /* renamed from: y0  reason: collision with root package name */
    public final m7.e f8987y0;

    /* renamed from: z0  reason: collision with root package name */
    public final m7.e f8988z0;

    public NoteDialogFragment() {
        super(false, 1, null);
        this.f8983u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteDialogFragment$special$$inlined$viewModel$default$1(this, new NoteDialogFragment$viewModel$2(this)));
        this.f8984v0 = new androidx.navigation.f(v7.i.a(a7.a.class), new NoteDialogFragment$special$$inlined$navArgs$1(this));
        this.f8985w0 = kotlin.a.b(new NoteDialogFragment$clipboardManager$2(this));
        this.f8986x0 = kotlin.a.b(new NoteDialogFragment$alarmManager$2(this));
        this.f8987y0 = kotlin.a.b(new NoteDialogFragment$anchorViewId$2(this));
        this.f8988z0 = kotlin.a.b(new NoteDialogFragment$parentView$2(this));
        this.A0 = kotlin.a.b(new NoteDialogFragment$folderColor$2(this));
        this.B0 = kotlin.a.b(new NoteDialogFragment$selectFolderTitle$2(this));
    }

    public final Integer g0() {
        return (Integer) this.f8987y0.getValue();
    }

    public final a7.a h0() {
        return (a7.a) this.f8984v0.getValue();
    }

    public final NotoColor j0() {
        return (NotoColor) this.A0.getValue();
    }

    public final View k0() {
        return (View) this.f8988z0.getValue();
    }

    public final NoteViewModel l0() {
        return (NoteViewModel) this.f8983u0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d0 d0Var;
        String str;
        boolean z10;
        int i10;
        int i11;
        Context j2;
        int i12;
        String str2;
        androidx.navigation.i d5;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_dialog_fragment, viewGroup, false);
        int i13 = R.id.divider;
        if (a1.b.O(inflate, R.id.divider) != null) {
            i13 = R.id.divider2;
            View O = a1.b.O(inflate, R.id.divider2);
            if (O != null) {
                s6.d dVar = new s6.d(O);
                i13 = R.id.ll;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    i13 = R.id.tb;
                    View O2 = a1.b.O(inflate, R.id.tb);
                    if (O2 != null) {
                        s6.c a10 = s6.c.a(O2);
                        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_archive_note);
                        if (materialTextView != null) {
                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_copy_note);
                            if (materialTextView2 != null) {
                                MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_copy_to_clipboard);
                                if (materialTextView3 != null) {
                                    MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_delete_note);
                                    if (materialTextView4 != null) {
                                        MaterialTextView materialTextView5 = (MaterialTextView) a1.b.O(inflate, R.id.tv_duplicate_note);
                                        if (materialTextView5 != null) {
                                            MaterialTextView materialTextView6 = (MaterialTextView) a1.b.O(inflate, R.id.tv_move_note);
                                            if (materialTextView6 != null) {
                                                MaterialTextView materialTextView7 = (MaterialTextView) a1.b.O(inflate, R.id.tv_open_in);
                                                if (materialTextView7 != null) {
                                                    MaterialTextView materialTextView8 = (MaterialTextView) a1.b.O(inflate, R.id.tv_pin_note);
                                                    if (materialTextView8 != null) {
                                                        MaterialTextView materialTextView9 = (MaterialTextView) a1.b.O(inflate, R.id.tv_remind_me);
                                                        if (materialTextView9 != null) {
                                                            MaterialTextView materialTextView10 = (MaterialTextView) a1.b.O(inflate, R.id.tv_select_note);
                                                            if (materialTextView10 != null) {
                                                                MaterialTextView materialTextView11 = (MaterialTextView) a1.b.O(inflate, R.id.tv_share_note);
                                                                if (materialTextView11 != null) {
                                                                    View O3 = a1.b.O(inflate, R.id.v_note);
                                                                    if (O3 != null) {
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                                        a0 a0Var = new a0(nestedScrollView, dVar, a10, materialTextView, materialTextView2, materialTextView3, materialTextView4, materialTextView5, materialTextView6, materialTextView7, materialTextView8, materialTextView9, materialTextView10, materialTextView11, c0.a(O3));
                                                                        NavController g10 = ViewUtilsKt.g(this);
                                                                        if (g10 != null && (d5 = g10.d()) != null) {
                                                                            d0Var = d5.a();
                                                                        } else {
                                                                            d0Var = null;
                                                                        }
                                                                        materialTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.a

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9389j;

                                                                            {
                                                                                this.f9389j = this;
                                                                            }

                                                                            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
                                                                                if (r1 != false) goto L47;
                                                                             */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                NavController g11;
                                                                                androidx.navigation.o dVar2;
                                                                                boolean z11;
                                                                                androidx.navigation.i g12;
                                                                                androidx.navigation.n nVar;
                                                                                androidx.navigation.i g13;
                                                                                androidx.navigation.n nVar2;
                                                                                View k02;
                                                                                boolean z12 = true;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9389j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsArchived$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$1$1(noteDialogFragment));
                                                                                        return;
                                                                                    case 1:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        OpenNotesIn openNotesIn = ((t6.a) noteDialogFragment.l0().f9270q.getValue()).f17609t;
                                                                                        if (openNotesIn != OpenNotesIn.Editor) {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g13 = g14.g()) != null && (nVar2 = g13.f5479j) != null && nVar2.f5511k == R.id.noteFragment) {
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                z11 = false;
                                                                                            }
                                                                                            if (!z11) {
                                                                                                if (openNotesIn != OpenNotesIn.ReadingMode) {
                                                                                                    NavController g15 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                    if (g15 != null && (g12 = g15.g()) != null && (nVar = g12.f5479j) != null && nVar.f5511k == R.id.notePagerFragment) {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j10 = noteDialogFragment.h0().f253a;
                                                                                                    long j11 = noteDialogFragment.h0().f254b;
                                                                                                    long[] jArr = noteDialogFragment.h0().f257f;
                                                                                                    v7.g.f(jArr, "selectedNoteIds");
                                                                                                    dVar2 = new a7.c(j10, j11, null, null, -1, false, false, jArr);
                                                                                                    ViewUtilsKt.o(g11, dVar2, null);
                                                                                                }
                                                                                                noteDialogFragment.Z();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            long j12 = noteDialogFragment.h0().f253a;
                                                                                            long j13 = noteDialogFragment.h0().f254b;
                                                                                            long[] jArr2 = noteDialogFragment.h0().f257f;
                                                                                            v7.g.f(jArr2, "selectedNoteIds");
                                                                                            dVar2 = new a7.d(j12, j13, jArr2);
                                                                                            ViewUtilsKt.o(g11, dVar2, null);
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                        int i17 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        Context j14 = noteDialogFragment.j();
                                                                                        if (j14 != null) {
                                                                                            ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j14, (t6.a) noteDialogFragment.l0().f9270q.getValue()), ModelUtilsKt.m((t6.d) noteDialogFragment.l0().h().getValue()));
                                                                                            ClipboardManager clipboardManager = (ClipboardManager) noteDialogFragment.f8985w0.getValue();
                                                                                            if (clipboardManager != null) {
                                                                                                clipboardManager.setPrimaryClip(newPlainText);
                                                                                            }
                                                                                            if (Build.VERSION.SDK_INT <= 32 && (k02 = noteDialogFragment.k0()) != null) {
                                                                                                ViewUtilsKt.w(k02, q.e(j14, R.plurals.note_copied_to_clipboard, 1, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_copy_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i18 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        ViewUtilsKt.n(noteDialogFragment, a1.c.N0(noteDialogFragment.l0().h().getValue()));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView9.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.c

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9393j;

                                                                            {
                                                                                this.f9393j = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9393j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        NavController g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            ViewUtilsKt.o(g11, new a7.e(noteDialogFragment.h0().f253a, noteDialogFragment.h0().f254b), null);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsPinned$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$5$1(noteDialogFragment));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        boolean z11 = true;
                                                                        materialTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.a

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9389j;

                                                                            {
                                                                                this.f9389j = this;
                                                                            }

                                                                            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
                                                                                if (r1 != false) goto L47;
                                                                             */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                NavController g11;
                                                                                androidx.navigation.o dVar2;
                                                                                boolean z112;
                                                                                androidx.navigation.i g12;
                                                                                androidx.navigation.n nVar;
                                                                                androidx.navigation.i g13;
                                                                                androidx.navigation.n nVar2;
                                                                                View k02;
                                                                                boolean z12 = true;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9389j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsArchived$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$1$1(noteDialogFragment));
                                                                                        return;
                                                                                    case 1:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        OpenNotesIn openNotesIn = ((t6.a) noteDialogFragment.l0().f9270q.getValue()).f17609t;
                                                                                        if (openNotesIn != OpenNotesIn.Editor) {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g13 = g14.g()) != null && (nVar2 = g13.f5479j) != null && nVar2.f5511k == R.id.noteFragment) {
                                                                                                z112 = true;
                                                                                            } else {
                                                                                                z112 = false;
                                                                                            }
                                                                                            if (!z112) {
                                                                                                if (openNotesIn != OpenNotesIn.ReadingMode) {
                                                                                                    NavController g15 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                    if (g15 != null && (g12 = g15.g()) != null && (nVar = g12.f5479j) != null && nVar.f5511k == R.id.notePagerFragment) {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j10 = noteDialogFragment.h0().f253a;
                                                                                                    long j11 = noteDialogFragment.h0().f254b;
                                                                                                    long[] jArr = noteDialogFragment.h0().f257f;
                                                                                                    v7.g.f(jArr, "selectedNoteIds");
                                                                                                    dVar2 = new a7.c(j10, j11, null, null, -1, false, false, jArr);
                                                                                                    ViewUtilsKt.o(g11, dVar2, null);
                                                                                                }
                                                                                                noteDialogFragment.Z();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            long j12 = noteDialogFragment.h0().f253a;
                                                                                            long j13 = noteDialogFragment.h0().f254b;
                                                                                            long[] jArr2 = noteDialogFragment.h0().f257f;
                                                                                            v7.g.f(jArr2, "selectedNoteIds");
                                                                                            dVar2 = new a7.d(j12, j13, jArr2);
                                                                                            ViewUtilsKt.o(g11, dVar2, null);
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                        int i17 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        Context j14 = noteDialogFragment.j();
                                                                                        if (j14 != null) {
                                                                                            ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j14, (t6.a) noteDialogFragment.l0().f9270q.getValue()), ModelUtilsKt.m((t6.d) noteDialogFragment.l0().h().getValue()));
                                                                                            ClipboardManager clipboardManager = (ClipboardManager) noteDialogFragment.f8985w0.getValue();
                                                                                            if (clipboardManager != null) {
                                                                                                clipboardManager.setPrimaryClip(newPlainText);
                                                                                            }
                                                                                            if (Build.VERSION.SDK_INT <= 32 && (k02 = noteDialogFragment.k0()) != null) {
                                                                                                ViewUtilsKt.w(k02, q.e(j14, R.plurals.note_copied_to_clipboard, 1, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_copy_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i18 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        ViewUtilsKt.n(noteDialogFragment, a1.c.N0(noteDialogFragment.l0().h().getValue()));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.b

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9391j;

                                                                            {
                                                                                this.f9391j = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                androidx.navigation.i g11;
                                                                                d0 a11;
                                                                                androidx.navigation.i g12;
                                                                                d0 a12;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9391j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        if (noteDialogFragment.h0().f256e) {
                                                                                            NavController g13 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g13 != null && (g12 = g13.g()) != null && (a12 = g12.a()) != null) {
                                                                                                a12.e(Boolean.TRUE, "SelectAll");
                                                                                            }
                                                                                        } else {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g11 = g14.g()) != null && (a11 = g11.a()) != null) {
                                                                                                a11.e(Long.valueOf(noteDialogFragment.h0().f254b), "IsSelection");
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$duplicateNote$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$4$1(noteDialogFragment));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView8.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.c

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9393j;

                                                                            {
                                                                                this.f9393j = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9393j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        NavController g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            ViewUtilsKt.o(g11, new a7.e(noteDialogFragment.h0().f253a, noteDialogFragment.h0().f254b), null);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    default:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsPinned$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$5$1(noteDialogFragment));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.a

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9389j;

                                                                            {
                                                                                this.f9389j = this;
                                                                            }

                                                                            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
                                                                                if (r1 != false) goto L47;
                                                                             */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                NavController g11;
                                                                                androidx.navigation.o dVar2;
                                                                                boolean z112;
                                                                                androidx.navigation.i g12;
                                                                                androidx.navigation.n nVar;
                                                                                androidx.navigation.i g13;
                                                                                androidx.navigation.n nVar2;
                                                                                View k02;
                                                                                boolean z12 = true;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9389j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsArchived$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$1$1(noteDialogFragment));
                                                                                        return;
                                                                                    case 1:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        OpenNotesIn openNotesIn = ((t6.a) noteDialogFragment.l0().f9270q.getValue()).f17609t;
                                                                                        if (openNotesIn != OpenNotesIn.Editor) {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g13 = g14.g()) != null && (nVar2 = g13.f5479j) != null && nVar2.f5511k == R.id.noteFragment) {
                                                                                                z112 = true;
                                                                                            } else {
                                                                                                z112 = false;
                                                                                            }
                                                                                            if (!z112) {
                                                                                                if (openNotesIn != OpenNotesIn.ReadingMode) {
                                                                                                    NavController g15 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                    if (g15 != null && (g12 = g15.g()) != null && (nVar = g12.f5479j) != null && nVar.f5511k == R.id.notePagerFragment) {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j10 = noteDialogFragment.h0().f253a;
                                                                                                    long j11 = noteDialogFragment.h0().f254b;
                                                                                                    long[] jArr = noteDialogFragment.h0().f257f;
                                                                                                    v7.g.f(jArr, "selectedNoteIds");
                                                                                                    dVar2 = new a7.c(j10, j11, null, null, -1, false, false, jArr);
                                                                                                    ViewUtilsKt.o(g11, dVar2, null);
                                                                                                }
                                                                                                noteDialogFragment.Z();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            long j12 = noteDialogFragment.h0().f253a;
                                                                                            long j13 = noteDialogFragment.h0().f254b;
                                                                                            long[] jArr2 = noteDialogFragment.h0().f257f;
                                                                                            v7.g.f(jArr2, "selectedNoteIds");
                                                                                            dVar2 = new a7.d(j12, j13, jArr2);
                                                                                            ViewUtilsKt.o(g11, dVar2, null);
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                        int i17 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        Context j14 = noteDialogFragment.j();
                                                                                        if (j14 != null) {
                                                                                            ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j14, (t6.a) noteDialogFragment.l0().f9270q.getValue()), ModelUtilsKt.m((t6.d) noteDialogFragment.l0().h().getValue()));
                                                                                            ClipboardManager clipboardManager = (ClipboardManager) noteDialogFragment.f8985w0.getValue();
                                                                                            if (clipboardManager != null) {
                                                                                                clipboardManager.setPrimaryClip(newPlainText);
                                                                                            }
                                                                                            if (Build.VERSION.SDK_INT <= 32 && (k02 = noteDialogFragment.k0()) != null) {
                                                                                                ViewUtilsKt.w(k02, q.e(j14, R.plurals.note_copied_to_clipboard, 1, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_copy_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i18 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        ViewUtilsKt.n(noteDialogFragment, a1.c.N0(noteDialogFragment.l0().h().getValue()));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView2.setOnClickListener(new d(d0Var, this));
                                                                        materialTextView6.setOnClickListener(new f(1, this, d0Var));
                                                                        materialTextView11.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.a

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9389j;

                                                                            {
                                                                                this.f9389j = this;
                                                                            }

                                                                            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
                                                                                if (r1 != false) goto L47;
                                                                             */
                                                                            @Override // android.view.View.OnClickListener
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void onClick(View view) {
                                                                                NavController g11;
                                                                                androidx.navigation.o dVar2;
                                                                                boolean z112;
                                                                                androidx.navigation.i g12;
                                                                                androidx.navigation.n nVar;
                                                                                androidx.navigation.i g13;
                                                                                androidx.navigation.n nVar2;
                                                                                View k02;
                                                                                boolean z12 = true;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9389j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$toggleNoteIsArchived$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$1$1(noteDialogFragment));
                                                                                        return;
                                                                                    case 1:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        OpenNotesIn openNotesIn = ((t6.a) noteDialogFragment.l0().f9270q.getValue()).f17609t;
                                                                                        if (openNotesIn != OpenNotesIn.Editor) {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g13 = g14.g()) != null && (nVar2 = g13.f5479j) != null && nVar2.f5511k == R.id.noteFragment) {
                                                                                                z112 = true;
                                                                                            } else {
                                                                                                z112 = false;
                                                                                            }
                                                                                            if (!z112) {
                                                                                                if (openNotesIn != OpenNotesIn.ReadingMode) {
                                                                                                    NavController g15 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                    if (g15 != null && (g12 = g15.g()) != null && (nVar = g12.f5479j) != null && nVar.f5511k == R.id.notePagerFragment) {
                                                                                                        break;
                                                                                                    } else {
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j10 = noteDialogFragment.h0().f253a;
                                                                                                    long j11 = noteDialogFragment.h0().f254b;
                                                                                                    long[] jArr = noteDialogFragment.h0().f257f;
                                                                                                    v7.g.f(jArr, "selectedNoteIds");
                                                                                                    dVar2 = new a7.c(j10, j11, null, null, -1, false, false, jArr);
                                                                                                    ViewUtilsKt.o(g11, dVar2, null);
                                                                                                }
                                                                                                noteDialogFragment.Z();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        g11 = ViewUtilsKt.g(noteDialogFragment);
                                                                                        if (g11 != null) {
                                                                                            long j12 = noteDialogFragment.h0().f253a;
                                                                                            long j13 = noteDialogFragment.h0().f254b;
                                                                                            long[] jArr2 = noteDialogFragment.h0().f257f;
                                                                                            v7.g.f(jArr2, "selectedNoteIds");
                                                                                            dVar2 = new a7.d(j12, j13, jArr2);
                                                                                            ViewUtilsKt.o(g11, dVar2, null);
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                                                                        int i17 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        Context j14 = noteDialogFragment.j();
                                                                                        if (j14 != null) {
                                                                                            ClipData newPlainText = ClipData.newPlainText(ModelUtilsKt.o(j14, (t6.a) noteDialogFragment.l0().f9270q.getValue()), ModelUtilsKt.m((t6.d) noteDialogFragment.l0().h().getValue()));
                                                                                            ClipboardManager clipboardManager = (ClipboardManager) noteDialogFragment.f8985w0.getValue();
                                                                                            if (clipboardManager != null) {
                                                                                                clipboardManager.setPrimaryClip(newPlainText);
                                                                                            }
                                                                                            if (Build.VERSION.SDK_INT <= 32 && (k02 = noteDialogFragment.k0()) != null) {
                                                                                                ViewUtilsKt.w(k02, q.e(j14, R.plurals.note_copied_to_clipboard, 1, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_copy_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i18 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        noteDialogFragment.Z();
                                                                                        ViewUtilsKt.n(noteDialogFragment, a1.c.N0(noteDialogFragment.l0().h().getValue()));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        materialTextView4.setOnClickListener(new d(this, d0Var));
                                                                        materialTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: com.noto.app.note.b

                                                                            /* renamed from: j  reason: collision with root package name */
                                                                            public final /* synthetic */ NoteDialogFragment f9391j;

                                                                            {
                                                                                this.f9391j = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                androidx.navigation.i g11;
                                                                                d0 a11;
                                                                                androidx.navigation.i g12;
                                                                                d0 a12;
                                                                                int i14 = r2;
                                                                                NoteDialogFragment noteDialogFragment = this.f9391j;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        int i15 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        if (noteDialogFragment.h0().f256e) {
                                                                                            NavController g13 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g13 != null && (g12 = g13.g()) != null && (a12 = g12.a()) != null) {
                                                                                                a12.e(Boolean.TRUE, "SelectAll");
                                                                                            }
                                                                                        } else {
                                                                                            NavController g14 = ViewUtilsKt.g(noteDialogFragment);
                                                                                            if (g14 != null && (g11 = g14.g()) != null && (a11 = g11.a()) != null) {
                                                                                                a11.e(Long.valueOf(noteDialogFragment.h0().f254b), "IsSelection");
                                                                                            }
                                                                                        }
                                                                                        noteDialogFragment.Z();
                                                                                        return;
                                                                                    default:
                                                                                        int i16 = NoteDialogFragment.C0;
                                                                                        v7.g.f(noteDialogFragment, "this$0");
                                                                                        NoteViewModel l02 = noteDialogFragment.l0();
                                                                                        l02.getClass();
                                                                                        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$duplicateNote$1(l02, null), 3).O(new NoteDialogFragment$setupListeners$4$1(noteDialogFragment));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        Context j10 = j();
                                                                        if (j10 != null) {
                                                                            str = q.f(j10, R.string.note_options, new Object[0]);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        a10.c.setText(str);
                                                                        if (!h0().f255d && !h0().f256e) {
                                                                            z10 = false;
                                                                            if (!z10) {
                                                                                i10 = 0;
                                                                            } else {
                                                                                i10 = 8;
                                                                            }
                                                                            materialTextView10.setVisibility(i10);
                                                                            if (!h0().f255d && !h0().f256e) {
                                                                                z11 = false;
                                                                            }
                                                                            if (!z11) {
                                                                                i11 = 0;
                                                                            } else {
                                                                                i11 = 8;
                                                                            }
                                                                            O.setVisibility(i11);
                                                                            if (!h0().f256e) {
                                                                                j2 = j();
                                                                                if (j2 != null) {
                                                                                    i12 = R.string.select_all;
                                                                                    str2 = q.f(j2, i12, new Object[0]);
                                                                                }
                                                                                str2 = null;
                                                                            } else {
                                                                                j2 = j();
                                                                                if (j2 != null) {
                                                                                    i12 = R.string.select;
                                                                                    str2 = q.f(j2, i12, new Object[0]);
                                                                                }
                                                                                str2 = null;
                                                                            }
                                                                            materialTextView10.setText(str2);
                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteDialogFragment$setupState$1(this, a0Var, null), l0().f9270q), ma.i.z(this));
                                                                            kotlinx.coroutines.flow.m mVar = l0().f9270q;
                                                                            kotlinx.coroutines.flow.m h10 = l0().h();
                                                                            final kotlinx.coroutines.flow.m mVar2 = (kotlinx.coroutines.flow.m) l0().f();
                                                                            kotlinx.coroutines.flow.f.b(a1.b.z(mVar, h10, new kotlinx.coroutines.flow.b<List<? extends t6.c>>() { // from class: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1

                                                                                /* renamed from: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                /* loaded from: classes.dex */
                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f8990i;

                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                    @q7.c(c = "com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2", f = "NoteDialogFragment.kt", l = {223}, m = "emit")
                                                                                    /* renamed from: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                        public /* synthetic */ Object f8991l;

                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                        public int f8992m;

                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                            super(cVar);
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                        public final Object k(Object obj) {
                                                                                            this.f8991l = obj;
                                                                                            this.f8992m |= Integer.MIN_VALUE;
                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                        }
                                                                                    }

                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                        this.f8990i = cVar;
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
                                                                                            int i11 = anonymousClass1.f8992m;
                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                anonymousClass1.f8992m = i11 - Integer.MIN_VALUE;
                                                                                                Object obj2 = anonymousClass1.f8991l;
                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f8992m;
                                                                                                if (i10 != 0) {
                                                                                                    m0.b.n1(obj2);
                                                                                                    ArrayList h10 = ModelUtilsKt.h((Map) obj);
                                                                                                    anonymousClass1.f8992m = 1;
                                                                                                    if (this.f8990i.c(h10, anonymousClass1) == coroutineSingletons) {
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
                                                                                        Object obj22 = anonymousClass1.f8991l;
                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                        i10 = anonymousClass1.f8992m;
                                                                                        if (i10 != 0) {
                                                                                        }
                                                                                        return m7.n.f16010a;
                                                                                    }
                                                                                }

                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                public final Object a(kotlinx.coroutines.flow.c<? super List<? extends t6.c>> cVar, p7.c cVar2) {
                                                                                    Object a11 = mVar2.a(new AnonymousClass2(cVar), cVar2);
                                                                                    return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : m7.n.f16010a;
                                                                                }
                                                                            }, new NoteDialogFragment$setupState$3(this, a0Var, null)), ma.i.z(this));
                                                                            v7.g.e(nestedScrollView, "root");
                                                                            return nestedScrollView;
                                                                        }
                                                                        z10 = true;
                                                                        if (!z10) {
                                                                        }
                                                                        materialTextView10.setVisibility(i10);
                                                                        if (!h0().f255d) {
                                                                            z11 = false;
                                                                        }
                                                                        if (!z11) {
                                                                        }
                                                                        O.setVisibility(i11);
                                                                        if (!h0().f256e) {
                                                                        }
                                                                        materialTextView10.setText(str2);
                                                                        kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteDialogFragment$setupState$1(this, a0Var, null), l0().f9270q), ma.i.z(this));
                                                                        kotlinx.coroutines.flow.m mVar3 = l0().f9270q;
                                                                        kotlinx.coroutines.flow.m h102 = l0().h();
                                                                        final kotlinx.coroutines.flow.m mVar22 = (kotlinx.coroutines.flow.m) l0().f();
                                                                        kotlinx.coroutines.flow.f.b(a1.b.z(mVar3, h102, new kotlinx.coroutines.flow.b<List<? extends t6.c>>() { // from class: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1

                                                                            /* renamed from: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                            /* loaded from: classes.dex */
                                                                            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                public final /* synthetic */ kotlinx.coroutines.flow.c f8990i;

                                                                                @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                @q7.c(c = "com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2", f = "NoteDialogFragment.kt", l = {223}, m = "emit")
                                                                                /* renamed from: com.noto.app.note.NoteDialogFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                /* loaded from: classes.dex */
                                                                                public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                    /* renamed from: l  reason: collision with root package name */
                                                                                    public /* synthetic */ Object f8991l;

                                                                                    /* renamed from: m  reason: collision with root package name */
                                                                                    public int f8992m;

                                                                                    public AnonymousClass1(p7.c cVar) {
                                                                                        super(cVar);
                                                                                    }

                                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                    public final Object k(Object obj) {
                                                                                        this.f8991l = obj;
                                                                                        this.f8992m |= Integer.MIN_VALUE;
                                                                                        return AnonymousClass2.this.c(null, this);
                                                                                    }
                                                                                }

                                                                                public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                    this.f8990i = cVar;
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
                                                                                        int i11 = anonymousClass1.f8992m;
                                                                                        if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                            anonymousClass1.f8992m = i11 - Integer.MIN_VALUE;
                                                                                            Object obj22 = anonymousClass1.f8991l;
                                                                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f8992m;
                                                                                            if (i10 != 0) {
                                                                                                m0.b.n1(obj22);
                                                                                                ArrayList h10 = ModelUtilsKt.h((Map) obj);
                                                                                                anonymousClass1.f8992m = 1;
                                                                                                if (this.f8990i.c(h10, anonymousClass1) == coroutineSingletons2) {
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
                                                                                    Object obj222 = anonymousClass1.f8991l;
                                                                                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                    i10 = anonymousClass1.f8992m;
                                                                                    if (i10 != 0) {
                                                                                    }
                                                                                    return m7.n.f16010a;
                                                                                }
                                                                            }

                                                                            @Override // kotlinx.coroutines.flow.b
                                                                            public final Object a(kotlinx.coroutines.flow.c<? super List<? extends t6.c>> cVar, p7.c cVar2) {
                                                                                Object a11 = mVar22.a(new AnonymousClass2(cVar), cVar2);
                                                                                return a11 == CoroutineSingletons.COROUTINE_SUSPENDED ? a11 : m7.n.f16010a;
                                                                            }
                                                                        }, new NoteDialogFragment$setupState$3(this, a0Var, null)), ma.i.z(this));
                                                                        v7.g.e(nestedScrollView, "root");
                                                                        return nestedScrollView;
                                                                    }
                                                                    i13 = R.id.v_note;
                                                                } else {
                                                                    i13 = R.id.tv_share_note;
                                                                }
                                                            } else {
                                                                i13 = R.id.tv_select_note;
                                                            }
                                                        } else {
                                                            i13 = R.id.tv_remind_me;
                                                        }
                                                    } else {
                                                        i13 = R.id.tv_pin_note;
                                                    }
                                                } else {
                                                    i13 = R.id.tv_open_in;
                                                }
                                            } else {
                                                i13 = R.id.tv_move_note;
                                            }
                                        } else {
                                            i13 = R.id.tv_duplicate_note;
                                        }
                                    } else {
                                        i13 = R.id.tv_delete_note;
                                    }
                                } else {
                                    i13 = R.id.tv_copy_to_clipboard;
                                }
                            } else {
                                i13 = R.id.tv_copy_note;
                            }
                        } else {
                            i13 = R.id.tv_archive_note;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i13)));
    }
}
