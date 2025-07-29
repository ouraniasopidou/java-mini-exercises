package gr.aueb.cf.ch12;

/**
 * Java Bean (DATA CLASS) - POJO ( PLAIN OLD JAVA OBJECT)
 *
 */

public class Student {
        private int id;
        private String lastname;
        private String firstname;

        public Student () {

        }


        public Student(int id, String lastname, String Firstname) {
                this.id = id;
                this.lastname = lastname;
                this.firstname = firstname;

        }

        public void setId(int id) {
                this.id = id;
        }

        public int getId() {
                return id;
        }

        public void setFirstname (String firstname) {
                this.firstname = firstname;
        }

        public  String getFirstname (){
                return firstname;
        }

        public void setLastname (String lastname) {
                this.lastname = lastname;
        }

        public  String getLastname () {
                return lastname;
        }
    }

