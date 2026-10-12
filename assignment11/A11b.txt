class A11b{
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";
        boolean ans = true;

        if (s1.length() != s2.length()) {
            ans = false;
        } 
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    ans = false;
                    break;
                }
            }
        }

        if (ans) {
            System.out.println("Contain same Data");
        } 
        else {
            System.out.println("Not equal");
        }
    }
}