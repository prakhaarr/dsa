// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {

//         Queue <Integer> student = new LinkedList<>();
//         Stack<Integer> sandwich = new Stack<>();

//         for(int i =0;i<students.length;i++){
//             student.add(students[i]);
//             sandwich.push(sandwiches[i]);
//         }
//         int l = students.length;
//         int ans = 1;
//         while (!student.isEmpty() && ans > 0){
//             if(student.peek().equals(sandwich.peek())){
//             student.poll();
//             sandwich.pop();
//             ans--;
//             }
//             else{
//             student.add(student.poll());
    
//             }
//         }

//         return ans;
        


        
//     }
// }


class Solution {
    public int countStudents(int[] students, int[] sand) {
        Queue<Integer> stud=new LinkedList<>();
        for(int i:students) stud.offer(i);
        int j=0;
        boolean flag=true;
        while(flag){
            int c=0;
        for(int i=0;i<stud.size();i++){
            if(stud.peek()==sand[j]){
                stud.poll();
                j++;
                c++;
            }else{
                int x=stud.poll();
                stud.offer(x);
            }
         }
         if(c>0) flag =true;
         else {
            c=0;
            flag=false;
         }
        }
        return stud.size();
    }
}