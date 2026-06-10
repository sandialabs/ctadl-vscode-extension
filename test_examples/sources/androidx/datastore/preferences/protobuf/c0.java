package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;

/* loaded from: classes.dex */
public final class c0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f4846a;

    /* renamed from: b  reason: collision with root package name */
    public final K f4847b = "";
    public final V c;

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final WireFormat$FieldType f4848a;

        /* renamed from: b  reason: collision with root package name */
        public final K f4849b = "";
        public final WireFormat$FieldType c;

        /* renamed from: d  reason: collision with root package name */
        public final V f4850d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
            this.f4848a = wireFormat$FieldType;
            this.c = wireFormat$FieldType2;
            this.f4850d = preferencesProto$Value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.f4846a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
        this.c = preferencesProto$Value;
    }

    public static <K, V> int a(a<K, V> aVar, K k3, V v3) {
        return q.c(aVar.c, 2, v3) + q.c(aVar.f4848a, 1, k3);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k3, V v3) {
        q.p(codedOutputStream, aVar.f4848a, 1, k3);
        q.p(codedOutputStream, aVar.c, 2, v3);
    }
}
