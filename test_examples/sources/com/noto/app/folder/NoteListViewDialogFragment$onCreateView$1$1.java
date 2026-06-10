package com.noto.app.folder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.Grouping;
import com.noto.app.domain.model.NoteListSortingType;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NoteListViewDialogFragment$onCreateView$1$1", f = "NoteListViewDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListViewDialogFragment$onCreateView$1$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8674m;
    public final /* synthetic */ NoteListViewDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ h0 f8675o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListViewDialogFragment$onCreateView$1$1(NoteListViewDialogFragment noteListViewDialogFragment, h0 h0Var, p7.c<? super NoteListViewDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = noteListViewDialogFragment;
        this.f8675o = h0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteListViewDialogFragment$onCreateView$1$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteListViewDialogFragment$onCreateView$1$1 noteListViewDialogFragment$onCreateView$1$1 = new NoteListViewDialogFragment$onCreateView$1$1(this.n, this.f8675o, cVar);
        noteListViewDialogFragment$onCreateView$1$1.f8674m = obj;
        return noteListViewDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        int i11;
        int i12;
        Drawable mutate;
        Drawable mutate2;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8674m;
        Context j2 = this.n.j();
        h0 h0Var = this.f8675o;
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            ColorStateList h10 = f7.q.h(b5);
            h0Var.f17363g.c.setTextColor(b5);
            Drawable background = h0Var.f17363g.f17312d.getBackground();
            if (background != null && (mutate2 = background.mutate()) != null) {
                mutate2.setTint(b5);
            }
            Drawable background2 = h0Var.f17358a.getBackground();
            if (background2 != null && (mutate = background2.mutate()) != null) {
                mutate.setTint(b5);
            }
            for (LinearLayout linearLayout : a1.c.O0(h0Var.f17362f, h0Var.f17360d, h0Var.f17359b, h0Var.f17361e, h0Var.c)) {
                Drawable background3 = linearLayout.getBackground();
                if (background3 != null) {
                    ViewUtilsKt.s(background3, h10);
                }
            }
            int ordinal = aVar.f17608s.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i10 = R.string.strict;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = R.string.exclusive;
                }
            } else {
                i10 = R.string.inclusive;
            }
            h0Var.f17364h.setText(f7.q.f(j2, i10, new Object[0]));
            int ordinal2 = aVar.f17603m.ordinal();
            int i13 = R.string.creation_date;
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            i11 = R.string.access_date;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i11 = R.string.alphabetical;
                    }
                } else {
                    i11 = R.string.creation_date;
                }
            } else {
                i11 = R.string.manual;
            }
            h0Var.f17368l.setText(f7.q.f(j2, i11, new Object[0]));
            int ordinal3 = aVar.n.ordinal();
            int i14 = R.string.ascending;
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i12 = R.string.descending;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i12 = R.string.ascending;
            }
            h0Var.f17367k.setText(f7.q.f(j2, i12, new Object[0]));
            int ordinal4 = aVar.f17604o.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        if (ordinal4 == 3) {
                            i13 = R.string.access_date;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i13 = R.string.label;
                    }
                }
            } else {
                i13 = R.string.none;
            }
            h0Var.f17366j.setText(f7.q.f(j2, i13, new Object[0]));
            int ordinal5 = aVar.f17605p.ordinal();
            if (ordinal5 != 0) {
                if (ordinal5 == 1) {
                    i14 = R.string.descending;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            h0Var.f17365i.setText(f7.q.f(j2, i14, new Object[0]));
        }
        if (aVar.f17603m == NoteListSortingType.Manual) {
            h0Var.f17361e.setClickable(false);
            LinearLayout linearLayout2 = h0Var.f17361e;
            v7.g.e(linearLayout2, "llSortingOrder");
            ViewUtilsKt.c(linearLayout2);
        } else {
            h0Var.f17361e.setClickable(true);
            LinearLayout linearLayout3 = h0Var.f17361e;
            v7.g.e(linearLayout3, "llSortingOrder");
            ViewUtilsKt.d(linearLayout3);
        }
        if (aVar.f17604o == Grouping.None) {
            h0Var.c.setClickable(false);
            LinearLayout linearLayout4 = h0Var.c;
            v7.g.e(linearLayout4, "llGroupingOrder");
            ViewUtilsKt.c(linearLayout4);
        } else {
            h0Var.c.setClickable(true);
            LinearLayout linearLayout5 = h0Var.c;
            v7.g.e(linearLayout5, "llGroupingOrder");
            ViewUtilsKt.d(linearLayout5);
        }
        return m7.n.f16010a;
    }
}
