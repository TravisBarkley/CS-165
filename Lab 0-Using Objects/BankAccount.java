public class BankAccount {
private String custName; 
private double checkBal; 
private double saveBal;

public BankAccount(String newName, double amt1, double amt2)
{
   setName(newName); 
   setChecking(amt1); 
   setSavings(amt2); 
}
public void setName(String newName)
{
   custName = newName; 
}

public String getName()
{
   return custName; 
}

public void setChecking(double amt)
{
 checkBal = amt;   
}
public double getChecking() 
{
   return checkBal;
}

public void setSavings(double amt) 
{
   saveBal = amt;   
}
public double getSavings() 
{
    return saveBal;  
}
public void depositChecking(double amt) 
{
   if(amt>0)
   checkBal += amt; 
}

public void depositSavings(double amt) 
{
   if(amt>0)
   saveBal += amt;  
}
public void withdrawChecking(double amt) 
{
   if(amt>0)
   checkBal = checkBal - amt;   
}
public void withdrawSavings(double amt) 
{
   if(amt>0)
   saveBal = saveBal - amt;   
}
public void transferToSavings(double amt)
{
   checkBal = checkBal-amt; 
   saveBal += amt;
}
}



/* Type your code here. */