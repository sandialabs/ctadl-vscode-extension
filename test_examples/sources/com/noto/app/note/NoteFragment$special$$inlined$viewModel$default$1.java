package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.viewmodel.ext.android.ViewModelStoreOwnerExtKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/i0;", "T", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteFragment$special$$inlined$viewModel$default$1 extends Lambda implements u7.a<NoteViewModel> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ n0 f9058j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.a f9059k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$special$$inlined$viewModel$default$1(n0 n0Var, u7.a aVar) {
        super(0);
        this.f9058j = n0Var;
        this.f9059k = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.noto.app.note.NoteViewModel, androidx.lifecycle.i0] */
    @Override // u7.a
    public final NoteViewModel k0() {
        return ViewModelStoreOwnerExtKt.a(this.f9058j, null, v7.i.a(NoteViewModel.class), this.f9059k);
    }
}
