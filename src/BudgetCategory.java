public class BudgetCategory {
    private String name;
    private double limit;
    private double spent; 

    public BudgetCategory(String name, double limit, double spent){
        this.name = name; 
        this.limit = limit; 
        this.spent = spent;  
    }
    public String toString(){
        return "Category = " +name + "Limit = " + limit +"spent = "+ spent;
    }
    public BudgetCategoryDiff(String name, Double limit, double spent){
        this.name=name;
        double this.Diff=limit-spent; 
        return this.name, this.Diff; 
    }
    public int compareTo(BudgetCategory other){
        if()
    }
}