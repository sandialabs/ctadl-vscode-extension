package a7;

import android.view.View;
import androidx.navigation.NavController;
import com.noto.app.note.NoteFragment;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f308i = 1;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f309j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ s6.b0 f310k;

    public /* synthetic */ j(NoteFragment noteFragment, s6.b0 b0Var) {
        this.f309j = noteFragment;
        this.f310k = b0Var;
    }

    public /* synthetic */ j(s6.b0 b0Var, NoteFragment noteFragment) {
        this.f310k = b0Var;
        this.f309j = noteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Triple<Integer, Integer, String> p10;
        NavController g10;
        a0 a0Var;
        NavController navController;
        int i10 = this.f308i;
        NoteFragment noteFragment = this.f309j;
        s6.b0 b0Var = this.f310k;
        switch (i10) {
            case 0:
                int i11 = NoteFragment.f9026f0;
                v7.g.f(b0Var, "$this_setupListeners");
                v7.g.f(noteFragment, "this$0");
                CustomEditText customEditText = b0Var.f17298e;
                if (customEditText.isFocused()) {
                    p10 = noteFragment.b0().q();
                } else {
                    customEditText = b0Var.f17297d;
                    if (customEditText.isFocused()) {
                        p10 = noteFragment.b0().p();
                    } else {
                        return;
                    }
                }
                customEditText.setSelection(p10.f12973j.intValue());
                return;
            default:
                int i12 = NoteFragment.f9026f0;
                v7.g.f(noteFragment, "this$0");
                v7.g.f(b0Var, "$this_setupListeners");
                String str = ((t6.d) noteFragment.b0().h().getValue()).c;
                String str2 = ((t6.d) noteFragment.b0().h().getValue()).f17623d;
                List<Triple> d02 = NoteFragment.d0(str, noteFragment.b0().j().b());
                List<Triple> d03 = NoteFragment.d0(str2, noteFragment.b0().e().b());
                if (b0Var.f17298e.isFocused()) {
                    navController = ViewUtilsKt.g(noteFragment);
                    if (navController != null) {
                        long j2 = noteFragment.a0().f348a;
                        long j10 = noteFragment.a0().f349b;
                        ArrayList arrayList = new ArrayList(n7.l.Z1(d02, 10));
                        for (Triple triple : d02) {
                            arrayList.add(Integer.valueOf(((Number) triple.f12972i).intValue()));
                        }
                        int[] v22 = kotlin.collections.b.v2((Integer[]) arrayList.toArray(new Integer[0]));
                        ArrayList arrayList2 = new ArrayList(n7.l.Z1(d02, 10));
                        for (Triple triple2 : d02) {
                            arrayList2.add(Integer.valueOf(((Number) triple2.f12973j).intValue()));
                        }
                        int[] v23 = kotlin.collections.b.v2((Integer[]) arrayList2.toArray(new Integer[0]));
                        ArrayList arrayList3 = new ArrayList(n7.l.Z1(d02, 10));
                        for (Triple triple3 : d02) {
                            arrayList3.add((String) triple3.f12974k);
                        }
                        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                        v7.g.f(str, "currentTitleText");
                        v7.g.f(str2, "currentBodyText");
                        v7.g.f(strArr, "content");
                        a0Var = new a0(j2, j10, false, true, str, str2, v22, v23, strArr);
                    } else {
                        return;
                    }
                } else if (b0Var.f17297d.isFocused() && (g10 = ViewUtilsKt.g(noteFragment)) != null) {
                    long j11 = noteFragment.a0().f348a;
                    long j12 = noteFragment.a0().f349b;
                    ArrayList arrayList4 = new ArrayList(n7.l.Z1(d03, 10));
                    for (Triple triple4 : d03) {
                        arrayList4.add(Integer.valueOf(((Number) triple4.f12972i).intValue()));
                    }
                    int[] v24 = kotlin.collections.b.v2((Integer[]) arrayList4.toArray(new Integer[0]));
                    ArrayList arrayList5 = new ArrayList(n7.l.Z1(d03, 10));
                    for (Triple triple5 : d03) {
                        arrayList5.add(Integer.valueOf(((Number) triple5.f12973j).intValue()));
                    }
                    int[] v25 = kotlin.collections.b.v2((Integer[]) arrayList5.toArray(new Integer[0]));
                    ArrayList arrayList6 = new ArrayList(n7.l.Z1(d03, 10));
                    for (Triple triple6 : d03) {
                        arrayList6.add((String) triple6.f12974k);
                    }
                    String[] strArr2 = (String[]) arrayList6.toArray(new String[0]);
                    v7.g.f(str, "currentTitleText");
                    v7.g.f(str2, "currentBodyText");
                    v7.g.f(strArr2, "content");
                    a0Var = new a0(j11, j12, false, false, str, str2, v24, v25, strArr2);
                    navController = g10;
                } else {
                    return;
                }
                ViewUtilsKt.o(navController, a0Var, null);
                return;
        }
    }
}
