class SquareDigit {

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();

        for (char c : String.valueOf(n).toCharArray()) {
            int digit = Character.getNumericValue(c);
            result.append(digit * digit);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119)); 
        System.out.println(squareDigits(765));
    }
}
