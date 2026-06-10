package com.noto.app.folder;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NewFolderFragment$setupState$1", f = "NewFolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NewFolderFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8579m;
    public final /* synthetic */ NewFolderFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ y f8580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupState$1(NewFolderFragment newFolderFragment, y yVar, p7.c<? super NewFolderFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = newFolderFragment;
        this.f8580o = yVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NewFolderFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NewFolderFragment$setupState$1 newFolderFragment$setupState$1 = new NewFolderFragment$setupState$1(this.n, this.f8580o, cVar);
        newFolderFragment$setupState$1.f8579m = obj;
        return newFolderFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        TabLayout.f f10;
        TabLayout.f f11;
        TabLayout.f f12;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8579m;
        int i10 = NewFolderFragment.f8567f0;
        NewFolderFragment newFolderFragment = this.n;
        newFolderFragment.getClass();
        y yVar = this.f8580o;
        yVar.f17488e.j0(aVar.f17595e.ordinal());
        int ordinal = aVar.f17597g.ordinal();
        TabLayout tabLayout = yVar.f17493j;
        if (ordinal != 0) {
            if (ordinal == 1) {
                f10 = tabLayout.f(1);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f10 = tabLayout.f(0);
        }
        int ordinal2 = aVar.f17602l.ordinal();
        TabLayout tabLayout2 = yVar.f17494k;
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                f11 = tabLayout2.f(1);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f11 = tabLayout2.f(0);
        }
        int ordinal3 = aVar.f17609t.ordinal();
        TabLayout tabLayout3 = yVar.f17495l;
        if (ordinal3 != 0) {
            if (ordinal3 == 1) {
                f12 = tabLayout3.f(1);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f12 = tabLayout3.f(0);
        }
        tabLayout.h(f10, true);
        tabLayout2.h(f11, true);
        tabLayout3.h(f12, true);
        boolean z10 = aVar.f17601k;
        MaterialSwitch materialSwitch = yVar.f17490g;
        materialSwitch.setChecked(z10);
        ViewUtilsKt.u(materialSwitch);
        yVar.f17489f.setValue(aVar.f17598h);
        Context j2 = newFolderFragment.j();
        if (j2 != null) {
            String o10 = ModelUtilsKt.o(j2, aVar);
            TextInputEditText textInputEditText = yVar.c;
            textInputEditText.setText(o10);
            textInputEditText.setSelection(ModelUtilsKt.o(j2, aVar).length());
            if (aVar.f17592a != 0) {
                int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
                MaterialToolbar materialToolbar = yVar.f17491h;
                materialToolbar.setTitleTextColor(b5);
                materialToolbar.setNavigationIconTint(b5);
                MaterialButton materialButton = yVar.f17486b;
                materialButton.setBackgroundColor(b5);
                if (Build.VERSION.SDK_INT >= 28) {
                    materialButton.setOutlineAmbientShadowColor(b5);
                    materialButton.setOutlineSpotShadowColor(b5);
                }
            }
        }
        return m7.n.f16010a;
    }
}
