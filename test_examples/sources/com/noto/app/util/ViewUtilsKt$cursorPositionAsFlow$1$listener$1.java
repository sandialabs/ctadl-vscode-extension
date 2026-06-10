package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import la.k;
import m7.n;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(I)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ViewUtilsKt$cursorPositionAsFlow$1$listener$1 extends Lambda implements l<Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k<Integer> f9876j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewUtilsKt$cursorPositionAsFlow$1$listener$1(k<? super Integer> kVar) {
        super(1);
        this.f9876j = kVar;
    }

    @Override // u7.l
    public final n U(Integer num) {
        this.f9876j.F(Integer.valueOf(num.intValue()));
        return n.f16010a;
    }
}
