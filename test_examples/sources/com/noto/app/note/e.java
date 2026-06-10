package com.noto.app.note;

import a7.a0;
import android.view.View;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.app.note.NoteSelectionDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import s6.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9397i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9398j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f9399k;

    public /* synthetic */ e(Object obj, int i10, Object obj2) {
        this.f9397i = i10;
        this.f9398j = obj;
        this.f9399k = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NavController g10;
        a0 a0Var;
        NavController navController;
        int i10 = this.f9397i;
        Object obj = this.f9399k;
        Object obj2 = this.f9398j;
        switch (i10) {
            case 0:
                NoteFragment noteFragment = (NoteFragment) obj2;
                b0 b0Var = (b0) obj;
                int i11 = NoteFragment.f9026f0;
                v7.g.f(noteFragment, "this$0");
                v7.g.f(b0Var, "$this_setupListeners");
                String str = ((t6.d) noteFragment.b0().h().getValue()).c;
                String str2 = ((t6.d) noteFragment.b0().h().getValue()).f17623d;
                List<Triple> e02 = NoteFragment.e0(str, noteFragment.b0().j().b());
                List<Triple> e03 = NoteFragment.e0(str2, noteFragment.b0().e().b());
                if (b0Var.f17298e.isFocused()) {
                    navController = ViewUtilsKt.g(noteFragment);
                    if (navController != null) {
                        long j2 = noteFragment.a0().f348a;
                        long j10 = noteFragment.a0().f349b;
                        ArrayList arrayList = new ArrayList(n7.l.Z1(e02, 10));
                        for (Triple triple : e02) {
                            arrayList.add(Integer.valueOf(((Number) triple.f12972i).intValue()));
                        }
                        int[] v22 = kotlin.collections.b.v2((Integer[]) arrayList.toArray(new Integer[0]));
                        ArrayList arrayList2 = new ArrayList(n7.l.Z1(e02, 10));
                        for (Triple triple2 : e02) {
                            arrayList2.add(Integer.valueOf(((Number) triple2.f12973j).intValue()));
                        }
                        int[] v23 = kotlin.collections.b.v2((Integer[]) arrayList2.toArray(new Integer[0]));
                        ArrayList arrayList3 = new ArrayList(n7.l.Z1(e02, 10));
                        for (Triple triple3 : e02) {
                            arrayList3.add((String) triple3.f12974k);
                        }
                        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                        v7.g.f(str, "currentTitleText");
                        v7.g.f(str2, "currentBodyText");
                        v7.g.f(strArr, "content");
                        a0Var = new a0(j2, j10, true, true, str, str2, v22, v23, strArr);
                    } else {
                        return;
                    }
                } else if (b0Var.f17297d.isFocused() && (g10 = ViewUtilsKt.g(noteFragment)) != null) {
                    long j11 = noteFragment.a0().f348a;
                    long j12 = noteFragment.a0().f349b;
                    ArrayList arrayList4 = new ArrayList(n7.l.Z1(e03, 10));
                    for (Triple triple4 : e03) {
                        arrayList4.add(Integer.valueOf(((Number) triple4.f12972i).intValue()));
                    }
                    int[] v24 = kotlin.collections.b.v2((Integer[]) arrayList4.toArray(new Integer[0]));
                    ArrayList arrayList5 = new ArrayList(n7.l.Z1(e03, 10));
                    for (Triple triple5 : e03) {
                        arrayList5.add(Integer.valueOf(((Number) triple5.f12973j).intValue()));
                    }
                    int[] v25 = kotlin.collections.b.v2((Integer[]) arrayList5.toArray(new Integer[0]));
                    ArrayList arrayList6 = new ArrayList(n7.l.Z1(e03, 10));
                    for (Triple triple6 : e03) {
                        arrayList6.add((String) triple6.f12974k);
                    }
                    String[] strArr2 = (String[]) arrayList6.toArray(new String[0]);
                    v7.g.f(str, "currentTitleText");
                    v7.g.f(str2, "currentBodyText");
                    v7.g.f(strArr2, "content");
                    a0Var = new a0(j11, j12, true, false, str, str2, v24, v25, strArr2);
                    navController = g10;
                } else {
                    return;
                }
                ViewUtilsKt.o(navController, a0Var, null);
                return;
            default:
                d0 d0Var = (d0) obj2;
                NoteSelectionDialogFragment noteSelectionDialogFragment = (NoteSelectionDialogFragment) obj;
                int i12 = NoteSelectionDialogFragment.B0;
                v7.g.f(noteSelectionDialogFragment, "this$0");
                if (d0Var != null) {
                    d0Var.c("folder_id").d(noteSelectionDialogFragment.r(), new NoteSelectionDialogFragment.a(new NoteSelectionDialogFragment$setupListeners$8$1(noteSelectionDialogFragment, d0Var)));
                }
                NavController g11 = ViewUtilsKt.g(noteSelectionDialogFragment);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, a1.c.L(new long[]{noteSelectionDialogFragment.h0().f331a}), null);
                    return;
                }
                return;
        }
    }
}
