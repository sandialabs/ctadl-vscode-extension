package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import j4.a;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f4616a;
        if (aVar.h(1)) {
            i10 = aVar.i();
        }
        iconCompat.f4616a = i10;
        byte[] bArr = iconCompat.c;
        if (aVar.h(2)) {
            bArr = aVar.f();
        }
        iconCompat.c = bArr;
        Parcelable parcelable2 = iconCompat.f4618d;
        if (aVar.h(3)) {
            parcelable2 = aVar.j();
        }
        iconCompat.f4618d = parcelable2;
        int i11 = iconCompat.f4619e;
        if (aVar.h(4)) {
            i11 = aVar.i();
        }
        iconCompat.f4619e = i11;
        int i12 = iconCompat.f4620f;
        if (aVar.h(5)) {
            i12 = aVar.i();
        }
        iconCompat.f4620f = i12;
        Parcelable parcelable3 = iconCompat.f4621g;
        if (aVar.h(6)) {
            parcelable3 = aVar.j();
        }
        iconCompat.f4621g = (ColorStateList) parcelable3;
        String str = iconCompat.f4623i;
        if (aVar.h(7)) {
            str = aVar.k();
        }
        iconCompat.f4623i = str;
        String str2 = iconCompat.f4624j;
        if (aVar.h(8)) {
            str2 = aVar.k();
        }
        iconCompat.f4624j = str2;
        iconCompat.f4622h = PorterDuff.Mode.valueOf(iconCompat.f4623i);
        switch (iconCompat.f4616a) {
            case -1:
                parcelable = iconCompat.f4618d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4617b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f4618d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.c;
                    iconCompat.f4617b = bArr2;
                    iconCompat.f4616a = 3;
                    iconCompat.f4619e = 0;
                    iconCompat.f4620f = bArr2.length;
                    break;
                } else {
                    iconCompat.f4617b = parcelable;
                    break;
                }
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f4617b = str3;
                if (iconCompat.f4616a == 2 && iconCompat.f4624j == null) {
                    iconCompat.f4624j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f4617b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f4623i = iconCompat.f4622h.name();
        switch (iconCompat.f4616a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f4618d = (Parcelable) iconCompat.f4617b;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.c = ((String) iconCompat.f4617b).getBytes(Charset.forName("UTF-16"));
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.c = (byte[]) iconCompat.f4617b;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 6:
                iconCompat.c = iconCompat.f4617b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f4616a;
        if (-1 != i10) {
            aVar.m(1);
            aVar.q(i10);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f4618d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i11 = iconCompat.f4619e;
        if (i11 != 0) {
            aVar.m(4);
            aVar.q(i11);
        }
        int i12 = iconCompat.f4620f;
        if (i12 != 0) {
            aVar.m(5);
            aVar.q(i12);
        }
        ColorStateList colorStateList = iconCompat.f4621g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.f4623i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f4624j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
