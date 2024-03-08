package referenceTypes;

public class LongestCommonPrefix {

    public String solution(String[] strs) {
        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String currentPrefix = strs[i];

            if (commonPrefix.length() < strs[i].length())
                currentPrefix = strs[i].substring(0, commonPrefix.length());
            else if (commonPrefix.length() > strs[i].length())
                commonPrefix = commonPrefix.substring(0, currentPrefix.length());

            commonPrefix = this.comparison(commonPrefix, currentPrefix);
        }

        return commonPrefix;
    }

    private String comparison(String base, String current){
        if(!base.equals(current))
            return this.comparison(base.substring(0, base.length()-1), current.substring(0, current.length()-1));

        return base;
    }
}
