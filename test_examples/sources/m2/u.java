package m2;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f15963a;

    /* renamed from: b  reason: collision with root package name */
    public final IconCompat f15964b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15965d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15966e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15967f;

    /* loaded from: classes.dex */
    public static class a {
        public static u a(PersistableBundle persistableBundle) {
            boolean z10;
            boolean z11;
            c cVar = new c();
            cVar.f15968a = persistableBundle.getString("name");
            cVar.c = persistableBundle.getString("uri");
            cVar.f15970d = persistableBundle.getString("key");
            z10 = persistableBundle.getBoolean("isBot");
            cVar.f15971e = z10;
            z11 = persistableBundle.getBoolean("isImportant");
            cVar.f15972f = z11;
            return new u(cVar);
        }

        public static PersistableBundle b(u uVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = uVar.f15963a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", uVar.c);
            persistableBundle.putString("key", uVar.f15965d);
            persistableBundle.putBoolean("isBot", uVar.f15966e);
            persistableBundle.putBoolean("isImportant", uVar.f15967f);
            return persistableBundle;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static u a(Person person) {
            CharSequence name;
            Icon icon;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            IconCompat iconCompat;
            c cVar = new c();
            name = person.getName();
            cVar.f15968a = name;
            icon = person.getIcon();
            IconCompat iconCompat2 = null;
            if (icon != null) {
                icon2 = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f4615k;
                icon2.getClass();
                int c = IconCompat.a.c(icon2);
                if (c != 2) {
                    if (c != 4) {
                        if (c != 6) {
                            iconCompat2 = new IconCompat(-1);
                            iconCompat2.f4617b = icon2;
                        } else {
                            Uri d5 = IconCompat.a.d(icon2);
                            d5.getClass();
                            String uri2 = d5.toString();
                            uri2.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f4617b = uri2;
                        }
                    } else {
                        Uri d10 = IconCompat.a.d(icon2);
                        d10.getClass();
                        String uri3 = d10.toString();
                        uri3.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f4617b = uri3;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.b(null, IconCompat.a.b(icon2), IconCompat.a.a(icon2));
                }
            }
            cVar.f15969b = iconCompat2;
            uri = person.getUri();
            cVar.c = uri;
            key = person.getKey();
            cVar.f15970d = key;
            isBot = person.isBot();
            cVar.f15971e = isBot;
            isImportant = person.isImportant();
            cVar.f15972f = isImportant;
            return new u(cVar);
        }

        public static Person b(u uVar) {
            Person.Builder name = new Person.Builder().setName(uVar.f15963a);
            Icon icon = null;
            IconCompat iconCompat = uVar.f15964b;
            if (iconCompat != null) {
                icon = iconCompat.g(null);
            }
            return name.setIcon(icon).setUri(uVar.c).setKey(uVar.f15965d).setBot(uVar.f15966e).setImportant(uVar.f15967f).build();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f15968a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f15969b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f15970d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f15971e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15972f;
    }

    public u(c cVar) {
        this.f15963a = cVar.f15968a;
        this.f15964b = cVar.f15969b;
        this.c = cVar.c;
        this.f15965d = cVar.f15970d;
        this.f15966e = cVar.f15971e;
        this.f15967f = cVar.f15972f;
    }
}
