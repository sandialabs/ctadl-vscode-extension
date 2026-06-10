package com.noto.app.folder;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.s;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import com.noto.app.domain.model.Layout;
import com.noto.app.domain.model.NewNoteCursorPosition;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.domain.model.OpenNotesIn;
import com.noto.app.util.ViewUtilsKt;
import java.util.NoSuchElementException;
import kotlin.Pair;
import s6.y;
import x6.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f8677i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f8678j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f8679k;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f8677i = i10;
        this.f8678j = obj;
        this.f8679k = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Layout layout;
        NewNoteCursorPosition newNoteCursorPosition;
        OpenNotesIn openNotesIn;
        int i10 = this.f8677i;
        Object obj = this.f8679k;
        Object obj2 = this.f8678j;
        switch (i10) {
            case 0:
            case 1:
                FolderArchiveFragment$setupArchivedNotes$1.a((FolderArchiveFragment) obj2, (h0) obj);
                return;
            default:
                y yVar = (y) obj2;
                NewFolderFragment newFolderFragment = (NewFolderFragment) obj;
                int i11 = NewFolderFragment.f8567f0;
                v7.g.f(yVar, "$this_setupListeners");
                v7.g.f(newFolderFragment, "this$0");
                String valueOf = String.valueOf(yVar.c.getText());
                if (ha.i.T0(valueOf)) {
                    TextInputLayout textInputLayout = yVar.f17492i;
                    textInputLayout.setErrorEnabled(true);
                    Context j2 = newFolderFragment.j();
                    if (j2 != null) {
                        textInputLayout.setError(f7.q.f(j2, R.string.empty_title, new Object[0]));
                        return;
                    }
                    return;
                }
                if (yVar.f17493j.getSelectedTabPosition() == 0) {
                    layout = Layout.Linear;
                } else {
                    layout = Layout.Grid;
                }
                Layout layout2 = layout;
                if (yVar.f17494k.getSelectedTabPosition() == 0) {
                    newNoteCursorPosition = NewNoteCursorPosition.Body;
                } else {
                    newNoteCursorPosition = NewNoteCursorPosition.Title;
                }
                NewNoteCursorPosition newNoteCursorPosition2 = newNoteCursorPosition;
                if (yVar.f17495l.getSelectedTabPosition() == 0) {
                    openNotesIn = OpenNotesIn.Editor;
                } else {
                    openNotesIn = OpenNotesIn.ReadingMode;
                }
                OpenNotesIn openNotesIn2 = openNotesIn;
                s c = newFolderFragment.c();
                if (c != null) {
                    CoordinatorLayout coordinatorLayout = yVar.f17485a;
                    v7.g.e(coordinatorLayout, "root");
                    ViewUtilsKt.h(c, coordinatorLayout);
                }
                t6.a aVar = (t6.a) ((kotlinx.coroutines.flow.m) newFolderFragment.b0().k()).getValue();
                for (Pair pair : (Iterable) a1.b.m(newFolderFragment.b0().f8437q).getValue()) {
                    if (((Boolean) pair.f12963j).booleanValue()) {
                        t6.a a10 = t6.a.a(aVar, null, valueOf, 0, (NotoColor) pair.f12962i, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097131);
                        Context j10 = newFolderFragment.j();
                        if (j10 != null) {
                            o2.d.j(j10, a1.c.N0(f7.f.c(j10, a10)));
                        }
                        FolderViewModel b02 = newFolderFragment.b0();
                        boolean isChecked = yVar.f17490g.isChecked();
                        NewFolderFragment$setupListeners$5$2 newFolderFragment$setupListeners$5$2 = new NewFolderFragment$setupListeners$5$2(newFolderFragment);
                        b02.getClass();
                        m0.b.M0(a1.b.d0(b02), null, null, new FolderViewModel$createOrUpdateFolder$1(b02, valueOf, layout2, (int) yVar.f17489f.getValue(), isChecked, newNoteCursorPosition2, openNotesIn2, newFolderFragment$setupListeners$5$2, null), 3).O(new NewFolderFragment$setupListeners$5$3(newFolderFragment));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
