package com.noto.app.note;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import f7.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import n6.c;
import s6.n0;
import x6.h0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Ln6/c;", "", "Lx6/h0;", "state", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteSelectionDialogFragment$setupState$2", f = "NoteSelectionDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupState$2 extends SuspendLambda implements u7.p<n6.c<? extends List<? extends h0>>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9244m;
    public final /* synthetic */ n0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteSelectionDialogFragment f9245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupState$2(n0 n0Var, NoteSelectionDialogFragment noteSelectionDialogFragment, p7.c<? super NoteSelectionDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = n0Var;
        this.f9245o = noteSelectionDialogFragment;
    }

    @Override // u7.p
    public final Object R(n6.c<? extends List<? extends h0>> cVar, p7.c<? super m7.n> cVar2) {
        return ((NoteSelectionDialogFragment$setupState$2) a(cVar, cVar2)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteSelectionDialogFragment$setupState$2 noteSelectionDialogFragment$setupState$2 = new NoteSelectionDialogFragment$setupState$2(this.n, this.f9245o, cVar);
        noteSelectionDialogFragment$setupState$2.f9244m = obj;
        return noteSelectionDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        View.OnClickListener onClickListener;
        String str2;
        m0.b.n1(obj);
        n6.c cVar = (n6.c) this.f9244m;
        if (cVar instanceof c.b) {
            c.b bVar = (c.b) cVar;
            Iterable<h0> iterable = (Iterable) bVar.f16111a;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (h0 h0Var : iterable) {
                    if (!h0Var.c) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) bVar.f16111a) {
                if (((h0) obj2).c) {
                    arrayList.add(obj2);
                }
            }
            final int size = arrayList.size();
            n0 n0Var = this.n;
            MaterialTextView materialTextView = n0Var.f17433e;
            v7.g.e(materialTextView, "tvSelectAllNotes");
            boolean z12 = !z10;
            int i11 = 8;
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            materialTextView.setVisibility(i10);
            View view = n0Var.f17430a.f17323a;
            v7.g.e(view, "divider2.root");
            if (z12) {
                i11 = 0;
            }
            view.setVisibility(i11);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((h0) it.next()).f18683a.f17626g) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            MaterialTextView materialTextView2 = n0Var.f17432d;
            final NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9245o;
            Drawable drawable = null;
            if (z11) {
                Context j2 = noteSelectionDialogFragment.j();
                if (j2 != null) {
                    str2 = q.f(j2, R.string.pin, new Object[0]);
                } else {
                    str2 = null;
                }
                materialTextView2.setText(str2);
                Drawable[] compoundDrawablesRelative = materialTextView2.getCompoundDrawablesRelative();
                Context j10 = noteSelectionDialogFragment.j();
                if (j10 != null) {
                    drawable = q.c(j10, R.drawable.ic_round_pin_24);
                }
                compoundDrawablesRelative[1] = drawable;
                onClickListener = new View.OnClickListener() { // from class: com.noto.app.note.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12 = NoteSelectionDialogFragment.B0;
                        NoteSelectionDialogFragment noteSelectionDialogFragment2 = NoteSelectionDialogFragment.this;
                        noteSelectionDialogFragment2.m0().s().O(new NoteSelectionDialogFragment$setupState$2$2$1(noteSelectionDialogFragment2, size));
                    }
                };
            } else {
                Context j11 = noteSelectionDialogFragment.j();
                if (j11 != null) {
                    str = q.f(j11, R.string.unpin, new Object[0]);
                } else {
                    str = null;
                }
                materialTextView2.setText(str);
                Drawable[] compoundDrawablesRelative2 = materialTextView2.getCompoundDrawablesRelative();
                Context j12 = noteSelectionDialogFragment.j();
                if (j12 != null) {
                    drawable = q.c(j12, R.drawable.ic_round_pin_off_24);
                }
                compoundDrawablesRelative2[1] = drawable;
                onClickListener = new View.OnClickListener() { // from class: com.noto.app.note.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12 = NoteSelectionDialogFragment.B0;
                        NoteSelectionDialogFragment noteSelectionDialogFragment2 = NoteSelectionDialogFragment.this;
                        noteSelectionDialogFragment2.m0().v().O(new NoteSelectionDialogFragment$setupState$2$3$1(noteSelectionDialogFragment2, size));
                    }
                };
            }
            materialTextView2.setOnClickListener(onClickListener);
        }
        return m7.n.f16010a;
    }
}
