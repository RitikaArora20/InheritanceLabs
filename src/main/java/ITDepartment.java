class ITDepartment {
    final private double basicSalary;
    final private double da;
    final private double hra;
    final private double bonus;

    public ITDepartment(double basicSalary, double da, double hra, double bonus) {
        this.basicSalary = basicSalary;
        this.da = da;
        this.hra = hra;
        this.bonus = bonus;
    }

    public double getHra() throws Exception {
        if (this.hra > 0)
            return hra;
        else
            throw new IllegalArgumentException("Invalid Hra");
    }

    public double getBonus() {
        if (this.bonus > 0)
            return bonus;
        else
            throw new IllegalArgumentException("Invalid Bonus");
    }

    public double calculateSalary() {
        double totalSalary = basicSalary + da + hra + bonus;
        return totalSalary;
    }
}
