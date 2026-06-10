package g5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.noto.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import u5.j;
import x5.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f11236a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11237b = new a();
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f11238d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11239e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0122a();

        /* renamed from: i  reason: collision with root package name */
        public int f11240i;

        /* renamed from: j  reason: collision with root package name */
        public Integer f11241j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f11242k;

        /* renamed from: l  reason: collision with root package name */
        public int f11243l;

        /* renamed from: m  reason: collision with root package name */
        public int f11244m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public Locale f11245o;

        /* renamed from: p  reason: collision with root package name */
        public CharSequence f11246p;

        /* renamed from: q  reason: collision with root package name */
        public int f11247q;

        /* renamed from: r  reason: collision with root package name */
        public int f11248r;

        /* renamed from: s  reason: collision with root package name */
        public Integer f11249s;

        /* renamed from: t  reason: collision with root package name */
        public Boolean f11250t;

        /* renamed from: u  reason: collision with root package name */
        public Integer f11251u;

        /* renamed from: v  reason: collision with root package name */
        public Integer f11252v;

        /* renamed from: w  reason: collision with root package name */
        public Integer f11253w;

        /* renamed from: x  reason: collision with root package name */
        public Integer f11254x;

        /* renamed from: y  reason: collision with root package name */
        public Integer f11255y;

        /* renamed from: z  reason: collision with root package name */
        public Integer f11256z;

        /* renamed from: g5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0122a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f11243l = 255;
            this.f11244m = -2;
            this.n = -2;
            this.f11250t = Boolean.TRUE;
        }

        public a(Parcel parcel) {
            this.f11243l = 255;
            this.f11244m = -2;
            this.n = -2;
            this.f11250t = Boolean.TRUE;
            this.f11240i = parcel.readInt();
            this.f11241j = (Integer) parcel.readSerializable();
            this.f11242k = (Integer) parcel.readSerializable();
            this.f11243l = parcel.readInt();
            this.f11244m = parcel.readInt();
            this.n = parcel.readInt();
            this.f11246p = parcel.readString();
            this.f11247q = parcel.readInt();
            this.f11249s = (Integer) parcel.readSerializable();
            this.f11251u = (Integer) parcel.readSerializable();
            this.f11252v = (Integer) parcel.readSerializable();
            this.f11253w = (Integer) parcel.readSerializable();
            this.f11254x = (Integer) parcel.readSerializable();
            this.f11255y = (Integer) parcel.readSerializable();
            this.f11256z = (Integer) parcel.readSerializable();
            this.f11250t = (Boolean) parcel.readSerializable();
            this.f11245o = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f11240i);
            parcel.writeSerializable(this.f11241j);
            parcel.writeSerializable(this.f11242k);
            parcel.writeInt(this.f11243l);
            parcel.writeInt(this.f11244m);
            parcel.writeInt(this.n);
            CharSequence charSequence = this.f11246p;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f11247q);
            parcel.writeSerializable(this.f11249s);
            parcel.writeSerializable(this.f11251u);
            parcel.writeSerializable(this.f11252v);
            parcel.writeSerializable(this.f11253w);
            parcel.writeSerializable(this.f11254x);
            parcel.writeSerializable(this.f11255y);
            parcel.writeSerializable(this.f11256z);
            parcel.writeSerializable(this.f11250t);
            parcel.writeSerializable(this.f11245o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        AttributeSet attributeSet;
        int i10;
        int i11;
        boolean z10;
        int i12;
        a aVar;
        int i13;
        Integer num;
        int intValue;
        Integer num2;
        a aVar2;
        Integer num3;
        int intValue2;
        Integer num4;
        int intValue3;
        Integer num5;
        int intValue4;
        Integer num6;
        int intValue5;
        Integer num7;
        int intValue6;
        Integer num8;
        int intValue7;
        Integer num9;
        Locale locale;
        Locale locale2;
        Locale.Category category;
        int next;
        a aVar3 = new a();
        int i14 = aVar3.f11240i;
        int i15 = 0;
        if (i14 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i14);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i10 = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e10) {
                e = e10;
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i14));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e11) {
                e = e11;
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i14));
                notFoundException2.initCause(e);
                throw notFoundException2;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        if (i10 == 0) {
            i11 = 2132083726;
        } else {
            i11 = i10;
        }
        TypedArray d5 = j.d(context, attributeSet, a1.b.O, R.attr.badgeStyle, i11, new int[0]);
        Resources resources = context.getResources();
        this.c = d5.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f11239e = d5.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f11238d = d5.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        a aVar4 = this.f11237b;
        int i16 = aVar3.f11243l;
        aVar4.f11243l = i16 == -2 ? 255 : i16;
        CharSequence charSequence = aVar3.f11246p;
        aVar4.f11246p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar5 = this.f11237b;
        int i17 = aVar3.f11247q;
        aVar5.f11247q = i17 == 0 ? R.plurals.mtrl_badge_content_description : i17;
        int i18 = aVar3.f11248r;
        aVar5.f11248r = i18 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i18;
        Boolean bool = aVar3.f11250t;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
            aVar5.f11250t = Boolean.valueOf(z10);
            a aVar6 = this.f11237b;
            int i19 = aVar3.n;
            aVar6.n = i19 == -2 ? d5.getInt(8, 4) : i19;
            i12 = aVar3.f11244m;
            if (i12 == -2) {
                this.f11237b.f11244m = i12;
            } else {
                if (d5.hasValue(9)) {
                    aVar = this.f11237b;
                    i13 = d5.getInt(9, 0);
                } else {
                    aVar = this.f11237b;
                    i13 = -1;
                }
                aVar.f11244m = i13;
            }
            a aVar7 = this.f11237b;
            num = aVar3.f11241j;
            if (num != null) {
                intValue = c.a(context, d5, 0).getDefaultColor();
            } else {
                intValue = num.intValue();
            }
            aVar7.f11241j = Integer.valueOf(intValue);
            num2 = aVar3.f11242k;
            if (num2 == null) {
                aVar2 = this.f11237b;
            } else if (d5.hasValue(3)) {
                this.f11237b.f11242k = Integer.valueOf(c.a(context, d5, 3).getDefaultColor());
                a aVar8 = this.f11237b;
                num3 = aVar3.f11249s;
                if (num3 == null) {
                    intValue2 = d5.getInt(1, 8388661);
                } else {
                    intValue2 = num3.intValue();
                }
                aVar8.f11249s = Integer.valueOf(intValue2);
                a aVar9 = this.f11237b;
                num4 = aVar3.f11251u;
                if (num4 == null) {
                    intValue3 = d5.getDimensionPixelOffset(6, 0);
                } else {
                    intValue3 = num4.intValue();
                }
                aVar9.f11251u = Integer.valueOf(intValue3);
                a aVar10 = this.f11237b;
                num5 = aVar3.f11252v;
                if (num5 == null) {
                    intValue4 = d5.getDimensionPixelOffset(10, 0);
                } else {
                    intValue4 = num5.intValue();
                }
                aVar10.f11252v = Integer.valueOf(intValue4);
                a aVar11 = this.f11237b;
                num6 = aVar3.f11253w;
                if (num6 == null) {
                    intValue5 = d5.getDimensionPixelOffset(7, aVar11.f11251u.intValue());
                } else {
                    intValue5 = num6.intValue();
                }
                aVar11.f11253w = Integer.valueOf(intValue5);
                a aVar12 = this.f11237b;
                num7 = aVar3.f11254x;
                if (num7 == null) {
                    intValue6 = d5.getDimensionPixelOffset(11, aVar12.f11252v.intValue());
                } else {
                    intValue6 = num7.intValue();
                }
                aVar12.f11254x = Integer.valueOf(intValue6);
                a aVar13 = this.f11237b;
                num8 = aVar3.f11255y;
                if (num8 == null) {
                    intValue7 = 0;
                } else {
                    intValue7 = num8.intValue();
                }
                aVar13.f11255y = Integer.valueOf(intValue7);
                a aVar14 = this.f11237b;
                num9 = aVar3.f11256z;
                if (num9 != null) {
                    i15 = num9.intValue();
                }
                aVar14.f11256z = Integer.valueOf(i15);
                d5.recycle();
                locale = aVar3.f11245o;
                if (locale == null) {
                    a aVar15 = this.f11237b;
                    if (Build.VERSION.SDK_INT >= 24) {
                        category = Locale.Category.FORMAT;
                        locale2 = Locale.getDefault(category);
                    } else {
                        locale2 = Locale.getDefault();
                    }
                    aVar15.f11245o = locale2;
                } else {
                    this.f11237b.f11245o = locale;
                }
                this.f11236a = aVar3;
            } else {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132083227, a1.b.f61x0);
                obtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList a10 = c.a(context, obtainStyledAttributes, 3);
                c.a(context, obtainStyledAttributes, 4);
                c.a(context, obtainStyledAttributes, 5);
                obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.getInt(1, 1);
                int i20 = 12;
                if (!obtainStyledAttributes.hasValue(12)) {
                    i20 = 10;
                }
                obtainStyledAttributes.getResourceId(i20, 0);
                obtainStyledAttributes.getString(i20);
                obtainStyledAttributes.getBoolean(14, false);
                c.a(context, obtainStyledAttributes, 6);
                obtainStyledAttributes.getFloat(7, 0.0f);
                obtainStyledAttributes.getFloat(8, 0.0f);
                obtainStyledAttributes.getFloat(9, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132083227, a1.b.f40m0);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, 0.0f);
                obtainStyledAttributes2.recycle();
                aVar2 = this.f11237b;
                num2 = Integer.valueOf(a10.getDefaultColor());
            }
            aVar2.f11242k = num2;
            a aVar82 = this.f11237b;
            num3 = aVar3.f11249s;
            if (num3 == null) {
            }
            aVar82.f11249s = Integer.valueOf(intValue2);
            a aVar92 = this.f11237b;
            num4 = aVar3.f11251u;
            if (num4 == null) {
            }
            aVar92.f11251u = Integer.valueOf(intValue3);
            a aVar102 = this.f11237b;
            num5 = aVar3.f11252v;
            if (num5 == null) {
            }
            aVar102.f11252v = Integer.valueOf(intValue4);
            a aVar112 = this.f11237b;
            num6 = aVar3.f11253w;
            if (num6 == null) {
            }
            aVar112.f11253w = Integer.valueOf(intValue5);
            a aVar122 = this.f11237b;
            num7 = aVar3.f11254x;
            if (num7 == null) {
            }
            aVar122.f11254x = Integer.valueOf(intValue6);
            a aVar132 = this.f11237b;
            num8 = aVar3.f11255y;
            if (num8 == null) {
            }
            aVar132.f11255y = Integer.valueOf(intValue7);
            a aVar142 = this.f11237b;
            num9 = aVar3.f11256z;
            if (num9 != null) {
            }
            aVar142.f11256z = Integer.valueOf(i15);
            d5.recycle();
            locale = aVar3.f11245o;
            if (locale == null) {
            }
            this.f11236a = aVar3;
        }
        z10 = true;
        aVar5.f11250t = Boolean.valueOf(z10);
        a aVar62 = this.f11237b;
        int i192 = aVar3.n;
        aVar62.n = i192 == -2 ? d5.getInt(8, 4) : i192;
        i12 = aVar3.f11244m;
        if (i12 == -2) {
        }
        a aVar72 = this.f11237b;
        num = aVar3.f11241j;
        if (num != null) {
        }
        aVar72.f11241j = Integer.valueOf(intValue);
        num2 = aVar3.f11242k;
        if (num2 == null) {
        }
        aVar2.f11242k = num2;
        a aVar822 = this.f11237b;
        num3 = aVar3.f11249s;
        if (num3 == null) {
        }
        aVar822.f11249s = Integer.valueOf(intValue2);
        a aVar922 = this.f11237b;
        num4 = aVar3.f11251u;
        if (num4 == null) {
        }
        aVar922.f11251u = Integer.valueOf(intValue3);
        a aVar1022 = this.f11237b;
        num5 = aVar3.f11252v;
        if (num5 == null) {
        }
        aVar1022.f11252v = Integer.valueOf(intValue4);
        a aVar1122 = this.f11237b;
        num6 = aVar3.f11253w;
        if (num6 == null) {
        }
        aVar1122.f11253w = Integer.valueOf(intValue5);
        a aVar1222 = this.f11237b;
        num7 = aVar3.f11254x;
        if (num7 == null) {
        }
        aVar1222.f11254x = Integer.valueOf(intValue6);
        a aVar1322 = this.f11237b;
        num8 = aVar3.f11255y;
        if (num8 == null) {
        }
        aVar1322.f11255y = Integer.valueOf(intValue7);
        a aVar1422 = this.f11237b;
        num9 = aVar3.f11256z;
        if (num9 != null) {
        }
        aVar1422.f11256z = Integer.valueOf(i15);
        d5.recycle();
        locale = aVar3.f11245o;
        if (locale == null) {
        }
        this.f11236a = aVar3;
    }
}
