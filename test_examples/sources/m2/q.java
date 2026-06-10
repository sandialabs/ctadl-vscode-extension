package m2;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import m2.u;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Notification.Builder f15959a;

    /* renamed from: b  reason: collision with root package name */
    public final o f15960b;
    public final Bundle c;

    public q(o oVar) {
        Notification.Builder builder;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        int i10;
        Bundle bundle;
        ArrayList<m> arrayList;
        Bundle[] bundleArr;
        CharSequence charSequence;
        int i11;
        Notification.Action.Builder builder2;
        Bundle bundle2;
        Icon icon;
        new ArrayList();
        this.c = new Bundle();
        this.f15960b = oVar;
        Context context = oVar.f15937a;
        int i12 = Build.VERSION.SDK_INT;
        String str2 = oVar.f15953s;
        if (i12 >= 26) {
            builder = new Notification.Builder(context, str2);
        } else {
            builder = new Notification.Builder(context);
        }
        this.f15959a = builder;
        Notification notification = oVar.f15956v;
        ArrayList<String> arrayList2 = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z13 = true;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(oVar.f15940e).setContentText(oVar.f15941f).setContentInfo(null).setContentIntent(oVar.f15942g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(null, z13).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        builder.setSubText(oVar.f15946k).setUsesChronometer(false).setPriority(oVar.f15943h);
        Iterator<m> it = oVar.f15938b.iterator();
        while (it.hasNext()) {
            m next = it.next();
            int i13 = Build.VERSION.SDK_INT;
            if (next.f15928b == null) {
                next.getClass();
            }
            IconCompat iconCompat = next.f15928b;
            PendingIntent pendingIntent = next.f15934i;
            CharSequence charSequence2 = next.f15933h;
            if (i13 >= 23) {
                if (iconCompat != null) {
                    icon = iconCompat.g(null);
                } else {
                    icon = null;
                }
                builder2 = new Notification.Action.Builder(icon, charSequence2, pendingIntent);
            } else {
                if (iconCompat != null) {
                    i11 = iconCompat.c();
                } else {
                    i11 = 0;
                }
                builder2 = new Notification.Action.Builder(i11, charSequence2, pendingIntent);
            }
            v[] vVarArr = next.c;
            if (vVarArr != null) {
                int length = vVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (vVarArr.length <= 0) {
                    for (int i14 = 0; i14 < length; i14++) {
                        builder2.addRemoteInput(remoteInputArr[i14]);
                    }
                } else {
                    v vVar = vVarArr[0];
                    throw null;
                }
            }
            Bundle bundle3 = next.f15927a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z14 = next.f15929d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z14);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 24) {
                builder2.setAllowGeneratedReplies(z14);
            }
            int i16 = next.f15931f;
            bundle2.putInt("android.support.action.semanticAction", i16);
            if (i15 >= 28) {
                builder2.setSemanticAction(i16);
            }
            if (i15 >= 29) {
                builder2.setContextual(next.f15932g);
            }
            if (i15 >= 31) {
                builder2.setAuthenticationRequired(next.f15935j);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f15930e);
            builder2.addExtras(bundle2);
            this.f15959a.addAction(builder2.build());
        }
        Bundle bundle4 = oVar.f15951q;
        if (bundle4 != null) {
            this.c.putAll(bundle4);
        }
        int i17 = Build.VERSION.SDK_INT;
        this.f15959a.setShowWhen(oVar.f15944i);
        this.f15959a.setLocalOnly(false).setGroup(oVar.f15947l).setGroupSummary(oVar.f15948m).setSortKey(null);
        this.f15959a.setCategory(oVar.f15950p).setColor(oVar.f15952r).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<u> arrayList3 = oVar.c;
        ArrayList<String> arrayList4 = oVar.f15957w;
        if (i17 < 28) {
            if (arrayList3 != null) {
                arrayList2 = new ArrayList<>(arrayList3.size());
                Iterator<u> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    u next2 = it2.next();
                    String str3 = next2.c;
                    if (str3 == null) {
                        if (next2.f15963a == null) {
                            str3 = "";
                        } else {
                            str3 = "name:" + ((Object) charSequence);
                        }
                    }
                    arrayList2.add(str3);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    p.d dVar = new p.d(arrayList4.size() + arrayList2.size());
                    dVar.addAll(arrayList2);
                    dVar.addAll(arrayList4);
                    arrayList4 = new ArrayList<>(dVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            for (String str4 : arrayList4) {
                this.f15959a.addPerson(str4);
            }
        }
        ArrayList<m> arrayList5 = oVar.f15939d;
        if (arrayList5.size() > 0) {
            if (oVar.f15951q == null) {
                oVar.f15951q = new Bundle();
            }
            Bundle bundle5 = oVar.f15951q.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i18 = 0;
            while (i18 < arrayList5.size()) {
                String num = Integer.toString(i18);
                m mVar = arrayList5.get(i18);
                Object obj = r.f15961a;
                Bundle bundle8 = new Bundle();
                if (mVar.f15928b == null) {
                    mVar.getClass();
                }
                IconCompat iconCompat2 = mVar.f15928b;
                if (iconCompat2 != null) {
                    i10 = iconCompat2.c();
                } else {
                    i10 = 0;
                }
                bundle8.putInt("icon", i10);
                bundle8.putCharSequence("title", mVar.f15933h);
                bundle8.putParcelable("actionIntent", mVar.f15934i);
                Bundle bundle9 = mVar.f15927a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", mVar.f15929d);
                bundle8.putBundle("extras", bundle);
                v[] vVarArr2 = mVar.c;
                if (vVarArr2 == null) {
                    bundleArr = null;
                    arrayList = arrayList5;
                } else {
                    Bundle[] bundleArr2 = new Bundle[vVarArr2.length];
                    arrayList = arrayList5;
                    if (vVarArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        v vVar2 = vVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", mVar.f15930e);
                bundle8.putInt("semanticAction", mVar.f15931f);
                bundle7.putBundle(num, bundle8);
                i18++;
                arrayList5 = arrayList;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (oVar.f15951q == null) {
                oVar.f15951q = new Bundle();
            }
            oVar.f15951q.putBundle("android.car.EXTENSIONS", bundle5);
            this.c.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 24) {
            str = null;
            this.f15959a.setExtras(oVar.f15951q).setRemoteInputHistory(null);
        } else {
            str = null;
        }
        if (i19 >= 26) {
            this.f15959a.setBadgeIconType(0).setSettingsText(str).setShortcutId(str).setTimeoutAfter(oVar.f15954t).setGroupAlertBehavior(0);
            if (oVar.f15949o) {
                this.f15959a.setColorized(oVar.n);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f15959a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i19 >= 28) {
            Iterator<u> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                u next3 = it3.next();
                Notification.Builder builder3 = this.f15959a;
                next3.getClass();
                builder3.addPerson(u.b.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15959a.setAllowSystemGeneratedContextualActions(oVar.f15955u);
            this.f15959a.setBubbleMetadata(null);
        }
    }
}
