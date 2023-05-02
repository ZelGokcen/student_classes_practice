public class MathStudent extends Student {


        //COMPLETE THIS CLASS AFTER STUDENT CLASS
        //MathStudent must extend to Student class - do whatever it requires
        //HERE! Create a 5 args constructor that chains super class constructor

        public MathStudent(String firstName, String lastName, int age, String gender, String className) {
            super(firstName, lastName, age, gender, className);
        }
        /*
                HERE!
                Override toString() method that returns MathStudent object information
                It should be dynamic considering super class
             */
        @Override
        public String toString() {
            return "MathStudent " + super.toString();
        }

}