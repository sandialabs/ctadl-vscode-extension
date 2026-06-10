package com.noto.app.folder;

import androidx.appcompat.widget.e1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isSearchEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$8", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$8 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8421m;
    public final /* synthetic */ FolderFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s6.i f8422o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$8(s6.i iVar, FolderFragment folderFragment, p7.c cVar) {
        super(2, cVar);
        this.n = folderFragment;
        this.f8422o = iVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((FolderFragment$setupState$8) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderFragment$setupState$8 folderFragment$setupState$8 = new FolderFragment$setupState$8(this.f8422o, this.n, cVar);
        folderFragment$setupState$8.f8421m = ((Boolean) obj).booleanValue();
        return folderFragment$setupState$8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        boolean z10 = this.f8421m;
        s6.i iVar = this.f8422o;
        FolderFragment folderFragment = this.n;
        if (z10) {
            int i10 = FolderFragment.f8358k0;
            folderFragment.getClass();
            TextInputLayout textInputLayout = iVar.f17375h;
            v7.g.e(textInputLayout, "tilSearch");
            textInputLayout.setVisibility(0);
            iVar.f17375h.postDelayed(new e1(14, iVar), 250L);
            s c = folderFragment.c();
            if (c != null) {
                TextInputEditText textInputEditText = iVar.f17371d;
                v7.g.e(textInputEditText, "etSearch");
                ViewUtilsKt.v(c, textInputEditText);
            }
        } else {
            int i11 = FolderFragment.f8358k0;
            folderFragment.getClass();
            TextInputLayout textInputLayout2 = iVar.f17375h;
            v7.g.e(textInputLayout2, "tilSearch");
            textInputLayout2.setVisibility(8);
            s c10 = folderFragment.c();
            TextInputEditText textInputEditText2 = iVar.f17371d;
            if (c10 != null) {
                v7.g.e(textInputEditText2, "etSearch");
                ViewUtilsKt.h(c10, textInputEditText2);
            }
            textInputEditText2.setText((CharSequence) null);
        }
        return m7.n.f16010a;
    }
}
