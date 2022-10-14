public class _394 {
    static int i = 0;
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (c == ']') {
                break;
            }
            if (Character.isLetter(c)) {
                sb.append(c);
                continue;
            }
            if (c == '[') {
                String tmp = decodeString(s);
                for (int j = 0; j < count; j++) {
                    sb.append(tmp);
                }
                count = 0;
            } else {
                count = count * 10 + c - '0';
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]" ;
        System.out.println(decodeString(s));

    }
}

