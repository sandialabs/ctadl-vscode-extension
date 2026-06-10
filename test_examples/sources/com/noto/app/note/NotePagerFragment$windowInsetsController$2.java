package com.noto.app.note;

import a3.d1;
import android.view.View;
import android.view.Window;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La3/d1;", "invoke", "()La3/d1;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NotePagerFragment$windowInsetsController$2 extends Lambda implements u7.a<d1> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NotePagerFragment f9135j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$windowInsetsController$2(NotePagerFragment notePagerFragment) {
        super(0);
        this.f9135j = notePagerFragment;
    }

    @Override // u7.a
    public final d1 k0() {
        Window window;
        View view;
        s c = this.f9135j.c();
        if (c != null) {
            window = c.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (window == null || view == null) {
            return null;
        }
        return new d1(window, view);
    }
}
