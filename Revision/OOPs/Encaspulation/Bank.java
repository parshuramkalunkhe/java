class ATM{
    private double money = 100000;
    public void withdraw(){
        System.out.println("Can be Debit");
    }

	public void setMoney(double money){
		this.money = money;
	}

    public double getMoney(){
        return money;
    }
}

class Bank{
    public static void main(String[] args){
        ATM ref = new ATM();
		//ref.money = 125000; // CTE
        System.out.println("Old Money : " + ref.getMoney());
		ref.setMoney(125000);
        System.out.println("New Money : " + ref.getMoney());
        ref.withdraw();
    }
}
