public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetters(String sentence){
        StringBuilder newString = new StringBuilder();
        for (int check = 0; check < sentence.length(); check++){
            if(check == 0){
                char firstLetter = sentence.charAt(check);
                String capitalize = String.valueOf(firstLetter).toUpperCase();
                newString.append(capitalize);
            }
            if(check > 0){
                char eachCharacter = sentence.charAt(check);
                String letter = String.valueOf(eachCharacter);
                if (sentence.charAt(check) == ' '){
                    eachCharacter = sentence.charAt(check+1);
                    letter = String.valueOf(eachCharacter).toUpperCase();
                    newString.append(" ");
                }
                newString.append(letter);
            }
        }
        return newString.toString();
    }
    public static void main(String[] args){
        String string = "this is a tree";
        System.out.println(capitalizeFirstLetters(string));
    }
}
