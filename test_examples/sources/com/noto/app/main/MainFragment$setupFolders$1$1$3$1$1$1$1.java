package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.u;
import androidx.navigation.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/u;", "Lm7/n;", "invoke", "(Landroidx/navigation/u;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainFragment$setupFolders$1$1$3$1$1$1$1 extends Lambda implements l<u, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainFragment f8876j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/z;", "Lm7/n;", "invoke", "(Landroidx/navigation/z;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.main.MainFragment$setupFolders$1$1$3$1$1$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<z, n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f8877j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final n U(z zVar) {
            z zVar2 = zVar;
            g.f(zVar2, "$this$popUpTo");
            zVar2.f5558a = true;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainFragment$setupFolders$1$1$3$1$1$1$1(MainFragment mainFragment) {
        super(1);
        this.f8876j = mainFragment;
    }

    @Override // u7.l
    public final n U(u uVar) {
        u uVar2 = uVar;
        g.f(uVar2, "$this$navigateSafely");
        uVar2.a(MainFragment.g0(this.f8876j), AnonymousClass1.f8877j);
        return n.f16010a;
    }
}
