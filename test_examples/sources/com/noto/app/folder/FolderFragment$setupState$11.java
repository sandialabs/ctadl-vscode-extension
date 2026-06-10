package com.noto.app.folder;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isVisible", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$11", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$11 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8402m;
    public final /* synthetic */ s6.i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$11(s6.i iVar, p7.c<? super FolderFragment$setupState$11> cVar) {
        super(2, cVar);
        this.n = iVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$11) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$11 folderFragment$setupState$11 = new FolderFragment$setupState$11(this.n, cVar);
        folderFragment$setupState$11.f8402m = ((Boolean) obj).booleanValue();
        return folderFragment$setupState$11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        int id;
        int i11;
        m0.b.n1(obj);
        boolean z10 = this.f8402m;
        s6.i iVar = this.n;
        FloatingActionButton floatingActionButton = iVar.f17372e;
        v7.g.e(floatingActionButton, "fab");
        boolean z11 = !z10;
        int i12 = 8;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        floatingActionButton.setVisibility(i10);
        BottomAppBar bottomAppBar = iVar.f17370b;
        v7.g.e(bottomAppBar, "bab");
        if (z11) {
            i12 = 0;
        }
        bottomAppBar.setVisibility(i12);
        TextInputLayout textInputLayout = iVar.f17375h;
        v7.g.e(textInputLayout, "tilSearch");
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
            if (z10) {
                id = -1;
            } else {
                id = iVar.f17372e.getId();
            }
            fVar.f4603l = null;
            fVar.f4602k = null;
            fVar.f4597f = id;
            if (z10) {
                i11 = 80;
            } else {
                i11 = 48;
            }
            fVar.c = i11;
            textInputLayout.setLayoutParams(fVar);
            return m7.n.f16010a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
