package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class WireFormat$FieldType {

    /* renamed from: k  reason: collision with root package name */
    public static final WireFormat$FieldType f14538k;

    /* renamed from: l  reason: collision with root package name */
    public static final WireFormat$FieldType f14539l;

    /* renamed from: m  reason: collision with root package name */
    public static final WireFormat$FieldType f14540m;
    public static final WireFormat$FieldType n;

    /* renamed from: o  reason: collision with root package name */
    public static final WireFormat$FieldType f14541o;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ WireFormat$FieldType[] f14542p;

    /* renamed from: i  reason: collision with root package name */
    public final WireFormat$JavaType f14543i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14544j;
    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF0;
    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF1;
    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF2;

    static {
        WireFormat$FieldType wireFormat$FieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.f14548m, 1);
        WireFormat$FieldType wireFormat$FieldType2 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.f14547l, 5);
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.f14546k;
        WireFormat$FieldType wireFormat$FieldType3 = new WireFormat$FieldType("INT64", 2, wireFormat$JavaType, 0);
        WireFormat$FieldType wireFormat$FieldType4 = new WireFormat$FieldType("UINT64", 3, wireFormat$JavaType, 0);
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.f14545j;
        WireFormat$FieldType wireFormat$FieldType5 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType2, 0);
        f14538k = wireFormat$FieldType5;
        WireFormat$FieldType wireFormat$FieldType6 = new WireFormat$FieldType("FIXED64", 5, wireFormat$JavaType, 1);
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType2, 5);
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.n, 0);
        f14539l = wireFormat$FieldType8;
        WireFormat$FieldType wireFormat$FieldType9 = new WireFormat$FieldType() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.1
            {
                WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.f14549o;
            }
        };
        WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.f14552r;
        WireFormat$FieldType wireFormat$FieldType10 = new WireFormat$FieldType(wireFormat$JavaType3) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.2
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean a() {
                return false;
            }
        };
        f14540m = wireFormat$FieldType10;
        WireFormat$FieldType wireFormat$FieldType11 = new WireFormat$FieldType(wireFormat$JavaType3) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.3
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean a() {
                return false;
            }
        };
        n = wireFormat$FieldType11;
        WireFormat$FieldType wireFormat$FieldType12 = new WireFormat$FieldType(WireFormat$JavaType.f14550p) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.4
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType
            public final boolean a() {
                return false;
            }
        };
        WireFormat$FieldType wireFormat$FieldType13 = new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType2, 0);
        WireFormat$FieldType wireFormat$FieldType14 = new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.f14551q, 0);
        f14541o = wireFormat$FieldType14;
        f14542p = new WireFormat$FieldType[]{wireFormat$FieldType, wireFormat$FieldType2, wireFormat$FieldType3, wireFormat$FieldType4, wireFormat$FieldType5, wireFormat$FieldType6, wireFormat$FieldType7, wireFormat$FieldType8, wireFormat$FieldType9, wireFormat$FieldType10, wireFormat$FieldType11, wireFormat$FieldType12, wireFormat$FieldType13, wireFormat$FieldType14, new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType2, 5), new WireFormat$FieldType("SFIXED64", 15, wireFormat$JavaType, 1), new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType2, 0), new WireFormat$FieldType("SINT64", 17, wireFormat$JavaType, 0)};
    }

    public /* synthetic */ WireFormat$FieldType() {
        throw null;
    }

    public WireFormat$FieldType(String str, int i10, WireFormat$JavaType wireFormat$JavaType, int i11) {
        this.f14543i = wireFormat$JavaType;
        this.f14544j = i11;
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) f14542p.clone();
    }

    public boolean a() {
        return !(this instanceof AnonymousClass1);
    }
}
