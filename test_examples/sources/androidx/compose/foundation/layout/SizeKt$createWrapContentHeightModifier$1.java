package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.g;
import b2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ma.i;
import q0.a;
import u7.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb2/h;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 1>", "Lb2/g;", "invoke-5SAbXVA", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SizeKt$createWrapContentHeightModifier$1 extends Lambda implements p<h, LayoutDirection, g> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a.c f1964j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentHeightModifier$1(a.c cVar) {
        super(2);
        this.f1964j = cVar;
    }

    @Override // u7.p
    public final g R(h hVar, LayoutDirection layoutDirection) {
        long j2 = hVar.f6346a;
        v7.g.f(layoutDirection, "<anonymous parameter 1>");
        return new g(i.g(0, this.f1964j.a(h.b(j2))));
    }
}
