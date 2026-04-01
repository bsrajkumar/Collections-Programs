//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    // Using HashMap

    String inputString = new String("xaabbcddeefggah");
    Map<String, Integer> strCount = new HashMap<String, Integer>();

    for(int i = 0; i < inputString.length(); i++){
        String s = String.valueOf(inputString.charAt(i));
        if(strCount.get(s) == null){
            strCount.put(s, 1);
        } else{
            strCount.put(s, strCount.get(s) + 1);
        }
    }

    /** strCount Map will have like this at the end of the for loop
     * a = 2
     * b = 2
     * c = 1
     * d = 2
     * e = 2
     * f = 1
     * g = 2
     * h =1
     */

    for(String key : strCount.keySet()){
        if(strCount.get(key) == 1){
            IO.println("Non Repeated Char - " + key);
        }
    }

    // Print First Non Repeated Char
    for(char ch: inputString.toCharArray()){

        if(strCount.get(String.valueOf(ch)) == 1){
            IO.println("First Non Repeated Char - " + String.valueOf(ch));
            break;
        }
    }

    //  Using Linked HashMap
    Map<Character, Integer> strCountMap = new LinkedHashMap<>();

    for(char ch : inputString.toCharArray()){
        strCountMap.put(ch, strCountMap.getOrDefault(ch, 0) + 1);
    }

    for(Map.Entry<Character, Integer> entry : strCountMap.entrySet()){
        if(entry.getValue() == 1){
            IO.println("Non Repeated char - " + entry.getKey());
        }
    }









}
