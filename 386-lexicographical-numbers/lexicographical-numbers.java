class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        addLexicalNumberUptill9(result, 1, n);
        return result;
    }

    void addLexicalNumberUptill9(List<Integer> result, int lexicalNum, int n) {
        if (lexicalNum <= n) { 
            result.add(lexicalNum); // 1, 10
            addLexicalNumberUptill9(result, lexicalNum * 10, n); // 10, 100 X, 110 X, 

            for(int i = 1; i < (lexicalNum < 10 ? 9 : 10) && (lexicalNum+i<=n); i++) {
                result.add(lexicalNum + i); // 11, 12, 13, 2
                if ((lexicalNum + i) * 10 <= n) { // 110, 120, 130 => X, 20 => X, 30 => X, 90 => X
                    addLexicalNumberUptill9(result, (lexicalNum+i) * 10, n); // 11
                } 
            }
        }
    }
}