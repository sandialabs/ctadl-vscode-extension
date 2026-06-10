package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt6/d;", "note", "", "invoke", "(Lt6/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteFragment$setupState$7 extends Lambda implements u7.l<t6.d, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final NoteFragment$setupState$7 f9104j = new NoteFragment$setupState$7();

    public NoteFragment$setupState$7() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(t6.d dVar) {
        t6.d dVar2 = dVar;
        v7.g.f(dVar2, "note");
        return Boolean.valueOf(ModelUtilsKt.w(dVar2));
    }
}
