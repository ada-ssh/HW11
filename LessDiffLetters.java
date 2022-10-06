public class LessDiffLetters {
    public static int diffWords(String st){
        StringBuffer u = new StringBuffer();
        String c;
        for (int i=0;i<st.length();i++) {
            c = String.valueOf(st.charAt(i));
            if (u.indexOf(c)==-1)
                u.append(c);
        }
        return u.length();
    }
}
