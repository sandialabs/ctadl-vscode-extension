package com.noto.app.vault;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import db.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import m0.b;
import m7.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/noto/app/vault/VaultReceiver;", "Landroid/content/BroadcastReceiver;", "Ldb/a;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultReceiver extends BroadcastReceiver implements db.a {

    /* renamed from: i  reason: collision with root package name */
    public final e f9929i = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new VaultReceiver$special$$inlined$inject$default$1(this));

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b.h1(EmptyCoroutineContext.f13021i, new VaultReceiver$onReceive$1(context, this, null));
    }
}
