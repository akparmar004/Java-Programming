package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Arjun";
        System.out.println(search2(name, 'j'));
    }
    static boolean search(String name, char ch){
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (ch == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String name, char ch){
        if (name.length() == 0){
            return false;
        }
        for (char cha : name.toCharArray()){
            if (cha == ch){
                return true;
            }
        }
        return false;
    }

}
