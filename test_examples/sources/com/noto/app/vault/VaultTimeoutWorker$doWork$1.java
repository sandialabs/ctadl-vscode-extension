package com.noto.app.vault;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
@c(c = "com.noto.app.vault.VaultTimeoutWorker", f = "VaultTimeoutWorker.kt", l = {17, 18}, m = "doWork")
/* loaded from: classes.dex */
public final class VaultTimeoutWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public VaultTimeoutWorker f9936l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9937m;
    public final /* synthetic */ VaultTimeoutWorker n;

    /* renamed from: o  reason: collision with root package name */
    public int f9938o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultTimeoutWorker$doWork$1(VaultTimeoutWorker vaultTimeoutWorker, p7.c<? super VaultTimeoutWorker$doWork$1> cVar) {
        super(cVar);
        this.n = vaultTimeoutWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f9937m = obj;
        this.f9938o |= Integer.MIN_VALUE;
        return this.n.i(this);
    }
}
