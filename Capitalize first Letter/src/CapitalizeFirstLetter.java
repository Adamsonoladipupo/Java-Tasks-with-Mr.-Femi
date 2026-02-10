public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetters(String sentence){
        StringBuilder newString = new StringBuilder();
        for (int check = 0; check < sentence.length(); check++){
            char eachCharacter = sentence.charAt(check);
            String letter = String.valueOf(eachCharacter).toUpperCase();
            newString.append(letter);
            if(eachCharacter == ' '){
                
            }
        }
        return newString.toString();
    }
    public static void main(String[] args){
        String string = "this is a tree";
        String result = capitalizeFirstLetters(string);
        System.out.println(result);
    }
}
