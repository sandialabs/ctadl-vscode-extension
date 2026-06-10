package q1;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class d implements CharacterIterator {

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f16832i;

    /* renamed from: k  reason: collision with root package name */
    public final int f16834k;

    /* renamed from: j  reason: collision with root package name */
    public final int f16833j = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f16835l = 0;

    public d(CharSequence charSequence, int i10) {
        this.f16832i = charSequence;
        this.f16834k = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object clone = super.clone();
            v7.g.e(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f16835l;
        if (i10 == this.f16834k) {
            return (char) 65535;
        }
        return this.f16832i.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f16835l = this.f16833j;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f16833j;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f16834k;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f16835l;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f16833j;
        int i11 = this.f16834k;
        if (i10 == i11) {
            this.f16835l = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f16835l = i12;
        return this.f16832i.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f16835l + 1;
        this.f16835l = i10;
        int i11 = this.f16834k;
        if (i10 >= i11) {
            this.f16835l = i11;
            return (char) 65535;
        }
        return this.f16832i.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f16835l;
        if (i10 <= this.f16833j) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f16835l = i11;
        return this.f16832i.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        boolean z10 = false;
        if (i10 <= this.f16834k && this.f16833j <= i10) {
            z10 = true;
        }
        if (z10) {
            this.f16835l = i10;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
