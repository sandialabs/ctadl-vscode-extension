package com.noto.app.note;

import a7.w0;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/UndoRedoDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UndoRedoDialogFragment extends o6.b {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f9368z0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f9369u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f9370v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m7.e f9371w0;

    /* renamed from: x0  reason: collision with root package name */
    public final m7.e f9372x0;

    /* renamed from: y0  reason: collision with root package name */
    public final m7.e f9373y0;

    public UndoRedoDialogFragment() {
        super(false, 1, null);
        this.f9369u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new UndoRedoDialogFragment$special$$inlined$viewModel$default$1(this, new UndoRedoDialogFragment$viewModel$2(this)));
        this.f9370v0 = new androidx.navigation.f(v7.i.a(w0.class), new UndoRedoDialogFragment$special$$inlined$navArgs$1(this));
        this.f9371w0 = kotlin.a.b(new UndoRedoDialogFragment$clipboardManager$2(this));
        this.f9372x0 = kotlin.a.b(new UndoRedoDialogFragment$etNoteTitle$2(this));
        this.f9373y0 = kotlin.a.b(new UndoRedoDialogFragment$etNoteBody$2(this));
    }

    public static final int g0(UndoRedoDialogFragment undoRedoDialogFragment, ArrayList arrayList) {
        boolean z10;
        undoRedoDialogFragment.getClass();
        Integer valueOf = Integer.valueOf(a1.c.B0(arrayList));
        if (valueOf.intValue() == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public static final void h0(UndoRedoDialogFragment undoRedoDialogFragment, r rVar, ArrayList arrayList, String str, boolean z10, NotoColor notoColor) {
        undoRedoDialogFragment.getClass();
        rVar.f17461a.p0(new UndoRedoDialogFragment$setupItems$1(arrayList, str, notoColor, z10, undoRedoDialogFragment));
    }

    public final w0 j0() {
        return (w0) this.f9370v0.getValue();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        EditText editText;
        s c;
        v7.g.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (j0().f368d) {
            editText = (EditText) this.f9372x0.getValue();
            if (editText == null || (c = c()) == null) {
                return;
            }
        } else {
            editText = (EditText) this.f9373y0.getValue();
            if (editText == null || (c = c()) == null) {
                return;
            }
        }
        ViewUtilsKt.v(c, editText);
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i10;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.undo_redo_dialog_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i11 = R.id.rv;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
        if (epoxyRecyclerView != null) {
            i11 = R.id.tb;
            View O = a1.b.O(inflate, R.id.tb);
            if (O != null) {
                s6.c a10 = s6.c.a(O);
                r rVar = new r(linearLayout, epoxyRecyclerView, a10);
                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                j();
                epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                epoxyRecyclerView.setItemAnimator(f7.c.a());
                Context j2 = j();
                if (j2 != null) {
                    if (j0().c) {
                        i10 = R.string.undo_history;
                    } else {
                        i10 = R.string.redo_history;
                    }
                    str = q.f(j2, i10, new Object[0]);
                } else {
                    str = null;
                }
                a10.c.setText(str);
                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new UndoRedoDialogFragment$setupState$1(rVar, null), ViewUtilsKt.l(epoxyRecyclerView)), ma.i.z(this));
                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new UndoRedoDialogFragment$setupState$2(this, rVar, null), ((NoteViewModel) this.f9369u0.getValue()).f9270q), ma.i.z(this));
                v7.g.e(linearLayout, "root");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
