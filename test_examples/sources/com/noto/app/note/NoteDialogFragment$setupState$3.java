package com.noto.app.note;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.a0;
import s6.c0;
import u7.r;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lt6/d;", "note", "", "Lt6/c;", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteDialogFragment$setupState$3", f = "NoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteDialogFragment$setupState$3 extends SuspendLambda implements r<t6.a, t6.d, List<? extends t6.c>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9021m;
    public /* synthetic */ t6.d n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ List f9022o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f9023p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a0 f9024q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$setupState$3(NoteDialogFragment noteDialogFragment, a0 a0Var, p7.c<? super NoteDialogFragment$setupState$3> cVar) {
        super(4, cVar);
        this.f9023p = noteDialogFragment;
        this.f9024q = a0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:16|(1:18)(1:79)|19|(3:21|(1:25)|26)|27|(1:29)(1:78)|(1:31)(1:77)|32|(1:34)(1:76)|35|(12:37|(12:61|62|63|40|(1:42)|48|(1:50)(1:60)|51|(1:53)(1:59)|54|(1:56)(1:58)|57)|39|40|(0)|48|(0)(0)|51|(0)(0)|54|(0)(0)|57)(4:66|(4:71|72|73|69)|68|69)|43|44|45|48|(0)(0)|51|(0)(0)|54|(0)(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b0, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i10;
        int i11;
        int i12;
        int d5;
        boolean z10;
        int i13;
        int i14;
        int i15;
        Typeface b5;
        Context context;
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        int i18;
        Typeface b10;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = this.f9021m;
        t6.d dVar = this.n;
        List list = this.f9022o;
        int i19 = NoteDialogFragment.C0;
        Context j2 = this.f9023p.j();
        if (j2 != null) {
            int b11 = q.b(j2, q.j(aVar.f17595e));
            a0 a0Var = this.f9024q;
            a0Var.n.f17313a.setBackgroundTintList(q.h(q.a(j2, R.attr.notoBackgroundColor)));
            c0 c0Var = a0Var.n;
            ImageButton imageButton = c0Var.f17314b;
            v7.g.e(imageButton, "vNote.ibDrag");
            imageButton.setVisibility(8);
            String str = dVar.c;
            TextView textView = c0Var.f17321j;
            textView.setText(str);
            textView.setMaxLines(3);
            String str2 = dVar.c;
            if (!ha.i.T0(str2)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
            textView.setLinkTextColor(b11);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                String str3 = dVar.f17623d;
                if (ha.i.T0(str3)) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                int d10 = q.d(i11);
                int marginStart = marginLayoutParams.getMarginStart();
                int i20 = marginLayoutParams.topMargin;
                int marginEnd = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i20;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = d10;
                textView.setLayoutParams(marginLayoutParams);
                TextView textView2 = c0Var.f17320i;
                textView2.setText(str3);
                textView2.setMaxLines(5);
                if (!ha.i.T0(str3)) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                textView2.setVisibility(i12);
                textView2.setLinkTextColor(b11);
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (ha.i.T0(str2)) {
                        d5 = q.d(0);
                    } else {
                        d5 = q.d(4);
                    }
                    int marginStart2 = marginLayoutParams2.getMarginStart();
                    int marginEnd2 = marginLayoutParams2.getMarginEnd();
                    int i21 = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(marginStart2);
                    marginLayoutParams2.topMargin = d5;
                    marginLayoutParams2.setMarginEnd(marginEnd2);
                    marginLayoutParams2.bottomMargin = i21;
                    textView2.setLayoutParams(marginLayoutParams2);
                    String f10 = q.f(j2, R.string.created, f7.g.a(dVar.f17625f, j2));
                    TextView textView3 = c0Var.f17319h;
                    textView3.setText(f10);
                    textView3.setVisibility(0);
                    String f11 = q.f(j2, R.string.accessed, f7.g.a(dVar.f17630k, j2));
                    TextView textView4 = c0Var.f17318g;
                    textView4.setText(f11);
                    textView4.setVisibility(0);
                    LinearLayout linearLayout = c0Var.f17316e;
                    na.c cVar = dVar.f17628i;
                    if (cVar != null) {
                        Drawable background = linearLayout.getBackground();
                        if (background != null && (mutate = background.mutate()) != null) {
                            mutate.setTint(b11);
                        }
                        c0Var.f17322k.setText(f7.g.a(cVar, j2));
                    }
                    v7.g.e(linearLayout, "vNote.llReminder");
                    if (cVar != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    linearLayout.setVisibility(i13);
                    EpoxyRecyclerView epoxyRecyclerView = c0Var.f17317f;
                    v7.g.e(epoxyRecyclerView, "vNote.rv");
                    if (!list.isEmpty()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    epoxyRecyclerView.setVisibility(i14);
                    epoxyRecyclerView.setLayoutManager(new FlexboxLayoutManager(j2));
                    epoxyRecyclerView.p0(new NoteDialogFragment$setupNote$1$3(aVar, list));
                    boolean i22 = ViewUtilsKt.i();
                    Typeface typeface = null;
                    NestedScrollView nestedScrollView = a0Var.f17281a;
                    if (i22) {
                        Context context2 = nestedScrollView.getContext();
                        i15 = R.font.nunito_semibold;
                        if (context2 != null) {
                            try {
                                b10 = p2.f.b(context2, R.font.nunito_semibold);
                            } catch (Throwable unused) {
                            }
                            textView3.setTypeface(b10);
                            context = nestedScrollView.getContext();
                            if (context != null) {
                            }
                            textView4.setTypeface(typeface);
                            z11 = dVar.f17626g;
                            MaterialTextView materialTextView = a0Var.f17289j;
                            if (z11) {
                                i16 = 0;
                                materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_pin_off_24, 0, 0);
                                i17 = R.string.unpin;
                            } else {
                                i16 = 0;
                                materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_pin_24, 0, 0);
                                i17 = R.string.pin;
                            }
                            materialTextView.setText(q.f(j2, i17, new Object[i16]));
                            z12 = dVar.f17627h;
                            MaterialTextView materialTextView2 = a0Var.c;
                            if (z12) {
                                materialTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(i16, R.drawable.ic_round_unarchive_24, i16, i16);
                                materialTextView2.setText(q.f(j2, R.string.unarchive, new Object[i16]));
                            } else {
                                materialTextView2.setText(q.f(j2, R.string.archive, new Object[i16]));
                                materialTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(i16, R.drawable.ic_round_archive_24, i16, i16);
                            }
                            MaterialTextView materialTextView3 = a0Var.f17290k;
                            if (cVar == null) {
                                materialTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(i16, R.drawable.ic_round_notification_add_24, i16, i16);
                                i18 = R.string.add_note_reminder;
                            } else {
                                materialTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(i16, R.drawable.ic_round_edit_notifications_24, i16, i16);
                                i18 = R.string.edit_note_reminder;
                            }
                            materialTextView3.setText(q.f(j2, i18, new Object[i16]));
                        }
                        b10 = null;
                        textView3.setTypeface(b10);
                        context = nestedScrollView.getContext();
                        if (context != null) {
                        }
                        textView4.setTypeface(typeface);
                        z11 = dVar.f17626g;
                        MaterialTextView materialTextView4 = a0Var.f17289j;
                        if (z11) {
                        }
                        materialTextView4.setText(q.f(j2, i17, new Object[i16]));
                        z12 = dVar.f17627h;
                        MaterialTextView materialTextView22 = a0Var.c;
                        if (z12) {
                        }
                        MaterialTextView materialTextView32 = a0Var.f17290k;
                        if (cVar == null) {
                        }
                        materialTextView32.setText(q.f(j2, i18, new Object[i16]));
                    } else {
                        Context context3 = nestedScrollView.getContext();
                        i15 = R.font.nunito_semibold_italic;
                        if (context3 != null) {
                            try {
                                b5 = p2.f.b(context3, R.font.nunito_semibold_italic);
                            } catch (Throwable unused2) {
                            }
                            textView3.setTypeface(b5);
                            context = nestedScrollView.getContext();
                        }
                        b5 = null;
                        textView3.setTypeface(b5);
                        context = nestedScrollView.getContext();
                    }
                    typeface = p2.f.b(context, i15);
                    textView4.setTypeface(typeface);
                    z11 = dVar.f17626g;
                    MaterialTextView materialTextView42 = a0Var.f17289j;
                    if (z11) {
                    }
                    materialTextView42.setText(q.f(j2, i17, new Object[i16]));
                    z12 = dVar.f17627h;
                    MaterialTextView materialTextView222 = a0Var.c;
                    if (z12) {
                    }
                    MaterialTextView materialTextView322 = a0Var.f17290k;
                    if (cVar == null) {
                    }
                    materialTextView322.setText(q.f(j2, i18, new Object[i16]));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return m7.n.f16010a;
    }

    @Override // u7.r
    public final Object l0(t6.a aVar, t6.d dVar, List<? extends t6.c> list, p7.c<? super m7.n> cVar) {
        NoteDialogFragment$setupState$3 noteDialogFragment$setupState$3 = new NoteDialogFragment$setupState$3(this.f9023p, this.f9024q, cVar);
        noteDialogFragment$setupState$3.f9021m = aVar;
        noteDialogFragment$setupState$3.n = dVar;
        noteDialogFragment$setupState$3.f9022o = list;
        return noteDialogFragment$setupState$3.k(m7.n.f16010a);
    }
}
