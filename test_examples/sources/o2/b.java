package o2;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.noto.app.AppActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m2.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f16219a;

    /* renamed from: b  reason: collision with root package name */
    public String f16220b;
    public Intent[] c;

    /* renamed from: d  reason: collision with root package name */
    public ComponentName f16221d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f16222e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f16223f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f16224g;

    /* renamed from: h  reason: collision with root package name */
    public IconCompat f16225h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16226i;

    /* renamed from: j  reason: collision with root package name */
    public u[] f16227j;

    /* renamed from: k  reason: collision with root package name */
    public Set<String> f16228k;

    /* renamed from: l  reason: collision with root package name */
    public n2.b f16229l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16230m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public PersistableBundle f16231o;

    /* renamed from: p  reason: collision with root package name */
    public int f16232p;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f16233a;

        /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, ShortcutInfo shortcutInfo) {
            String id;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            Set<String> categories;
            PersistableBundle extras;
            u[] uVarArr;
            int i10;
            PersistableBundle extras2;
            String string;
            int rank;
            PersistableBundle extras3;
            LocusId locusId;
            LocusId locusId2;
            String id2;
            b bVar = new b();
            this.f16233a = bVar;
            bVar.f16219a = context;
            id = shortcutInfo.getId();
            bVar.f16220b = id;
            shortcutInfo.getPackage();
            intents = shortcutInfo.getIntents();
            bVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            bVar.f16221d = activity;
            shortLabel = shortcutInfo.getShortLabel();
            bVar.f16222e = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            bVar.f16223f = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            bVar.f16224g = disabledMessage;
            if (Build.VERSION.SDK_INT >= 28) {
                shortcutInfo.getDisabledReason();
            } else {
                shortcutInfo.isEnabled();
            }
            categories = shortcutInfo.getCategories();
            bVar.f16228k = categories;
            extras = shortcutInfo.getExtras();
            n2.b bVar2 = null;
            if (extras != null && extras.containsKey("extraPersonCount")) {
                int i11 = extras.getInt("extraPersonCount");
                uVarArr = new u[i11];
                int i12 = 0;
                while (i12 < i11) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i13 = i12 + 1;
                    sb.append(i13);
                    uVarArr[i12] = u.a.a(extras.getPersistableBundle(sb.toString()));
                    i12 = i13;
                }
                bVar.f16227j = uVarArr;
                b bVar3 = this.f16233a;
                shortcutInfo.getUserHandle();
                bVar3.getClass();
                b bVar4 = this.f16233a;
                shortcutInfo.getLastChangedTimestamp();
                bVar4.getClass();
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    b bVar5 = this.f16233a;
                    shortcutInfo.isCached();
                    bVar5.getClass();
                }
                b bVar6 = this.f16233a;
                shortcutInfo.isDynamic();
                bVar6.getClass();
                b bVar7 = this.f16233a;
                shortcutInfo.isPinned();
                bVar7.getClass();
                b bVar8 = this.f16233a;
                shortcutInfo.isDeclaredInManifest();
                bVar8.getClass();
                b bVar9 = this.f16233a;
                shortcutInfo.isImmutable();
                bVar9.getClass();
                b bVar10 = this.f16233a;
                shortcutInfo.isEnabled();
                bVar10.getClass();
                b bVar11 = this.f16233a;
                shortcutInfo.hasKeyFieldsOnly();
                bVar11.getClass();
                b bVar12 = this.f16233a;
                if (i10 < 29) {
                    locusId = shortcutInfo.getLocusId();
                    if (locusId != null) {
                        locusId2 = shortcutInfo.getLocusId();
                        v8.b.m(locusId2, "locusId cannot be null");
                        id2 = locusId2.getId();
                        if (!TextUtils.isEmpty(id2)) {
                            bVar2 = new n2.b(id2);
                        } else {
                            throw new IllegalArgumentException("id cannot be empty");
                        }
                    }
                } else {
                    extras2 = shortcutInfo.getExtras();
                    if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                        bVar2 = new n2.b(string);
                    }
                }
                bVar12.f16229l = bVar2;
                b bVar13 = this.f16233a;
                rank = shortcutInfo.getRank();
                bVar13.n = rank;
                b bVar14 = this.f16233a;
                extras3 = shortcutInfo.getExtras();
                bVar14.f16231o = extras3;
            }
            uVarArr = null;
            bVar.f16227j = uVarArr;
            b bVar32 = this.f16233a;
            shortcutInfo.getUserHandle();
            bVar32.getClass();
            b bVar42 = this.f16233a;
            shortcutInfo.getLastChangedTimestamp();
            bVar42.getClass();
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
            }
            b bVar62 = this.f16233a;
            shortcutInfo.isDynamic();
            bVar62.getClass();
            b bVar72 = this.f16233a;
            shortcutInfo.isPinned();
            bVar72.getClass();
            b bVar82 = this.f16233a;
            shortcutInfo.isDeclaredInManifest();
            bVar82.getClass();
            b bVar92 = this.f16233a;
            shortcutInfo.isImmutable();
            bVar92.getClass();
            b bVar102 = this.f16233a;
            shortcutInfo.isEnabled();
            bVar102.getClass();
            b bVar112 = this.f16233a;
            shortcutInfo.hasKeyFieldsOnly();
            bVar112.getClass();
            b bVar122 = this.f16233a;
            if (i10 < 29) {
            }
            bVar122.f16229l = bVar2;
            b bVar132 = this.f16233a;
            rank = shortcutInfo.getRank();
            bVar132.n = rank;
            b bVar142 = this.f16233a;
            extras3 = shortcutInfo.getExtras();
            bVar142.f16231o = extras3;
        }

        public final b a() {
            b bVar = this.f16233a;
            if (TextUtils.isEmpty(bVar.f16222e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = bVar.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            return bVar;
        }
    }

    public static ArrayList a(AppActivity appActivity, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(appActivity, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f16219a, this.f16220b).setShortLabel(this.f16222e).setIntents(this.c);
        IconCompat iconCompat = this.f16225h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.g(this.f16219a));
        }
        if (!TextUtils.isEmpty(this.f16223f)) {
            intents.setLongLabel(this.f16223f);
        }
        if (!TextUtils.isEmpty(this.f16224g)) {
            intents.setDisabledMessage(this.f16224g);
        }
        ComponentName componentName = this.f16221d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f16228k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.n);
        PersistableBundle persistableBundle = this.f16231o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            u[] uVarArr = this.f16227j;
            if (uVarArr != null && uVarArr.length > 0) {
                int length = uVarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    u uVar = this.f16227j[i10];
                    uVar.getClass();
                    personArr[i10] = u.b.b(uVar);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            n2.b bVar = this.f16229l;
            if (bVar != null) {
                intents.setLocusId(bVar.f16071b);
            }
            intents.setLongLived(this.f16230m);
        } else {
            if (this.f16231o == null) {
                this.f16231o = new PersistableBundle();
            }
            u[] uVarArr2 = this.f16227j;
            if (uVarArr2 != null && uVarArr2.length > 0) {
                this.f16231o.putInt("extraPersonCount", uVarArr2.length);
                while (i10 < this.f16227j.length) {
                    PersistableBundle persistableBundle2 = this.f16231o;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb.append(i11);
                    String sb2 = sb.toString();
                    u uVar2 = this.f16227j[i10];
                    uVar2.getClass();
                    persistableBundle2.putPersistableBundle(sb2, u.a.b(uVar2));
                    i10 = i11;
                }
            }
            n2.b bVar2 = this.f16229l;
            if (bVar2 != null) {
                this.f16231o.putString("extraLocusId", bVar2.f16070a);
            }
            this.f16231o.putBoolean("extraLongLived", this.f16230m);
            intents.setExtras(this.f16231o);
        }
        return intents.build();
    }
}
