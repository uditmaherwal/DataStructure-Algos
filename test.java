import java.util.HashMap;

class test {
    public static void main(String[] args) {
        String s1 = "abbc";
        HashMap<Character, Integer> mapS1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (!mapS1.containsKey(c)) {
                mapS1.put(c, 1);
            } else {
                mapS1.put(c, mapS1.get(c) + 1);
            }
        }

        System.out.print(mapS1);

    }
}