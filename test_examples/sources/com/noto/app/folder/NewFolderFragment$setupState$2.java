package com.noto.app.folder;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lt6/a;", "parentFolder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NewFolderFragment$setupState$2", f = "NewFolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NewFolderFragment$setupState$2 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8581m;
    public final /* synthetic */ NewFolderFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ y f8582o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupState$2(NewFolderFragment newFolderFragment, y yVar, p7.c<? super NewFolderFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = newFolderFragment;
        this.f8582o = yVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NewFolderFragment$setupState$2) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NewFolderFragment$setupState$2 newFolderFragment$setupState$2 = new NewFolderFragment$setupState$2(this.n, this.f8582o, cVar);
        newFolderFragment$setupState$2.f8581m = obj;
        return newFolderFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        MaterialTextView materialTextView;
        int i10;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8581m;
        int i11 = NewFolderFragment.f8567f0;
        Context j2 = this.n.j();
        if (j2 != null) {
            y yVar = this.f8582o;
            if (aVar != null) {
                yVar.f17496m.setText(ModelUtilsKt.o(j2, aVar));
                materialTextView = yVar.f17496m;
                i10 = R.drawable.ic_round_folder_24;
            } else {
                yVar.f17496m.setText(f7.q.f(j2, R.string.none, new Object[0]));
                materialTextView = yVar.f17496m;
                i10 = R.drawable.ic_round_none_24;
            }
            materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, 0, 0, 0);
        }
        return m7.n.f16010a;
    }
}
