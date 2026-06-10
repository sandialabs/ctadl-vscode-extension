package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.g;
import b2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb2/h;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lb2/g;", "invoke-5SAbXVA", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SizeKt$createWrapContentSizeModifier$1 extends Lambda implements p<h, LayoutDirection, g> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q0.a f1967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentSizeModifier$1(q0.a aVar) {
        super(2);
        this.f1967j = aVar;
    }

    @Override // u7.p
    public final g R(h hVar, LayoutDirection layoutDirection) {
        long j2 = hVar.f6346a;
        LayoutDirection layoutDirection2 = layoutDirection;
        v7.g.f(layoutDirection2, "layoutDirection");
        return new g(this.f1967j.a(0L, j2, layoutDirection2));
    }
}
