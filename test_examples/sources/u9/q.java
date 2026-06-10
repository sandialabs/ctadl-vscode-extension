package u9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17940a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f17941b;

        static {
            int[] iArr = new int[ProtoBuf$MemberKind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17940a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f17941b = iArr3;
        }
    }

    public static final l8.k a(ProtoBuf$Visibility protoBuf$Visibility) {
        l8.k kVar;
        String str;
        int i10 = protoBuf$Visibility == null ? -1 : a.f17941b[protoBuf$Visibility.ordinal()];
        if (i10 == 1) {
            kVar = l8.l.f15841d;
            str = "INTERNAL";
        } else if (i10 == 3) {
            kVar = l8.l.f15840b;
            str = "PRIVATE_TO_THIS";
        } else if (i10 == 4) {
            kVar = l8.l.c;
            str = "PROTECTED";
        } else if (i10 == 5) {
            kVar = l8.l.f15842e;
            str = "PUBLIC";
        } else if (i10 != 6) {
            kVar = l8.l.f15839a;
            str = "PRIVATE";
        } else {
            kVar = l8.l.f15843f;
            str = "LOCAL";
        }
        v7.g.e(kVar, str);
        return kVar;
    }

    public static final CallableMemberDescriptor.Kind b(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i10 = protoBuf$MemberKind == null ? -1 : a.f17940a[protoBuf$MemberKind.ordinal()];
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? kind : CallableMemberDescriptor.Kind.SYNTHESIZED : CallableMemberDescriptor.Kind.DELEGATION : CallableMemberDescriptor.Kind.FAKE_OVERRIDE : kind;
    }
}
