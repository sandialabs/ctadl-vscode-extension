package r4;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;
import n4.b;
import n4.g;
import w4.s;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f17058b = g.f("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f17059a;

    public b(Context context) {
        this.f17059a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JobInfo a(s sVar, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", sVar.f18334a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", sVar.f18351t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", sVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i10, this.f17059a);
        n4.b bVar = sVar.f18342j;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(bVar.f16077b);
        boolean z11 = bVar.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        int i14 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        NetworkType networkType = bVar.f16076a;
        if (i14 >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int ordinal = networkType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i11 = 2;
                    if (ordinal != 2) {
                        i11 = 3;
                        if (ordinal != 3) {
                            i11 = 4;
                            if (ordinal == 4 && i14 >= 26) {
                            }
                            g d5 = g.d();
                            d5.a(f17058b, "API version too low. Cannot convert network type value " + networkType);
                        } else {
                            if (i14 >= 24) {
                            }
                            g d52 = g.d();
                            d52.a(f17058b, "API version too low. Cannot convert network type value " + networkType);
                        }
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!z11) {
            if (sVar.f18344l == BackoffPolicy.LINEAR) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(sVar.f18345m, i13);
        }
        long max = Math.max(sVar.a() - System.currentTimeMillis(), 0L);
        if (i14 > 28 && max <= 0) {
            if (!sVar.f18348q) {
                extras.setImportantWhileForeground(true);
            }
            if (i14 >= 24) {
                Set<b.a> set = bVar.f16082h;
                if (!set.isEmpty()) {
                    for (b.a aVar : set) {
                        extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f16083a, aVar.f16084b ? 1 : 0));
                    }
                    extras.setTriggerContentUpdateDelay(bVar.f16080f);
                    extras.setTriggerContentMaxDelay(bVar.f16081g);
                }
            }
            extras.setPersisted(false);
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                extras.setRequiresBatteryNotLow(bVar.f16078d);
                extras.setRequiresStorageNotLow(bVar.f16079e);
            }
            if (sVar.f18343k <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (max > 0) {
                z12 = true;
            }
            if (i12 >= 31 && sVar.f18348q && !z10 && !z12) {
                extras.setExpedited(true);
            }
            return extras.build();
        }
        extras.setMinimumLatency(max);
        if (i14 >= 24) {
        }
        extras.setPersisted(false);
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
        }
        if (sVar.f18343k <= 0) {
        }
        if (max > 0) {
        }
        if (i12 >= 31) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
