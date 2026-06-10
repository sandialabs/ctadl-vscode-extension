package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isSelection", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$13", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$13 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8405m;
    public final /* synthetic */ s6.i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$13(s6.i iVar, p7.c<? super FolderFragment$setupState$13> cVar) {
        super(2, cVar);
        this.n = iVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$13) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$13 folderFragment$setupState$13 = new FolderFragment$setupState$13(this.n, cVar);
        folderFragment$setupState$13.f8405m = ((Boolean) obj).booleanValue();
        return folderFragment$setupState$13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        FloatingActionButton floatingActionButton;
        m0.b.n1(obj);
        boolean z10 = this.f8405m;
        s6.i iVar = this.n;
        if (z10) {
            iVar.f17372e.h(null, true);
            BottomAppBar bottomAppBar = iVar.f17370b;
            bottomAppBar.getBehavior().t(bottomAppBar);
            v7.g.e(bottomAppBar, "bab");
            bottomAppBar.setVisibility(8);
            BottomAppBar bottomAppBar2 = iVar.c;
            v7.g.e(bottomAppBar2, "babSelection");
            bottomAppBar2.setVisibility(0);
            bottomAppBar2.E();
            floatingActionButton = iVar.f17373f;
        } else {
            iVar.f17373f.h(null, true);
            BottomAppBar bottomAppBar3 = iVar.c;
            bottomAppBar3.getBehavior().t(bottomAppBar3);
            v7.g.e(bottomAppBar3, "babSelection");
            bottomAppBar3.setVisibility(8);
            BottomAppBar bottomAppBar4 = iVar.f17370b;
            v7.g.e(bottomAppBar4, "bab");
            bottomAppBar4.setVisibility(0);
            bottomAppBar4.E();
            floatingActionButton = iVar.f17372e;
        }
        floatingActionButton.m();
        return m7.n.f16010a;
    }
}
