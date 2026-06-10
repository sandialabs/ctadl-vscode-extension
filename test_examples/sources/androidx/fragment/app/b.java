package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.h0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5101i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<String> f5102j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f5103k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f5104l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5105m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5106o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5107p;

    /* renamed from: q  reason: collision with root package name */
    public final CharSequence f5108q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5109r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f5110s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f5111t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f5112u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5113v;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f5101i = parcel.createIntArray();
        this.f5102j = parcel.createStringArrayList();
        this.f5103k = parcel.createIntArray();
        this.f5104l = parcel.createIntArray();
        this.f5105m = parcel.readInt();
        this.n = parcel.readString();
        this.f5106o = parcel.readInt();
        this.f5107p = parcel.readInt();
        this.f5108q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5109r = parcel.readInt();
        this.f5110s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5111t = parcel.createStringArrayList();
        this.f5112u = parcel.createStringArrayList();
        this.f5113v = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f5164a.size();
        this.f5101i = new int[size * 5];
        if (!aVar.f5169g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5102j = new ArrayList<>(size);
        this.f5103k = new int[size];
        this.f5104l = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            h0.a aVar2 = aVar.f5164a.get(i10);
            int i12 = i11 + 1;
            this.f5101i[i11] = aVar2.f5178a;
            ArrayList<String> arrayList = this.f5102j;
            Fragment fragment = aVar2.f5179b;
            arrayList.add(fragment != null ? fragment.f5040m : null);
            int[] iArr = this.f5101i;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f5180d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f5181e;
            iArr[i15] = aVar2.f5182f;
            this.f5103k[i10] = aVar2.f5183g.ordinal();
            this.f5104l[i10] = aVar2.f5184h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f5105m = aVar.f5168f;
        this.n = aVar.f5171i;
        this.f5106o = aVar.f5100s;
        this.f5107p = aVar.f5172j;
        this.f5108q = aVar.f5173k;
        this.f5109r = aVar.f5174l;
        this.f5110s = aVar.f5175m;
        this.f5111t = aVar.n;
        this.f5112u = aVar.f5176o;
        this.f5113v = aVar.f5177p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f5101i);
        parcel.writeStringList(this.f5102j);
        parcel.writeIntArray(this.f5103k);
        parcel.writeIntArray(this.f5104l);
        parcel.writeInt(this.f5105m);
        parcel.writeString(this.n);
        parcel.writeInt(this.f5106o);
        parcel.writeInt(this.f5107p);
        TextUtils.writeToParcel(this.f5108q, parcel, 0);
        parcel.writeInt(this.f5109r);
        TextUtils.writeToParcel(this.f5110s, parcel, 0);
        parcel.writeStringList(this.f5111t);
        parcel.writeStringList(this.f5112u);
        parcel.writeInt(this.f5113v ? 1 : 0);
    }
}
