/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(id);
        int sum = 0;
        while (!stack.isEmpty()) {
            int id1 = stack.pop();
            for (Employee employ : employees) {
                if (employ.id == id1) {
                    sum += employ.importance;
                    for (int id2 : employ.subordinates) {
                        stack.push(id2);
                    }
                    break;
                }
            }
        }
        return sum;
    }
}