package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import m7.n;
import v7.g;
import y3.d;
import y3.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: i  reason: collision with root package name */
    public int f6021i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f6022j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final b f6023k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final a f6024l = new a();

    /* loaded from: classes.dex */
    public static final class a extends e.a {
        public a() {
        }

        @Override // y3.e
        public final int b(d dVar, String str) {
            g.f(dVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f6023k) {
                int i11 = multiInstanceInvalidationService.f6021i + 1;
                multiInstanceInvalidationService.f6021i = i11;
                if (multiInstanceInvalidationService.f6023k.register(dVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f6022j.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f6021i--;
                }
            }
            return i10;
        }

        @Override // y3.e
        public final void c(int i10, String[] strArr) {
            g.f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f6023k) {
                String str = (String) multiInstanceInvalidationService.f6022j.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f6023k.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    Object broadcastCookie = multiInstanceInvalidationService.f6023k.getBroadcastCookie(i11);
                    g.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = (String) multiInstanceInvalidationService.f6022j.get(Integer.valueOf(intValue));
                    if (i10 != intValue && g.a(str, str2)) {
                        try {
                            multiInstanceInvalidationService.f6023k.getBroadcastItem(i11).a(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                multiInstanceInvalidationService.f6023k.finishBroadcast();
                n nVar = n.f16010a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<d> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(d dVar, Object obj) {
            g.f(dVar, "callback");
            g.f(obj, "cookie");
            MultiInstanceInvalidationService.this.f6022j.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        g.f(intent, "intent");
        return this.f6024l;
    }
}
