class A11a{
    public static void main(String args[]) {
        String s1 = "This is Exercise1";
        String s2 = "This is Exercise2";
        int ans = 0;

        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ans = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (ans == 0) {
            if (s1.length() < s2.length()) {
                ans = -1;
            }
            else if (s1.length() > s2.length()) {
                ans = 1;
            }
        }

        if (ans < 0) {
            System.out.println(s1 + " is less than " + s2);
        }
        else if (ans > 0) {
            System.out.println(s1 + " more than " + s2);
        }
        else {
            System.out.println("Both are equal");
        }
    }
}