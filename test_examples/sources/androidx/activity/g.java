package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f457i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f458j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f459k;

    public g(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f459k = bVar;
        this.f457i = i10;
        this.f458j = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f459k.a(this.f457i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f458j));
    }
}
