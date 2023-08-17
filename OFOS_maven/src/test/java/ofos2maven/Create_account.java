package ofos2maven;

import org.testng.annotations.Test;

public class Create_account 
{
  @Test(groups = "smoke")
  
  public void create()
  {
	  System.out.println("created succesfully");
  }

@Test(groups = "regression")
public void modify()
{
	System.out.println("modified succesfully");
}

@Test(groups = "regression")
public void sherolock()
{
	System.out.println("noshitsherolock");
}
@Test(groups = "regression")
public void sherolock1()
{
	System.out.println("noshitsherolock-------");
}


}
