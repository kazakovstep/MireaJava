package lab4_1.task6;

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
