public class Solution {
    // Static final fields to handle number-to-words conversion
    private static final String[] LESS_THAN_TWENTY = {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };
    
    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        
        return helper(num).trim();
    }
    
    private String helper(int num) {
        if (num == 0) return "";
        
        if (num < 20) return LESS_THAN_TWENTY[num] + " ";
        else if (num < 100) return TENS[num / 10] + " " + helper(num % 10);
        else if (num < 1000) return LESS_THAN_TWENTY[num / 100] + " Hundred " + helper(num % 100);
        else {
            for (int i = 0; i < THOUSANDS.length; i++) {
                if (num < Math.pow(1000, i + 1)) {
                    return helper(num / (int) Math.pow(1000, i)) + THOUSANDS[i] + " " + helper(num % (int) Math.pow(1000, i));
                }
            }
        }
        return "";
    }
}
