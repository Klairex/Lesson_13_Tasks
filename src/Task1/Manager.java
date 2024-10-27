package Task1;


    public class Manager extends Employee implements AttendTraining, ConductInterview{
        String domain;
        public Manager(String name, int age, String domain) {
            super(name, age);
            this.domain = domain;
        }

        @Override
        public void attendTraining() {
            System.out.println(this.getName() + " is attending training.");
        }

        @Override
        public void conductInterview() {
            System.out.println(this.getName() + " is conducting an interview.");
        }
    }

