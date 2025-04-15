import java.util.*;

public class KMP_Algorithm {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = txt.length();
        int m = pat.length();

        int lsp[] = calclsp(pat);

        int i = 0;
        int j = 0;

        while(i < n){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }

            if(j == m){
                result.add(i-j);
                j = lsp[j - 1];
            }else if(i<n && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    j = lsp[j-1];
                }else{
                    i++;
                }
            }
        }

        return result;
    }

    static int[] calclsp(String pat) {
        int m = pat.length();
        int[] lsp = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lsp[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lsp[len - 1];
                } else {
                    lsp[i] = 0;
                    i++;
                }
            }
        }

        return lsp;
    }
}
