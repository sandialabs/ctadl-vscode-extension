package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class k0 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i10, String str, Object obj) {
        String obj2;
        String N;
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                b(sb, i10, str, obj3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                ByteString byteString = ByteString.f4776j;
                N = a1.b.N(new ByteString.LiteralByteString(((String) obj).getBytes(u.f4942a)));
            } else if (obj instanceof ByteString) {
                sb.append(": \"");
                N = a1.b.N((ByteString) obj);
            } else {
                if (obj instanceof GeneratedMessageLite) {
                    sb.append(" {");
                    c((GeneratedMessageLite) obj, sb, i10 + 2);
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    b(sb, i13, "key", entry2.getKey());
                    b(sb, i13, "value", entry2.getValue());
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                } else {
                    sb.append(": ");
                    obj2 = obj.toString();
                    sb.append(obj2);
                    return;
                }
                obj2 = "}";
                sb.append(obj2);
                return;
            }
            sb.append(N);
            sb.append('\"');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fb, code lost:
        if (((java.lang.Enum) r11).ordinal() == 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(i0 i0Var, StringBuilder sb, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : i0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = "";
            String replaceFirst = str.replaceFirst("get", "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i10, a(str2), GeneratedMessageLite.m(i0Var, method2, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i10, a(str3), GeneratedMessageLite.m(i0Var, method3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object m10 = GeneratedMessageLite.m(i0Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (m10 instanceof Boolean) {
                            equals = !((Boolean) m10).booleanValue();
                        } else if (m10 instanceof Integer) {
                            if (((Integer) m10).intValue() == 0) {
                                equals = true;
                            }
                            equals = false;
                        } else if (m10 instanceof Float) {
                            if (((Float) m10).floatValue() == 0.0f) {
                                equals = true;
                            }
                            equals = false;
                        } else if (m10 instanceof Double) {
                            if (((Double) m10).doubleValue() == 0.0d) {
                                equals = true;
                            }
                            equals = false;
                        } else {
                            if (!(m10 instanceof String)) {
                                if (m10 instanceof ByteString) {
                                    obj = ByteString.f4776j;
                                } else if (m10 instanceof i0) {
                                    if (m10 == ((i0) m10).f()) {
                                        equals = true;
                                    }
                                    equals = false;
                                } else {
                                    if (m10 instanceof Enum) {
                                    }
                                    equals = false;
                                }
                            }
                            equals = m10.equals(obj);
                        }
                        if (equals) {
                            z10 = false;
                        }
                    } else {
                        z10 = ((Boolean) GeneratedMessageLite.m(i0Var, method5, new Object[0])).booleanValue();
                    }
                    if (z10) {
                        b(sb, i10, a(str4), m10);
                    }
                }
            }
        }
        if (i0Var instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<GeneratedMessageLite.d, Object>> l2 = ((GeneratedMessageLite.c) i0Var).extensions.l();
            while (l2.hasNext()) {
                Map.Entry<GeneratedMessageLite.d, Object> next = l2.next();
                next.getKey().getClass();
                b(sb, i10, "[0]", next.getValue());
            }
        }
        c1 c1Var = ((GeneratedMessageLite) i0Var).unknownFields;
        if (c1Var != null) {
            for (int i11 = 0; i11 < c1Var.f4852a; i11++) {
                b(sb, i10, String.valueOf(c1Var.f4853b[i11] >>> 3), c1Var.c[i11]);
            }
        }
    }
}
