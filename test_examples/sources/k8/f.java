package k8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.j;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import n7.l;
import n7.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f12935a = l.b2(j.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashSet f12936b;
    public static final LinkedHashSet c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f12937d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashSet f12938e;

    /* renamed from: f  reason: collision with root package name */
    public static final LinkedHashSet f12939f;

    static {
        List<JvmPrimitiveType> O0 = a1.c.O0(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : O0) {
            String b5 = jvmPrimitiveType.k().f().b();
            v7.g.e(b5, "it.wrapperFqName.shortName().asString()");
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            String str = jvmPrimitiveType.f14729j;
            if (str != null) {
                sb.append(str);
                sb.append("Value()");
                sb.append(jvmPrimitiveType.i());
                strArr[0] = sb.toString();
                n.f2(j.c(b5, strArr), linkedHashSet);
            } else {
                JvmPrimitiveType.a(11);
                throw null;
            }
        }
        f12936b = l.c2(l.c2(l.c2(l.c2(l.c2(l.c2(linkedHashSet, j.d("List", "sort(Ljava/util/Comparator;)V")), j.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), j.c("Double", "isInfinite()Z", "isNaN()Z")), j.c("Float", "isInfinite()Z", "isNaN()Z")), j.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), j.c("CharSequence", "isEmpty()Z"));
        c = l.c2(l.c2(l.c2(l.c2(l.c2(l.c2(j.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), j.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), j.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), j.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), j.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), j.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), j.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f12937d = l.c2(l.c2(j.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), j.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), j.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List<JvmPrimitiveType> O02 = a1.c.O0(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType3 : O02) {
            String b10 = jvmPrimitiveType3.k().f().b();
            v7.g.e(b10, "it.wrapperFqName.shortName().asString()");
            String[] a10 = j.a("Ljava/lang/String;");
            n.f2(j.c(b10, (String[]) Arrays.copyOf(a10, a10.length)), linkedHashSet2);
        }
        String[] a11 = j.a("D");
        LinkedHashSet c22 = l.c2(linkedHashSet2, j.c("Float", (String[]) Arrays.copyOf(a11, a11.length)));
        String[] a12 = j.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f12938e = l.c2(c22, j.c("String", (String[]) Arrays.copyOf(a12, a12.length)));
        String[] a13 = j.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f12939f = j.c("Throwable", (String[]) Arrays.copyOf(a13, a13.length));
    }

    public static boolean a(h9.d dVar) {
        boolean z10;
        if (v7.g.a(dVar, g.a.f13365g)) {
            return true;
        }
        if (g.a.c0.get(dVar) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
