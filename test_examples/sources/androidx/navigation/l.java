package androidx.navigation;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f5496i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f5497a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5498b = new HashMap();
    public final Pattern c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5499d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5500e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5501f;

    /* renamed from: g  reason: collision with root package name */
    public final Pattern f5502g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5503h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5504a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f5505b = new ArrayList<>();
    }

    public l(String str, String str2, String str3) {
        boolean z10;
        this.c = null;
        this.f5499d = false;
        this.f5500e = false;
        this.f5502g = null;
        this.f5501f = str2;
        this.f5503h = str3;
        int i10 = 1;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5500e = z10;
            StringBuilder sb = new StringBuilder("^");
            if (!f5496i.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (z10) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.f5499d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    a aVar = new a();
                    int i11 = 0;
                    while (matcher2.find()) {
                        aVar.f5505b.add(matcher2.group(i10));
                        sb2.append(Pattern.quote(queryParameter.substring(i11, matcher2.start())));
                        sb2.append("(.+?)?");
                        i11 = matcher2.end();
                        i10 = 1;
                    }
                    if (i11 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i11)));
                    }
                    aVar.f5504a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.f5498b.put(str4, aVar);
                    i10 = 1;
                }
            } else {
                this.f5499d = a(str, sb, compile);
            }
            this.c = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                String[] split = str3.split("/", -1);
                String str5 = split[0];
                String str6 = split[1];
                this.f5502g = Pattern.compile(("^(" + str5 + "|[*]+)/(" + str6 + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
                return;
            }
            throw new IllegalArgumentException(a4.b.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !str.contains(".*");
        int i10 = 0;
        while (matcher.find()) {
            this.f5497a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i10, matcher.start())));
            sb.append("(.+?)");
            i10 = matcher.end();
            z10 = false;
        }
        if (i10 < str.length()) {
            sb.append(Pattern.quote(str.substring(i10)));
        }
        sb.append("($|(\\?(.)*))");
        return z10;
    }
}
