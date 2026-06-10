package com.noto.app.note;

import a7.c0;
import a7.t;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.note.NoteFragment;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ViewUtilsKt;
import com.robinhood.ticker.TickerView;
import f7.q;
import f7.y;
import f7.z;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NoteFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteFragment extends Fragment {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f9026f0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f9027d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteFragment$special$$inlined$viewModel$default$1(this, new NoteFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.navigation.f f9028e0 = new androidx.navigation.f(v7.i.a(t.class), new NoteFragment$special$$inlined$navArgs$1(this));

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z(NoteFragment noteFragment, b0 b0Var, List list, String str) {
        boolean z10;
        ImageButton imageButton;
        ImageButton imageButton2;
        Context j2;
        Drawable drawable;
        Context j10;
        Drawable drawable2;
        Context j11;
        Drawable drawable3;
        Context j12;
        noteFragment.getClass();
        Triple triple = (Triple) kotlin.collections.c.w2(list);
        boolean z11 = false;
        if (triple == null) {
            triple = new Triple(0, 0, "");
        }
        if (!ha.i.T0((CharSequence) triple.f12974k)) {
            int intValue = ((Number) triple.f12973j).intValue();
            String substring = ((String) triple.f12974k).substring(a1.c.c0(((Number) triple.f12972i).intValue(), 0, intValue), intValue);
            v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Character z12 = ha.j.z1(substring);
            if (z12 == null || !a1.b.o0(z12.charValue())) {
                z10 = false;
                if (list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!ha.i.T0((CharSequence) ((Triple) it.next()).f12974k)) {
                            break;
                        }
                    }
                }
                z11 = true;
                if (!z11) {
                    ImageButton imageButton3 = b0Var.f17301h;
                    v7.g.e(imageButton3, "ibUndo");
                    ViewUtilsKt.c(imageButton3);
                    ImageButton imageButton4 = b0Var.f17299f;
                    v7.g.e(imageButton4, "ibRedo");
                    ViewUtilsKt.c(imageButton4);
                    ImageButton imageButton5 = b0Var.f17302i;
                    v7.g.e(imageButton5, "ibUndoHistory");
                    ViewUtilsKt.c(imageButton5);
                    imageButton = b0Var.f17300g;
                } else {
                    if (v7.g.a(((Triple) kotlin.collections.c.n2(list)).f12974k, str)) {
                        ImageButton imageButton6 = b0Var.f17301h;
                        v7.g.e(imageButton6, "ibUndo");
                        ViewUtilsKt.c(imageButton6);
                        ImageButton imageButton7 = b0Var.f17302i;
                        v7.g.e(imageButton7, "ibUndoHistory");
                        ViewUtilsKt.c(imageButton7);
                        int size = list.size();
                        ImageButton imageButton8 = b0Var.f17299f;
                        v7.g.e(imageButton8, "ibRedo");
                        imageButton2 = b0Var.f17300g;
                        if (size > 1) {
                            ViewUtilsKt.d(imageButton8);
                            v7.g.e(imageButton2, "ibRedoHistory");
                            if (z10) {
                                ViewUtilsKt.d(imageButton2);
                            }
                        } else {
                            ViewUtilsKt.c(imageButton8);
                            v7.g.e(imageButton2, "ibRedoHistory");
                        }
                        ViewUtilsKt.c(imageButton2);
                    } else if (v7.g.a(((Triple) kotlin.collections.c.v2(list)).f12974k, str)) {
                        ImageButton imageButton9 = b0Var.f17299f;
                        v7.g.e(imageButton9, "ibRedo");
                        ViewUtilsKt.c(imageButton9);
                        ImageButton imageButton10 = b0Var.f17300g;
                        v7.g.e(imageButton10, "ibRedoHistory");
                        ViewUtilsKt.c(imageButton10);
                        int size2 = list.size();
                        ImageButton imageButton11 = b0Var.f17301h;
                        v7.g.e(imageButton11, "ibUndo");
                        imageButton2 = b0Var.f17302i;
                        if (size2 > 1) {
                            ViewUtilsKt.d(imageButton11);
                            v7.g.e(imageButton2, "ibUndoHistory");
                        } else {
                            ViewUtilsKt.c(imageButton11);
                            v7.g.e(imageButton2, "ibUndoHistory");
                        }
                        ViewUtilsKt.c(imageButton2);
                    } else {
                        ImageButton imageButton12 = b0Var.f17301h;
                        v7.g.e(imageButton12, "ibUndo");
                        ViewUtilsKt.d(imageButton12);
                        ImageButton imageButton13 = b0Var.f17299f;
                        v7.g.e(imageButton13, "ibRedo");
                        ViewUtilsKt.d(imageButton13);
                        ImageButton imageButton14 = b0Var.f17302i;
                        v7.g.e(imageButton14, "ibUndoHistory");
                        ImageButton imageButton15 = b0Var.f17300g;
                        if (z10) {
                            ViewUtilsKt.d(imageButton14);
                            v7.g.e(imageButton15, "ibRedoHistory");
                            ViewUtilsKt.d(imageButton15);
                        } else {
                            ViewUtilsKt.c(imageButton14);
                            imageButton = imageButton15;
                        }
                    }
                    ImageButton imageButton16 = b0Var.f17301h;
                    j2 = noteFragment.j();
                    Drawable drawable4 = null;
                    if (j2 != null) {
                        drawable = q.c(j2, R.drawable.generic_clickable_shape);
                    } else {
                        drawable = null;
                    }
                    imageButton16.setBackground(drawable);
                    j10 = noteFragment.j();
                    if (j10 != null) {
                        drawable2 = q.c(j10, R.drawable.generic_clickable_shape);
                    } else {
                        drawable2 = null;
                    }
                    b0Var.f17299f.setBackground(drawable2);
                    j11 = noteFragment.j();
                    if (j11 != null) {
                        drawable3 = q.c(j11, R.drawable.generic_clickable_shape);
                    } else {
                        drawable3 = null;
                    }
                    b0Var.f17302i.setBackground(drawable3);
                    j12 = noteFragment.j();
                    if (j12 != null) {
                        drawable4 = q.c(j12, R.drawable.generic_clickable_shape);
                    }
                    b0Var.f17300g.setBackground(drawable4);
                }
                v7.g.e(imageButton, "ibRedoHistory");
                ViewUtilsKt.c(imageButton);
                ImageButton imageButton162 = b0Var.f17301h;
                j2 = noteFragment.j();
                Drawable drawable42 = null;
                if (j2 != null) {
                }
                imageButton162.setBackground(drawable);
                j10 = noteFragment.j();
                if (j10 != null) {
                }
                b0Var.f17299f.setBackground(drawable2);
                j11 = noteFragment.j();
                if (j11 != null) {
                }
                b0Var.f17302i.setBackground(drawable3);
                j12 = noteFragment.j();
                if (j12 != null) {
                }
                b0Var.f17300g.setBackground(drawable42);
            }
        }
        z10 = true;
        if (list.isEmpty()) {
        }
        z11 = true;
        if (!z11) {
        }
        v7.g.e(imageButton, "ibRedoHistory");
        ViewUtilsKt.c(imageButton);
        ImageButton imageButton1622 = b0Var.f17301h;
        j2 = noteFragment.j();
        Drawable drawable422 = null;
        if (j2 != null) {
        }
        imageButton1622.setBackground(drawable);
        j10 = noteFragment.j();
        if (j10 != null) {
        }
        b0Var.f17299f.setBackground(drawable2);
        j11 = noteFragment.j();
        if (j11 != null) {
        }
        b0Var.f17302i.setBackground(drawable3);
        j12 = noteFragment.j();
        if (j12 != null) {
        }
        b0Var.f17300g.setBackground(drawable422);
    }

    public static List d0(String str, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (v7.g.a(((Triple) it.next()).f12974k, str)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return list.subList(i10, list.size());
    }

    public static List e0(String str, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (v7.g.a(((Triple) it.next()).f12974k, str)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        return list.subList(0, i10 + 1);
    }

    public final t a0() {
        return (t) this.f9028e0.getValue();
    }

    public final NoteViewModel b0() {
        return (NoteViewModel) this.f9027d0.getValue();
    }

    public final void c0(CustomEditText customEditText, int i10) {
        customEditText.setSelection(i10);
        customEditText.requestFocus();
        s c = c();
        if (c != null) {
            ViewUtilsKt.v(c, customEditText);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:37|(28:115|116|117|40|(1:114)(1:44)|45|(2:47|(21:51|52|(2:54|(18:58|59|(2:61|(14:65|66|(1:68)|(1:70)|71|(1:110)(1:75)|(1:77)(1:109)|78|(7:80|(7:94|95|96|83|(1:85)|91|92)|82|83|(0)|91|92)(4:99|(4:104|105|106|102)|101|102)|86|87|88|91|92))|111|66|(0)|(0)|71|(1:73)|110|(0)(0)|78|(0)(0)|86|87|88|91|92))|112|59|(0)|111|66|(0)|(0)|71|(0)|110|(0)(0)|78|(0)(0)|86|87|88|91|92))|113|52|(0)|112|59|(0)|111|66|(0)|(0)|71|(0)|110|(0)(0)|78|(0)(0)|86|87|88|91|92)|39|40|(1:42)|114|45|(0)|113|52|(0)|112|59|(0)|111|66|(0)|(0)|71|(0)|110|(0)(0)|78|(0)(0)|86|87|88|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0559, code lost:
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0538  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Typeface b5;
        NavController g10;
        d0 d0Var;
        kotlinx.coroutines.flow.b flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
        kotlinx.coroutines.flow.b h10;
        kotlinx.coroutines.flow.b h11;
        s c;
        androidx.activity.l lVar;
        boolean i10;
        Typeface b10;
        Context j2;
        Typeface b11;
        OnBackPressedDispatcher onBackPressedDispatcher;
        androidx.navigation.i d5;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_fragment, viewGroup, false);
        int i11 = R.id.abl;
        AppBarLayout appBarLayout = (AppBarLayout) a1.b.O(inflate, R.id.abl);
        if (appBarLayout != null) {
            i11 = R.id.bab;
            BottomAppBar bottomAppBar = (BottomAppBar) a1.b.O(inflate, R.id.bab);
            if (bottomAppBar != null) {
                i11 = R.id.bab_toolbar;
                BottomAppBar bottomAppBar2 = (BottomAppBar) a1.b.O(inflate, R.id.bab_toolbar);
                if (bottomAppBar2 != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    i11 = R.id.et_note_body;
                    CustomEditText customEditText = (CustomEditText) a1.b.O(inflate, R.id.et_note_body);
                    if (customEditText != null) {
                        i11 = R.id.et_note_title;
                        CustomEditText customEditText2 = (CustomEditText) a1.b.O(inflate, R.id.et_note_title);
                        if (customEditText2 != null) {
                            i11 = R.id.ib_redo;
                            ImageButton imageButton = (ImageButton) a1.b.O(inflate, R.id.ib_redo);
                            if (imageButton != null) {
                                i11 = R.id.ib_redo_history;
                                ImageButton imageButton2 = (ImageButton) a1.b.O(inflate, R.id.ib_redo_history);
                                if (imageButton2 != null) {
                                    i11 = R.id.ib_undo;
                                    ImageButton imageButton3 = (ImageButton) a1.b.O(inflate, R.id.ib_undo);
                                    if (imageButton3 != null) {
                                        i11 = R.id.ib_undo_history;
                                        ImageButton imageButton4 = (ImageButton) a1.b.O(inflate, R.id.ib_undo_history);
                                        if (imageButton4 != null) {
                                            i11 = R.id.ll;
                                            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                                                i11 = R.id.nsv;
                                                NestedScrollView nestedScrollView = (NestedScrollView) a1.b.O(inflate, R.id.nsv);
                                                if (nestedScrollView != null) {
                                                    i11 = R.id.rv;
                                                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                                                    if (epoxyRecyclerView != null) {
                                                        i11 = R.id.tb;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                                        if (materialToolbar != null) {
                                                            i11 = R.id.tv_accessed_at;
                                                            MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_accessed_at);
                                                            if (materialTextView != null) {
                                                                i11 = R.id.tv_created_at;
                                                                MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_created_at);
                                                                if (materialTextView2 != null) {
                                                                    i11 = R.id.tv_folder_title;
                                                                    MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_title);
                                                                    if (materialTextView3 != null) {
                                                                        i11 = R.id.tv_word_count;
                                                                        TickerView tickerView = (TickerView) a1.b.O(inflate, R.id.tv_word_count);
                                                                        if (tickerView != null) {
                                                                            i11 = R.id.tv_word_count_rtl;
                                                                            MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_word_count_rtl);
                                                                            if (materialTextView4 != null) {
                                                                                b0 b0Var = new b0(coordinatorLayout, appBarLayout, bottomAppBar, bottomAppBar2, customEditText, customEditText2, imageButton, imageButton2, imageButton3, imageButton4, nestedScrollView, epoxyRecyclerView, materialToolbar, materialTextView, materialTextView2, materialTextView3, tickerView, materialTextView4);
                                                                                epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                                                                appBarLayout.bringToFront();
                                                                                tickerView.setAnimationInterpolator(new AccelerateInterpolator());
                                                                                Context j10 = j();
                                                                                Typeface typeface = null;
                                                                                int i12 = R.font.nunito_semibold;
                                                                                if (j10 != null) {
                                                                                    try {
                                                                                        b5 = p2.f.b(j10, R.font.nunito_semibold);
                                                                                    } catch (Throwable unused) {
                                                                                    }
                                                                                    tickerView.setTypeface(b5);
                                                                                    NoteViewModel b02 = b0();
                                                                                    b02.getClass();
                                                                                    m0.b.M0(a1.b.d0(b02), null, null, new NoteViewModel$updateNoteAccessDate$1(b02, null), 3);
                                                                                    g10 = ViewUtilsKt.g(this);
                                                                                    if (g10 == null && (d5 = g10.d()) != null) {
                                                                                        d0Var = d5.a();
                                                                                    } else {
                                                                                        d0Var = null;
                                                                                    }
                                                                                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$1(b0Var, this, null), b0().f9270q);
                                                                                    NoteFragment$setupState$2 noteFragment$setupState$2 = NoteFragment$setupState$2.f9082j;
                                                                                    u7.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f15243b;
                                                                                    if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 instanceof DistinctFlowImpl) {
                                                                                        DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
                                                                                        if (distinctFlowImpl.f15212j == noteFragment$setupState$2 && distinctFlowImpl.f15213k == pVar) {
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$3(b0Var, this, null), flowKt__TransformKt$onEach$$inlined$unsafeTransform$1), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(a1.b.z(b0().h(), b0().f9273t, a1.b.m(b0().f9269p), new NoteFragment$setupState$4(b0Var, this, null)), ma.i.z(this));
                                                                                            h10 = b0().h();
                                                                                            NoteFragment$setupState$5 noteFragment$setupState$5 = NoteFragment$setupState$5.f9102j;
                                                                                            if (h10 instanceof DistinctFlowImpl) {
                                                                                                DistinctFlowImpl distinctFlowImpl2 = (DistinctFlowImpl) h10;
                                                                                                if (distinctFlowImpl2.f15212j == noteFragment$setupState$5 && distinctFlowImpl2.f15213k == pVar) {
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$6(b0Var, null), h10), ma.i.z(this));
                                                                                                    h11 = b0().h();
                                                                                                    NoteFragment$setupState$7 noteFragment$setupState$7 = NoteFragment$setupState$7.f9104j;
                                                                                                    if (h11 instanceof DistinctFlowImpl) {
                                                                                                        DistinctFlowImpl distinctFlowImpl3 = (DistinctFlowImpl) h11;
                                                                                                        if (distinctFlowImpl3.f15212j == noteFragment$setupState$7 && distinctFlowImpl3.f15213k == pVar) {
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$8(b0Var, this, null), h11), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$9(b0Var, null), b0().f9271r), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(b0().f9270q, b0().f(), new NoteFragment$setupState$10(b0Var, this, null)), ma.i.z(this));
                                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$1

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9030i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9031l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9032m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9031l = obj;
                                                                                                                            this.f9032m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9030i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9032m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9032m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9031l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9032m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9032m = 1;
                                                                                                                                    if (this.f9030i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9031l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9032m;
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
                                                                                                            }, ViewUtilsKt.y(customEditText), new NoteFragment$setupState$12(b0Var, this, null)), ma.i.z(this));
                                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                                            kotlinx.coroutines.flow.b<String> bVar = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$2

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9034i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9035l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9036m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9035l = obj;
                                                                                                                            this.f9036m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9034i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9036m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9036m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9035l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9036m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9036m = 1;
                                                                                                                                    if (this.f9034i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9035l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9036m;
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
                                                                                                            };
                                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$16(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$3

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9038i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9039l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9040m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9039l = obj;
                                                                                                                            this.f9040m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9038i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9040m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9040m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9039l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9040m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9040m = 1;
                                                                                                                                    if (this.f9038i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9039l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9040m;
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
                                                                                                            }, new NoteFragment$setupState$15(null)))), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9274u), ViewUtilsKt.a(customEditText2), new NoteFragment$setupState$17(this, null)), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9275v), ViewUtilsKt.a(customEditText), new NoteFragment$setupState$18(this, null)), ma.i.z(this));
                                                                                                            final kotlinx.coroutines.flow.b d10 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$19(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true))));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$21(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$4

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9042i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9043l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9044m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9043l = obj;
                                                                                                                            this.f9044m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9042i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9044m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9044m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9043l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9044m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9044m = 1;
                                                                                                                                    if (this.f9042i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9043l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9044m;
                                                                                                                        if (i10 != 0) {
                                                                                                                        }
                                                                                                                        return m7.n.f16010a;
                                                                                                                    }
                                                                                                                }

                                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                                                                                                    Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar), cVar2);
                                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                                }
                                                                                                            }), ma.i.z(this));
                                                                                                            final kotlinx.coroutines.flow.b d11 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$22(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true))));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$24(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$5

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9046i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9047l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9048m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9047l = obj;
                                                                                                                            this.f9048m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9046i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9048m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9048m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9047l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9048m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9048m = 1;
                                                                                                                                    if (this.f9046i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9047l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9048m;
                                                                                                                        if (i10 != 0) {
                                                                                                                        }
                                                                                                                        return m7.n.f16010a;
                                                                                                                    }
                                                                                                                }

                                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                                                                                                    Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar), cVar2);
                                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                                }
                                                                                                            }), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.l j11 = b0().j();
                                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$27(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(j11, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$6

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9050i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9051l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9052m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9051l = obj;
                                                                                                                            this.f9052m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9050i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9052m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9052m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9051l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9052m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9052m = 1;
                                                                                                                                    if (this.f9050i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9051l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9052m;
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
                                                                                                            }, ViewUtilsKt.j(customEditText2), new NoteFragment$setupState$26(null)))), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.l e10 = b0().e();
                                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$30(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(e10, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$7

                                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2  reason: invalid class name */
                                                                                                                /* loaded from: classes.dex */
                                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9054i;

                                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2$1  reason: invalid class name */
                                                                                                                    /* loaded from: classes.dex */
                                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                                        public /* synthetic */ Object f9055l;

                                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                                        public int f9056m;

                                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                                            super(cVar);
                                                                                                                        }

                                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                        public final Object k(Object obj) {
                                                                                                                            this.f9055l = obj;
                                                                                                                            this.f9056m |= Integer.MIN_VALUE;
                                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                        this.f9054i = cVar;
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
                                                                                                                            int i11 = anonymousClass1.f9056m;
                                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                                anonymousClass1.f9056m = i11 - Integer.MIN_VALUE;
                                                                                                                                Object obj2 = anonymousClass1.f9055l;
                                                                                                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                                i10 = anonymousClass1.f9056m;
                                                                                                                                if (i10 != 0) {
                                                                                                                                    m0.b.n1(obj2);
                                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                                    anonymousClass1.f9056m = 1;
                                                                                                                                    if (this.f9054i.c(obj3, anonymousClass1) == coroutineSingletons) {
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
                                                                                                                        Object obj22 = anonymousClass1.f9055l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9056m;
                                                                                                                        if (i10 != 0) {
                                                                                                                        }
                                                                                                                        return m7.n.f16010a;
                                                                                                                    }
                                                                                                                }

                                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar, p7.c cVar2) {
                                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15.a(new AnonymousClass2(cVar), cVar2);
                                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                                }
                                                                                                            }, ViewUtilsKt.j(customEditText), new NoteFragment$setupState$29(null)))), ma.i.z(this));
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$31(b0Var, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(nestedScrollView))), ma.i.z(this));
                                                                                                            CoordinatorLayout coordinatorLayout2 = b0Var.f17295a;
                                                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$32(b0Var, null), ViewUtilsKt.m(coordinatorLayout2)), ma.i.z(this));
                                                                                                            if (d0Var != null) {
                                                                                                                d0Var.c("NoteTitle").d(r(), new c0(new NoteFragment$setupState$33(this)));
                                                                                                            }
                                                                                                            if (d0Var != null) {
                                                                                                                d0Var.c("NoteBody").d(r(), new c0(new NoteFragment$setupState$34(this)));
                                                                                                            }
                                                                                                            g gVar = new g(1, b0Var);
                                                                                                            MaterialToolbar materialToolbar2 = b0Var.f17305l;
                                                                                                            materialToolbar2.setOnClickListener(gVar);
                                                                                                            o6.c cVar = new o6.c(5, this);
                                                                                                            BottomAppBar bottomAppBar3 = b0Var.f17296b;
                                                                                                            bottomAppBar3.setNavigationOnClickListener(cVar);
                                                                                                            bottomAppBar3.setOnTouchListener(new y(new GestureDetector(bottomAppBar3.getContext(), new a7.l(this))));
                                                                                                            NoteFragment$setupListeners$backCallback$1 noteFragment$setupListeners$backCallback$1 = new NoteFragment$setupListeners$backCallback$1(this, b0Var);
                                                                                                            c = c();
                                                                                                            if (c == null && (onBackPressedDispatcher = c.f417p) != null) {
                                                                                                                lVar = a1.b.j(onBackPressedDispatcher, r(), new NoteFragment$setupListeners$4(noteFragment$setupListeners$backCallback$1), 2);
                                                                                                            } else {
                                                                                                                lVar = null;
                                                                                                            }
                                                                                                            if (lVar != null) {
                                                                                                                lVar.b(true);
                                                                                                            }
                                                                                                            materialToolbar2.setNavigationOnClickListener(new h6.b(8, noteFragment$setupListeners$backCallback$1));
                                                                                                            bottomAppBar3.setOnMenuItemClickListener(new Toolbar.h() { // from class: a7.i
                                                                                                                @Override // androidx.appcompat.widget.Toolbar.h
                                                                                                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                                                                    NavController g11;
                                                                                                                    androidx.navigation.o zVar;
                                                                                                                    int i13 = NoteFragment.f9026f0;
                                                                                                                    NoteFragment noteFragment = NoteFragment.this;
                                                                                                                    v7.g.f(noteFragment, "this$0");
                                                                                                                    switch (menuItem.getItemId()) {
                                                                                                                        case R.id.add_reminder /* 2131361948 */:
                                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                            if (g11 != null) {
                                                                                                                                zVar = new z(noteFragment.a0().f348a, ((t6.d) noteFragment.b0().h().getValue()).f17621a);
                                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case R.id.more /* 2131362259 */:
                                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                            if (g11 != null) {
                                                                                                                                long j12 = noteFragment.a0().f348a;
                                                                                                                                long j13 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                                long[] jArr = noteFragment.a0().f354h;
                                                                                                                                v7.g.f(jArr, "selectedNoteIds");
                                                                                                                                zVar = new x(j12, j13, false, false, jArr);
                                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case R.id.reading_mode /* 2131362377 */:
                                                                                                                            f7.c.e(noteFragment);
                                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                            if (g11 != null) {
                                                                                                                                long j14 = noteFragment.a0().f348a;
                                                                                                                                long j15 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                                long[] jArr2 = noteFragment.a0().f354h;
                                                                                                                                v7.g.f(jArr2, "selectedNoteIds");
                                                                                                                                zVar = new y(j14, j15, jArr2);
                                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case R.id.share_note /* 2131362440 */:
                                                                                                                            ViewUtilsKt.n(noteFragment, a1.c.N0(noteFragment.b0().h().getValue()));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            return false;
                                                                                                                    }
                                                                                                                    return true;
                                                                                                                }
                                                                                                            });
                                                                                                            b0Var.f17301h.setOnClickListener(new a7.j(b0Var, this));
                                                                                                            b0Var.f17299f.setOnClickListener(new n(b0Var, 2, this));
                                                                                                            b0Var.f17302i.setOnClickListener(new e(this, 0, b0Var));
                                                                                                            b0Var.f17300g.setOnClickListener(new a7.j(this, b0Var));
                                                                                                            CustomEditText customEditText3 = b0Var.f17298e;
                                                                                                            v7.g.e(customEditText3, "etNoteTitle");
                                                                                                            customEditText3.setOnTouchListener(new z(new GestureDetector(customEditText3.getContext(), new a7.m(this))));
                                                                                                            CustomEditText customEditText4 = b0Var.f17297d;
                                                                                                            v7.g.e(customEditText4, "etNoteBody");
                                                                                                            customEditText4.setOnTouchListener(new z(new GestureDetector(customEditText4.getContext(), new a7.n(this))));
                                                                                                            final GestureDetector gestureDetector = new GestureDetector(S(), new a7.o(b0Var));
                                                                                                            b0Var.f17303j.setOnTouchListener(new View.OnTouchListener() { // from class: a7.k
                                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                                    int i13 = NoteFragment.f9026f0;
                                                                                                                    GestureDetector gestureDetector2 = gestureDetector;
                                                                                                                    v7.g.f(gestureDetector2, "$gestureDetector");
                                                                                                                    gestureDetector2.onTouchEvent(motionEvent);
                                                                                                                    return view.performClick();
                                                                                                                }
                                                                                                            });
                                                                                                            i10 = ViewUtilsKt.i();
                                                                                                            TickerView tickerView2 = b0Var.f17308p;
                                                                                                            v7.g.e(tickerView2, "tvWordCount");
                                                                                                            MaterialTextView materialTextView5 = b0Var.n;
                                                                                                            MaterialTextView materialTextView6 = b0Var.f17309q;
                                                                                                            if (i10) {
                                                                                                                tickerView2.setVisibility(8);
                                                                                                                v7.g.e(materialTextView6, "tvWordCountRtl");
                                                                                                                materialTextView6.setVisibility(0);
                                                                                                                Context j12 = j();
                                                                                                                if (j12 != null) {
                                                                                                                    try {
                                                                                                                        b11 = p2.f.b(j12, R.font.nunito_semibold);
                                                                                                                    } catch (Throwable unused2) {
                                                                                                                    }
                                                                                                                    materialTextView5.setTypeface(b11);
                                                                                                                    j2 = j();
                                                                                                                    if (j2 != null) {
                                                                                                                    }
                                                                                                                    b0Var.f17306m.setTypeface(typeface);
                                                                                                                    v7.g.e(coordinatorLayout2, "root");
                                                                                                                    return coordinatorLayout2;
                                                                                                                }
                                                                                                                b11 = null;
                                                                                                                materialTextView5.setTypeface(b11);
                                                                                                                j2 = j();
                                                                                                                if (j2 != null) {
                                                                                                                }
                                                                                                                b0Var.f17306m.setTypeface(typeface);
                                                                                                                v7.g.e(coordinatorLayout2, "root");
                                                                                                                return coordinatorLayout2;
                                                                                                            }
                                                                                                            tickerView2.setVisibility(0);
                                                                                                            v7.g.e(materialTextView6, "tvWordCountRtl");
                                                                                                            materialTextView6.setVisibility(8);
                                                                                                            Context j13 = j();
                                                                                                            i12 = R.font.nunito_semibold_italic;
                                                                                                            if (j13 != null) {
                                                                                                                try {
                                                                                                                    b10 = p2.f.b(j13, R.font.nunito_semibold_italic);
                                                                                                                } catch (Throwable unused3) {
                                                                                                                }
                                                                                                                materialTextView5.setTypeface(b10);
                                                                                                                j2 = j();
                                                                                                            }
                                                                                                            b10 = null;
                                                                                                            materialTextView5.setTypeface(b10);
                                                                                                            j2 = j();
                                                                                                            typeface = p2.f.b(j2, i12);
                                                                                                            b0Var.f17306m.setTypeface(typeface);
                                                                                                            v7.g.e(coordinatorLayout2, "root");
                                                                                                            return coordinatorLayout2;
                                                                                                        }
                                                                                                    }
                                                                                                    h11 = new DistinctFlowImpl(h11, noteFragment$setupState$7, pVar);
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$8(b0Var, this, null), h11), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$9(b0Var, null), b0().f9271r), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(b0().f9270q, b0().f(), new NoteFragment$setupState$10(b0Var, this, null)), ma.i.z(this));
                                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$16 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$1

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9030i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9031l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9032m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9031l = obj;
                                                                                                                    this.f9032m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9030i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9032m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9032m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9031l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9032m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9032m = 1;
                                                                                                                            if (this.f9030i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9031l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9032m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$16.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }, ViewUtilsKt.y(customEditText), new NoteFragment$setupState$12(b0Var, this, null)), ma.i.z(this));
                                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                                    kotlinx.coroutines.flow.b<String> bVar2 = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$2

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9034i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9035l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9036m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9035l = obj;
                                                                                                                    this.f9036m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9034i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9036m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9036m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9035l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9036m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9036m = 1;
                                                                                                                            if (this.f9034i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9035l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9036m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    };
                                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$16(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar2, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$3

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9038i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9039l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9040m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9039l = obj;
                                                                                                                    this.f9040m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9038i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9040m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9040m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9039l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9040m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9040m = 1;
                                                                                                                            if (this.f9038i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9039l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9040m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }, new NoteFragment$setupState$15(null)))), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9274u), ViewUtilsKt.a(customEditText2), new NoteFragment$setupState$17(this, null)), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9275v), ViewUtilsKt.a(customEditText), new NoteFragment$setupState$18(this, null)), ma.i.z(this));
                                                                                                    final kotlinx.coroutines.flow.b d102 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$19(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true))));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$21(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$4

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9042i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9043l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9044m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9043l = obj;
                                                                                                                    this.f9044m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9042i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9044m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9044m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9043l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9044m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9044m = 1;
                                                                                                                            if (this.f9042i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9043l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9044m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }), ma.i.z(this));
                                                                                                    final kotlinx.coroutines.flow.b d112 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$22(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true))));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$24(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$5

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9046i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9047l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9048m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9047l = obj;
                                                                                                                    this.f9048m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9046i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9048m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9048m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9047l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9048m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9048m = 1;
                                                                                                                            if (this.f9046i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9047l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9048m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.l j112 = b0().j();
                                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$27(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(j112, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$6

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9050i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9051l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9052m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9051l = obj;
                                                                                                                    this.f9052m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9050i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9052m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9052m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9051l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9052m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9052m = 1;
                                                                                                                            if (this.f9050i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9051l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9052m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }, ViewUtilsKt.j(customEditText2), new NoteFragment$setupState$26(null)))), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.l e102 = b0().e();
                                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$30(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(e102, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$7

                                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2  reason: invalid class name */
                                                                                                        /* loaded from: classes.dex */
                                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9054i;

                                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2$1  reason: invalid class name */
                                                                                                            /* loaded from: classes.dex */
                                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                                public /* synthetic */ Object f9055l;

                                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                                public int f9056m;

                                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                                    super(cVar);
                                                                                                                }

                                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                                public final Object k(Object obj) {
                                                                                                                    this.f9055l = obj;
                                                                                                                    this.f9056m |= Integer.MIN_VALUE;
                                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                                }
                                                                                                            }

                                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                                this.f9054i = cVar;
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
                                                                                                                    int i11 = anonymousClass1.f9056m;
                                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                        anonymousClass1.f9056m = i11 - Integer.MIN_VALUE;
                                                                                                                        Object obj22 = anonymousClass1.f9055l;
                                                                                                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                        i10 = anonymousClass1.f9056m;
                                                                                                                        if (i10 != 0) {
                                                                                                                            m0.b.n1(obj22);
                                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                                            anonymousClass1.f9056m = 1;
                                                                                                                            if (this.f9054i.c(obj3, anonymousClass1) == coroutineSingletons2) {
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
                                                                                                                Object obj222 = anonymousClass1.f9055l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9056m;
                                                                                                                if (i10 != 0) {
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }

                                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2, p7.c cVar22) {
                                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152.a(new AnonymousClass2(cVar2), cVar22);
                                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                        }
                                                                                                    }, ViewUtilsKt.j(customEditText), new NoteFragment$setupState$29(null)))), ma.i.z(this));
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$31(b0Var, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(nestedScrollView))), ma.i.z(this));
                                                                                                    CoordinatorLayout coordinatorLayout22 = b0Var.f17295a;
                                                                                                    v7.g.e(coordinatorLayout22, "root");
                                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$32(b0Var, null), ViewUtilsKt.m(coordinatorLayout22)), ma.i.z(this));
                                                                                                    if (d0Var != null) {
                                                                                                    }
                                                                                                    if (d0Var != null) {
                                                                                                    }
                                                                                                    g gVar2 = new g(1, b0Var);
                                                                                                    MaterialToolbar materialToolbar22 = b0Var.f17305l;
                                                                                                    materialToolbar22.setOnClickListener(gVar2);
                                                                                                    o6.c cVar2 = new o6.c(5, this);
                                                                                                    BottomAppBar bottomAppBar32 = b0Var.f17296b;
                                                                                                    bottomAppBar32.setNavigationOnClickListener(cVar2);
                                                                                                    bottomAppBar32.setOnTouchListener(new y(new GestureDetector(bottomAppBar32.getContext(), new a7.l(this))));
                                                                                                    NoteFragment$setupListeners$backCallback$1 noteFragment$setupListeners$backCallback$12 = new NoteFragment$setupListeners$backCallback$1(this, b0Var);
                                                                                                    c = c();
                                                                                                    if (c == null) {
                                                                                                    }
                                                                                                    lVar = null;
                                                                                                    if (lVar != null) {
                                                                                                    }
                                                                                                    materialToolbar22.setNavigationOnClickListener(new h6.b(8, noteFragment$setupListeners$backCallback$12));
                                                                                                    bottomAppBar32.setOnMenuItemClickListener(new Toolbar.h() { // from class: a7.i
                                                                                                        @Override // androidx.appcompat.widget.Toolbar.h
                                                                                                        public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                                                            NavController g11;
                                                                                                            androidx.navigation.o zVar;
                                                                                                            int i13 = NoteFragment.f9026f0;
                                                                                                            NoteFragment noteFragment = NoteFragment.this;
                                                                                                            v7.g.f(noteFragment, "this$0");
                                                                                                            switch (menuItem.getItemId()) {
                                                                                                                case R.id.add_reminder /* 2131361948 */:
                                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                    if (g11 != null) {
                                                                                                                        zVar = new z(noteFragment.a0().f348a, ((t6.d) noteFragment.b0().h().getValue()).f17621a);
                                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case R.id.more /* 2131362259 */:
                                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                    if (g11 != null) {
                                                                                                                        long j122 = noteFragment.a0().f348a;
                                                                                                                        long j132 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                        long[] jArr = noteFragment.a0().f354h;
                                                                                                                        v7.g.f(jArr, "selectedNoteIds");
                                                                                                                        zVar = new x(j122, j132, false, false, jArr);
                                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case R.id.reading_mode /* 2131362377 */:
                                                                                                                    f7.c.e(noteFragment);
                                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                                    if (g11 != null) {
                                                                                                                        long j14 = noteFragment.a0().f348a;
                                                                                                                        long j15 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                        long[] jArr2 = noteFragment.a0().f354h;
                                                                                                                        v7.g.f(jArr2, "selectedNoteIds");
                                                                                                                        zVar = new y(j14, j15, jArr2);
                                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case R.id.share_note /* 2131362440 */:
                                                                                                                    ViewUtilsKt.n(noteFragment, a1.c.N0(noteFragment.b0().h().getValue()));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    return false;
                                                                                                            }
                                                                                                            return true;
                                                                                                        }
                                                                                                    });
                                                                                                    b0Var.f17301h.setOnClickListener(new a7.j(b0Var, this));
                                                                                                    b0Var.f17299f.setOnClickListener(new n(b0Var, 2, this));
                                                                                                    b0Var.f17302i.setOnClickListener(new e(this, 0, b0Var));
                                                                                                    b0Var.f17300g.setOnClickListener(new a7.j(this, b0Var));
                                                                                                    CustomEditText customEditText32 = b0Var.f17298e;
                                                                                                    v7.g.e(customEditText32, "etNoteTitle");
                                                                                                    customEditText32.setOnTouchListener(new z(new GestureDetector(customEditText32.getContext(), new a7.m(this))));
                                                                                                    CustomEditText customEditText42 = b0Var.f17297d;
                                                                                                    v7.g.e(customEditText42, "etNoteBody");
                                                                                                    customEditText42.setOnTouchListener(new z(new GestureDetector(customEditText42.getContext(), new a7.n(this))));
                                                                                                    final GestureDetector gestureDetector2 = new GestureDetector(S(), new a7.o(b0Var));
                                                                                                    b0Var.f17303j.setOnTouchListener(new View.OnTouchListener() { // from class: a7.k
                                                                                                        @Override // android.view.View.OnTouchListener
                                                                                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                            int i13 = NoteFragment.f9026f0;
                                                                                                            GestureDetector gestureDetector22 = gestureDetector2;
                                                                                                            v7.g.f(gestureDetector22, "$gestureDetector");
                                                                                                            gestureDetector22.onTouchEvent(motionEvent);
                                                                                                            return view.performClick();
                                                                                                        }
                                                                                                    });
                                                                                                    i10 = ViewUtilsKt.i();
                                                                                                    TickerView tickerView22 = b0Var.f17308p;
                                                                                                    v7.g.e(tickerView22, "tvWordCount");
                                                                                                    MaterialTextView materialTextView52 = b0Var.n;
                                                                                                    MaterialTextView materialTextView62 = b0Var.f17309q;
                                                                                                    if (i10) {
                                                                                                    }
                                                                                                    typeface = p2.f.b(j2, i12);
                                                                                                    b0Var.f17306m.setTypeface(typeface);
                                                                                                    v7.g.e(coordinatorLayout22, "root");
                                                                                                    return coordinatorLayout22;
                                                                                                }
                                                                                            }
                                                                                            h10 = new DistinctFlowImpl(h10, noteFragment$setupState$5, pVar);
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$6(b0Var, null), h10), ma.i.z(this));
                                                                                            h11 = b0().h();
                                                                                            NoteFragment$setupState$7 noteFragment$setupState$72 = NoteFragment$setupState$7.f9104j;
                                                                                            if (h11 instanceof DistinctFlowImpl) {
                                                                                            }
                                                                                            h11 = new DistinctFlowImpl(h11, noteFragment$setupState$72, pVar);
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$8(b0Var, this, null), h11), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$9(b0Var, null), b0().f9271r), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(b0().f9270q, b0().f(), new NoteFragment$setupState$10(b0Var, this, null)), ma.i.z(this));
                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$162 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$1

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9030i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9031l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9032m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9031l = obj;
                                                                                                            this.f9032m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9030i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9032m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9032m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9031l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9032m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9032m = 1;
                                                                                                                    if (this.f9030i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9031l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9032m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$162.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }, ViewUtilsKt.y(customEditText), new NoteFragment$setupState$12(b0Var, this, null)), ma.i.z(this));
                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                            kotlinx.coroutines.flow.b<String> bVar22 = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$2

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9034i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9035l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9036m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9035l = obj;
                                                                                                            this.f9036m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9034i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9036m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9036m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9035l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9036m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9036m = 1;
                                                                                                                    if (this.f9034i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9035l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9036m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1222.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            };
                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1322 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$16(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar22, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$3

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9038i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9039l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9040m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9039l = obj;
                                                                                                            this.f9040m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9038i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9040m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9040m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9039l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9040m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9040m = 1;
                                                                                                                    if (this.f9038i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9039l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9040m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1322.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }, new NoteFragment$setupState$15(null)))), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9274u), ViewUtilsKt.a(customEditText2), new NoteFragment$setupState$17(this, null)), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9275v), ViewUtilsKt.a(customEditText), new NoteFragment$setupState$18(this, null)), ma.i.z(this));
                                                                                            final kotlinx.coroutines.flow.b d1022 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$19(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true))));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$21(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$4

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9042i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9043l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9044m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9043l = obj;
                                                                                                            this.f9044m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9042i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9044m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9044m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9043l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9044m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9044m = 1;
                                                                                                                    if (this.f9042i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9043l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9044m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }), ma.i.z(this));
                                                                                            final kotlinx.coroutines.flow.b d1122 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$22(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true))));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$24(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$5

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9046i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9047l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9048m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9047l = obj;
                                                                                                            this.f9048m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9046i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9048m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9048m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9047l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9048m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9048m = 1;
                                                                                                                    if (this.f9046i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9047l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9048m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.l j1122 = b0().j();
                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1422 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$27(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(j1122, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$6

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9050i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9051l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9052m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9051l = obj;
                                                                                                            this.f9052m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9050i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9052m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9052m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9051l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9052m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9052m = 1;
                                                                                                                    if (this.f9050i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9051l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9052m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1422.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }, ViewUtilsKt.j(customEditText2), new NoteFragment$setupState$26(null)))), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.l e1022 = b0().e();
                                                                                            final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1522 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$30(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(e1022, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$7

                                                                                                /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2  reason: invalid class name */
                                                                                                /* loaded from: classes.dex */
                                                                                                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                                    /* renamed from: i  reason: collision with root package name */
                                                                                                    public final /* synthetic */ kotlinx.coroutines.flow.c f9054i;

                                                                                                    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                                    @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2$1  reason: invalid class name */
                                                                                                    /* loaded from: classes.dex */
                                                                                                    public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                        /* renamed from: l  reason: collision with root package name */
                                                                                                        public /* synthetic */ Object f9055l;

                                                                                                        /* renamed from: m  reason: collision with root package name */
                                                                                                        public int f9056m;

                                                                                                        public AnonymousClass1(p7.c cVar) {
                                                                                                            super(cVar);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object k(Object obj) {
                                                                                                            this.f9055l = obj;
                                                                                                            this.f9056m |= Integer.MIN_VALUE;
                                                                                                            return AnonymousClass2.this.c(null, this);
                                                                                                        }
                                                                                                    }

                                                                                                    public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                        this.f9054i = cVar;
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
                                                                                                            int i11 = anonymousClass1.f9056m;
                                                                                                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                                anonymousClass1.f9056m = i11 - Integer.MIN_VALUE;
                                                                                                                Object obj222 = anonymousClass1.f9055l;
                                                                                                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                                i10 = anonymousClass1.f9056m;
                                                                                                                if (i10 != 0) {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                    String obj3 = ((CharSequence) obj).toString();
                                                                                                                    anonymousClass1.f9056m = 1;
                                                                                                                    if (this.f9054i.c(obj3, anonymousClass1) == coroutineSingletons22) {
                                                                                                                        return coroutineSingletons22;
                                                                                                                    }
                                                                                                                } else if (i10 != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                } else {
                                                                                                                    m0.b.n1(obj222);
                                                                                                                }
                                                                                                                return m7.n.f16010a;
                                                                                                            }
                                                                                                        }
                                                                                                        anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                        Object obj2222 = anonymousClass1.f9055l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9056m;
                                                                                                        if (i10 != 0) {
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }

                                                                                                @Override // kotlinx.coroutines.flow.b
                                                                                                public final Object a(kotlinx.coroutines.flow.c<? super String> cVar22, p7.c cVar222) {
                                                                                                    Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1522.a(new AnonymousClass2(cVar22), cVar222);
                                                                                                    return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                                }
                                                                                            }, ViewUtilsKt.j(customEditText), new NoteFragment$setupState$29(null)))), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$31(b0Var, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(nestedScrollView))), ma.i.z(this));
                                                                                            CoordinatorLayout coordinatorLayout222 = b0Var.f17295a;
                                                                                            v7.g.e(coordinatorLayout222, "root");
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$32(b0Var, null), ViewUtilsKt.m(coordinatorLayout222)), ma.i.z(this));
                                                                                            if (d0Var != null) {
                                                                                            }
                                                                                            if (d0Var != null) {
                                                                                            }
                                                                                            g gVar22 = new g(1, b0Var);
                                                                                            MaterialToolbar materialToolbar222 = b0Var.f17305l;
                                                                                            materialToolbar222.setOnClickListener(gVar22);
                                                                                            o6.c cVar22 = new o6.c(5, this);
                                                                                            BottomAppBar bottomAppBar322 = b0Var.f17296b;
                                                                                            bottomAppBar322.setNavigationOnClickListener(cVar22);
                                                                                            bottomAppBar322.setOnTouchListener(new y(new GestureDetector(bottomAppBar322.getContext(), new a7.l(this))));
                                                                                            NoteFragment$setupListeners$backCallback$1 noteFragment$setupListeners$backCallback$122 = new NoteFragment$setupListeners$backCallback$1(this, b0Var);
                                                                                            c = c();
                                                                                            if (c == null) {
                                                                                            }
                                                                                            lVar = null;
                                                                                            if (lVar != null) {
                                                                                            }
                                                                                            materialToolbar222.setNavigationOnClickListener(new h6.b(8, noteFragment$setupListeners$backCallback$122));
                                                                                            bottomAppBar322.setOnMenuItemClickListener(new Toolbar.h() { // from class: a7.i
                                                                                                @Override // androidx.appcompat.widget.Toolbar.h
                                                                                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                                                    NavController g11;
                                                                                                    androidx.navigation.o zVar;
                                                                                                    int i13 = NoteFragment.f9026f0;
                                                                                                    NoteFragment noteFragment = NoteFragment.this;
                                                                                                    v7.g.f(noteFragment, "this$0");
                                                                                                    switch (menuItem.getItemId()) {
                                                                                                        case R.id.add_reminder /* 2131361948 */:
                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                            if (g11 != null) {
                                                                                                                zVar = new z(noteFragment.a0().f348a, ((t6.d) noteFragment.b0().h().getValue()).f17621a);
                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case R.id.more /* 2131362259 */:
                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                            if (g11 != null) {
                                                                                                                long j122 = noteFragment.a0().f348a;
                                                                                                                long j132 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                long[] jArr = noteFragment.a0().f354h;
                                                                                                                v7.g.f(jArr, "selectedNoteIds");
                                                                                                                zVar = new x(j122, j132, false, false, jArr);
                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case R.id.reading_mode /* 2131362377 */:
                                                                                                            f7.c.e(noteFragment);
                                                                                                            g11 = ViewUtilsKt.g(noteFragment);
                                                                                                            if (g11 != null) {
                                                                                                                long j14 = noteFragment.a0().f348a;
                                                                                                                long j15 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                                long[] jArr2 = noteFragment.a0().f354h;
                                                                                                                v7.g.f(jArr2, "selectedNoteIds");
                                                                                                                zVar = new y(j14, j15, jArr2);
                                                                                                                ViewUtilsKt.o(g11, zVar, null);
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case R.id.share_note /* 2131362440 */:
                                                                                                            ViewUtilsKt.n(noteFragment, a1.c.N0(noteFragment.b0().h().getValue()));
                                                                                                            break;
                                                                                                        default:
                                                                                                            return false;
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                            });
                                                                                            b0Var.f17301h.setOnClickListener(new a7.j(b0Var, this));
                                                                                            b0Var.f17299f.setOnClickListener(new n(b0Var, 2, this));
                                                                                            b0Var.f17302i.setOnClickListener(new e(this, 0, b0Var));
                                                                                            b0Var.f17300g.setOnClickListener(new a7.j(this, b0Var));
                                                                                            CustomEditText customEditText322 = b0Var.f17298e;
                                                                                            v7.g.e(customEditText322, "etNoteTitle");
                                                                                            customEditText322.setOnTouchListener(new z(new GestureDetector(customEditText322.getContext(), new a7.m(this))));
                                                                                            CustomEditText customEditText422 = b0Var.f17297d;
                                                                                            v7.g.e(customEditText422, "etNoteBody");
                                                                                            customEditText422.setOnTouchListener(new z(new GestureDetector(customEditText422.getContext(), new a7.n(this))));
                                                                                            final GestureDetector gestureDetector22 = new GestureDetector(S(), new a7.o(b0Var));
                                                                                            b0Var.f17303j.setOnTouchListener(new View.OnTouchListener() { // from class: a7.k
                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                    int i13 = NoteFragment.f9026f0;
                                                                                                    GestureDetector gestureDetector222 = gestureDetector22;
                                                                                                    v7.g.f(gestureDetector222, "$gestureDetector");
                                                                                                    gestureDetector222.onTouchEvent(motionEvent);
                                                                                                    return view.performClick();
                                                                                                }
                                                                                            });
                                                                                            i10 = ViewUtilsKt.i();
                                                                                            TickerView tickerView222 = b0Var.f17308p;
                                                                                            v7.g.e(tickerView222, "tvWordCount");
                                                                                            MaterialTextView materialTextView522 = b0Var.n;
                                                                                            MaterialTextView materialTextView622 = b0Var.f17309q;
                                                                                            if (i10) {
                                                                                            }
                                                                                            typeface = p2.f.b(j2, i12);
                                                                                            b0Var.f17306m.setTypeface(typeface);
                                                                                            v7.g.e(coordinatorLayout222, "root");
                                                                                            return coordinatorLayout222;
                                                                                        }
                                                                                    }
                                                                                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new DistinctFlowImpl(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, noteFragment$setupState$2, pVar);
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$3(b0Var, this, null), flowKt__TransformKt$onEach$$inlined$unsafeTransform$1), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(a1.b.z(b0().h(), b0().f9273t, a1.b.m(b0().f9269p), new NoteFragment$setupState$4(b0Var, this, null)), ma.i.z(this));
                                                                                    h10 = b0().h();
                                                                                    NoteFragment$setupState$5 noteFragment$setupState$52 = NoteFragment$setupState$5.f9102j;
                                                                                    if (h10 instanceof DistinctFlowImpl) {
                                                                                    }
                                                                                    h10 = new DistinctFlowImpl(h10, noteFragment$setupState$52, pVar);
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$6(b0Var, null), h10), ma.i.z(this));
                                                                                    h11 = b0().h();
                                                                                    NoteFragment$setupState$7 noteFragment$setupState$722 = NoteFragment$setupState$7.f9104j;
                                                                                    if (h11 instanceof DistinctFlowImpl) {
                                                                                    }
                                                                                    h11 = new DistinctFlowImpl(h11, noteFragment$setupState$722, pVar);
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$8(b0Var, this, null), h11), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$9(b0Var, null), b0().f9271r), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(b0().f9270q, b0().f(), new NoteFragment$setupState$10(b0Var, this, null)), ma.i.z(this));
                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1622 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$1

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9030i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9031l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9032m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9031l = obj;
                                                                                                    this.f9032m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9030i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9032m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9032m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9031l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9032m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9032m = 1;
                                                                                                            if (this.f9030i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9031l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9032m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1622.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }, ViewUtilsKt.y(customEditText), new NoteFragment$setupState$12(b0Var, this, null)), ma.i.z(this));
                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                    kotlinx.coroutines.flow.b<String> bVar222 = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$2

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9034i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9035l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9036m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9035l = obj;
                                                                                                    this.f9036m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9034i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9036m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9036m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9035l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9036m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9036m = 1;
                                                                                                            if (this.f9034i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9035l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9036m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$12222.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    };
                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$16(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$3

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9038i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9039l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9040m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9039l = obj;
                                                                                                    this.f9040m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9038i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9040m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9040m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9039l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9040m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9040m = 1;
                                                                                                            if (this.f9038i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9039l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9040m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$13222.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }, new NoteFragment$setupState$15(null)))), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9274u), ViewUtilsKt.a(customEditText2), new NoteFragment$setupState$17(this, null)), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9275v), ViewUtilsKt.a(customEditText), new NoteFragment$setupState$18(this, null)), ma.i.z(this));
                                                                                    final kotlinx.coroutines.flow.b d10222 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$19(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true))));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$21(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$4

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9042i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9043l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9044m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9043l = obj;
                                                                                                    this.f9044m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9042i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9044m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9044m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9043l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9044m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9044m = 1;
                                                                                                            if (this.f9042i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9043l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9044m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }), ma.i.z(this));
                                                                                    final kotlinx.coroutines.flow.b d11222 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$22(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true))));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$24(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$5

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9046i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9047l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9048m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9047l = obj;
                                                                                                    this.f9048m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9046i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9048m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9048m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9047l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9048m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9048m = 1;
                                                                                                            if (this.f9046i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9047l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9048m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.l j11222 = b0().j();
                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$27(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(j11222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$6

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9050i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9051l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9052m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9051l = obj;
                                                                                                    this.f9052m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9050i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9052m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9052m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9051l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9052m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9052m = 1;
                                                                                                            if (this.f9050i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9051l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9052m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$14222.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }, ViewUtilsKt.j(customEditText2), new NoteFragment$setupState$26(null)))), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.l e10222 = b0().e();
                                                                                    final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$30(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(e10222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$7

                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                            /* renamed from: i  reason: collision with root package name */
                                                                                            public final /* synthetic */ kotlinx.coroutines.flow.c f9054i;

                                                                                            @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                            @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                            /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2$1  reason: invalid class name */
                                                                                            /* loaded from: classes.dex */
                                                                                            public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                                /* renamed from: l  reason: collision with root package name */
                                                                                                public /* synthetic */ Object f9055l;

                                                                                                /* renamed from: m  reason: collision with root package name */
                                                                                                public int f9056m;

                                                                                                public AnonymousClass1(p7.c cVar) {
                                                                                                    super(cVar);
                                                                                                }

                                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                public final Object k(Object obj) {
                                                                                                    this.f9055l = obj;
                                                                                                    this.f9056m |= Integer.MIN_VALUE;
                                                                                                    return AnonymousClass2.this.c(null, this);
                                                                                                }
                                                                                            }

                                                                                            public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                                this.f9054i = cVar;
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
                                                                                                    int i11 = anonymousClass1.f9056m;
                                                                                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                        anonymousClass1.f9056m = i11 - Integer.MIN_VALUE;
                                                                                                        Object obj2222 = anonymousClass1.f9055l;
                                                                                                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                        i10 = anonymousClass1.f9056m;
                                                                                                        if (i10 != 0) {
                                                                                                            m0.b.n1(obj2222);
                                                                                                            String obj3 = ((CharSequence) obj).toString();
                                                                                                            anonymousClass1.f9056m = 1;
                                                                                                            if (this.f9054i.c(obj3, anonymousClass1) == coroutineSingletons222) {
                                                                                                                return coroutineSingletons222;
                                                                                                            }
                                                                                                        } else if (i10 != 1) {
                                                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                        } else {
                                                                                                            m0.b.n1(obj2222);
                                                                                                        }
                                                                                                        return m7.n.f16010a;
                                                                                                    }
                                                                                                }
                                                                                                anonymousClass1 = new AnonymousClass1(cVar);
                                                                                                Object obj22222 = anonymousClass1.f9055l;
                                                                                                CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                i10 = anonymousClass1.f9056m;
                                                                                                if (i10 != 0) {
                                                                                                }
                                                                                                return m7.n.f16010a;
                                                                                            }
                                                                                        }

                                                                                        @Override // kotlinx.coroutines.flow.b
                                                                                        public final Object a(kotlinx.coroutines.flow.c<? super String> cVar222, p7.c cVar2222) {
                                                                                            Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$15222.a(new AnonymousClass2(cVar222), cVar2222);
                                                                                            return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                        }
                                                                                    }, ViewUtilsKt.j(customEditText), new NoteFragment$setupState$29(null)))), ma.i.z(this));
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$31(b0Var, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(nestedScrollView))), ma.i.z(this));
                                                                                    CoordinatorLayout coordinatorLayout2222 = b0Var.f17295a;
                                                                                    v7.g.e(coordinatorLayout2222, "root");
                                                                                    kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$32(b0Var, null), ViewUtilsKt.m(coordinatorLayout2222)), ma.i.z(this));
                                                                                    if (d0Var != null) {
                                                                                    }
                                                                                    if (d0Var != null) {
                                                                                    }
                                                                                    g gVar222 = new g(1, b0Var);
                                                                                    MaterialToolbar materialToolbar2222 = b0Var.f17305l;
                                                                                    materialToolbar2222.setOnClickListener(gVar222);
                                                                                    o6.c cVar222 = new o6.c(5, this);
                                                                                    BottomAppBar bottomAppBar3222 = b0Var.f17296b;
                                                                                    bottomAppBar3222.setNavigationOnClickListener(cVar222);
                                                                                    bottomAppBar3222.setOnTouchListener(new y(new GestureDetector(bottomAppBar3222.getContext(), new a7.l(this))));
                                                                                    NoteFragment$setupListeners$backCallback$1 noteFragment$setupListeners$backCallback$1222 = new NoteFragment$setupListeners$backCallback$1(this, b0Var);
                                                                                    c = c();
                                                                                    if (c == null) {
                                                                                    }
                                                                                    lVar = null;
                                                                                    if (lVar != null) {
                                                                                    }
                                                                                    materialToolbar2222.setNavigationOnClickListener(new h6.b(8, noteFragment$setupListeners$backCallback$1222));
                                                                                    bottomAppBar3222.setOnMenuItemClickListener(new Toolbar.h() { // from class: a7.i
                                                                                        @Override // androidx.appcompat.widget.Toolbar.h
                                                                                        public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                                            NavController g11;
                                                                                            androidx.navigation.o zVar;
                                                                                            int i13 = NoteFragment.f9026f0;
                                                                                            NoteFragment noteFragment = NoteFragment.this;
                                                                                            v7.g.f(noteFragment, "this$0");
                                                                                            switch (menuItem.getItemId()) {
                                                                                                case R.id.add_reminder /* 2131361948 */:
                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                    if (g11 != null) {
                                                                                                        zVar = new z(noteFragment.a0().f348a, ((t6.d) noteFragment.b0().h().getValue()).f17621a);
                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                case R.id.more /* 2131362259 */:
                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                    if (g11 != null) {
                                                                                                        long j122 = noteFragment.a0().f348a;
                                                                                                        long j132 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                        long[] jArr = noteFragment.a0().f354h;
                                                                                                        v7.g.f(jArr, "selectedNoteIds");
                                                                                                        zVar = new x(j122, j132, false, false, jArr);
                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                case R.id.reading_mode /* 2131362377 */:
                                                                                                    f7.c.e(noteFragment);
                                                                                                    g11 = ViewUtilsKt.g(noteFragment);
                                                                                                    if (g11 != null) {
                                                                                                        long j14 = noteFragment.a0().f348a;
                                                                                                        long j15 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                        long[] jArr2 = noteFragment.a0().f354h;
                                                                                                        v7.g.f(jArr2, "selectedNoteIds");
                                                                                                        zVar = new y(j14, j15, jArr2);
                                                                                                        ViewUtilsKt.o(g11, zVar, null);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                case R.id.share_note /* 2131362440 */:
                                                                                                    ViewUtilsKt.n(noteFragment, a1.c.N0(noteFragment.b0().h().getValue()));
                                                                                                    break;
                                                                                                default:
                                                                                                    return false;
                                                                                            }
                                                                                            return true;
                                                                                        }
                                                                                    });
                                                                                    b0Var.f17301h.setOnClickListener(new a7.j(b0Var, this));
                                                                                    b0Var.f17299f.setOnClickListener(new n(b0Var, 2, this));
                                                                                    b0Var.f17302i.setOnClickListener(new e(this, 0, b0Var));
                                                                                    b0Var.f17300g.setOnClickListener(new a7.j(this, b0Var));
                                                                                    CustomEditText customEditText3222 = b0Var.f17298e;
                                                                                    v7.g.e(customEditText3222, "etNoteTitle");
                                                                                    customEditText3222.setOnTouchListener(new z(new GestureDetector(customEditText3222.getContext(), new a7.m(this))));
                                                                                    CustomEditText customEditText4222 = b0Var.f17297d;
                                                                                    v7.g.e(customEditText4222, "etNoteBody");
                                                                                    customEditText4222.setOnTouchListener(new z(new GestureDetector(customEditText4222.getContext(), new a7.n(this))));
                                                                                    final GestureDetector gestureDetector222 = new GestureDetector(S(), new a7.o(b0Var));
                                                                                    b0Var.f17303j.setOnTouchListener(new View.OnTouchListener() { // from class: a7.k
                                                                                        @Override // android.view.View.OnTouchListener
                                                                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                            int i13 = NoteFragment.f9026f0;
                                                                                            GestureDetector gestureDetector2222 = gestureDetector222;
                                                                                            v7.g.f(gestureDetector2222, "$gestureDetector");
                                                                                            gestureDetector2222.onTouchEvent(motionEvent);
                                                                                            return view.performClick();
                                                                                        }
                                                                                    });
                                                                                    i10 = ViewUtilsKt.i();
                                                                                    TickerView tickerView2222 = b0Var.f17308p;
                                                                                    v7.g.e(tickerView2222, "tvWordCount");
                                                                                    MaterialTextView materialTextView5222 = b0Var.n;
                                                                                    MaterialTextView materialTextView6222 = b0Var.f17309q;
                                                                                    if (i10) {
                                                                                    }
                                                                                    typeface = p2.f.b(j2, i12);
                                                                                    b0Var.f17306m.setTypeface(typeface);
                                                                                    v7.g.e(coordinatorLayout2222, "root");
                                                                                    return coordinatorLayout2222;
                                                                                }
                                                                                b5 = null;
                                                                                tickerView.setTypeface(b5);
                                                                                NoteViewModel b022 = b0();
                                                                                b022.getClass();
                                                                                m0.b.M0(a1.b.d0(b022), null, null, new NoteViewModel$updateNoteAccessDate$1(b022, null), 3);
                                                                                g10 = ViewUtilsKt.g(this);
                                                                                if (g10 == null) {
                                                                                }
                                                                                d0Var = null;
                                                                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$1(b0Var, this, null), b0().f9270q);
                                                                                NoteFragment$setupState$2 noteFragment$setupState$22 = NoteFragment$setupState$2.f9082j;
                                                                                u7.p<Object, Object, Boolean> pVar2 = FlowKt__DistinctKt.f15243b;
                                                                                if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 instanceof DistinctFlowImpl) {
                                                                                }
                                                                                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new DistinctFlowImpl(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, noteFragment$setupState$22, pVar2);
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$3(b0Var, this, null), flowKt__TransformKt$onEach$$inlined$unsafeTransform$1), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(a1.b.z(b0().h(), b0().f9273t, a1.b.m(b0().f9269p), new NoteFragment$setupState$4(b0Var, this, null)), ma.i.z(this));
                                                                                h10 = b0().h();
                                                                                NoteFragment$setupState$5 noteFragment$setupState$522 = NoteFragment$setupState$5.f9102j;
                                                                                if (h10 instanceof DistinctFlowImpl) {
                                                                                }
                                                                                h10 = new DistinctFlowImpl(h10, noteFragment$setupState$522, pVar2);
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$6(b0Var, null), h10), ma.i.z(this));
                                                                                h11 = b0().h();
                                                                                NoteFragment$setupState$7 noteFragment$setupState$7222 = NoteFragment$setupState$7.f9104j;
                                                                                if (h11 instanceof DistinctFlowImpl) {
                                                                                }
                                                                                h11 = new DistinctFlowImpl(h11, noteFragment$setupState$7222, pVar2);
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$8(b0Var, this, null), h11), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$9(b0Var, null), b0().f9271r), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(b0().f9270q, b0().f(), new NoteFragment$setupState$10(b0Var, this, null)), ma.i.z(this));
                                                                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$16222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$1

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9030i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$1$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9031l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9032m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9031l = obj;
                                                                                                this.f9032m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9030i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9032m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9032m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9031l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9032m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9032m = 1;
                                                                                                        if (this.f9030i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9031l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9032m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$16222.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }, ViewUtilsKt.y(customEditText), new NoteFragment$setupState$12(b0Var, this, null)), ma.i.z(this));
                                                                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                kotlinx.coroutines.flow.b<String> bVar2222 = new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$2

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9034i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$2$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9035l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9036m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9035l = obj;
                                                                                                this.f9036m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9034i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9036m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9036m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9035l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9036m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9036m = 1;
                                                                                                        if (this.f9034i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9035l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9036m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$122222.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                };
                                                                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$16(this, null), kotlinx.coroutines.flow.e.d(new kotlinx.coroutines.flow.i(bVar2222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$3

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9038i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$3$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9039l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9040m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9039l = obj;
                                                                                                this.f9040m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9038i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9040m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9040m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9039l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9040m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9040m = 1;
                                                                                                        if (this.f9038i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9039l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9040m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$132222.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }, new NoteFragment$setupState$15(null)))), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9274u), ViewUtilsKt.a(customEditText2), new NoteFragment$setupState$17(this, null)), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(new kotlinx.coroutines.flow.i(a1.b.m(b0().f9275v), ViewUtilsKt.a(customEditText), new NoteFragment$setupState$18(this, null)), ma.i.z(this));
                                                                                final kotlinx.coroutines.flow.b d102222 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$19(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true))));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$21(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$4

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9042i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$4$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9043l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9044m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9043l = obj;
                                                                                                this.f9044m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9042i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9044m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9044m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9043l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9044m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9044m = 1;
                                                                                                        if (this.f9042i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9043l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9044m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }), ma.i.z(this));
                                                                                final kotlinx.coroutines.flow.b d112222 = kotlinx.coroutines.flow.e.d(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$22(this, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true))));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$24(this, null), new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$5

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9046i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$5$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9047l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9048m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9047l = obj;
                                                                                                this.f9048m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9046i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9048m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9048m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9047l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9048m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9048m = 1;
                                                                                                        if (this.f9046i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9047l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9048m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = kotlinx.coroutines.flow.b.this.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.l j112222 = b0().j();
                                                                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText2, true));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$27(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(j112222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$6

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9050i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$6$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9051l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9052m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9051l = obj;
                                                                                                this.f9052m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9050i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9052m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9052m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9051l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9052m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9052m = 1;
                                                                                                        if (this.f9050i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9051l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9052m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$142222.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }, ViewUtilsKt.j(customEditText2), new NoteFragment$setupState$26(null)))), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.l e102222 = b0().e();
                                                                                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152222 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(ViewUtilsKt.x(customEditText, true));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$30(b0Var, this, null), kotlinx.coroutines.flow.e.d(a1.b.z(e102222, new kotlinx.coroutines.flow.b<String>() { // from class: com.noto.app.note.NoteFragment$setupState$$inlined$map$7

                                                                                    /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2  reason: invalid class name */
                                                                                    /* loaded from: classes.dex */
                                                                                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.c {

                                                                                        /* renamed from: i  reason: collision with root package name */
                                                                                        public final /* synthetic */ kotlinx.coroutines.flow.c f9054i;

                                                                                        @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
                                                                                        @q7.c(c = "com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2", f = "NoteFragment.kt", l = {223}, m = "emit")
                                                                                        /* renamed from: com.noto.app.note.NoteFragment$setupState$$inlined$map$7$2$1  reason: invalid class name */
                                                                                        /* loaded from: classes.dex */
                                                                                        public static final class AnonymousClass1 extends ContinuationImpl {

                                                                                            /* renamed from: l  reason: collision with root package name */
                                                                                            public /* synthetic */ Object f9055l;

                                                                                            /* renamed from: m  reason: collision with root package name */
                                                                                            public int f9056m;

                                                                                            public AnonymousClass1(p7.c cVar) {
                                                                                                super(cVar);
                                                                                            }

                                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                            public final Object k(Object obj) {
                                                                                                this.f9055l = obj;
                                                                                                this.f9056m |= Integer.MIN_VALUE;
                                                                                                return AnonymousClass2.this.c(null, this);
                                                                                            }
                                                                                        }

                                                                                        public AnonymousClass2(kotlinx.coroutines.flow.c cVar) {
                                                                                            this.f9054i = cVar;
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
                                                                                                int i11 = anonymousClass1.f9056m;
                                                                                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                                                                                    anonymousClass1.f9056m = i11 - Integer.MIN_VALUE;
                                                                                                    Object obj22222 = anonymousClass1.f9055l;
                                                                                                    CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                                    i10 = anonymousClass1.f9056m;
                                                                                                    if (i10 != 0) {
                                                                                                        m0.b.n1(obj22222);
                                                                                                        String obj3 = ((CharSequence) obj).toString();
                                                                                                        anonymousClass1.f9056m = 1;
                                                                                                        if (this.f9054i.c(obj3, anonymousClass1) == coroutineSingletons2222) {
                                                                                                            return coroutineSingletons2222;
                                                                                                        }
                                                                                                    } else if (i10 != 1) {
                                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                    } else {
                                                                                                        m0.b.n1(obj22222);
                                                                                                    }
                                                                                                    return m7.n.f16010a;
                                                                                                }
                                                                                            }
                                                                                            anonymousClass1 = new AnonymousClass1(cVar);
                                                                                            Object obj222222 = anonymousClass1.f9055l;
                                                                                            CoroutineSingletons coroutineSingletons22222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                                            i10 = anonymousClass1.f9056m;
                                                                                            if (i10 != 0) {
                                                                                            }
                                                                                            return m7.n.f16010a;
                                                                                        }
                                                                                    }

                                                                                    @Override // kotlinx.coroutines.flow.b
                                                                                    public final Object a(kotlinx.coroutines.flow.c<? super String> cVar2222, p7.c cVar22222) {
                                                                                        Object a10 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$152222.a(new AnonymousClass2(cVar2222), cVar22222);
                                                                                        return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : m7.n.f16010a;
                                                                                    }
                                                                                }, ViewUtilsKt.j(customEditText), new NoteFragment$setupState$29(null)))), ma.i.z(this));
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$31(b0Var, this, null), kotlinx.coroutines.flow.e.d(ViewUtilsKt.p(nestedScrollView))), ma.i.z(this));
                                                                                CoordinatorLayout coordinatorLayout22222 = b0Var.f17295a;
                                                                                v7.g.e(coordinatorLayout22222, "root");
                                                                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteFragment$setupState$32(b0Var, null), ViewUtilsKt.m(coordinatorLayout22222)), ma.i.z(this));
                                                                                if (d0Var != null) {
                                                                                }
                                                                                if (d0Var != null) {
                                                                                }
                                                                                g gVar2222 = new g(1, b0Var);
                                                                                MaterialToolbar materialToolbar22222 = b0Var.f17305l;
                                                                                materialToolbar22222.setOnClickListener(gVar2222);
                                                                                o6.c cVar2222 = new o6.c(5, this);
                                                                                BottomAppBar bottomAppBar32222 = b0Var.f17296b;
                                                                                bottomAppBar32222.setNavigationOnClickListener(cVar2222);
                                                                                bottomAppBar32222.setOnTouchListener(new y(new GestureDetector(bottomAppBar32222.getContext(), new a7.l(this))));
                                                                                NoteFragment$setupListeners$backCallback$1 noteFragment$setupListeners$backCallback$12222 = new NoteFragment$setupListeners$backCallback$1(this, b0Var);
                                                                                c = c();
                                                                                if (c == null) {
                                                                                }
                                                                                lVar = null;
                                                                                if (lVar != null) {
                                                                                }
                                                                                materialToolbar22222.setNavigationOnClickListener(new h6.b(8, noteFragment$setupListeners$backCallback$12222));
                                                                                bottomAppBar32222.setOnMenuItemClickListener(new Toolbar.h() { // from class: a7.i
                                                                                    @Override // androidx.appcompat.widget.Toolbar.h
                                                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                                                        NavController g11;
                                                                                        androidx.navigation.o zVar;
                                                                                        int i13 = NoteFragment.f9026f0;
                                                                                        NoteFragment noteFragment = NoteFragment.this;
                                                                                        v7.g.f(noteFragment, "this$0");
                                                                                        switch (menuItem.getItemId()) {
                                                                                            case R.id.add_reminder /* 2131361948 */:
                                                                                                g11 = ViewUtilsKt.g(noteFragment);
                                                                                                if (g11 != null) {
                                                                                                    zVar = new z(noteFragment.a0().f348a, ((t6.d) noteFragment.b0().h().getValue()).f17621a);
                                                                                                    ViewUtilsKt.o(g11, zVar, null);
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case R.id.more /* 2131362259 */:
                                                                                                g11 = ViewUtilsKt.g(noteFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j122 = noteFragment.a0().f348a;
                                                                                                    long j132 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                    long[] jArr = noteFragment.a0().f354h;
                                                                                                    v7.g.f(jArr, "selectedNoteIds");
                                                                                                    zVar = new x(j122, j132, false, false, jArr);
                                                                                                    ViewUtilsKt.o(g11, zVar, null);
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case R.id.reading_mode /* 2131362377 */:
                                                                                                f7.c.e(noteFragment);
                                                                                                g11 = ViewUtilsKt.g(noteFragment);
                                                                                                if (g11 != null) {
                                                                                                    long j14 = noteFragment.a0().f348a;
                                                                                                    long j15 = ((t6.d) noteFragment.b0().h().getValue()).f17621a;
                                                                                                    long[] jArr2 = noteFragment.a0().f354h;
                                                                                                    v7.g.f(jArr2, "selectedNoteIds");
                                                                                                    zVar = new y(j14, j15, jArr2);
                                                                                                    ViewUtilsKt.o(g11, zVar, null);
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case R.id.share_note /* 2131362440 */:
                                                                                                ViewUtilsKt.n(noteFragment, a1.c.N0(noteFragment.b0().h().getValue()));
                                                                                                break;
                                                                                            default:
                                                                                                return false;
                                                                                        }
                                                                                        return true;
                                                                                    }
                                                                                });
                                                                                b0Var.f17301h.setOnClickListener(new a7.j(b0Var, this));
                                                                                b0Var.f17299f.setOnClickListener(new n(b0Var, 2, this));
                                                                                b0Var.f17302i.setOnClickListener(new e(this, 0, b0Var));
                                                                                b0Var.f17300g.setOnClickListener(new a7.j(this, b0Var));
                                                                                CustomEditText customEditText32222 = b0Var.f17298e;
                                                                                v7.g.e(customEditText32222, "etNoteTitle");
                                                                                customEditText32222.setOnTouchListener(new z(new GestureDetector(customEditText32222.getContext(), new a7.m(this))));
                                                                                CustomEditText customEditText42222 = b0Var.f17297d;
                                                                                v7.g.e(customEditText42222, "etNoteBody");
                                                                                customEditText42222.setOnTouchListener(new z(new GestureDetector(customEditText42222.getContext(), new a7.n(this))));
                                                                                final GestureDetector gestureDetector2222 = new GestureDetector(S(), new a7.o(b0Var));
                                                                                b0Var.f17303j.setOnTouchListener(new View.OnTouchListener() { // from class: a7.k
                                                                                    @Override // android.view.View.OnTouchListener
                                                                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                        int i13 = NoteFragment.f9026f0;
                                                                                        GestureDetector gestureDetector22222 = gestureDetector2222;
                                                                                        v7.g.f(gestureDetector22222, "$gestureDetector");
                                                                                        gestureDetector22222.onTouchEvent(motionEvent);
                                                                                        return view.performClick();
                                                                                    }
                                                                                });
                                                                                i10 = ViewUtilsKt.i();
                                                                                TickerView tickerView22222 = b0Var.f17308p;
                                                                                v7.g.e(tickerView22222, "tvWordCount");
                                                                                MaterialTextView materialTextView52222 = b0Var.n;
                                                                                MaterialTextView materialTextView62222 = b0Var.f17309q;
                                                                                if (i10) {
                                                                                }
                                                                                typeface = p2.f.b(j2, i12);
                                                                                b0Var.f17306m.setTypeface(typeface);
                                                                                v7.g.e(coordinatorLayout22222, "root");
                                                                                return coordinatorLayout22222;
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
