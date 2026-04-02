/**
 * this program to count the number of characters for the string
 * Input: "banana"
 * Output: {b=1, a=3, n=2}
 */

void main(){

    String inputString = new String("banana");

    Map<Character, Long> countChars =
            inputString.chars()
                    .mapToObj(c -> (char)c)
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            LinkedHashMap::new,
                            Collectors.counting()));
    for(Map.Entry entry: countChars.entrySet()){
        System.out.println(entry.getKey().toString() + " : " + entry.getValue().toString());
    }

}