package t6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f17613a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17614b;

    public b(long j2, int i10) {
        this.f17613a = j2;
        this.f17614b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f17613a == bVar.f17613a && this.f17614b == bVar.f17614b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f17613a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f17614b;
    }

    public final String toString() {
        return "FolderIdWithNotesCount(folderId=" + this.f17613a + ", notesCount=" + this.f17614b + ")";
    }
}
