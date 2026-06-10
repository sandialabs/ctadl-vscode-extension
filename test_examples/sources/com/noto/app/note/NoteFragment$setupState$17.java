package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"", "isTracking", "", "cursorPosition", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$17", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$17 extends SuspendLambda implements q<Boolean, Integer, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9077m;
    public /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9078o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$17(NoteFragment noteFragment, p7.c<? super NoteFragment$setupState$17> cVar) {
        super(3, cVar);
        this.f9078o = noteFragment;
    }

    @Override // u7.q
    public final Object O(Boolean bool, Integer num, p7.c<? super m7.n> cVar) {
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        NoteFragment$setupState$17 noteFragment$setupState$17 = new NoteFragment$setupState$17(this.f9078o, cVar);
        noteFragment$setupState$17.f9077m = booleanValue;
        noteFragment$setupState$17.n = intValue;
        return noteFragment$setupState$17.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        boolean z10 = this.f9077m;
        int i10 = this.n;
        NoteFragment noteFragment = this.f9078o;
        if (z10) {
            int i11 = NoteFragment.f9026f0;
            noteFragment.b0().f9277x = i10;
        } else {
            int i12 = NoteFragment.f9026f0;
            noteFragment.b0().f9276w = i10;
        }
        return m7.n.f16010a;
    }
}
