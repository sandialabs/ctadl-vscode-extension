package j4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.e;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f12675d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f12676e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12677f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12678g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12679h;

    /* renamed from: i  reason: collision with root package name */
    public int f12680i;

    /* renamed from: j  reason: collision with root package name */
    public int f12681j;

    /* renamed from: k  reason: collision with root package name */
    public int f12682k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p.b(), new p.b(), new p.b());
    }

    public b(Parcel parcel, int i10, int i11, String str, p.b<String, Method> bVar, p.b<String, Method> bVar2, p.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f12675d = new SparseIntArray();
        this.f12680i = -1;
        this.f12682k = -1;
        this.f12676e = parcel;
        this.f12677f = i10;
        this.f12678g = i11;
        this.f12681j = i10;
        this.f12679h = str;
    }

    @Override // j4.a
    public final b a() {
        Parcel parcel = this.f12676e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f12681j;
        if (i10 == this.f12677f) {
            i10 = this.f12678g;
        }
        return new b(parcel, dataPosition, i10, e.k(new StringBuilder(), this.f12679h, "  "), this.f12673a, this.f12674b, this.c);
    }

    @Override // j4.a
    public final boolean e() {
        return this.f12676e.readInt() != 0;
    }

    @Override // j4.a
    public final byte[] f() {
        Parcel parcel = this.f12676e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // j4.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12676e);
    }

    @Override // j4.a
    public final boolean h(int i10) {
        while (this.f12681j < this.f12678g) {
            int i11 = this.f12682k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f12681j;
            Parcel parcel = this.f12676e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f12682k = parcel.readInt();
            this.f12681j += readInt;
        }
        return this.f12682k == i10;
    }

    @Override // j4.a
    public final int i() {
        return this.f12676e.readInt();
    }

    @Override // j4.a
    public final <T extends Parcelable> T j() {
        return (T) this.f12676e.readParcelable(b.class.getClassLoader());
    }

    @Override // j4.a
    public final String k() {
        return this.f12676e.readString();
    }

    @Override // j4.a
    public final void m(int i10) {
        u();
        this.f12680i = i10;
        this.f12675d.put(i10, this.f12676e.dataPosition());
        q(0);
        q(i10);
    }

    @Override // j4.a
    public final void n(boolean z10) {
        this.f12676e.writeInt(z10 ? 1 : 0);
    }

    @Override // j4.a
    public final void o(byte[] bArr) {
        Parcel parcel = this.f12676e;
        if (bArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    @Override // j4.a
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12676e, 0);
    }

    @Override // j4.a
    public final void q(int i10) {
        this.f12676e.writeInt(i10);
    }

    @Override // j4.a
    public final void r(Parcelable parcelable) {
        this.f12676e.writeParcelable(parcelable, 0);
    }

    @Override // j4.a
    public final void s(String str) {
        this.f12676e.writeString(str);
    }

    public final void u() {
        int i10 = this.f12680i;
        if (i10 >= 0) {
            int i11 = this.f12675d.get(i10);
            Parcel parcel = this.f12676e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
    }
}
