package codingWars;

public class repeatStr {
    public static void main(String[] args) {
        System.out.println(repeatStr(4,"Marusea"));
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i =0; i< repeat;i++){
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}