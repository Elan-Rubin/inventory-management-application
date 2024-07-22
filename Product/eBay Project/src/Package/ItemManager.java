package Package;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ItemManager {
    public static ArrayList<Item> items = new ArrayList<Item>();
    
    public static ArrayList<String[]> readData(String fileName)throws FileNotFoundException{
        Scanner myFile = new Scanner(new File(fileName));
        ArrayList<String[]>data = new ArrayList<String[]>();
        String[]row;
        while(myFile.hasNextLine()){
            String line = myFile.nextLine();
            row = line.split(",");
            data.add(row);
        }
        myFile.close();
        return(data);
    }
    
    public static void writeData(ArrayList<String[]> data) throws IOException
    {
        FileWriter myFile = new FileWriter(new File("Data1.csv"));
        for(String[] row:data)
        {
            String line = "";
            for(String record:row)
            {
                line+=record+",";
            }
            myFile.write(line.substring(0,line.length()-1)+System.lineSeparator());
        }
        myFile.close();
    }
    
    public void start(){
        ArrayList<String[]>itemData = new ArrayList<String[]>();
        try{itemData = readData("Data1.csv");}
        catch(FileNotFoundException e){
            System.out.println("AAAAAAAAAH! File not found!");
        }
        
        for(String[] row : itemData.subList(0,itemData.size())){
            int tempIndex = Integer.parseInt(row[0]);
            String tempName = row[1];
            double tempPrice = Double.parseDouble(row[2]);
            String tempTitle = row[3];
            String tempDescription = row[4];
            int tempAmount = Integer.parseInt(row[5]);
            ItemStatus tempStatus = ItemStatus.stringToStatus(row[6]);
            ItemFlag tempFlag = ItemFlag.stringToFlag(row[7]);
            Item newItem = new Item(tempIndex,tempName,tempPrice,tempTitle,tempDescription,tempAmount,tempStatus,tempFlag);
            items.add(newItem);
        }
    }
    
    public ArrayList<String[]> dataToWrite(){
        ArrayList<String[]> data = new ArrayList<String[]>();
        for(Item item:items){
            data.add(item.turnIntoStringArray());
        }
        return data;
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void removeItem(int number){
        items.remove(number);
    }
    
    public void setItem(Item item,int number){
        items.set(number,item);
    }
    
    public Item getItemAt(int number){
        return items.get(number);
    }
    
    public static int getItem(String name){
        for(int i=0;i<items.size();i++){
            if(items.get(i).getName().equals(name)){
                return i;
            }
        }
        System.out.println("Oh geez! I can't find the right item!\n");
        return -1;
    }
    
    public static void main(String[] args){
        
    }
}
