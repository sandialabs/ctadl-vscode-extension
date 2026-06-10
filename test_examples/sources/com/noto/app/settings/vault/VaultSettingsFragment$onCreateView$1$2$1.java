package com.noto.app.settings.vault;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.settings.c;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultSettingsFragment$onCreateView$1$2$1 extends Lambda implements l<Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ VaultSettingsFragment f9771j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ComposeView f9772k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Context f9773l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.settings.vault.VaultSettingsFragment$onCreateView$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<Throwable, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ComposeView f9774j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Context f9775k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ VaultSettingsFragment f9776l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, ComposeView composeView, VaultSettingsFragment vaultSettingsFragment) {
            super(1);
            this.f9774j = composeView;
            this.f9775k = context;
            this.f9776l = vaultSettingsFragment;
        }

        @Override // u7.l
        public final n U(Throwable th) {
            Throwable th2 = th;
            ComposeView composeView = this.f9774j;
            Context context = this.f9775k;
            g.e(context, "context");
            ViewUtilsKt.w(composeView, q.f(context, R.string.vault_is_disabled, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_shield_24), null, null, 28);
            NavController g10 = ViewUtilsKt.g(this.f9776l);
            if (g10 != null) {
                g10.j();
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultSettingsFragment$onCreateView$1$2$1(Context context, ComposeView composeView, VaultSettingsFragment vaultSettingsFragment) {
        super(1);
        this.f9771j = vaultSettingsFragment;
        this.f9772k = composeView;
        this.f9773l = context;
    }

    @Override // u7.l
    public final n U(Integer num) {
        Integer num2 = num;
        VaultSettingsFragment vaultSettingsFragment = this.f9771j;
        ((c) vaultSettingsFragment.f9767d0.getValue()).d().O(new AnonymousClass1(this.f9773l, this.f9772k, vaultSettingsFragment));
        return n.f16010a;
    }
}
