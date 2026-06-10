package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import x6.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/i;", "Lm7/n;", "invoke", "(Landroidx/activity/i;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderFragment$setupListeners$7 extends Lambda implements u7.l<androidx.activity.i, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8390j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupListeners$7(FolderFragment folderFragment) {
        super(1);
        this.f8390j = folderFragment;
    }

    @Override // u7.l
    public final m7.n U(androidx.activity.i iVar) {
        boolean z10;
        v7.g.f(iVar, "$this$addCallback");
        int i10 = FolderFragment.f8358k0;
        FolderFragment folderFragment = this.f8390j;
        if (((Boolean) a1.b.m(folderFragment.a0().f8441u).getValue()).booleanValue()) {
            if (!((Boolean) a1.b.m(folderFragment.a0().f8438r).getValue()).booleanValue()) {
                folderFragment.a0().i();
            } else {
                FolderViewModel a02 = folderFragment.a0();
                a02.f8438r.setValue(Boolean.FALSE);
                a02.f8439s.setValue("");
            }
        } else {
            if (!((Boolean) a1.b.m(folderFragment.a0().f8438r).getValue()).booleanValue()) {
                Iterable<y6.h> iterable = (Iterable) ((kotlinx.coroutines.flow.m) folderFragment.a0().l()).getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (y6.h hVar : iterable) {
                        if (hVar.f18913b) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    folderFragment.a0().e();
                } else if (((Boolean) folderFragment.a0().f8442v.getValue()).booleanValue()) {
                    s c = folderFragment.c();
                    if (c != null) {
                        c.finish();
                    }
                } else {
                    NavController g10 = ViewUtilsKt.g(folderFragment);
                    if (g10 != null) {
                        ViewUtilsKt.o(g10, new v(true), null);
                    }
                }
            }
            FolderViewModel a022 = folderFragment.a0();
            a022.f8438r.setValue(Boolean.FALSE);
            a022.f8439s.setValue("");
        }
        return m7.n.f16010a;
    }
}
