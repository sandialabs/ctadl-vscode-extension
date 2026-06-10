package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import n6.c;
import s6.w;
import u7.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, d2 = {"Ln6/c;", "", "Lkotlin/Pair;", "Lt6/a;", "", "folders", "", "isShowNotesCount", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainArchiveFragment$setupState$1", f = "MainArchiveFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MainArchiveFragment$setupState$1 extends SuspendLambda implements q<n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>>, Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ n6.c f8834m;
    public /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ MainArchiveFragment f8835o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ w f8836p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainArchiveFragment$setupState$1(MainArchiveFragment mainArchiveFragment, w wVar, p7.c<? super MainArchiveFragment$setupState$1> cVar) {
        super(3, cVar);
        this.f8835o = mainArchiveFragment;
        this.f8836p = wVar;
    }

    @Override // u7.q
    public final Object O(n6.c<? extends List<? extends Pair<? extends t6.a, ? extends Integer>>> cVar, Boolean bool, p7.c<? super n> cVar2) {
        boolean booleanValue = bool.booleanValue();
        MainArchiveFragment$setupState$1 mainArchiveFragment$setupState$1 = new MainArchiveFragment$setupState$1(this.f8835o, this.f8836p, cVar2);
        mainArchiveFragment$setupState$1.f8834m = cVar;
        mainArchiveFragment$setupState$1.n = booleanValue;
        return mainArchiveFragment$setupState$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        n6.c cVar = this.f8834m;
        boolean z10 = this.n;
        int i10 = MainArchiveFragment.f8823w0;
        MainArchiveFragment mainArchiveFragment = this.f8835o;
        mainArchiveFragment.getClass();
        if (cVar instanceof c.b) {
            this.f8836p.f17479a.p0(new MainArchiveFragment$setupFolders$1(mainArchiveFragment, (List) ((c.b) cVar).f16111a, z10));
        }
        return n.f16010a;
    }
}
