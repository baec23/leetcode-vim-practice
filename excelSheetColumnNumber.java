class Solution {
    public int titleToNumber(String columnTitle) {
        int toReturn = 0;
        for(int i=0; i<columnTitle.length(); i++){          
            int pow = columnTitle.length() - i - 1;
            int mult = (int)Math.pow(26, pow);
            toReturn += mult * getLetterValue(columnTitle.charAt(i));

        }
        return toReturn;
    }
    private int getLetterValue(char letter){
        return (int)(letter-'A'+1);
    }
}
