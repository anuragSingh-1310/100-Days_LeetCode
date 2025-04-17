public class Strings_Rotations_of_Each_Other {
    public static boolean areRotations(String s1, String s2) {
        StringBuilder s3 = new StringBuilder();

        if (s1.length() != s2.length()) return false;

        String concatenated = s1 + s1;

        return concatenated.contains(s2);
        // return concatenated.indexOf(s2) != -1;
    }
}
