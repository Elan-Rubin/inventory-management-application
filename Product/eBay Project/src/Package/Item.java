package Package;
public class Item{
    // <editor-fold defaultstate="collapsed" desc="Local Variables"> 
    private int index;
    private String name;
    private double price;
    private String title;
    private String description;
    private int amount;
    //Images
    private ItemStatus status;
    private ItemFlag flag;
    // </editor-fold>   
    // <editor-fold defaultstate="collapsed" desc="Constructor">  
    public Item(int index,String name,double price,String title,String description,int amount,ItemStatus status, ItemFlag flag){
        this.index = index;
        this.name = name;
        this.price = price;
        this.title = title;
        this.description = description;
        this.amount = amount;
        //Images
        this.status = status;
        this.flag = flag;
    }
    // </editor-fold>   
    // <editor-fold defaultstate="collapsed" desc="Accessors">       
    public Item getItem(){
        return this;
    }
    public int getIndex(){
        return index;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public int getAmount(){
        return amount;
    }
    //Images
    public ItemStatus getStatus(){
        return status;
    }
    public ItemFlag getFlag(){
        return flag;
    }
    // </editor-fold>   
    // <editor-fold defaultstate="collapsed" desc="Mutators">  
    public void setIndex(int index){
        this.index = index;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double Price){
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setStatus(ItemStatus status){
        this.status = status;
    }
    public void setFlag(ItemFlag flag){
        this.flag = flag;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Functions">  
    public String turnIntoString(){
        return 
                "Name: "+name+
                " Price: "+price+
                " Title: "+title+
                " Description: "+description+
                " Amount: "+amount+
                " Status: "+status+
                " Flag: "+flag;
    }
    public String[] turnIntoStringArray(){
        String[] array = new String[8];
        array[0]=String.valueOf(index);
        array[1]=name;
        array[2]=String.valueOf(price);
        array[3]=title;
        array[4]=description;
        array[5]=String.valueOf(amount);
        array[6]=status.toString();
        array[7]=flag.toString();
        return array;
    }
    // </editor-fold>
}