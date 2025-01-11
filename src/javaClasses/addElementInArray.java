package javaClasses;

public class addElementInArray {

    public String[] addSubject(String[] subject, String newSubject) {
        String []newArr = new String[subject.length + 1];
        for (int i=0; i<newArr.length; i++) {
            if (i == newArr.length-1) {
                newArr[i] = newSubject;
            }
            else {
                newArr[i] = subject[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        String [] subject = {"M", "E", "S", "H"};

        addElementInArray addSub = new addElementInArray();
        String [] set = addSub.addSubject(subject, "Sc");

      //  String [] set = addSub.addSubject(subject, "Sc");
        for (String s: set){
            System.out.println(s);
        }
    }
}
