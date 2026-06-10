package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import u7.r;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00072\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lkotlin/Triple;", "", "", "<anonymous parameter 0>", "title", "", "isFocused", "Lkotlin/Pair;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$26", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$26 extends SuspendLambda implements r<Triple<? extends Integer, ? extends Integer, ? extends String>, String, Boolean, p7.c<? super Pair<? extends Boolean, ? extends String>>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ String f9086m;
    public /* synthetic */ boolean n;

    public NoteFragment$setupState$26(p7.c<? super NoteFragment$setupState$26> cVar) {
        super(4, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        return new Pair(Boolean.valueOf(this.n), this.f9086m);
    }

    @Override // u7.r
    public final Object l0(Triple<? extends Integer, ? extends Integer, ? extends String> triple, String str, Boolean bool, p7.c<? super Pair<? extends Boolean, ? extends String>> cVar) {
        Triple<? extends Integer, ? extends Integer, ? extends String> triple2 = triple;
        boolean booleanValue = bool.booleanValue();
        NoteFragment$setupState$26 noteFragment$setupState$26 = new NoteFragment$setupState$26(cVar);
        noteFragment$setupState$26.f9086m = str;
        noteFragment$setupState$26.n = booleanValue;
        return noteFragment$setupState$26.k(m7.n.f16010a);
    }
}
