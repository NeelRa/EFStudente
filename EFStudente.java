public class EFStudente
  
{
  
  private String name;
  private int id;
  private int roomNum;
  public EFStudente(String a_name)
    
  {
    
    this.name = new String( a_name );
    this.id = -1;
    this.roomNum = 0;
    
  }
  
  public void setName(String a_name)
    
  {
    
     this.name = a_name;
    
  }
  
  public String getName()
    
  {
    
    return this.name;
    
  }
  
  public void setID(int an_id)
    
  {
    
    this.id = an_id;
    
  }
  
  public int getID()
    
  {
    
    return this.id;
    
  }
  
  public void creds()
    
  {
    
    System.out.println("Hello sir, My name is " + this.getName() + " and my ID number is " + this.id);
    
  }
  
  public void intro(EFStudente other)
    
  {
    
    System.out.println( "Hello " + other.getName() + ". My name is " + this.getName() + ". And i am living in room " +this.roomNum);
    
  }
  public void setRoom(int num)
  {
    this.roomNum = num;
  }
  public int getRoom()
  {
    return this.roomNum;
  }
  
}