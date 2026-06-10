package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$27", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$27 extends SuspendLambda implements u7.p<Pair<? extends Boolean, ? extends String>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9087m;
    public final /* synthetic */ NoteFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9088o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$27(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(2, cVar);
        this.n = noteFragment;
        this.f9088o = b0Var;
    }

    @Override // u7.p
    public final Object R(Pair<? extends Boolean, ? extends String> pair, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$27) a(pair, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$27 noteFragment$setupState$27 = new NoteFragment$setupState$27(this.f9088o, this.n, cVar);
        noteFragment$setupState$27.f9087m = obj;
        return noteFragment$setupState$27;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        Pair pair = (Pair) this.f9087m;
        boolean booleanValue = ((Boolean) pair.f12962i).booleanValue();
        String str = (String) pair.f12963j;
        if (booleanValue) {
            int i10 = NoteFragment.f9026f0;
            NoteFragment noteFragment = this.n;
            NoteFragment.Z(noteFragment, this.f9088o, noteFragment.b0().j().b(), str);
        }
        return m7.n.f16010a;
    }
}
