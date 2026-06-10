package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@"}, d2 = {"", "Lkotlin/Pair;", "Lcom/noto/app/domain/model/NotoColor;", "", "pairs", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.NewFolderFragment$setupState$3", f = "NewFolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NewFolderFragment$setupState$3 extends SuspendLambda implements u7.p<List<? extends Pair<? extends NotoColor, ? extends Boolean>>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8583m;
    public final /* synthetic */ NewFolderFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ y f8584o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupState$3(NewFolderFragment newFolderFragment, y yVar, p7.c<? super NewFolderFragment$setupState$3> cVar) {
        super(2, cVar);
        this.n = newFolderFragment;
        this.f8584o = yVar;
    }

    @Override // u7.p
    public final Object R(List<? extends Pair<? extends NotoColor, ? extends Boolean>> list, p7.c<? super m7.n> cVar) {
        return ((NewFolderFragment$setupState$3) a(list, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NewFolderFragment$setupState$3 newFolderFragment$setupState$3 = new NewFolderFragment$setupState$3(this.n, this.f8584o, cVar);
        newFolderFragment$setupState$3.f8583m = obj;
        return newFolderFragment$setupState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        int i10 = NewFolderFragment.f8567f0;
        NewFolderFragment newFolderFragment = this.n;
        newFolderFragment.getClass();
        this.f8584o.f17488e.p0(new NewFolderFragment$setupNotoColors$1((List) this.f8583m, newFolderFragment));
        return m7.n.f16010a;
    }
}
