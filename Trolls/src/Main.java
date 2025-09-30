class Trolls {

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}
