class Teacher extends Person {
    private String specialization;

    public Teacher(String name, String specialization) {
        super();
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}